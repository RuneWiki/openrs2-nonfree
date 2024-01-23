import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt6012;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
	public static boolean aBoolean428;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt6010 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[B")
	public static byte[] aByteArray75 = new byte[520];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(J[IIZ)Ljava/lang/String;")
	public static String method4918(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (Static286.anInterface5_2 != null) {
			@Pc(12) String local12 = Static286.anInterface5_2.method2863(arg2, arg0, arg1);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
	public static void method4919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static177.anInt3306 == 0 || arg0 == 0 || Static62.anInt1162 >= 50 || arg1 == -1) {
			return;
		}
		Static136.anIntArray306[Static62.anInt1162] = arg1;
		Static289.anIntArray598[Static62.anInt1162] = arg0;
		Static277.anIntArray570[Static62.anInt1162] = arg3;
		Static151.aClass45Array1[Static62.anInt1162] = null;
		Static131.anIntArray296[Static62.anInt1162] = 0;
		Static175.anIntArray399[Static62.anInt1162] = arg2;
		Static62.anInt1162++;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public static void method4921(@OriginalArg(1) boolean arg0) {
		Static155.anInt2919 = 0;
		Static228.aByteArrayArrayArray11 = null;
		Static287.aClass151_19 = null;
		Static228.aByteArrayArrayArray9 = null;
		Static228.anIntArrayArrayArray4 = null;
		Static228.aByteArrayArrayArray13 = null;
		Static204.aClass56_18 = null;
		if (arg0 && Static228.aClass3_Sub4_Sub14_2 != null) {
			Static289.anInt5784 = Static228.aClass3_Sub4_Sub14_2.anInt2659;
		} else {
			Static289.anInt5784 = -1;
		}
		Static228.aByteArrayArrayArray10 = null;
		Static228.aByteArrayArrayArray12 = null;
		Static228.aClass3_Sub4_Sub14_2 = null;
		Static228.anIntArrayArrayArray5 = null;
		Static228.anIntArray140 = null;
		Static228.aClass115_4.method2877();
		Static42.aClass78_1 = null;
		Static152.aClass78_5 = null;
		Static228.aClass43_2 = null;
		Static141.aClass78_4 = null;
		Static45.aClass78_2 = null;
		Static232.aClass3_Sub4_Sub12_3 = null;
		Static194.aClass78_7 = null;
		Static99.aClass78_3 = null;
		Static161.aClass78_6 = null;
		Static79.anInt1913 = -1;
		Static301.aClass78_8 = null;
		Static9.anInt187 = -1;
		Static232.aClass3_Sub4_Sub12_Sub2_3 = null;
		Static52.method829();
		Static130.aClass30_15 = null;
		Static37.aClass17_1 = null;
		Static51.aClass30_8 = null;
		Static70.method1062(128, 64);
		Static90.method1360(64, 64);
		Static133.method2307(64);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V")
	public static void method4922(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub7 local16 = Static34.method528(arg0, 11);
		local16.method970();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method4923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static232.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static23.anInt428) {
			return false;
		} else if (local7 == Static23.anInt428) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static217.method3570(local22 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg2], local26 + 1) && Static217.method3570(local22 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg2], local26 + 1) && Static217.method3570(local22 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static217.method3570(local22 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static232.anIntArrayArrayArray12[arg0][arg1][arg2] = Static23.anInt428;
				return true;
			} else {
				Static232.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static23.anInt428;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BZ)Lclient!vd;")
	public static Class3_Sub4_Sub22 method4924(@OriginalArg(0) byte[] arg0) {
		@Pc(5) Class3_Sub4_Sub22 local5 = new Class3_Sub4_Sub22();
		@Pc(14) Class3_Sub26 local14 = new Class3_Sub26(arg0);
		local14.anInt4615 = local14.aByteArray64.length - 2;
		@Pc(33) int local33 = local14.method3948();
		@Pc(44) int local44 = local14.aByteArray64.length - local33 - 2 - 12;
		local14.anInt4615 = local44;
		@Pc(51) int local51 = local14.method3896();
		local5.anInt5807 = local14.method3948();
		local5.anInt5812 = local14.method3948();
		local5.anInt5808 = local14.method3948();
		local5.anInt5815 = local14.method3948();
		@Pc(75) int local75 = local14.method3915();
		@Pc(86) int local86;
		@Pc(93) int local93;
		if (local75 > 0) {
			local5.aClass30Array1 = new Class30[local75];
			for (local86 = 0; local86 < local75; local86++) {
				local93 = local14.method3948();
				@Pc(100) Class30 local100 = new Class30(Static165.method2731(local93));
				local5.aClass30Array1[local86] = local100;
				while (local93-- > 0) {
					@Pc(115) int local115 = local14.method3896();
					@Pc(119) int local119 = local14.method3896();
					local100.method668(new Class3_Sub8(local119), (long) local115);
				}
			}
		}
		local86 = 0;
		local14.anInt4615 = 0;
		local5.aString220 = local14.method3889();
		local5.anIntArray602 = new int[local51];
		local5.aStringArray39 = new String[local51];
		local5.anIntArray601 = new int[local51];
		while (local44 > local14.anInt4615) {
			local93 = local14.method3948();
			if (local93 == 3) {
				local5.aStringArray39[local86] = local14.method3931().intern();
			} else if (local93 >= 100 || local93 == 21 || local93 == 38 || local93 == 39) {
				local5.anIntArray602[local86] = local14.method3915();
			} else {
				local5.anIntArray602[local86] = local14.method3896();
			}
			local5.anIntArray601[local86++] = local93;
		}
		return local5;
	}
}
