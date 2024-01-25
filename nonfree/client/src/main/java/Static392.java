import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Lclient!o;")
	public static Class85 aClass85_20;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!ul;")
	public static Class252 aClass252_121;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_105 = new Class242(32, 3);

	@OriginalMember(owner = "client!th", name = "q", descriptor = "[I")
	public static final int[] anIntArray462 = new int[50];

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "F")
	public static float aFloat81 = 0.0F;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	public static int anInt6309 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!za;IIIIZII)V")
	public static void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static464.method5366(arg2, arg4, arg3);
		@Pc(20) Class87 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static86.aClass248_7.method5246(local11.method4895());
			local26 = local11.method4899() & 0x3;
			local30 = local11.method4897();
			if (local20.anInt1944 == -1) {
				local45 = arg7;
				if (local20.anInt1928 > 0) {
					local45 = arg0;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg1.method5656(arg6, 4, local45, arg5);
					} else if (local26 == 1) {
						arg1.method5658(arg6, local45, 4, arg5);
					} else if (local26 == 2) {
						arg1.method5656(arg6 + 3, 4, local45, arg5);
					} else if (local26 == 3) {
						arg1.method5658(arg6, local45, 4, arg5 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg1.method5664(1, arg5, local45, 1, arg6);
					} else if (local26 == 1) {
						arg1.method5664(1, arg5, local45, 1, arg6 + 3);
					} else if (local26 == 2) {
						arg1.method5664(1, arg5 + 3, local45, 1, arg6 + 3);
					} else if (local26 == 3) {
						arg1.method5664(1, arg5 + 3, local45, 1, arg6);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg1.method5658(arg6, local45, 4, arg5);
					} else if (local26 == 1) {
						arg1.method5656(arg6 + 3, 4, local45, arg5);
					} else if (local26 == 2) {
						arg1.method5658(arg6, local45, 4, arg5 + 3);
					} else if (local26 == 3) {
						arg1.method5656(arg6, 4, local45, arg5);
					}
				}
			} else {
				Static465.method5669(arg6, local26, local20, arg5, arg1);
			}
		}
		local11 = (Interface7) Static423.method5398(arg2, arg4, arg3, nc.class);
		if (local11 != null) {
			local20 = Static86.aClass248_7.method5246(local11.method4895());
			local26 = local11.method4899() & 0x3;
			local30 = local11.method4897();
			if (local20.anInt1944 != -1) {
				Static465.method5669(arg6, local26, local20, arg5, arg1);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt1928 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg1.method5675(arg5, arg6, arg5 + 3, arg6 + 3, local45);
				} else {
					arg1.method5675(arg5 + 3, arg6, arg5, arg6 + 3, local45);
				}
			}
		}
		local11 = (Interface7) Static168.method2856(arg2, arg4, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static86.aClass248_7.method5246(local11.method4895());
		local26 = local11.method4899() & 0x3;
		if (local20.anInt1944 != -1) {
			Static465.method5669(arg6, local26, local20, arg5, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!wm;)Lclient!cu;")
	public static Class46_Sub1 method5092(@OriginalArg(1) Class1_Sub19 arg0) {
		return new Class46_Sub1(arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2881(), arg0.method2881(), arg0.method2915());
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5094(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)Z")
	public static boolean method5095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
