import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HJEXDJAH")
public final class Class12 {

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "[Lclient!HJEXDJAH;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!HJEXDJAH", name = "i", descriptor = "[Z")
	private static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!HJEXDJAH", name = "b", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!HJEXDJAH", name = "c", descriptor = "Lclient!TMLYUVVT;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!HJEXDJAH", name = "d", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!HJEXDJAH", name = "e", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!HJEXDJAH", name = "f", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!HJEXDJAH", name = "g", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!HJEXDJAH", name = "h", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "(I)V")
	public static void method84(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray2 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray2[local11] = true;
		}
	}

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "(I[B)V")
	public static void method85(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(741, arg0);
			local7.anInt609 = arg0.length - 8;
			@Pc(16) int local16 = local7.method404();
			@Pc(19) int local19 = local7.method404();
			@Pc(32) int local32 = local7.method404();
			@Pc(35) int local35 = local7.method404();
			@Pc(43) Class6_Sub2_Sub3 local43 = new Class6_Sub2_Sub3(741, arg0);
			local43.anInt609 = 0;
			@Pc(52) int local52 = local16 + 0 + 2;
			@Pc(58) Class6_Sub2_Sub3 local58 = new Class6_Sub2_Sub3(741, arg0);
			local58.anInt609 = local52;
			@Pc(65) int local65 = local52 + local19;
			@Pc(71) Class6_Sub2_Sub3 local71 = new Class6_Sub2_Sub3(741, arg0);
			local71.anInt609 = local65;
			@Pc(78) int local78 = local65 + local32;
			@Pc(84) Class6_Sub2_Sub3 local84 = new Class6_Sub2_Sub3(741, arg0);
			local84.anInt609 = local78;
			@Pc(91) int local91 = local78 + local35;
			@Pc(97) Class6_Sub2_Sub3 local97 = new Class6_Sub2_Sub3(741, arg0);
			local97.anInt609 = local91;
			@Pc(106) Class37 local106 = new Class37(9, local97);
			@Pc(109) int local109 = local43.method404();
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			@Pc(118) int[] local118 = new int[500];
			@Pc(121) int[] local121 = new int[500];
			for (@Pc(123) int local123 = 0; local123 < local109; local123++) {
				@Pc(128) int local128 = local43.method404();
				@Pc(136) Class12 local136 = aClass12Array1[local128] = new Class12();
				local136.anInt104 = local84.method402();
				local136.aClass37_1 = local106;
				@Pc(146) int local146 = local43.method402();
				@Pc(148) int local148 = -1;
				@Pc(150) int local150 = 0;
				@Pc(157) int local157;
				for (@Pc(152) int local152 = 0; local152 < local146; local152++) {
					local157 = local58.method402();
					if (local157 > 0) {
						if (local106.anIntArray140[local152] != 0) {
							for (@Pc(168) int local168 = local152 - 1; local168 > local148; local168--) {
								if (local106.anIntArray140[local168] == 0) {
									local112[local150] = local168;
									local115[local150] = 0;
									local118[local150] = 0;
									local121[local150] = 0;
									local150++;
									break;
								}
							}
						}
						local112[local150] = local152;
						@Pc(204) short local204 = 0;
						if (local106.anIntArray140[local152] == 3) {
							local204 = 128;
						}
						if ((local157 & 0x1) == 0) {
							local115[local150] = local204;
						} else {
							local115[local150] = local71.method415();
						}
						if ((local157 & 0x2) == 0) {
							local118[local150] = local204;
						} else {
							local118[local150] = local71.method415();
						}
						if ((local157 & 0x4) == 0) {
							local121[local150] = local204;
						} else {
							local121[local150] = local71.method415();
						}
						local148 = local152;
						local150++;
						if (local106.anIntArray140[local152] == 5) {
							aBooleanArray2[local128] = false;
						}
					}
				}
				local136.anInt105 = local150;
				local136.anIntArray33 = new int[local150];
				local136.anIntArray34 = new int[local150];
				local136.anIntArray35 = new int[local150];
				local136.anIntArray36 = new int[local150];
				for (local157 = 0; local157 < local150; local157++) {
					local136.anIntArray33[local157] = local112[local157];
					local136.anIntArray34[local157] = local115[local157];
					local136.anIntArray35[local157] = local118[local157];
					local136.anIntArray36[local157] = local121[local157];
				}
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("72413, " + -40035 + ", " + arg0 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "(Z)V")
	public static void method86() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("9043, " + false + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "(II)Lclient!HJEXDJAH;")
	public static Class12 method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return aClass12Array1 == null ? null : aClass12Array1[arg1];
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("18108, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJEXDJAH", name = "a", descriptor = "(IZ)Z")
	public static boolean method88(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("59407, " + arg0 + ", " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJEXDJAH", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
