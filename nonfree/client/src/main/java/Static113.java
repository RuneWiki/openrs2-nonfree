import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[S")
	public static final short[] aShortArray27 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;BI)V")
	public static void method2231(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static76.anIntArray122[local7] = Static76.anIntArray122[local7 - 1];
			Static232.anIntArray393[local7] = Static232.anIntArray393[local7 - 1];
			Static271.aStringArray36[local7] = Static271.aStringArray36[local7 - 1];
			Static193.aStringArray29[local7] = Static193.aStringArray29[local7 - 1];
			Static153.aStringArray22[local7] = Static153.aStringArray22[local7 - 1];
			Static283.aStringArray37[local7] = Static283.aStringArray37[local7 - 1];
			Static184.anIntArray309[local7] = Static184.anIntArray309[local7 - 1];
		}
		Static76.anIntArray122[0] = arg1;
		Static271.aStringArray36[0] = arg2;
		Static232.anIntArray393[0] = arg6;
		Static193.aStringArray29[0] = arg3;
		Static153.aStringArray22[0] = arg0;
		Static184.anIntArray309[0] = arg4;
		Static20.anInt316++;
		Static283.aStringArray37[0] = arg5;
		Static242.anInt5663 = Static125.anInt2664;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2232(@OriginalArg(1) String arg0) {
		return Static347.method5639(arg0);
	}
}
