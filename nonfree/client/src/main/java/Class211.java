import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class211 implements Runnable {

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Lclient!p;")
	private final Class159 aClass159_11 = new Class159();

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public int anInt6444 = 0;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Class34("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class211(@OriginalArg(0) Class143 arg0) {
		@Pc(20) Class162 local20 = arg0.method3908(this, 5);
		while (local20.anInt4801 == 0) {
			Static190.method3690(10L);
		}
		if (local20.anInt4801 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject5;
	}

	@OriginalMember(owner = "client!vm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean629) {
			@Pc(6) Class159 local6 = this.aClass159_11;
			@Pc(14) Class1_Sub4_Sub5_Sub1 local14;
			synchronized (this.aClass159_11) {
				local14 = (Class1_Sub4_Sub5_Sub1) this.aClass159_11.method4258();
				if (local14 == null) {
					try {
						this.aClass159_11.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt6444--;
			}
			try {
				if (local14.anInt1165 == 2) {
					local14.aClass166_1.method4384(local14.aByteArray18.length, (int) local14.aLong214, local14.aByteArray18);
				} else if (local14.anInt1165 == 3) {
					local14.aByteArray18 = local14.aClass166_1.method4385((int) local14.aLong214);
				}
			} catch (@Pc(72) Exception local72) {
				Static109.method2355(null, local72);
			}
			local14.aBoolean519 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!pp;I)Lclient!ca;")
	public Class1_Sub4_Sub5_Sub1 method5432(@OriginalArg(1) Class166 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub4_Sub5_Sub1 local7 = new Class1_Sub4_Sub5_Sub1();
		local7.aLong214 = arg1;
		local7.anInt1165 = 3;
		local7.aClass166_1 = arg0;
		local7.aBoolean518 = false;
		this.method5434(local7);
		return local7;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method5433() {
		this.aBoolean629 = true;
		@Pc(15) Class159 local15 = this.aClass159_11;
		synchronized (this.aClass159_11) {
			this.aClass159_11.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ca;B)V")
	private void method5434(@OriginalArg(0) Class1_Sub4_Sub5_Sub1 arg0) {
		@Pc(2) Class159 local2 = this.aClass159_11;
		synchronized (this.aClass159_11) {
			this.aClass159_11.method4262(arg0);
			this.anInt6444++;
			this.aClass159_11.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!pp;I)Lclient!ca;")
	public Class1_Sub4_Sub5_Sub1 method5435(@OriginalArg(1) Class166 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub4_Sub5_Sub1 local15 = new Class1_Sub4_Sub5_Sub1();
		local15.anInt1165 = 1;
		@Pc(21) Class159 local21 = this.aClass159_11;
		synchronized (this.aClass159_11) {
			@Pc(29) Class1_Sub4_Sub5_Sub1 local29 = (Class1_Sub4_Sub5_Sub1) this.aClass159_11.method4261();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong214 == (long) arg1 && local29.aClass166_1 == arg0 && local29.anInt1165 == 2) {
					local15.aByteArray18 = local29.aByteArray18;
					local15.aBoolean519 = false;
					return local15;
				}
				local29 = (Class1_Sub4_Sub5_Sub1) this.aClass159_11.method4257();
			}
		}
		local15.aByteArray18 = arg0.method4385(arg1);
		local15.aBoolean519 = false;
		local15.aBoolean518 = true;
		return local15;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BZLclient!pp;)Lclient!ca;")
	public Class1_Sub4_Sub5_Sub1 method5438(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class166 arg2) {
		@Pc(7) Class1_Sub4_Sub5_Sub1 local7 = new Class1_Sub4_Sub5_Sub1();
		local7.aClass166_1 = arg2;
		local7.anInt1165 = 2;
		local7.aLong214 = arg0;
		local7.aBoolean518 = false;
		local7.aByteArray18 = arg1;
		this.method5434(local7);
		return local7;
	}
}
