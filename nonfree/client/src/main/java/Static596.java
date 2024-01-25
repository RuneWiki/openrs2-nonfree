import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_171 = new Class274(12, 4);

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	public static int anInt9835 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ZII)V")
	public static void method8206(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Static173.method3214();
		if (arg2 == 0) {
			Static600.aClass87_15 = Static73.method1381(Static147.aCanvas5, Static181.aClass97_52, Static404.aClass2_Sub13_2.aClass33_Sub9_2.method3852() * 2, Static23.anInterface6_1, 0);
			if (arg0 != null) {
				Static600.aClass87_15.GA(0);
				@Pc(171) Class114 local171 = Static15.method322(Static428.aClass97_107, Static304.anInt5617);
				@Pc(180) Class64 local180 = Static600.aClass87_15.method7965(local171, Static647.method3075(Static594.aClass97_144, Static304.anInt5617));
				Static230.method7141();
				Static86.method1555(Static600.aClass87_15, true, arg0, local180, local171);
			}
		} else {
			@Pc(9) Class87 local9 = null;
			@Pc(30) Class114 local30;
			@Pc(39) Class64 local39;
			if (arg0 != null) {
				local9 = Static73.method1381(Static147.aCanvas5, Static181.aClass97_52, 0, Static23.anInterface6_1, 0);
				local9.GA(0);
				local30 = Static15.method322(Static428.aClass97_107, Static304.anInt5617);
				local39 = local9.method7965(local30, Static647.method3075(Static594.aClass97_144, Static304.anInt5617));
				Static230.method7141();
				Static86.method1555(local9, true, arg0, local39, local30);
			}
			try {
				Static600.aClass87_15 = Static73.method1381(Static147.aCanvas5, Static181.aClass97_52, Static404.aClass2_Sub13_2.aClass33_Sub9_2.method3852() * 2, Static23.anInterface6_1, arg2);
				if (arg0 != null) {
					local9.GA(0);
					local30 = Static15.method322(Static428.aClass97_107, Static304.anInt5617);
					local39 = local9.method7965(local30, Static647.method3075(Static594.aClass97_144, Static304.anInt5617));
					Static230.method7141();
					Static86.method1555(local9, true, arg0, local39, local30);
				}
				if (Static600.aClass87_15.method7936()) {
					@Pc(97) boolean local97 = true;
					try {
						local97 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(109) Throwable local109) {
					}
					@Pc(115) Class2_Sub11 local115;
					if (local97) {
						local115 = Static600.aClass87_15.method7920(146800640);
					} else {
						local115 = Static600.aClass87_15.method7920(104857600);
					}
					Static600.aClass87_15.method7929(local115);
				}
			} catch (@Pc(125) Throwable local125) {
				Static600.aClass87_15 = Static73.method1381(Static147.aCanvas5, Static181.aClass97_52, 0, Static23.anInterface6_1, 0);
				arg2 = 0;
			}
			if (local9 != null) {
				try {
					local9.method7959();
				} catch (@Pc(144) Throwable local144) {
				}
			}
		}
		Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7328(!arg1);
		Static404.aClass2_Sub13_2.method1383(arg2, Static404.aClass2_Sub13_2.aClass33_Sub24_1);
		Static280.method4457();
		Static600.aClass87_15.method7947();
		Static600.aClass87_15.X(32);
		Static386.aClass6_27 = Static600.aClass87_15.method7910();
		Class6_Sub2.lb = Static600.aClass87_15.method7910();
		Static346.method5398();
		Static600.aClass87_15.method7902(Static404.aClass2_Sub13_2.aClass33_Sub8_1.method3477() == 1);
		if (Static600.aClass87_15.method7967()) {
			Static262.method4258(Static404.aClass2_Sub13_2.aClass33_Sub25_1.method7592() == 1);
		}
		Static129.method2532(Static3.anInt46 >> 3, Static600.aClass87_15, Static270.anInt5194 >> 3);
		Static57.method1058();
		Static398.aClass38Array1 = null;
		Static179.aBoolean336 = true;
		Static141.aBoolean267 = false;
		Static527.method7339();
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	public static void method8207() {
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub26_2);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub26_1);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub10_2);
		Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub10_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub17_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub18_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub14_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub19_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub15_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub2_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub4_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub28_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub20_1);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub13_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub9_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub9_2);
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub3_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub16_1);
		Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub25_1);
		Static542.method7601();
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub12_1);
		Static404.aClass2_Sub13_2.method1383(3, Static404.aClass2_Sub13_2.aClass33_Sub5_1);
		Static53.method1014();
		Static57.method1058();
		Static179.aBoolean336 = true;
	}
}
