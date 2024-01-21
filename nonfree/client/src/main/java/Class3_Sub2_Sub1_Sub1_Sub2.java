import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub2_Sub1_Sub1_Sub2 extends Class3_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ib", name = "lc", descriptor = "Lclient!ve;")
	public Class3_Sub2_Sub16 aClass3_Sub2_Sub16_1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass3_Sub2_Sub16_1 == null) {
			return;
		}
		@Pc(25) Class3_Sub2_Sub2 local25 = super.anInt1738 != -1 && super.anInt1726 == 0 ? Static35.method628(super.anInt1738) : null;
		@Pc(47) Class3_Sub2_Sub2 local47 = super.anInt1719 == -1 || super.anInt1683 == super.anInt1719 && local25 != null ? null : Static35.method628(super.anInt1719);
		@Pc(58) Class3_Sub2_Sub1_Sub2 local58 = this.aClass3_Sub2_Sub16_1.method2741(super.anInt1681, local25, local47, super.anInt1686);
		if (local58 == null) {
			return;
		}
		local58.method1785();
		super.aShort34 = local58.aShort34;
		if (this.aClass3_Sub2_Sub16_1.aShort36 != 0 && this.aClass3_Sub2_Sub16_1.aShort35 != 0) {
			@Pc(82) int local82 = Class3_Sub2_Sub3_Sub4.anIntArray347[arg0];
			@Pc(86) short local86 = this.aClass3_Sub2_Sub16_1.aShort36;
			@Pc(90) short local90 = this.aClass3_Sub2_Sub16_1.aShort35;
			@Pc(94) int local94 = Class3_Sub2_Sub3_Sub4.anIntArray346[arg0];
			@Pc(99) int local99 = -local86 / 2;
			@Pc(104) int local104 = -local90 / 2;
			@Pc(115) int local115 = local94 * local104 - local99 * local82 >> 16;
			@Pc(125) int local125 = local104 * local82 + local94 * local99 >> 16;
			@Pc(130) int local130 = -local90 / 2;
			@Pc(142) int local142 = Static168.method2689(local115 + super.anInt1711, super.anInt1700 + local125, Static99.anInt2422);
			@Pc(146) int local146 = local86 / 2;
			@Pc(157) int local157 = local94 * local130 - local82 * local146 >> 16;
			@Pc(168) int local168 = local130 * local82 + local94 * local146 >> 16;
			@Pc(173) int local173 = -local86 / 2;
			@Pc(185) int local185 = Static168.method2689(local157 + super.anInt1711, local168 + super.anInt1700, Static99.anInt2422);
			@Pc(189) int local189 = local90 / 2;
			@Pc(193) int local193 = local86 / 2;
			@Pc(204) int local204 = local189 * local94 - local82 * local173 >> 16;
			@Pc(208) int local208 = local90 / 2;
			@Pc(218) int local218 = local94 * local173 + local82 * local189 >> 16;
			@Pc(230) int local230 = Static168.method2689(local204 + super.anInt1711, local218 + super.anInt1700, Static99.anInt2422);
			@Pc(240) int local240 = local82 * local208 + local94 * local193 >> 16;
			@Pc(250) int local250 = local94 * local208 - local82 * local193 >> 16;
			@Pc(263) int local263 = Static168.method2689(super.anInt1711 + local250, local240 + super.anInt1700, Static99.anInt2422);
			@Pc(270) int local270 = local263 > local230 ? local230 : local263;
			@Pc(277) int local277 = local185 >= local263 ? local263 : local185;
			@Pc(288) int local288 = local185 <= local142 ? local185 : local142;
			@Pc(299) int local299 = local230 > local142 ? local142 : local230;
			@Pc(312) int local312 = (int) (Math.atan2((double) (local288 - local270), (double) local90) * 320.0D) & 0x7FF;
			local58.method1792(local312);
			@Pc(328) int local328 = (int) (Math.atan2((double) (local299 - local277), (double) local86) * 320.0D) & 0x7FF;
			@Pc(339) int local339 = (local277 + local270 + local288 + local299) / 4;
			local58.method1800(local328);
			local58.method1801(0, local339 - super.anInt1696, 0);
		}
		@Pc(352) Class3_Sub2_Sub1_Sub2 local352 = null;
		if (super.anInt1707 != -1 && super.anInt1687 != -1) {
			local352 = Static155.method2522(super.anInt1707).method933(super.anInt1687);
			if (local352 != null) {
				local352.method1801(0, -super.anInt1717, 0);
			}
		}
		if (local352 != null) {
			local58 = ((Class3_Sub2_Sub1_Sub2_Sub1) local58).method1805(local352);
		}
		if (this.aClass3_Sub2_Sub16_1.anInt3814 == 1) {
			local58.aBoolean110 = true;
		}
		local58.method2685(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1161() {
		return this.aClass3_Sub2_Sub16_1 != null;
	}
}
