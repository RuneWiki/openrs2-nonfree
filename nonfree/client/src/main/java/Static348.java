import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
	public static int[] anIntArray632;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_146 = new Class85("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public static int anInt6696 = 0;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public static int anInt6698 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method5934() {
		while (true) {
			if (Static187.aClass5_Sub12_Sub2_4.method5119(Static54.anInt1000) >= 11) {
				@Pc(18) int local18 = Static187.aClass5_Sub12_Sub2_4.method5120(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static62.aClass4_Sub5_Sub2_Sub1Array1[local18] == null) {
						Static62.aClass4_Sub5_Sub2_Sub1Array1[local18] = new Class4_Sub5_Sub2_Sub1();
						Static62.aClass4_Sub5_Sub2_Sub1Array1[local18].anInt5386 = local18;
						local25 = true;
						if (Static160.aClass5_Sub12Array1[local18] != null) {
							Static62.aClass4_Sub5_Sub2_Sub1Array1[local18].method4124(Static160.aClass5_Sub12Array1[local18]);
						}
					}
					Static88.anIntArray137[Static22.anInt472++] = local18;
					@Pc(66) Class4_Sub5_Sub2_Sub1 local66 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local18];
					local66.anInt5350 = Static283.anInt5563;
					@Pc(74) int local74 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
					if (local74 == 1) {
						Static76.anIntArray118[Static195.anInt3883++] = local18;
					}
					@Pc(92) int local92 = Static187.aClass5_Sub12_Sub2_4.method5120(5);
					if (local92 > 15) {
						local92 -= 32;
					}
					@Pc(103) int local103 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
					@Pc(110) int local110 = Static101.anIntArray180[Static187.aClass5_Sub12_Sub2_4.method5120(3)];
					@Pc(115) int local115 = Static187.aClass5_Sub12_Sub2_4.method5120(5);
					if (local115 > 15) {
						local115 -= 32;
					}
					if (local25) {
						local66.method4812(local110);
					}
					local66.method4118(local103 == 1, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] + local92, Static239.anInt4811, local115 + Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0]);
					continue;
				}
			}
			Static187.aClass5_Sub12_Sub2_4.method5121();
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBZ)V")
	public static void method5935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static342.anInt6605 == 0) {
			Static92.method1666(false);
		} else {
			Static128.anInt3750 = Static342.anInt6605;
			Static144.method2633(0);
		}
		Static217.aBoolean353 = arg3;
		Static319.anInt6185 = arg1;
		Static227.anInt4569 = arg2;
		Static290.method2561(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!ij;)V")
	public static void method5941(@OriginalArg(1) Class93 arg0) {
		Static354.aClass93_136 = arg0;
	}
}
