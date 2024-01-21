import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "Cb", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array8;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	public static int anInt2425 = 0;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	public static int anInt2426 = -1;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
	public static int anInt2427 = -1;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1245 = Static6.method100(")4col");

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1246 = Static6.method100("str");

	@OriginalMember(owner = "client!wa", name = "mb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1247 = Static6.method100(")4str");

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1248 = Static6.method100(")4shad");

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "Lclient!he;")
	public static Class26 aClass26_1249 = Static6.method100("br");

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1250 = Static6.method100("shad");

	@OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
	public static int anInt2429 = 0;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1251 = Static6.method100("u=");

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1252 = Static6.method100("lt");

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
	public static int anInt2430 = -1;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
	public static int anInt2431 = 256;

	@OriginalMember(owner = "client!wa", name = "zb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1253 = Static6.method100("shad=");

	@OriginalMember(owner = "client!wa", name = "Ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_1254 = Static6.method100(")4u");

	@OriginalMember(owner = "client!wa", name = "Bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1255 = Static6.method100("col=");

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1256 = Static6.method100("gt");

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1257 = Static6.method100("str=");

	@OriginalMember(owner = "client!wa", name = "Gb", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "I")
	public static int anInt2433 = 0;

	@OriginalMember(owner = "client!wa", name = "Kb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1258 = Static6.method100("img=");

	@OriginalMember(owner = "client!wa", name = "Lb", descriptor = "I")
	public static int anInt2434 = -1;

	@OriginalMember(owner = "client!wa", name = "Mb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1259 = Static6.method100("u");

	@OriginalMember(owner = "client!wa", name = "Nb", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array22 = new Class26[100];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIIIIII)V")
	public static void method1595(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt3239;
		@Pc(9) int local9 = Static77.anInt3239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt3243) {
			local20 = Static77.anInt3243 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt3243;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt3239;
		}
		if (arg2 + arg4 > Static77.anInt3240) {
			arg4 -= arg2 + arg4 - Static77.anInt3240;
		}
		if (arg1 < Static77.anInt3241) {
			local20 = Static77.anInt3241 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt3241;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt3238) {
			local20 = arg1 + arg3 - Static77.anInt3238;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1622(Static77.anIntArray389, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1599(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(75) int local75 = local50[local58++] + local54[local62++];
			if (local75 < local37) {
				local37 = local75;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
	public static void method1604() {
		aClass26_1252 = null;
		aClass26_1256 = null;
		aClass26_1258 = null;
		aClass26_1249 = null;
		aClass26_1255 = null;
		aClass26_1245 = null;
		aClass26_1251 = null;
		aClass26_1259 = null;
		aClass26_1254 = null;
		aClass26_1253 = null;
		aClass26_1250 = null;
		aClass26_1248 = null;
		aClass26_1257 = null;
		aClass26_1246 = null;
		aClass26_1247 = null;
		aClass3_Sub1_Sub4_Sub1Array8 = null;
		aRandom2 = null;
		aClass26Array22 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIIIII)V")
	public static void method1605(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt3239;
		@Pc(9) int local9 = Static77.anInt3239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt3243) {
			local20 = Static77.anInt3243 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt3243;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt3239;
		}
		if (arg2 + arg4 > Static77.anInt3240) {
			arg4 -= arg2 + arg4 - Static77.anInt3240;
		}
		if (arg1 < Static77.anInt3241) {
			local20 = Static77.anInt3241 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt3241;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt3238) {
			local20 = arg1 + arg3 - Static77.anInt3238;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1621(Static77.anIntArray389, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lclient!he;)Lclient!he;")
	public static Class26 method1614(@OriginalArg(0) Class26 arg0) {
		@Pc(3) int local3 = arg0.method839();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray7[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class26 local28 = new Class26();
		local28.anInt1345 = local3 + local5;
		local28.aByteArray7 = new byte[local28.anInt1345];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray7[local42];
			if (local48 == 60) {
				local28.aByteArray7[local40++] = 60;
				local28.aByteArray7[local40++] = 108;
				local28.aByteArray7[local40++] = 116;
				local28.aByteArray7[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray7[local40++] = 60;
				local28.aByteArray7[local40++] = 103;
				local28.aByteArray7[local40++] = 116;
				local28.aByteArray7[local40++] = 62;
			} else {
				local28.aByteArray7[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1621(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1622(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
