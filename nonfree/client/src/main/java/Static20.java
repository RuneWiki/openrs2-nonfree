import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_2 = new Class216(3, -1);

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	public static int anInt364 = -1;

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
	public static int anInt365 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method285(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static136.method2051(Static539.aClass160_118);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0));
			Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIII)V")
	public static void method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static218.anInt3718 + arg1;
		@Pc(13) int local13 = Static167.anInt3048 + arg2;
		if (Static208.aClass9ArrayArrayArray3 == null || arg1 < 0 || arg2 < 0 || Static301.anInt4912 <= arg1 || arg2 >= Static473.anInt7969) {
			return;
		}
		@Pc(41) long local41 = (long) (local13 << 14 | arg0 << 28 | local9);
		@Pc(47) Class6_Sub32 local47 = (Class6_Sub32) Static303.aClass212_22.method5106(local41);
		if (local47 == null) {
			Static481.method6680(arg0, arg1, arg2);
			return;
		}
		@Pc(61) Class6_Sub38 local61 = (Class6_Sub38) local47.aClass275_97.method6366();
		if (local61 == null) {
			Static481.method6680(arg0, arg1, arg2);
			return;
		}
		@Pc(75) Class29_Sub4_Sub1 local75 = (Class29_Sub4_Sub1) Static481.method6680(arg0, arg1, arg2);
		if (local75 == null) {
			local75 = new Class29_Sub4_Sub1();
		} else {
			local75.anInt6131 = local75.anInt6121 = -1;
		}
		local75.anInt6124 = local61.anInt5948;
		local75.anInt6120 = local61.anInt5951;
		label46: while (true) {
			@Pc(108) Class6_Sub38 local108 = (Class6_Sub38) local47.aClass275_97.method6364();
			if (local108 == null) {
				break;
			}
			if (local108.anInt5948 != local75.anInt6124) {
				local75.anInt6131 = local108.anInt5948;
				local75.anInt6130 = local108.anInt5951;
				while (true) {
					@Pc(131) Class6_Sub38 local131 = (Class6_Sub38) local47.aClass275_97.method6364();
					if (local131 == null) {
						break label46;
					}
					if (local75.anInt6124 != local131.anInt5948 && local75.anInt6131 != local131.anInt5948) {
						local75.anInt6127 = local131.anInt5951;
						local75.anInt6121 = local131.anInt5948;
					}
				}
			}
		}
		@Pc(173) int local173 = Static490.method6768((arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
		Static264.method3747(arg0, arg1, arg2, local173, local75);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)Z")
	public static boolean method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static112.method1760(arg1, arg0) | (arg0 & 0x60000) != 0 || Static318.method4937(arg1, arg0);
	}
}
