import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public static int anInt2756 = -1;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt2757 = -1;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public static int anInt2759 = 0;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[Lclient!sr;")
	public static final Class187[] aClass187Array1 = new Class187[8];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qm;)V")
	public static void method2421(@OriginalArg(0) Class4_Sub33_Sub1 arg0) {
		if (Static201.anInt4146 >= 255) {
			return;
		}
		Static25.aClass4_Sub33_Sub1Array1[Static201.anInt4146] = arg0;
		Static114.aBooleanArray14[Static201.anInt4146] = false;
		Static201.anInt4146++;
		@Pc(18) int local18 = arg0.anInt5312;
		if (arg0.aBoolean388) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt5312;
		if (arg0.aBoolean387) {
			local26 = Static327.anInt6252 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt5298 + 64 - arg0.anInt5292 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt5298 + arg0.anInt5292 - 64 >> 7;
			if (local66 >= Static15.anInt1162) {
				local66 = Static15.anInt1162 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray88[local38++];
				@Pc(96) int local96 = (arg0.anInt5295 + 64 - arg0.anInt5292 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static198.anInt4128) {
					local104 = Static198.anInt4128 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static134.anIntArrayArrayArray17[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static134.anIntArrayArrayArray17[local35][local117][local75] = local126 | Static201.anInt4146;
					} else if ((local126 & 0xFF00) == 0) {
						Static134.anIntArrayArrayArray17[local35][local117][local75] = local126 | Static201.anInt4146 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static134.anIntArrayArrayArray17[local35][local117][local75] = local126 | Static201.anInt4146 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static134.anIntArrayArrayArray17[local35][local117][local75] = local126 | Static201.anInt4146 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!g;")
	public static Class74 method2422(@OriginalArg(1) int arg0) {
		@Pc(10) Class74 local10 = (Class74) Static101.aClass198_251.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static112.aClass193_39.method5047(29, arg0);
		local10 = new Class74();
		if (local20 != null) {
			local10.method2234(arg0, new Class4_Sub11(local20));
		}
		Static101.aClass198_251.method5201(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(CI)C")
	public static char method2423(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method2425() {
		Static271.aClass21ArrayArray1 = new Class21[Static92.aClass193_10.method5037()][];
		Static51.aBooleanArray2 = new boolean[Static92.aClass193_10.method5037()];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)I")
	public static int method2426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg2) {
			return arg2 <= arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Lclient!ae;")
	public static Class5 method2427(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static204.aClass198_154;
		@Pc(14) Class5 local14;
		synchronized (Static204.aClass198_154) {
			local14 = (Class5) Static204.aClass198_154.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static193.aClass193_75.method5047(Static183.method3520(arg0), Static103.method2297(arg0));
		local14 = new Class5();
		local14.anInt106 = arg0;
		if (local36 != null) {
			local14.method117(new Class4_Sub11(local36));
		}
		@Pc(59) Class198 local59 = Static204.aClass198_154;
		synchronized (Static204.aClass198_154) {
			Static204.aClass198_154.method5201(local14, (long) arg0);
			return local14;
		}
	}
}
