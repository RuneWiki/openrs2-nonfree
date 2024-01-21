import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class26_Sub2_Sub2 extends Class26_Sub2 {

	@OriginalMember(owner = "client!n", name = "ac", descriptor = "Lclient!ui;")
	public Class3_Sub3_Sub24 aClass3_Sub3_Sub24_1;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return super.anInt2600;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass3_Sub3_Sub24_1 == null) {
			return;
		}
		@Pc(24) Class3_Sub3_Sub17 local24 = super.anInt2599 != -1 && super.anInt2610 == 0 ? Static11.method254(super.anInt2599) : null;
		@Pc(43) Class3_Sub3_Sub17 local43 = super.anInt2596 == -1 || super.anInt2594 == super.anInt2596 && local24 != null ? null : Static11.method254(super.anInt2596);
		@Pc(54) Class26_Sub6 local54 = this.aClass3_Sub3_Sub24_1.method3060(super.anInt2621, super.anInt2623, local24, local43);
		if (local54 == null) {
			return;
		}
		@Pc(59) int local59 = 0;
		super.anInt2600 = local54.method2995();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass3_Sub3_Sub24_1.aShort20 != 0 && this.aClass3_Sub3_Sub24_1.aShort19 != 0) {
			@Pc(82) int local82 = Class3_Sub3_Sub2_Sub5.anIntArray303[arg0];
			@Pc(86) int local86 = Class3_Sub3_Sub2_Sub5.anIntArray300[arg0];
			@Pc(90) short local90 = this.aClass3_Sub3_Sub24_1.aShort19;
			@Pc(94) short local94 = this.aClass3_Sub3_Sub24_1.aShort20;
			@Pc(99) int local99 = -local94 / 2;
			@Pc(104) int local104 = -local90 / 2;
			@Pc(114) int local114 = local86 * local104 + local82 * local99 >> 16;
			@Pc(125) int local125 = local82 * local104 - local99 * local86 >> 16;
			@Pc(137) int local137 = Static107.method2399(local125 + super.anInt2611, super.anInt2593 + local114, Static137.anInt2795);
			@Pc(141) int local141 = local94 / 2;
			@Pc(146) int local146 = -local90 / 2;
			@Pc(157) int local157 = local146 * local86 + local82 * local141 >> 16;
			@Pc(168) int local168 = local146 * local82 - local141 * local86 >> 16;
			@Pc(173) int local173 = -local94 / 2;
			@Pc(185) int local185 = Static107.method2399(super.anInt2611 + local168, local157 + super.anInt2593, Static137.anInt2795);
			@Pc(189) int local189 = local90 / 2;
			@Pc(200) int local200 = local86 * local189 + local173 * local82 >> 16;
			@Pc(204) int local204 = local94 / 2;
			@Pc(208) int local208 = local90 / 2;
			@Pc(219) int local219 = local189 * local82 - local173 * local86 >> 16;
			@Pc(231) int local231 = Static107.method2399(super.anInt2611 + local219, super.anInt2593 + local200, Static137.anInt2795);
			@Pc(241) int local241 = local86 * local208 + local82 * local204 >> 16;
			@Pc(251) int local251 = local208 * local82 - local86 * local204 >> 16;
			@Pc(262) int local262 = local185 > local137 ? local137 : local185;
			@Pc(276) int local276 = Static107.method2399(super.anInt2611 + local251, super.anInt2593 - -local241, Static137.anInt2795);
			local67 = local137 + local276;
			@Pc(288) int local288 = local276 > local231 ? local231 : local276;
			local59 = (int) (Math.atan2((double) (local262 - local288), (double) local90) * 325.95D) & 0x7FF;
			@Pc(309) int local309 = local276 > local185 ? local185 : local276;
			if (local59 != 0) {
				local54.method2532(local59);
			}
			@Pc(324) int local324 = local137 >= local231 ? local231 : local137;
			if (local185 + local231 < local67) {
				local67 = local185 + local231;
			}
			local65 = (int) (Math.atan2((double) (local324 - local309), (double) local94) * 325.95D) & 0x7FF;
			if (local65 != 0) {
				local54.method2522(local65);
			}
			local67 = (local67 >> 1) - super.anInt2636;
			if (local67 != 0) {
				local54.method2534(0, local67, 0);
			}
		}
		@Pc(372) Class26_Sub6 local372 = null;
		if (super.anInt2608 != -1 && super.anInt2592 != -1) {
			@Pc(386) Class3_Sub3_Sub1 local386 = Static78.method1141(super.anInt2608);
			local372 = local386.method89(super.anInt2592);
			if (local372 != null) {
				local372.method2534(0, -super.anInt2589, 0);
				if (local386.aBoolean8) {
					if (local59 != 0) {
						local372.method2532(local59);
					}
					if (local65 != 0) {
						local372.method2522(local65);
					}
					if (local67 != 0) {
						local372.method2534(0, local67, 0);
					}
				}
			}
		}
		if (local372 != null) {
			local54 = ((Class26_Sub6_Sub1) local54).method2549(local372);
		}
		if (this.aClass3_Sub3_Sub24_1.anInt3954 == 1) {
			local54.aBoolean154 = true;
		}
		local54.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1861() {
		return this.aClass3_Sub3_Sub24_1 != null;
	}
}
