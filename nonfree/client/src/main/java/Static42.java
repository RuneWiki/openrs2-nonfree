import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gd", name = "Hb", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array4;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_567 = Static108.method1915("str=");

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_568 = Static108.method1915("i");

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_569 = Static108.method1915("str");

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_570 = Static108.method1915(")4shad");

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_571 = Static108.method1915("b");

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
	public static int anInt1204 = -1;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_572 = Static108.method1915(")4b");

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_573 = Static108.method1915("col=");

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_574 = Static108.method1915(")4str");

	@OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
	public static int anInt1205 = 256;

	@OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_575 = Static108.method1915("shad");

	@OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_576 = Static108.method1915("shad=");

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_577 = Static108.method1915(")4col");

	@OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
	public static int anInt1206 = -1;

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_578 = Static108.method1915("u=");

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
	public static int anInt1207 = -1;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_579 = Static108.method1915("gt");

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
	public static int anInt1208 = 0;

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_580 = Static108.method1915("img=");

	@OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_581 = Static108.method1915("u");

	@OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "I")
	public static int anInt1212 = -1;

	@OriginalMember(owner = "client!gd", name = "Bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_582 = Static108.method1915(")4i");

	@OriginalMember(owner = "client!gd", name = "Db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_583 = Static108.method1915(")4u");

	@OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_584 = Static108.method1915("lt");

	@OriginalMember(owner = "client!gd", name = "Fb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_585 = Static108.method1915("br");

	@OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
	public static int anInt1214 = 0;

	@OriginalMember(owner = "client!gd", name = "Jb", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array11 = new Class39[100];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIII)V")
	public static void method739(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static15.anInt2152;
		@Pc(9) int local9 = Static15.anInt2152 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static15.anInt2153) {
			local20 = Static15.anInt2153 - arg2;
			arg4 -= local20;
			arg2 = Static15.anInt2153;
			local13 = local20 * arg3;
			local5 += local20 * Static15.anInt2152;
		}
		if (arg2 + arg4 > Static15.anInt2150) {
			arg4 -= arg2 + arg4 - Static15.anInt2150;
		}
		if (arg1 < Static15.anInt2151) {
			local20 = Static15.anInt2151 - arg1;
			arg3 -= local20;
			arg1 = Static15.anInt2151;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static15.anInt2155) {
			local20 = arg1 + arg3 - Static15.anInt2155;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method757(Static15.anIntArray326, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;)Lclient!kd;")
	public static Class39 method744(@OriginalArg(0) Class39 arg0) {
		@Pc(3) int local3 = arg0.method1175();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray50[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class39 local28 = new Class39();
		local28.anInt1707 = local3 + local5;
		local28.aByteArray50 = new byte[local28.anInt1707];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray50[local42];
			if (local48 == 60) {
				local28.aByteArray50[local40++] = 60;
				local28.aByteArray50[local40++] = 108;
				local28.aByteArray50[local40++] = 116;
				local28.aByteArray50[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray50[local40++] = 60;
				local28.aByteArray50[local40++] = 103;
				local28.aByteArray50[local40++] = 116;
				local28.aByteArray50[local40++] = 62;
			} else {
				local28.aByteArray50[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
	public static void method746() {
		aClass39_584 = null;
		aClass39_579 = null;
		aClass39_580 = null;
		aClass39_585 = null;
		aClass39_573 = null;
		aClass39_577 = null;
		aClass39_571 = null;
		aClass39_572 = null;
		aClass39_568 = null;
		aClass39_582 = null;
		aClass39_578 = null;
		aClass39_581 = null;
		aClass39_583 = null;
		aClass39_576 = null;
		aClass39_575 = null;
		aClass39_570 = null;
		aClass39_567 = null;
		aClass39_569 = null;
		aClass39_574 = null;
		aClass1_Sub1_Sub4_Sub1Array4 = null;
		aRandom1 = null;
		aClass39Array11 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method752(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method757(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIIII)V")
	public static void method758(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static15.anInt2152;
		@Pc(9) int local9 = Static15.anInt2152 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static15.anInt2153) {
			local20 = Static15.anInt2153 - arg2;
			arg4 -= local20;
			arg2 = Static15.anInt2153;
			local13 = local20 * arg3;
			local5 += local20 * Static15.anInt2152;
		}
		if (arg2 + arg4 > Static15.anInt2150) {
			arg4 -= arg2 + arg4 - Static15.anInt2150;
		}
		if (arg1 < Static15.anInt2151) {
			local20 = Static15.anInt2151 - arg1;
			arg3 -= local20;
			arg1 = Static15.anInt2151;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static15.anInt2155) {
			local20 = arg1 + arg3 - Static15.anInt2155;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method752(Static15.anIntArray326, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
