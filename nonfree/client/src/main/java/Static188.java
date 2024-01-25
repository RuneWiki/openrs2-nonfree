import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	public static int anInt3739;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "Lclient!gp;")
	public static Class75 aClass75_6;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
	public static final int[] anIntArray276 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lclient!re;")
	public static final Class25_Sub1_Sub1_Sub2[] aClass25_Sub1_Sub1_Sub2Array1 = new Class25_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method3459(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static221.aBoolean323) {
			try {
				@Pc(26) Class77 local26 = (Class77) Class.forName("Class77_Sub1").getDeclaredConstructor().newInstance();
				local26.method2183(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static221.aBoolean323 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method3461(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class5_Sub27 local8 = (Class5_Sub27) Static82.aClass211_6.method5608(); local8 != null; local8 = (Class5_Sub27) Static82.aClass211_6.method5603()) {
			if (local8.aClass5_Sub17_Sub1_1 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(local8.aClass5_Sub17_Sub1_1);
				local8.aClass5_Sub17_Sub1_1 = null;
			}
			if (local8.aClass5_Sub17_Sub1_2 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(local8.aClass5_Sub17_Sub1_2);
				local8.aClass5_Sub17_Sub1_2 = null;
			}
			local8.method5803();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(50) Class5_Sub27 local50 = (Class5_Sub27) Static16.aClass211_1.method5608(); local50 != null; local50 = (Class5_Sub27) Static16.aClass211_1.method5603()) {
			if (local50.aClass5_Sub17_Sub1_1 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(local50.aClass5_Sub17_Sub1_1);
				local50.aClass5_Sub17_Sub1_1 = null;
			}
			local50.method5803();
		}
		for (@Pc(78) Class5_Sub27 local78 = (Class5_Sub27) Static331.aClass42_55.method1060(); local78 != null; local78 = (Class5_Sub27) Static331.aClass42_55.method1055()) {
			if (local78.aClass5_Sub17_Sub1_1 != null) {
				Static5.aClass5_Sub17_Sub3_1.method3544(local78.aClass5_Sub17_Sub1_1);
				local78.aClass5_Sub17_Sub1_1 = null;
			}
			local78.method5803();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!jf;IIIII)V")
	public static void method3462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2.anInt2933 == 2) {
			@Pc(23) int local23 = 99999;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < arg2.anInt2900; local29++) {
				for (@Pc(33) int local33 = 0; local33 < arg2.anInt2901; local33++) {
					@Pc(44) int local44 = local33 * (arg2.anInt2890 + 32) + arg3;
					@Pc(54) int local54 = arg0 + (arg2.anInt2875 + 32) * local29;
					if (local27 < 20) {
						local44 += arg2.anIntArray184[local27];
						local54 += arg2.anIntArray190[local27];
					}
					if (arg2.anIntArray191[local27] > 0 && (arg5 < local44 + 32 && local44 < arg4 && local54 + 32 > arg6 && arg1 > local54 || arg2 == Static47.aClass96_2 && Static28.anInt774 == local27)) {
						if (local25 < local27) {
							local25 = local27;
						}
						if (local23 > local27) {
							local23 = local27;
						}
					}
					local27++;
				}
			}
			Static54.method1180(local23, Static15.aClass59_1, local25, arg2);
		} else if (arg2.anInt2933 == 5 && arg2.anInt2969 != -1) {
			Static156.method2909(arg2, Static15.aClass59_1);
		}
	}
}
