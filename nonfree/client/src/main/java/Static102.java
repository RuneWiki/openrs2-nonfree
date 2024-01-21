import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_213 = Static56.method1206("redstone3");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
	public static final boolean aBoolean47 = false;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_214 = Static56.method1206("Unable to find ");

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_215 = Static56.method1206("glow3:");

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!lc;")
	public static Class31 aClass31_216 = Static56.method1206("(U");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_217 = Static56.method1206("Apr");

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_218 = Static56.method1206("On");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_219 = Static56.method1206("purple:");

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static volatile int anInt694 = 0;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub6_Sub1[] aClass2_Sub1_Sub4_Sub6_Sub1Array3 = new Class2_Sub1_Sub4_Sub6_Sub1[2048];

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public static int anInt695 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method470() {
		aClass2_Sub1_Sub4_Sub6_Sub1Array3 = null;
		aClass31_214 = null;
		aClass31_215 = null;
		aClass31_216 = null;
		aClass31_213 = null;
		aClass31_218 = null;
		aClass31_219 = null;
		aClass31_217 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!lc;ILclient!pd;)I")
	public static int method471(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		@Pc(2) int local2 = arg1.anInt952;
		arg1.method652(arg0.anInt1901);
		arg1.anInt952 += Static51.aClass42_1.method1398(arg0.anInt1901, arg1.aByteArray11, arg1.anInt952, 0, arg0.aByteArray17);
		return arg1.anInt952 - local2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIIIIII)V")
	public static void method472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = 2048 - arg2 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg3 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg1;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(43) int local43;
		if (local6 != 0) {
			local29 = Static35.anIntArray205[local6];
			local33 = Static35.anIntArray200[local6];
			local43 = local29 * 0 - local33 * arg1 >> 16;
			local23 = local33 * 0 + arg1 * local29 >> 16;
			local21 = local43;
		}
		if (local17 != 0) {
			local29 = Static35.anIntArray205[local17];
			local33 = Static35.anIntArray200[local17];
			local43 = local23 * local33 + local29 * 0 >> 16;
			local23 = local23 * local29 - local33 * 0 >> 16;
			local19 = local43;
		}
		Static91.anInt2484 = arg0 - local23;
		Static72.anInt1289 = arg2;
		Static57.anInt2682 = arg4 - local21;
		Static44.anInt1595 = arg5 - local19;
		Static18.anInt805 = arg3;
	}
}
