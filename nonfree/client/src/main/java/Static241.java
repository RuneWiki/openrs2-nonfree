import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[Lclient!nca;")
	public static final Class217_Sub1[] aClass217_Sub1Array7 = new Class217_Sub1[37];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!cs;B)V")
	public static void method4059(@OriginalArg(0) Class6_Sub2_Sub4 arg0) {
		if (Static71.aBoolean94) {
			return;
		}
		arg0.method9043();
		Static462.anInt8179--;
		if (!arg0.aBoolean120) {
			@Pc(83) long local83 = arg0.aLong41;
			@Pc(89) Class6_Sub2_Sub12 local89;
			for (local89 = (Class6_Sub2_Sub12) Static494.aClass128_39.method3560(local83); local89 != null && !local89.aString58.equals(arg0.aString20); local89 = (Class6_Sub2_Sub12) Static494.aClass128_39.method3553()) {
			}
			if (local89 != null && local89.method4849(arg0)) {
				Static422.method6626(local89);
			}
			return;
		}
		for (@Pc(28) Class6_Sub2_Sub12 local28 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local28 != null; local28 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
			if (local28.aString58.equals(arg0.aString20)) {
				@Pc(38) boolean local38 = false;
				for (@Pc(44) Class6_Sub2_Sub4 local44 = (Class6_Sub2_Sub4) local28.aClass286_6.method7242(); local44 != null; local44 = (Class6_Sub2_Sub4) local28.aClass286_6.method7241()) {
					if (arg0 == local44) {
						if (local28.method4849(arg0)) {
							Static422.method6626(local28);
						}
						local38 = true;
						break;
					}
				}
				if (local38) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ha;Lclient!rca;I)I")
	public static int method4061(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class283 arg1) {
		if (arg1.anInt8358 != -1) {
			return arg1.anInt8358;
		}
		if (arg1.anInt8363 != -1) {
			@Pc(23) Class325 local23 = arg0.anInterface4_12.method895(arg1.anInt8363);
			if (!local23.aBoolean636) {
				return local23.aShort111;
			}
		}
		return arg1.anInt8353;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)Z")
	public static boolean method4063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static365.aBoolean444 || !Static231.aBoolean325) {
			return false;
		} else if (Static113.anInt2246 < 100) {
			return false;
		} else if (Static606.method7456(arg2, arg3, arg1)) {
			@Pc(30) int local30 = arg3 << Static643.anInt10682;
			@Pc(39) int local39 = arg2 << Static643.anInt10682;
			if (Static198.method3517(local39, arg0, Static246.anInt4917, local30, Static246.anInt4917, Static195.aClass199Array1[arg1].method8532(arg3, arg2))) {
				Static2.anInt10++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
