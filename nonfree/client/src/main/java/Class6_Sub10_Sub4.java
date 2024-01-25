import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class6_Sub10_Sub4 extends Class6_Sub10 {

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "Lclient!mfa;")
	public final Class211 aClass211_56 = new Class211();

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "Lclient!lb;")
	public final Class6_Sub10_Sub3 aClass6_Sub10_Sub3_2 = new Class6_Sub10_Sub3();

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "Lclient!co;")
	private final Class6_Sub10_Sub1 aClass6_Sub10_Sub1_3;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class6_Sub10_Sub4(@OriginalArg(0) Class6_Sub10_Sub1 arg0) {
		this.aClass6_Sub10_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5656() {
		@Pc(9) Class6_Sub49 local9 = (Class6_Sub49) this.aClass211_56.method5183();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub10_Sub2_4 == null) {
			return this.method5655();
		} else {
			return local9.aClass6_Sub10_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	@Override
	public void method5651(@OriginalArg(0) int arg0) {
		this.aClass6_Sub10_Sub3_2.method5651(arg0);
		for (@Pc(15) Class6_Sub49 local15 = (Class6_Sub49) this.aClass211_56.method5183(); local15 != null; local15 = (Class6_Sub49) this.aClass211_56.method5177()) {
			if (!this.aClass6_Sub10_Sub1_3.method1541(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt9527 >= local25) {
						this.method5661(local15, local25);
						local15.anInt9527 -= local25;
						break;
					}
					this.method5661(local15, local15.anInt9527);
					local25 -= local15.anInt9527;
				} while (!this.aClass6_Sub10_Sub1_3.method1523(0, local15, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!waa;I[IIII)V")
	private void method5659(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub10_Sub1_3.anIntArray113[arg0.anInt9522] & 0x4) != 0 && arg0.anInt9520 < 0) {
			@Pc(37) int local37 = this.aClass6_Sub10_Sub1_3.anIntArray117[arg0.anInt9522] / Static77.anInt1912;
			while (true) {
				@Pc(46) int local46 = (local37 + 1048575 - arg0.anInt9530) / local37;
				if (arg2 < local46) {
					arg0.anInt9530 += arg2 * local37;
					break;
				}
				arg0.aClass6_Sub10_Sub2_4.method5657(arg1, arg4, local46);
				arg0.anInt9530 += local37 * local46 - 1048576;
				arg2 -= local46;
				arg4 += local46;
				@Pc(81) int local81 = Static77.anInt1912 / 100;
				@Pc(85) int local85 = 262144 / local37;
				if (local85 < local81) {
					local81 = local85;
				}
				@Pc(97) Class6_Sub10_Sub2 local97 = arg0.aClass6_Sub10_Sub2_4;
				if (this.aClass6_Sub10_Sub1_3.anIntArray116[arg0.anInt9522] == 0) {
					arg0.aClass6_Sub10_Sub2_4 = Static587.method3444(arg0.aClass6_Sub12_Sub1_4, local97.method3411(), local97.method3413(), local97.method3446());
				} else {
					arg0.aClass6_Sub10_Sub2_4 = Static587.method3444(arg0.aClass6_Sub12_Sub1_4, local97.method3411(), 0, local97.method3446());
					this.aClass6_Sub10_Sub1_3.method1522(arg0, arg0.aClass6_Sub46_1.aShortArray157[arg0.anInt9533] < 0);
					arg0.aClass6_Sub10_Sub2_4.method3420(local81, local97.method3413());
				}
				if (arg0.aClass6_Sub46_1.aShortArray157[arg0.anInt9533] < 0) {
					arg0.aClass6_Sub10_Sub2_4.method3434(-1);
				}
				local97.method3428(local81);
				local97.method5657(arg1, arg4, arg3 - arg4);
				if (local97.method3421()) {
					this.aClass6_Sub10_Sub3_2.method4737(local97);
				}
			}
		}
		arg0.aClass6_Sub10_Sub2_4.method5657(arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
	@Override
	public int method5652() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5655() {
		@Pc(9) Class6_Sub49 local9;
		do {
			local9 = (Class6_Sub49) this.aClass211_56.method5177();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub10_Sub2_4 == null);
		return local9.aClass6_Sub10_Sub2_4;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "([III)V")
	@Override
	public void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub10_Sub3_2.method5657(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub49 local17 = (Class6_Sub49) this.aClass211_56.method5183(); local17 != null; local17 = (Class6_Sub49) this.aClass211_56.method5177()) {
			if (!this.aClass6_Sub10_Sub1_3.method1541(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt9527) {
						this.method5659(local17, arg0, local27, local29 + local27, local29);
						local17.anInt9527 -= local27;
						break;
					}
					this.method5659(local17, arg0, local17.anInt9527, local27 + local29, local29);
					local29 += local17.anInt9527;
					local27 -= local17.anInt9527;
				} while (!this.aClass6_Sub10_Sub1_3.method1523(local29, local17, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!waa;IB)V")
	private void method5661(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass6_Sub10_Sub1_3.anIntArray113[arg0.anInt9522] & 0x4) != 0 && arg0.anInt9520 < 0) {
			@Pc(30) int local30 = this.aClass6_Sub10_Sub1_3.anIntArray117[arg0.anInt9522] / Static77.anInt1912;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt9530) / local30;
			arg0.anInt9530 = arg0.anInt9530 + local30 * arg1 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass6_Sub10_Sub1_3.anIntArray116[arg0.anInt9522] == 0) {
					arg0.aClass6_Sub10_Sub2_4 = Static587.method3444(arg0.aClass6_Sub12_Sub1_4, arg0.aClass6_Sub10_Sub2_4.method3411(), arg0.aClass6_Sub10_Sub2_4.method3413(), arg0.aClass6_Sub10_Sub2_4.method3446());
				} else {
					arg0.aClass6_Sub10_Sub2_4 = Static587.method3444(arg0.aClass6_Sub12_Sub1_4, arg0.aClass6_Sub10_Sub2_4.method3411(), 0, arg0.aClass6_Sub10_Sub2_4.method3446());
					this.aClass6_Sub10_Sub1_3.method1522(arg0, arg0.aClass6_Sub46_1.aShortArray157[arg0.anInt9533] < 0);
				}
				if (arg0.aClass6_Sub46_1.aShortArray157[arg0.anInt9533] < 0) {
					arg0.aClass6_Sub10_Sub2_4.method3434(-1);
				}
				arg1 = arg0.anInt9530 / local30;
			}
		}
		arg0.aClass6_Sub10_Sub2_4.method5651(arg1);
	}
}
