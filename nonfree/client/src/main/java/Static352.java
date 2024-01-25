import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "[Lclient!jr;")
	public static Class10_Sub3[] aClass10_Sub3Array3;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString250 = "Loaded textures";

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static167.method4774(arg0, null, arg2, arg1, arg4, -1, arg3);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5923(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg3 - arg1;
		@Pc(22) int local22 = arg1 + arg4;
		for (@Pc(24) int local24 = arg4; local24 < local22; local24++) {
			Static27.method690(arg5, Static104.anIntArrayArray31[local24], arg6, arg2);
		}
		@Pc(46) int local46 = arg2 + arg1;
		@Pc(51) int local51 = arg5 - arg1;
		for (@Pc(53) int local53 = arg3; local53 > local18; local53--) {
			Static27.method690(arg5, Static104.anIntArrayArray31[local53], arg6, arg2);
		}
		for (@Pc(69) int local69 = local22; local69 <= local18; local69++) {
			@Pc(75) int[] local75 = Static104.anIntArrayArray31[local69];
			Static27.method690(local46, local75, arg6, arg2);
			Static27.method690(local51, local75, arg0, local46);
			Static27.method690(arg5, local75, arg6, local51);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method5925(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static166.aString124 = arg0;
		Static339.anInt2494 = arg2;
		Static345.aString244 = arg1;
		if (Static166.aString124.equals("") || Static345.aString244.equals("")) {
			Static276.anInt5254 = 3;
		} else if (Static296.anInt5689 == -1) {
			Static64.anInt1541 = 1;
			Static165.anInt5076 = 0;
			Static276.anInt5254 = -3;
			Static101.anInt2284 = 0;
			@Pc(40) Class14_Sub4 local40 = new Class14_Sub4(128);
			local40.method2538(10);
			local40.method2541((int) (Math.random() * 9.9999999E7D));
			local40.method2544(Static30.method749(Static166.aString124));
			local40.method2541((int) (Math.random() * 9.9999999E7D));
			local40.method2527(Static345.aString244);
			local40.method2541((int) (Math.random() * 9.9999999E7D));
			local40.method2534(Static166.aBigInteger2, Static101.aBigInteger1);
			Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
			Static164.aClass14_Sub4_Sub2_3.method2538(24);
			Static164.aClass14_Sub4_Sub2_3.method2538(local40.anInt2637 + 2);
			Static164.aClass14_Sub4_Sub2_3.method2509(564);
			Static164.aClass14_Sub4_Sub2_3.method2495(local40.aByteArray74, local40.anInt2637);
		} else {
			Static260.method4485();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!mo;Lclient!mo;)V")
	public static void method5926(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static86.aClass143_50 = arg1;
		Static48.aClass143_33 = arg0;
	}
}
