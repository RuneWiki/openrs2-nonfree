import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lclient!uu;")
	public static final Class4_Sub44[] aClass4_Sub44Array1 = new Class4_Sub44[1024];

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
	public static int anInt3202 = 2;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2863(@OriginalArg(0) String arg0) {
		if (!Static449.aBoolean564) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static402.anInt7091;
		@Pc(14) int[] local14 = Static144.anIntArray244;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(28) Class11_Sub5_Sub2_Sub1 local28 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local14[local20]];
			if (local28 != null && Static52.aClass11_Sub5_Sub2_Sub1_2 != local28 && local28.aString31 != null && local28.aString31.equalsIgnoreCase(arg0)) {
				Static448.method6134(Static10.aClass212_3);
				Static457.aClass4_Sub20_Sub1_5.method4558(local14[local20]);
				Static457.aClass4_Sub20_Sub1_5.method4610(Static344.anInt6075);
				Static457.aClass4_Sub20_Sub1_5.method4587(Static25.anInt464);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				Static457.aClass4_Sub20_Sub1_5.method4562(Static383.anInt6696);
				Static258.method3306(local28.method5302(), 0, local28.anIntArray524[0], -2, local28.anIntArray523[0], true, 0, local28.method5302());
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static200.method3529(Static56.aClass21_12.method362(Static168.anInt3290) + arg0);
		}
		if (Static449.aBoolean564) {
			Static294.method4500();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)C")
	public static char method2864(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(38) char local38 = Static121.aCharArray7[local7 - 128];
			if (local38 == '\u0000') {
				local38 = '?';
			}
			local7 = local38;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)Z")
	public static boolean method2867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIBI)V")
	public static void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg0) {
			Static236.method3990(arg0, arg1, Static400.anIntArrayArray54[arg2], arg3);
		} else {
			Static236.method3990(arg1, arg0, Static400.anIntArrayArray54[arg2], arg3);
		}
	}
}
