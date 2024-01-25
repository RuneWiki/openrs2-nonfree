import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt959;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
	public static boolean aBoolean89 = true;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "[Lclient!hea;")
	public static final Class4_Sub6_Sub8[] aClass4_Sub6_Sub8Array1 = new Class4_Sub6_Sub8[14];

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZII)Lclient!sh;")
	public static Class4_Sub45 method829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub45 local7 = new Class4_Sub45();
		local7.anInt9095 = arg0;
		local7.anInt9096 = arg3;
		Static569.aClass221_27.method5073(local7, (long) arg1);
		Static150.method2578(arg3);
		@Pc(26) Class155 local26 = Static558.method7916(arg1);
		if (local26 != null) {
			Static368.method5060(local26);
		}
		if (Static238.aClass155_6 != null) {
			Static368.method5060(Static238.aClass155_6);
			Static238.aClass155_6 = null;
		}
		Static569.method5999();
		if (local26 != null) {
			Static162.method2682(!arg2, local26);
		}
		if (!arg2) {
			Static471.method6880(arg3);
		}
		if (!arg2 && Static446.anInt8493 != -1) {
			Static396.method6077(1, Static446.anInt8493);
		}
		return local7;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method830(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static577.anInt10405; local11++) {
			if (arg0.equalsIgnoreCase(Static377.aStringArray29[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static147.aStringArray11[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!uea;B)Z")
	public static boolean method832(@OriginalArg(0) Class326 arg0) {
		return arg0 == Static252.aClass326_4 || arg0 == Static492.aClass326_8 || arg0 == Static173.aClass326_3 || arg0 == Static287.aClass326_5;
	}
}
