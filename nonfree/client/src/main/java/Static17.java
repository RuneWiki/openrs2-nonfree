import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array2;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!wo;")
	public static Class216 aClass216_5;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
	public static boolean aBoolean55 = true;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_14 = new Class34("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILclient!wd;)V")
	public static void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub40 arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(22) Class1_Sub7 local22 = (Class1_Sub7) Static339.aClass197_30.method5157(local16);
		if (local22 == null) {
			local22 = new Class1_Sub7();
			Static339.aClass197_30.method5166(local22, local16);
			local22.aClass16_2.method416(arg3);
			return;
		}
		@Pc(44) Class111 local44 = Static20.method561(arg3.anInt6580);
		@Pc(47) int local47 = local44.anInt3316;
		if (local44.anInt3287 == 1) {
			local47 *= arg3.anInt6576 + 1;
		}
		for (@Pc(66) Class1_Sub40 local66 = (Class1_Sub40) local22.aClass16_2.method410(); local66 != null; local66 = (Class1_Sub40) local22.aClass16_2.method419()) {
			local44 = Static20.method561(local66.anInt6580);
			@Pc(76) int local76 = local44.anInt3316;
			if (local44.anInt3287 == 1) {
				local76 *= local66.anInt6576 + 1;
			}
			if (local47 > local76) {
				Static97.method4761(local66, arg3);
				return;
			}
		}
		local22.aClass16_2.method416(arg3);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!bg;I)V")
	public static void method417(@OriginalArg(0) Class1_Sub8 arg0) {
		for (@Pc(16) int local16 = 0; local16 < Static227.anInt4728; local16++) {
			@Pc(22) int local22 = arg0.method4528();
			@Pc(26) int local26 = arg0.method4556();
			if (local26 == 65535) {
				local26 = -1;
			}
			if (Static85.aClass104_Sub1Array4[local22] != null) {
				Static85.aClass104_Sub1Array4[local22].anInt4706 = local26;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!wo;Lclient!wo;Z)V")
	public static void method422(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1) {
		Static191.aClass216_63 = arg0;
		Static72.aClass216_25 = arg1;
	}
}
