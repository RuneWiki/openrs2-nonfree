import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "Lclient!wd;")
	private final Class384 aClass384_6 = new Class384();

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
	public int anInt2170 = 0;

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class80(@OriginalArg(0) Class380 arg0) {
		@Pc(20) Class103 local20 = arg0.method8815(this, 5);
		while (local20.anInt2541 == 0) {
			Static520.method7923(10L);
		}
		if (local20.anInt2541 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject9;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!nda;I)V")
	private void method1899(@OriginalArg(0) Class6_Sub4_Sub11_Sub1 arg0) {
		@Pc(6) Class384 local6 = this.aClass384_6;
		synchronized (this.aClass384_6) {
			this.aClass384_6.method8909(arg0);
			this.anInt2170++;
			this.aClass384_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBLclient!pn;)Lclient!nda;")
	public Class6_Sub4_Sub11_Sub1 method1900(@OriginalArg(0) int arg0, @OriginalArg(2) Class274 arg1) {
		@Pc(7) Class6_Sub4_Sub11_Sub1 local7 = new Class6_Sub4_Sub11_Sub1();
		local7.aClass274_4 = arg1;
		local7.anInt6516 = 3;
		local7.aLong310 = (long) arg0;
		local7.aBoolean589 = false;
		this.method1899(local7);
		return local7;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!pn;[B)Lclient!nda;")
	public Class6_Sub4_Sub11_Sub1 method1901(@OriginalArg(0) int arg0, @OriginalArg(2) Class274 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class6_Sub4_Sub11_Sub1 local7 = new Class6_Sub4_Sub11_Sub1();
		local7.aClass274_4 = arg1;
		local7.aByteArray73 = arg2;
		local7.aLong310 = (long) arg0;
		local7.anInt6516 = 2;
		local7.aBoolean589 = false;
		this.method1899(local7);
		return local7;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!pn;)Lclient!nda;")
	public Class6_Sub4_Sub11_Sub1 method1903(@OriginalArg(1) int arg0, @OriginalArg(2) Class274 arg1) {
		@Pc(14) Class6_Sub4_Sub11_Sub1 local14 = new Class6_Sub4_Sub11_Sub1();
		local14.anInt6516 = 1;
		@Pc(20) Class384 local20 = this.aClass384_6;
		synchronized (this.aClass384_6) {
			@Pc(28) Class6_Sub4_Sub11_Sub1 local28 = (Class6_Sub4_Sub11_Sub1) this.aClass384_6.method8910();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong310 == (long) arg0 && local28.aClass274_4 == arg1 && local28.anInt6516 == 2) {
					local14.aBoolean588 = false;
					local14.aByteArray73 = local28.aByteArray73;
					return local14;
				}
				local28 = (Class6_Sub4_Sub11_Sub1) this.aClass384_6.method8908();
			}
		}
		local14.aByteArray73 = arg1.method6616(arg0);
		local14.aBoolean589 = true;
		local14.aBoolean588 = false;
		return local14;
	}

	@OriginalMember(owner = "client!eda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean132) {
			@Pc(6) Class384 local6 = this.aClass384_6;
			@Pc(14) Class6_Sub4_Sub11_Sub1 local14;
			synchronized (this.aClass384_6) {
				local14 = (Class6_Sub4_Sub11_Sub1) this.aClass384_6.method8907();
				if (local14 == null) {
					try {
						this.aClass384_6.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt2170--;
			}
			try {
				if (local14.anInt6516 == 2) {
					local14.aClass274_4.method6613(local14.aByteArray73, (int) local14.aLong310, local14.aByteArray73.length);
				} else if (local14.anInt6516 == 3) {
					local14.aByteArray73 = local14.aClass274_4.method6616((int) local14.aLong310);
				}
			} catch (@Pc(72) Exception local72) {
				Static664.method9007(local72, (String) null);
			}
			local14.aBoolean588 = false;
		}
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
	public void method1905() {
		this.aBoolean132 = true;
		@Pc(14) Class384 local14 = this.aClass384_6;
		synchronized (this.aClass384_6) {
			this.aClass384_6.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread2 = null;
	}
}
