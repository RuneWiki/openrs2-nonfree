import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "J")
	public static long aLong67 = -1L;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
	public static final int[] anIntArray181 = new int[13];

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	public static int anInt1950 = 20;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!sk;ILclient!sk;)V")
	public static void method1827(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg1.aClass5_Sub1_61 != null) {
			arg1.method5970();
		}
		arg1.aClass5_Sub1_62 = arg0.aClass5_Sub1_62;
		arg1.aClass5_Sub1_61 = arg0;
		arg1.aClass5_Sub1_61.aClass5_Sub1_62 = arg1;
		arg1.aClass5_Sub1_62.aClass5_Sub1_61 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ij;Lclient!ij;)I")
	public static int method1828(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class93 arg1) {
		@Pc(13) int local13 = 0;
		if (arg0.method2414(Static199.anInt3969)) {
			local13++;
		}
		if (arg0.method2414(Static276.anInt5762)) {
			local13++;
		}
		if (arg0.method2414(Static222.anInt4384)) {
			local13++;
		}
		if (arg1.method2414(Static199.anInt3969)) {
			local13++;
		}
		if (arg1.method2414(Static276.anInt5762)) {
			local13++;
		}
		if (arg1.method2414(Static222.anInt4384)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method1832() {
		if (Static76.anInt1458 < 0) {
			return;
		}
		@Pc(16) long local16 = Static340.method5863();
		Static76.anInt1458 = (int) ((long) Static76.anInt1458 + Static303.aLong199 - local16);
		if (Static76.anInt1458 > 0) {
			@Pc(36) int local36 = (Static76.anInt1458 << 8) / Static273.anInt5337;
			@Pc(41) int local41 = 255 - local36;
			@Pc(46) float local46 = (float) local36 / 255.0F;
			Static49.anInt4961 = (local41 * (Static42.aClass65_4.anInt1481 & 0xFF00FF) + local36 * (Static93.anInt1795 & 0xFF00FF) & 0xFF00FF00) + ((Static93.anInt1795 & 0xFF00) * local36 + (local41 * (Static42.aClass65_4.anInt1481 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(84) float local84 = 1.0F - local46;
			Static233.anInt4655 = (local36 * (Static215.anInt4245 & 0xFF00FF) + (Static42.aClass65_4.anInt1479 & 0xFF00FF) * local41 & 0xFF00FF00) + ((Static42.aClass65_4.anInt1479 & 0xFF00) * local41 + local36 * (Static215.anInt4245 & 0xFF00) & 0xFF0000) >>> 8;
			Static133.aFloat17 = Static54.aFloat9 + (Static42.aClass65_4.aFloat12 - Static54.aFloat9) * local84;
			Static6.aFloat2 = Static245.aFloat60 + local84 * (Static42.aClass65_4.aFloat15 - Static245.aFloat60);
			Static113.anInt2095 = Static42.aClass65_4.anInt1484 * local41 + local36 * Static63.anInt5182 >> 8;
			Static5.aFloat1 = Static158.aFloat62 + local84 * (Static42.aClass65_4.aFloat11 - Static158.aFloat62);
			Static234.aFloat57 = (Static42.aClass65_4.aFloat13 - Static240.aFloat58) * local84 + Static240.aFloat58;
			Static316.aFloat59 = Static177.aFloat33 + local84 * (Static42.aClass65_4.aFloat10 - Static177.aFloat33);
			Static144.aFloat22 = (Static42.aClass65_4.aFloat14 - Static109.aFloat16) * local84 + Static109.aFloat16;
			if (Static342.aClass54_4 != Static42.aClass65_4.aClass54_1) {
				Static88.aClass54_2 = Static291.aClass55_11.method5225(Static342.aClass54_4, Static42.aClass65_4.aClass54_1, local84, Static88.aClass54_2);
			}
		} else {
			Static233.anInt4655 = Static42.aClass65_4.anInt1479;
			Static6.aFloat2 = Static42.aClass65_4.aFloat15;
			Static234.aFloat57 = Static42.aClass65_4.aFloat13;
			Static113.anInt2095 = Static42.aClass65_4.anInt1484;
			Static49.anInt4961 = Static42.aClass65_4.anInt1481;
			Static316.aFloat59 = Static42.aClass65_4.aFloat10;
			Static144.aFloat22 = Static42.aClass65_4.aFloat14;
			Static76.anInt1458 = -1;
			Static133.aFloat17 = Static42.aClass65_4.aFloat12;
			Static5.aFloat1 = Static42.aClass65_4.aFloat11;
			Static88.aClass54_2 = Static42.aClass65_4.aClass54_1;
		}
		Static303.aLong199 = local16;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method1834(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static79.aBoolean103) {
			Static79.aBoolean103 = arg0;
			Static181.method3301();
		}
	}
}
