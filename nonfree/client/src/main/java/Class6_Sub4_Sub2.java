import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!te", name = "Ac", descriptor = "Lclient!ga;")
	public Class1_Sub2_Sub11 aClass1_Sub2_Sub11_1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub2_Sub11_1 == null) {
			return;
		}
		@Pc(24) Class1_Sub2_Sub14 local24 = super.anInt3945 != -1 && super.anInt3956 == 0 ? Static173.method2924(super.anInt3945) : null;
		@Pc(43) Class1_Sub2_Sub14 local43 = super.anInt3946 == -1 || super.anInt3946 == super.anInt3954 && local24 != null ? null : Static173.method2924(super.anInt3946);
		@Pc(54) Class6_Sub3 local54 = this.aClass1_Sub2_Sub11_1.method1077(local43, super.anInt3933, local24, super.anInt3968);
		if (local54 == null) {
			return;
		}
		@Pc(59) int local59 = 0;
		super.anInt3962 = local54.method2984();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass1_Sub2_Sub11_1.aShort11 != 0 && this.aClass1_Sub2_Sub11_1.aShort12 != 0) {
			@Pc(85) short local85 = this.aClass1_Sub2_Sub11_1.aShort11;
			@Pc(89) int local89 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
			@Pc(93) int local93 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
			@Pc(98) int local98 = -local85 / 2;
			@Pc(102) short local102 = this.aClass1_Sub2_Sub11_1.aShort12;
			@Pc(107) int local107 = -local102 / 2;
			@Pc(117) int local117 = local98 * local93 + local89 * local107 >> 16;
			@Pc(128) int local128 = local93 * local107 - local98 * local89 >> 16;
			@Pc(141) int local141 = Static171.method2896(super.anInt3934 + local117, Static207.anInt4425, super.anInt3976 + local128);
			@Pc(145) int local145 = local85 / 2;
			@Pc(150) int local150 = -local102 / 2;
			@Pc(161) int local161 = local150 * local93 - local145 * local89 >> 16;
			@Pc(166) int local166 = -local85 / 2;
			@Pc(176) int local176 = local93 * local145 + local150 * local89 >> 16;
			@Pc(188) int local188 = Static171.method2896(local176 + super.anInt3934, Static207.anInt4425, super.anInt3976 + local161);
			@Pc(192) int local192 = local102 / 2;
			@Pc(203) int local203 = local93 * local192 - local166 * local89 >> 16;
			@Pc(207) int local207 = local85 / 2;
			@Pc(211) int local211 = local102 / 2;
			@Pc(222) int local222 = local192 * local89 + local93 * local166 >> 16;
			@Pc(235) int local235 = Static171.method2896(super.anInt3934 + local222, Static207.anInt4425, super.anInt3976 + local203);
			@Pc(245) int local245 = local93 * local207 + local211 * local89 >> 16;
			@Pc(256) int local256 = local93 * local211 - local207 * local89 >> 16;
			@Pc(268) int local268 = Static171.method2896(local245 + super.anInt3934, Static207.anInt4425, super.anInt3976 + local256);
			@Pc(275) int local275 = local141 < local188 ? local141 : local188;
			local65 = local141 + local268;
			@Pc(290) int local290 = local268 > local188 ? local188 : local268;
			if (local235 + local188 < local65) {
				local65 = local235 + local188;
			}
			@Pc(306) int local306 = local235 > local141 ? local141 : local235;
			@Pc(317) int local317 = local235 < local268 ? local235 : local268;
			local59 = (int) (Math.atan2((double) (local275 - local317), (double) local102) * 325.95D) & 0x7FF;
			if (local59 != 0) {
				local54.method1182(local59);
			}
			local67 = (int) (Math.atan2((double) (local306 - local290), (double) local85) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local54.method1180(local67);
			}
			local65 = (local65 >> 1) - super.anInt3943;
			if (local65 != 0) {
				local54.method1171(0, local65, 0);
			}
		}
		@Pc(375) Class6_Sub3 local375 = null;
		if (super.anInt3964 != -1 && super.anInt3977 != -1) {
			@Pc(389) Class1_Sub2_Sub9 local389 = Static18.method345(super.anInt3964);
			local375 = local389.method823(super.anInt3977);
			if (local375 != null) {
				local375.method1171(0, -super.anInt3960, 0);
				if (local389.aBoolean52) {
					if (local59 != 0) {
						local375.method1182(local59);
					}
					if (local67 != 0) {
						local375.method1180(local67);
					}
					if (local65 != 0) {
						local375.method1171(0, local65, 0);
					}
				}
			}
		}
		if (local375 != null) {
			local54 = ((Class6_Sub3_Sub1) local54).method1194(local375);
		}
		if (this.aClass1_Sub2_Sub11_1.anInt1595 == 1) {
			local54.aBoolean76 = true;
		}
		local54.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return super.anInt3962;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2996() {
		return this.aClass1_Sub2_Sub11_1 != null;
	}
}
