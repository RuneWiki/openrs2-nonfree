import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!ki;")
	public static Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public static int anInt1249 = 0;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt1250 = -2;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method1152(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method1153() {
		Static382.method3540(10);
		Static95.method1839();
		System.gc();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!tf;)Ljava/lang/String;")
	public static String method1154(@OriginalArg(1) int arg0, @OriginalArg(2) Class240 arg1) {
		if (!Static50.method1146(arg1).method5904(arg0) && arg1.anObjectArray31 == null) {
			return null;
		} else if (arg1.aStringArray34 == null || arg1.aStringArray34.length <= arg0 || arg1.aStringArray34[arg0] == null || arg1.aStringArray34[arg0].trim().length() == 0) {
			return Static341.aBoolean453 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)I")
	public static int method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg3 : arg0;
		@Pc(40) int local40 = local12 < 4 ? arg3 : local12 == 12 || local12 == 14 ? arg0 : arg2;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(FIIIZIII)[I")
	public static int[] method1157(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub3_Sub15 local10 = new Class4_Sub3_Sub15();
		local10.anInt3765 = 8;
		local10.anInt3761 = 4;
		local10.anInt3771 = 35;
		local10.aBoolean237 = true;
		local10.anInt3774 = 8;
		local10.anInt3769 = (int) (arg0 * 4096.0F);
		local10.method6341();
		Static447.method6111(2048, 1);
		local10.method3386(local6, 0);
		return local6;
	}
}
