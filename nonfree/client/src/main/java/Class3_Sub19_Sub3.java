import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class3_Sub19_Sub3 extends Class3_Sub19 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!bd;")
	private final Class10 aClass10_108 = new Class10();

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!bd;")
	private final Class10 aClass10_109 = new Class10();

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	private int anInt3782 = 0;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	private int anInt3783 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!pe;)V")
	private void method2918(@OriginalArg(0) Class3_Sub20 arg0) {
		arg0.method3320();
		arg0.method2185();
		@Pc(9) Class3 local9 = this.aClass10_109.aClass3_19.aClass3_213;
		if (local9 == this.aClass10_109.aClass3_19) {
			this.anInt3783 = -1;
		} else {
			this.anInt3783 = ((Class3_Sub20) local9).anInt3065;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	private void method2919(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub19 local5 = (Class3_Sub19) this.aClass10_108.method267(); local5 != null; local5 = (Class3_Sub19) this.aClass10_108.method268()) {
			local5.method3248(arg0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "([III)V")
	private void method2920(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub19 local5 = (Class3_Sub19) this.aClass10_108.method267(); local5 != null; local5 = (Class3_Sub19) this.aClass10_108.method268()) {
			local5.method3245(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!id;Lclient!pe;)V")
	private void method2921(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub20 arg1) {
		while (arg0 != this.aClass10_109.aClass3_19 && ((Class3_Sub20) arg0).anInt3065 <= arg1.anInt3065) {
			arg0 = arg0.aClass3_213;
		}
		this.aClass10_109.method258(arg0, arg1);
		this.anInt3783 = ((Class3_Sub20) this.aClass10_109.aClass3_19.aClass3_213).anInt3065;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3246() {
		return (Class3_Sub19) this.aClass10_108.method268();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3248(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3783 < 0) {
				this.method2919(arg0);
				return;
			}
			if (this.anInt3782 + arg0 < this.anInt3783) {
				this.anInt3782 += arg0;
				this.method2919(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3783 - this.anInt3782;
			this.method2919(local29);
			arg0 -= local29;
			this.anInt3782 += local29;
			this.method2924();
			@Pc(50) Class3_Sub20 local50 = (Class3_Sub20) this.aClass10_109.method267();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2186(this);
				if (local58 < 0) {
					local50.anInt3065 = 0;
					this.method2918(local50);
				} else {
					local50.anInt3065 = local58;
					this.method2921(local50.aClass3_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
	@Override
	public int method3244() {
		return 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!pb;)V")
	public synchronized void method2922(@OriginalArg(0) Class3_Sub19 arg0) {
		this.aClass10_108.method265(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lclient!pb;)V")
	public synchronized void method2923(@OriginalArg(0) Class3_Sub19 arg0) {
		arg0.method3320();
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "()V")
	private void method2924() {
		if (this.anInt3782 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) this.aClass10_109.method267(); local8 != null; local8 = (Class3_Sub20) this.aClass10_109.method268()) {
			local8.anInt3065 -= this.anInt3782;
		}
		this.anInt3783 -= this.anInt3782;
		this.anInt3782 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3247() {
		return (Class3_Sub19) this.aClass10_108.method267();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3783 < 0) {
				this.method2920(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3782 + arg2 < this.anInt3783) {
				this.anInt3782 += arg2;
				this.method2920(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3783 - this.anInt3782;
			this.method2920(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3782 += local33;
			this.method2924();
			@Pc(60) Class3_Sub20 local60 = (Class3_Sub20) this.aClass10_109.method267();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2186(this);
				if (local68 < 0) {
					local60.anInt3065 = 0;
					this.method2918(local60);
				} else {
					local60.anInt3065 = local68;
					this.method2921(local60.aClass3_213, local60);
				}
			}
		} while (arg2 != 0);
	}
}
