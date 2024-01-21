import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1216 = Static120.method1824("nbsp");

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1217 = Static120.method1824("str");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1218 = Static120.method1824("u");

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1219 = Static120.method1824("str=");

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
	public static int anInt3105 = 256;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1220 = Static120.method1824("shad");

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1221 = Static120.method1824("gt");

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public static int anInt3106 = -1;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array21 = new Class80[100];

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1222 = Static120.method1824(")4str");

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1223 = Static120.method1824("lt");

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	public static int anInt3107 = 256;

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1224 = Static120.method1824(")4trans");

	@OriginalMember(owner = "client!ic", name = "mb", descriptor = "I")
	public static int anInt3108 = -1;

	@OriginalMember(owner = "client!ic", name = "nb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1225 = Static120.method1824("br");

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "I")
	public static int anInt3109 = -1;

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1226 = Static120.method1824("shad=");

	@OriginalMember(owner = "client!ic", name = "rb", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!ic", name = "tb", descriptor = "I")
	public static int anInt3112 = 0;

	@OriginalMember(owner = "client!ic", name = "ub", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1227 = Static120.method1824("col=");

	@OriginalMember(owner = "client!ic", name = "vb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1228 = Static120.method1824("u=");

	@OriginalMember(owner = "client!ic", name = "wb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1229 = Static120.method1824("shy");

	@OriginalMember(owner = "client!ic", name = "xb", descriptor = "I")
	public static int anInt3113 = -1;

	@OriginalMember(owner = "client!ic", name = "yb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1230 = Static120.method1824("reg");

	@OriginalMember(owner = "client!ic", name = "zb", descriptor = "I")
	public static int anInt3114 = 0;

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1231 = Static120.method1824("euro");

	@OriginalMember(owner = "client!ic", name = "Bb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1232 = Static120.method1824("copy");

	@OriginalMember(owner = "client!ic", name = "Cb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1233 = Static120.method1824("img=");

	@OriginalMember(owner = "client!ic", name = "Db", descriptor = "I")
	public static int anInt3115 = 0;

	@OriginalMember(owner = "client!ic", name = "Eb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1234 = Static120.method1824(")4shad");

	@OriginalMember(owner = "client!ic", name = "Fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1235 = Static120.method1824(")4u");

	@OriginalMember(owner = "client!ic", name = "Gb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1236 = Static120.method1824(")4col");

	@OriginalMember(owner = "client!ic", name = "Ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1237 = Static120.method1824("trans=");

	@OriginalMember(owner = "client!ic", name = "Jb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1238 = Static120.method1824("times");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!rd;)Lclient!rd;")
	public static Class80 method2250(@OriginalArg(0) Class80 arg0) {
		@Pc(3) int local3 = arg0.method2462();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray43[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class80 local28 = new Class80();
		local28.anInt3421 = local3 + local5;
		local28.aByteArray43 = new byte[local28.anInt3421];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray43[local42];
			if (local48 == 60) {
				local28.aByteArray43[local40++] = 60;
				local28.aByteArray43[local40++] = 108;
				local28.aByteArray43[local40++] = 116;
				local28.aByteArray43[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray43[local40++] = 60;
				local28.aByteArray43[local40++] = 103;
				local28.aByteArray43[local40++] = 116;
				local28.aByteArray43[local40++] = 62;
			} else {
				local28.aByteArray43[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method2255(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2261(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method2271(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
}
