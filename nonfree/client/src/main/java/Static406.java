import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_44 = new Class295();

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "[S")
	public static final short[] aShortArray112 = new short[] { 13, 49, 3, 50, 60, 18, 4, 9 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V")
	public static void method6459(@OriginalArg(0) boolean arg0) {
		if (Static200.aClass134_2 != null) {
			Static200.aClass134_2.method8116();
			Static200.aClass134_2 = null;
		}
		Static121.anInt2498 = 0;
		Static519.method1985();
		Static230.method4159();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static362.aClass243Array5[local19].method6471();
		}
		Static518.method7916(false);
		System.gc();
		Static427.method6648();
		Static261.anInt5068 = -1;
		Static410.aBoolean568 = false;
		Static282.method4959(true);
		Static225.anInt4357 = 0;
		Static61.anInt1489 = 0;
		Static345.anInt6336 = 0;
		Static538.anInt9485 = 0;
		Static388.anInt6883 = 0;
		Static282.anInt5380 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static261.aClass248Array1.length; local58++) {
			Static261.aClass248Array1[local58] = null;
		}
		Static56.method1471();
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static511.aClass20_Sub1_Sub1_Sub1Array1[local83] = null;
		}
		Static141.anInt2822 = 0;
		Static362.aClass230_46.method6141();
		Static342.anInt6322 = 0;
		Static4.aClass230_2.method6141();
		Static476.method7401();
		Static418.anInt6721 = 0;
		Static417.aClass10_1.method531();
		Static233.method4189();
		Static166.method3150();
		Static125.aClass1_Sub16_1 = null;
		Static434.aLong207 = 0L;
		if (arg0) {
			Static506.method7745(11);
			return;
		}
		Static506.method7745(2);
		try {
			Static558.method7782("loggedout", Static473.aClass229_14.anApplet1);
		} catch (@Pc(139) Throwable local139) {
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method6469() {
		Static347.anInt6344 = Static270.aClass96_10.anInt2538 + Static270.aClass96_10.anInt2545 + 2;
		Static425.anInt7414 = Static234.aClass96_8.anInt2538 + Static234.aClass96_8.anInt2545 + 2;
		Static379.aStringArray32 = new String[500];
		for (@Pc(34) int local34 = 0; local34 < Static379.aStringArray32.length; local34++) {
			Static379.aStringArray32[local34] = "";
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IJBI)V")
	public static void method6472(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static355.method5833(0, local17, 0, arg2, arg0, 0, local10, true);
			return;
		}
		@Pc(45) Class51 local45 = Static398.aClass18_4.method609(local29);
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (local17 == 0 || local17 == 2) {
			local58 = local45.anInt1615;
			local55 = local45.anInt1636;
		} else {
			local55 = local45.anInt1615;
			local58 = local45.anInt1636;
		}
		@Pc(69) int local69 = local45.anInt1618;
		if (local17 != 0) {
			local69 = (local69 << local17 & 0xF) + (local69 >> 4 - local17);
		}
		Static355.method5833(local69, 0, local55, arg2, arg0, local58, 0, true);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)V")
	public static void method6477(@OriginalArg(0) int arg0) {
		Static32.anInt1050 = arg0;
		Static313.anInt5997 = -1;
		Static313.anInt5997 = -1;
		Static222.method4035();
	}
}
