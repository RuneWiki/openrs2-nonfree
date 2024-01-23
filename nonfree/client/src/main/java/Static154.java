import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_757 = Static186.method3527("col=");

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "Lclient!hh;")
	public static Class50 aClass50_758 = Static186.method3527("str");

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!hh;")
	public static Class50 aClass50_759 = Static186.method3527(")4str");

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "Lclient!hh;")
	public static Class50 aClass50_760 = Static186.method3527("reg");

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "Lclient!hh;")
	public static Class50 aClass50_761 = Static186.method3527("img=");

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "Lclient!hh;")
	public static Class50 aClass50_762 = Static186.method3527("copy");

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "Lclient!hh;")
	public static Class50 aClass50_763 = Static186.method3527("times");

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "Lclient!hh;")
	public static Class50 aClass50_764 = Static186.method3527("u=");

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "Lclient!hh;")
	public static Class50 aClass50_765 = Static186.method3527("shy");

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "Lclient!hh;")
	public static Class50 aClass50_766 = Static186.method3527("u");

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_767 = Static186.method3527("str=");

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "Lclient!hh;")
	public static Class50 aClass50_768 = Static186.method3527(")4u");

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_769 = Static186.method3527("lt");

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "Lclient!hh;")
	public static Class50 aClass50_770 = Static186.method3527(")4col");

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_771 = Static186.method3527("nbsp");

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_772 = Static186.method3527("gt");

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_773 = Static186.method3527("trans=");

	@OriginalMember(owner = "client!oh", name = "bb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_774 = Static186.method3527(")4shad");

	@OriginalMember(owner = "client!oh", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_775 = Static234.method3539(100);

	@OriginalMember(owner = "client!oh", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_776 = Static186.method3527("euro");

	@OriginalMember(owner = "client!oh", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_777 = Static186.method3527("shad");

	@OriginalMember(owner = "client!oh", name = "gb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_778 = Static186.method3527("br");

	@OriginalMember(owner = "client!oh", name = "ib", descriptor = "Lclient!hh;")
	public static Class50 aClass50_779 = Static186.method3527(")4trans");

	@OriginalMember(owner = "client!oh", name = "lb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_780 = Static186.method3527("shad=");

	@OriginalMember(owner = "client!oh", name = "mb", descriptor = "I")
	public static int anInt2266 = -1;

	@OriginalMember(owner = "client!oh", name = "nb", descriptor = "I")
	public static int anInt2267 = -1;

	@OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!oh", name = "pb", descriptor = "I")
	public static int anInt2269 = 0;

	@OriginalMember(owner = "client!oh", name = "qb", descriptor = "I")
	public static int anInt2270 = 256;

	@OriginalMember(owner = "client!oh", name = "rb", descriptor = "I")
	public static int anInt2271 = 0;

	@OriginalMember(owner = "client!oh", name = "sb", descriptor = "I")
	public static int anInt2272 = -1;

	@OriginalMember(owner = "client!oh", name = "tb", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array41 = new Class50[100];

	@OriginalMember(owner = "client!oh", name = "ub", descriptor = "I")
	public static int anInt2273 = -1;

	@OriginalMember(owner = "client!oh", name = "vb", descriptor = "I")
	public static int anInt2274 = 0;

	@OriginalMember(owner = "client!oh", name = "wb", descriptor = "I")
	public static int anInt2275 = 256;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Lclient!hh;)Lclient!hh;")
	public static Class50 method1824(@OriginalArg(0) Class50 arg0) {
		@Pc(3) int local3 = arg0.method1249();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray12[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class50 local28 = new Class50();
		local28.anInt1705 = local3 + local5;
		local28.aByteArray12 = new byte[local28.anInt1705];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray12[local42];
			if (local48 == 60) {
				local28.aByteArray12[local40++] = 60;
				local28.aByteArray12[local40++] = 108;
				local28.aByteArray12[local40++] = 116;
				local28.aByteArray12[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray12[local40++] = 60;
				local28.aByteArray12[local40++] = 103;
				local28.aByteArray12[local40++] = 116;
				local28.aByteArray12[local40++] = 62;
			} else {
				local28.aByteArray12[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1831(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
