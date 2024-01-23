import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public static int anInt870;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!ul;")
	public static Class172 aClass172_5 = new Class172(64);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "[F")
	public static float[] aFloatArray13 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "[I")
	public static int[] anIntArray92 = new int[14];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method799(@OriginalArg(1) Class22 arg0) {
		Static264.aClass22_93 = arg0;
		Static41.anInt849 = Static264.aClass22_93.method679(16);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B[BIII)I")
	public static int method800(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(30) char local30 = arg0.charAt(local17);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg1[arg2 + local17] = (byte) local30;
			} else if (local30 == '€') {
				arg1[arg2 + local17] = -128;
			} else if (local30 == '‚') {
				arg1[local17 + arg2] = -126;
			} else if (local30 == 'ƒ') {
				arg1[arg2 + local17] = -125;
			} else if (local30 == '„') {
				arg1[local17 + arg2] = -124;
			} else if (local30 == '…') {
				arg1[arg2 + local17] = -123;
			} else if (local30 == '†') {
				arg1[arg2 + local17] = -122;
			} else if (local30 == '‡') {
				arg1[arg2 + local17] = -121;
			} else if (local30 == 'ˆ') {
				arg1[arg2 + local17] = -120;
			} else if (local30 == '‰') {
				arg1[arg2 + local17] = -119;
			} else if (local30 == 'Š') {
				arg1[local17 + arg2] = -118;
			} else if (local30 == '‹') {
				arg1[local17 + arg2] = -117;
			} else if (local30 == 'Œ') {
				arg1[arg2 + local17] = -116;
			} else if (local30 == 'Ž') {
				arg1[local17 + arg2] = -114;
			} else if (local30 == '‘') {
				arg1[local17 + arg2] = -111;
			} else if (local30 == '’') {
				arg1[local17 + arg2] = -110;
			} else if (local30 == '“') {
				arg1[arg2 + local17] = -109;
			} else if (local30 == '”') {
				arg1[local17 + arg2] = -108;
			} else if (local30 == '•') {
				arg1[arg2 + local17] = -107;
			} else if (local30 == '–') {
				arg1[local17 + arg2] = -106;
			} else if (local30 == '—') {
				arg1[arg2 + local17] = -105;
			} else if (local30 == '˜') {
				arg1[local17 + arg2] = -104;
			} else if (local30 == '™') {
				arg1[local17 + arg2] = -103;
			} else if (local30 == 'š') {
				arg1[arg2 + local17] = -102;
			} else if (local30 == '›') {
				arg1[local17 + arg2] = -101;
			} else if (local30 == 'œ') {
				arg1[local17 + arg2] = -100;
			} else if (local30 == 'ž') {
				arg1[arg2 + local17] = -98;
			} else if (local30 == 'Ÿ') {
				arg1[local17 + arg2] = -97;
			} else {
				arg1[local17 + arg2] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!dj;Lclient!tm;I)Lclient!bl;")
	public static Class4_Sub8 method802(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class163 arg1) {
		@Pc(29) long local29 = (long) (arg0.anInt1205 + (arg0.anInt1198 + 1 << 16)) + ((long) arg0.anInt1204 << 56) + ((long) arg0.anInt1197 << 32);
		@Pc(35) Class4_Sub8 local35 = (Class4_Sub8) arg1.method4188(local29);
		if (local35 == null) {
			local35 = new Class4_Sub8(arg0.anInt1198, (float) arg0.anInt1205, true, false, arg0.anInt1197);
			arg1.method4181(local29, local35);
		}
		return local35;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method803(@OriginalArg(1) Class22 arg0) {
		Static136.aClass22_46 = arg0;
	}
}
