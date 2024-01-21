import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array5;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_19;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 aClass2_Sub1_Sub9_Sub4_12;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!oc;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public static volatile int anInt918 = -1;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!wd;")
	private static Class80 aClass80_295 = Static2.method59("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_294 = aClass80_295;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!ka;")
	public static Class41 aClass41_2 = new Class41(4096);

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_296 = Static2.method59("Loading textures )2 ");

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_297 = aClass80_296;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_298 = Static2.method59("scrollen:");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_299 = Static2.method59("Loaded interfaces");

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
	public static int[] anIntArray102 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	public static int anInt924 = 2;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_300 = aClass80_299;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!wb;)Lclient!wd;")
	public static Class80 method488(@OriginalArg(2) Class2_Sub17 arg0) {
		try {
			@Pc(12) Class80 local12 = new Class80();
			local12.anInt3200 = arg0.method1787();
			if (local12.anInt3200 > 32767) {
				local12.anInt3200 = 32767;
			}
			local12.aByteArray40 = new byte[local12.anInt3200];
			arg0.anInt2799 += Static84.aClass63_1.method1604(0, local12.anInt3200, arg0.anInt2799, arg0.aByteArray38, local12.aByteArray40);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static103.aClass80_1014;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public static boolean method489(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!h;IB)V")
	public static void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub8 arg2, @OriginalArg(3) int arg3) {
		if (Static16.anInt443 >= 50 || Static22.anInt963 == 0 || (arg2.anIntArray172 == null || arg0 >= arg2.anIntArray172.length)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArray172[arg0];
		if (local32 == 0) {
			return;
		}
		@Pc(42) int local42 = local32 >> 8;
		@Pc(48) int local48 = local32 >> 4 & 0x7;
		@Pc(56) int local56 = local32 & 0xF;
		Static110.anIntArray379[Static16.anInt443] = local42;
		@Pc(66) int local66 = (arg1 - 64) / 128;
		Static5.anIntArray13[Static16.anInt443] = local48;
		Static49.anIntArray191[Static16.anInt443] = 0;
		@Pc(80) int local80 = (arg3 - 64) / 128;
		Static82.aClass25Array56[Static16.anInt443] = null;
		Static23.anIntArray101[Static16.anInt443] = (local80 << 8) + (local66 << 16) + local56;
		Static16.anInt443++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method491() {
		aClass80_295 = null;
		aClass80_300 = null;
		aClass41_2 = null;
		aClass80_299 = null;
		aClass2_Sub1_Sub9_Sub4_12 = null;
		aClass80_296 = null;
		aClass56_2 = null;
		aClass80_297 = null;
		aClass2_Sub1_Sub9_Sub3_19 = null;
		aClass2_Sub1_Sub9_Sub1Array5 = null;
		aClass80_294 = null;
		aClass80_298 = null;
		anIntArray102 = null;
	}
}
