import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt624 = -1;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!va;")
	private static Class61 aClass61_215 = Static88.method1421(" from your friend list first");

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!va;")
	private static Class61 aClass61_216 = Static88.method1421("Error loading your profile)3");

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!va;")
	public static Class61 aClass61_217 = aClass61_216;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Lclient!va;")
	public static Class61 aClass61_218 = aClass61_215;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "Lclient!qa;")
	public static Class50 aClass50_3 = new Class50(4096);

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Z")
	public static final boolean aBoolean32 = false;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public static volatile int anInt627 = 0;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Lclient!va;")
	private static Class61 aClass61_219 = Static88.method1421("Please use a different world)3");

	@OriginalMember(owner = "client!db", name = "K", descriptor = "Lclient!va;")
	public static Class61 aClass61_220 = Static88.method1421("");

	@OriginalMember(owner = "client!db", name = "L", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array7 = new Class61[500];

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!va;")
	private static Class61 aClass61_222 = Static88.method1421("glow2:");

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!va;")
	public static Class61 aClass61_223 = aClass61_222;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt631 = -1;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!va;")
	public static Class61 aClass61_224 = aClass61_219;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method409() {
		aClass61_218 = null;
		aClass61_223 = null;
		aBooleanArray2 = null;
		aClass61Array7 = null;
		aClass50_3 = null;
		aClass61_217 = null;
		aClass61_215 = null;
		aClass61_220 = null;
		aClass61_219 = null;
		aClass61_216 = null;
		aClass61_224 = null;
		aClass61_222 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!he;Lclient!va;BLclient!va;)Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 method410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(4) int local4 = arg0.method221(arg1);
		@Pc(10) int local10 = arg0.method227(local4, arg2);
		return Static67.method970(local4, local10, arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method411() {
		if (Static79.aClass27_3 != null) {
			Static79.aClass27_3.method610();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!e;)V")
	public static void method412(@OriginalArg(1) Class10_Sub3 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt726 == 0) {
			local7 = Static48.aClass54_1.method1363(arg0.anInt723, arg0.anInt728, arg0.anInt731);
		}
		if (arg0.anInt726 == 1) {
			local7 = Static48.aClass54_1.method1346(arg0.anInt723, arg0.anInt728, arg0.anInt731);
		}
		if (arg0.anInt726 == 2) {
			local7 = Static48.aClass54_1.method1392(arg0.anInt723, arg0.anInt728, arg0.anInt731);
		}
		if (arg0.anInt726 == 3) {
			local7 = Static48.aClass54_1.method1385(arg0.anInt723, arg0.anInt728, arg0.anInt731);
		}
		if (local7 != 0) {
			local5 = local7 >> 14 & 0x7FFF;
			@Pc(94) int local94 = Static48.aClass54_1.method1365(arg0.anInt723, arg0.anInt728, arg0.anInt731, local7);
			local9 = local94 & 0x1F;
			local11 = local94 >> 6 & 0x3;
		}
		arg0.anInt739 = local9;
		arg0.anInt738 = local5;
		arg0.anInt737 = local11;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method413() {
		if (Static34.anInt1007 > 0) {
			Static48.method752();
		} else {
			Static50.method780(40);
			Static40.aClass27_2 = Static99.aClass27_4;
		}
	}
}
