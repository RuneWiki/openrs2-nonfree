import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1193 = Static231.method3737("times");

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1194 = Static231.method3737("str");

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1195 = Static231.method3737("trans=");

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1196 = Static130.method2170(100);

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1197 = Static231.method3737("br");

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1198 = Static231.method3737("shad=");

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1199 = Static231.method3737(")4trans");

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1200 = Static231.method3737("copy");

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1201 = Static231.method3737("img=");

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1202 = Static231.method3737(")4col");

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1203 = Static231.method3737("u");

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1204 = Static231.method3737("gt");

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1205 = Static231.method3737("col=");

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1206 = Static231.method3737("u=");

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1207 = Static231.method3737(")4shad");

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1208 = Static231.method3737("nbsp");

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1209 = Static231.method3737(")4u");

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1210 = Static231.method3737("lt");

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1211 = Static231.method3737(")4str");

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1212 = Static231.method3737("str=");

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1213 = Static231.method3737("euro");

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1214 = Static231.method3737("reg");

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1215 = Static231.method3737("shy");

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1216 = Static231.method3737("shad");

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "I")
	public static int anInt4483 = 0;

	@OriginalMember(owner = "client!pe", name = "wb", descriptor = "I")
	public static int anInt4484 = -1;

	@OriginalMember(owner = "client!pe", name = "xb", descriptor = "I")
	public static int anInt4485 = 256;

	@OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
	public static int anInt4486 = 0;

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
	public static int anInt4487 = 0;

	@OriginalMember(owner = "client!pe", name = "Ab", descriptor = "I")
	public static int anInt4488 = -1;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
	public static int anInt4489 = -1;

	@OriginalMember(owner = "client!pe", name = "Cb", descriptor = "I")
	public static int anInt4490 = -1;

	@OriginalMember(owner = "client!pe", name = "Db", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array27 = new Class107[100];

	@OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
	public static int anInt4492 = 256;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;)Lclient!sc;")
	public static Class107 method3329(@OriginalArg(0) Class107 arg0) {
		@Pc(3) int local3 = arg0.method3095();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray55[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class107 local28 = new Class107();
		local28.anInt4186 = local3 + local5;
		local28.aByteArray55 = new byte[local28.anInt4186];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray55[local42];
			if (local48 == 60) {
				local28.aByteArray55[local40++] = 60;
				local28.aByteArray55[local40++] = 108;
				local28.aByteArray55[local40++] = 116;
				local28.aByteArray55[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray55[local40++] = 60;
				local28.aByteArray55[local40++] = 103;
				local28.aByteArray55[local40++] = 116;
				local28.aByteArray55[local40++] = 62;
			} else {
				local28.aByteArray55[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method3339(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
