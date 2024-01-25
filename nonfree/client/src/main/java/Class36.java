import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!bg;")
	private final Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public int anInt725 = 0;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class36(@OriginalArg(0) Class61 arg0) {
		@Pc(20) Class236 local20 = arg0.method1459(this, 5);
		while (local20.anInt6178 == 0) {
			Static214.method2089(10L);
		}
		if (local20.anInt6178 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!np;)V")
	private void method593(@OriginalArg(1) Class7_Sub4_Sub8_Sub1 arg0) {
		@Pc(6) Class24 local6 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			this.aClass24_1.method298(arg0);
			this.anInt725++;
			this.aClass24_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ur;B)Lclient!np;")
	public Class7_Sub4_Sub8_Sub1 method594(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1) {
		@Pc(7) Class7_Sub4_Sub8_Sub1 local7 = new Class7_Sub4_Sub8_Sub1();
		local7.aClass250_2 = arg1;
		local7.aBoolean379 = false;
		local7.aLong225 = arg0;
		local7.anInt4618 = 3;
		this.method593(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ur;[BIB)Lclient!np;")
	public Class7_Sub4_Sub8_Sub1 method595(@OriginalArg(0) Class250 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class7_Sub4_Sub8_Sub1 local15 = new Class7_Sub4_Sub8_Sub1();
		local15.anInt4618 = 2;
		local15.aLong225 = arg2;
		local15.aByteArray70 = arg1;
		local15.aClass250_2 = arg0;
		local15.aBoolean379 = false;
		this.method593(local15);
		return local15;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ur;BI)Lclient!np;")
	public Class7_Sub4_Sub8_Sub1 method597(@OriginalArg(0) Class250 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class7_Sub4_Sub8_Sub1 local14 = new Class7_Sub4_Sub8_Sub1();
		local14.anInt4618 = 1;
		@Pc(20) Class24 local20 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			@Pc(28) Class7_Sub4_Sub8_Sub1 local28 = (Class7_Sub4_Sub8_Sub1) this.aClass24_1.method303();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg1 == local28.aLong225 && local28.aClass250_2 == arg0 && local28.anInt4618 == 2) {
					local14.aByteArray70 = local28.aByteArray70;
					local14.aBoolean380 = false;
					return local14;
				}
				local28 = (Class7_Sub4_Sub8_Sub1) this.aClass24_1.method301();
			}
		}
		local14.aByteArray70 = arg0.method5188(arg1);
		local14.aBoolean380 = false;
		local14.aBoolean379 = true;
		return local14;
	}

	@OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean37) {
			@Pc(10) Class24 local10 = this.aClass24_1;
			@Pc(18) Class7_Sub4_Sub8_Sub1 local18;
			synchronized (this.aClass24_1) {
				local18 = (Class7_Sub4_Sub8_Sub1) this.aClass24_1.method308();
				if (local18 == null) {
					try {
						this.aClass24_1.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt725--;
			}
			try {
				if (local18.anInt4618 == 2) {
					local18.aClass250_2.method5186(local18.aByteArray70, local18.aByteArray70.length, (int) local18.aLong225);
				} else if (local18.anInt4618 == 3) {
					local18.aByteArray70 = local18.aClass250_2.method5188((int) local18.aLong225);
				}
			} catch (@Pc(78) Exception local78) {
				Static419.method5247(local78, null);
			}
			local18.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public void method598() {
		this.aBoolean37 = true;
		@Pc(17) Class24 local17 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			this.aClass24_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}
}
