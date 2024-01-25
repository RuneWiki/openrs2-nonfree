import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!un", name = "v", descriptor = "Lclient!gi;")
	public static Class93 aClass93_18;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
	public static final int[] anIntArray578 = new int[100];

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public static int anInt7125 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZIIILclient!mn;I)V")
	public static void method5705(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class171 arg2, @OriginalArg(6) int arg3) {
		Static293.aBoolean366 = false;
		Static378.aClass171_98 = arg2;
		Static312.anInt5619 = arg3;
		Static389.anInt6735 = arg1;
		Static452.anInt951 = 1;
		Static252.anInt4350 = 0;
		Static332.anInt5976 = Static386.aClass2_Sub8_Sub2_6.method3321() / arg0;
		if (Static332.anInt5976 < 1) {
			Static332.anInt5976 = 1;
		}
	}
}
