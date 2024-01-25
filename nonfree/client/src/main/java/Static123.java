import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!wd;")
	public static Class215 aClass215_7;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Lclient!lm;")
	public static Class134 aClass134_117;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_81 = new Class37(2);

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	public static int anInt5165 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method4484() {
		Static142.aClass207_22.method5562();
		Static136.aClass207_21.method5562();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)Lclient!uj;")
	public static Class199 method4486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class33[] local7 = null;
		@Pc(13) Class72 local13 = Static294.method5157(arg3);
		if (local13.anIntArray148 != null) {
			local7 = new Class33[local13.anIntArray148.length];
			for (@Pc(23) int local23 = 0; local23 < local7.length; local23++) {
				@Pc(32) Class96 local32 = Static39.method789(local13.anIntArray148[local23]);
				local7[local23] = new Class33(local32.anInt2225, local32.anInt2230, local32.anInt2232, local32.anInt2231, local32.anInt2226, local32.anInt2234, local32.anInt2227, local32.aBoolean183);
			}
		}
		return new Class199(local13.anInt1708, local7, local13.anInt1707, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!ba;ILclient!ii;IIZ)V")
	public static void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class105 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Interface4 local10 = null;
		if (arg5 == 0) {
			local10 = (Interface4) Static107.method1713(arg1, arg0, arg3);
		}
		if (arg5 == 1) {
			local10 = (Interface4) Static14.method198(arg1, arg0, arg3);
		}
		if (arg5 == 2) {
			local10 = (Interface4) Static183.method3234(arg1, arg0, arg3, jb.class);
		}
		if (arg5 == 3) {
			local10 = (Interface4) Static137.method4969(arg1, arg0, arg3);
		}
		if (local10 == null) {
			return;
		}
		@Pc(63) int local63 = local10.method5452();
		@Pc(67) int local67 = local10.method5449();
		@Pc(73) Class79 local73 = Static129.method2097(local10.method5445());
		if (local73.method1561()) {
			Static219.method4033(arg0, arg3, arg1, local73);
		}
		if (local10.method5451()) {
			local10.method5447(arg4);
		}
		if (arg5 == 0) {
			Static223.method1250(arg1, arg0, arg3);
			if (local73.anInt1881 != 0) {
				arg2.method339(arg0, local73.aBoolean140, local63, local67, !local73.aBoolean145, arg3);
				return;
			}
		} else if (arg5 == 1) {
			Static66.method1209(arg1, arg0, arg3);
		} else if (arg5 == 2) {
			Static15.method255(arg1, arg0, arg3, jb.class);
			if (local73.anInt1881 != 0 && local73.anInt1884 + arg0 < Static43.anInt1151 && Static260.anInt5348 > arg3 + local73.anInt1884 && Static43.anInt1151 > arg0 + local73.anInt1897 && arg3 + local73.anInt1897 < Static260.anInt5348) {
				arg2.method335(arg3, !local73.aBoolean145, local67, arg0, local73.anInt1897, local73.aBoolean140, local73.anInt1884);
				return;
			}
		} else {
			if (arg5 == 3) {
				Static115.method1834(arg1, arg0, arg3);
				if (local73.anInt1881 == 1) {
					arg2.method332(arg3, arg0);
					return;
				}
			}
			return;
		}
	}
}
