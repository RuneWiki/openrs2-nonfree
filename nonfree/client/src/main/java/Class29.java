import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OJYMITMR")
public final class Class29 {

	@OriginalMember(owner = "client!OJYMITMR", name = "b", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!OJYMITMR", name = "c", descriptor = "[Lclient!OJYMITMR;")
	private static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!OJYMITMR", name = "k", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "I")
	private static int anInt512 = 4;

	@OriginalMember(owner = "client!OJYMITMR", name = "d", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!OJYMITMR", name = "e", descriptor = "Lclient!EPQQXCGW;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!OJYMITMR", name = "f", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!OJYMITMR", name = "g", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!OJYMITMR", name = "h", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!OJYMITMR", name = "i", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!OJYMITMR", name = "j", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(I)V")
	public static void method305(@OriginalArg(0) int arg0) {
		aClass29Array1 = new Class29[arg0 + 1];
		aBooleanArray8 = new boolean[arg0 + 1];
		for (@Pc(11) int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray8[local11] = true;
		}
	}

	@OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(B[B)V")
	public static void method306(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg1, 713);
			local7.anInt239 = arg1.length - 8;
			@Pc(16) int local16 = local7.method154();
			@Pc(19) int local19 = local7.method154();
			@Pc(22) int local22 = local7.method154();
			@Pc(25) int local25 = local7.method154();
			if (arg0 == -123) {
				@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg1, 713);
				local37.anInt239 = 0;
				@Pc(46) int local46 = local16 + 0 + 2;
				@Pc(52) Class8_Sub1_Sub3 local52 = new Class8_Sub1_Sub3(arg1, 713);
				local52.anInt239 = local46;
				@Pc(59) int local59 = local46 + local19;
				@Pc(65) Class8_Sub1_Sub3 local65 = new Class8_Sub1_Sub3(arg1, 713);
				local65.anInt239 = local59;
				@Pc(72) int local72 = local59 + local22;
				@Pc(78) Class8_Sub1_Sub3 local78 = new Class8_Sub1_Sub3(arg1, 713);
				local78.anInt239 = local72;
				@Pc(85) int local85 = local72 + local25;
				@Pc(91) Class8_Sub1_Sub3 local91 = new Class8_Sub1_Sub3(arg1, 713);
				local91.anInt239 = local85;
				@Pc(100) Class16 local100 = new Class16(true, local91);
				@Pc(103) int local103 = local37.method154();
				@Pc(106) int[] local106 = new int[500];
				@Pc(109) int[] local109 = new int[500];
				@Pc(112) int[] local112 = new int[500];
				@Pc(115) int[] local115 = new int[500];
				for (@Pc(117) int local117 = 0; local117 < local103; local117++) {
					@Pc(122) int local122 = local37.method154();
					@Pc(130) Class29 local130 = aClass29Array1[local122] = new Class29();
					local130.anInt513 = local78.method152();
					local130.aClass16_1 = local100;
					@Pc(140) int local140 = local37.method152();
					@Pc(142) int local142 = -1;
					@Pc(144) int local144 = 0;
					@Pc(151) int local151;
					for (@Pc(146) int local146 = 0; local146 < local140; local146++) {
						local151 = local52.method152();
						if (local151 > 0) {
							if (local100.anIntArray37[local146] != 0) {
								for (@Pc(162) int local162 = local146 - 1; local162 > local142; local162--) {
									if (local100.anIntArray37[local162] == 0) {
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
							if (local100.anIntArray37[local146] == 3) {
								local198 = 128;
							}
							if ((local151 & 0x1) == 0) {
								local109[local144] = local198;
							} else {
								local109[local144] = local65.method165();
							}
							if ((local151 & 0x2) == 0) {
								local112[local144] = local198;
							} else {
								local112[local144] = local65.method165();
							}
							if ((local151 & 0x4) == 0) {
								local115[local144] = local198;
							} else {
								local115[local144] = local65.method165();
							}
							local142 = local146;
							local144++;
							if (local100.anIntArray37[local146] == 5) {
								aBooleanArray8[local122] = false;
							}
						}
					}
					local130.anInt514 = local144;
					local130.anIntArray143 = new int[local144];
					local130.anIntArray144 = new int[local144];
					local130.anIntArray145 = new int[local144];
					local130.anIntArray146 = new int[local144];
					for (local151 = 0; local151 < local144; local151++) {
						local130.anIntArray143[local151] = local106[local151];
						local130.anIntArray144[local151] = local109[local151];
						local130.anIntArray145[local151] = local112[local151];
						local130.anIntArray146[local151] = local115[local151];
					}
				}
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("60213, " + arg0 + ", " + arg1 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(Z)V")
	public static void method307() {
		try {
			aClass29Array1 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("38903, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJYMITMR", name = "b", descriptor = "(I)Lclient!OJYMITMR;")
	public static Class29 method308(@OriginalArg(0) int arg0) {
		return aClass29Array1 == null ? null : aClass29Array1[arg0];
	}

	@OriginalMember(owner = "client!OJYMITMR", name = "a", descriptor = "(II)Z")
	public static boolean method309(@OriginalArg(0) int arg0) {
		try {
			if (anInt512 != 4) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return arg0 == -1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("10921, " + arg0 + ", " + 4 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJYMITMR", name = "<init>", descriptor = "()V")
	private Class29() {
	}
}
