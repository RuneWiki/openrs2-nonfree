import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "Bb", descriptor = "I")
	public static int anInt2819;

	@OriginalMember(owner = "client!ac", name = "Nb", descriptor = "Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 aClass4_Sub1_Sub7_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ac", name = "nc", descriptor = "I")
	public static int anInt2849;

	@OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1036 = Static177.method3050("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ac", name = "xb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1038 = Static177.method3050("Starting 3d library");

	@OriginalMember(owner = "client!ac", name = "Hb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1039 = Static177.method3050(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ac", name = "bc", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_40 = new Class66(64);

	@OriginalMember(owner = "client!ac", name = "cc", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1040 = aClass46_1038;

	@OriginalMember(owner = "client!ac", name = "hc", descriptor = "I")
	public static int anInt2846 = 0;

	@OriginalMember(owner = "client!ac", name = "pc", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1044 = Static177.method3050("Login");

	@OriginalMember(owner = "client!ac", name = "jc", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1041 = aClass46_1044;

	@OriginalMember(owner = "client!ac", name = "kc", descriptor = "I")
	public static int anInt2847 = -1;

	@OriginalMember(owner = "client!ac", name = "lc", descriptor = "I")
	public static int anInt2848 = -1;

	@OriginalMember(owner = "client!ac", name = "oc", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1043 = Static177.method3050("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ac", name = "mc", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1042 = aClass46_1043;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
	public static int method2112(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V")
	public static void method2115() {
		Static90.aClass4_Sub11_Sub1_1.method1285(206);
		Static90.aClass4_Sub11_Sub1_1.method1269((long) 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZZ)Lclient!jd;")
	public static Class46 method2117(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(26) int local26 = 1;
		@Pc(30) int local30 = arg0 / 10;
		while (local30 != 0) {
			local30 /= 10;
			local26++;
		}
		@Pc(41) int local41 = local26;
		if (arg0 < 0 || arg1) {
			local41 = local26 + 1;
		}
		@Pc(59) byte[] local59 = new byte[local41];
		if (arg0 < 0) {
			local59[0] = 45;
		} else if (arg1) {
			local59[0] = 43;
		}
		for (@Pc(75) int local75 = 0; local75 < local26; local75++) {
			@Pc(81) int local81 = arg0 % 10;
			arg0 /= 10;
			if (local81 < 0) {
				local81 = -local81;
			}
			if (local81 > 9) {
				local81 += 39;
			}
			local59[local41 - local75 - 1] = (byte) (local81 + 48);
		}
		@Pc(120) Class46 local120 = new Class46();
		local120.anInt2141 = local41;
		local120.aByteArray20 = local59;
		return local120;
	}
}
