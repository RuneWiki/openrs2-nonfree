import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!gea;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public static int anInt4460 = 0;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt4461 = 765;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)I")
	public static int method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg0 > arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V")
	public static void method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) float local14 = (float) Static498.anInt8794 / (float) Static498.anInt8801;
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = arg3;
		if (local14 < 1.0F) {
			local18 = (int) ((float) arg1 * local14);
		} else {
			local16 = (int) ((float) arg3 / local14);
		}
		@Pc(45) int local45 = arg2 - (arg1 - local16) / 2;
		@Pc(53) int local53 = arg0 - (arg3 - local18) / 2;
		Static517.anInt9046 = Static498.anInt8794 - Static498.anInt8794 * local53 / local18;
		Static397.anInt7311 = local45 * Static498.anInt8801 / local16;
		Static157.anInt3118 = -1;
		Static367.anInt6812 = -1;
		Static27.method617();
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	public static void method3703() {
		Static634.method8860(Static299.aClass230_4);
		Static147.anInt2822++;
		if (Static454.aBoolean547 && Static380.aBoolean497) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (Static128.aBoolean202) {
				local24 = Static619.method8679();
				local26 = Static571.method8194();
			}
			@Pc(48) int local48 = Static666.aClass79_1.method3361() + local24;
			@Pc(54) int local54 = local26 + Static666.aClass79_1.method3358();
			local48 -= Static325.anInt6166;
			local54 -= Static260.anInt4561;
			if (local48 < Static174.anInt10838) {
				local48 = Static174.anInt10838;
			}
			if (local54 < Static660.anInt10983) {
				local54 = Static660.anInt10983;
			}
			if (Static299.aClass230_4.anInt6703 + local48 > Static174.anInt10838 - -Static176.aClass230_2.anInt6703) {
				local48 = Static174.anInt10838 + Static176.aClass230_2.anInt6703 - Static299.aClass230_4.anInt6703;
			}
			if (Static176.aClass230_2.anInt6701 + Static660.anInt10983 < Static299.aClass230_4.anInt6701 + local54) {
				local54 = Static176.aClass230_2.anInt6701 + Static660.anInt10983 - Static299.aClass230_4.anInt6701;
			}
			@Pc(116) int local116 = local48 + Static176.aClass230_2.anInt6705 - Static174.anInt10838;
			@Pc(124) int local124 = Static176.aClass230_2.anInt6641 + local54 - Static660.anInt10983;
			@Pc(182) Class14_Sub55 local182;
			if (Static666.aClass79_1.method3360()) {
				if (Static147.anInt2822 > Static299.aClass230_4.anInt6664) {
					@Pc(140) int local140 = local48 - Static647.anInt10816;
					@Pc(145) int local145 = local54 - Static36.anInt977;
					if (local140 > Static299.aClass230_4.anInt6662 || -Static299.aClass230_4.anInt6662 > local140 || Static299.aClass230_4.anInt6662 < local145 || local145 < -Static299.aClass230_4.anInt6662) {
						Static96.aBoolean171 = true;
					}
				}
				if (Static299.aClass230_4.anObjectArray22 != null && Static96.aBoolean171) {
					local182 = new Class14_Sub55();
					local182.anInt10933 = local124;
					local182.aClass230_14 = Static299.aClass230_4;
					local182.anInt10932 = local116;
					local182.anObjectArray33 = Static299.aClass230_4.anObjectArray22;
					Static632.method8830(local182);
					return;
				}
			} else {
				if (Static96.aBoolean171) {
					Static141.method1563();
					if (Static299.aClass230_4.anObjectArray18 != null) {
						local182 = new Class14_Sub55();
						local182.anInt10933 = local124;
						local182.anObjectArray33 = Static299.aClass230_4.anObjectArray18;
						local182.aClass230_13 = Static361.aClass230_7;
						local182.anInt10932 = local116;
						local182.aClass230_14 = Static299.aClass230_4;
						Static632.method8830(local182);
					}
					if (Static361.aClass230_7 != null && Static78.method1480(Static299.aClass230_4) != null) {
						Static419.method6220(Static299.aClass230_4, Static361.aClass230_7);
					}
				} else if ((Static113.anInt2288 == 1 || Static297.method4375()) && Static313.anInt9044 > 2) {
					Static88.method8997(Static260.anInt4561 + Static36.anInt977, Static325.anInt6166 - -Static647.anInt10816);
				} else if (Static89.method1685()) {
					Static88.method8997(Static36.anInt977 + Static260.anInt4561, Static647.anInt10816 + Static325.anInt6166);
				}
				Static299.aClass230_4 = null;
			}
		} else if (Static147.anInt2822 > 1) {
			Static299.aClass230_4 = null;
		}
	}
}
