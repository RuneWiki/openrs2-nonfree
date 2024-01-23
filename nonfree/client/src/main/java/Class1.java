import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Runnable {

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!vm;")
	private Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public int anInt9 = 0;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
		@Pc(20) Class123 local20 = Static87.aClass164_2.method3952(5, this);
		while (local20.anInt3791 == 0) {
			Static122.method2061(10L);
		}
		if (local20.anInt3791 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!jg;)Lclient!hg;")
	public Class4_Sub2_Sub4_Sub2 method3(@OriginalArg(0) int arg0, @OriginalArg(2) Class79 arg1) {
		@Pc(7) Class4_Sub2_Sub4_Sub2 local7 = new Class4_Sub2_Sub4_Sub2();
		local7.aBoolean155 = false;
		local7.anInt2102 = 3;
		local7.aClass79_3 = arg1;
		local7.aLong201 = arg0;
		this.method9(local7);
		return local7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!jg;I)Lclient!hg;")
	public Class4_Sub2_Sub4_Sub2 method4(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1) {
		@Pc(5) Class4_Sub2_Sub4_Sub2 local5 = new Class4_Sub2_Sub4_Sub2();
		local5.anInt2102 = 1;
		@Pc(16) Class177 local16 = this.aClass177_1;
		synchronized (this.aClass177_1) {
			@Pc(23) Class4_Sub2_Sub4_Sub2 local23 = (Class4_Sub2_Sub4_Sub2) this.aClass177_1.method4278();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong201 == (long) arg0 && local23.aClass79_3 == arg1 && local23.anInt2102 == 2) {
					local5.aBoolean157 = false;
					local5.aByteArray28 = local23.aByteArray28;
					return local5;
				}
				local23 = (Class4_Sub2_Sub4_Sub2) this.aClass177_1.method4280();
			}
		}
		local5.aByteArray28 = arg1.method2083(arg0);
		local5.aBoolean155 = true;
		local5.aBoolean157 = false;
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean1) {
			@Pc(12) Class177 local12 = this.aClass177_1;
			@Pc(19) Class4_Sub2_Sub4_Sub2 local19;
			synchronized (this.aClass177_1) {
				local19 = (Class4_Sub2_Sub4_Sub2) this.aClass177_1.method4273();
				if (local19 == null) {
					try {
						this.aClass177_1.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt9--;
			}
			try {
				if (local19.anInt2102 == 2) {
					local19.aClass79_3.method2085((int) local19.aLong201, local19.aByteArray28.length, local19.aByteArray28);
				} else if (local19.anInt2102 == 3) {
					local19.aByteArray28 = local19.aClass79_3.method2083((int) local19.aLong201);
				}
			} catch (@Pc(80) Exception local80) {
				Static244.method3721(null, local80);
			}
			local19.aBoolean157 = false;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	private void method6() {
		this.aBoolean1 = true;
		@Pc(6) Class177 local6 = this.aClass177_1;
		synchronized (this.aClass177_1) {
			this.aClass177_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(39) InterruptedException local39) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BLclient!jg;B)Lclient!hg;")
	public Class4_Sub2_Sub4_Sub2 method7(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class79 arg2) {
		@Pc(7) Class4_Sub2_Sub4_Sub2 local7 = new Class4_Sub2_Sub4_Sub2();
		local7.aBoolean155 = false;
		local7.anInt2102 = 2;
		local7.aLong201 = arg0;
		local7.aClass79_3 = arg2;
		local7.aByteArray28 = arg1;
		this.method9(local7);
		return local7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!hg;I)V")
	private void method9(@OriginalArg(0) Class4_Sub2_Sub4_Sub2 arg0) {
		@Pc(3) Class177 local3 = this.aClass177_1;
		synchronized (this.aClass177_1) {
			this.aClass177_1.method4274(arg0);
			this.anInt9++;
			this.aClass177_1.notifyAll();
		}
	}
}
