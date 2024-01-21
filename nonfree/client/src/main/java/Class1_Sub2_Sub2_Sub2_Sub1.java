import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub2_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2_Sub2 {

	@OriginalMember(owner = "client!bh", name = "Kc", descriptor = "Lclient!tc;")
	public Class1_Sub2_Sub19 aClass1_Sub2_Sub19_1;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1882() {
		return this.aClass1_Sub2_Sub19_1 != null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub2_Sub19_1 == null) {
			return;
		}
		@Pc(25) Class1_Sub2_Sub8 local25 = super.anInt2553 != -1 && super.anInt2585 == 0 ? Static142.method2538(super.anInt2553) : null;
		@Pc(44) Class1_Sub2_Sub8 local44 = super.anInt2593 == -1 || super.anInt2584 == super.anInt2593 && local25 != null ? null : Static142.method2538(super.anInt2593);
		@Pc(55) Class1_Sub2_Sub2_Sub5 local55 = this.aClass1_Sub2_Sub19_1.method2794(super.anInt2590, local44, local25, super.anInt2549);
		if (local55 == null) {
			return;
		}
		local55.method2714();
		super.aShort27 = local55.aShort27;
		if (this.aClass1_Sub2_Sub19_1.aShort36 != 0 && this.aClass1_Sub2_Sub19_1.aShort35 != 0) {
			@Pc(76) int local76 = Class1_Sub2_Sub1_Sub2.anIntArray41[arg0];
			@Pc(80) short local80 = this.aClass1_Sub2_Sub19_1.aShort36;
			@Pc(84) int local84 = Class1_Sub2_Sub1_Sub2.anIntArray38[arg0];
			@Pc(89) int local89 = -local80 / 2;
			@Pc(93) short local93 = this.aClass1_Sub2_Sub19_1.aShort35;
			@Pc(98) int local98 = -local93 / 2;
			@Pc(109) int local109 = local98 * local84 - local76 * local89 >> 16;
			@Pc(119) int local119 = local84 * local89 + local76 * local98 >> 16;
			@Pc(131) int local131 = Static66.method1449(Static156.anInt3696, local109 + super.anInt2606, local119 + super.anInt2596);
			@Pc(135) int local135 = local80 / 2;
			@Pc(140) int local140 = -local93 / 2;
			@Pc(151) int local151 = local76 * local140 + local135 * local84 >> 16;
			@Pc(162) int local162 = local84 * local140 - local76 * local135 >> 16;
			@Pc(167) int local167 = -local80 / 2;
			@Pc(179) int local179 = Static66.method1449(Static156.anInt3696, local162 + super.anInt2606, local151 + super.anInt2596);
			@Pc(183) int local183 = local93 / 2;
			@Pc(194) int local194 = local183 * local76 + local84 * local167 >> 16;
			@Pc(205) int local205 = local183 * local84 - local76 * local167 >> 16;
			@Pc(218) int local218 = Static66.method1449(Static156.anInt3696, super.anInt2606 + local205, super.anInt2596 - -local194);
			@Pc(222) int local222 = local80 / 2;
			@Pc(226) int local226 = local93 / 2;
			@Pc(236) int local236 = local84 * local222 + local76 * local226 >> 16;
			@Pc(246) int local246 = local84 * local226 - local76 * local222 >> 16;
			@Pc(257) int local257 = local179 > local131 ? local131 : local179;
			@Pc(270) int local270 = Static66.method1449(Static156.anInt3696, super.anInt2606 + local246, local236 + super.anInt2596);
			@Pc(277) int local277 = local179 >= local270 ? local270 : local179;
			@Pc(284) int local284 = local131 < local218 ? local131 : local218;
			@Pc(295) int local295 = local218 >= local270 ? local270 : local218;
			@Pc(309) int local309 = (int) (Math.atan2((double) (local257 - local295), (double) local93) * 320.0D) & 0x7FF;
			@Pc(319) int local319 = (local277 + local295 + local257 + local284) / 4;
			local55.method2716(local309);
			@Pc(336) int local336 = (int) (Math.atan2((double) (local284 - local277), (double) local80) * 320.0D) & 0x7FF;
			local55.method2724(local336);
			local55.method2715(0, local319 - super.anInt2564, 0);
		}
		@Pc(350) Class1_Sub2_Sub2_Sub5 local350 = null;
		if (super.anInt2603 != -1 && super.anInt2598 != -1) {
			local350 = Static42.method1121(super.anInt2603).method530(super.anInt2598);
			if (local350 != null) {
				local350.method2715(0, -super.anInt2569, 0);
			}
		}
		if (local350 != null) {
			local55 = ((Class1_Sub2_Sub2_Sub5_Sub1) local55).method2731(local350);
		}
		if (this.aClass1_Sub2_Sub19_1.anInt3836 == 1) {
			local55.aBoolean287 = true;
		}
		local55.method2704(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
