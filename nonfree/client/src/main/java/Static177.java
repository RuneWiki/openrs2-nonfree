import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lclient!s;")
	public static Class84[] aClass84Array2;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_55 = new Class156(118, -2);

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	public static final int[] anIntArray154 = new int[500];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)Z")
	public static boolean method3094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method3097() {
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0 && Static324.anInt5529 != Static8.anInt112) {
			Static372.method5546(Static549.anInt8709, false, 12, Static228.anInt3937);
		} else {
			Static401.method5844(Static273.aClass100_6);
			if (Static6.anInt74 != Static324.anInt5529) {
				Static635.method8807();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public static int method3100() {
		return Static181.anInt3401 == 1 ? Static166.anInt3251 : Static144.anInt2845;
	}
}
