import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
	public static int anInt6986;

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "Lclient!qs;")
	public static Class211 aClass211_79;

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_183 = new Class158("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[S")
	public static short[] aShortArray128 = new short[256];

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	public static int anInt6965 = 0;

	@OriginalMember(owner = "client!td", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray660 = new int[32];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIII)V")
	public static void method5306(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static93.aFrame2 != null && (arg1 != 3 || arg4 != Static12.aClass34_Sub1_1.anInt7158 || Static12.aClass34_Sub1_1.anInt7164 != arg2)) {
			Static7.method82(Static93.aFrame2, Static150.aClass183_3);
			Static93.aFrame2 = null;
		}
		if (arg1 == 3 && Static93.aFrame2 == null) {
			Static93.aFrame2 = Static181.method3049(Static150.aClass183_3, arg2, 0, arg4);
			if (Static93.aFrame2 != null) {
				Static12.aClass34_Sub1_1.anInt7158 = arg4;
				Static12.aClass34_Sub1_1.anInt7164 = arg2;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
			}
		}
		if (arg1 == 3 && Static93.aFrame2 == null) {
			method5306(true, Static12.aClass34_Sub1_1.anInt7174, -1, arg3, -1);
			return;
		}
		@Pc(95) Container local95;
		@Pc(70) Insets local70;
		if (Static93.aFrame2 != null) {
			local95 = Static93.aFrame2;
			Static270.anInt5255 = arg2;
			Static134.anInt2979 = arg4;
		} else if (Static416.aFrame3 == null) {
			local95 = Static150.aClass183_3.anApplet1;
			Static134.anInt2979 = local95.getSize().width;
			Static270.anInt5255 = local95.getSize().height;
		} else {
			local70 = Static416.aFrame3.getInsets();
			@Pc(76) int local76 = -local70.left;
			Static134.anInt2979 = Static416.aFrame3.getSize().width + local76 - local70.right;
			@Pc(91) int local91 = local70.top + local70.bottom;
			Static270.anInt5255 = Static416.aFrame3.getSize().height - local91;
			local95 = Static416.aFrame3;
		}
		@Pc(147) int local147;
		if (arg1 == 1) {
			Static299.anInt1304 = 0;
			Static342.anInt6292 = Static190.anInt3989;
			Static8.anInt96 = (Static134.anInt2979 - Static431.anInt7617) / 2;
			Static152.anInt3234 = Static431.anInt7617;
		} else if (Static155.anInt3339 < 96 && Static262.anInt2805 == 0) {
			local147 = Static134.anInt2979 > 1024 ? 1024 : Static134.anInt2979;
			@Pc(154) int local154 = Static270.anInt5255 <= 768 ? Static270.anInt5255 : 768;
			Static8.anInt96 = (Static134.anInt2979 - local147) / 2;
			Static152.anInt3234 = local147;
			Static299.anInt1304 = 0;
			Static342.anInt6292 = local154;
		} else {
			Static8.anInt96 = 0;
			Static299.anInt1304 = 0;
			Static152.anInt3234 = Static134.anInt2979;
			Static342.anInt6292 = Static270.anInt5255;
		}
		if (Static314.aClass248_7 != Static59.aClass248_1) {
			@Pc(198) boolean local198;
			if (Static152.anInt3234 < 1024 && Static342.anInt6292 < 768) {
				local198 = true;
			} else {
				local198 = false;
			}
		}
		if (arg0) {
			Static175.method2964();
		} else {
			Static443.aCanvas33.setSize(Static152.anInt3234, Static342.anInt6292);
			Static30.aClass106_3.method5934(Static443.aCanvas33);
			if (local95 == Static416.aFrame3) {
				local70 = Static416.aFrame3.getInsets();
				Static443.aCanvas33.setLocation(local70.left + Static8.anInt96, Static299.anInt1304 + local70.top);
			} else {
				Static443.aCanvas33.setLocation(Static8.anInt96, Static299.anInt1304);
			}
		}
		if (arg1 < 2) {
			Static62.aBoolean107 = false;
		} else {
			Static62.aBoolean107 = true;
		}
		if (Static456.anInt1594 != -1) {
			Static191.method3101(true);
		}
		if (Static388.aClass236_13 != null && Static100.method1714(Static170.anInt3494)) {
			Static318.method4541();
		}
		for (local147 = 0; local147 < 100; local147++) {
			Static58.aBooleanArray8[local147] = true;
		}
		Static274.aBoolean331 = true;
	}
}
