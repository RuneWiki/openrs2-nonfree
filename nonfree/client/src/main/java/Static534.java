import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	public static int anInt8944;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_269 = new Class235(4, -2);

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Z")
	public static boolean aBoolean695 = true;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!um", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!um", name = "k", descriptor = "[I")
	public static final int[] anIntArray679 = new int[1000];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!fea;Lclient!fea;)V")
	public static void method7312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub3_Sub2 arg3, @OriginalArg(4) Class8_Sub3_Sub2 arg4) {
		@Pc(4) Class39 local4 = Static589.method7833(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub3_Sub2_2 = arg3;
		local4.aClass8_Sub3_Sub2_1 = arg4;
		@Pc(19) int local19 = Static199.aClass47Array1 == Static557.aClass47Array3 ? 1 : 0;
		if (!arg3.method7622()) {
			Static88.aClass8_Sub3ArrayArray2[local19][Static583.anIntArray731[local19]++] = arg3;
		} else if (arg3.method7620()) {
			Static471.aClass8_Sub3ArrayArray3[local19][Static437.anIntArray588[local19]++] = arg3;
		} else {
			Static34.aClass8_Sub3ArrayArray4[local19][Static11.anIntArray12[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7622()) {
			if (arg4.method7620()) {
				Static471.aClass8_Sub3ArrayArray3[local19][Static437.anIntArray588[local19]++] = arg4;
				return;
			}
			Static34.aClass8_Sub3ArrayArray4[local19][Static11.anIntArray12[local19]++] = arg4;
			return;
		}
		Static88.aClass8_Sub3ArrayArray2[local19][Static583.anIntArray731[local19]++] = arg4;
	}
}
