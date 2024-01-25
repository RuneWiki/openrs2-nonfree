import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uk", name = "I", descriptor = "Lclient!at;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "[[Lclient!rb;")
	public static Class41_Sub2[][] aClass41_Sub2ArrayArray2;

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
	public static int anInt8561 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBILclient!hca;)V")
	public static void method7123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub25 arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg1 << 14 | arg2);
		@Pc(22) Class3_Sub31 local22 = (Class3_Sub31) Static211.aClass354_17.method7689(local16);
		if (local22 == null) {
			local22 = new Class3_Sub31();
			Static211.aClass354_17.method7691(local22, local16);
			local22.aClass112_28.method3079(arg3);
			return;
		}
		@Pc(45) Class197 local45 = Static6.aClass92_1.method2673(arg3.anInt3630);
		@Pc(48) int local48 = local45.anInt5237;
		if (local45.anInt5238 == 1) {
			local48 *= arg3.anInt3631 + 1;
		}
		for (@Pc(65) Class3_Sub25 local65 = (Class3_Sub25) local22.aClass112_28.method3088(); local65 != null; local65 = (Class3_Sub25) local22.aClass112_28.method3084()) {
			local45 = Static6.aClass92_1.method2673(local65.anInt3630);
			@Pc(78) int local78 = local45.anInt5237;
			if (local45.anInt5238 == 1) {
				local78 *= local65.anInt3631 + 1;
			}
			if (local48 > local78) {
				Static576.method7736(local65, arg3);
				return;
			}
		}
		local22.aClass112_28.method3079(arg3);
	}
}
