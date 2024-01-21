import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
	public static int anInt534;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "Lclient!vd;")
	public static Class83 aClass83_6;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "Lclient!sd;")
	private static Class73 aClass73_305 = Static122.method531("wishes to duel with you)3");

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_303 = aClass73_305;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "Lclient!sd;")
	public static Class73 aClass73_304 = Static122.method531("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
	public static int[] anIntArray49 = new int[2000];

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_306 = Static122.method531("Unexpected server response)3");

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_307 = aClass73_306;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)I")
	public static int method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg2;
			arg2 = local8;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return arg3;
		} else if (local20 == 2) {
			return 7 + 1 - arg1 - arg0;
		} else {
			return 1 + 7 - arg2 - arg3;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public static void method397() {
		aClass73_303 = null;
		aClass83_6 = null;
		aClass73_304 = null;
		aClass73_307 = null;
		aClass73_306 = null;
		Class3_Sub2_Sub4.anIntArray48 = null;
		anIntArray49 = null;
		aClass73_305 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!f;Lclient!sd;ILclient!sd;Lclient!f;)Lclient!hb;")
	public static Class3_Sub1_Sub3_Sub1_Sub1 method398(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(3) Class73 arg2, @OriginalArg(4) Class13 arg3) {
		@Pc(8) int local8 = arg3.method359(arg1);
		@Pc(14) int local14 = arg3.method358(local8, arg2);
		return Static27.method560(local8, local14, arg3, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)Z")
	public static boolean method399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub1_Sub15 local19 = Static151.method2466(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local19.method2195(arg1);
	}
}
