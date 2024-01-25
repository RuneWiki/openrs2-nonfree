import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static final int anInt475 = 50;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
	public static final int[] anIntArray51 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	public static final int[] anIntArray52 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	public static final int[] anIntArray53 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
	public static final int[] anIntArray54 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
	public static final int[] anIntArray55 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[anInt475];

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
	public static final int[] anIntArray56 = new int[anInt475];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method418(@OriginalArg(1) String arg0) {
		return Static178.method3299(16, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)Lclient!dd;")
	public static Class7_Sub1_Sub6 method419(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class7_Sub1_Sub6 local7 = new Class7_Sub1_Sub6();
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(arg0);
		local12.anInt3005 = local12.aByteArray33.length - 2;
		@Pc(25) int local25 = local12.method2764();
		@Pc(41) int local41 = local12.aByteArray33.length - local25 - 12 - 2;
		local12.anInt3005 = local41;
		@Pc(48) int local48 = local12.method2767();
		local7.anInt1416 = local12.method2764();
		local7.anInt1415 = local12.method2764();
		local7.anInt1420 = local12.method2764();
		local7.anInt1418 = local12.method2764();
		@Pc(72) int local72 = local12.method2772();
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (local72 > 0) {
			local7.aClass10Array1 = new Class10[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local88 = local12.method2764();
				@Pc(95) Class10 local95 = new Class10(Static271.method4522(local88));
				local7.aClass10Array1[local83] = local95;
				while (local88-- > 0) {
					@Pc(105) int local105 = local12.method2767();
					@Pc(109) int local109 = local12.method2767();
					local95.method161((long) local105, new Class7_Sub10(local109));
				}
			}
		}
		local12.anInt3005 = 0;
		local7.aString105 = local12.method2756();
		local7.anIntArray213 = new int[local48];
		local7.anIntArray212 = new int[local48];
		local7.aStringArray10 = new String[local48];
		local83 = 0;
		while (local12.anInt3005 < local41) {
			local88 = local12.method2764();
			if (local88 == 3) {
				local7.aStringArray10[local83] = local12.method2782().intern();
			} else if (local88 >= 100 || local88 == 21 || local88 == 38 || local88 == 39) {
				local7.anIntArray213[local83] = local12.method2772();
			} else {
				local7.anIntArray213[local83] = local12.method2767();
			}
			local7.anIntArray212[local83++] = local88;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!oa;Lclient!pe;IIZLclient!sa;)V")
	public static void method420(@OriginalArg(0) Class149[] arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class8 arg4) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(37) int local37;
		if (!arg3) {
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (local16 = 0; local16 < Static15.anInt287; local16++) {
					for (local20 = 0; local20 < Static325.anInt6173; local20++) {
						if ((Static92.aByteArrayArrayArray3[local12][local16][local20] & 0x1) != 0) {
							local37 = local12;
							if ((Static92.aByteArrayArrayArray3[1][local16][local20] & 0x2) != 0) {
								local37 = local12 - 1;
							}
							if (local37 >= 0) {
								arg0[local37].method3955(local20, local16);
							}
						}
					}
				}
			}
		}
		@Pc(87) int[][] local87 = new int[Static15.anInt287][Static325.anInt6173];
		for (local16 = 0; local16 < arg2; local16++) {
			for (local20 = 0; local20 < Static325.anInt6173; local20++) {
				Static79.anIntArray283[local20] = 0;
				Static314.anIntArray757[local20] = 0;
				Static349.anIntArray837[local20] = 0;
				Static144.anIntArray410[local20] = 0;
				Static343.anIntArray830[local20] = 0;
			}
			for (local37 = -5; local37 < Static15.anInt287; local37++) {
				@Pc(135) int local135;
				@Pc(148) int local148;
				@Pc(214) int local214;
				for (@Pc(129) int local129 = 0; local129 < Static325.anInt6173; local129++) {
					local135 = local37 + 5;
					@Pc(192) int local192;
					if (local135 < Static15.anInt287) {
						local148 = Static227.aByteArrayArrayArray12[local16][local135][local129] & 0xFF;
						if (local148 > 0) {
							@Pc(156) Class78 local156 = Static244.method4224(local148 - 1);
							Static79.anIntArray283[local129] += local156.anInt2320;
							Static314.anIntArray757[local129] += local156.anInt2326;
							Static349.anIntArray837[local129] += local156.anInt2317;
							Static144.anIntArray410[local129] += local156.anInt2327;
							local192 = Static343.anIntArray830[local129]++;
						}
					}
					local148 = local37 - 5;
					if (local148 >= 0) {
						local214 = Static227.aByteArrayArrayArray12[local16][local148][local129] & 0xFF;
						if (local214 > 0) {
							@Pc(225) Class78 local225 = Static244.method4224(local214 - 1);
							Static79.anIntArray283[local129] -= local225.anInt2320;
							Static314.anIntArray757[local129] -= local225.anInt2326;
							Static349.anIntArray837[local129] -= local225.anInt2317;
							Static144.anIntArray410[local129] -= local225.anInt2327;
							local192 = Static343.anIntArray830[local129]--;
						}
					}
				}
				if (local37 >= 0) {
					local135 = 0;
					local148 = 0;
					local214 = 0;
					@Pc(285) int local285 = 0;
					@Pc(287) int local287 = 0;
					for (@Pc(289) int local289 = -5; local289 < Static325.anInt6173; local289++) {
						@Pc(295) int local295 = local289 + 5;
						if (Static325.anInt6173 > local295) {
							local287 += Static343.anIntArray830[local295];
							local148 += Static314.anIntArray757[local295];
							local285 += Static144.anIntArray410[local295];
							local135 += Static79.anIntArray283[local295];
							local214 += Static349.anIntArray837[local295];
						}
						@Pc(336) int local336 = local289 - 5;
						if (local336 >= 0) {
							local135 -= Static79.anIntArray283[local336];
							local285 -= Static144.anIntArray410[local336];
							local148 -= Static314.anIntArray757[local336];
							local214 -= Static349.anIntArray837[local336];
							local287 -= Static343.anIntArray830[local336];
						}
						if (local289 >= 0 && local285 > 0 && local287 > 0) {
							local87[local37][local289] = Static248.method4275(local148 / local287, local135 * 256 / local285, local214 / local287);
						}
					}
				}
			}
			Static310.method5004(Static15.anInt287, local16, arg4, Static325.anInt6173, arg1, Static331.aClass8Array5[local16], arg3, local87, Static353.aByteArrayArrayArray5[local16], Static343.aByteArrayArrayArray13[local16], Static227.aByteArrayArrayArray12[local16], Static343.aByteArrayArrayArray14[local16]);
			Static227.aByteArrayArrayArray12[local16] = null;
			Static343.aByteArrayArrayArray13[local16] = null;
			Static343.aByteArrayArrayArray14[local16] = null;
			Static353.aByteArrayArrayArray5[local16] = null;
		}
		if (!arg3) {
			if (Static325.aBoolean452) {
				Static321.method5187();
			}
			if (Static336.anInt4180 != 0) {
				Static8.method144();
			}
		}
		for (local20 = 0; local20 < arg2; local20++) {
			Static331.aClass8Array5[local20].method4163();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!r;)Ljava/lang/String;")
	public static String method422(@OriginalArg(1) Class7_Sub32 arg0) {
		return arg0.aString330 == null || arg0.aString330.length() <= 0 ? arg0.aString331 : arg0.aString331 + Static309.aString381 + arg0.aString330;
	}
}
