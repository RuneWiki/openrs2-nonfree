import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public static int anInt1194;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
	public static int anInt1196 = 1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lclient!dj;")
	public static Class36 method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass36_1 == null ? null : local7.aClass36_1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	public static void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static293.anInt5272; local16++) {
			if (arg2 < Static233.anIntArray365[local16] + Static294.anIntArray467[local16] && arg2 + arg1 > Static294.anIntArray467[local16] && Static46.anIntArray57[local16] + Static217.anIntArray342[local16] > arg0 && Static217.anIntArray342[local16] < arg3 + arg0) {
				Static116.aBooleanArray8[local16] = true;
			}
		}
	}
}
