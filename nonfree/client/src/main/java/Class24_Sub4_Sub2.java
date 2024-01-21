import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class24_Sub4_Sub2 extends Class24_Sub4 {

	@OriginalMember(owner = "client!rd", name = "Qb", descriptor = "Lclient!qf;")
	public Class2_Sub2_Sub24 aClass2_Sub2_Sub24_1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub2_Sub24_1 == null) {
			return;
		}
		@Pc(25) Class2_Sub2_Sub16 local25 = super.anInt3336 != -1 && super.anInt3297 == 0 ? Static213.method3229(super.anInt3336) : null;
		@Pc(43) Class2_Sub2_Sub16 local43 = super.anInt3310 == -1 || super.anInt3310 == super.anInt3290 && local25 != null ? null : Static213.method3229(super.anInt3310);
		@Pc(54) Class24_Sub3 local54 = this.aClass2_Sub2_Sub24_1.method2451(super.anInt3313, local43, super.anInt3322, local25);
		if (local54 == null) {
			return;
		}
		@Pc(59) int local59 = 0;
		super.anInt3307 = local54.method2978();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass2_Sub2_Sub24_1.aShort3 != 0 && this.aClass2_Sub2_Sub24_1.aShort4 != 0) {
			@Pc(82) int local82 = Class16.anIntArray39[arg0];
			@Pc(86) int local86 = Class16.anIntArray44[arg0];
			@Pc(90) short local90 = this.aClass2_Sub2_Sub24_1.aShort3;
			@Pc(94) short local94 = this.aClass2_Sub2_Sub24_1.aShort4;
			@Pc(99) int local99 = -local94 / 2;
			@Pc(104) int local104 = -local90 / 2;
			@Pc(114) int local114 = local99 * local86 + local104 * local82 >> 16;
			@Pc(118) int local118 = local90 / 2;
			@Pc(123) int local123 = -local94 / 2;
			@Pc(133) int local133 = local82 * local118 + local123 * local86 >> 16;
			@Pc(144) int local144 = local99 * local82 - local104 * local86 >> 16;
			@Pc(156) int local156 = Static177.method2711(local114 + super.anInt3316, Static43.anInt1126, local144 + super.anInt3349);
			@Pc(167) int local167 = local82 * local123 - local86 * local118 >> 16;
			@Pc(180) int local180 = Static177.method2711(super.anInt3316 + local133, Static43.anInt1126, local167 + super.anInt3349);
			@Pc(185) int local185 = -local90 / 2;
			@Pc(189) int local189 = local94 / 2;
			@Pc(199) int local199 = local185 * local82 + local189 * local86 >> 16;
			@Pc(209) int local209 = local82 * local189 - local185 * local86 >> 16;
			@Pc(221) int local221 = Static177.method2711(local199 + super.anInt3316, Static43.anInt1126, local209 + super.anInt3349);
			@Pc(225) int local225 = local94 / 2;
			@Pc(229) int local229 = local90 / 2;
			@Pc(239) int local239 = local229 * local82 + local86 * local225 >> 16;
			@Pc(250) int local250 = local82 * local225 - local229 * local86 >> 16;
			@Pc(263) int local263 = Static177.method2711(super.anInt3316 + local239, Static43.anInt1126, super.anInt3349 + local250);
			local65 = local263 + local156;
			@Pc(274) int local274 = local180 <= local156 ? local180 : local156;
			if (local221 + local180 < local65) {
				local65 = local180 + local221;
			}
			@Pc(290) int local290 = local180 >= local263 ? local263 : local180;
			@Pc(297) int local297 = local221 < local263 ? local221 : local263;
			@Pc(308) int local308 = local221 <= local156 ? local221 : local156;
			local59 = (int) (Math.atan2((double) (local274 - local297), (double) local94) * 325.95D) & 0x7FF;
			if (local59 != 0) {
				local54.method2736(local59);
			}
			local67 = (int) (Math.atan2((double) (local308 - local290), (double) local90) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local54.method2733(local67);
			}
			local65 = (local65 >> 1) - super.anInt3303;
			if (local65 != 0) {
				local54.method2728(0, local65, 0);
			}
		}
		@Pc(366) Class24_Sub3 local366 = null;
		if (super.anInt3311 != -1 && super.anInt3343 != -1) {
			@Pc(380) Class2_Sub2_Sub8 local380 = Static158.method2448(super.anInt3311);
			local366 = local380.method955(super.anInt3343);
			if (local366 != null) {
				local366.method2728(0, -super.anInt3296, 0);
				if (local380.aBoolean71) {
					if (local59 != 0) {
						local366.method2736(local59);
					}
					if (local67 != 0) {
						local366.method2733(local67);
					}
					if (local65 != 0) {
						local366.method2728(0, local65, 0);
					}
				}
			}
		}
		if (local366 != null) {
			local54 = ((Class24_Sub3_Sub1) local54).method2742(local366);
		}
		if (this.aClass2_Sub2_Sub24_1.anInt3188 == 1) {
			local54.aBoolean170 = true;
		}
		local54.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return super.anInt3307;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2521() {
		return this.aClass2_Sub2_Sub24_1 != null;
	}
}
