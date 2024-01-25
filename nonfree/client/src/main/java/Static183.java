import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!ra;")
	public static Class170 aClass170_65;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Z")
	public static boolean aBoolean261 = true;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString219 = " has logged in.";

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "F")
	public static float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3395(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!jf;Z)I")
	public static int method3396(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1) {
		if (!Static43.method975(arg1).method1144(arg0) && arg1.anObjectArray22 == null) {
			return -1;
		} else if (arg1.anIntArray193 == null || arg0 >= arg1.anIntArray193.length) {
			return -1;
		} else {
			return arg1.anIntArray193[arg0];
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZII)I")
	public static int method3398(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub19 local12 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray135.length; local20++) {
			if (local12.anIntArray135[local20] >= 0 && local12.anIntArray135[local20] < Static177.anInt2358) {
				@Pc(42) Class165 local42 = Static88.method1382(local12.anIntArray135[local20]);
				@Pc(53) int local53 = local42.method4413(arg1, Static129.method2470(arg1).anInt1273);
				if (arg0) {
					local18 += local12.anIntArray134[local20] * local53;
				} else {
					local18 += local53;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZLclient!ra;III)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(5) int arg2) {
		Static110.aClass170_48 = arg1;
		Static52.anInt1325 = 0;
		Static249.anInt4841 = arg2;
		Static200.anInt5712 = 1;
		Static147.aBoolean216 = false;
		Static163.anInt3276 = 10000;
		Static27.anInt5261 = arg0;
	}
}
