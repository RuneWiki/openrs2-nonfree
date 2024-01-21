import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt3975 = -1;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1153 = Static81.method1507("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1154 = Static81.method1507("Connecting to update server");

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1155 = aClass24_1154;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class19 method3050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass19_1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static63.anInt1608 && Static63.anInt1595 >= arg0 && Static63.anInt1608 <= arg5 && Static63.anInt1595 >= arg5 && Static63.anInt1608 <= arg7 && arg7 <= Static63.anInt1595 && arg8 >= Static63.anInt1608 && arg8 <= Static63.anInt1595 && arg1 >= Static13.anInt308 && arg1 <= Static52.anInt1338 && Static13.anInt308 <= arg6 && Static52.anInt1338 >= arg6 && Static13.anInt308 <= arg4 && Static52.anInt1338 >= arg4 && arg3 >= Static13.anInt308 && arg3 <= Static52.anInt1338) {
			Static20.method436(arg3, arg0, arg4, arg6, arg1, arg7, arg2, arg8, arg5);
		} else {
			Static211.method3558(arg7, arg6, arg3, arg8, arg0, arg4, arg2, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!dj;I)Lclient!dj;")
	public static Class24 method3053(@OriginalArg(0) Class24 arg0) {
		@Pc(3) Class1_Sub6 local3 = Static111.method1911(arg0);
		return local3 == null ? Static210.aClass24_1318 : local3.aClass24_216;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg2 + arg3;
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(18) int local18 = arg2 + arg5;
		@Pc(23) int local23 = arg4 - arg2;
		for (@Pc(30) int local30 = arg5; local30 < local18; local30++) {
			Static39.method731(Static98.anIntArrayArray16[local30], arg3, arg4, arg0);
		}
		for (@Pc(50) int local50 = arg1; local50 > local10; local50--) {
			Static39.method731(Static98.anIntArrayArray16[local50], arg3, arg4, arg0);
		}
		for (@Pc(70) int local70 = local18; local70 <= local10; local70++) {
			@Pc(76) int[] local76 = Static98.anIntArrayArray16[local70];
			Static39.method731(local76, arg3, local5, arg0);
			Static39.method731(local76, local23, arg4, arg0);
		}
	}
}
