import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_163 = Static231.method3737("<col=ff7000>");

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_164 = Static231.method3737("Nehmen");

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_166 = Static231.method3737("slide:");

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!sc;")
	public static Class107 aClass107_165 = aClass107_166;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
	public static int[] anIntArray45 = new int[100];

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
	public static int anInt490 = 0;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lclient!nk;")
	public static Class85 aClass85_2 = new Class85();

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_167 = aClass107_166;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "I")
	public static int anInt497 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIILclient!af;JZ)V")
	public static void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class40 local6 = new Class40();
		local6.aClass5_1 = arg4;
		local6.anInt1529 = arg1 * 128 + 64;
		local6.anInt1528 = arg2 * 128 + 64;
		local6.anInt1526 = arg3;
		local6.aLong49 = arg5;
		if (Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub9(arg0, arg1, arg2);
		}
		Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass40_1 = local6;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public static void method452() {
		if (Static67.aClass86_4 != null || Static54.aClass86_1 != null) {
			return;
		}
		@Pc(21) int local21 = Static95.anInt2075;
		@Pc(90) int local90;
		@Pc(96) int local96;
		if (Static40.aBoolean81) {
			@Pc(191) int local191;
			if (local21 != 1) {
				local191 = Static220.anInt4822;
				local90 = Static181.anInt4311;
				if (local191 < Static100.anInt2167 - 10 || Static100.anInt2167 + Static44.anInt965 + 10 < local191 || local90 < Static104.anInt3191 - 10 || local90 > Static104.anInt3191 + Static101.anInt2176 + 10) {
					Static40.aBoolean81 = false;
					Static5.method224(Static44.anInt965, Static100.anInt2167, Static104.anInt3191, Static101.anInt2176);
				}
			}
			if (local21 != 1) {
				return;
			}
			local191 = Static100.anInt2167;
			local96 = Static44.anInt965;
			local90 = Static104.anInt3191;
			@Pc(247) int local247 = Static161.anInt3533;
			@Pc(249) int local249 = Static20.anInt2218;
			@Pc(251) int local251 = -1;
			for (@Pc(253) int local253 = 0; local253 < Static8.anInt259; local253++) {
				@Pc(268) int local268 = local90 + (-local253 + Static8.anInt259 + -1) * 15 + 31;
				if (local191 < local249 && local249 < local96 + local191 && local247 > local268 - 13 && local247 < local268 + 3) {
					local251 = local253;
				}
			}
			if (local251 != -1) {
				Static222.method2962(local251);
			}
			Static40.aBoolean81 = false;
			Static5.method224(Static44.anInt965, Static100.anInt2167, Static104.anInt3191, Static101.anInt2176);
			return;
		}
		if (local21 == 1 && Static8.anInt259 > 0) {
			@Pc(34) short local34 = Static106.aShortArray30[Static8.anInt259 - 1];
			if (local34 == 41 || local34 == 16 || local34 == 4 || local34 == 51 || local34 == 38 || local34 == 13 || local34 == 30 || local34 == 23 || local34 == 3 || local34 == 5 || local34 == 45 || local34 == 1004) {
				local90 = Static152.anIntArray293[Static8.anInt259 - 1];
				local96 = Static4.anIntArray378[Static8.anInt259 - 1];
				@Pc(100) Class86 local100 = Static13.method333(local96);
				if (Static51.method2304(Static34.method676(local100)) || Static27.method478(Static34.method676(local100))) {
					Static130.anInt2833 = 0;
					Static54.aBoolean120 = false;
					if (Static67.aClass86_4 != null) {
						Static16.method354(Static67.aClass86_4);
					}
					Static67.aClass86_4 = Static13.method333(local96);
					Static15.anInt340 = local90;
					Static56.anInt1412 = Static161.anInt3533;
					Static67.anInt1559 = Static20.anInt2218;
					Static16.method354(Static67.aClass86_4);
					return;
				}
			}
		}
		if (local21 == 1 && (Static159.anInt3500 == 1 && Static8.anInt259 > 2 || Static206.method3282(Static8.anInt259 - 1))) {
			local21 = 2;
		}
		if (local21 == 1 && Static8.anInt259 > 0 || Static157.anInt3442 == 2) {
			Static222.method2962(Static8.anInt259 - 1);
		}
		if (local21 == 2 && Static8.anInt259 > 0 || Static157.anInt3442 == 1) {
			Static115.method2004();
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)I")
	public static int method453() {
		if (Static191.aBoolean372) {
			return 0;
		} else if (Static155.method412()) {
			return Static100.aBoolean195 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLclient!jb;)V")
	public static void method457(@OriginalArg(1) Class28 arg0) {
		Static23.aClass28_11 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
	public static void method458() {
		if (Static10.anInt284 < 0) {
			Static10.anInt284 = 0;
			Static199.anInt4323 = -1;
			Static194.anInt4290 = -1;
		}
		if (Static170.anInt3706 < Static10.anInt284) {
			Static199.anInt4323 = -1;
			Static194.anInt4290 = -1;
			Static10.anInt284 = Static170.anInt3706;
		}
		if (Static114.anInt2509 < 0) {
			Static194.anInt4290 = -1;
			Static199.anInt4323 = -1;
			Static114.anInt2509 = 0;
		}
		if (Static114.anInt2509 > Static152.anInt3375) {
			Static194.anInt4290 = -1;
			Static199.anInt4323 = -1;
			Static114.anInt2509 = Static152.anInt3375;
		}
	}
}
