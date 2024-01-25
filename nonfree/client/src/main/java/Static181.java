import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "[[Lclient!ec;")
	public static Class68[][] aClass68ArrayArray3;

	@OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
	public static int anInt3934;

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
	public static int anInt3935;

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
	public static int anInt3937;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "Lclient!wv;")
	public static final Class272 aClass272_2 = new Class272("runescape", 0);

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_102 = new Class158(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3035(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) byte[] local9 = new byte[local6];
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(20) char local20 = arg0.charAt(local11);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				local9[local11] = (byte) local20;
			} else if (local20 == '€') {
				local9[local11] = -128;
			} else if (local20 == '‚') {
				local9[local11] = -126;
			} else if (local20 == 'ƒ') {
				local9[local11] = -125;
			} else if (local20 == '„') {
				local9[local11] = -124;
			} else if (local20 == '…') {
				local9[local11] = -123;
			} else if (local20 == '†') {
				local9[local11] = -122;
			} else if (local20 == '‡') {
				local9[local11] = -121;
			} else if (local20 == 'ˆ') {
				local9[local11] = -120;
			} else if (local20 == '‰') {
				local9[local11] = -119;
			} else if (local20 == 'Š') {
				local9[local11] = -118;
			} else if (local20 == '‹') {
				local9[local11] = -117;
			} else if (local20 == 'Œ') {
				local9[local11] = -116;
			} else if (local20 == 'Ž') {
				local9[local11] = -114;
			} else if (local20 == '‘') {
				local9[local11] = -111;
			} else if (local20 == '’') {
				local9[local11] = -110;
			} else if (local20 == '“') {
				local9[local11] = -109;
			} else if (local20 == '”') {
				local9[local11] = -108;
			} else if (local20 == '•') {
				local9[local11] = -107;
			} else if (local20 == '–') {
				local9[local11] = -106;
			} else if (local20 == '—') {
				local9[local11] = -105;
			} else if (local20 == '˜') {
				local9[local11] = -104;
			} else if (local20 == '™') {
				local9[local11] = -103;
			} else if (local20 == 'š') {
				local9[local11] = -102;
			} else if (local20 == '›') {
				local9[local11] = -101;
			} else if (local20 == 'œ') {
				local9[local11] = -100;
			} else if (local20 == 'ž') {
				local9[local11] = -98;
			} else if (local20 == 'Ÿ') {
				local9[local11] = -97;
			} else {
				local9[local11] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static414.method5610(arg3)) {
			if (aClass68ArrayArray3[arg3] == null) {
				Static39.method745(arg1, arg0, -1, arg6, arg7, arg4, Static293.aClass68ArrayArray4[arg3], arg2, arg5);
			} else {
				Static39.method745(arg1, arg0, -1, arg6, arg7, arg4, aClass68ArrayArray3[arg3], arg2, arg5);
			}
		} else if (arg1 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static58.aBooleanArray8[local20] = true;
			}
		} else {
			Static58.aBooleanArray8[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public static void method3046() {
		if (Static361.aClass157_7 == null) {
			return;
		}
		if (Static361.aClass157_7.anInt4667 == 1) {
			Static361.aClass157_7 = null;
			return;
		}
		if (Static361.aClass157_7.anInt4667 == 2) {
			Static354.method5033(Static16.aClass183_1, 2, Static368.aString60);
			Static361.aClass157_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!nv;IIII)Ljava/awt/Frame;")
	public static Frame method3049(@OriginalArg(1) Class183 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method4138()) {
			return null;
		}
		@Pc(18) Class167[] local18 = Static418.method5681(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (local18[local26].anInt4759 == arg3 && local18[local26].anInt4757 == arg1 && (!local24 || local18[local26].anInt4758 > arg2)) {
				local24 = true;
				arg2 = local18[local26].anInt4758;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(90) Class157 local90 = arg0.method4148(arg2, arg1, arg3);
		while (local90.anInt4667 == 0) {
			Static289.method4249(10L);
		}
		@Pc(101) Frame local101 = (Frame) local90.anObject13;
		if (local101 == null) {
			return null;
		} else if (local90.anInt4667 == 2) {
			Static7.method82(local101, arg0);
			return null;
		} else {
			return local101;
		}
	}
}
