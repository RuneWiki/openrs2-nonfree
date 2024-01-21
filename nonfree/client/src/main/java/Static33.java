import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_9;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_443 = Static56.method1206("backright1");

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_444 = Static56.method1206("white:");

	@OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
	public static int[] anIntArray170 = new int[1000];

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!lc;")
	public static Class31 aClass31_445 = Static56.method1206("Too many connections from your address)3");

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Lclient!lc;")
	public static Class31 aClass31_446 = Static56.method1206("::clientdrop");

	@OriginalMember(owner = "client!h", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray29 = new boolean[5];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 method867() {
		@Pc(9) Class2_Sub1_Sub3_Sub2 local9 = new Class2_Sub1_Sub3_Sub2();
		local9.anInt687 = Static15.anInt655;
		local9.anInt689 = Static58.anInt1946;
		local9.anInt691 = Static95.anIntArray366[0];
		local9.anInt688 = Static76.anIntArray316[0];
		local9.anInt690 = Static50.anIntArray74[0];
		local9.anInt686 = Static91.anIntArray346[0];
		@Pc(41) int local41 = local9.anInt686 * local9.anInt690;
		@Pc(45) byte[] local45 = Static77.aByteArrayArray10[0];
		local9.anIntArray89 = new int[local41];
		for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
			local9.anIntArray89[local51] = Static67.anIntArray301[local45[local51] & 0xFF];
		}
		Static4.method95();
		return local9;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pd;II)Lclient!lc;")
	public static Class31 method869(@OriginalArg(0) Class2_Sub6 arg0) {
		try {
			@Pc(15) Class31 local15 = new Class31();
			local15.anInt1901 = arg0.method646();
			if (local15.anInt1901 > 32767) {
				local15.anInt1901 = 32767;
			}
			local15.aByteArray17 = new byte[local15.anInt1901];
			arg0.anInt952 += Static51.aClass42_1.method1400(arg0.aByteArray11, 0, local15.anInt1901, arg0.anInt952, local15.aByteArray17);
			return local15;
		} catch (@Pc(52) Exception local52) {
			return Static87.aClass31_816;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method870() {
		aClass31_446 = null;
		aClass11_Sub1_9 = null;
		aClass31_443 = null;
		anIntArray170 = null;
		aClass31_444 = null;
		aClass31_445 = null;
		aBooleanArray29 = null;
	}
}
