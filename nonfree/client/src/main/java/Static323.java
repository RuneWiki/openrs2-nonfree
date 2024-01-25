import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public static int anInt1153 = 0;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_20 = new Class119(42, 3);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBLclient!ln;I)V")
	public static void method842(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub2_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4366 == arg2 && arg2 != -1) {
			@Pc(98) Class128 local98 = Static301.aClass170_3.method3936(arg2);
			@Pc(101) int local101 = local98.anInt3973;
			if (local101 == 1) {
				arg1.anInt4333 = 0;
				arg1.anInt4327 = 0;
				arg1.anInt4336 = 1;
				arg1.anInt4387 = arg0;
				arg1.anInt4397 = 0;
				Static135.method2140(arg1.anInt4327, local98, arg1.anInt4321, arg1 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg1.anInt4318, arg1.aByte77);
			}
			if (local101 == 2) {
				arg1.anInt4333 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt4366 == -1 || Static301.aClass170_3.method3936(arg2).anInt3977 >= Static301.aClass170_3.method3936(arg1.anInt4366).anInt3977) {
			arg1.anInt4403 = arg1.anInt4404;
			arg1.anInt4336 = 1;
			arg1.anInt4397 = 0;
			arg1.anInt4387 = arg0;
			arg1.anInt4327 = 0;
			arg1.anInt4366 = arg2;
			arg1.anInt4333 = 0;
			if (arg1.anInt4366 == -1) {
				return;
			}
			Static135.method2140(arg1.anInt4327, Static301.aClass170_3.method3936(arg1.anInt4366), arg1.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg1, arg1.anInt4318, arg1.aByte77);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!bu;ILclient!bu;Lclient!qa;)V")
	public static void method844(@OriginalArg(0) Class32 arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(3) Class172 arg2) {
		Static309.aClass70_28 = Static388.method5044(arg0, Static367.anInt6181);
		Static271.aClass59_2 = arg2.method5545(Static309.aClass70_28, Static464.method5837(arg1, Static367.anInt6181));
		Static391.aClass70_32 = Static388.method5044(arg0, Static387.anInt6464);
		Static299.aClass59_3 = arg2.method5545(Static391.aClass70_32, Static464.method5837(arg1, Static387.anInt6464));
		Static269.aClass70_27 = Static388.method5044(arg0, Static230.anInt4275);
		Static321.aClass59_4 = arg2.method5545(Static269.aClass70_27, Static464.method5837(arg1, Static230.anInt4275));
	}
}
