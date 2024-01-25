import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kca", name = "ab", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_162 = new Class196(64, 6);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!kj;)[Lclient!eia;")
	public static Class96[] method4059(@OriginalArg(1) Class202 arg0) {
		if (!arg0.method4742()) {
			return new Class96[0];
		}
		@Pc(14) Class297 local14 = arg0.method4739();
		while (local14.anInt8459 == 0) {
			Static127.method1985(10L);
		}
		if (local14.anInt8459 == 2) {
			return new Class96[0];
		}
		@Pc(34) int[] local34 = (int[]) local14.anObject15;
		@Pc(40) Class96[] local40 = new Class96[local34.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local40.length; local47++) {
			@Pc(52) Class96 local52 = new Class96();
			local40[local47] = local52;
			local52.anInt2225 = local34[local47 << 2];
			local52.anInt2224 = local34[(local47 << 2) + 1];
			local52.anInt2223 = local34[(local47 << 2) + 2];
			local52.anInt2226 = local34[(local47 << 2) + 3];
		}
		return local40;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(III)Z")
	public static boolean method4060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static105.method1742(arg0, arg1) || Static69.method991(arg1, arg0);
	}

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "(B)V")
	public static void method4061() {
		Static238.aClass50_62.anInt990 = 1;
		Static74.method1094();
		Static269.aBoolean284 = true;
		Static324.aBoolean434 = true;
		Static271.method3793();
		for (@Pc(8344) int local8344 = 0; local8344 < Static217.aClass358Array1.length; local8344++) {
			Static217.aClass358Array1[local8344] = null;
		}
		Static386.aBoolean482 = false;
		Static570.method7817();
		Static188.anInt3090 = (int) (Math.random() * 100.0D) - 50;
		Static312.anInt5536 = (int) (Math.random() * 80.0D) - 40;
		Static495.aFloat161 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static538.anInt8846 = (int) (Math.random() * 120.0D) - 60;
		Static368.anInt6448 = (int) (Math.random() * 110.0D) - 55;
		Static342.anInt6178 = (int) (Math.random() * 30.0D) - 20;
		Static403.method5899();
		for (@Pc(8418) int local8418 = 0; local8418 < 2048; local8418++) {
			Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local8418] = null;
		}
		Static562.anInt9155 = 0;
		Static386.anInt6720 = 0;
		Static223.aClass335_19.method7773();
		Static97.aClass124_11.method2567();
		Static614.aClass124_99.method2567();
		Static261.aClass102_2.method2053();
		Static109.aClass335_12.method7773();
		Static59.aClass124_60 = new Class124();
		Static227.aClass124_36 = new Class124();
		Static413.aClass63_1.method1220();
		Static628.method8370();
		Static345.anInt6197 = 0;
		Static144.anInt10373 = 0;
		Static514.anInt8683 = 0;
		Static293.anInt4550 = 0;
		Static92.anInt1528 = 0;
		Static394.anInt6803 = 0;
		Static552.anInt10277 = 0;
		Static69.anInt1063 = 0;
		Static19.anInt269 = 0;
		Static310.anInt5525 = 0;
		for (@Pc(8482) int local8482 = 0; local8482 < Static205.anIntArray184.length; local8482++) {
			if (!Static155.aBooleanArray3[local8482]) {
				Static205.anIntArray184[local8482] = -1;
			}
		}
		if (Static131.anInt2222 != -1) {
			Static46.method622(Static131.anInt2222);
		}
		for (@Pc(8509) Class5_Sub4 local8509 = (Class5_Sub4) Static131.aClass335_15.method7768(); local8509 != null; local8509 = (Class5_Sub4) Static131.aClass335_15.method7777()) {
			if (!local8509.method8826()) {
				local8509 = (Class5_Sub4) Static131.aClass335_15.method7768();
				if (local8509 == null) {
					break;
				}
			}
			Static272.method3801(local8509, false, true);
		}
		Static131.anInt2222 = -1;
		Static131.aClass335_15 = new Class335(8);
		Static535.method8699();
		Static415.aClass394_5 = null;
		for (@Pc(8549) int local8549 = 0; local8549 < 8; local8549++) {
			Static430.aStringArray35[local8549] = null;
			Static549.aBooleanArray22[local8549] = false;
			Static72.anIntArray500[local8549] = -1;
		}
		Static267.method3771();
		Static433.aBoolean562 = true;
		for (@Pc(8573) int local8573 = 0; local8573 < 100; local8573++) {
			Static425.aBooleanArray18[local8573] = true;
		}
		for (@Pc(8585) int local8585 = 0; local8585 < 6; local8585++) {
			Static644.aClass278Array1[local8585] = new Class278();
		}
		for (@Pc(8601) int local8601 = 0; local8601 < 25; local8601++) {
			Static399.anIntArray387[local8601] = 0;
			Static609.anIntArray563[local8601] = 0;
			Static204.anIntArray183[local8601] = 0;
		}
		Static3.method39();
		Static25.aShortArray5 = Static677.aShortArray160 = Static198.aShortArray43 = Static77.aShortArray9 = new short[256];
		Static550.aBoolean649 = true;
		Static90.aString13 = Static49.aClass42_26.method730(Static259.anInt4113);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_1, Static655.aClass5_Sub36_29.aClass2_Sub21_2.method7492());
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_1, Static655.aClass5_Sub36_29.aClass2_Sub19_2.method7172());
		Static500.anInt8514 = 0;
		Static556.method7639();
		Static288.method3976();
		Static238.aClass50_62.anInt990 = 2;
		Static584.aClass5_Sub33_2 = null;
		Static452.aLong241 = 0L;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(III)Z")
	public static boolean method4064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static348.method6676(arg0, arg1) | (arg1 & 0x70000) != 0 || Static69.method991(arg0, arg1);
	}
}
