import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
	public static final int[] anIntArray408 = new int[13];

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_70 = new Class2(27, -1);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3511(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static243.method3292("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "()V")
	public static void method3517() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static150.aClass223ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static150.aClass223ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static264.anInt4480; local6++) {
					for (local9 = 0; local9 < Static295.anInt4910; local9++) {
						if (Static150.aClass223ArrayArrayArray3[local3][local6][local9] != null) {
							Static150.aClass223ArrayArrayArray3[local3][local6][local9].method4543();
						}
						Static150.aClass223ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static150.aClass223ArrayArrayArray3 = null;
		Static149.aClass165Array7 = null;
		if (Static142.aClass223ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static142.aClass223ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static264.anInt4480; local6++) {
					for (local9 = 0; local9 < Static295.anInt4910; local9++) {
						if (Static142.aClass223ArrayArrayArray2[local3][local6][local9] != null) {
							Static142.aClass223ArrayArrayArray2[local3][local6][local9].method4543();
						}
						Static142.aClass223ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static142.aClass223ArrayArrayArray2 = null;
		Static28.aClass165Array1 = null;
		Static19.aClass223ArrayArrayArray1 = null;
		Static244.aClass165Array8 = null;
		Static36.anInt641 = 0;
		if (Static124.aClass260Array1 != null) {
			for (local3 = 0; local3 < Static36.anInt641; local3++) {
				Static124.aClass260Array1[local3] = null;
			}
		}
		if (Static49.aClass26_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static135.anInt5022; local3++) {
				Static49.aClass26_Sub2Array1[local3] = null;
			}
			Static135.anInt5022 = 0;
		}
		if (Static302.aClass74Array1 != null) {
			for (local3 = 0; local3 < Static270.anInt4582; local3++) {
				Static302.aClass74Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static315.anInt5183; local6++) {
				for (local9 = 0; local9 < Static264.anInt4480; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static295.anInt4910; local160++) {
						Static194.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static270.anInt4582 = 0;
		}
		Static440.anIntArrayArrayArray14 = null;
		Static82.method1435();
		Static256.aClass169_6.method3594();
		Static46.aByteArrayArray3 = null;
		Static268.anIntArrayArray39 = null;
		Static373.aShortArrayArray6 = null;
		Static223.aClass92_1 = null;
		Static16.aClass33_10 = null;
		Static268.aClass51_8 = null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V")
	public static void method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static57.anInt967; local3++) {
			@Pc(9) Rectangle local9 = Class7_Sub4_Sub2_Sub1.aRectangleArray1[local3];
			if (arg2 < local9.width + local9.x && local9.x < arg2 + arg1 && arg3 < local9.height + local9.y && arg3 + arg0 > local9.y) {
				Static308.aBooleanArray28[local3] = true;
			}
		}
	}
}
