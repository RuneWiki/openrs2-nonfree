import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!dc;B)Lclient!rf;")
	public static Class66_Sub1 method6571(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(12) Class66 local12 = Static80.method1360(arg0);
		@Pc(16) int local16 = arg0.method5596();
		return new Class66_Sub1(local12.anInt8337, local12.aClass293_8, local12.aClass15_10, local12.anInt8331, local12.anInt8333, local16);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)V")
	public static void method6572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (arg0 != Static201.anInt3738) {
			Static57.anIntArray536 = new int[arg0];
			for (local22 = 0; local22 < arg0; local22++) {
				Static57.anIntArray536[local22] = (local22 << 12) / arg0;
			}
			Static201.anInt3738 = arg0;
			Static101.anInt2038 = arg0 * 32;
			Static201.anInt3740 = arg0 - 1;
		}
		if (arg1 == Static414.anInt7271) {
			return;
		}
		if (arg1 == Static201.anInt3738) {
			Static376.anIntArray665 = Static57.anIntArray536;
		} else {
			Static376.anIntArray665 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static376.anIntArray665[local22] = (local22 << 12) / arg1;
			}
		}
		Static414.anInt7271 = arg1;
		Static575.anInt9412 = arg1 - 1;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	public static void method6573() {
		if (Static11.anInt200 <= 0) {
			Static73.aString8 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static469.aStringArray66.length; local14++) {
			if (Static469.aStringArray66[local14].indexOf("--> ") != -1) {
				local12++;
				if (local12 == Static11.anInt200) {
					Static73.aString8 = Static469.aStringArray66[local14].substring(Static469.aStringArray66[local14].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
