import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
	public static int anInt10389;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
	public static boolean aBoolean781 = false;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)Z")
	public static boolean method9046() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static162.aHashtable3.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static162.aHashtable3.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static162.aHashtable3.keys();
				while (local12.hasMoreElements()) {
					@Pc(72) String local72 = (String) local12.nextElement();
					try {
						@Pc(77) File local77 = (File) Static590.aHashtable6.get(local72);
						@Pc(82) Class local82 = (Class) Static162.aHashtable3.get(local72);
						@Pc(88) Vector local88 = (Vector) local37.get(local82.getClassLoader());
						for (@Pc(90) int local90 = 0; local90 < local88.size(); local90++) {
							try {
								@Pc(96) Object local96 = local88.elementAt(local90);
								@Pc(101) Field local101 = local96.getClass().getDeclaredField("name");
								local47.invoke(local101, Boolean.TRUE);
								try {
									@Pc(116) String local116 = (String) local101.get(local96);
									if (local116 != null && local116.equalsIgnoreCase(local77.getCanonicalPath())) {
										@Pc(128) Field local128 = local96.getClass().getDeclaredField("handle");
										@Pc(135) Method local135 = local96.getClass().getDeclaredMethod("finalize");
										local47.invoke(local128, Boolean.TRUE);
										local47.invoke(local135, Boolean.TRUE);
										try {
											local135.invoke(local96);
											local128.set(local96, Integer.valueOf(0));
											local9.remove(local72);
										} catch (@Pc(174) Throwable local174) {
										}
										local47.invoke(local135, Boolean.FALSE);
										local47.invoke(local128, Boolean.FALSE);
									}
								} catch (@Pc(196) Throwable local196) {
								}
								local47.invoke(local101, Boolean.FALSE);
							} catch (@Pc(208) Throwable local208) {
							}
						}
					} catch (@Pc(220) Throwable local220) {
					}
				}
			} catch (@Pc(226) Throwable local226) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(238) Throwable local238) {
		}
		Static162.aHashtable3 = local9;
		return Static162.aHashtable3.isEmpty();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method9047(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static671.aClass13_21 = arg0;
		Static593.anInt9541 = arg1;
		Static140.aBoolean220 = Static593.anInt9541 > 1 && Static671.aClass13_21.method8497();
		Static391.anInt10262 = 9;
		Static207.anInt4003 = 0x1 << Static391.anInt10262;
		Static597.anInt9602 = Static207.anInt4003 >> 1;
		Math.sqrt((double) (Static597.anInt9602 * Static597.anInt9602 + Static597.anInt9602 * Static597.anInt9602));
		Static183.anInt3720 = 4;
		Static146.anInt2951 = arg2;
		Static602.anInt9668 = arg3;
		Static7.anInt94 = arg4;
		Class239_Sub3.lb = Static293.method4572();
		Static354.method5234();
		Static334.aClass164ArrayArrayArray3 = new Class164[4][Static146.anInt2951][Static602.anInt9668];
		Static582.aClass21Array3 = new Class21[4];
		if (arg5) {
			Static101.anIntArrayArray14 = new int[Static146.anInt2951][Static602.anInt9668];
			Static62.aByteArrayArray5 = new byte[Static146.anInt2951][Static602.anInt9668];
			Static495.aShortArrayArray28 = new short[Static146.anInt2951][Static602.anInt9668];
			Static275.aClass164ArrayArrayArray2 = new Class164[1][Static146.anInt2951][Static602.anInt9668];
			Static108.aClass21Array1 = new Class21[1];
		} else {
			Static101.anIntArrayArray14 = null;
			Static62.aByteArrayArray5 = null;
			Static495.aShortArrayArray28 = null;
			Static275.aClass164ArrayArrayArray2 = null;
			Static108.aClass21Array1 = null;
		}
		if (arg6) {
			Static234.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static541.aClass265Array1 = new Class265[65535];
			Static648.aBooleanArray55 = new boolean[65535];
			Static486.anInt8045 = 0;
		} else {
			Static234.aLongArrayArrayArray1 = null;
			Static541.aClass265Array1 = null;
			Static648.aBooleanArray55 = null;
			Static486.anInt8045 = 0;
		}
		Static524.method7321(false);
		Static539.aClass28_Sub1Array26 = new Class28_Sub1[2];
		Static38.aClass28_Sub1Array5 = new Class28_Sub1[2];
		Static198.aClass28_Sub1Array37 = new Class28_Sub1[2];
		Static389.aClass28_Sub1Array15 = new Class28_Sub1[10000];
		Static116.anInt2393 = 0;
		Static523.aClass28_Sub1Array24 = new Class28_Sub1[5000];
		Static367.anInt5935 = 0;
		Static443.aClass28_Sub1_Sub1Array1 = new Class28_Sub1_Sub1[5000];
		Static77.anInt1423 = 0;
		Static430.aBooleanArrayArray7 = new boolean[Static7.anInt94 + Static7.anInt94 + 1][Static7.anInt94 + Static7.anInt94 + 1];
		Static600.aBooleanArrayArray8 = new boolean[Static7.anInt94 + Static7.anInt94 + 2][Static7.anInt94 + Static7.anInt94 + 2];
		Static174.anIntArray300 = new int[Static7.anInt94 + Static7.anInt94 + 2];
		Static645.aClass321_3 = Static645.aClass321_2;
		if (Static140.aBoolean220) {
			Static614.aBooleanArrayArrayArray2 = new boolean[4][Static7.anInt94 + Static7.anInt94 + 1][Static7.anInt94 + Static7.anInt94 + 1];
			Static45.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static569.aClass383Array1 != null) {
				Static503.method7149();
			}
			Static569.aClass383Array1 = new Class383[Static593.anInt9541];
			Static671.aClass13_21.method8521(Static569.aClass383Array1.length + 1);
			Static671.aClass13_21.method8458(0);
			for (@Pc(205) int local205 = 0; local205 < Static569.aClass383Array1.length; local205++) {
				Static569.aClass383Array1[local205] = new Class383(local205 + 1, Static671.aClass13_21);
				(new Thread(Static569.aClass383Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static593.anInt9541 == 2) {
				local240 = 4;
				Static406.anInt6453 = 2;
			} else if (Static593.anInt9541 == 3) {
				local240 = 6;
				Static406.anInt6453 = 3;
			} else {
				local240 = 8;
				Static406.anInt6453 = 4;
			}
			Static324.aClass148Array1 = new Class148[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static324.aClass148Array1[local260] = new Class148(Static93.aStringArrayArray167[Static593.anInt9541 - 2][local260]);
			}
		} else {
			Static406.anInt6453 = 1;
		}
		Static219.anIntArray374 = new int[Static406.anInt6453 - 1];
		Static589.anIntArray820 = new int[Static406.anInt6453 - 1];
	}
}
