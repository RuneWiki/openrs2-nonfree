import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public static int anInt4037;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!kl;")
	public static Class78 aClass78_5 = new Class78();

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[S")
	public static short[] aShortArray55 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)Lclient!hl;")
	public static Class56 method3007(@OriginalArg(1) int arg0) {
		@Pc(6) Class56 local6 = (Class56) Static236.aClass79_35.method2483((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static187.aClass51_60.method1874(34, arg0);
		local6 = new Class56();
		if (local25 != null) {
			local6.method2032(new Class1_Sub13(local25), arg0);
		}
		Static236.aClass79_35.method2486(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method3010() {
		Static38.method663(Static216.anInt4750);
		@Pc(17) int local17 = (Static29.anInt907 >> 3) + (Static110.anInt2935 >> 10);
		@Pc(25) int local25 = (Static174.anInt4003 >> 10) + (Static64.anInt1786 >> 3);
		Static70.anIntArray145 = new int[18];
		Static172.aByteArrayArray8 = new byte[18][];
		Static191.anIntArray322 = new int[18];
		Static43.anIntArray96 = new int[18];
		Static254.aByteArrayArray13 = new byte[18][];
		Static143.anIntArray266 = new int[18];
		Static169.anIntArray298 = new int[18];
		Static48.anIntArray105 = new int[18];
		Static59.anIntArrayArray13 = new int[18][4];
		Static240.aByteArrayArray11 = new byte[18][];
		@Pc(66) int local66 = 0;
		@Pc(80) int local80;
		for (@Pc(72) int local72 = (local25 - 6) / 8; local72 <= (local25 + 6) / 8; local72++) {
			for (local80 = (local17 - 6) / 8; local80 <= (local17 + 6) / 8; local80++) {
				@Pc(88) int local88 = local80 + (local72 << 8);
				Static169.anIntArray298[local66] = local88;
				Static143.anIntArray266[local66] = Static251.aClass51_80.method1866("m" + local72 + "_" + local80);
				Static48.anIntArray105[local66] = Static251.aClass51_80.method1866("l" + local72 + "_" + local80);
				Static43.anIntArray96[local66] = Static251.aClass51_80.method1866("n" + local72 + "_" + local80);
				Static191.anIntArray322[local66] = Static251.aClass51_80.method1866("um" + local72 + "_" + local80);
				Static70.anIntArray145[local66] = Static251.aClass51_80.method1866("ul" + local72 + "_" + local80);
				if (Static43.anIntArray96[local66] == -1) {
					Static143.anIntArray266[local66] = -1;
					Static48.anIntArray105[local66] = -1;
					Static191.anIntArray322[local66] = -1;
					Static70.anIntArray145[local66] = -1;
				}
				local66++;
			}
		}
		for (local80 = local66; local80 < Static43.anIntArray96.length; local80++) {
			Static43.anIntArray96[local80] = -1;
			Static143.anIntArray266[local80] = -1;
			Static48.anIntArray105[local80] = -1;
			Static191.anIntArray322[local80] = -1;
			Static70.anIntArray145[local80] = -1;
		}
		Static46.method964(local25, 8, 8, 0, local17, false, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZ)V")
	public static void method3011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg2, 8);
		local8.method3810();
		local8.anInt5008 = arg3;
		local8.anInt5009 = arg1;
		local8.anInt5015 = arg0;
	}
}
