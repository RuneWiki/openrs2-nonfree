import java.awt.Container;
import java.awt.Image;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
	public static final int[] anIntArray298 = new int[3];

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[250][];

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public static int anInt3394 = 1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
	public static boolean method2703(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIZII)V")
	public static void method2706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static300.aFrame4 != null && (arg4 != 3 || Static2.aClass148_Sub1_1.anInt3779 != arg1 || arg3 != Static2.aClass148_Sub1_1.anInt3777)) {
			Static128.method1909(Static300.aFrame4, Static79.aClass183_2);
			Static300.aFrame4 = null;
		}
		if (arg4 == 3 && Static300.aFrame4 == null) {
			Static300.aFrame4 = Static419.method5308(arg1, arg3, 0, Static79.aClass183_2);
			if (Static300.aFrame4 != null) {
				Static2.aClass148_Sub1_1.anInt3777 = arg3;
				Static2.aClass148_Sub1_1.anInt3779 = arg1;
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
			}
		}
		if (arg4 == 3 && Static300.aFrame4 == null) {
			method2706(arg0, -1, true, -1, Static2.aClass148_Sub1_1.anInt3787);
			return;
		}
		@Pc(87) Container local87;
		@Pc(100) Insets local100;
		if (Static300.aFrame4 != null) {
			Static324.anInt5540 = arg3;
			Static155.anInt2673 = arg1;
			local87 = Static300.aFrame4;
		} else if (Static261.aFrame3 == null) {
			local87 = Static79.aClass183_2.anApplet1;
			Static155.anInt2673 = local87.getSize().width;
			Static324.anInt5540 = local87.getSize().height;
		} else {
			local100 = Static261.aFrame3.getInsets();
			Static155.anInt2673 = Static261.aFrame3.getSize().width - local100.right - local100.left;
			@Pc(118) int local118 = -local100.bottom;
			Static324.anInt5540 = Static261.aFrame3.getSize().height + local118 - local100.top;
			local87 = Static261.aFrame3;
		}
		@Pc(165) int local165;
		if (arg4 == 1) {
			Static314.anInt5426 = Static18.anInt3419;
			Static141.anInt2513 = Static90.anInt1755;
			Static7.anInt125 = (Static155.anInt2673 - Static90.anInt1755) / 2;
			Static287.anInt4720 = 0;
		} else if (Static177.anInt3052 < 96 && Static288.anInt4743 == 0) {
			local165 = Static155.anInt2673 > 1024 ? 1024 : Static155.anInt2673;
			Static7.anInt125 = (Static155.anInt2673 - local165) / 2;
			@Pc(180) int local180 = Static324.anInt5540 <= 768 ? Static324.anInt5540 : 768;
			Static141.anInt2513 = local165;
			Static287.anInt4720 = 0;
			Static314.anInt5426 = local180;
		} else {
			Static141.anInt2513 = Static155.anInt2673;
			Static7.anInt125 = 0;
			Static287.anInt4720 = 0;
			Static314.anInt5426 = Static324.anInt5540;
		}
		if (Static260.aClass258_7 != Static60.aClass258_1) {
			@Pc(210) boolean local210;
			if (Static141.anInt2513 < 1024 && Static314.anInt5426 < 768) {
				local210 = true;
			} else {
				local210 = false;
			}
		}
		if (arg2) {
			Static105.method1619();
		} else {
			Static286.aCanvas4.setSize(Static141.anInt2513, Static314.anInt5426);
			Static82.aClass163_1.method5519(Static286.aCanvas4);
			if (local87 == Static261.aFrame3) {
				local100 = Static261.aFrame3.getInsets();
				Static286.aCanvas4.setLocation(Static7.anInt125 + local100.left, Static287.anInt4720 + local100.top);
			} else {
				Static286.aCanvas4.setLocation(Static7.anInt125, Static287.anInt4720);
			}
		}
		if (arg4 >= 2) {
			Static136.aBoolean159 = true;
		} else {
			Static136.aBoolean159 = false;
		}
		if (Static142.anInt2523 != -1) {
			Static129.method1930(true);
		}
		if (Static375.aClass160_3 != null && Static343.method4586(Static290.anInt4777)) {
			Static226.method2970();
		}
		for (local165 = 0; local165 < 100; local165++) {
			Static101.aBooleanArray9[local165] = true;
		}
		Static307.aBoolean391 = true;
	}
}
