import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString163;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	public static int anInt7982;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Lclient!vo;")
	public static Class348 aClass348_98;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!au;")
	public static final Class22 aClass22_53 = new Class22();

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
	public static final int[] anIntArray447 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
	public static boolean aBoolean572 = false;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZIIIII)V")
	public static void method6238(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 ? Static455.aClass4_Sub35_Sub1_1.anInt9930 : Static455.aClass4_Sub35_Sub1_1.anInt9916) != 0 && arg4 != 0 && Static399.anInt7806 < 50 && arg5 != -1) {
			Static256.aClass185Array1[Static399.anInt7806++] = new Class185((byte) (arg0 ? 3 : 2), arg5, arg4, arg2, arg1, 0, arg3, null);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZII)I")
	public static int method6239(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub30 local10 = Static289.method4604(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local10.anIntArray328.length; local31++) {
				if (local10.anIntArray329[local31] == arg2) {
					local29 += local10.anIntArray328[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([Ljava/lang/Object;B[I)V")
	public static void method6240(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static111.method2045(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIII)V")
	public static void method6241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1006) {
			Static471.method6882(Static233.aClass162_5, arg1, arg0);
		} else if (arg2 == 1010) {
			Static471.method6882(Static466.aClass162_10, arg1, arg0);
		} else if (arg2 == 1007) {
			Static471.method6882(Static370.aClass162_7, arg1, arg0);
		} else if (arg2 == 1002) {
			Static471.method6882(Static319.aClass162_6, arg1, arg0);
			return;
		} else if (arg2 == 1012) {
			Static471.method6882(Static440.aClass162_8, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIII)I")
	public static int method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = arg2 & 0xF;
		@Pc(18) int local18 = local11 >= 8 ? arg0 : arg1;
		@Pc(37) int local37 = local11 >= 4 ? (local11 == 12 || local11 == 14 ? arg1 : arg3) : arg0;
		return ((local11 & 0x2) == 0 ? local37 : -local37) + ((local11 & 0x1) == 0 ? local18 : -local18);
	}
}
