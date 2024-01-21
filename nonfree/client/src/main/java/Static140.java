import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rh", name = "vb", descriptor = "Lclient!vg;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!rh", name = "xb", descriptor = "Lclient!og;")
	public static Class3_Sub2_Sub15 aClass3_Sub2_Sub15_1;

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1184 = Static170.method3101("");

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1180 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1182 = Static170.method3101("Members object");

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1181 = aClass28_1182;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1183 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
	public static int anInt3583 = 0;

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
	public static int anInt3584 = 0;

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1185 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1186 = Static170.method3101("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1187 = Static170.method3101("Weiter");

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array21 = new Class28[8];

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_26 = new Class63(50);

	@OriginalMember(owner = "client!rh", name = "sb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1188 = Static170.method3101("<col=00ff80>");

	@OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
	public static int anInt3590 = 0;

	@OriginalMember(owner = "client!rh", name = "ub", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1189 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "wb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1190 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "yb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1191 = aClass28_1184;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!uf;")
	public static Class3_Sub2_Sub17 method2742(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub17 local6 = (Class3_Sub2_Sub17) Static66.aClass63_10.method2337((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static145.aClass7_60.method1021(5, arg0);
		local6 = new Class3_Sub2_Sub17();
		if (local29 != null) {
			local6.method2999(new Class3_Sub8(local29));
		}
		Static66.aClass63_10.method2338((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)I")
	public static int method2743(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local8 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local8 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local8 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local8 += 2;
		}
		if (arg0 >= 1) {
			local8++;
			arg0 >>>= 0x1;
		}
		return arg0 + local8;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lclient!dg;II[BIIIIII)V")
	public static void method2744(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg4 + local3 > 0 && local3 + arg4 < 103 && arg8 + local7 > 0 && arg8 + local7 < 103) {
					arg0[arg7].anIntArrayArray12[arg4 + local3][local7 + arg8] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(83) Class3_Sub8 local83 = new Class3_Sub8(arg3);
		for (@Pc(85) int local85 = 0; local85 < 4; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
					if (local85 == arg2 && local89 >= arg6 && local89 < arg6 + 8 && local93 >= arg5 && arg5 + 8 > local93) {
						Static178.method3188(local83, 0, arg8 + Static112.method2249(local89 & 0x7, local93 & 0x7, arg1), arg1, 0, arg7, arg4 + Static4.method99(arg1, local93 & 0x7, local89 & 0x7));
					} else {
						Static178.method3188(local83, 0, -1, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
	public static void method2745() {
		aClass28_1187 = null;
		aClass28_1186 = null;
		aClass3_Sub2_Sub15_1 = null;
		aClass28_1181 = null;
		aClass28_1184 = null;
		aClass28_1188 = null;
		aClass28Array21 = null;
		aClass28_1189 = null;
		aClass28_1182 = null;
		aClass28_1183 = null;
		aClass28_1185 = null;
		aClass28_1190 = null;
		aClass28_1180 = null;
		aClass28_1191 = null;
		aClass82_1 = null;
		aClass63_26 = null;
	}
}
