import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class209 implements Runnable {

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "Lclient!ju;")
	private final Class136 aClass136_9 = new Class136();

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public int anInt6040 = 0;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!lt;)V")
	public Class209(@OriginalArg(0) Class159 arg0) {
		@Pc(20) Class270 local20 = arg0.method3496(5, this);
		while (local20.anInt7548 == 0) {
			Static328.method5696(10L);
		}
		if (local20.anInt7548 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject9;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!fq;I)Lclient!rf;")
	public Class10_Sub1_Sub13_Sub2 method4767(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class10_Sub1_Sub13_Sub2 local7 = new Class10_Sub1_Sub13_Sub2();
		local7.aLong254 = arg1;
		local7.aClass84_3 = arg0;
		local7.anInt5925 = 3;
		local7.aBoolean382 = false;
		this.method4771(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method4768() {
		this.aBoolean390 = true;
		@Pc(9) Class136 local9 = this.aClass136_9;
		synchronized (this.aClass136_9) {
			this.aClass136_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!rm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean390) {
			@Pc(10) Class136 local10 = this.aClass136_9;
			@Pc(18) Class10_Sub1_Sub13_Sub2 local18;
			synchronized (this.aClass136_9) {
				local18 = (Class10_Sub1_Sub13_Sub2) this.aClass136_9.method3198();
				if (local18 == null) {
					try {
						this.aClass136_9.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6040--;
			}
			try {
				if (local18.anInt5925 == 2) {
					local18.aClass84_3.method2095((int) local18.aLong254, local18.aByteArray79, local18.aByteArray79.length);
				} else if (local18.anInt5925 == 3) {
					local18.aByteArray79 = local18.aClass84_3.method2096((int) local18.aLong254);
				}
			} catch (@Pc(80) Exception local80) {
				Static432.method5720(null, local80);
			}
			local18.aBoolean383 = false;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BILclient!fq;[B)Lclient!rf;")
	public Class10_Sub1_Sub13_Sub2 method4769(@OriginalArg(1) int arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class10_Sub1_Sub13_Sub2 local7 = new Class10_Sub1_Sub13_Sub2();
		local7.aLong254 = arg0;
		local7.aBoolean382 = false;
		local7.anInt5925 = 2;
		local7.aClass84_3 = arg1;
		local7.aByteArray79 = arg2;
		this.method4771(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!rf;)V")
	private void method4771(@OriginalArg(1) Class10_Sub1_Sub13_Sub2 arg0) {
		@Pc(6) Class136 local6 = this.aClass136_9;
		synchronized (this.aClass136_9) {
			this.aClass136_9.method3197(arg0);
			this.anInt6040++;
			this.aClass136_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!fq;I)Lclient!rf;")
	public Class10_Sub1_Sub13_Sub2 method4774(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class10_Sub1_Sub13_Sub2 local9 = new Class10_Sub1_Sub13_Sub2();
		local9.anInt5925 = 1;
		@Pc(23) Class136 local23 = this.aClass136_9;
		synchronized (this.aClass136_9) {
			@Pc(31) Class10_Sub1_Sub13_Sub2 local31 = (Class10_Sub1_Sub13_Sub2) this.aClass136_9.method3200();
			while (true) {
				if (local31 == null) {
					break;
				}
				if ((long) arg1 == local31.aLong254 && local31.aClass84_3 == arg0 && local31.anInt5925 == 2) {
					local9.aBoolean383 = false;
					local9.aByteArray79 = local31.aByteArray79;
					return local9;
				}
				local31 = (Class10_Sub1_Sub13_Sub2) this.aClass136_9.method3201();
			}
		}
		local9.aByteArray79 = arg0.method2096(arg1);
		local9.aBoolean382 = true;
		local9.aBoolean383 = false;
		return local9;
	}
}
