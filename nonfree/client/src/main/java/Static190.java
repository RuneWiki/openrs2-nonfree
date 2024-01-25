import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray86 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "[I")
	public static final int[] anIntArray308 = new int[13];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public static void method2922() {
		if (Static264.aFrame2 != null) {
			return;
		}
		@Pc(13) int local13 = Static281.anInt4923;
		@Pc(15) int local15 = Static272.anInt4785;
		@Pc(22) int local22 = Static493.anInt8493 - Static130.anInt2566 - local13;
		@Pc(30) int local30 = Static38.anInt603 - local15 - Static499.anInt4149;
		if (local13 <= 0 && local22 <= 0 && local15 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static142.aFrame1 != null) {
				local54 = Static142.aFrame1;
			} else if (Static590.anApplet2 == null) {
				local54 = Static170.anApplet_Sub1_1;
			} else {
				local54 = Static590.anApplet2;
			}
			@Pc(66) int local66 = 0;
			@Pc(68) int local68 = 0;
			if (local54 == Static142.aFrame1) {
				@Pc(74) Insets local74 = Static142.aFrame1.getInsets();
				local66 = local74.left;
				local68 = local74.top;
			}
			@Pc(83) Graphics local83 = local54.getGraphics();
			local83.setColor(Color.black);
			if (local13 > 0) {
				local83.fillRect(local66, local68, local13, Static38.anInt603);
			}
			if (local15 > 0) {
				local83.fillRect(local66, local68, Static493.anInt8493, local15);
			}
			if (local22 > 0) {
				local83.fillRect(local66 + Static493.anInt8493 - local22, local68, local22, Static38.anInt603);
			}
			if (local30 > 0) {
				local83.fillRect(local66, Static38.anInt603 + local68 - local30, Static493.anInt8493, local30);
				return;
			}
		} catch (@Pc(133) Exception local133) {
			return;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(18) Class95 local18 = Static518.aClass96_4.method1925(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local18.method1908(arg1);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2926(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static380.method5091(Static566.method7647(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V")
	public static void method2927() {
		if (Static16.aClass134_1.method6954()) {
			Static16.aClass134_1.method6901(Static499.aCanvas9);
			Static135.method2063();
			Static16.aClass134_1.method6946(Static499.aCanvas9);
			Static16.aClass134_1.method6937(Static499.aCanvas9);
		} else {
			Static523.method7235(Static113.anInt2222);
		}
		Static164.method7470();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ)I")
	public static int method2929(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
