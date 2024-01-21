import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 {

	@OriginalMember(owner = "client!fi", name = "Vb", descriptor = "Lclient!ra;")
	public Class2_Sub1_Sub20 aClass2_Sub1_Sub20_1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub1_Sub20_1 == null) {
			return;
		}
		@Pc(21) Class2_Sub1_Sub25 local21 = super.anInt3062 != -1 && super.anInt3075 == 0 ? Static90.method27(super.anInt3062) : null;
		@Pc(40) Class2_Sub1_Sub25 local40 = super.anInt3096 == -1 || super.anInt3096 == super.anInt3077 && local21 != null ? null : Static90.method27(super.anInt3096);
		@Pc(51) Class7_Sub7 local51 = this.aClass2_Sub1_Sub20_1.method2445(super.anInt3060, local21, super.anInt3066, local40);
		if (local51 == null) {
			return;
		}
		super.anInt3093 = local51.method3148();
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = 0;
		if (this.aClass2_Sub1_Sub20_1.aShort11 != 0 && this.aClass2_Sub1_Sub20_1.aShort12 != 0) {
			@Pc(79) int local79 = Class26.anIntArray76[arg0];
			@Pc(83) int local83 = Class26.anIntArray77[arg0];
			@Pc(87) short local87 = this.aClass2_Sub1_Sub20_1.aShort12;
			@Pc(91) short local91 = this.aClass2_Sub1_Sub20_1.aShort11;
			@Pc(96) int local96 = -local91 / 2;
			@Pc(100) int local100 = local91 / 2;
			@Pc(105) int local105 = -local87 / 2;
			@Pc(110) int local110 = -local87 / 2;
			@Pc(121) int local121 = local110 * local79 - local83 * local100 >> 16;
			@Pc(132) int local132 = local79 * local105 - local83 * local96 >> 16;
			@Pc(142) int local142 = local79 * local96 + local83 * local105 >> 16;
			@Pc(153) int local153 = local110 * local83 + local100 * local79 >> 16;
			@Pc(165) int local165 = Static175.method2548(local132 + super.anInt3085, Static126.anInt2806, local142 + super.anInt3046);
			@Pc(178) int local178 = Static175.method2548(local121 + super.anInt3085, Static126.anInt2806, super.anInt3046 + local153);
			@Pc(183) int local183 = -local91 / 2;
			@Pc(187) int local187 = local87 / 2;
			@Pc(197) int local197 = local79 * local187 - local183 * local83 >> 16;
			@Pc(201) int local201 = local87 / 2;
			@Pc(205) int local205 = local91 / 2;
			@Pc(216) int local216 = local83 * local187 + local79 * local183 >> 16;
			@Pc(228) int local228 = Static175.method2548(local197 + super.anInt3085, Static126.anInt2806, local216 + super.anInt3046);
			@Pc(239) int local239 = local201 * local79 - local205 * local83 >> 16;
			@Pc(250) int local250 = local201 * local83 + local205 * local79 >> 16;
			@Pc(257) int local257 = local165 >= local178 ? local178 : local165;
			@Pc(269) int local269 = Static175.method2548(local239 + super.anInt3085, Static126.anInt2806, local250 + super.anInt3046);
			local64 = local269 + local165;
			@Pc(284) int local284 = local228 < local269 ? local228 : local269;
			local60 = (int) (Math.atan2((double) (local257 - local284), (double) local87) * 325.95D) & 0x7FF;
			if (local60 != 0) {
				local51.method3167(local60);
			}
			@Pc(313) int local313 = local178 < local269 ? local178 : local269;
			@Pc(320) int local320 = local228 <= local165 ? local228 : local165;
			if (local178 + local228 < local64) {
				local64 = local178 + local228;
			}
			local62 = (int) (Math.atan2((double) (local320 - local313), (double) local91) * 325.95D) & 0x7FF;
			if (local62 != 0) {
				local51.method3153(local62);
			}
			local64 = (local64 >> 1) - super.anInt3081;
			if (local64 != 0) {
				local51.method3154(0, local64, 0);
			}
		}
		@Pc(369) Class7_Sub7 local369 = null;
		if (super.anInt3091 != -1 && super.anInt3099 != -1) {
			@Pc(383) Class2_Sub1_Sub23 local383 = Static99.method1597(super.anInt3091);
			local369 = local383.method2759(super.anInt3099);
			if (local369 != null) {
				local369.method3154(0, -super.anInt3079, 0);
				if (local383.aBoolean177) {
					if (local60 != 0) {
						local369.method3167(local60);
					}
					if (local62 != 0) {
						local369.method3153(local62);
					}
					if (local64 != 0) {
						local369.method3154(0, local64, 0);
					}
				}
			}
		}
		if (local369 != null) {
			local51 = ((Class7_Sub7_Sub1) local51).method3169(local369);
		}
		if (this.aClass2_Sub1_Sub20_1.anInt3558 == 1) {
			local51.aBoolean191 = true;
		}
		local51.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2177() {
		return this.aClass2_Sub1_Sub20_1 != null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return super.anInt3093;
	}
}
