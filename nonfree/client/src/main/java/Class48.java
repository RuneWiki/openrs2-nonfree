import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YYYUATIU")
public final class Class48 {

	@OriginalMember(owner = "client!YYYUATIU", name = "b", descriptor = "I")
	private static int anInt793;

	@OriginalMember(owner = "client!YYYUATIU", name = "c", descriptor = "[Lclient!YYYUATIU;")
	private static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!YYYUATIU", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "I")
	private static int anInt792 = 9;

	@OriginalMember(owner = "client!YYYUATIU", name = "d", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!YYYUATIU", name = "e", descriptor = "Lclient!CKXVXQFJ;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!YYYUATIU", name = "f", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!YYYUATIU", name = "g", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!YYYUATIU", name = "h", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!YYYUATIU", name = "i", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!YYYUATIU", name = "j", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "(I)V")
	public static void method532(@OriginalArg(0) int arg0) {
		aClass48Array1 = new Class48[arg0 + 1];
		aBooleanArray9 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray9[local11] = true;
		}
	}

	@OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "([BI)V")
	public static void method533(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(-587, arg0);
			local7.anInt404 = arg0.length - 8;
			@Pc(16) int local16 = local7.method264();
			@Pc(19) int local19 = local7.method264();
			@Pc(22) int local22 = local7.method264();
			@Pc(25) int local25 = local7.method264();
			@Pc(37) Class6_Sub2_Sub3 local37 = new Class6_Sub2_Sub3(-587, arg0);
			local37.anInt404 = 0;
			@Pc(46) int local46 = local16 + 0 + 2;
			@Pc(52) Class6_Sub2_Sub3 local52 = new Class6_Sub2_Sub3(-587, arg0);
			local52.anInt404 = local46;
			@Pc(59) int local59 = local46 + local19;
			@Pc(65) Class6_Sub2_Sub3 local65 = new Class6_Sub2_Sub3(-587, arg0);
			local65.anInt404 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class6_Sub2_Sub3 local78 = new Class6_Sub2_Sub3(-587, arg0);
			local78.anInt404 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class6_Sub2_Sub3 local91 = new Class6_Sub2_Sub3(-587, arg0);
			local91.anInt404 = local85;
			@Pc(100) Class5 local100 = new Class5(false, local91);
			@Pc(103) int local103 = local37.method264();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local37.method264();
				@Pc(130) Class48 local130 = aClass48Array1[local122] = new Class48();
				local130.anInt794 = local78.method262();
				local130.aClass5_1 = local100;
				@Pc(140) int local140 = local37.method262();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local52.method262();
					if (local151 > 0) {
						if (local100.anIntArray25[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray25[local162] == 0) {
									local106[local144] = local162;
									local109[local144] = 0;
									local112[local144] = 0;
									local115[local144] = 0;
									local144++;
									break;
								}
							}
						}
						local106[local144] = local146;
						@Pc(198) short local198 = 0;
						if (local100.anIntArray25[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method275();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method275();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method275();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray25[local146] == 5) {
							aBooleanArray9[local122] = false;
						}
					}
				}
				local130.anInt795 = local144;
				local130.anIntArray195 = new int[local144];
				local130.anIntArray196 = new int[local144];
				local130.anIntArray197 = new int[local144];
				local130.anIntArray198 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray195[local151] = local106[local151];
					local130.anIntArray196[local151] = local109[local151];
					local130.anIntArray197[local151] = local112[local151];
					local130.anIntArray198[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("46805, " + arg0 + ", " + 0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYYUATIU", name = "b", descriptor = "(I)V")
	public static void method534() {
		try {
			if (anInt792 != 9) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			aClass48Array1 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("65712, " + 9 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYYUATIU", name = "c", descriptor = "(I)Lclient!YYYUATIU;")
	public static Class48 method535(@OriginalArg(0) int arg0) {
		return aClass48Array1 == null ? null : aClass48Array1[arg0];
	}

	@OriginalMember(owner = "client!YYYUATIU", name = "a", descriptor = "(ZI)Z")
	public static boolean method536(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("74170, " + true + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYYUATIU", name = "<init>", descriptor = "()V")
	private Class48() {
	}
}
