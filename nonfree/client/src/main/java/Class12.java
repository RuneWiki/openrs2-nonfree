import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Lclient!g;")
	private static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private static int anInt549 = 1000;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private static int anInt550 = -47594;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!f;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method302(@OriginalArg(0) int arg0) {
		aClass12Array1 = new Class12[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V")
	public static void method303(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(anInt549, arg0);
			local7.anInt751 = arg0.length - 8;
			@Pc(16) int local16 = local7.method482();
			@Pc(19) int local19 = local7.method482();
			@Pc(22) int local22 = local7.method482();
			@Pc(35) int local35 = local7.method482();
			@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(anInt549, arg0);
			local43.anInt751 = 0;
			@Pc(52) int local52 = local16 + 0 + 2;
			@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(anInt549, arg0);
			local58.anInt751 = local52;
			@Pc(65) int local65 = local52 + local19;
			@Pc(71) Class1_Sub1_Sub3 local71 = new Class1_Sub1_Sub3(anInt549, arg0);
			local71.anInt751 = local65;
			@Pc(78) int local78 = local65 + local22;
			@Pc(84) Class1_Sub1_Sub3 local84 = new Class1_Sub1_Sub3(anInt549, arg0);
			local84.anInt751 = local78;
			@Pc(91) int local91 = local78 + local35;
			@Pc(97) Class1_Sub1_Sub3 local97 = new Class1_Sub1_Sub3(anInt549, arg0);
			local97.anInt751 = local91;
			@Pc(106) Class10 local106 = new Class10(local97, -694);
			@Pc(109) int local109 = local43.method482();
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			@Pc(118) int[] local118 = new int[500];
			@Pc(121) int[] local121 = new int[500];
			for (@Pc(123) int local123 = 0; local123 < local109; local123++) {
				@Pc(128) int local128 = local43.method482();
				@Pc(136) Class12 local136 = aClass12Array1[local128] = new Class12();
				local136.anInt551 = local84.method480();
				local136.aClass10_1 = local106;
				@Pc(146) int local146 = local43.method480();
				@Pc(148) int local148 = -1;
				@Pc(150) int local150 = 0;
				@Pc(157) int local157;
				for (@Pc(152) int local152 = 0; local152 < local146; local152++) {
					local157 = local58.method480();
					if (local157 > 0) {
						if (local106.anIntArray161[local152] != 0) {
							for (@Pc(168) int local168 = local152 - 1; local168 > local148; local168--) {
								if (local106.anIntArray161[local168] == 0) {
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
						if (local106.anIntArray161[local152] == 3) {
							local204 = 128;
						}
						if ((local157 & 0x1) == 0) {
							local115[local150] = local204;
						} else {
							local115[local150] = local71.method493();
						}
						if ((local157 & 0x2) == 0) {
							local118[local150] = local204;
						} else {
							local118[local150] = local71.method493();
						}
						if ((local157 & 0x4) == 0) {
							local121[local150] = local204;
						} else {
							local121[local150] = local71.method493();
						}
						local148 = local152;
						local150++;
						if (local106.anIntArray161[local152] == 5) {
							aBooleanArray7[local128] = false;
						}
					}
				}
				local136.anInt552 = local150;
				local136.anIntArray164 = new int[local150];
				local136.anIntArray165 = new int[local150];
				local136.anIntArray166 = new int[local150];
				local136.anIntArray167 = new int[local150];
				for (local157 = 0; local157 < local150; local157++) {
					local136.anIntArray164[local157] = local112[local157];
					local136.anIntArray165[local157] = local115[local157];
					local136.anIntArray166[local157] = local118[local157];
					local136.anIntArray167[local157] = local121[local157];
				}
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("58668, " + -27141 + ", " + arg0 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method304() {
		try {
			aClass12Array1 = null;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("2230, " + 3 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!g;")
	public static Class12 method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != -22323) {
				anInt549 = 28;
			}
			return aClass12Array1 == null ? null : aClass12Array1[arg0];
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("78692, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public static boolean method306(@OriginalArg(0) int arg0) {
		try {
			if (anInt550 != -47594) {
				throw new NullPointerException();
			}
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("82215, " + arg0 + ", " + -47594 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	private Class12() {
	}
}
