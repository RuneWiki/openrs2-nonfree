import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt8594;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!am;")
	public static final Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(0, 0);

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "J")
	public static long aLong221 = 0L;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt8595 = 2;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!wca;I)V")
	public static void method7209(@OriginalArg(1) int arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) int arg2) {
		Static414.anInt8621 = arg2;
		Static203.aClass310_7 = arg1;
		Static100.anInt1983 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(9) Class8 local9 = Static244.aClass8Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static244.aClass8Array1[local11] = Static244.aClass8Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class8(arg5, arg0, arg6, arg3, arg4, arg2, arg1);
		} else {
			local9.method377(arg5, arg0, arg4, arg3, arg2, arg6, arg1);
		}
		Static342.anInt6310 = Static507.anInt2745;
		Static244.aClass8Array1[0] = local9;
		Static185.anInt3399++;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[BFIBIIFFLclient!jq;FFII)V")
	public static void method7211(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) float arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) Class148 arg6, @OriginalArg(10) float arg7, @OriginalArg(11) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg3;
			arg6.method6720(arg4 / (float) 128, arg0, arg2 * 127.0F, arg5 / (float) 16, 0, local12, arg8 / (float) 128);
			arg2 *= arg7;
			arg8 *= 2.0F;
			arg5 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg1[local18] = (byte) ((float) arg1[local18] + local12[local56]);
				local18++;
			}
			arg4 *= 2.0F;
		}
		local18 = arg3;
		for (local56 = 0; local56 < 16384; local56++) {
			arg1[local18] = (byte) (arg1[local18] + 127);
			local18++;
		}
	}
}
