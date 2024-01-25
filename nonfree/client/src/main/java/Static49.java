import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!mg;")
	public static Class160 aClass160_6;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "F")
	public static float aFloat16 = 1.0F;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public static final int anInt970 = 1339;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!em;BZ)V")
	public static void method804(@OriginalArg(0) Class68 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(21) int local21 = arg0.anInt2179 == 0 ? arg0.anInt2188 : arg0.anInt2179;
		@Pc(33) int local33 = arg0.anInt2243 == 0 ? arg0.anInt2252 : arg0.anInt2243;
		Static36.method599(local33, Static60.aClass68ArrayArray1[arg0.anInt2229 >> 16], arg0.anInt2229, local21, arg1);
		if (arg0.aClass68Array1 != null) {
			Static36.method599(local33, arg0.aClass68Array1, arg0.anInt2229, local21, arg1);
		}
		@Pc(66) Class2_Sub35 local66 = (Class2_Sub35) Static113.aClass163_11.method3769((long) arg0.anInt2229);
		if (local66 != null) {
			Static383.method5092(local66.anInt5537, local21, local33, arg1);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!oo;III)V")
	public static void method805(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub31 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 | arg3 << 28 | arg0 << 14);
		@Pc(22) Class2_Sub14 local22 = (Class2_Sub14) Static132.aClass163_13.method3769(local16);
		if (local22 == null) {
			local22 = new Class2_Sub14();
			Static132.aClass163_13.method3764(local16, local22);
			local22.aClass14_22.method300(arg1);
			return;
		}
		@Pc(45) Class45 local45 = Static318.aClass144_6.method3265(arg1.anInt5175);
		@Pc(48) int local48 = local45.anInt1099;
		if (local45.anInt1107 == 1) {
			local48 *= arg1.anInt5174 + 1;
		}
		for (@Pc(73) Class2_Sub31 local73 = (Class2_Sub31) local22.aClass14_22.method309(); local73 != null; local73 = (Class2_Sub31) local22.aClass14_22.method311()) {
			local45 = Static318.aClass144_6.method3265(local73.anInt5175);
			@Pc(84) int local84 = local45.anInt1099;
			if (local45.anInt1107 == 1) {
				local84 *= local73.anInt5174 + 1;
			}
			if (local84 < local48) {
				Static219.method3438(local73, arg1);
				return;
			}
		}
		local22.aClass14_22.method300(arg1);
	}
}
