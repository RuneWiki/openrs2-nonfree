import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Lclient!de;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public static void method2304() {
		Static81.method1414(Static66.aClass2_24);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static120.method1994());
		Static255.aClass7_Sub14_Sub1_2.method3993(Static251.anInt4258);
		Static255.aClass7_Sub14_Sub1_2.method3993(Static286.anInt4051);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static130.aClass153_Sub1_1.anInt5244);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Lclient!kh;")
	public static Class26_Sub2_Sub4 method2305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class223 local11 = Static19.aClass223ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class26_Sub2_Sub4 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class270 local27 = local11.aClass270_1; local27 != null; local27 = local27.aClass270_3) {
			@Pc(31) Class26_Sub2 local31 = local27.aClass26_Sub2_2;
			if (local31 instanceof Class26_Sub2_Sub4) {
				@Pc(37) Class26_Sub2_Sub4 local37 = (Class26_Sub2_Sub4) local31;
				@Pc(47) int local47 = local37.method5512() * 64 + 60 - 64;
				@Pc(55) int local55 = local37.anInt7388 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt7383 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt7388 >> 7;
				@Pc(78) int local78 = local37.anInt7383 + local47 >> 7;
				if (local55 <= arg2 && local63 <= arg0 && arg2 <= local70 && local78 >= arg0) {
					@Pc(108) int local108 = (local78 + 1 - arg0) * (-arg2 + 1 + local70);
					if (local108 > local24) {
						local22 = local37;
						local24 = local108;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
	public static int method2308() {
		if (Static191.aClass95_9 == null) {
			if (!Static331.aBoolean372 && Static102.anInt2085 > 0) {
				if (Static243.aBoolean254 && Static310.aClass130_1.method5069(81) && Static102.anInt2085 > 2) {
					return ((Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261.aClass7_261).anInt5891;
				}
				return ((Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261).anInt5891;
			}
			@Pc(43) int local43 = aClass50_1.method1860();
			@Pc(49) int local49 = aClass50_1.method1870();
			@Pc(51) int local51 = Static415.anInt6598;
			@Pc(53) int local53 = Static351.anInt5637;
			@Pc(55) int local55 = Static171.anInt3077;
			if (local43 > local51 && local55 + local51 > local43) {
				@Pc(73) int local73 = -1;
				@Pc(93) int local93;
				for (@Pc(75) int local75 = 0; local75 < Static102.anInt2085; local75++) {
					if (Static425.aBoolean471) {
						local93 = local53 + (Static102.anInt2085 - local75 - 1) * 16 + 33;
						if (local49 > local93 - 13 && local49 <= local93 + 3) {
							local73 = local75;
						}
					} else {
						local93 = local53 + (-local75 + Static102.anInt2085 - 1) * 16 + 31;
						if (local93 - 13 < local49 && local93 + 3 >= local49) {
							local73 = local75;
						}
					}
				}
				if (local73 != -1) {
					local93 = 0;
					@Pc(155) Class12 local155 = new Class12(Static237.aClass85_26);
					for (@Pc(160) Class7_Sub39 local160 = (Class7_Sub39) local155.method97(); local160 != null; local160 = (Class7_Sub39) local155.method95()) {
						if (local73 == local93++) {
							return local160.anInt5891;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int method2310(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(18) int local18 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
