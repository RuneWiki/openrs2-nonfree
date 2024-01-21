import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "Lclient!fd;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!gf", name = "hb", descriptor = "Lclient!v;")
	public static Class4_Sub1_Sub18 aClass4_Sub1_Sub18_1;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_557 = Static177.method3050("wishes to trade with you)3");

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "Lclient!jd;")
	public static Class46 aClass46_556 = aClass46_557;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
	public static int anInt1453 = 0;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_558 = Static177.method3050("World");

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lclient!ge;")
	public static Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!gf", name = "cb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_559 = aClass46_558;

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_560 = aClass46_558;

	@OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_27 = new Class66(100);

	@OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_6 = new Class11();

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "(B)[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] method1123() {
		@Pc(8) Class4_Sub1_Sub7_Sub3[] local8 = new Class4_Sub1_Sub7_Sub3[Static26.anInt653];
		for (@Pc(10) int local10 = 0; local10 < Static26.anInt653; local10++) {
			@Pc(16) Class4_Sub1_Sub7_Sub3 local16 = new Class4_Sub1_Sub7_Sub3();
			local16.anInt3486 = Static131.anInt3136;
			local16.anInt3483 = Static137.anInt3248;
			local16.anInt3485 = Static137.anIntArray312[local10];
			local16.anInt3487 = Static55.anIntArray147[local10];
			local16.anInt3484 = Static107.anIntArray248[local10];
			local16.anInt3482 = Static35.anIntArray81[local10];
			local16.anIntArray327 = Static110.anIntArray253;
			local16.aByteArray39 = Static12.aByteArrayArray1[local10];
			local8[local10] = local16;
		}
		Static130.method2308();
		return local8;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)I")
	public static int method1125(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
