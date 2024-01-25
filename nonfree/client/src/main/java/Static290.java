import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
	public static int anInt5894;

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "Lclient!un;")
	public static final Class4_Sub40 aClass4_Sub40_1 = new Class4_Sub40(0, 0);

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
	public static int anInt5893 = 104;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method4960(@OriginalArg(1) Class120 arg0) {
		@Pc(13) Class212 local13 = null;
		try {
			@Pc(17) Class51 local17 = arg0.method3231();
			while (local17.anInt1229 == 0) {
				Static270.method5481(1L);
			}
			if (local17.anInt1229 == 1) {
				local13 = (Class212) local17.anObject1;
				@Pc(39) Class4_Sub7 local39 = Static113.method5419();
				local13.method5530(0, local39.anInt2667, local39.aByteArray42);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local13 != null) {
				local13.method5533();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!jp;ILclient!go;Lclient!fd;ILjava/lang/String;ILclient!wm;IBI)V")
	public static void method4961(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) Class72 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class78 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		if (Static303.anInt3065 == 4) {
			local16 = (int) Static138.aFloat35 & 0x3FFF;
		} else {
			local16 = Static222.anInt4620 + (int) Static138.aFloat35 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg4.anInt1829 / 2, arg4.anInt1806 / 2) + 10;
		@Pc(46) int local46 = arg9 * arg9 + arg0 * arg0;
		if (local37 * local37 < local46) {
			return;
		}
		@Pc(60) int local60 = Class4_Sub4_Sub25.anIntArray384[local16];
		@Pc(64) int local64 = Class4_Sub4_Sub25.anIntArray383[local16];
		if (Static303.anInt3065 != 4) {
			local64 = local64 * 256 / (Static48.anInt1082 + 256);
			local60 = local60 * 256 / (Static48.anInt1082 + 256);
		}
		@Pc(95) int local95 = local60 * arg0 + local64 * arg9 >> 15;
		@Pc(106) int local106 = arg0 * local64 - arg9 * local60 >> 15;
		@Pc(113) int local113 = arg1.method2882(100, null, arg6);
		@Pc(119) int local119 = local95 - local113 / 2;
		@Pc(127) int local127 = arg1.method2874(null, arg6);
		if (local119 >= -arg4.anInt1829 && arg4.anInt1829 >= local119 && -arg4.anInt1806 <= local106 && arg4.anInt1806 >= local106) {
			arg8.method4068(local113, arg5, 0, null, arg4.anInt1829 / 2 + local119 + arg2, 0, arg6, arg5 + arg4.anInt1806 / 2 - local127 - local106 - arg10, 50, arg2, null, arg3, 0, 1, arg7);
		}
	}
}
