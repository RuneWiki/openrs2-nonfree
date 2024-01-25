import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	public static int anInt4905;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!lq;")
	public static Class202 aClass202_3;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_34 = new Class344(46, -1);

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_5 = new Class162("", 10);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III[ILclient!nh;I)Lclient!jg;")
	public static Class67_Sub3 method3765(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class7_Sub1 arg4) {
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (!arg4.method5660(Static129.aClass161_5, Static424.aClass273_12)) {
			@Pc(24) int[] local24 = new int[arg1 * arg2];
			for (local26 = 0; local26 < arg1; local26++) {
				local36 = local26 * arg2 + arg0[local26];
				for (local38 = 0; local38 < arg3[local26]; local38++) {
					local24[local36++] = -16777216;
				}
			}
			return new Class67_Sub3(arg4, arg2, arg1, local24);
		}
		@Pc(68) byte[] local68 = new byte[arg2 * arg1];
		for (local26 = 0; local26 < arg1; local26++) {
			local36 = local26 * arg2 + arg0[local26];
			for (local38 = 0; local38 < arg3[local26]; local38++) {
				local68[local36++] = -1;
			}
		}
		return new Class67_Sub3(arg4, arg2, arg1, local68);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method3766(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static315.anInt6311 == 2) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[0]);
				Static574.aClass180Array1[1].method4450(Static112.aClass203Array1[1]);
			} else if (Static315.anInt6311 == 3) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[0]);
				Static574.aClass180Array1[1].method4450(Static112.aClass203Array1[1]);
				Static574.aClass180Array1[2].method4450(Static112.aClass203Array1[2]);
			} else {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[0]);
				Static574.aClass180Array1[1].method4450(Static112.aClass203Array1[1]);
				Static574.aClass180Array1[2].method4450(Static112.aClass203Array1[2]);
				Static574.aClass180Array1[3].method4450(Static112.aClass203Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static315.anInt6311 == 2) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[2]);
			} else if (Static315.anInt6311 == 3) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[3]);
				Static574.aClass180Array1[1].method4450(Static112.aClass203Array1[4]);
			} else {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[4]);
				Static574.aClass180Array1[1].method4450(Static112.aClass203Array1[5]);
				Static574.aClass180Array1[2].method4450(Static112.aClass203Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static315.anInt6311 == 2) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[3]);
				return;
			}
			if (Static315.anInt6311 == 3) {
				Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[5]);
				return;
			}
			Static574.aClass180Array1[0].method4450(Static112.aClass203Array1[7]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!is;)I")
	public static int method3767(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		if (!Static70.method1542(arg1).method6326(arg0) && arg1.anObjectArray28 == null) {
			return -1;
		} else if (arg1.anIntArray230 == null || arg0 >= arg1.anIntArray230.length) {
			return -1;
		} else {
			return arg1.anIntArray230[arg0];
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lclient!vj;II)V")
	public static void method3768(@OriginalArg(0) Class21_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class21_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10557;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10557 < local27 + (local29 & 0x1)) {
				@Pc(44) Class21_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method3768(arg0, arg1, local10 - 1);
		method3768(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Z")
	public static boolean method3769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static117.aBoolean207) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static535.aClass155ArrayArray2[local18] == null || Static535.aClass155ArrayArray2[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class155 local40 = Static535.aClass155ArrayArray2[local18][local22];
		@Pc(54) Class4_Sub36 local54;
		if (arg0 == -1 && local40.anInt4796 == 0) {
			for (local54 = (Class4_Sub36) Static593.aClass22_65.method895(); local54 != null; local54 = (Class4_Sub36) Static593.aClass22_65.method889()) {
				if (local54.anInt7137 == 10 || local54.anInt7137 == 1009 || local54.anInt7137 == 23 || local54.anInt7137 == 13 || local54.anInt7137 == 44) {
					for (@Pc(85) Class155 local85 = Static558.method7916(local54.anInt7143); local85 != null; local85 = Static510.method5509(local85)) {
						if (local85.anInt4793 == local40.anInt4793) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class4_Sub36) Static593.aClass22_65.method895(); local54 != null; local54 = (Class4_Sub36) Static593.aClass22_65.method889()) {
				if (arg0 == local54.anInt7135 && local54.anInt7143 == local40.anInt4793 && (local54.anInt7137 == 10 || local54.anInt7137 == 1009 || local54.anInt7137 == 23 || local54.anInt7137 == 13 || local54.anInt7137 == 44)) {
					return true;
				}
			}
		}
		return false;
	}
}
