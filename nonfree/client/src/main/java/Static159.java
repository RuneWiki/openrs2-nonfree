import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!ij;")
	public static Class93 aClass93_62;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public static int anInt3128 = -1;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_73 = new Class85(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!jr", name = "mb", descriptor = "I")
	public static int anInt3164 = 0;

	@OriginalMember(owner = "client!jr", name = "ub", descriptor = "I")
	public static int anInt3171 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public static void method2821() {
		Static176.aClass109_40.method2858();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class201 local8 = Static297.method5150(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray33 != null) {
			@Pc(18) Class5_Sub17 local18 = new Class5_Sub17();
			local18.anInt1848 = arg1;
			local18.aString9 = arg3;
			local18.aClass201_3 = local8;
			local18.anObjectArray1 = local8.anObjectArray33;
			Static108.method1907(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6555 > 0) {
			local35 = method2828(local8);
		}
		if (!local35 || !Static45.method707(local8).method5750(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static125.aClass5_Sub12_Sub2_3.method5125(241);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 2) {
			Static125.aClass5_Sub12_Sub2_3.method5125(156);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 3) {
			Static125.aClass5_Sub12_Sub2_3.method5125(203);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 4) {
			Static125.aClass5_Sub12_Sub2_3.method5125(46);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 5) {
			Static125.aClass5_Sub12_Sub2_3.method5125(106);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 6) {
			Static125.aClass5_Sub12_Sub2_3.method5125(74);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 7) {
			Static125.aClass5_Sub12_Sub2_3.method5125(123);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 8) {
			Static125.aClass5_Sub12_Sub2_3.method5125(150);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 9) {
			Static125.aClass5_Sub12_Sub2_3.method5125(94);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
		if (arg1 == 10) {
			Static125.aClass5_Sub12_Sub2_3.method5125(212);
			Static345.method5916(arg0, arg2, local8.anInt6509);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!vg;)Z")
	private static boolean method2828(@OriginalArg(1) Class201 arg0) {
		if (arg0.anInt6555 == 205) {
			Static77.anInt1470 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(B)V")
	public static void method2835() {
		if (Static186.aClass55_8 != null) {
			Static186.aClass55_8.method5168();
			Static186.aClass55_8 = null;
			Static136.aClass18_2 = null;
		}
	}
}
