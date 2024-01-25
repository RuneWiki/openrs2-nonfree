import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!jc;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString191;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static int anInt5335;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt5326 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
	public static final boolean aBoolean328 = false;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public static volatile int anInt5338 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method4508(@OriginalArg(0) Class100 arg0) {
		Static334.anInt6502 = arg0.method2304("titlebg");
		Static113.anInt6409 = arg0.method2304("logo");
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method4509(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([[BI[II[BI[[B[I)I")
	public static int method4520(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg1];
		@Pc(15) int local15 = local9 + arg2[arg1];
		@Pc(19) int local19 = arg6[arg3];
		@Pc(25) int local25 = arg2[arg3] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg4[arg1] & 0xFF;
		if (local49 > (arg4[arg3] & 0xFF)) {
			local49 = arg4[arg3] & 0xFF;
		}
		@Pc(78) byte[] local78 = arg5[arg1];
		@Pc(82) byte[] local82 = arg0[arg3];
		@Pc(87) int local87 = local27 - local9;
		@Pc(92) int local92 = local27 - local19;
		for (@Pc(94) int local94 = local27; local94 < local34; local94++) {
			@Pc(107) int local107 = local78[local87++] + local82[local92++];
			if (local107 < local49) {
				local49 = local107;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	public static void method4523(@OriginalArg(1) int arg0) {
		if (Static216.anIntArray359 == null || Static216.anIntArray359.length < arg0) {
			Static216.anIntArray359 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ir;B)V")
	public static void method4526(@OriginalArg(0) Class100 arg0) {
		Static42.aClass100_16 = arg0;
	}
}
