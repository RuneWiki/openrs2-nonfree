import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
	public static int anInt4504 = -1;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array31 = new Class60[100];

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1535 = Static200.method3116(")4col");

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1536 = Static200.method3116("times");

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1537 = Static200.method3116("reg");

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1538 = Static200.method3116("u=");

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1539 = Static200.method3116("gt");

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
	public static int anInt4506 = -1;

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1540 = Static200.method3116("copy");

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1541 = Static200.method3116("lt");

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1542 = Static200.method3116(")4shad");

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1543 = Static200.method3116("euro");

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1544 = Static200.method3116("str");

	@OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
	public static int anInt4509 = -1;

	@OriginalMember(owner = "client!mg", name = "db", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1545 = Static200.method3116("col=");

	@OriginalMember(owner = "client!mg", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1546 = Static200.method3116("shad=");

	@OriginalMember(owner = "client!mg", name = "gb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1547 = Static200.method3116("shad");

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1548 = Static200.method3116(")4trans");

	@OriginalMember(owner = "client!mg", name = "ib", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1549 = Static200.method3116(")4u");

	@OriginalMember(owner = "client!mg", name = "jb", descriptor = "I")
	public static int anInt4511 = 0;

	@OriginalMember(owner = "client!mg", name = "kb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1550 = Static200.method3116(")4str");

	@OriginalMember(owner = "client!mg", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1551 = Static200.method3116("trans=");

	@OriginalMember(owner = "client!mg", name = "mb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1552 = Static200.method3116("u");

	@OriginalMember(owner = "client!mg", name = "nb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1553 = Static200.method3116("str=");

	@OriginalMember(owner = "client!mg", name = "rb", descriptor = "I")
	public static int anInt4512 = 0;

	@OriginalMember(owner = "client!mg", name = "tb", descriptor = "I")
	public static int anInt4513 = -1;

	@OriginalMember(owner = "client!mg", name = "ub", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1554 = Static200.method3116("nbsp");

	@OriginalMember(owner = "client!mg", name = "vb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1555 = Static200.method3116("shy");

	@OriginalMember(owner = "client!mg", name = "wb", descriptor = "I")
	public static int anInt4514 = 256;

	@OriginalMember(owner = "client!mg", name = "xb", descriptor = "I")
	public static int anInt4515 = 256;

	@OriginalMember(owner = "client!mg", name = "zb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1556 = Static200.method3116("img=");

	@OriginalMember(owner = "client!mg", name = "Ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1557 = Static200.method3116("br");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kh;)Lclient!kh;")
	public static Class60 method3304(@OriginalArg(0) Class60 arg0) {
		@Pc(3) int local3 = arg0.method1835();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray34[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.anInt2439 = local3 + local5;
		local28.aByteArray34 = new byte[local28.anInt2439];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray34[local42];
			if (local48 == 60) {
				local28.aByteArray34[local40++] = 60;
				local28.aByteArray34[local40++] = 108;
				local28.aByteArray34[local40++] = 116;
				local28.aByteArray34[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray34[local40++] = 60;
				local28.aByteArray34[local40++] = 103;
				local28.aByteArray34[local40++] = 116;
				local28.aByteArray34[local40++] = 62;
			} else {
				local28.aByteArray34[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method3320(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
