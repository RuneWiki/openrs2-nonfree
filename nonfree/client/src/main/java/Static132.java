import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_135;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public static int anInt2855 = 127;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_848 = Static181.method2795("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_849 = Static181.method2795("(Udns");

	@OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
	public static int anInt2867 = -1;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!qe;B)V")
	public static void method2197(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class83 arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(8) Class83 local8 = arg1.method2430();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static52.anInt1337; local16++) {
			@Pc(22) Class2_Sub2_Sub3 local22 = Static113.method1987(local16);
			if ((!arg0 || local22.aBoolean24) && local22.anInt466 == -1 && local22.anInt450 == -1 && local22.anInt442 == 0 && local22.aClass83_87.method2430().method2388(local8) != -1) {
				if (local14 >= 250) {
					Static141.aShortArray29 = null;
					Static95.anInt2021 = -1;
					return;
				}
				if (local14 >= local4.length) {
					@Pc(76) short[] local76 = new short[local4.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local14; local78++) {
						local76[local78] = local4[local78];
					}
					local4 = local76;
				}
				local4[local14++] = (short) local16;
			}
		}
		Static210.anInt4185 = 0;
		Static95.anInt2021 = local14;
		@Pc(109) Class83[] local109 = new Class83[Static95.anInt2021];
		Static141.aShortArray29 = local4;
		for (@Pc(113) int local113 = 0; local113 < Static95.anInt2021; local113++) {
			local109[local113] = Static113.method1987(local4[local113]).aClass83_87;
		}
		Static10.method281(Static141.aShortArray29, local109);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
	public static void method2198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = -arg1;
		@Pc(12) int local12 = arg1;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 + arg1);
		@Pc(33) int local33 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - arg1);
		Static22.method438(local22, arg0, local33, Static14.anIntArrayArray18[arg2]);
		while (local12 > local7) {
			local14 += 2;
			local10 += local14;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(89) int local89;
			@Pc(97) int local97;
			if (local10 > 0) {
				local12--;
				local59 = arg2 - local12;
				local63 = local12 + arg2;
				local10 -= local12 << 1;
				if (Static147.anInt4074 <= local63 && Static61.anInt1501 >= local59) {
					local89 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 + local7);
					local97 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local7);
					if (local63 <= Static61.anInt1501) {
						Static22.method438(local89, arg0, local97, Static14.anIntArrayArray18[local63]);
					}
					if (local59 >= Static147.anInt4074) {
						Static22.method438(local89, arg0, local97, Static14.anIntArrayArray18[local59]);
					}
				}
			}
			local7++;
			local63 = local7 + arg2;
			local59 = arg2 - local7;
			if (local63 >= Static147.anInt4074 && local59 <= Static61.anInt1501) {
				local89 = Static50.method998(Static36.anInt940, Static209.anInt4155, local12 + arg3);
				local97 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg3 - local12);
				if (Static61.anInt1501 >= local63) {
					Static22.method438(local89, arg0, local97, Static14.anIntArrayArray18[local63]);
				}
				if (Static147.anInt4074 <= local59) {
					Static22.method438(local89, arg0, local97, Static14.anIntArrayArray18[local59]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method2199() {
		for (@Pc(11) int local11 = 0; local11 < Static162.anInt3930; local11++) {
			@Pc(17) int local17 = Static207.anIntArray402[local11];
			@Pc(21) Class24_Sub4_Sub2 local21 = Static47.aClass24_Sub4_Sub2Array1[local17];
			if (local21 != null) {
				Static2.method57(local21.aClass2_Sub2_Sub24_1.anInt3188, local21);
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method2200(@OriginalArg(0) int arg0) {
		@Pc(1) Class100 local1 = Static206.aClass100_1;
		synchronized (Static206.aClass100_1) {
			Static172.anInt3534 = arg0;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
	public static void method2201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg2);
		@Pc(17) int local17 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg3);
		@Pc(23) int local23 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg4);
		@Pc(31) int local31 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg0);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static22.method438(local31, arg1, local23, Static14.anIntArrayArray18[local36]);
		}
	}
}
