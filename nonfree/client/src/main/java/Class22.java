import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ICYGYVTE")
public final class Class22 {

	@OriginalMember(owner = "client!ICYGYVTE", name = "b", descriptor = "[Lclient!ICYGYVTE;")
	private static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!ICYGYVTE", name = "j", descriptor = "[Z")
	private static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!ICYGYVTE", name = "a", descriptor = "Z")
	private static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!ICYGYVTE", name = "c", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!ICYGYVTE", name = "d", descriptor = "Lclient!OAUECDUZ;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!ICYGYVTE", name = "e", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!ICYGYVTE", name = "f", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!ICYGYVTE", name = "g", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!ICYGYVTE", name = "h", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!ICYGYVTE", name = "i", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!ICYGYVTE", name = "a", descriptor = "(I)V")
	public static void method270(@OriginalArg(0) int arg0) {
		aClass22Array1 = new Class22[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	@OriginalMember(owner = "client!ICYGYVTE", name = "a", descriptor = "(I[B)V")
	public static void method271(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg1, false);
			local7.anInt242 = arg1.length - 8;
			@Pc(16) int local16 = local7.method169();
			@Pc(19) int local19 = local7.method169();
			@Pc(22) int local22 = local7.method169();
			@Pc(25) int local25 = local7.method169();
			@Pc(33) Class4_Sub1_Sub3 local33 = new Class4_Sub1_Sub3(arg1, false);
			local33.anInt242 = 0;
			@Pc(42) int local42 = local16 + 0 + 2;
			@Pc(48) Class4_Sub1_Sub3 local48 = new Class4_Sub1_Sub3(arg1, false);
			local48.anInt242 = local42;
			@Pc(55) int local55 = local42 + local19;
			@Pc(61) Class4_Sub1_Sub3 local61 = new Class4_Sub1_Sub3(arg1, false);
			local61.anInt242 = local55;
			@Pc(68) int local68 = local55 + local22;
			@Pc(74) Class4_Sub1_Sub3 local74 = new Class4_Sub1_Sub3(arg1, false);
			local74.anInt242 = local68;
			@Pc(81) int local81 = local68 + local25;
			@Pc(85) boolean local85 = false;
			@Pc(91) Class4_Sub1_Sub3 local91 = new Class4_Sub1_Sub3(arg1, false);
			local91.anInt242 = local81;
			@Pc(100) Class32 local100 = new Class32(local91, 39234);
			@Pc(103) int local103 = local33.method169();
			@Pc(106) int[] local106 = new int[500];
			@Pc(109) int[] local109 = new int[500];
			@Pc(112) int[] local112 = new int[500];
			@Pc(115) int[] local115 = new int[500];
			for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
				@Pc(122) int local122 = local33.method169();
				@Pc(130) Class22 local130 = aClass22Array1[local122] = new Class22();
				local130.anInt360 = local74.method167();
				local130.aClass32_1 = local100;
				@Pc(140) int local140 = local33.method167();
				@Pc(142) int local142 = -1;
				@Pc(144) int local144 = 0;
				@Pc(151) int local151;
				for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
					local151 = local48.method167();
					if (local151 > 0) {
						if (local100.anIntArray140[local146] != 0) {
							for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
								if (local100.anIntArray140[local162] == 0) {
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
						if (local100.anIntArray140[local146] == 3) {
							local198 = 128;
						}
						if ((local151 & 0x1) == 0) {
							local109[local144] = local198;
						} else {
							local109[local144] = local61.method180();
						}
						if ((local151 & 0x2) == 0) {
							local112[local144] = local198;
						} else {
							local112[local144] = local61.method180();
						}
						if ((local151 & 0x4) == 0) {
							local115[local144] = local198;
						} else {
							local115[local144] = local61.method180();
						}
						local142 = local146;
						local144++;
						if (local100.anIntArray140[local146] == 5) {
							aBooleanArray3[local122] = false;
						}
					}
				}
				local130.anInt361 = local144;
				local130.anIntArray49 = new int[local144];
				local130.anIntArray50 = new int[local144];
				local130.anIntArray51 = new int[local144];
				local130.anIntArray52 = new int[local144];
				for (local151 = 0; local151 < local144; local151++) {
					local130.anIntArray49[local151] = local106[local151];
					local130.anIntArray50[local151] = local109[local151];
					local130.anIntArray51[local151] = local112[local151];
					local130.anIntArray52[local151] = local115[local151];
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("62019, " + arg0 + ", " + arg1 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ICYGYVTE", name = "a", descriptor = "(B)V")
	public static void method272(@OriginalArg(0) byte arg0) {
		try {
			aClass22Array1 = null;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("81393, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ICYGYVTE", name = "b", descriptor = "(I)Lclient!ICYGYVTE;")
	public static Class22 method273(@OriginalArg(0) int arg0) {
		return aClass22Array1 == null ? null : aClass22Array1[arg0];
	}

	@OriginalMember(owner = "client!ICYGYVTE", name = "a", descriptor = "(II)Z")
	public static boolean method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 5131) {
				aBoolean113 = !aBoolean113;
			}
			return arg0 == -1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("74156, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ICYGYVTE", name = "<init>", descriptor = "()V")
	private Class22() {
	}
}
