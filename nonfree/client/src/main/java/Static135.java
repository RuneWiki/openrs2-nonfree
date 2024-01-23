import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_262 = Static199.method3560("gt");

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "Lclient!qe;")
	public static Class78 aClass78_263 = Static199.method3560("reg");

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "Lclient!qe;")
	public static Class78 aClass78_264 = Static199.method3560("shy");

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_265 = Static199.method3560("u");

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "Lclient!qe;")
	public static Class78 aClass78_266 = Static199.method3560("img=");

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_267 = Static199.method3560("col=");

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_268 = Static199.method3560(")4str");

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_269 = Static199.method3560("trans=");

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_270 = Static199.method3560(")4u");

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "Lclient!qe;")
	public static Class78 aClass78_271 = Static199.method3560(")4trans");

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_272 = Static199.method3560("shad=");

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_273 = Static199.method3560("shad");

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_274 = Static199.method3560("lt");

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_275 = Static199.method3560(")4col");

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_276 = Static199.method3560("str");

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "Lclient!qe;")
	public static Class78 aClass78_277 = Static199.method3560("str=");

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_278 = Static167.method3037(100);

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_279 = Static199.method3560(")4shad");

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_280 = Static199.method3560("u=");

	@OriginalMember(owner = "client!nc", name = "kb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_281 = Static199.method3560("times");

	@OriginalMember(owner = "client!nc", name = "lb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_282 = Static199.method3560("copy");

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_283 = Static199.method3560("nbsp");

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_284 = Static199.method3560("br");

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_285 = Static199.method3560("euro");

	@OriginalMember(owner = "client!nc", name = "rb", descriptor = "I")
	public static int anInt1127 = 0;

	@OriginalMember(owner = "client!nc", name = "sb", descriptor = "I")
	public static int anInt1128 = -1;

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!nc", name = "ub", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
	public static int anInt1131 = 256;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
	public static int anInt1132 = -1;

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "I")
	public static int anInt1133 = -1;

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "I")
	public static int anInt1134 = 256;

	@OriginalMember(owner = "client!nc", name = "zb", descriptor = "I")
	public static int anInt1135 = -1;

	@OriginalMember(owner = "client!nc", name = "Ab", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!nc", name = "Bb", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array11 = new Class78[100];

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!qe;)Lclient!qe;")
	public static Class78 method894(@OriginalArg(0) Class78 arg0) {
		@Pc(3) int local3 = arg0.method3041();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray48[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class78 local28 = new Class78();
		local28.anInt3831 = local3 + local5;
		local28.aByteArray48 = new byte[local28.anInt3831];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray48[local42];
			if (local48 == 60) {
				local28.aByteArray48[local40++] = 60;
				local28.aByteArray48[local40++] = 108;
				local28.aByteArray48[local40++] = 116;
				local28.aByteArray48[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray48[local40++] = 60;
				local28.aByteArray48[local40++] = 103;
				local28.aByteArray48[local40++] = 116;
				local28.aByteArray48[local40++] = 62;
			} else {
				local28.aByteArray48[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method903(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
}
