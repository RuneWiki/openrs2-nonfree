import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!mba;")
	private final Class216 aClass216_31 = new Class216();

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!mba;")
	private final Class216 aClass216_32 = new Class216();

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	private int anInt3455 = -1;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt3454 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!no;Lclient!fc;)V")
	private void method2973(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		while (arg0 != this.aClass216_32.aClass3_185 && ((Class3_Sub17) arg0).anInt2971 <= arg1.anInt2971) {
			arg0 = arg0.aClass3_300;
		}
		Static609.method8336(arg0, arg1);
		this.anInt3455 = ((Class3_Sub17) this.aClass216_32.aClass3_185.aClass3_300).anInt2971;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()I")
	@Override
	public int method4681() {
		return 0;
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "()V")
	private void method2974() {
		if (this.anInt3454 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub17 local8 = (Class3_Sub17) this.aClass216_32.method5457(); local8 != null; local8 = (Class3_Sub17) this.aClass216_32.method5458()) {
			local8.anInt2971 -= this.anInt3454;
		}
		this.anInt3455 -= this.anInt3454;
		this.anInt3454 = 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4679() {
		return (Class3_Sub3) this.aClass216_31.method5458();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4680() {
		return (Class3_Sub3) this.aClass216_31.method5457();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!co;)V")
	public synchronized void method2975(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass216_31.method5453(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3455 < 0) {
				this.method2980(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3454 + arg2 < this.anInt3455) {
				this.anInt3454 += arg2;
				this.method2980(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3455 - this.anInt3454;
			this.method2980(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3454 += local33;
			this.method2974();
			@Pc(60) Class3_Sub17 local60 = (Class3_Sub17) this.aClass216_32.method5457();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2477(this);
				if (local68 < 0) {
					local60.anInt2971 = 0;
					this.method2979(local60);
				} else {
					local60.anInt2971 = local68;
					this.method2973(local60.aClass3_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lclient!co;)V")
	public synchronized void method2976(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method8682();
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "()I")
	public synchronized int method2977() {
		return this.aClass216_31.method5460();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	private void method2978(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass216_31.method5457(); local5 != null; local5 = (Class3_Sub3) this.aClass216_31.method5458()) {
			local5.method4678(arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!fc;)V")
	private void method2979(@OriginalArg(0) Class3_Sub17 arg0) {
		arg0.method8682();
		arg0.method2478();
		@Pc(9) Class3 local9 = this.aClass216_32.aClass3_185.aClass3_300;
		if (local9 == this.aClass216_32.aClass3_185) {
			this.anInt3455 = -1;
		} else {
			this.anInt3455 = ((Class3_Sub17) local9).anInt2971;
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "([III)V")
	private void method2980(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass216_31.method5457(); local5 != null; local5 = (Class3_Sub3) this.aClass216_31.method5458()) {
			local5.method4682(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4678(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3455 < 0) {
				this.method2978(arg0);
				return;
			}
			if (this.anInt3454 + arg0 < this.anInt3455) {
				this.anInt3454 += arg0;
				this.method2978(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3455 - this.anInt3454;
			this.method2978(local29);
			arg0 -= local29;
			this.anInt3454 += local29;
			this.method2974();
			@Pc(50) Class3_Sub17 local50 = (Class3_Sub17) this.aClass216_32.method5457();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2477(this);
				if (local58 < 0) {
					local50.anInt2971 = 0;
					this.method2979(local50);
				} else {
					local50.anInt2971 = local58;
					this.method2973(local50.aClass3_300, local50);
				}
			}
		} while (arg0 != 0);
	}
}
