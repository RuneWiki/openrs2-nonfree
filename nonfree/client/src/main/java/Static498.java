import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Lclient!oh;")
	public static Class237 aClass237_122;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
	public static void method7245() {
		Static205.aClass237_57.anInt7642 = 1;
		Static137.method2951();
		Static269.aBoolean407 = true;
		Static216.aBoolean372 = true;
		Static32.method1189();
		for (@Pc(8098) int local8098 = 0; local8098 < Static447.aClass319Array3.length; local8098++) {
			Static447.aClass319Array3[local8098] = null;
		}
		Static147.aBoolean270 = false;
		Static252.method4535();
		Static642.anInt10689 = (int) (Math.random() * 120.0D) - 60;
		Static499.aFloat185 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static425.anInt6305 = (int) (Math.random() * 80.0D) - 40;
		Static598.anInt2012 = (int) (Math.random() * 110.0D) - 55;
		Static423.anInt7961 = (int) (Math.random() * 30.0D) - 20;
		Static291.anInt5939 = (int) (Math.random() * 100.0D) - 50;
		Static334.method5417();
		for (@Pc(8168) int local8168 = 0; local8168 < 2048; local8168++) {
			Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local8168] = null;
		}
		Static438.anInt8226 = 0;
		Static59.anInt1906 = 0;
		Static278.aClass253_20.method6598();
		Static199.aClass43_27.method1431();
		Static272.aClass43_30.method1431();
		Static330.aClass123_6.method3534();
		Static567.aClass253_38.method6598();
		Static41.aClass43_12 = new Class43();
		Static420.aClass77_1.method2396();
		Static508.method7338();
		Static284.anInt5885 = 0;
		Static567.anInt9757 = 0;
		Class15_Sub1_Sub2_Sub2.lb = 0;
		Static345.anInt6703 = 0;
		Static258.anInt5552 = 0;
		Static91.anInt2548 = 0;
		Static7.anInt6410 = 0;
		Static324.anInt6509 = 0;
		Static243.anInt5395 = 0;
		Static330.anInt4197 = 0;
		for (@Pc(8230) int local8230 = 0; local8230 < Static69.anIntArray417.length; local8230++) {
			if (!Static378.aBooleanArray19[local8230]) {
				Static69.anIntArray417[local8230] = -1;
			}
		}
		if (Static212.anInt4965 != -1) {
			Static297.method4905(Static212.anInt4965);
		}
		for (@Pc(8260) Class8_Sub51 local8260 = (Class8_Sub51) Static218.aClass253_14.method6593(); local8260 != null; local8260 = (Class8_Sub51) Static218.aClass253_14.method6595()) {
			if (!local8260.method8639()) {
				local8260 = (Class8_Sub51) Static218.aClass253_14.method6593();
				if (local8260 == null) {
					break;
				}
			}
			Static406.method6452(true, local8260, false);
		}
		Static212.anInt4965 = -1;
		Static218.aClass253_14 = new Class253(8);
		Static348.method5528();
		Static523.aClass331_16 = null;
		for (@Pc(8300) int local8300 = 0; local8300 < 8; local8300++) {
			Static370.aStringArray19[local8300] = null;
			Static560.aBooleanArray28[local8300] = false;
			Static525.anIntArray504[local8300] = -1;
		}
		Static626.method8434();
		Static50.aBoolean125 = true;
		for (@Pc(8324) int local8324 = 0; local8324 < 100; local8324++) {
			Static620.aBooleanArray29[local8324] = true;
		}
		for (@Pc(8336) int local8336 = 0; local8336 < 6; local8336++) {
			Static28.aClass305Array1[local8336] = new Class305();
		}
		for (@Pc(8352) int local8352 = 0; local8352 < 25; local8352++) {
			Static42.anIntArray60[local8352] = 0;
			Static99.anIntArray117[local8352] = 0;
			Static560.anIntArray532[local8352] = 0;
		}
		Static364.method5679();
		Static69.aBoolean558 = true;
		Static487.aShortArray107 = Static54.aShortArray4 = Static309.aShortArray76 = Static119.aShortArray12 = new short[256];
		Static289.aString69 = Static121.aClass84_26.method2710(Static372.anInt7083);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub3_2, Static155.aClass8_Sub25_6.aClass36_Sub3_1.method2233());
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub13_1, Static155.aClass8_Sub25_6.aClass36_Sub13_2.method4838());
		Static48.anInt4222 = 0;
		Static607.method6375();
		Static499.method7247();
		Static246.aClass8_Sub48_2 = null;
		Static18.aLong10 = 0L;
		Static205.aClass237_57.anInt7642 = 2;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(II)Z")
	public static boolean method7246(@OriginalArg(1) int arg0) {
		if (Static557.aBooleanArray27[arg0]) {
			return true;
		} else if (Static640.aClass237_151.method6324(arg0)) {
			@Pc(25) int local25 = Static640.aClass237_151.method6315(arg0);
			if (local25 == 0) {
				Static557.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static368.aClass331ArrayArray2[arg0] == null) {
				Static368.aClass331ArrayArray2[arg0] = new Class331[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static368.aClass331ArrayArray2[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static640.aClass237_151.method6314(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class331 local73 = Static368.aClass331ArrayArray2[arg0][local47] = new Class331();
						local73.anInt9578 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7748(new Class8_Sub8(local61));
					}
				}
			}
			Static557.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
