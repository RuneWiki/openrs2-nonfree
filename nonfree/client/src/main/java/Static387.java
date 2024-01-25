import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_52 = new Class171(32);

	@OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
	public static int anInt6504 = 13156520;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Z")
	public static boolean method5124(@OriginalArg(1) int arg0) {
		if (arg0 == 60 || arg0 == 46 || arg0 == 5 || arg0 == 11 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)Z")
	public static boolean method5126() {
		@Pc(8) Class2_Sub22 local8 = (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262;
		if (local8 == null || local8 == Static248.aClass14_35.aClass2_17) {
			return false;
		} else {
			if (local8.anInt3716 >= 2000) {
				local8.anInt3716 -= 2000;
			}
			return local8.anInt3716 == 1003;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
	public static boolean method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static386.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static318.anInt6744) {
			return false;
		} else if (local7 == Static318.anInt6744) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static307.anInt5425;
			@Pc(26) int local26 = arg2 << Static307.anInt5425;
			if (Static389.method5165(local22 + 1, Static58.aClass64Array1[arg0].l(arg1, arg2), local26 + 1) && Static389.method5165(local22 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg2), local26 + 1) && Static389.method5165(local22 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg2 + 1), local26 + Static8.anInt242 - 1) && Static389.method5165(local22 + 1, Static58.aClass64Array1[arg0].l(arg1, arg2 + 1), local26 + Static8.anInt242 - 1) && Static389.method5165(local22 + Static414.anInt6898, Static58.aClass64Array1[arg0].l(arg1, arg2), local26 + 1) && Static389.method5165(local22 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg2), local26 + Static414.anInt6898) && Static389.method5165(local22 + Static414.anInt6898, Static58.aClass64Array1[arg0].l(arg1, arg2 + 1), local26 + Static8.anInt242 - 1) && Static389.method5165(local22 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1, arg2), local26 + Static414.anInt6898) && Static389.method5165(local22 + Static414.anInt6898, Static58.aClass64Array1[arg0].l(arg1, arg2), local26 + Static414.anInt6898)) {
				Static386.anIntArrayArrayArray12[arg0][arg1][arg2] = Static318.anInt6744;
				return true;
			} else {
				Static386.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static318.anInt6744;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
	public static void method5128() {
		Static335.anIntArray72 = null;
		Static58.anIntArray87 = null;
		Static400.anIntArray638 = null;
		Static14.anIntArray33 = null;
		Static405.aBoolean457 = false;
		Static192.anIntArray326 = null;
	}
}
