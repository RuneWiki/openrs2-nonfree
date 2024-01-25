import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class116 implements Runnable {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!qk;")
	private final Class290 aClass290_4 = new Class290();

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public int anInt3274 = 0;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class116(@OriginalArg(0) Class286 arg0) {
		@Pc(20) Class319 local20 = arg0.method6575(5, this);
		while (local20.anInt8562 == 0) {
			Static440.method6322(10L);
		}
		if (local20.anInt8562 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject19;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!me;)V")
	private void method2774(@OriginalArg(1) Class2_Sub7_Sub9_Sub1 arg0) {
		@Pc(2) Class290 local2 = this.aClass290_4;
		synchronized (this.aClass290_4) {
			this.aClass290_4.method6678(arg0);
			this.anInt3274++;
			this.aClass290_4.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public void method2775() {
		this.aBoolean259 = true;
		@Pc(9) Class290 local9 = this.aClass290_4;
		synchronized (this.aClass290_4) {
			this.aClass290_4.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!uj;)Lclient!me;")
	public Class2_Sub7_Sub9_Sub1 method2776(@OriginalArg(1) int arg0, @OriginalArg(2) Class349 arg1) {
		@Pc(9) Class2_Sub7_Sub9_Sub1 local9 = new Class2_Sub7_Sub9_Sub1();
		local9.anInt6057 = 1;
		@Pc(15) Class290 local15 = this.aClass290_4;
		synchronized (this.aClass290_4) {
			@Pc(23) Class2_Sub7_Sub9_Sub1 local23 = (Class2_Sub7_Sub9_Sub1) this.aClass290_4.method6680();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong260 && arg1 == local23.aClass349_3 && local23.anInt6057 == 2) {
					local9.aByteArray58 = local23.aByteArray58;
					local9.aBoolean672 = false;
					return local9;
				}
				local23 = (Class2_Sub7_Sub9_Sub1) this.aClass290_4.method6673();
			}
		}
		local9.aByteArray58 = arg1.method8079(arg0);
		local9.aBoolean672 = false;
		local9.aBoolean670 = true;
		return local9;
	}

	@OriginalMember(owner = "client!fi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean259) {
			@Pc(6) Class290 local6 = this.aClass290_4;
			@Pc(14) Class2_Sub7_Sub9_Sub1 local14;
			synchronized (this.aClass290_4) {
				local14 = (Class2_Sub7_Sub9_Sub1) this.aClass290_4.method6676();
				if (local14 == null) {
					try {
						this.aClass290_4.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt3274--;
			}
			try {
				if (local14.anInt6057 == 2) {
					local14.aClass349_3.method8077(local14.aByteArray58, local14.aByteArray58.length, (int) local14.aLong260);
				} else if (local14.anInt6057 == 3) {
					local14.aByteArray58 = local14.aClass349_3.method8079((int) local14.aLong260);
				}
			} catch (@Pc(72) Exception local72) {
				Static25.method7457(local72, (String) null);
			}
			local14.aBoolean672 = false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!uj;II)Lclient!me;")
	public Class2_Sub7_Sub9_Sub1 method2778(@OriginalArg(0) Class349 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub7_Sub9_Sub1 local14 = new Class2_Sub7_Sub9_Sub1();
		local14.aClass349_3 = arg0;
		local14.anInt6057 = 3;
		local14.aLong260 = (long) arg1;
		local14.aBoolean670 = false;
		this.method2774(local14);
		return local14;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI[BLclient!uj;)Lclient!me;")
	public Class2_Sub7_Sub9_Sub1 method2779(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class349 arg2) {
		@Pc(13) Class2_Sub7_Sub9_Sub1 local13 = new Class2_Sub7_Sub9_Sub1();
		local13.anInt6057 = 2;
		local13.aBoolean670 = false;
		local13.aLong260 = (long) arg0;
		local13.aByteArray58 = arg1;
		local13.aClass349_3 = arg2;
		this.method2774(local13);
		return local13;
	}
}
