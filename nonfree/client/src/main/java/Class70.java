import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!rda;")
	private final Class286 aClass286_3 = new Class286();

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public int anInt2280 = 0;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ii;)V")
	public Class70(@OriginalArg(0) Class161 arg0) {
		@Pc(20) Class299 local20 = arg0.method3827(this, 5);
		while (local20.anInt7985 == 0) {
			Static55.method845(10L);
		}
		if (local20.anInt7985 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject41;
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean191) {
			@Pc(10) Class286 local10 = this.aClass286_3;
			@Pc(18) Class4_Sub7_Sub7_Sub1 local18;
			synchronized (this.aClass286_3) {
				local18 = (Class4_Sub7_Sub7_Sub1) this.aClass286_3.method6405();
				if (local18 == null) {
					try {
						this.aClass286_3.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt2280--;
			}
			try {
				if (local18.anInt5375 == 2) {
					local18.aClass47_1.method851(local18.aByteArray59.length, (int) local18.aLong303, local18.aByteArray59);
				} else if (local18.anInt5375 == 3) {
					local18.aByteArray59 = local18.aClass47_1.method854((int) local18.aLong303);
				}
			} catch (@Pc(78) Exception local78) {
				Static473.method6593(local78, null);
			}
			local18.aBoolean642 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!cc;I)Lclient!lba;")
	public Class4_Sub7_Sub7_Sub1 method2053(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub7_Sub7_Sub1 local7 = new Class4_Sub7_Sub7_Sub1();
		local7.aBoolean643 = false;
		local7.anInt5375 = 3;
		local7.aLong303 = arg1;
		local7.aClass47_1 = arg0;
		this.method2055(local7);
		return local7;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(ILclient!cc;I)Lclient!lba;")
	public Class4_Sub7_Sub7_Sub1 method2054(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub7_Sub7_Sub1 local9 = new Class4_Sub7_Sub7_Sub1();
		local9.anInt5375 = 1;
		@Pc(15) Class286 local15 = this.aClass286_3;
		synchronized (this.aClass286_3) {
			@Pc(23) Class4_Sub7_Sub7_Sub1 local23 = (Class4_Sub7_Sub7_Sub1) this.aClass286_3.method6403();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong303 && local23.aClass47_1 == arg0 && local23.anInt5375 == 2) {
					local9.aBoolean642 = false;
					local9.aByteArray59 = local23.aByteArray59;
					return local9;
				}
				local23 = (Class4_Sub7_Sub7_Sub1) this.aClass286_3.method6414();
			}
		}
		local9.aByteArray59 = arg0.method854(arg1);
		local9.aBoolean643 = true;
		local9.aBoolean642 = false;
		return local9;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!lba;)V")
	private void method2055(@OriginalArg(1) Class4_Sub7_Sub7_Sub1 arg0) {
		@Pc(8) Class286 local8 = this.aClass286_3;
		synchronized (this.aClass286_3) {
			this.aClass286_3.method6409(arg0);
			this.anInt2280++;
			this.aClass286_3.notifyAll();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public void method2056() {
		this.aBoolean191 = true;
		@Pc(9) Class286 local9 = this.aClass286_3;
		synchronized (this.aClass286_3) {
			this.aClass286_3.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!cc;I[BI)Lclient!lba;")
	public Class4_Sub7_Sub7_Sub1 method2058(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class4_Sub7_Sub7_Sub1 local7 = new Class4_Sub7_Sub7_Sub1();
		local7.anInt5375 = 2;
		local7.aLong303 = arg1;
		local7.aByteArray59 = arg2;
		local7.aBoolean643 = false;
		local7.aClass47_1 = arg0;
		this.method2055(local7);
		return local7;
	}
}
