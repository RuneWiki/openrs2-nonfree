import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array2;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public static int anInt42;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_4 = Static120.method1824("weiss:");

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_6 = Static120.method1824("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "Lclient!rd;")
	public static Class80 aClass80_5 = aClass80_6;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	public static void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = -arg2;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = arg2;
		@Pc(31) int local31 = Static61.method895(arg0 + arg2, Static172.anInt3861, Static85.anInt1779);
		@Pc(40) int local40 = Static61.method895(arg0 - arg2, Static172.anInt3861, Static85.anInt1779);
		Static46.method726(local40, arg3, Static96.anIntArrayArray27[arg1], local31);
		while (local22 > local15) {
			local20 += 2;
			local18 += local20;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(94) int local94;
			@Pc(102) int local102;
			if (local18 > 0) {
				local22--;
				local18 -= local22 << 1;
				local72 = arg1 - local22;
				local76 = local22 + arg1;
				if (local76 >= Static34.anInt790 && Static17.anInt440 >= local72) {
					local94 = Static61.method895(local15 + arg0, Static172.anInt3861, Static85.anInt1779);
					local102 = Static61.method895(arg0 - local15, Static172.anInt3861, Static85.anInt1779);
					if (Static17.anInt440 >= local76) {
						Static46.method726(local102, arg3, Static96.anIntArrayArray27[local76], local94);
					}
					if (Static34.anInt790 <= local72) {
						Static46.method726(local102, arg3, Static96.anIntArrayArray27[local72], local94);
					}
				}
			}
			local15++;
			local72 = arg1 - local15;
			local76 = arg1 + local15;
			if (local76 >= Static34.anInt790 && local72 <= Static17.anInt440) {
				local94 = Static61.method895(local22 + arg0, Static172.anInt3861, Static85.anInt1779);
				local102 = Static61.method895(arg0 - local22, Static172.anInt3861, Static85.anInt1779);
				if (Static17.anInt440 >= local76) {
					Static46.method726(local102, arg3, Static96.anIntArrayArray27[local76], local94);
				}
				if (local72 >= Static34.anInt790) {
					Static46.method726(local102, arg3, Static96.anIntArrayArray27[local72], local94);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lclient!rd;")
	public static Class80 method47(@OriginalArg(0) int arg0) {
		return Static18.aClass80Array5[arg0].method2462() <= 0 ? Static148.aClass80Array25[arg0] : Static154.method2467(new Class80[] { Static148.aClass80Array25[arg0], Static135.aClass80_1132, Static18.aClass80Array5[arg0] });
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)V")
	public static void method61(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static116.anInt4479 >= 100 && Static71.anInt1582 != 1 || Static116.anInt4479 >= 200) {
			Static147.method2354(Static185.aClass80_1637, 0, Static144.aClass80_1245);
			return;
		}
		@Pc(35) Class80 local35 = Static19.method321(arg0).method2451();
		for (@Pc(37) int local37 = 0; local37 < Static116.anInt4479; local37++) {
			if (Static186.aLongArray10[local37] == arg0) {
				Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { local35, Static19.aClass80_144 }));
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static133.anInt2865; local74++) {
			if (Static47.aLongArray4[local74] == arg0) {
				Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { Static130.aClass80_1109, local35, Static28.aClass80_215 }));
				return;
			}
		}
		if (local35.method2437(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass80_1689)) {
			Static147.method2354(Static185.aClass80_1637, 0, Static29.aClass80_230);
			return;
		}
		Static141.aClass80Array20[Static116.anInt4479] = local35;
		Static186.aLongArray10[Static116.anInt4479] = arg0;
		Static161.anIntArray450[Static116.anInt4479] = 0;
		Static56.aClass80Array10[Static116.anInt4479] = Static185.aClass80_1637;
		Static184.anIntArray496[Static116.anInt4479] = 0;
		Static168.anInt3770 = Static31.anInt747;
		Static116.anInt4479++;
		Static146.aClass3_Sub17_Sub1_3.method2146(232);
		Static146.aClass3_Sub17_Sub1_3.method2112(arg0);
	}
}
