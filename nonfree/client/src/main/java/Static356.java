import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
	public static int anInt6078;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!cu;")
	public static final Class3_Sub7 aClass3_Sub7_5 = new Class3_Sub7(new byte[5000]);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!li;Lclient!cu;I)V")
	public static void method4744(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class3_Sub7 arg2) {
		@Pc(7) Class3_Sub19 local7 = new Class3_Sub19();
		local7.anInt3019 = arg2.method2582();
		local7.anInt3021 = arg2.method2589();
		local7.anIntArray191 = new int[local7.anInt3019];
		local7.aClass43Array1 = new Class43[local7.anInt3019];
		local7.anIntArray190 = new int[local7.anInt3019];
		local7.anIntArray192 = new int[local7.anInt3019];
		local7.aClass43Array2 = new Class43[local7.anInt3019];
		local7.aByteArrayArrayArray3 = new byte[local7.anInt3019][][];
		for (@Pc(49) int local49 = 0; local49 < local7.anInt3019; local49++) {
			try {
				@Pc(54) int local54 = arg2.method2582();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(87) int local87;
				if (local54 == 0 || local54 == 1 || local54 == 2) {
					local79 = arg2.method2620();
					local83 = arg2.method2620();
					local87 = 0;
					if (local54 == 1) {
						local87 = arg2.method2589();
					}
					local7.anIntArray192[local49] = local54;
					local7.anIntArray191[local49] = local87;
					local7.aClass43Array2[local49] = arg1.method3388(local83, Static19.method384(local79));
				} else if (local54 == 3 || local54 == 4) {
					local79 = arg2.method2620();
					local83 = arg2.method2620();
					local87 = arg2.method2582();
					@Pc(90) String[] local90 = new String[local87];
					for (@Pc(92) int local92 = 0; local92 < local87; local92++) {
						local90[local92] = arg2.method2620();
					}
					@Pc(106) byte[][] local106 = new byte[local87][];
					@Pc(118) int local118;
					if (local54 == 3) {
						for (@Pc(111) int local111 = 0; local111 < local87; local111++) {
							local118 = arg2.method2589();
							local106[local111] = new byte[local118];
							arg2.method2580(local118, local106[local111]);
						}
					}
					local7.anIntArray192[local49] = local54;
					@Pc(143) Class[] local143 = new Class[local87];
					for (local118 = 0; local118 < local87; local118++) {
						local143[local118] = Static19.method384(local90[local118]);
					}
					local7.aClass43Array1[local49] = arg1.method3406(Static19.method384(local79), local143, local83);
					local7.aByteArrayArrayArray3[local49] = local106;
				}
			} catch (@Pc(220) ClassNotFoundException local220) {
				local7.anIntArray190[local49] = -1;
			} catch (@Pc(227) SecurityException local227) {
				local7.anIntArray190[local49] = -2;
			} catch (@Pc(234) NullPointerException local234) {
				local7.anIntArray190[local49] = -3;
			} catch (@Pc(241) Exception local241) {
				local7.anIntArray190[local49] = -4;
			} catch (@Pc(248) Throwable local248) {
				local7.anIntArray190[local49] = -5;
			}
		}
		Static46.aClass243_7.method5198(local7);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method4746(@OriginalArg(0) Class172 arg0) {
		for (@Pc(1) int local1 = Static430.anInt3308; local1 < Static362.anInt6122; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static405.anInt6684; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static37.anInt1025; local7++) {
					@Pc(16) Class118 local16 = Static263.aClass118ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class7_Sub4 local21 = local16.aClass7_Sub4_2;
						@Pc(24) Class7_Sub4 local24 = local16.aClass7_Sub4_1;
						if (local21 != null && local21.method5276()) {
							Static171.method2756(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5276()) {
								Static171.method2756(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5273(0, arg0, false, local21, 0, 0);
								local24.method5268();
							}
							local21.method5268();
						}
						for (@Pc(70) Class179 local70 = local16.aClass179_2; local70 != null; local70 = local70.aClass179_3) {
							@Pc(74) Class7_Sub2 local74 = local70.aClass7_Sub2_2;
							if (local74 != null && local74.method5276()) {
								Static171.method2756(arg0, local74, local1, local4, local7, local74.aShort72 + 1 - local74.aShort71, local74.aShort70 - local74.aShort73 + 1);
								local74.method5268();
							}
						}
						@Pc(111) Class7_Sub1 local111 = local16.aClass7_Sub1_1;
						if (local111 != null && local111.method5276()) {
							Static12.method287(arg0, local111, local1, local4, local7);
							local111.method5268();
						}
					}
				}
			}
		}
	}
}
