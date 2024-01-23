import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!mm;")
	private Class115 aClass115_7 = new Class115();

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public int anInt3345 = 0;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class117() {
		@Pc(20) Class178 local20 = Static274.aClass176_4.method4523(this, 5);
		while (local20.anInt5649 == 0) {
			Static150.method2552(10L);
		}
		if (local20.anInt5649 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean239) {
			@Pc(12) Class115 local12 = this.aClass115_7;
			@Pc(19) Class3_Sub4_Sub1_Sub1 local19;
			synchronized (this.aClass115_7) {
				local19 = (Class3_Sub4_Sub1_Sub1) this.aClass115_7.method2882();
				if (local19 == null) {
					try {
						this.aClass115_7.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt3345--;
			}
			try {
				if (local19.anInt2446 == 2) {
					local19.aClass171_2.method4406(local19.aByteArray35, (int) local19.aLong245, local19.aByteArray35.length);
				} else if (local19.anInt2446 == 3) {
					local19.aByteArray35 = local19.aClass171_2.method4408((int) local19.aLong245);
				}
			} catch (@Pc(80) Exception local80) {
				Static42.method613(null, local80);
			}
			local19.aBoolean297 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jb;I)V")
	private void method2949(@OriginalArg(0) Class3_Sub4_Sub1_Sub1 arg0) {
		@Pc(3) Class115 local3 = this.aClass115_7;
		synchronized (this.aClass115_7) {
			this.aClass115_7.method2875(arg0);
			this.anInt3345++;
			this.aClass115_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!th;I[BI)Lclient!jb;")
	public Class3_Sub4_Sub1_Sub1 method2950(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(13) Class3_Sub4_Sub1_Sub1 local13 = new Class3_Sub4_Sub1_Sub1();
		local13.aByteArray35 = arg2;
		local13.aLong245 = arg1;
		local13.aBoolean298 = false;
		local13.aClass171_2 = arg0;
		local13.anInt2446 = 2;
		this.method2949(local13);
		return local13;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!th;II)Lclient!jb;")
	public Class3_Sub4_Sub1_Sub1 method2952(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub4_Sub1_Sub1 local7 = new Class3_Sub4_Sub1_Sub1();
		local7.aLong245 = arg1;
		local7.aBoolean298 = false;
		local7.aClass171_2 = arg0;
		local7.anInt2446 = 3;
		this.method2949(local7);
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!th;II)Lclient!jb;")
	public Class3_Sub4_Sub1_Sub1 method2953(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub1_Sub1 local16 = new Class3_Sub4_Sub1_Sub1();
		local16.anInt2446 = 1;
		@Pc(23) Class115 local23 = this.aClass115_7;
		synchronized (this.aClass115_7) {
			@Pc(30) Class3_Sub4_Sub1_Sub1 local30 = (Class3_Sub4_Sub1_Sub1) this.aClass115_7.method2879();
			while (true) {
				if (local30 == null) {
					break;
				}
				if ((long) arg1 == local30.aLong245 && local30.aClass171_2 == arg0 && local30.anInt2446 == 2) {
					local16.aByteArray35 = local30.aByteArray35;
					local16.aBoolean297 = false;
					return local16;
				}
				local30 = (Class3_Sub4_Sub1_Sub1) this.aClass115_7.method2885();
			}
		}
		local16.aByteArray35 = arg0.method4408(arg1);
		local16.aBoolean298 = true;
		local16.aBoolean297 = false;
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public void method2954() {
		this.aBoolean239 = true;
		@Pc(14) Class115 local14 = this.aClass115_7;
		synchronized (this.aClass115_7) {
			this.aClass115_7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
		this.aThread2 = null;
	}
}
