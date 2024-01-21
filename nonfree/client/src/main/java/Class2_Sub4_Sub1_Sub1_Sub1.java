import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub4_Sub1_Sub1_Sub1 extends Class2_Sub4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "ad", descriptor = "Lclient!cg;")
	public Class2_Sub4_Sub4 aClass2_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub4_Sub4_1 == null) {
			return;
		}
		@Pc(25) Class2_Sub4_Sub2 local25 = super.anInt1653 != -1 && super.anInt1641 == 0 ? Static49.method926(super.anInt1653) : null;
		@Pc(44) Class2_Sub4_Sub2 local44 = super.anInt1606 == -1 || super.anInt1608 == super.anInt1606 && local25 != null ? null : Static49.method926(super.anInt1606);
		@Pc(55) Class2_Sub4_Sub1_Sub3 local55 = this.aClass2_Sub4_Sub4_1.method589(local25, super.anInt1597, super.anInt1614, local44);
		if (local55 == null) {
			return;
		}
		local55.method1193();
		super.aShort36 = local55.aShort36;
		if (this.aClass2_Sub4_Sub4_1.aShort6 != 0 && this.aClass2_Sub4_Sub4_1.aShort5 != 0) {
			@Pc(82) int local82 = Class2_Sub4_Sub3_Sub1.anIntArray58[arg0];
			@Pc(86) short local86 = this.aClass2_Sub4_Sub4_1.aShort6;
			@Pc(90) int local90 = Class2_Sub4_Sub3_Sub1.anIntArray60[arg0];
			@Pc(95) int local95 = -local86 / 2;
			@Pc(99) short local99 = this.aClass2_Sub4_Sub4_1.aShort5;
			@Pc(104) int local104 = -local99 / 2;
			@Pc(115) int local115 = local104 * local90 - local82 * local95 >> 16;
			@Pc(125) int local125 = local104 * local82 + local90 * local95 >> 16;
			@Pc(137) int local137 = Static103.method1808(Static103.anInt2568, super.anInt1633 + local125, local115 + super.anInt1635);
			@Pc(141) int local141 = local86 / 2;
			@Pc(146) int local146 = -local99 / 2;
			@Pc(157) int local157 = local82 * local146 + local141 * local90 >> 16;
			@Pc(168) int local168 = local90 * local146 - local141 * local82 >> 16;
			@Pc(180) int local180 = Static103.method1808(Static103.anInt2568, local157 + super.anInt1633, super.anInt1635 + local168);
			@Pc(185) int local185 = -local86 / 2;
			@Pc(189) int local189 = local99 / 2;
			@Pc(200) int local200 = local189 * local90 - local82 * local185 >> 16;
			@Pc(210) int local210 = local189 * local82 + local185 * local90 >> 16;
			@Pc(223) int local223 = Static103.method1808(Static103.anInt2568, super.anInt1633 + local210, local200 + super.anInt1635);
			@Pc(227) int local227 = local86 / 2;
			@Pc(231) int local231 = local99 / 2;
			@Pc(242) int local242 = local231 * local90 - local82 * local227 >> 16;
			@Pc(252) int local252 = local231 * local82 + local90 * local227 >> 16;
			@Pc(264) int local264 = Static103.method1808(Static103.anInt2568, local252 + super.anInt1633, local242 + super.anInt1635);
			@Pc(275) int local275 = local180 <= local137 ? local180 : local137;
			@Pc(282) int local282 = local223 < local264 ? local223 : local264;
			@Pc(289) int local289 = local137 < local223 ? local137 : local223;
			@Pc(303) int local303 = (int) (Math.atan2((double) (local275 - local282), (double) local99) * 320.0D) & 0x7FF;
			@Pc(314) int local314 = local180 >= local264 ? local264 : local180;
			@Pc(324) int local324 = (local289 + local282 + local275 + local314) / 4;
			local55.method1191(local303);
			@Pc(341) int local341 = (int) (Math.atan2((double) (local289 - local314), (double) local86) * 320.0D) & 0x7FF;
			local55.method1199(local341);
			local55.method1200(0, local324 - super.anInt1634, 0);
		}
		@Pc(354) Class2_Sub4_Sub1_Sub3 local354 = null;
		if (super.anInt1627 != -1 && super.anInt1611 != -1) {
			local354 = Static19.method611(super.anInt1627).method892(super.anInt1611);
			if (local354 != null) {
				local354.method1200(0, -super.anInt1613, 0);
			}
		}
		if (local354 != null) {
			local55 = ((Class2_Sub4_Sub1_Sub3_Sub1) local55).method1210(local354);
		}
		if (this.aClass2_Sub4_Sub4_1.anInt854 == 1) {
			local55.aBoolean90 = true;
		}
		local55.method2856(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1093() {
		return this.aClass2_Sub4_Sub4_1 != null;
	}
}
