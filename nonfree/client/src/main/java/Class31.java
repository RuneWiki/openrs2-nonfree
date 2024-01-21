import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OZAHMTPS")
public final class Class31 {

	@OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "I")
	private static int anInt492;

	@OriginalMember(owner = "client!OZAHMTPS", name = "c", descriptor = "[Lclient!OZAHMTPS;")
	private static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!OZAHMTPS", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!OZAHMTPS", name = "d", descriptor = "I")
	public int anInt493;

	@OriginalMember(owner = "client!OZAHMTPS", name = "e", descriptor = "Lclient!LMYEIVWK;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!OZAHMTPS", name = "f", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!OZAHMTPS", name = "g", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!OZAHMTPS", name = "h", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!OZAHMTPS", name = "i", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!OZAHMTPS", name = "j", descriptor = "[I")
	public int[] anIntArray107;

	static {
		aBoolean123 = true;
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "(I)V")
	public static void method291(@OriginalArg(0) int arg0) {
		aClass31Array1 = new Class31[arg0 + 1];
		aBooleanArray7 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray7[local11] = true;
		}
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "([BI)V")
	public static void method292(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(arg0, -46859);
			local7.anInt556 = arg0.length - 8;
			@Pc(16) int local16 = local7.method342();
			@Pc(19) int local19 = local7.method342();
			@Pc(22) int local22 = local7.method342();
			@Pc(25) int local25 = local7.method342();
			@Pc(33) Class2_Sub1_Sub4 local33 = new Class2_Sub1_Sub4(arg0, -46859);
			local33.anInt556 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class2_Sub1_Sub4 local48 = new Class2_Sub1_Sub4(arg0, -46859);
			local48.anInt556 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class2_Sub1_Sub4 local61 = new Class2_Sub1_Sub4(arg0, -46859);
			local61.anInt556 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class2_Sub1_Sub4 local74 = new Class2_Sub1_Sub4(arg0, -46859);
			local74.anInt556 = local68;
			@Pc(85) int local85 = local68 + local25;
			@Pc(91) Class2_Sub1_Sub4 local91 = new Class2_Sub1_Sub4(arg0, -46859);
			local91.anInt556 = local85;
			@Pc(100) Class22 local100 = new Class22(local91, 0);
			@Pc(103) int local103 = local33.method342();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method342();
				@Pc(130) Class31 local130 = aClass31Array1[local122] = new Class31();
				local130.anInt493 = local74.method340();
				local130.aClass22_1 = local100;
				@Pc(140) int local140 = local33.method340();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method340();
					if (local151 > 0) {
						if (local100.anIntArray81[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray81[local162] == 0) {
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
						if (local100.anIntArray81[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method353();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method353();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method353();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray81[local146] == 5) {
							aBooleanArray7[local122] = false;
						}
					}
				}
				local130.anInt494 = local144;
				local130.anIntArray104 = new int[local144];
				local130.anIntArray105 = new int[local144];
				local130.anIntArray106 = new int[local144];
				local130.anIntArray107 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray104[local151] = local106[local151];
					local130.anIntArray105[local151] = local109[local151];
					local130.anIntArray106[local151] = local112[local151];
					local130.anIntArray107[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("96077, " + arg0 + ", " + 0 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "b", descriptor = "(I)V")
	public static void method293() {
		try {
			aClass31Array1 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("48513, " + -681 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "c", descriptor = "(I)Lclient!OZAHMTPS;")
	public static Class31 method294(@OriginalArg(0) int arg0) {
		return aClass31Array1 == null ? null : aClass31Array1[arg0];
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "a", descriptor = "(IB)Z")
	public static boolean method295(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 == -1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("88203, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZAHMTPS", name = "<init>", descriptor = "()V")
	private Class31() {
	}
}
