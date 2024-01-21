import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	public static int anInt1132;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "Lclient!vc;")
	public static Class98 aClass98_5;

	@OriginalMember(owner = "client!ec", name = "mb", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_34;

	@OriginalMember(owner = "client!ec", name = "nb", descriptor = "Lclient!vc;")
	public static Class98 aClass98_6;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_275 = Static81.method1507("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!dj;")
	public static Class24 aClass24_274 = aClass24_275;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	public static int anInt1134 = 0;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_276 = Static81.method1507("Discard");

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_277 = Static81.method1507("Continue");

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	public static int anInt1139 = 1;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_278 = aClass24_276;

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lclient!dj;")
	public static Class24 aClass24_279 = aClass24_277;

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "[I")
	public static final int[] anIntArray96 = new int[5];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[[I)V")
	public static void method819(@OriginalArg(1) int[][] arg0) {
		Static98.anIntArrayArray16 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V")
	public static void method821() {
		@Pc(1) Object local1 = Static119.anObject1;
		synchronized (Static119.anObject1) {
			if (Static52.anInt1336 != 0) {
				Static52.anInt1336 = 1;
				try {
					Static119.anObject1.wait();
				} catch (@Pc(17) InterruptedException local17) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILclient!tb;I)V")
	public static void method823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub21 arg2, @OriginalArg(4) int arg3) {
		if (Static156.anInt3437 >= 400) {
			return;
		}
		if (arg2.anIntArray337 != null) {
			arg2 = arg2.method3046();
		}
		if (arg2 == null || !arg2.aBoolean184) {
			return;
		}
		@Pc(31) Class24 local31 = arg2.aClass24_1151;
		if (arg2.anInt3958 != 0) {
			local31 = Static63.method1281(new Class24[] { local31, Static32.method626(arg2.anInt3958, Static87.aClass5_Sub2_Sub1_1.anInt620), Static131.aClass24_883, Static145.aClass24_964, Static175.method3020(arg2.anInt3958), Static165.aClass24_1063 });
		}
		if (Static36.anInt973 == 1) {
			Static104.method1811((long) arg3, Static163.aClass24_1053, (short) 10, arg1, Static63.method1281(new Class24[] { Static129.aClass24_858, Static55.aClass24_377, local31 }), arg0);
		} else if (!Static178.aBoolean185) {
			@Pc(153) Class24[] local153 = arg2.aClass24Array23;
			if (Static115.aBoolean118) {
				local153 = Static21.method475(local153);
			}
			@Pc(163) int local163;
			if (local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && (Static5.anInt123 != 0 || !local153[local163].method771(Static16.aClass24_123))) {
						@Pc(179) byte local179 = 0;
						if (local163 == 0) {
							local179 = 28;
						}
						if (local163 == 1) {
							local179 = 44;
						}
						if (local163 == 2) {
							local179 = 23;
						}
						if (local163 == 3) {
							local179 = 9;
						}
						if (local163 == 4) {
							local179 = 43;
						}
						Static104.method1811((long) arg3, local153[local163], local179, arg1, Static63.method1281(new Class24[] { Static27.aClass24_189, local31 }), arg0);
					}
				}
			}
			if (Static5.anInt123 == 0 && local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && local153[local163].method771(Static16.aClass24_123)) {
						@Pc(259) short local259 = 0;
						@Pc(265) short local265 = 0;
						if (arg2.anInt3958 > Static87.aClass5_Sub2_Sub1_1.anInt620) {
							local259 = 2000;
						}
						if (local163 == 0) {
							local265 = 28;
						}
						if (local163 == 1) {
							local265 = 44;
						}
						if (local163 == 2) {
							local265 = 23;
						}
						if (local163 == 3) {
							local265 = 9;
						}
						if (local163 == 4) {
							local265 = 43;
						}
						if (local265 != 0) {
							local265 += local259;
						}
						Static104.method1811((long) arg3, local153[local163], local265, arg1, Static63.method1281(new Class24[] { Static27.aClass24_189, local31 }), arg0);
					}
				}
			}
			Static104.method1811((long) arg3, Static38.aClass24_245, (short) 1002, arg1, Static63.method1281(new Class24[] { Static27.aClass24_189, local31 }), arg0);
		} else if ((Static4.anInt4608 & 0x2) == 2) {
			Static104.method1811((long) arg3, Static102.aClass24_681, (short) 3, arg1, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static55.aClass24_377, local31 }), arg0);
			return;
		}
	}
}
