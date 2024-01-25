import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_96 = new Class186(63, -1);

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_53 = new Class38();

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[5];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III[BIB)Z")
	public static boolean method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5 = true;
		@Pc(15) Class1_Sub13 local15 = new Class1_Sub13(arg3);
		@Pc(17) int local17 = -1;
		label70: while (true) {
			@Pc(21) int local21 = local15.method3062();
			if (local21 == 0) {
				return local5;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			@Pc(34) boolean local34 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(94) Class288 local94;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(40) int local40;
									while (local34) {
										local40 = local15.method3066();
										if (local40 == 0) {
											continue label70;
										}
										local15.method3043();
									}
									local40 = local15.method3066();
									if (local40 == 0) {
										continue label70;
									}
									local32 += local40 - 1;
									@Pc(52) int local52 = local32 & 0x3F;
									@Pc(58) int local58 = local32 >> 6 & 0x3F;
									local64 = local15.method3043() >> 2;
									local68 = arg4 + local58;
									local72 = arg1 + local52;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (local68 >= arg2 - 1);
					} while (local72 >= arg0 - 1);
					local94 = Static365.aClass194_6.method5084(local17);
				} while (local64 == 22 && !Static89.aClass1_Sub28_Sub1_1.aBoolean319 && local94.anInt8338 == 0 && local94.anInt8363 != 1 && !local94.aBoolean568);
				if (!local94.method7058()) {
					Static541.anInt9379++;
					local5 = false;
				}
				local34 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
	public static void method6074() {
		Static68.aClass160_17.anInt4800 = 1;
		Static513.method7336();
		Static109.aBoolean177 = true;
		Static324.aBoolean418 = true;
		Static329.method5371();
		for (@Pc(7039) int local7039 = 0; local7039 < Static484.aClass28Array1.length; local7039++) {
			Static484.aClass28Array1[local7039] = null;
		}
		Static382.aBoolean440 = false;
		Static170.method3304();
		Static186.anInt3940 = (int) (Math.random() * 100.0D) - 50;
		Static443.aFloat151 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static157.anInt3480 = (int) (Math.random() * 80.0D) - 40;
		Static96.anInt2375 = (int) (Math.random() * 120.0D) - 60;
		Static189.anInt4000 = (int) (Math.random() * 30.0D) - 20;
		Static403.anInt8578 = (int) (Math.random() * 110.0D) - 55;
		Static98.method6252();
		for (@Pc(7106) int local7106 = 0; local7106 < 2048; local7106++) {
			Static473.aClass47_Sub2_Sub3_Sub2Array1[local7106] = null;
		}
		Static198.anInt4112 = 0;
		Static457.anInt7857 = 0;
		Static258.aClass174_15.method4423();
		Static228.aClass38_76.method1417();
		Static35.aClass38_14.method1417();
		Static368.aClass145_7.method3920();
		Static528.aClass174_40.method4423();
		Static500.aClass38_71 = new Class38();
		Static343.aClass286_1.method6997();
		Static175.method3351();
		Static56.anInt1561 = 0;
		Static382.anInt6686 = 0;
		Static19.anInt866 = 0;
		Static217.anInt4444 = 0;
		Static501.anInt8508 = 0;
		Static413.anInt7200 = 0;
		Static404.anInt9256 = 0;
		Static97.anInt6559 = 0;
		Static110.anInt2572 = 0;
		Static4.anInt95 = 0;
		for (@Pc(7167) int local7167 = 0; local7167 < Static52.anIntArray138.length; local7167++) {
			if (!Static99.aBooleanArray12[local7167]) {
				Static52.anIntArray138[local7167] = -1;
			}
		}
		if (Static85.anInt2201 != -1) {
			Static257.method7981(Static85.anInt2201);
		}
		for (@Pc(7196) Class1_Sub5 local7196 = (Class1_Sub5) Static484.aClass174_32.method4421(); local7196 != null; local7196 = (Class1_Sub5) Static484.aClass174_32.method4429()) {
			if (!local7196.method7979()) {
				local7196 = (Class1_Sub5) Static484.aClass174_32.method4421();
				if (local7196 == null) {
					break;
				}
			}
			Static82.method2049(false, local7196, true);
		}
		Static85.anInt2201 = -1;
		Static484.aClass174_32 = new Class174(8);
		Static366.method6077();
		Static531.aClass309_14 = null;
		for (@Pc(7234) int local7234 = 0; local7234 < 8; local7234++) {
			Static231.aStringArray43[local7234] = null;
			Static156.aBooleanArray15[local7234] = false;
			Static510.anIntArray736[local7234] = -1;
		}
		Static485.method7019();
		Static208.aBoolean263 = true;
		for (@Pc(7259) int local7259 = 0; local7259 < 100; local7259++) {
			Static145.aBooleanArray14[local7259] = true;
		}
		for (@Pc(7272) int local7272 = 0; local7272 < 6; local7272++) {
			Static317.aClass306Array1[local7272] = new Class306();
		}
		for (@Pc(7285) int local7285 = 0; local7285 < 25; local7285++) {
			Static361.anIntArray488[local7285] = 0;
			Static507.anIntArray734[local7285] = 0;
			Static187.anIntArray303[local7285] = 0;
		}
		Static157.method3127();
		Static396.aShortArray122 = Static60.aShortArray20 = Static264.aShortArray82 = Static469.aShortArray138 = new short[256];
		Static126.aBoolean196 = true;
		Static538.aString84 = Static398.aClass114_136.method3330(Static315.anInt5993);
		Static89.aClass1_Sub28_Sub1_1.aBoolean333 = false;
		Static242.anInt1986 = 0;
		Static89.aClass1_Sub28_Sub1_1.aBoolean336 = false;
		Static241.method2709();
		Static363.method6954();
		Static68.aClass160_17.anInt4800 = 2;
		Static515.aClass1_Sub36_2 = null;
		Static246.aLong123 = 0L;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([SII)[S")
	public static short[] method6075(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static555.method5091(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
