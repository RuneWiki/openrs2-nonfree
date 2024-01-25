import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
	public static int anInt2528 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method2354(@OriginalArg(0) Class4 arg0) {
		arg0.N(0, 0, Static70.anInt1753, 350);
		arg0.f(0, 0, Static70.anInt1753, 350, Static143.anInt2848 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static425.anInt7414;
		@Pc(36) int local36;
		if (Static151.anInt5204 > 0) {
			local36 = 346 - Static425.anInt7414 - 4;
			@Pc(46) int local46 = local36 * local27 / (local27 + Static151.anInt5204 - 1);
			@Pc(48) int local48 = 4;
			if (Static151.anInt5204 > 1) {
				local48 = (local36 - local46) * (-Static30.anInt788 + Static151.anInt5204 + -1) / (Static151.anInt5204 - 1) + 4;
			}
			arg0.f(Static70.anInt1753 - 16, local48, 12, local46, Static143.anInt2848 << 24 | 0x332277, 2);
			for (@Pc(84) int local84 = Static30.anInt788; local27 + Static30.anInt788 > local84 && local84 < Static151.anInt5204; local84++) {
				@Pc(93) String[] local93 = Static340.method5715(Static379.aStringArray32[local84], '\b');
				@Pc(100) int local100 = (Static70.anInt1753 - 24) / local93.length;
				for (@Pc(102) int local102 = 0; local102 < local93.length; local102++) {
					@Pc(111) int local111 = local102 * local100 + 8;
					arg0.N(local111, 0, local100 + local111 - 8, 350);
					Static186.aClass36_1.method7954(-1, 350 - (local84 - Static30.anInt788) * Static425.anInt7414 - Static234.aClass96_8.anInt2538 - Static347.anInt6344 - 2, local93[local102], local111, -16777216);
				}
			}
		}
		arg0.N(0, 0, Static70.anInt1753, 350);
		arg0.method7157(Static70.anInt1753, -1, 350 - Static347.anInt6344, 0);
		Static511.aClass36_4.method7954(-1, 350 - Static270.aClass96_10.anInt2538 - 1, "--> " + Static231.aString101, 10, -16777216);
		if (!Static87.aBoolean160) {
			return;
		}
		local36 = -1;
		if (Static445.anInt7791 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method7224(Static270.aClass96_10.method2370("--> " + Static231.aString101.substring(0, Static140.anInt2804)) + 10, 12, local36, 350 - Static270.aClass96_10.anInt2538 - 11);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
	public static void method2356(@OriginalArg(1) int arg0) {
		Static207.method3823();
		Static52.method4309();
		Static377.method6034(true, arg0);
		Static289.method5096(Static46.aClass69_14, Static61.aClass69_18, Static455.aClass4_11);
		Static426.method6641(Static455.aClass4_11, Static46.aClass69_14);
		Static15.method527();
		Static273.method4837(Static62.aClass104Array15);
		Static402.method6385();
		Static449.method6959();
		if (Static186.anInt3863 == 2) {
			Static506.method7745(3);
		} else if (Static186.anInt3863 == 6) {
			Static506.method7745(7);
		} else if (Static186.anInt3863 == 9) {
			Static506.method7745(10);
		} else if (Static186.anInt3863 == 1) {
			Static106.method2170(Static455.aClass4_11, Static46.aClass69_14);
			return;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!qa;Lclient!oe;III)V")
	public static void method2357(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class64 local12;
		if (arg3 < Static501.anInt9458) {
			local12 = Static263.aClass64ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass20_Sub5_1 != null && local12.aClass20_Sub5_1.method8038()) {
				arg1.method8034(true, local12.aClass20_Sub5_1, 0, arg0, 0, Static382.anInt6794);
			}
		}
		if (arg4 < Static501.anInt9458) {
			local12 = Static263.aClass64ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass20_Sub5_1 != null && local12.aClass20_Sub5_1.method8038()) {
				arg1.method8034(true, local12.aClass20_Sub5_1, Static382.anInt6794, arg0, 0, 0);
			}
		}
		if (arg3 < Static501.anInt9458 && arg4 < Static420.anInt7323) {
			local12 = Static263.aClass64ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass20_Sub5_1 != null && local12.aClass20_Sub5_1.method8038()) {
				arg1.method8034(true, local12.aClass20_Sub5_1, Static382.anInt6794, arg0, 0, Static382.anInt6794);
			}
		}
		if (arg3 < Static501.anInt9458 && arg4 > 0) {
			local12 = Static263.aClass64ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass20_Sub5_1 != null && local12.aClass20_Sub5_1.method8038()) {
				arg1.method8034(true, local12.aClass20_Sub5_1, -Static382.anInt6794, arg0, 0, Static382.anInt6794);
			}
		}
	}
}
