import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!jb;")
	public static Class25 aClass25_12;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_772 = Static59.method1195("Entfernen");

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array6 = new Class60[200];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
	public static int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_773 = Static59.method1195("Handel)4Duell");

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_774 = Static59.method1195("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_775 = Static59.method1195("overlay_multiway");

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_776 = Static59.method1195("Mem:");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!qf;ILclient!qf;Lclient!jb;)Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 method1137(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(8) int local8 = arg2.method920(arg1);
		@Pc(14) int local14 = arg2.method922(local8, arg0);
		return Static16.method489(local8, arg2, local14);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1138() {
		anIntArray196 = null;
		aClass60_772 = null;
		aClass60_773 = null;
		aClass60_774 = null;
		aClass25_12 = null;
		aClass60_775 = null;
		aClass3_Sub1_Sub2_Sub3Array4 = null;
		aClass60Array6 = null;
		aClass60_776 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public static void method1139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5 local16 = Static34.aClass5ArrayArrayArray1[Static119.anInt3243][arg1][arg0];
		if (local16 == null) {
			Static13.aClass58_1.method1771(Static119.anInt3243, arg1, arg0);
			return;
		}
		@Pc(26) int local26 = -99999999;
		@Pc(28) Class3_Sub1_Sub1_Sub1 local28 = null;
		@Pc(33) Class3_Sub1_Sub1_Sub1 local33;
		for (local33 = (Class3_Sub1_Sub1_Sub1) local16.method92(); local33 != null; local33 = (Class3_Sub1_Sub1_Sub1) local16.method90()) {
			@Pc(39) Class3_Sub1_Sub11 local39 = Static22.method568(local33.anInt122);
			@Pc(42) int local42 = local39.anInt1860;
			if (local39.anInt1878 == 1) {
				local42 *= local33.anInt123 + 1;
			}
			if (local42 > local26) {
				local26 = local42;
				local28 = local33;
			}
		}
		if (local28 == null) {
			Static13.aClass58_1.method1771(Static119.anInt3243, arg1, arg0);
			return;
		}
		local16.method85(local28);
		local33 = (Class3_Sub1_Sub1_Sub1) local16.method92();
		@Pc(90) Class3_Sub1_Sub1_Sub1 local90 = null;
		@Pc(92) Class3_Sub1_Sub1_Sub1 local92 = null;
		while (local33 != null) {
			if (local28.anInt122 != local33.anInt122) {
				if (local92 == null) {
					local92 = local33;
				}
				if (local33.anInt122 != local92.anInt122 && local90 == null) {
					local90 = local33;
				}
			}
			local33 = (Class3_Sub1_Sub1_Sub1) local16.method90();
		}
		@Pc(126) int local126 = (arg0 << 7) + arg1 + 1610612736;
		Static13.aClass58_1.method1773(Static119.anInt3243, arg1, arg0, Static66.method1353(arg1 * 128 + 64, Static119.anInt3243, arg0 * 128 + 64), local28, local126, local92, local90);
	}
}
