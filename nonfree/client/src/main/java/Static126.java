import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[S")
	public static short[] aShortArray38;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_73;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "S")
	public static short aShort26 = 320;

	@OriginalMember(owner = "client!li", name = "db", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Lclient!sc;")
	public static Class107 method2106(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static115.method2001(arg0) : Static119.aClass107_705;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
	public static void method2109(@OriginalArg(0) int arg0) {
		Static188.method3059();
		Static109.method1900();
		@Pc(12) int local12 = Static143.method2370(arg0).anInt2860;
		if (local12 == 0) {
			return;
		}
		@Pc(27) int local27 = Static141.anIntArray267[arg0];
		if (local12 == 6) {
			Static215.anInt4669 = local27;
		}
		if (local12 == 9) {
			Static125.anInt2700 = local27;
		}
		if (local12 == 5) {
			Static159.anInt3500 = local27;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
	public static void method2113() {
		for (@Pc(7) int local7 = -1; local7 < Static10.anInt285; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static16.anIntArray38[local7];
			}
			@Pc(24) Class5_Sub5_Sub1 local24 = Static198.aClass5_Sub5_Sub1Array1[local16];
			if (local24 != null && local24.anInt2998 > 0) {
				local24.anInt2998--;
				if (local24.anInt2998 == 0) {
					local24.aClass107_826 = null;
				}
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static189.anInt4168; local58++) {
			@Pc(64) int local64 = Static37.anIntArray82[local58];
			@Pc(68) Class5_Sub5_Sub2 local68 = Static33.aClass5_Sub5_Sub2Array1[local64];
			if (local68 != null && local68.anInt2998 > 0) {
				local68.anInt2998--;
				if (local68.anInt2998 == 0) {
					local68.aClass107_826 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
	public static void method2114() {
		Static177.anInt3843 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static209.anInt4460; local3++) {
			@Pc(8) Class126 local8 = Static43.aClass126Array3[local3];
			@Pc(12) int local12;
			if (Static67.anIntArray136 != null) {
				for (local12 = 0; local12 < Static67.anIntArray136.length; local12++) {
					if (Static67.anIntArray136[local12] != -1000000 && (local8.anInt4968 <= Static67.anIntArray136[local12] || local8.anInt4977 <= Static67.anIntArray136[local12]) && (local8.anInt4975 <= Static97.anIntArray212[local12] || local8.anInt4984 <= Static97.anIntArray212[local12]) && (local8.anInt4975 >= Static136.anIntArray254[local12] || local8.anInt4984 >= Static136.anIntArray254[local12]) && (local8.anInt4969 <= Static233.anIntArray382[local12] || local8.anInt4976 <= Static233.anIntArray382[local12]) && (local8.anInt4969 >= Static150.anIntArray291[local12] || local8.anInt4976 >= Static150.anIntArray291[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4965 == 1) {
				local12 = local8.anInt4972 + Static111.anInt2473 - Static153.anInt3385;
				if (local12 >= 0 && local12 <= Static111.anInt2473 + Static111.anInt2473) {
					local110 = local8.anInt4967 + Static111.anInt2473 - Static175.anInt3799;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4971 + Static111.anInt2473 - Static175.anInt3799;
					if (local121 > Static111.anInt2473 + Static111.anInt2473) {
						local121 = Static111.anInt2473 + Static111.anInt2473;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static85.aBooleanArrayArray2[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static95.anInt2063 - local8.anInt4975;
						if (local153 > 32) {
							local8.anInt4980 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4980 = 2;
							local153 = -local153;
						}
						local8.anInt4973 = (local8.anInt4969 - Static15.anInt343 << 8) / local153;
						local8.anInt4974 = (local8.anInt4976 - Static15.anInt343 << 8) / local153;
						local8.anInt4961 = (local8.anInt4968 - Static156.anInt3421 << 8) / local153;
						local8.anInt4964 = (local8.anInt4977 - Static156.anInt3421 << 8) / local153;
						Static99.aClass126Array2[Static177.anInt3843++] = local8;
					}
				}
			} else if (local8.anInt4965 == 2) {
				local12 = local8.anInt4967 + Static111.anInt2473 - Static175.anInt3799;
				if (local12 >= 0 && local12 <= Static111.anInt2473 + Static111.anInt2473) {
					local110 = local8.anInt4972 + Static111.anInt2473 - Static153.anInt3385;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4966 + Static111.anInt2473 - Static153.anInt3385;
					if (local121 > Static111.anInt2473 + Static111.anInt2473) {
						local121 = Static111.anInt2473 + Static111.anInt2473;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static85.aBooleanArrayArray2[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static15.anInt343 - local8.anInt4969;
						if (local153 > 32) {
							local8.anInt4980 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4980 = 4;
							local153 = -local153;
						}
						local8.anInt4981 = (local8.anInt4975 - Static95.anInt2063 << 8) / local153;
						local8.anInt4970 = (local8.anInt4984 - Static95.anInt2063 << 8) / local153;
						local8.anInt4961 = (local8.anInt4968 - Static156.anInt3421 << 8) / local153;
						local8.anInt4964 = (local8.anInt4977 - Static156.anInt3421 << 8) / local153;
						Static99.aClass126Array2[Static177.anInt3843++] = local8;
					}
				}
			} else if (local8.anInt4965 == 4) {
				local12 = local8.anInt4968 - Static156.anInt3421;
				if (local12 > 128) {
					local110 = local8.anInt4967 + Static111.anInt2473 - Static175.anInt3799;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4971 + Static111.anInt2473 - Static175.anInt3799;
					if (local121 > Static111.anInt2473 + Static111.anInt2473) {
						local121 = Static111.anInt2473 + Static111.anInt2473;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt4972 + Static111.anInt2473 - Static153.anInt3385;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt4966 + Static111.anInt2473 - Static153.anInt3385;
						if (local153 > Static111.anInt2473 + Static111.anInt2473) {
							local153 = Static111.anInt2473 + Static111.anInt2473;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static85.aBooleanArrayArray2[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt4980 = 5;
							local8.anInt4981 = (local8.anInt4975 - Static95.anInt2063 << 8) / local12;
							local8.anInt4970 = (local8.anInt4984 - Static95.anInt2063 << 8) / local12;
							local8.anInt4973 = (local8.anInt4969 - Static15.anInt343 << 8) / local12;
							local8.anInt4974 = (local8.anInt4976 - Static15.anInt343 << 8) / local12;
							Static99.aClass126Array2[Static177.anInt3843++] = local8;
						}
					}
				}
			}
		}
	}
}
