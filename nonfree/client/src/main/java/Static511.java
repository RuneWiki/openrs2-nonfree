import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!r;")
	public static Class45 aClass45_12;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "J")
	public static long aLong240;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qq;B)V")
	public static void method6885(@OriginalArg(0) Class3_Sub42 arg0) {
		Static286.aClass112_31.method3079(arg0);
		arg0.anInt7408 = arg0.aClass3_Sub11_Sub1_1.anInt6128;
		Static236.anInt4199 += arg0.anInt7408;
		arg0.aClass3_Sub11_Sub1_1.anInt6128 = 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method6886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static503.aByteArrayArrayArray11[1].length > arg1 && Static503.aByteArrayArrayArray11[1][arg1].length > arg0) {
			return (Static503.aByteArrayArrayArray11[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public static void method6887() {
		Static186.method3170(Static283.aClass361_8);
		Static308.anInt5179++;
		if (Static382.aBoolean502 && Static82.aBoolean667) {
			@Pc(26) int local26 = Static465.aClass86_1.method7267();
			@Pc(30) int local30 = Static465.aClass86_1.method7265();
			local26 -= Static495.anInt8057;
			local30 -= Static380.anInt6521;
			if (local26 < Static328.anInt5531) {
				local26 = Static328.anInt5531;
			}
			if (Static504.aClass361_14.anInt9668 + Static328.anInt5531 < Static283.aClass361_8.anInt9668 + local26) {
				local26 = Static504.aClass361_14.anInt9668 + Static328.anInt5531 - Static283.aClass361_8.anInt9668;
			}
			if (local30 < Static436.anInt7281) {
				local30 = Static436.anInt7281;
			}
			if (Static436.anInt7281 + Static504.aClass361_14.anInt9650 < Static283.aClass361_8.anInt9650 + local30) {
				local30 = Static436.anInt7281 + Static504.aClass361_14.anInt9650 - Static283.aClass361_8.anInt9650;
			}
			@Pc(100) int local100 = local26 + Static504.aClass361_14.anInt9633 - Static328.anInt5531;
			@Pc(108) int local108 = Static504.aClass361_14.anInt9655 + local30 - Static436.anInt7281;
			@Pc(160) Class3_Sub32 local160;
			if (Static465.aClass86_1.method7271()) {
				if (Static283.aClass361_8.anInt9656 < Static308.anInt5179) {
					@Pc(199) int local199 = local26 - Static52.anInt998;
					@Pc(204) int local204 = local30 - Static493.anInt9519;
					if (Static283.aClass361_8.anInt9619 < local199 || local199 < -Static283.aClass361_8.anInt9619 || Static283.aClass361_8.anInt9619 < local204 || local204 < -Static283.aClass361_8.anInt9619) {
						Static202.aBoolean282 = true;
					}
				}
				if (Static283.aClass361_8.anObjectArray32 != null && Static202.aBoolean282) {
					local160 = new Class3_Sub32();
					local160.aClass361_6 = Static283.aClass361_8;
					local160.anObjectArray1 = Static283.aClass361_8.anObjectArray32;
					local160.anInt4750 = local108;
					local160.anInt4748 = local100;
					Static312.method4566(local160);
				}
			} else {
				if (Static202.aBoolean282) {
					Static296.method4392();
					if (Static283.aClass361_8.anObjectArray23 != null) {
						local160 = new Class3_Sub32();
						local160.aClass361_7 = Static475.aClass361_13;
						local160.aClass361_6 = Static283.aClass361_8;
						local160.anInt4750 = local108;
						local160.anObjectArray1 = Static283.aClass361_8.anObjectArray23;
						local160.anInt4748 = local100;
						Static312.method4566(local160);
					}
					if (Static475.aClass361_13 != null && Static71.method1530(Static283.aClass361_8) != null) {
						Static255.method3919(Static283.aClass361_8, Static475.aClass361_13);
					}
				} else if ((Static521.anInt8378 == 1 || Static490.method6636()) && Static571.anInt9281 > 2) {
					Static280.method4132(Static493.anInt9519 + Static380.anInt6521, Static495.anInt8057 + Static52.anInt998);
				} else if (Static130.method6017()) {
					Static280.method4132(Static380.anInt6521 + Static493.anInt9519, Static495.anInt8057 - -Static52.anInt998);
				}
				Static283.aClass361_8 = null;
			}
		} else if (Static308.anInt5179 > 1) {
			Static283.aClass361_8 = null;
		}
	}
}
