import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ip", name = "eb", descriptor = "Lclient!pl;")
	public static Class259 aClass259_72;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "[I")
	public static final int[] anIntArray276 = new int[6];

	@OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
	public static int anInt4293 = 0;

	@OriginalMember(owner = "client!ip", name = "S", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!ip", name = "T", descriptor = "I")
	public static int anInt4299 = -1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3602(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILjava/lang/String;ZIZLjava/lang/String;)V")
	public static void method3603(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		Static485.aClass259_150.anInt7135 = 1;
		@Pc(11) String local11 = arg5.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(27) Class352 local27 = Static241.aClass82_1.method1498(arg3);
			if (local27 == null || arg4 != local27.method7723()) {
				return;
			}
			if (local27.method7723()) {
				local18 = local27.aString99;
			} else {
				local16 = local27.anInt9310;
			}
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static296.aClass218_1.anInt6086; local54++) {
			@Pc(61) Class339 local61 = Static296.aClass218_1.method5067(local54);
			if ((!arg2 || local61.aBoolean689) && local61.anInt8947 == -1 && local61.anInt8946 == -1 && local61.anInt8991 == 0 && local61.aString97.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg4) {
						if (!arg1.equals(local61.method7469(local18, arg3))) {
							continue;
						}
					} else if (local61.method7471(arg3, local16) != arg0) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static537.anInt8790 = -1;
					Static384.aShortArray113 = null;
					return;
				}
				if (local14.length <= local52) {
					@Pc(139) short[] local139 = new short[local14.length * 2];
					for (@Pc(141) int local141 = 0; local141 < local52; local141++) {
						local139[local141] = local14[local141];
					}
					local14 = local139;
				}
				local14[local52++] = (short) local54;
			}
		}
		Static537.anInt8790 = local52;
		Static524.anInt8648 = 0;
		Static384.aShortArray113 = local14;
		@Pc(183) String[] local183 = new String[Static537.anInt8790];
		for (@Pc(185) int local185 = 0; local185 < Static537.anInt8790; local185++) {
			local183[local185] = Static296.aClass218_1.method5067(local14[local185]).aString97;
		}
		Static578.method7805(Static384.aShortArray113, local183);
		Static485.aClass259_150.method5975();
		Static485.aClass259_150.anInt7135 = 2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!es;B)Lclient!kk;")
	public static Class9_Sub3 method3604(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) Class9 local7 = Static295.method7119(arg0);
		@Pc(11) int local11 = arg0.method4307();
		@Pc(17) int local17 = arg0.method4307();
		return new Class9_Sub3(local7.aClass62_10, local7.aClass279_9, local7.anInt5035, local7.anInt5029, local7.anInt5034, local7.anInt5030, local7.anInt5032, local7.anInt5027, local7.anInt5031, local11, local17);
	}

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "(I)V")
	public static void method3606() {
		if (Static372.aClass204_24 != null) {
			Static527.aClass175_1 = new Class175();
			Static527.aClass175_1.method3940(Static372.aClass204_24, Static493.aLong227, Static372.aClass204_24.anInt5422, Static372.aClass204_24.aClass198_66.method4365(Static52.anInt1264));
			Static462.aThread5 = new Thread(Static527.aClass175_1, "");
			Static462.aThread5.start();
		}
	}
}
