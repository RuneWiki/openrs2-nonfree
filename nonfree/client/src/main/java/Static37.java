import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "S")
	public static short aShort7 = 32767;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_14 = new Class81(30, -1);

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "[I")
	public static final int[] anIntArray44 = new int[1000];

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_12 = new Class44(50, 0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method710(@OriginalArg(0) Class26 arg0) {
		@Pc(7) int local7 = Static346.anInt6104;
		@Pc(9) int local9 = Static117.anInt2356;
		@Pc(11) int local11 = Static85.anInt3261;
		@Pc(13) int local13 = Static447.anInt4684;
		arg0.method2245(local13, local7, local9, local11, -10660793);
		arg0.method2245(16, local7 + 1, local9 + 1, local11 - 2, -16777216);
		arg0.method2278(local7 + 1, local11 - 2, local9 + 18, -16777216, -19 + local13);
		Static193.aClass56_3.method5848(Static115.aClass256_129.method5720(Static272.anInt7537), local9 + 14, -10660793, local7 + 3, -1);
		@Pc(72) int local72 = Static304.aClass40_1.method1164();
		@Pc(81) int local81 = Static304.aClass40_1.method1159();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class2_Sub26 local88 = (Class2_Sub26) Static288.aClass265_41.method6005(); local88 != null; local88 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			@Pc(103) int local103 = (Static168.anInt3255 - local83 - 1) * 16 + local9 + 31;
			@Pc(105) short local105 = -1;
			if (local7 < local72 && local72 < local7 + local11 && local81 > local103 - 13 && local81 < local103 + 3 && local88.aBoolean379) {
				local105 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static210.method3247(local88.anInt4529)) {
				local138 = Static350.aClass149_2.method3483((int) local88.aLong137).anIntArray47;
			} else if (local88.anInt4530 != -1) {
				local138 = Static350.aClass149_2.method3483(local88.anInt4530).anIntArray47;
			} else if (Static252.method3870(local88.anInt4529)) {
				@Pc(214) Class4_Sub2_Sub2_Sub2 local214 = Static4.aClass4_Sub2_Sub2_Sub2Array1[(int) local88.aLong137];
				if (local214 != null) {
					@Pc(219) Class215 local219 = local214.aClass215_1;
					if (local219.anIntArray400 != null) {
						local219 = local219.method4795(Static215.aClass225_1);
					}
					if (local219 != null) {
						local138 = local219.anIntArray401;
					}
				}
			} else if (Static6.method151(local88.anInt4529)) {
				@Pc(182) Class250 local182;
				if (local88.anInt4529 == 1012) {
					local182 = Static406.aClass150_3.method3508((int) local88.aLong137);
				} else {
					local182 = Static406.aClass150_3.method3508((int) (local88.aLong137 >>> 32 & 0x7FFFFFFFL));
				}
				if (local182.anIntArray479 != null) {
					local182 = local182.method5591(Static215.aClass225_1);
				}
				if (local182 != null) {
					local138 = local182.anIntArray480;
				}
			}
			@Pc(247) String local247 = Static136.method1990(local88);
			if (local138 != null) {
				local247 = local247 + Static237.method3704(local138);
			}
			Static193.aClass56_3.method5849(local7 + 3, local103, Static112.aClass76Array10, local105, Static224.anIntArray303, local247);
			local83++;
			if (local88.aBoolean381) {
				Static226.aClass76_11.method6088(local7 + Static55.aClass210_1.method4758(local247) + 5, local103 - 12);
			}
		}
		Static301.method4366(Static85.anInt3261, Static117.anInt2356, Static447.anInt4684, Static346.anInt6104);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method711() {
		if (Static140.aFrame12 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static373.aFrame2 == null) {
			local13 = Static303.aClass131_4.anApplet1;
		} else {
			local13 = Static373.aFrame2;
		}
		Static203.anInt3944 = local13.getSize().width;
		Static13.anInt316 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static373.aFrame2 == local13) {
			local31 = Static373.aFrame2.getInsets();
			Static203.anInt3944 -= local31.right + local31.left;
			Static13.anInt316 -= local31.bottom + local31.top;
		}
		if (Static405.method5498() == 1) {
			Static216.anInt4171 = Static400.anInt6970;
			Static442.anInt7733 = 0;
			Static96.anInt2175 = Static355.anInt6274;
			Static128.anInt2522 = (Static203.anInt3944 - Static355.anInt6274) / 2;
		} else if (Static43.anInt1146 < 96 && Static281.anInt5126 == 0) {
			@Pc(80) int local80 = Static203.anInt3944 <= 1024 ? Static203.anInt3944 : 1024;
			@Pc(87) int local87 = Static13.anInt316 > 768 ? 768 : Static13.anInt316;
			Static96.anInt2175 = local80;
			Static128.anInt2522 = (Static203.anInt3944 - local80) / 2;
			Static216.anInt4171 = local87;
			Static442.anInt7733 = 0;
		} else {
			Static96.anInt2175 = Static203.anInt3944;
			Static442.anInt7733 = 0;
			Static216.anInt4171 = Static13.anInt316;
			Static128.anInt2522 = 0;
		}
		if (Static293.aClass269_10 != Static343.aClass269_11) {
			@Pc(129) boolean local129;
			if (Static96.anInt2175 < 1024 && Static216.anInt4171 < 768) {
				local129 = true;
			} else {
				local129 = false;
			}
		}
		Static118.aCanvas3.setSize(Static96.anInt2175, Static216.anInt4171);
		if (Static387.aClass26_9 != null) {
			Static387.aClass26_9.method2264(Static118.aCanvas3);
		}
		if (Static373.aFrame2 == local13) {
			local31 = Static373.aFrame2.getInsets();
			Static118.aCanvas3.setLocation(local31.left + Static128.anInt2522, Static442.anInt7733 + local31.top);
		} else {
			Static118.aCanvas3.setLocation(Static128.anInt2522, Static442.anInt7733);
		}
		if (Static108.anInt2264 != -1) {
			Static264.method3971(true);
		}
		Static285.method4204();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLclient!ch;)V")
	public static void method712(@OriginalArg(1) Class2_Sub10 arg0) {
		if (Static176.aClass113ArrayArrayArray3 == null) {
			return;
		}
		@Pc(15) Interface9 local15 = null;
		if (arg0.anInt1375 == 0) {
			local15 = (Interface9) Static334.method4742(arg0.anInt1381, arg0.anInt1383, arg0.anInt1387);
		}
		if (arg0.anInt1375 == 1) {
			local15 = (Interface9) Static242.method3661(arg0.anInt1381, arg0.anInt1383, arg0.anInt1387);
		}
		if (arg0.anInt1375 == 2) {
			local15 = (Interface9) Static80.method1405(arg0.anInt1381, arg0.anInt1383, arg0.anInt1387, np.class);
		}
		if (arg0.anInt1375 == 3) {
			local15 = (Interface9) Static325.method4667(arg0.anInt1381, arg0.anInt1383, arg0.anInt1387);
		}
		if (local15 == null) {
			arg0.anInt1378 = 0;
			arg0.anInt1374 = 0;
			arg0.anInt1373 = -1;
		} else {
			arg0.anInt1373 = local15.method5901();
			arg0.anInt1378 = local15.method5904();
			arg0.anInt1374 = local15.method5902();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "([JB[I)V")
	public static void method713(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static237.method3724(arg0, arg0.length - 1, 0, arg1);
	}
}
