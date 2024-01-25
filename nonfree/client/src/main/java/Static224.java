import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_3 = new Class271(8, 1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4021(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static96.aClass221_2.anInt6226 : Static96.aClass221_2.anInt6229) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub4_Sub1 local38 = Static96.aClass221_2.method5320(local31);
			if (local38.aBoolean81 && local38.method961().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static127.aShortArray31 = null;
					Static503.anInt8951 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static127.aShortArray31 = local11;
		Static267.anInt5287 = 0;
		Static503.anInt8951 = local13;
		@Pc(116) String[] local116 = new String[Static503.anInt8951];
		for (@Pc(118) int local118 = 0; local118 < Static503.anInt8951; local118++) {
			local116[local118] = Static96.aClass221_2.method5320(local11[local118]).method961();
		}
		Static141.method2651(Static127.aShortArray31, local116);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lclient!gi;")
	public static Class116_Sub1 method4022(@OriginalArg(1) int arg0) {
		return Static522.aBoolean685 && Static74.anInt8666 <= arg0 && Static13.anInt573 >= arg0 ? Static548.aClass116_Sub1Array2[arg0 - Static74.anInt8666] : null;
	}
}
