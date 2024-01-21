import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public static int anInt1900;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_512 = Static60.method1113("::fpson");

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_513 = Static60.method1113("null");

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "J")
	public static long aLong57 = 0L;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[S")
	public static short[] aShortArray19 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1174() {
		aShortArray19 = null;
		aClass22_512 = null;
		aClass22_513 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lclient!ec;IIB)Lclient!ec;")
	public static Class22 method1175(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[local9 + arg2] == null) {
				arg0[arg2 + local9] = Static22.aClass22_878;
			}
			local7 += arg0[local9 + arg2].anInt668;
		}
		@Pc(39) byte[] local39 = new byte[local7];
		@Pc(50) int local50 = 0;
		@Pc(61) Class22 local61;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			local61 = arg0[arg2 + local52];
			Static139.method952(local61.aByteArray7, 0, local39, local50, local61.anInt668);
			local50 += local61.anInt668;
		}
		local61 = new Class22();
		local61.anInt668 = local7;
		local61.aByteArray7 = local39;
		return local61;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static24.method396(arg2)) {
			Static80.aClass4_Sub7Array2 = null;
			Static104.method1723(arg5, arg3, Static65.aClass4_Sub7ArrayArray1[arg2], -1, arg1, arg7, arg4, arg0, arg6);
			if (Static80.aClass4_Sub7Array2 != null) {
				Static104.method1723(arg5, arg3, Static80.aClass4_Sub7Array2, -1412584499, Static56.anInt1532, anInt1900, arg4, arg0, arg6);
				Static80.aClass4_Sub7Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static122.aBooleanArray7[local19] = true;
			}
		} else {
			Static122.aBooleanArray7[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!f;I)Z")
	public static boolean method1177(@OriginalArg(0) Class4_Sub7 arg0) {
		if (arg0.anIntArray85 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray85.length; local12++) {
			@Pc(24) int local24 = Static132.method2032(arg0, local12);
			@Pc(29) int local29 = arg0.anIntArray86[local12];
			if (arg0.anIntArray85[local12] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray85[local12] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray85[local12] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
