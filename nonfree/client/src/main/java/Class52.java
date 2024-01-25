import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "Lclient!hf;")
	private final Class150 aClass150_2 = new Class150();

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
	public int anInt1024 = 0;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class52(@OriginalArg(0) Class202 arg0) {
		@Pc(20) Class297 local20 = arg0.method4737(this, 5);
		while (local20.anInt8459 == 0) {
			Static127.method1985(10L);
		}
		if (local20.anInt8459 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject15;
	}

	@OriginalMember(owner = "client!cca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean63) {
			@Pc(6) Class150 local6 = this.aClass150_2;
			@Pc(14) Class5_Sub2_Sub14_Sub2 local14;
			synchronized (this.aClass150_2) {
				local14 = (Class5_Sub2_Sub14_Sub2) this.aClass150_2.method3101();
				if (local14 == null) {
					try {
						this.aClass150_2.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt1024--;
			}
			try {
				if (local14.anInt10279 == 2) {
					local14.aClass287_3.method7029((int) local14.aLong319, local14.aByteArray107.length, local14.aByteArray107);
				} else if (local14.anInt10279 == 3) {
					local14.aByteArray107 = local14.aClass287_3.method7030((int) local14.aLong319);
				}
			} catch (@Pc(76) Exception local76) {
				Static17.method268((String) null, local76);
			}
			local14.aBoolean746 = false;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	public void method946() {
		this.aBoolean63 = true;
		@Pc(9) Class150 local9 = this.aClass150_2;
		synchronized (this.aClass150_2) {
			this.aClass150_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZILclient!qia;)Lclient!wda;")
	public Class5_Sub2_Sub14_Sub2 method947(@OriginalArg(1) int arg0, @OriginalArg(2) Class287 arg1) {
		@Pc(7) Class5_Sub2_Sub14_Sub2 local7 = new Class5_Sub2_Sub14_Sub2();
		local7.anInt10279 = 3;
		local7.aBoolean747 = false;
		local7.aLong319 = (long) arg0;
		local7.aClass287_3 = arg1;
		this.method950(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([BILclient!qia;I)Lclient!wda;")
	public Class5_Sub2_Sub14_Sub2 method948(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class287 arg2) {
		@Pc(16) Class5_Sub2_Sub14_Sub2 local16 = new Class5_Sub2_Sub14_Sub2();
		local16.aBoolean747 = false;
		local16.aByteArray107 = arg0;
		local16.anInt10279 = 2;
		local16.aClass287_3 = arg2;
		local16.aLong319 = (long) arg1;
		this.method950(local16);
		return local16;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLclient!wda;)V")
	private void method950(@OriginalArg(1) Class5_Sub2_Sub14_Sub2 arg0) {
		@Pc(6) Class150 local6 = this.aClass150_2;
		synchronized (this.aClass150_2) {
			this.aClass150_2.method3095(arg0);
			this.anInt1024++;
			this.aClass150_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!qia;I)Lclient!wda;")
	public Class5_Sub2_Sub14_Sub2 method951(@OriginalArg(0) int arg0, @OriginalArg(1) Class287 arg1) {
		@Pc(7) Class5_Sub2_Sub14_Sub2 local7 = new Class5_Sub2_Sub14_Sub2();
		local7.anInt10279 = 1;
		@Pc(13) Class150 local13 = this.aClass150_2;
		synchronized (this.aClass150_2) {
			@Pc(26) Class5_Sub2_Sub14_Sub2 local26 = (Class5_Sub2_Sub14_Sub2) this.aClass150_2.method3100();
			while (true) {
				if (local26 == null) {
					break;
				}
				if (local26.aLong319 == (long) arg0 && local26.aClass287_3 == arg1 && local26.anInt10279 == 2) {
					local7.aBoolean746 = false;
					local7.aByteArray107 = local26.aByteArray107;
					return local7;
				}
				local26 = (Class5_Sub2_Sub14_Sub2) this.aClass150_2.method3096();
			}
		}
		local7.aByteArray107 = arg1.method7030(arg0);
		local7.aBoolean746 = false;
		local7.aBoolean747 = true;
		return local7;
	}
}
