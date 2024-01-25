import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class1_Sub19_Sub2 extends Class1_Sub19 {

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "Lclient!pu;")
	private final Class203 aClass203_34 = new Class203();

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "Lclient!pu;")
	private final Class203 aClass203_35 = new Class203();

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	private int anInt4093 = 0;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	private int anInt4092 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!oa;)V")
	public synchronized void method3181(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method6178();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!jp;Lclient!fj;)V")
	private void method3182(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		while (arg0 != this.aClass203_35.aClass1_195 && ((Class1_Sub17) arg0).anInt2602 <= arg1.anInt2602) {
			arg0 = arg0.aClass1_264;
		}
		Static28.method564(arg0, arg1);
		this.anInt4092 = ((Class1_Sub17) this.aClass203_35.aClass1_195.aClass1_264).anInt2602;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5807() {
		return (Class1_Sub19) this.aClass203_34.method4548();
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "()I")
	public synchronized int method3183() {
		return this.aClass203_34.method4552();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4092 < 0) {
				this.method3188(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4093 + arg2 < this.anInt4092) {
				this.anInt4093 += arg2;
				this.method3188(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4092 - this.anInt4093;
			this.method3188(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4093 += local33;
			this.method3184();
			@Pc(60) Class1_Sub17 local60 = (Class1_Sub17) this.aClass203_35.method4548();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1894(this);
				if (local68 < 0) {
					local60.anInt2602 = 0;
					this.method3185(local60);
				} else {
					local60.anInt2602 = local68;
					this.method3182(local60.aClass1_264, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "()V")
	private void method3184() {
		if (this.anInt4093 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub17 local8 = (Class1_Sub17) this.aClass203_35.method4548(); local8 != null; local8 = (Class1_Sub17) this.aClass203_35.method4545()) {
			local8.anInt2602 -= this.anInt4093;
		}
		this.anInt4092 -= this.anInt4093;
		this.anInt4093 = 0;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "()I")
	@Override
	public int method5808() {
		return 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!fj;)V")
	private void method3185(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.method6178();
		arg0.method1895();
		@Pc(9) Class1 local9 = this.aClass203_35.aClass1_195.aClass1_264;
		if (local9 == this.aClass203_35.aClass1_195) {
			this.anInt4092 = -1;
		} else {
			this.anInt4092 = ((Class1_Sub17) local9).anInt2602;
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	private void method3186(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass203_34.method4548(); local5 != null; local5 = (Class1_Sub19) this.aClass203_34.method4545()) {
			local5.method5802(arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Lclient!oa;)V")
	public synchronized void method3187(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aClass203_34.method4555(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5802(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4092 < 0) {
				this.method3186(arg0);
				return;
			}
			if (this.anInt4093 + arg0 < this.anInt4092) {
				this.anInt4093 += arg0;
				this.method3186(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4092 - this.anInt4093;
			this.method3186(local29);
			arg0 -= local29;
			this.anInt4093 += local29;
			this.method3184();
			@Pc(50) Class1_Sub17 local50 = (Class1_Sub17) this.aClass203_35.method4548();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1894(this);
				if (local58 < 0) {
					local50.anInt2602 = 0;
					this.method3185(local50);
				} else {
					local50.anInt2602 = local58;
					this.method3182(local50.aClass1_264, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "([III)V")
	private void method3188(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass203_34.method4548(); local5 != null; local5 = (Class1_Sub19) this.aClass203_34.method4545()) {
			local5.method5804(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5805() {
		return (Class1_Sub19) this.aClass203_34.method4545();
	}
}
