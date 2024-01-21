import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UEUSJYYO")
public final class Class37 {

	@OriginalMember(owner = "client!UEUSJYYO", name = "a", descriptor = "I")
	private static int anInt669;

	@OriginalMember(owner = "client!UEUSJYYO", name = "c", descriptor = "Z")
	private static boolean aBoolean162;

	@OriginalMember(owner = "client!UEUSJYYO", name = "e", descriptor = "[Lclient!UEUSJYYO;")
	private static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!UEUSJYYO", name = "m", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!UEUSJYYO", name = "b", descriptor = "I")
	private static int anInt670 = -28858;

	@OriginalMember(owner = "client!UEUSJYYO", name = "d", descriptor = "I")
	private static int anInt671 = -21772;

	@OriginalMember(owner = "client!UEUSJYYO", name = "f", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!UEUSJYYO", name = "g", descriptor = "Lclient!ETJKXQLD;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!UEUSJYYO", name = "h", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!UEUSJYYO", name = "i", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!UEUSJYYO", name = "j", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!UEUSJYYO", name = "k", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!UEUSJYYO", name = "l", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!UEUSJYYO", name = "a", descriptor = "(I)V")
	public static void method506(@OriginalArg(0) int arg0) {
		aClass37Array1 = new Class37[arg0 + 1];
		aBooleanArray10 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray10[local11] = true;
		}
	}

	@OriginalMember(owner = "client!UEUSJYYO", name = "a", descriptor = "(B[B)V")
	public static void method507(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, anInt669);
			local7.anInt443 = arg0.length - 8;
			@Pc(16) int local16 = local7.method361();
			@Pc(19) int local19 = local7.method361();
			@Pc(22) int local22 = local7.method361();
			@Pc(25) int local25 = local7.method361();
			@Pc(33) Class1_Sub1_Sub3 local33 = new Class1_Sub1_Sub3(arg0, anInt669);
			local33.anInt443 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, anInt669);
			local48.anInt443 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg0, anInt669);
			local61.anInt443 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(arg0, anInt669);
			local74.anInt443 = local68;
			@Pc(85) int local85 = local68 + local25;
			@Pc(91) Class1_Sub1_Sub3 local91 = new Class1_Sub1_Sub3(arg0, anInt669);
			local91.anInt443 = local85;
			@Pc(100) Class13 local100 = new Class13(aBoolean162, local91);
			@Pc(103) int local103 = local33.method361();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method361();
				@Pc(130) Class37 local130 = aClass37Array1[local122] = new Class37();
				local130.anInt672 = local74.method359();
				local130.aClass13_1 = local100;
				@Pc(140) int local140 = local33.method359();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method359();
					if (local151 > 0) {
						if (local100.anIntArray36[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray36[local162] == 0) {
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
						if (local100.anIntArray36[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method372();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method372();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method372();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray36[local146] == 5) {
							aBooleanArray10[local122] = false;
						}
					}
				}
				local130.anInt673 = local144;
				local130.anIntArray146 = new int[local144];
				local130.anIntArray147 = new int[local144];
				local130.anIntArray148 = new int[local144];
				local130.anIntArray149 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray146[local151] = local106[local151];
					local130.anIntArray147[local151] = local109[local151];
					local130.anIntArray148[local151] = local112[local151];
					local130.anIntArray149[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("89515, " + 9 + ", " + arg0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUSJYYO", name = "b", descriptor = "(I)V")
	public static void method508() {
		try {
			aClass37Array1 = null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("26748, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUSJYYO", name = "a", descriptor = "(IB)Lclient!UEUSJYYO;")
	public static Class37 method509(@OriginalArg(0) int arg0) {
		try {
			return aClass37Array1 == null ? null : aClass37Array1[arg0];
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("83811, " + arg0 + ", " + 71 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUSJYYO", name = "a", descriptor = "(II)Z")
	public static boolean method510(@OriginalArg(0) int arg0) {
		try {
			return arg0 == -1;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("11878, " + arg0 + ", " + 9643 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUSJYYO", name = "<init>", descriptor = "()V")
	private Class37() {
	}
}
