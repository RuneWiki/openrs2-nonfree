import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!hg;")
	public static Class99 aClass99_10;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_128 = new Class198("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt7507 = 0;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_194 = new Class129(108, 0);

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_158 = new Class220(9, 0, 4, 1);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[S)[S")
	public static short[] method6027(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static468.method3864(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method6028() {
		Static18.anInt395 = 0;
		Static122.aClass177_13.method3614();
		Static122.aClass177_13.method3615(Static105.aClass5_Sub41_1);
		Static18.anInt395++;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Lclient!ed;")
	public static Class2_Sub5 method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class2_Sub5 local14 = local7.aClass2_Sub5_1;
			local7.aClass2_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method6033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg6 < 0 || arg2 >= Static433.anInt7210 - 1 || arg6 >= Static418.anInt6969 - 1) {
			return;
		}
		if (Static319.aClass258ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) Interface2 local43;
		if (arg5 == 0) {
			local43 = (Interface2) Static73.method1080(arg4, arg2, arg6);
			@Pc(49) Interface2 local49 = (Interface2) Static320.method3947(arg4, arg2, arg6);
			if (local43 != null && arg0 != 2) {
				if (local43 instanceof Class2_Sub4_Sub1) {
					((Class2_Sub4_Sub1) local43).aClass8_2.method153(arg1);
				} else {
					Static16.method270(arg0, local43.method6037(), arg4, arg1, arg6, arg3, arg5, arg2);
				}
			}
			if (local49 != null) {
				if (local49 instanceof Class2_Sub4_Sub1) {
					((Class2_Sub4_Sub1) local49).aClass8_2.method153(arg1);
					return;
				}
				Static16.method270(arg0, local49.method6037(), arg4, arg1, arg6, arg3, arg5, arg2);
				return;
			}
			return;
		}
		if (arg5 != 1) {
			if (arg5 == 2) {
				local43 = (Interface2) Static12.method194(arg4, arg2, arg6, bs.class);
				if (local43 != null) {
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local43 instanceof Class2_Sub1_Sub6) {
						((Class2_Sub1_Sub6) local43).aClass8_4.method153(arg1);
						return;
					}
					Static16.method270(arg0, local43.method6037(), arg4, arg1, arg6, arg3, arg5, arg2);
					return;
				}
			} else if (arg5 == 3) {
				local43 = (Interface2) Static285.method3519(arg4, arg2, arg6);
				if (local43 == null) {
					return;
				}
				if (local43 instanceof Class2_Sub3_Sub2) {
					((Class2_Sub3_Sub2) local43).aClass8_3.method153(arg1);
					return;
				}
				Static16.method270(arg0, local43.method6037(), arg4, arg1, arg6, arg3, arg5, arg2);
			} else {
				return;
			}
			return;
		}
		local43 = (Interface2) Static173.method2392(arg4, arg2, arg6);
		if (local43 == null) {
			return;
		}
		if (!(local43 instanceof Class2_Sub2_Sub1)) {
			@Pc(209) int local209 = local43.method6037();
			if (arg0 != 4 && arg0 != 5) {
				if (arg0 != 6) {
					if (arg0 == 7) {
						Static16.method270(4, local209, arg4, arg1, arg6, (arg3 + 2 & 0x3) + 4, arg5, arg2);
					} else if (arg0 == 8) {
						Static16.method270(4, local209, arg4, arg1, arg6, arg3 + 4, arg5, arg2);
						Static16.method270(4, local209, arg4, arg1, arg6, (arg3 + 2 & 0x3) + 4, arg5, arg2);
						return;
					}
					return;
				}
				Static16.method270(4, local209, arg4, arg1, arg6, arg3 + 4, arg5, arg2);
				return;
			}
			Static16.method270(4, local209, arg4, arg1, arg6, arg3, arg5, arg2);
			return;
		}
		((Class2_Sub2_Sub1) local43).aClass8_1.method153(arg1);
		return;
	}
}
