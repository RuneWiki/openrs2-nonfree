import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!baa;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public static int anInt2999 = 0;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILclient!hg;IIII)V")
	public static void method2509(@OriginalArg(2) Class13_Sub1_Sub1_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static5.method102(0, arg2, arg0.aByte127, arg0.anInt10089, arg3, arg0.anInt10090, arg1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public static void method2510() {
		Static472.anInt7535 = 0;
		Static233.anInt3794 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static174.anInt3080; local16++) {
			@Pc(22) int local22 = Static176.anInt3100 * local16;
			for (@Pc(24) int local24 = 0; local24 < Static176.anInt3100; local24++) {
				@Pc(30) int local30 = local22 + local24;
				Static319.anInterface4Array1[local30].method8301(Static281.anInt4510 * local24, Static598.anInt9689 * local16, Static281.anInt4510, Static598.anInt9689, true);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	public static int method2511() {
		if (Static627.aBoolean736) {
			return 6;
		} else if (Static601.aClass2_Sub2_Sub11_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static601.aClass2_Sub2_Sub11_4.anInt4369;
			if (Static514.method7201(local19)) {
				return 1;
			} else if (Static56.method4531(local19)) {
				return 2;
			} else if (Static230.method3178(local19)) {
				return 3;
			} else if (Static62.method916(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
