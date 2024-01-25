import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qga", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!qga", name = "m", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_15 = new Class210(7, 2);

	@OriginalMember(owner = "client!qga", name = "r", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_54 = new Class352(128, 4);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!kq;)V")
	public static void method6658(@OriginalArg(1) Class199 arg0) {
		if (!Static463.aBoolean582) {
			return;
		}
		if (arg0.anObjectArray33 != null) {
			@Pc(24) Class199 local24 = Static203.method3070(Static292.anInt4612, Static169.anInt3012);
			if (local24 != null) {
				@Pc(30) Class4_Sub25 local30 = new Class4_Sub25();
				local30.aClass199_6 = arg0;
				local30.aClass199_5 = local24;
				local30.anObjectArray2 = arg0.anObjectArray33;
				Static237.method3393(local30);
			}
		}
		@Pc(47) Class4_Sub48 local47 = Static335.method4615(Static331.aClass216_90, Static669.aClass196_2);
		local47.aClass4_Sub11_Sub1_2.method8860(arg0.anInt5041);
		local47.aClass4_Sub11_Sub1_2.method8876(Static292.anInt4612);
		local47.aClass4_Sub11_Sub1_2.method8860(Static169.anInt3012);
		local47.aClass4_Sub11_Sub1_2.method8891(arg0.anInt5005);
		local47.aClass4_Sub11_Sub1_2.method8891(arg0.anInt5002);
		local47.aClass4_Sub11_Sub1_2.method8891(Static270.anInt4357);
		Static410.method5170(local47);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!es;B)Lclient!lh;")
	public static Class103 method6659(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(10) Class291 local10 = Static305.method4279()[arg0.method8865()];
		@Pc(17) Class125 local17 = Static640.method8546()[arg0.method8865()];
		@Pc(29) int local29 = arg0.method8834();
		@Pc(33) int local33 = arg0.method8834();
		@Pc(37) int local37 = arg0.method8859();
		@Pc(41) int local41 = arg0.method8859();
		@Pc(45) int local45 = arg0.method8834();
		@Pc(49) int local49 = arg0.method8850();
		@Pc(53) int local53 = arg0.method8850();
		return new Class103(local10, local17, local29, local33, local37, local41, local45, local49, local53);
	}
}
