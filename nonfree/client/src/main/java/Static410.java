import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!qo;")
	public static Class243 aClass243_7;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	public static int method6138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static58.anInt1960 == -1) {
			return 1;
		}
		if (arg0 != Static526.anInt8926) {
			Static508.method7307(arg0);
			if (arg0 != Static526.anInt8926) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static78.aCanvas7.getSize();
			Static236.method4028(Static159.aClass114_70.method3330(Static315.anInt5993), true, Static268.aClass27_4);
			@Pc(48) Class86 local48 = Static469.method6840(Static58.anInt1960, Static118.aClass160_26);
			@Pc(51) long local51 = Static93.method2172();
			Static478.aClass9_10.n();
			Static56.aClass22_5.oa(0, Static444.anInt7507, 0);
			Static478.aClass9_10.method7597(Static56.aClass22_5);
			Static478.aClass9_10.b(local34.width / 2, local34.height / 2, 512, 512);
			Static478.aClass9_10.M(1.0F);
			Static478.aClass9_10.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(92) Class19 local92 = Static478.aClass9_10.method7635(local48, 2048, 64, 64, 768);
			@Pc(94) int local94 = 0;
			label41: for (@Pc(96) int local96 = 0; local96 < 500; local96++) {
				Static478.aClass9_10.Z(0);
				Static478.aClass9_10.method7623();
				for (@Pc(104) int local104 = 15; local104 >= 0; local104--) {
					for (@Pc(107) int local107 = 0; local107 <= local104; local107++) {
						Static163.aClass22_6.oa((int) ((-((float) local104 / 2.0F) + (float) local107) * (float) Static40.anInt1354), 0, Static40.anInt1354 * (local104 + 1));
						local92.method7258(Static163.aClass22_6, null, 0);
						local94++;
						if (Static93.method2172() - local51 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static478.aClass9_10.method7570();
			@Pc(178) long local178 = (long) (local94 * 1000) / (Static93.method2172() - local51);
			Static478.aClass9_10.Z(0);
			Static478.aClass9_10.method7623();
			return (int) local178;
		} catch (@Pc(187) Throwable local187) {
			local187.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method6139() {
		Static412.anInt7191 = 0;
		for (@Pc(12) int local12 = 0; local12 < 2048; local12++) {
			Static133.aClass1_Sub13Array1[local12] = null;
			Static31.aByteArray13[local12] = 1;
			Static351.aClass159Array1[local12] = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
	public static int method6140() {
		return 14;
	}
}
