import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!tk", name = "ac", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
	public static int anInt5124 = -1;

	@OriginalMember(owner = "client!tk", name = "zb", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Loaded interfaces";

	@OriginalMember(owner = "client!tk", name = "Ib", descriptor = "J")
	public static long aLong183 = 0L;

	@OriginalMember(owner = "client!tk", name = "Yb", descriptor = "Ljava/lang/String;")
	public static String aString181 = "Discard";

	@OriginalMember(owner = "client!tk", name = "Cc", descriptor = "I")
	public static int anInt5182 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([BI)[B")
	public static byte[] method3875(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class8_Sub2 local8 = new Class8_Sub2(arg0);
		@Pc(12) int local12 = local8.method2334();
		@Pc(22) int local22 = local8.method2352();
		if (local22 < 0 || Static201.anInt4155 != 0 && local22 > Static201.anInt4155) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local22];
			local8.method2339(local45, local22);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method2352();
			if (local57 < 0 || Static201.anInt4155 != 0 && Static201.anInt4155 < local57) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local57];
			if (local12 == 1) {
				Static32.method520(local79, local57, arg0, local22);
			} else {
				Static185.aClass127_1.method3022(local79, local8);
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method3877(@OriginalArg(0) int arg0) {
		Static157.anInt5705 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static24.anInt639; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static27.anInt665; local8++) {
				if (Static178.aClass8_Sub27ArrayArrayArray1[arg0][local3][local8] == null) {
					Static178.aClass8_Sub27ArrayArrayArray1[arg0][local3][local8] = new Class8_Sub27(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	public static void method3881() {
		Static283.anInt5551 = 1;
		Static149.anInt3007 = -1;
		Static50.anInt1118 = 2;
		Static144.aBoolean239 = false;
		Static98.anInt2035 = -1;
		Static240.aClass132_82 = null;
		Static86.anInt1847 = 0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Lclient!e;")
	public static Class8_Sub1_Sub6 method3883() {
		@Pc(18) Class8_Sub1_Sub6 local18 = (Class8_Sub1_Sub6) Static84.aClass164_4.method3989();
		if (local18 != null) {
			local18.method4273();
			local18.method4277();
			return local18;
		}
		do {
			local18 = (Class8_Sub1_Sub6) Static298.aClass164_2.method3989();
			if (local18 == null) {
				return null;
			}
			if (local18.method935() > Static71.method1143()) {
				return null;
			}
			local18.method4273();
			local18.method4277();
		} while ((Long.MIN_VALUE & local18.aLong204) == 0L);
		return local18;
	}
}
