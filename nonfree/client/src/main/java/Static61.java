import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_914 = Static6.method100("Standort");

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_915 = Static6.method100("scrollbar");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!nc;I)Lclient!he;")
	public static Class26 method1201(@OriginalArg(1) Class3_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (!Static73.method1342(arg1, Static89.method1641(arg0)) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aClass26Array19 == null || arg0.aClass26Array19.length <= arg1 || arg0.aClass26Array19[arg1] == null || arg0.aClass26Array19[arg1].method829().method839() == 0) {
			return Static27.aBoolean56 ? Static119.method2136(new Class26[] { Static39.aClass26_638, Static122.method2170(arg1) }) : null;
		} else {
			return arg0.aClass26Array19[arg1];
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public static void method1202(@OriginalArg(0) boolean arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static133.anInt560; local5++) {
			@Pc(15) Class3_Sub1_Sub5_Sub1_Sub2 local15 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[Static48.anIntArray151[local5]];
			@Pc(24) int local24 = (Static48.anIntArray151[local5] << 14) + 536870912;
			if (local15 != null && local15.method1880() && local15.aClass3_Sub1_Sub3_1.aBoolean20 == arg0 && local15.aClass3_Sub1_Sub3_1.method141()) {
				@Pc(53) int local53 = local15.anInt2731 >> 7;
				@Pc(58) int local58 = local15.anInt2733 >> 7;
				if (local58 >= 0 && local58 < 104 && local53 >= 0 && local53 < 104) {
					if (local15.anInt2712 == 1 && (local15.anInt2733 & 0x7F) == 64 && (local15.anInt2731 & 0x7F) == 64) {
						if (Static67.anInt2785 == Static125.anIntArrayArray29[local58][local53]) {
							continue;
						}
						Static125.anIntArrayArray29[local58][local53] = Static67.anInt2785;
					}
					if (!local15.aClass3_Sub1_Sub3_1.aBoolean21) {
						local24 += Integer.MIN_VALUE;
					}
					Static62.aClass69_1.method2048(Static132.anInt3270, local15.anInt2733, local15.anInt2731, Static110.method2006(local15.anInt2733 + (local15.anInt2712 - 1) * 64, local15.anInt2731 - -(local15.anInt2712 * 64) - 64, Static132.anInt3270), local15.anInt2712 * 64 + 60 - 64, local15, local15.anInt2692, local24, local15.aBoolean157);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1203() {
		Static94.aClass66_22.method1971();
		Static24.aClass66_11.method1971();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!fd;")
	public static Class3_Sub1_Sub7 method1204(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub7 local6 = (Class3_Sub1_Sub7) Static18.aClass66_7.method1970((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static13.aClass16_20.method566(8, arg0);
		local6 = new Class3_Sub1_Sub7();
		if (local26 != null) {
			local6.method650(new Class3_Sub11(local26));
		}
		Static18.aClass66_7.method1969((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1205() {
		aClass26_915 = null;
		aClass26_914 = null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lclient!mb;")
	public static Class3_Sub1_Sub12 method1206(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) Static66.aClass66_20.method1970((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static80.aClass16_94.method566(5, arg0);
		local6 = new Class3_Sub1_Sub12();
		if (local25 != null) {
			local6.method1331(new Class3_Sub11(local25));
		}
		Static66.aClass66_20.method1969((long) arg0, local6);
		return local6;
	}
}
