import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class199 implements Runnable {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!rh;")
	private final Class178 aClass178_10 = new Class178();

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public int anInt6316 = 0;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!lh;)V")
	public Class199(@OriginalArg(0) Class120 arg0) {
		@Pc(20) Class51 local20 = arg0.method3232(this, 5);
		while (local20.anInt1229 == 0) {
			Static270.method5481(10L);
		}
		if (local20.anInt1229 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pd;I)V")
	private void method5273(@OriginalArg(0) Class4_Sub1_Sub18_Sub1 arg0) {
		@Pc(2) Class178 local2 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			this.aClass178_10.method4767(arg0);
			this.anInt6316++;
			this.aClass178_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!qk;I)Lclient!pd;")
	public Class4_Sub1_Sub18_Sub1 method5274(@OriginalArg(1) Class169 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub1_Sub18_Sub1 local9 = new Class4_Sub1_Sub18_Sub1();
		local9.anInt5018 = 1;
		@Pc(15) Class178 local15 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			@Pc(23) Class4_Sub1_Sub18_Sub1 local23 = (Class4_Sub1_Sub18_Sub1) this.aClass178_10.method4773();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong254 && arg0 == local23.aClass169_2 && local23.anInt5018 == 2) {
					local9.aByteArray66 = local23.aByteArray66;
					local9.aBoolean489 = false;
					return local9;
				}
				local23 = (Class4_Sub1_Sub18_Sub1) this.aClass178_10.method4771();
			}
		}
		local9.aByteArray66 = arg0.method4434(arg1);
		local9.aBoolean487 = true;
		local9.aBoolean489 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public void method5275() {
		this.aBoolean553 = true;
		@Pc(9) Class178 local9 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			this.aClass178_10.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean553) {
			@Pc(10) Class178 local10 = this.aClass178_10;
			@Pc(18) Class4_Sub1_Sub18_Sub1 local18;
			synchronized (this.aClass178_10) {
				local18 = (Class4_Sub1_Sub18_Sub1) this.aClass178_10.method4772();
				if (local18 == null) {
					try {
						this.aClass178_10.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6316--;
			}
			try {
				if (local18.anInt5018 == 2) {
					local18.aClass169_2.method4435(local18.aByteArray66, (int) local18.aLong254, local18.aByteArray66.length);
				} else if (local18.anInt5018 == 3) {
					local18.aByteArray66 = local18.aClass169_2.method4434((int) local18.aLong254);
				}
			} catch (@Pc(78) Exception local78) {
				Static103.method2841(local78, null);
			}
			local18.aBoolean489 = false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILclient!qk;)Lclient!pd;")
	public Class4_Sub1_Sub18_Sub1 method5278(@OriginalArg(1) int arg0, @OriginalArg(2) Class169 arg1) {
		@Pc(7) Class4_Sub1_Sub18_Sub1 local7 = new Class4_Sub1_Sub18_Sub1();
		local7.aLong254 = arg0;
		local7.aClass169_2 = arg1;
		local7.aBoolean487 = false;
		local7.anInt5018 = 3;
		this.method5273(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BLclient!qk;Z)Lclient!pd;")
	public Class4_Sub1_Sub18_Sub1 method5279(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class169 arg2) {
		@Pc(7) Class4_Sub1_Sub18_Sub1 local7 = new Class4_Sub1_Sub18_Sub1();
		local7.aClass169_2 = arg2;
		local7.aByteArray66 = arg1;
		local7.aLong254 = arg0;
		local7.anInt5018 = 2;
		local7.aBoolean487 = false;
		this.method5273(local7);
		return local7;
	}
}
