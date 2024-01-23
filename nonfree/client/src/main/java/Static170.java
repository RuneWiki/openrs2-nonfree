import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	public static int anInt3384;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
	public static int anInt3385;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!an;")
	public static Class10 aClass10_41 = new Class10();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z")
	public static boolean method2673(@OriginalArg(0) String arg0) {
		@Pc(34) boolean local34 = false;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(50) char local50 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local50 == '-') {
					local38 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local50 >= '0' && local50 <= '9') {
				local98 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local98 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local98 = local50 - 'W';
			} else {
				return false;
			}
			if (local98 >= 10) {
				return false;
			}
			if (local38) {
				local98 = -local98;
			}
			@Pc(121) int local121 = local98 + local36 * 10;
			if (local36 != local121 / 10) {
				return false;
			}
			local34 = true;
			local36 = local121;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public static void method2676(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static222.method3559(arg0)) {
			return;
		}
		@Pc(22) Class22[] local22 = Static148.aClass22ArrayArray1[arg0];
		for (@Pc(34) int local34 = 0; local34 < local22.length; local34++) {
			@Pc(42) Class22 local42 = local22[local34];
			if (local42.anObjectArray5 != null) {
				@Pc(51) Class4_Sub22 local51 = new Class4_Sub22();
				local51.aClass22_15 = local42;
				local51.anObjectArray32 = local42.anObjectArray5;
				Static17.method321(local51, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!hc;Z)I")
	public static int method2677(@OriginalArg(0) Class12_Sub3_Sub1 arg0) {
		@Pc(8) Class175 local8 = arg0.aClass175_1;
		if (local8.anIntArray462 != null) {
			local8 = local8.method4133();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(29) int local29 = local8.anInt5190;
		@Pc(33) Class72 local33 = arg0.method3361();
		if (local33.anInt2564 == arg0.anInt4127) {
			local29 = local8.anInt5191;
		} else if (arg0.anInt4127 == local33.anInt2556 || local33.anInt2582 == arg0.anInt4127 || arg0.anInt4127 == local33.anInt2549 || local33.anInt2559 == arg0.anInt4127) {
			local29 = local8.anInt5189;
		} else if (arg0.anInt4127 == local33.anInt2566 || local33.anInt2569 == arg0.anInt4127 || local33.anInt2550 == arg0.anInt4127 || local33.anInt2565 == arg0.anInt4127) {
			local29 = local8.anInt5227;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public static void method2682() {
		aClass10_41 = null;
		aClass4_Sub2_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Lclient!fc;")
	public static Class47 method2683(@OriginalArg(0) int arg0) {
		@Pc(10) Class47 local10 = (Class47) Static158.aClass33_27.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static136.aClass98_81.method2396(Static239.method3685(arg0), Static71.method1077(arg0));
		local10 = new Class47();
		local10.anInt1366 = arg0;
		if (local34 != null) {
			local10.method1088(new Class4_Sub17(local34));
		}
		local10.method1095();
		if (local10.aBoolean105) {
			local10.aBoolean113 = false;
			local10.anInt1339 = 0;
		}
		if (!Static113.aBoolean165 && local10.aBoolean101) {
			local10.aStringArray9 = null;
		}
		Static158.aClass33_27.method845(local10, (long) arg0);
		return local10;
	}
}
