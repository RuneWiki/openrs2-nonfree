import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_27;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "[I")
	public static int[] anIntArray280 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_781 = method1251("redstone3");

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!mb;")
	private static Class45 aClass45_782 = method1251("glow1:");

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public static int anInt1837 = -1;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_783 = method1251("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_784 = aClass45_782;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method1250() {
		@Pc(5) Object local5 = Static61.anObject2;
		synchronized (Static61.anObject2) {
			if (Static21.anInt696 == 0) {
				Static96.aClass77_3.method2166(new Class59(), 5);
			}
			Static21.anInt696 = 600;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!mb;")
	public static Class45 method1251(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class45 local20 = new Class45();
		local20.aByteArray27 = new byte[local14];
		while (local14 > local16) {
			@Pc(32) int local32 = local11[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local16) {
					break;
				}
				@Pc(72) int local72 = local11[local16++] & 0xFF;
				local20.aByteArray27[local20.anInt1925++] = (byte) (local72 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local20.aByteArray27[local20.anInt1925++] = (byte) local32;
			}
		}
		local20.method1308();
		return local20.method1320();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)Lclient!ka;")
	public static Class5_Sub2_Sub9 method1252(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub9 local10 = (Class5_Sub2_Sub9) Static25.aClass67_8.method1823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static49.aClass29_35.method733(arg0, 12);
		local10 = new Class5_Sub2_Sub9();
		if (local25 != null) {
			local10.method1153(new Class5_Sub9(local25));
		}
		local10.method1149();
		Static25.aClass67_8.method1818(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	public static int method1253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class5_Sub2_Sub17 method1254(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub17 local10 = (Class5_Sub2_Sub17) Static89.aClass67_20.method1823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static71.aClass29_48.method733(arg0, 9);
		local10 = new Class5_Sub2_Sub17();
		local10.anInt3079 = arg0;
		if (local20 != null) {
			local10.method2118(new Class5_Sub9(local20));
		}
		local10.method2119();
		Static89.aClass67_20.method1818(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)V")
	public static void method1255() {
		anIntArray280 = null;
		aClass45_784 = null;
		aClass29_Sub1_27 = null;
		anIntArray281 = null;
		aClass45_781 = null;
		aClass45_782 = null;
		aByteArrayArray6 = null;
		aClass45_783 = null;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method1256() {
		if (Static104.aClass5_Sub2_Sub8_5 == null) {
			return;
		}
		@Pc(16) Class5_Sub2_Sub8 local16 = Static104.aClass5_Sub2_Sub8_5;
		@Pc(20) Class5_Sub2_Sub8 local20 = Static79.method1504(local16);
		if (local20 == null) {
			Static104.aClass5_Sub2_Sub8_5 = null;
			return;
		}
		Static40.anInt1173++;
		@Pc(33) int[] local33 = Static42.method570(local20);
		@Pc(37) int[] local37 = Static42.method570(local16);
		@Pc(42) int local42 = Static14.anInt425 - Static100.anInt2700;
		@Pc(47) int local47 = Static47.anInt1354 - Static42.anInt800;
		if (local42 <= local16.anInt1295 && -local16.anInt1295 <= local42 && local47 <= local16.anInt1295 && -local16.anInt1295 <= local47 && !Static67.aBoolean93) {
			local42 = 0;
			local47 = 0;
		} else if (Static40.anInt1173 > local16.anInt1293 || Static67.aBoolean93) {
			Static67.aBoolean93 = true;
		} else {
			local42 = 0;
			local47 = 0;
		}
		@Pc(105) int local105 = local47 + local37[1] - local33[1];
		@Pc(115) int local115 = local42 + local37[0] - local33[0];
		if (local105 < 0) {
			local105 = 0;
		}
		if (local105 + local16.anInt1243 > local20.anInt1243) {
			local105 = local20.anInt1243 - local16.anInt1243;
		}
		if (local115 < 0) {
			local115 = 0;
		}
		if (local20.anInt1260 < local16.anInt1260 + local115) {
			local115 = local20.anInt1260 - local16.anInt1260;
		}
		if (Static104.aClass5_Sub2_Sub8_5.anObjectArray11 != null && Static67.aBoolean93) {
			Static33.method687(0, null, local105, local16.anObjectArray11, local115, local16);
		}
		if (Static108.anInt2830 != 0) {
			return;
		}
		if (Static67.aBoolean93) {
			@Pc(221) int local221 = Static14.anInt425 - local33[0];
			if (local221 < 0) {
				local221 = 0;
			}
			@Pc(232) int local232 = Static47.anInt1354 - local33[1];
			if (local232 < 0) {
				local232 = 0;
			}
			if (local20.anInt1243 - 1 < local232) {
				local232 = local20.anInt1243 - 1;
			}
			if (local20.anInt1260 - 1 < local221) {
				local221 = local20.anInt1260 - 1;
			}
			@Pc(272) Class5_Sub2_Sub8 local272 = Static27.method605(local20, local221, local232, local16);
			if (Static104.aClass5_Sub2_Sub8_5.anObjectArray18 != null) {
				Static33.method687(0, local272, local105, local16.anObjectArray18, local115, local16);
			}
			if (local272 != null && Static122.method2156(local16) != null) {
				Static64.aClass5_Sub9_Sub1_2.method1466(240);
				Static64.aClass5_Sub9_Sub1_2.method1423(local272.anInt1262);
				Static64.aClass5_Sub9_Sub1_2.method1432(local272.anInt1288);
				Static64.aClass5_Sub9_Sub1_2.method1423(local16.anInt1262);
				Static64.aClass5_Sub9_Sub1_2.method1432(local16.anInt1288);
			}
		} else {
			if (Static104.aClass5_Sub2_Sub8_5.anObjectArray3 != null) {
				Static33.method687(0, null, local105, local16.anObjectArray3, local115, local16);
			}
			if ((Static75.anInt2180 == 1 || Static5.method77(Static14.anInt426 - 1)) && Static14.anInt426 > 2) {
				Static97.method1807();
			} else if (Static14.anInt426 > 0) {
				Static34.method689(Static14.anInt426 - 1);
			}
		}
		Static104.aClass5_Sub2_Sub8_5 = null;
		return;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BI)[B")
	public static byte[] method1257(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class5_Sub9 local13 = new Class5_Sub9(arg0);
		@Pc(17) int local17 = local13.method1408();
		@Pc(21) int local21 = local13.method1434();
		if (local21 < 0 || Static103.anInt2767 != 0 && local21 > Static103.anInt2767) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(41) byte[] local41 = new byte[local21];
			local13.method1433(local41, local21);
			return local41;
		} else {
			@Pc(53) int local53 = local13.method1434();
			if (local53 < 0 || Static103.anInt2767 != 0 && local53 > Static103.anInt2767) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local53];
			if (local17 == 1) {
				Static24.method555(local67, local53, arg0, local21);
			} else {
				try {
					@Pc(93) DataInputStream local93 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local93.readFully(local67);
					local93.close();
				} catch (@Pc(100) IOException local100) {
				}
			}
			return local67;
		}
	}
}
