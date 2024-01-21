import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	public static int anInt848;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Lclient!c;")
	public static Class10 aClass10_10;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!lb;")
	public static Class45 aClass45_5 = new Class45();

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!od;")
	private static Class60 aClass60_281 = Static41.method597("Bad session id)3");

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_276 = aClass60_281;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!od;")
	private static Class60 aClass60_277 = Static41.method597("Loaded title screen");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	public static int anInt847 = 0;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_278 = aClass60_277;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[112];

	@OriginalMember(owner = "client!df", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
	public static int[] anIntArray87 = new int[500];

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Lclient!od;")
	private static Class60 aClass60_279 = Static41.method597("Loaded sprites");

	@OriginalMember(owner = "client!df", name = "z", descriptor = "Lclient!od;")
	public static Class60 aClass60_280 = aClass60_279;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_282 = Static41.method597("Standort");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!t;ZLclient!nf;I)V")
	public static void method446(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class45 local9 = Static37.aClass45_7;
		synchronized (Static37.aClass45_7) {
			for (@Pc(16) Class4_Sub12 local16 = (Class4_Sub12) Static37.aClass45_7.method982(); local16 != null; local16 = (Class4_Sub12) Static37.aClass45_7.method986()) {
				if (local16.aLong100 == (long) arg2 && arg1 == local16.aClass56_31 && local16.anInt1660 == 0) {
					local7 = local16.aByteArray15;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(70) byte[] local70 = arg1.method1269(arg2);
			arg0.method1795(local70, arg2, true, arg1);
		} else {
			arg0.method1795(local7, arg2, true, arg1);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method447() {
		aClass60_276 = null;
		aClass60_277 = null;
		aClass60_281 = null;
		anIntArrayArray19 = null;
		aClass60_280 = null;
		aClass60_278 = null;
		aBooleanArray4 = null;
		aClass60_279 = null;
		aClass10_10 = null;
		aClass60_282 = null;
		anIntArray87 = null;
		aClass45_5 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!od;Lclient!c;BLclient!od;)Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 method448(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(9) int local9 = arg1.method1770(arg2);
		@Pc(17) int local17 = arg1.method1785(arg0, local9);
		return Static41.method596(arg1, local9, local17);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBII)Lclient!ta;")
	public static Class4_Sub18 method449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class4_Sub18 local7 = new Class4_Sub18();
		local7.anInt2589 = arg1;
		local7.anInt2591 = arg2;
		Static78.aClass75_10.method1892((long) arg0, local7);
		Static97.method1574(arg1);
		Static81.method1287(arg1);
		@Pc(34) Class4_Sub14 local34 = Static61.method991(arg0);
		if (local34 != null) {
			Static36.method558(local34);
		}
		if (Static27.aClass4_Sub14_6 != null) {
			Static36.method558(Static27.aClass4_Sub14_6);
			Static27.aClass4_Sub14_6 = null;
		}
		Static12.aBoolean107 = false;
		Static48.anInt1184 = 0;
		Static97.method1576(Static48.anInt1182, anInt848, Static22.anInt800, Static60.anInt2966);
		if (Static52.anInt1452 != -1) {
			Static113.method818(1, Static52.anInt1452);
		}
		return local7;
	}
}
