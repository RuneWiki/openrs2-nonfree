import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "[I")
	public static final int[] anIntArray212 = new int[2];

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_71 = new Class173(66, -1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
	public static int method3775(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3776(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static444.method6843(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static493.anInt8959; local25++) {
			@Pc(33) String local33 = Static220.aStringArray22[local25];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static444.method6843(local33);
			if (local33 != null && local33.equals(local20)) {
				Static493.anInt8959--;
				for (@Pc(57) int local57 = local25; local57 < Static493.anInt8959; local57++) {
					Static220.aStringArray22[local57] = Static220.aStringArray22[local57 + 1];
					Static274.aStringArray34[local57] = Static274.aStringArray34[local57 + 1];
					Static471.anIntArray476[local57] = Static471.anIntArray476[local57 + 1];
					Static241.aStringArray25[local57] = Static241.aStringArray25[local57 + 1];
					Static344.anIntArray342[local57] = Static344.anIntArray342[local57 + 1];
					Static374.aBooleanArray23[local57] = Static374.aBooleanArray23[local57 + 1];
				}
				Static341.anInt6623 = Static436.anInt8161;
				@Pc(122) Class4_Sub14 local122 = Static196.method3380(Static17.aClass159_1, Static499.aClass173_49);
				local122.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0));
				local122.aClass4_Sub11_Sub1_3.method4945(arg0);
				Static353.method5712(local122);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3777(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(39) int local39 = arg0.indexOf(" ", "directlogin ".length());
			if (local39 >= 0) {
				@Pc(47) int local47 = arg0.length();
				arg0 = arg0.substring(0, local39) + " ";
				for (@Pc(63) int local63 = local39 + 1; local63 < local47; local63++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
