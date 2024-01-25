import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!dp;")
	public static Class53 aClass53_155;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public static int anInt6198 = -1;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_107 = new Class70(64);

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString299 = " from your friend list first.";

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Ljava/lang/String;")
	public static final String aString300 = "wave2:";

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray217 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "[I")
	public static final int[] anIntArray705 = new int[13];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIZI)V")
	public static void method5612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg4) {
			Static250.method422();
		}
		if (Static90.aFrame1 != null && (arg0 != 3 || arg2 != Static285.anInt5393 || arg3 != Static91.anInt2907)) {
			Static167.method3290(Static90.aFrame1, Static308.aClass206_5);
			Static90.aFrame1 = null;
		}
		if (arg0 == 3 && Static90.aFrame1 == null) {
			Static90.aFrame1 = Static293.method5023(Static308.aClass206_5, arg2, 0, arg3);
			if (Static90.aFrame1 != null) {
				Static285.anInt5393 = arg2;
				Static91.anInt2907 = arg3;
				Static71.method1264(Static308.aClass206_5);
			}
		}
		if (arg0 == 3 && Static90.aFrame1 == null) {
			method5612(Static182.anInt3432, arg1, -1, -1, true);
			return;
		}
		@Pc(74) Container local74;
		@Pc(87) Insets local87;
		if (Static90.aFrame1 != null) {
			local74 = Static90.aFrame1;
			Static99.anInt6127 = arg3;
			Static92.anInt1689 = arg2;
		} else if (Static95.aFrame2 == null) {
			local74 = Static308.aClass206_5.anApplet1;
			Static92.anInt1689 = local74.getSize().width;
			Static99.anInt6127 = local74.getSize().height;
		} else {
			local87 = Static95.aFrame2.getInsets();
			@Pc(95) int local95 = local87.right + local87.left;
			Static92.anInt1689 = Static95.aFrame2.getSize().width - local95;
			Static99.anInt6127 = Static95.aFrame2.getSize().height - local87.bottom - local87.top;
			local74 = Static95.aFrame2;
		}
		@Pc(137) int local137;
		if (arg0 == 1) {
			Static94.anInt1731 = 503;
			Static271.anInt5038 = (Static92.anInt1689 - 765) / 2;
			Static57.anInt1098 = 0;
			Static209.anInt3815 = 765;
		} else if (Static183.anInt3439 < 96 && Static13.anInt232 == 0) {
			local137 = Static92.anInt1689 <= 1024 ? Static92.anInt1689 : 1024;
			Static271.anInt5038 = (Static92.anInt1689 - local137) / 2;
			@Pc(151) int local151 = Static99.anInt6127 > 768 ? 768 : Static99.anInt6127;
			Static209.anInt3815 = local137;
			Static94.anInt1731 = local151;
			Static57.anInt1098 = 0;
		} else {
			Static271.anInt5038 = 0;
			Static209.anInt3815 = Static92.anInt1689;
			Static94.anInt1731 = Static99.anInt6127;
			Static57.anInt1098 = 0;
		}
		if (Static189.anInt3601 != 0) {
			@Pc(190) boolean local190;
			if (Static209.anInt3815 < 1024 && Static94.anInt1731 < 768) {
				local190 = true;
			} else {
				local190 = false;
			}
		}
		if (arg4) {
			Static334.method5541(Static13.anInt232);
		} else {
			Static354.aCanvas5.setSize(Static209.anInt3815, Static94.anInt1731);
			if (Static289.aClass81_7 != null) {
				Static289.aClass81_7.method2965();
			}
			if (Static95.aFrame2 == local74) {
				local87 = Static95.aFrame2.getInsets();
				Static354.aCanvas5.setLocation(Static271.anInt5038 + local87.left, Static57.anInt1098 + local87.top);
			} else {
				Static354.aCanvas5.setLocation(Static271.anInt5038, Static57.anInt1098);
			}
		}
		if (arg0 >= 2) {
			Static291.aBoolean378 = true;
		} else {
			Static291.aBoolean378 = false;
		}
		if (Static62.anInt1131 != -1) {
			Static222.method3938(true);
		}
		if (Static216.aClass11_5 != null && (Static129.anInt2374 == 30 || Static129.anInt2374 == 25)) {
			Static166.method3283();
		}
		for (local137 = 0; local137 < 100; local137++) {
			Static103.aBooleanArray18[local137] = true;
		}
		Static308.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method5614() {
		for (@Pc(3) int local3 = 0; local3 < Static265.aByteArrayArrayArray11.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static265.aByteArrayArrayArray11[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static265.aByteArrayArrayArray11[0][0].length; local11++) {
					Static265.aByteArrayArrayArray11[local3][local7][local11] = 0;
				}
			}
		}
	}
}
