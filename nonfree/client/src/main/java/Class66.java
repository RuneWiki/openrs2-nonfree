import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!nc;")
	private final Class243 aClass243_1 = new Class243();

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
	public int anInt1858 = 0;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class66(@OriginalArg(0) Class92 arg0) {
		@Pc(20) Class338 local20 = arg0.method1871(this, 5);
		while (local20.anInt9321 == 0) {
			Static26.method592(10L);
		}
		if (local20.anInt9321 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject18;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
	public void method1512() {
		this.aBoolean151 = true;
		@Pc(16) Class243 local16 = this.aClass243_1;
		synchronized (this.aClass243_1) {
			this.aClass243_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!naa;IZ)Lclient!ao;")
	public Class3_Sub5_Sub2_Sub1 method1513(@OriginalArg(0) Class241 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub5_Sub2_Sub1 local9 = new Class3_Sub5_Sub2_Sub1();
		local9.anInt586 = 1;
		@Pc(15) Class243 local15 = this.aClass243_1;
		synchronized (this.aClass243_1) {
			@Pc(23) Class3_Sub5_Sub2_Sub1 local23 = (Class3_Sub5_Sub2_Sub1) this.aClass243_1.method5459();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong312 == (long) arg1 && local23.aClass241_1 == arg0 && local23.anInt586 == 2) {
					local9.aByteArray7 = local23.aByteArray7;
					local9.aBoolean541 = false;
					return local9;
				}
				local23 = (Class3_Sub5_Sub2_Sub1) this.aClass243_1.method5453();
			}
		}
		local9.aByteArray7 = arg0.method5431(arg1);
		local9.aBoolean541 = false;
		local9.aBoolean543 = true;
		return local9;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!naa;II)Lclient!ao;")
	public Class3_Sub5_Sub2_Sub1 method1516(@OriginalArg(0) Class241 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub5_Sub2_Sub1 local7 = new Class3_Sub5_Sub2_Sub1();
		local7.aClass241_1 = arg0;
		local7.aLong312 = (long) arg1;
		local7.anInt586 = 3;
		local7.aBoolean543 = false;
		this.method1518(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!naa;[BIZ)Lclient!ao;")
	public Class3_Sub5_Sub2_Sub1 method1517(@OriginalArg(0) Class241 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub5_Sub2_Sub1 local7 = new Class3_Sub5_Sub2_Sub1();
		local7.aClass241_1 = arg0;
		local7.aByteArray7 = arg1;
		local7.aLong312 = (long) arg2;
		local7.anInt586 = 2;
		local7.aBoolean543 = false;
		this.method1518(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean151) {
			@Pc(10) Class243 local10 = this.aClass243_1;
			@Pc(18) Class3_Sub5_Sub2_Sub1 local18;
			synchronized (this.aClass243_1) {
				local18 = (Class3_Sub5_Sub2_Sub1) this.aClass243_1.method5462();
				if (local18 == null) {
					try {
						this.aClass243_1.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt1858--;
			}
			try {
				if (local18.anInt586 == 2) {
					local18.aClass241_1.method5434(local18.aByteArray7, (int) local18.aLong312, local18.aByteArray7.length);
				} else if (local18.anInt586 == 3) {
					local18.aByteArray7 = local18.aClass241_1.method5431((int) local18.aLong312);
				}
			} catch (@Pc(78) Exception local78) {
				Static456.method6140((String) null, local78);
			}
			local18.aBoolean541 = false;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!ao;)V")
	private void method1518(@OriginalArg(1) Class3_Sub5_Sub2_Sub1 arg0) {
		@Pc(12) Class243 local12 = this.aClass243_1;
		synchronized (this.aClass243_1) {
			this.aClass243_1.method5457(arg0);
			this.anInt1858++;
			this.aClass243_1.notifyAll();
		}
	}
}
