import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_371 = Static38.method685("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_368 = aClass6_371;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_369 = Static38.method685("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!ai;")
	private static Class6 aClass6_370 = Static38.method685("No response from server)3");

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_372 = aClass6_370;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array8 = new Class6[8];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method881() {
		aClass6Array8 = null;
		aClass6_368 = null;
		aClass6_372 = null;
		aClass6_371 = null;
		aClass6_369 = null;
		aClass6_370 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!c;II)Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 method882(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) int arg2) {
		return Static152.method2334(arg2, arg0, arg1) ? Static23.method398() : null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ai;ZI)V")
	public static void method883(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class6 local9 = arg0.method115();
		@Pc(11) int local11 = 0;
		@Pc(14) short[] local14 = new short[16];
		for (@Pc(16) int local16 = 0; local16 < Static112.anInt2716; local16++) {
			@Pc(22) Class2_Sub3_Sub10 local22 = Static92.method1502(local16);
			if ((!arg1 || local22.aBoolean78) && local22.aClass6_612.method115().method120(local9) != -1) {
				if (local11 >= 250) {
					Static108.aShortArray24 = null;
					Static102.anInt2504 = -1;
					return;
				}
				if (local11 >= local14.length) {
					@Pc(60) short[] local60 = new short[local14.length * 2];
					for (@Pc(62) int local62 = 0; local62 < local11; local62++) {
						local60[local62] = local14[local62];
					}
					local14 = local60;
				}
				local14[local11++] = (short) local16;
			}
		}
		Static118.anInt2808 = 0;
		Static102.anInt2504 = local11;
		Static108.aShortArray24 = local14;
		@Pc(99) Class6[] local99 = new Class6[Static102.anInt2504];
		for (@Pc(101) int local101 = 0; local101 < Static102.anInt2504; local101++) {
			local99[local101] = Static92.method1502(local14[local101]).aClass6_612;
		}
		Static18.method347(Static108.aShortArray24, local99);
	}
}
