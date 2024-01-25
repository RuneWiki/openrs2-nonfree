import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class376 implements Runnable {

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!dm;")
	private final Class75 aClass75_13 = new Class75();

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Z")
	private boolean aBoolean744 = false;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public int anInt10191 = 0;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!mr;)V")
	public Class376(@OriginalArg(0) Class226 arg0) {
		@Pc(20) Class108 local20 = arg0.method4842(this, 5);
		while (local20.anInt2766 == 0) {
			Static444.method6061(10L);
		}
		if (local20.anInt2766 == 2) {
			throw new RuntimeException();
		}
		this.aThread7 = (Thread) local20.anObject6;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!is;I)V")
	private void method8479(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		@Pc(2) Class75 local2 = this.aClass75_13;
		synchronized (this.aClass75_13) {
			this.aClass75_13.method1572(arg0);
			this.anInt10191++;
			this.aClass75_13.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method8480() {
		this.aBoolean744 = true;
		@Pc(9) Class75 local9 = this.aClass75_13;
		synchronized (this.aClass75_13) {
			this.aClass75_13.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!wm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean744) {
			@Pc(10) Class75 local10 = this.aClass75_13;
			@Pc(18) Class2_Sub2_Sub1_Sub2 local18;
			synchronized (this.aClass75_13) {
				local18 = (Class2_Sub2_Sub1_Sub2) this.aClass75_13.method1571();
				if (local18 == null) {
					try {
						this.aClass75_13.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt10191--;
			}
			try {
				if (local18.anInt3974 == 2) {
					local18.aClass135_3.method2857((int) local18.aLong269, local18.aByteArray45.length, local18.aByteArray45);
				} else if (local18.anInt3974 == 3) {
					local18.aByteArray45 = local18.aClass135_3.method2855((int) local18.aLong269);
				}
			} catch (@Pc(78) Exception local78) {
				Static163.method2447(local78, null);
			}
			local18.aBoolean283 = false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!hca;I)Lclient!is;")
	public Class2_Sub2_Sub1_Sub2 method8482(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1) {
		@Pc(9) Class2_Sub2_Sub1_Sub2 local9 = new Class2_Sub2_Sub1_Sub2();
		local9.anInt3974 = 1;
		@Pc(21) Class75 local21 = this.aClass75_13;
		synchronized (this.aClass75_13) {
			@Pc(29) Class2_Sub2_Sub1_Sub2 local29 = (Class2_Sub2_Sub1_Sub2) this.aClass75_13.method1573();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong269 && local29.aClass135_3 == arg1 && local29.anInt3974 == 2) {
					local9.aByteArray45 = local29.aByteArray45;
					local9.aBoolean283 = false;
					return local9;
				}
				local29 = (Class2_Sub2_Sub1_Sub2) this.aClass75_13.method1568();
			}
		}
		local9.aByteArray45 = arg1.method2855(arg0);
		local9.aBoolean283 = false;
		local9.aBoolean281 = true;
		return local9;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILclient!hca;I)Lclient!is;")
	public Class2_Sub2_Sub1_Sub2 method8484(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1) {
		@Pc(13) Class2_Sub2_Sub1_Sub2 local13 = new Class2_Sub2_Sub1_Sub2();
		local13.aClass135_3 = arg1;
		local13.anInt3974 = 3;
		local13.aBoolean281 = false;
		local13.aLong269 = arg0;
		this.method8479(local13);
		return local13;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BZILclient!hca;)Lclient!is;")
	public Class2_Sub2_Sub1_Sub2 method8485(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class135 arg2) {
		@Pc(7) Class2_Sub2_Sub1_Sub2 local7 = new Class2_Sub2_Sub1_Sub2();
		local7.aByteArray45 = arg0;
		local7.aClass135_3 = arg2;
		local7.aBoolean281 = false;
		local7.anInt3974 = 2;
		local7.aLong269 = arg1;
		this.method8479(local7);
		return local7;
	}
}
