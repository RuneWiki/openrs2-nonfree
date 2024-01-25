import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
	public static int[] anIntArray425 = new int[2];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!rda;)I")
	public static int method6771(@OriginalArg(1) Class1_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt8476;
		@Pc(17) Class316 local17 = arg0.method6921();
		if (arg0.anInt8409 == -1 || arg0.aBoolean589) {
			local13 = arg0.anInt8452;
		} else if (arg0.anInt8409 == local17.anInt9146 || arg0.anInt8409 == local17.anInt9142 || arg0.anInt8409 == local17.anInt9157 || arg0.anInt8409 == local17.anInt9121) {
			local13 = arg0.anInt8468;
		} else if (arg0.anInt8409 == local17.anInt9149 || local17.anInt9151 == arg0.anInt8409 || local17.anInt9162 == arg0.anInt8409 || arg0.anInt8409 == local17.anInt9138) {
			local13 = arg0.anInt8474;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)V")
	public static void method6775() {
		Static32.aClass350_2.method8203();
		Static482.aClass18_7.method227();
		Static469.aClass18_6.method227();
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method6779() {
		if (Static534.aBoolean671) {
			return;
		}
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static213.aFloat141 = (int) Static213.aFloat141 - 17 & 0xFFFFFFF0;
		} else {
			Static436.aFloat210 += (-12.0F - Static436.aFloat210) / 2.0F;
		}
		Static65.aBoolean51 = true;
		Static534.aBoolean671 = true;
	}
}
