import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!o", name = "R", descriptor = "Lclient!id;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Unable to find ";

	@OriginalMember(owner = "client!o", name = "O", descriptor = "[I")
	public static int[] anIntArray409 = new int[5];

	@OriginalMember(owner = "client!o", name = "P", descriptor = "[F")
	public static float[] aFloatArray11 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	public static int anInt4175 = 0;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lclient!ka;")
	public static Class93_Sub1 method3386() {
		@Pc(21) Class93_Sub1 local21 = new Class93_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], Static165.aByteArrayArray9[0], Static199.anIntArray438);
		Static293.method4502();
		return local21;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method3387() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static105.anInt1095];
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static105.anInt1095; local12++) {
			@Pc(19) Class60 local19 = Static87.method1546(local12);
			if (local19.anInt2255 >= 0 || local19.anInt2230 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static278.anIntArray523 = new int[local7];
		for (local12 = 0; local12 < local7; local12++) {
			Static278.anIntArray523[local12] = local10[local12];
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!qc;IIIII)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static80.method1475(arg1.anInt5358, arg4, arg2, arg5, arg0, 0, arg1.anInt5371, arg3);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method3389(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, arg0.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(local9 + arg2.length());
		}
		return arg1;
	}
}
