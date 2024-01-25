import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
	public static int anInt2918;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public static int anInt2916 = 0;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Lclient!lt;")
	public static final Class213 aClass213_3 = new Class213();

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "[I")
	public static final int[] anIntArray175 = new int[500];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2369(@OriginalArg(1) String arg0) {
		Static375.method5567("", arg0, 0, "", 0, "");
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([IZ[I)V")
	public static void method2370(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static150.aByteArrayArrayArray21 = null;
			Static374.anIntArray455 = null;
			Static315.anIntArray600 = null;
			return;
		}
		Static315.anIntArray600 = arg1;
		Static374.anIntArray455 = new int[arg1.length];
		Static150.aByteArrayArrayArray21 = new byte[arg1.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static315.anIntArray600.length; local32++) {
			Static150.aByteArrayArrayArray21[local32] = new byte[arg0[local32]][];
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBII)V")
	public static void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 <= arg1) {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static582.anIntArrayArray69[local18][arg2] = arg0;
			}
		} else {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static582.anIntArrayArray69[local18][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	public static void method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static451.method310(local7.aClass6_Sub1_Sub2_1);
			if (local7.aClass6_Sub1_Sub2_1 != null) {
				local7.aClass6_Sub1_Sub2_1 = null;
			}
		}
	}
}
