import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OYJABRDD")
public final class Class29 {

	@OriginalMember(owner = "client!OYJABRDD", name = "c", descriptor = "[Lclient!OYJABRDD;")
	private static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!OYJABRDD", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "I")
	private static int anInt509 = 37470;

	@OriginalMember(owner = "client!OYJABRDD", name = "b", descriptor = "I")
	private static int anInt510 = 3763;

	@OriginalMember(owner = "client!OYJABRDD", name = "d", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!OYJABRDD", name = "e", descriptor = "Lclient!FGDIESUZ;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!OYJABRDD", name = "f", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!OYJABRDD", name = "g", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!OYJABRDD", name = "h", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!OYJABRDD", name = "i", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!OYJABRDD", name = "j", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(I)V")
	public static void method415(@OriginalArg(0) int arg0) {
		aClass29Array1 = new Class29[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "([BI)V")
	public static void method416(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(859, arg0);
			local7.anInt672 = arg0.length - 8;
			@Pc(16) int local16 = local7.method494();
			@Pc(19) int local19 = local7.method494();
			@Pc(22) int local22 = local7.method494();
			@Pc(25) int local25 = local7.method494();
			@Pc(33) Class2_Sub1_Sub4 local33 = new Class2_Sub1_Sub4(859, arg0);
			local33.anInt672 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class2_Sub1_Sub4 local48 = new Class2_Sub1_Sub4(859, arg0);
			local48.anInt672 = local42;
			@Pc(55) boolean local55 = false;
			@Pc(59) int local59 = local42 + local19;
			@Pc(65) Class2_Sub1_Sub4 local65 = new Class2_Sub1_Sub4(859, arg0);
			local65.anInt672 = local59;
			@Pc(72) int local72 = local59 + local22;
			@Pc(78) Class2_Sub1_Sub4 local78 = new Class2_Sub1_Sub4(859, arg0);
			local78.anInt672 = local72;
			@Pc(85) int local85 = local72 + local25;
			@Pc(91) Class2_Sub1_Sub4 local91 = new Class2_Sub1_Sub4(859, arg0);
			local91.anInt672 = local85;
			@Pc(100) Class12 local100 = new Class12(local91, 361);
			@Pc(103) int local103 = local33.method494();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method494();
				@Pc(130) Class29 local130 = aClass29Array1[local122] = new Class29();
				local130.anInt511 = local78.method492();
				local130.aClass12_1 = local100;
				@Pc(140) int local140 = local33.method492();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method492();
					if (local151 > 0) {
						if (local100.anIntArray38[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray38[local162] == 0) {
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
						if (local100.anIntArray38[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local65.method505();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local65.method505();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local65.method505();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray38[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt512 = local144;
				local130.anIntArray151 = new int[local144];
				local130.anIntArray152 = new int[local144];
				local130.anIntArray153 = new int[local144];
				local130.anIntArray154 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray151[local151] = local106[local151];
					local130.anIntArray152[local151] = local109[local151];
					local130.anIntArray153[local151] = local112[local151];
					local130.anIntArray154[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("70490, " + arg0 + ", " + arg1 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(B)V")
	public static void method417(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			aClass29Array1 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("47832, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYJABRDD", name = "b", descriptor = "(I)Lclient!OYJABRDD;")
	public static Class29 method418(@OriginalArg(0) int arg0) {
		return aClass29Array1 == null ? null : aClass29Array1[arg0];
	}

	@OriginalMember(owner = "client!OYJABRDD", name = "a", descriptor = "(BI)Z")
	public static boolean method419(@OriginalArg(1) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("35964, " + -39 + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYJABRDD", name = "<init>", descriptor = "()V")
	private Class29() {
	}
}
