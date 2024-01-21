import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class3_Sub1_Sub5_Sub4_Sub1 extends Class3_Sub1_Sub5_Sub4 {

	@OriginalMember(owner = "client!ma", name = "Ec", descriptor = "Lclient!ed;")
	public Class3_Sub1_Sub7 aClass3_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass3_Sub1_Sub7_1 == null) {
			return;
		}
		@Pc(25) Class3_Sub1_Sub15 local25 = super.anInt4323 != -1 && super.anInt4286 == 0 ? Static148.method2368(super.anInt4323) : null;
		@Pc(43) Class3_Sub1_Sub15 local43 = super.anInt4285 == -1 || super.anInt4285 == super.anInt4326 && local25 != null ? null : Static148.method2368(super.anInt4285);
		@Pc(54) Class3_Sub1_Sub5_Sub3 local54 = this.aClass3_Sub1_Sub7_1.method620(local43, super.anInt4304, local25, super.anInt4275);
		if (local54 == null) {
			return;
		}
		local54.method1385();
		super.aShort34 = local54.aShort34;
		if (this.aClass3_Sub1_Sub7_1.aShort2 != 0 && this.aClass3_Sub1_Sub7_1.aShort3 != 0) {
			@Pc(78) int local78 = Class3_Sub1_Sub4_Sub2.anIntArray188[arg0];
			@Pc(82) int local82 = Class3_Sub1_Sub4_Sub2.anIntArray190[arg0];
			@Pc(86) short local86 = this.aClass3_Sub1_Sub7_1.aShort2;
			@Pc(90) short local90 = this.aClass3_Sub1_Sub7_1.aShort3;
			@Pc(95) int local95 = -local86 / 2;
			@Pc(100) int local100 = -local90 / 2;
			@Pc(111) int local111 = local78 * local100 + local82 * local95 >> 16;
			@Pc(122) int local122 = local100 * local82 - local95 * local78 >> 16;
			@Pc(134) int local134 = Static50.method742(Static153.anInt673, local122 + super.anInt4315, local111 + super.anInt4329);
			@Pc(138) int local138 = local86 / 2;
			@Pc(143) int local143 = -local90 / 2;
			@Pc(154) int local154 = local143 * local78 + local138 * local82 >> 16;
			@Pc(165) int local165 = local82 * local143 - local78 * local138 >> 16;
			@Pc(177) int local177 = Static50.method742(Static153.anInt673, local165 + super.anInt4315, super.anInt4329 + local154);
			@Pc(182) int local182 = -local86 / 2;
			@Pc(186) int local186 = local90 / 2;
			@Pc(197) int local197 = local186 * local78 + local182 * local82 >> 16;
			@Pc(201) int local201 = local86 / 2;
			@Pc(212) int local212 = local82 * local186 - local182 * local78 >> 16;
			@Pc(226) int local226 = Static50.method742(Static153.anInt673, super.anInt4315 + local212, super.anInt4329 - -local197);
			@Pc(237) int local237 = local134 < local177 ? local134 : local177;
			@Pc(248) int local248 = local226 > local134 ? local134 : local226;
			@Pc(252) int local252 = local90 / 2;
			@Pc(262) int local262 = local82 * local252 - local201 * local78 >> 16;
			@Pc(272) int local272 = local252 * local78 + local82 * local201 >> 16;
			@Pc(285) int local285 = Static50.method742(Static153.anInt673, local262 + super.anInt4315, super.anInt4329 - -local272);
			@Pc(292) int local292 = local285 <= local226 ? local285 : local226;
			@Pc(306) int local306 = (int) (Math.atan2((double) (local237 - local292), (double) local90) * 320.0D) & 0x7FF;
			local54.method1376(local306);
			@Pc(316) int local316 = local285 > local177 ? local177 : local285;
			@Pc(326) int local326 = (local248 + local316 + local292 + local237) / 4;
			@Pc(339) int local339 = (int) (Math.atan2((double) (local248 - local316), (double) local86) * 320.0D) & 0x7FF;
			local54.method1384(local339);
			local54.method1381(0, local326 - super.anInt4280, 0);
		}
		@Pc(352) Class3_Sub1_Sub5_Sub3 local352 = null;
		if (super.anInt4296 != -1 && super.anInt4313 != -1) {
			local352 = Static194.method3135(super.anInt4296).method1708(super.anInt4313);
			if (local352 != null) {
				local352.method1381(0, -super.anInt4317, 0);
			}
		}
		if (local352 != null) {
			local54 = ((Class3_Sub1_Sub5_Sub3_Sub1) local54).method1390(local352);
		}
		if (this.aClass3_Sub1_Sub7_1.anInt912 == 1) {
			local54.aBoolean75 = true;
		}
		local54.method3054(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3064() {
		return this.aClass3_Sub1_Sub7_1 != null;
	}
}
