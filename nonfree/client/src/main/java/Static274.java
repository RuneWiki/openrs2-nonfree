import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BZ)I")
	public static int method4004(@OriginalArg(1) boolean arg0) {
		if (Static411.anIntArray437 == null) {
			return 0;
		} else if (arg0 || Static446.aClass144Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static411.anIntArray437.length; local27++) {
				@Pc(33) int local33 = Static411.anIntArray437[local27];
				if (Static247.aClass308_96.method6538(local33)) {
					local20++;
				}
				if (Static284.aClass308_177.method6538(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static411.anIntArray437.length * 2;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)V")
	public static void method4005(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 1);
		local8.method4835();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!in;)V")
	public static void method4006(@OriginalArg(1) Class160 arg0) {
		@Pc(7) Class160 local7 = Static524.method1213(arg0);
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (local7 == null) {
			local15 = Static349.anInt6422;
			local17 = Static594.anInt9806;
		} else {
			local17 = local7.anInt4156;
			local15 = local7.anInt4182;
		}
		Static297.method4409(local17, arg0, false, local15);
		Static80.method1330(local15, arg0, local17);
	}
}
