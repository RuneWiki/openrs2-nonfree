import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public static int anInt3008 = 0;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public static int anInt3009 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
	public static void method2806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static501.aClass341_59.method8524(); local10 != null; local10 = (Class2_Sub21) Static501.aClass341_59.method8519()) {
			Static178.method3748(arg1, arg3, arg0, arg2, local10);
		}
		for (@Pc(31) Class2_Sub21 local31 = (Class2_Sub21) Static76.aClass341_25.method8524(); local31 != null; local31 = (Class2_Sub21) Static76.aClass341_25.method8519()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class311 local40 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.method5200();
			if (local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 == -1 || local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.aBoolean450) {
				local35 = 0;
			} else if (local40.anInt9389 == local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 || local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 == local40.anInt9390 || local40.anInt9414 == local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 || local40.anInt9385 == local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064) {
				local35 = 2;
			} else if (local40.anInt9406 == local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 || local40.anInt9394 == local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 || local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 == local40.anInt9412 || local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt6064 == local40.anInt9422) {
				local35 = 3;
			}
			if (local35 != local31.anInt4680) {
				@Pc(137) int local137 = Static193.method3947(local31.aClass3_Sub1_Sub3_Sub3_Sub1_1);
				@Pc(141) Class27 local141 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.aClass27_1;
				if (local141.anIntArray43 != null) {
					local141 = local141.method727(Static286.aClass263_3);
				}
				if (local141 == null || local137 == -1) {
					local31.anInt4680 = local35;
					local31.aBoolean343 = false;
					local31.anInt4686 = -1;
				} else if (local137 == local31.anInt4686 && local141.aBoolean53 == local31.aBoolean343) {
					local31.anInt4681 = local141.anInt642;
					local31.anInt4680 = local35;
				} else {
					@Pc(182) boolean local182 = false;
					if (local31.aClass2_Sub8_Sub5_3 == null) {
						local182 = true;
					} else {
						local31.anInt4681 -= 512;
						if (local31.anInt4681 <= 0) {
							Static614.aClass2_Sub8_Sub4_2.method7925(local31.aClass2_Sub8_Sub5_3);
							local182 = true;
							local31.aClass2_Sub8_Sub5_3 = null;
						}
					}
					if (local182) {
						local31.aBoolean343 = local141.aBoolean53;
						local31.anInt4686 = local137;
						local31.aClass2_Sub29_Sub1_2 = null;
						local31.aClass2_Sub22_3 = null;
						local31.anInt4680 = local35;
						local31.anInt4681 = local141.anInt642;
					}
				}
			}
			local31.anInt4682 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt10303;
			local31.anInt4693 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt10303 + (local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.method5214() << 8);
			local31.anInt4688 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt10310;
			local31.anInt4687 = local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.anInt10310 + (local31.aClass3_Sub1_Sub3_Sub3_Sub1_1.method5214() << 8);
			Static178.method3748(arg1, arg3, arg0, arg2, local31);
		}
		for (@Pc(297) Class2_Sub21 local297 = (Class2_Sub21) Static458.aClass99_62.method3060(); local297 != null; local297 = (Class2_Sub21) Static458.aClass99_62.method3058()) {
			@Pc(308) byte local308 = 1;
			@Pc(313) Class311 local313 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.method5200();
			if (local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 == -1 || local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.aBoolean450) {
				local308 = 0;
			} else if (local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 == local313.anInt9389 || local313.anInt9390 == local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 || local313.anInt9414 == local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 || local313.anInt9385 == local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064) {
				local308 = 2;
			} else if (local313.anInt9406 == local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 || local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 == local313.anInt9394 || local313.anInt9412 == local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 || local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6064 == local313.anInt9422) {
				local308 = 3;
			}
			if (local297.anInt4680 != local308) {
				@Pc(409) int local409 = Static73.method2125(local297.aClass3_Sub1_Sub3_Sub3_Sub2_1);
				if (local409 == local297.anInt4686 && local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.aBoolean457 == local297.aBoolean343) {
					local297.anInt4681 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6137;
					local297.anInt4680 = local308;
				} else {
					@Pc(431) boolean local431 = false;
					if (local297.aClass2_Sub8_Sub5_3 == null) {
						local431 = true;
					} else {
						local297.anInt4681 -= 512;
						if (local297.anInt4681 <= 0) {
							Static614.aClass2_Sub8_Sub4_2.method7925(local297.aClass2_Sub8_Sub5_3);
							local297.aClass2_Sub8_Sub5_3 = null;
							local431 = true;
						}
					}
					if (local431) {
						local297.aBoolean343 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.aBoolean457;
						local297.anInt4681 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6137;
						local297.aClass2_Sub22_3 = null;
						local297.anInt4686 = local409;
						local297.aClass2_Sub29_Sub1_2 = null;
						local297.anInt4680 = local308;
					}
				}
			}
			local297.anInt4682 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt10303;
			local297.anInt4693 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt10303 + (local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.method5214() << 8);
			local297.anInt4688 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt10310;
			local297.anInt4687 = local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt10310 + (local297.aClass3_Sub1_Sub3_Sub3_Sub2_1.method5214() << 8);
			Static178.method3748(arg1, arg3, arg0, arg2, local297);
		}
	}
}
