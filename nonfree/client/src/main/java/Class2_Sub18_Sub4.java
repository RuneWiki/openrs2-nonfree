import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class2_Sub18_Sub4 extends Class2_Sub18 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!wl;")
	private final Class265 aClass265_44 = new Class265();

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!wl;")
	private final Class265 aClass265_45 = new Class265();

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt5487 = 0;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private int anInt5486 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!nj;)V")
	private void method4452(@OriginalArg(0) Class2_Sub30 arg0) {
		arg0.method6072();
		arg0.method3948();
		@Pc(9) Class2 local9 = this.aClass265_45.aClass2_257.aClass2_261;
		if (local9 == this.aClass265_45.aClass2_257) {
			this.anInt5486 = -1;
		} else {
			this.anInt5486 = ((Class2_Sub30) local9).anInt4894;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "()I")
	public synchronized int method4453() {
		return this.aClass265_44.method6002();
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	private void method4454(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub18 local5 = (Class2_Sub18) this.aClass265_44.method6005(); local5 != null; local5 = (Class2_Sub18) this.aClass265_44.method6001()) {
			local5.method4450(arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4450(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5486 < 0) {
				this.method4454(arg0);
				return;
			}
			if (this.anInt5487 + arg0 < this.anInt5486) {
				this.anInt5487 += arg0;
				this.method4454(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5486 - this.anInt5487;
			this.method4454(local29);
			arg0 -= local29;
			this.anInt5487 += local29;
			this.method4457();
			@Pc(50) Class2_Sub30 local50 = (Class2_Sub30) this.aClass265_45.method6005();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3949(this);
				if (local58 < 0) {
					local50.anInt4894 = 0;
					this.method4452(local50);
				} else {
					local50.anInt4894 = local58;
					this.method4458(local50.aClass2_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4451() {
		return (Class2_Sub18) this.aClass265_44.method6001();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!gm;)V")
	public synchronized void method4455(@OriginalArg(0) Class2_Sub18 arg0) {
		this.aClass265_44.method5992(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!gm;)V")
	public synchronized void method4456(@OriginalArg(0) Class2_Sub18 arg0) {
		arg0.method6072();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
	@Override
	public int method4445() {
		return 0;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "()V")
	private void method4457() {
		if (this.anInt5487 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub30 local8 = (Class2_Sub30) this.aClass265_45.method6005(); local8 != null; local8 = (Class2_Sub30) this.aClass265_45.method6001()) {
			local8.anInt4894 -= this.anInt5487;
		}
		this.anInt5486 -= this.anInt5487;
		this.anInt5487 = 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!da;Lclient!nj;)V")
	private void method4458(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		while (arg0 != this.aClass265_45.aClass2_257 && ((Class2_Sub30) arg0).anInt4894 <= arg1.anInt4894) {
			arg0 = arg0.aClass2_261;
		}
		Static117.method1718(arg0, arg1);
		this.anInt5486 = ((Class2_Sub30) this.aClass265_45.aClass2_257.aClass2_261).anInt4894;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "([III)V")
	private void method4459(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub18 local5 = (Class2_Sub18) this.aClass265_44.method6005(); local5 != null; local5 = (Class2_Sub18) this.aClass265_44.method6001()) {
			local5.method4447(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5486 < 0) {
				this.method4459(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5487 + arg2 < this.anInt5486) {
				this.anInt5487 += arg2;
				this.method4459(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5486 - this.anInt5487;
			this.method4459(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5487 += local33;
			this.method4457();
			@Pc(60) Class2_Sub30 local60 = (Class2_Sub30) this.aClass265_45.method6005();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3949(this);
				if (local68 < 0) {
					local60.anInt4894 = 0;
					this.method4452(local60);
				} else {
					local60.anInt4894 = local68;
					this.method4458(local60.aClass2_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub18 method4448() {
		return (Class2_Sub18) this.aClass265_44.method6005();
	}
}
