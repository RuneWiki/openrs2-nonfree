import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_40 = new Class163(78, 8);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!la;")
	public static final Class136 aClass136_33 = new Class136(43, 8);

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!la;")
	public static final Class136 aClass136_34 = new Class136(77, 3);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!la;")
	public static final Class136 aClass136_35 = new Class136(23, 6);

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[S")
	public static short[] aShortArray16 = new short[256];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ee;B)V")
	public static void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (Static97.aBoolean110) {
			Static97.aBoolean110 = false;
			arg0 = 0;
		}
		if (Static438.aClass57_3 != null && Static438.aClass57_3.method1539(arg1)) {
			return;
		}
		Static438.aClass57_3 = arg1;
		Static114.aLong77 = Static354.method4966();
		Static294.anInt5093 = arg0;
		Static313.anInt5320 = arg0;
		if (Static313.anInt5320 == 0) {
			Static259.method3611();
			return;
		}
		Static324.anInt5432 = Static189.anInt3449;
		Static55.aFloat13 = Static77.aFloat23;
		Static168.aFloat52 = Static53.aFloat12;
		Static353.anInt7447 = Static66.anInt1271;
		Static380.aFloat96 = Static410.aFloat98;
		Static443.aFloat104 = Static438.aFloat35;
		Static138.anInt2451 = Static442.anInt7408;
		Static452.aClass139_4 = Static150.aClass139_3;
		Static31.aFloat9 = Static258.aFloat60;
		Static459.aFloat93 = Static366.aFloat94;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public static boolean method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method1250(@OriginalArg(0) Class167 arg0) {
		for (@Pc(1) int local1 = Static425.anInt2154; local1 < Static174.anInt3263; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static459.anInt5916; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static342.anInt5746; local7++) {
					@Pc(16) Class227 local16 = Static389.aClass227ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub3 local21 = local16.aClass1_Sub3_3;
						@Pc(24) Class1_Sub3 local24 = local16.aClass1_Sub3_2;
						if (local21 != null && local21.method6247()) {
							Static177.method2850(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6247()) {
								Static177.method2850(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6248(0, local21, 0, 0, arg0, false);
								local24.method6244();
							}
							local21.method6244();
						}
						for (@Pc(70) Class114 local70 = local16.aClass114_2; local70 != null; local70 = local70.aClass114_1) {
							@Pc(74) Class1_Sub2 local74 = local70.aClass1_Sub2_1;
							if (local74 != null && local74.method6247()) {
								Static177.method2850(arg0, local74, local1, local4, local7, local74.aShort109 + 1 - local74.aShort108, local74.aShort110 - local74.aShort107 + 1);
								local74.method6244();
							}
						}
						@Pc(111) Class1_Sub4 local111 = local16.aClass1_Sub4_2;
						if (local111 != null && local111.method6247()) {
							Static222.method4447(arg0, local111, local1, local4, local7);
							local111.method6244();
						}
					}
				}
			}
		}
	}
}
