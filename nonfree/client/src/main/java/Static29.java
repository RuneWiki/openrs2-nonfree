import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!vb;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!ja;")
	public static Class33 aClass33_10;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!pb;")
	public static Class31 aClass31_15;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array10;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt815 = 0;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
	public static int[] anIntArray97 = new int[50];

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!mc;")
	private static Class42 aClass42_442 = Static23.method501("Enter your username (V password)3");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_439 = aClass42_442;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "Lclient!mc;")
	private static Class42 aClass42_444 = Static23.method501("Username: ");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_440 = aClass42_444;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_441 = Static23.method501("mapmarker");

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public static volatile int anInt816 = 0;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	public static int anInt819 = -1;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_443 = Static23.method501("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "J")
	public static volatile long aLong21 = 0L;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	public static int anInt824 = -1;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_445 = Static23.method501(" weitere Optionen");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method565() {
		if (Static107.aClass46_29 != null) {
			@Pc(3) Class46 local3 = Static107.aClass46_29;
			synchronized (Static107.aClass46_29) {
				Static107.aClass46_29 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;Lclient!vb;)Lclient!rc;")
	public static Class1_Sub12_Sub1 method566(@OriginalArg(1) Component arg0, @OriginalArg(2) Class60 arg1) {
		Static62.method1033(arg1, arg0);
		@Pc(16) Class1_Sub12_Sub1 local16 = new Class1_Sub12_Sub1();
		Static31.method1555(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
	public static int method567() {
		@Pc(12) int local12 = 3;
		if (Static30.anInt830 < 310) {
			@Pc(19) int local19 = Static68.anInt1671 >> 7;
			@Pc(23) int local23 = Static37.anInt917 >> 7;
			if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][local19][local23] & 0x4) != 0) {
				local12 = Static82.anInt2165;
			}
			@Pc(40) int local40 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 >> 7;
			@Pc(45) int local45 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 >> 7;
			@Pc(57) int local57;
			if (local40 <= local19) {
				local57 = local19 - local40;
			} else {
				local57 = local40 - local19;
			}
			@Pc(71) int local71;
			if (local45 <= local23) {
				local71 = local23 - local45;
			} else {
				local71 = local45 - local23;
			}
			@Pc(91) int local91;
			@Pc(93) int local93;
			if (local71 < local57) {
				local91 = local71 * 65536 / local57;
				local93 = 32768;
				while (local40 != local19) {
					if (local19 < local40) {
						local19++;
					} else if (local40 < local19) {
						local19--;
					}
					local93 += local91;
					if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][local19][local23] & 0x4) != 0) {
						local12 = Static82.anInt2165;
					}
					if (local93 >= 65536) {
						if (local23 < local45) {
							local23++;
						} else if (local45 < local23) {
							local23--;
						}
						if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][local19][local23] & 0x4) != 0) {
							local12 = Static82.anInt2165;
						}
						local93 -= 65536;
					}
				}
			} else {
				local93 = 32768;
				local91 = local57 * 65536 / local71;
				while (local45 != local23) {
					local93 += local91;
					if (local45 > local23) {
						local23++;
					} else if (local23 > local45) {
						local23--;
					}
					if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][local19][local23] & 0x4) != 0) {
						local12 = Static82.anInt2165;
					}
					if (local93 >= 65536) {
						local93 -= 65536;
						if (local19 < local40) {
							local19++;
						} else if (local19 > local40) {
							local19--;
						}
						if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][local19][local23] & 0x4) != 0) {
							local12 = Static82.anInt2165;
						}
					}
				}
			}
		}
		if ((Static61.aByteArrayArrayArray7[Static82.anInt2165][Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 >> 7][Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 >> 7] & 0x4) != 0) {
			local12 = Static82.anInt2165;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method568() {
		anIntArray98 = null;
		aClass42_440 = null;
		aClass31_15 = null;
		aClass33_10 = null;
		aClass60_1 = null;
		aClass42_443 = null;
		aClass42_442 = null;
		aClass42_444 = null;
		aClass42_441 = null;
		anIntArray97 = null;
		aClass42_445 = null;
		aClass1_Sub1_Sub1_Sub1Array10 = null;
		aClass1_Sub1_Sub1_Sub4_9 = null;
		aClass42_439 = null;
	}
}
