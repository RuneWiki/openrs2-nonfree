import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZBLclient!raa;)V")
	public static void method259(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(15) int local15 = arg1.anInt8024 == 0 ? arg1.anInt7957 : arg1.anInt8024;
		@Pc(24) int local24 = arg1.anInt8029 == 0 ? arg1.anInt7985 : arg1.anInt8029;
		Static421.method6388(arg0, arg1.anInt8022, Static519.aClass295ArrayArray2[arg1.anInt8022 >> 16], local15, local24);
		if (arg1.aClass295Array2 != null) {
			Static421.method6388(arg0, arg1.anInt8022, arg1.aClass295Array2, local15, local24);
		}
		@Pc(61) Class5_Sub27 local61 = (Class5_Sub27) Static269.aClass273_11.method6581((long) arg1.anInt8022);
		if (local61 != null) {
			Static302.method4724(arg0, local61.anInt4270, local24, local15);
		}
	}
}
