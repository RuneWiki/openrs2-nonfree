import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
	public static int anInt4459;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!qe;")
	public static final Class269 aClass269_2 = new Class269();

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "[B")
	public static final byte[] aByteArray106 = new byte[2048];

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZIZI)I")
	public static int method3570(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class3_Sub44 local15 = Static470.method6424(false, arg2);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray446.length; local23++) {
			if (local15.anIntArray446[local23] >= 0 && Static272.aClass121_2.anInt4085 > local15.anIntArray446[local23]) {
				@Pc(48) Class133 local48 = Static272.aClass121_2.method3327(local15.anIntArray446[local23]);
				@Pc(58) int local58 = local48.method3549(Static106.aClass27_1.method483(arg0).anInt1311, arg0);
				if (arg1) {
					local21 += local58 * local15.anIntArray447[local23];
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
	public static void method3571() {
		if (!Static253.aBoolean325) {
			return;
		}
		@Pc(11) Class251 local11 = Static137.method2669(Static164.anInt3670, Static149.anInt3464);
		if (local11 != null && local11.anObjectArray3 != null) {
			@Pc(25) Class3_Sub36 local25 = new Class3_Sub36();
			local25.aClass251_8 = local11;
			local25.anObjectArray1 = local11.anObjectArray3;
			Static583.method7919(local25);
		}
		Static511.anInt8807 = -1;
		Static253.aBoolean325 = false;
		Static580.anInt10049 = -1;
		if (local11 != null) {
			Static588.method8016(local11);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3572(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		Static451.method6315();
		Static521.method7221();
		Static131.method2563();
		Static363.method4394(arg1, arg0);
		Static531.method7273();
		Static481.method6558(Static319.aClass31_11);
		Static420.method5838(Static319.aClass31_11);
		Static4.method54(Static194.aClass284_60, Static319.aClass31_11);
		Static308.method4619();
		Static328.method4872(Static459.aClass73Array12);
		Static246.method3899();
		Static564.method7698();
		if (Static409.anInt1461 == 3) {
			Static27.method293(4);
		} else if (Static409.anInt1461 == 7) {
			Static27.method293(8);
		} else if (Static409.anInt1461 == 10) {
			Static27.method293(11);
		} else if (Static409.anInt1461 == 1 || Static409.anInt1461 == 2) {
			Static77.method1824();
		}
	}
}
