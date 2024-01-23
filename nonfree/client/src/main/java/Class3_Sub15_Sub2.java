import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub15_Sub2 extends Class3_Sub15 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!fk;")
	private Class56 aClass56_7 = new Class56();

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!fk;")
	private Class56 aClass56_8 = new Class56();

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	private int anInt2741 = -1;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private int anInt2742 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2741 < 0) {
				this.method2431(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2742 + arg2 < this.anInt2741) {
				this.anInt2742 += arg2;
				this.method2431(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2741 - this.anInt2742;
			this.method2431(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2742 += local33;
			this.method2433();
			@Pc(60) Class3_Sub29 local60 = (Class3_Sub29) this.aClass56_8.method1281();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4626(this);
				if (local68 < 0) {
					local60.anInt5676 = 0;
					this.method2434(local60);
				} else {
					local60.anInt5676 = local68;
					this.method2436(local60.aClass3_232, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ph;)V")
	public synchronized void method2430(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aClass56_7.method1274(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "([III)V")
	private void method2431(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub15 local5 = (Class3_Sub15) this.aClass56_7.method1281(); local5 != null; local5 = (Class3_Sub15) this.aClass56_7.method1278()) {
			local5.method4562(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()I")
	@Override
	public int method4564() {
		return 0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!ph;)V")
	public synchronized void method2432(@OriginalArg(0) Class3_Sub15 arg0) {
		arg0.method5013();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4563() {
		return (Class3_Sub15) this.aClass56_7.method1278();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4559() {
		return (Class3_Sub15) this.aClass56_7.method1281();
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()V")
	private void method2433() {
		if (this.anInt2742 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub29 local8 = (Class3_Sub29) this.aClass56_8.method1281(); local8 != null; local8 = (Class3_Sub29) this.aClass56_8.method1278()) {
			local8.anInt5676 -= this.anInt2742;
		}
		this.anInt2741 -= this.anInt2742;
		this.anInt2742 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4561(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2741 < 0) {
				this.method2435(arg0);
				return;
			}
			if (this.anInt2742 + arg0 < this.anInt2741) {
				this.anInt2742 += arg0;
				this.method2435(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2741 - this.anInt2742;
			this.method2435(local29);
			arg0 -= local29;
			this.anInt2742 += local29;
			this.method2433();
			@Pc(50) Class3_Sub29 local50 = (Class3_Sub29) this.aClass56_8.method1281();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4626(this);
				if (local58 < 0) {
					local50.anInt5676 = 0;
					this.method2434(local50);
				} else {
					local50.anInt5676 = local58;
					this.method2436(local50.aClass3_232, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!uj;)V")
	private void method2434(@OriginalArg(0) Class3_Sub29 arg0) {
		arg0.method5013();
		arg0.method4625();
		@Pc(9) Class3 local9 = this.aClass56_8.aClass3_66.aClass3_232;
		if (local9 == this.aClass56_8.aClass3_66) {
			this.anInt2741 = -1;
		} else {
			this.anInt2741 = ((Class3_Sub29) local9).anInt5676;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	private void method2435(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub15 local5 = (Class3_Sub15) this.aClass56_7.method1281(); local5 != null; local5 = (Class3_Sub15) this.aClass56_7.method1278()) {
			local5.method4561(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!wk;Lclient!uj;)V")
	private void method2436(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub29 arg1) {
		while (arg0 != this.aClass56_8.aClass3_66 && ((Class3_Sub29) arg0).anInt5676 <= arg1.anInt5676) {
			arg0 = arg0.aClass3_232;
		}
		Static174.method2873(arg0, arg1);
		this.anInt2741 = ((Class3_Sub29) this.aClass56_8.aClass3_66.aClass3_232).anInt5676;
	}
}
