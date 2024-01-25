import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	public static int anInt3044;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	public static int anInt3042 = 500;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString199 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[B[[B[[BI[I[I)I")
	public static int method2822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg5[arg0];
		@Pc(13) int local13 = local7 + arg6[arg0];
		@Pc(17) int local17 = arg5[arg1];
		@Pc(24) int local24 = local17 + arg6[arg1];
		@Pc(31) int local31 = local7;
		if (local17 > local7) {
			local31 = local17;
		}
		@Pc(38) int local38 = local13;
		if (local24 < local13) {
			local38 = local24;
		}
		@Pc(53) int local53 = arg2[arg0] & 0xFF;
		if (local53 > (arg2[arg1] & 0xFF)) {
			local53 = arg2[arg1] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg4[arg0];
		@Pc(78) byte[] local78 = arg3[arg1];
		@Pc(83) int local83 = local31 - local7;
		@Pc(88) int local88 = local31 - local17;
		for (@Pc(90) int local90 = local31; local90 < local38; local90++) {
			@Pc(101) int local101 = local74[local83++] + local78[local88++];
			if (local53 > local101) {
				local53 = local101;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
	public static boolean method2823() {
		try {
			return Static153.method2988();
		} catch (@Pc(14) IOException local14) {
			Static141.method2850();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static127.anInt2797 + "," + Static54.anInt1422 + "," + Static196.anInt3868 + " - " + Static54.anInt1421 + "," + (Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] + Static350.anInt6609) + "," + (Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] + Static237.anInt4696) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static54.anInt1421 && local61 < 50; local61++) {
				local59 = local59 + Static200.aClass7_Sub3_Sub2_3.aByteArray33[local61] + ",";
			}
			Static46.method1056(local59, local19);
			Static258.method4344();
			return true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static270.method4496(Static314.anInt6030, arg2, Static142.anInt3103);
		@Pc(17) int local17 = Static270.method4496(Static314.anInt6030, arg4, Static142.anInt3103);
		@Pc(23) int local23 = Static270.method4496(Static168.anInt3509, arg3, Static61.anInt1534);
		@Pc(29) int local29 = Static270.method4496(Static168.anInt3509, arg0, Static61.anInt1534);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static282.method4681(arg1, local23, Static323.anIntArrayArray55[local36], local29);
		}
	}
}
