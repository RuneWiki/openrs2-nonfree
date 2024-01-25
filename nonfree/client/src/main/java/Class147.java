import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class147 implements Runnable {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!vm;")
	private final Class307 aClass307_6 = new Class307();

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public int anInt4523 = 0;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class147(@OriginalArg(0) Class182 arg0) {
		@Pc(20) Class243 local20 = arg0.method4799(5, this);
		while (local20.anInt6905 == 0) {
			Static505.method7295(10L);
		}
		if (local20.anInt6905 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject12;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method3947() {
		this.aBoolean275 = true;
		@Pc(13) Class307 local13 = this.aClass307_6;
		synchronized (this.aClass307_6) {
			this.aClass307_6.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BLclient!cw;BI)Lclient!lj;")
	public Class1_Sub1_Sub11_Sub1 method3948(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub1_Sub11_Sub1 local7 = new Class1_Sub1_Sub11_Sub1();
		local7.aBoolean563 = false;
		local7.anInt5498 = 2;
		local7.aClass51_3 = arg1;
		local7.aByteArray73 = arg0;
		local7.aLong234 = arg2;
		this.method3949(local7);
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!lj;I)V")
	private void method3949(@OriginalArg(0) Class1_Sub1_Sub11_Sub1 arg0) {
		@Pc(6) Class307 local6 = this.aClass307_6;
		synchronized (this.aClass307_6) {
			this.aClass307_6.method7354(arg0);
			this.anInt4523++;
			this.aClass307_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!cw;II)Lclient!lj;")
	public Class1_Sub1_Sub11_Sub1 method3951(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub1_Sub11_Sub1 local7 = new Class1_Sub1_Sub11_Sub1();
		local7.anInt5498 = 1;
		@Pc(13) Class307 local13 = this.aClass307_6;
		synchronized (this.aClass307_6) {
			@Pc(21) Class1_Sub1_Sub11_Sub1 local21 = (Class1_Sub1_Sub11_Sub1) this.aClass307_6.method7359();
			while (true) {
				if (local21 == null) {
					break;
				}
				if ((long) arg1 == local21.aLong234 && arg0 == local21.aClass51_3 && local21.anInt5498 == 2) {
					local7.aBoolean562 = false;
					local7.aByteArray73 = local21.aByteArray73;
					return local7;
				}
				local21 = (Class1_Sub1_Sub11_Sub1) this.aClass307_6.method7355();
			}
		}
		local7.aByteArray73 = arg0.method1948(arg1);
		local7.aBoolean562 = false;
		local7.aBoolean563 = true;
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean275) {
			@Pc(6) Class307 local6 = this.aClass307_6;
			@Pc(14) Class1_Sub1_Sub11_Sub1 local14;
			synchronized (this.aClass307_6) {
				local14 = (Class1_Sub1_Sub11_Sub1) this.aClass307_6.method7360();
				if (local14 == null) {
					try {
						this.aClass307_6.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4523--;
			}
			try {
				if (local14.anInt5498 == 2) {
					local14.aClass51_3.method1945((int) local14.aLong234, local14.aByteArray73.length, local14.aByteArray73);
				} else if (local14.anInt5498 == 3) {
					local14.aByteArray73 = local14.aClass51_3.method1948((int) local14.aLong234);
				}
			} catch (@Pc(74) Exception local74) {
				Static41.method1359(local74, null);
			}
			local14.aBoolean562 = false;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!cw;B)Lclient!lj;")
	public Class1_Sub1_Sub11_Sub1 method3955(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(7) Class1_Sub1_Sub11_Sub1 local7 = new Class1_Sub1_Sub11_Sub1();
		local7.aBoolean563 = false;
		local7.aLong234 = arg0;
		local7.aClass51_3 = arg1;
		local7.anInt5498 = 3;
		this.method3949(local7);
		return local7;
	}
}
