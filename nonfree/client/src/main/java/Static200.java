import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array9;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
	public static int anInt4041 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3725(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static164.aClass14_Sub4_Sub2_3.method2557(205);
		Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg1) + 1);
		Static164.aClass14_Sub4_Sub2_3.method2551(arg0);
		Static164.aClass14_Sub4_Sub2_3.method2527(arg1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!e;)V")
	public static void method3726(@OriginalArg(1) Class46 arg0) {
		arg0.method5172(0, 0, Static294.anInt5659, 350);
		arg0.method5110(0, 0, Static294.anInt5659, 350, Static17.anInt345 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static9.anIntArray11[local25];
			local35 = Static220.anIntArray394[local25];
			arg0.method5110(local31, local35, 2, 2, Static83.anIntArray618[local25] << 24 | 0xFFFFFF, 1);
		}
		local31 = 350 / Static176.anInt3874;
		if (Static354.anInt6718 > 0) {
			local35 = 346 - Static176.anInt3874 - 4;
			@Pc(79) int local79 = local31 * local35 / (Static354.anInt6718 + local31 - 1);
			@Pc(81) int local81 = 4;
			if (Static354.anInt6718 > 1) {
				local81 = (Static354.anInt6718 - Static274.anInt5227 - 1) * (-local79 + local35) / (Static354.anInt6718 - 1) + 4;
			}
			arg0.method5110(Static294.anInt5659 - 16, local81, 12, local79, Static17.anInt345 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static274.anInt5227; local31 + Static274.anInt5227 > local120 && local120 < Static354.anInt6718; local120++) {
				@Pc(129) String[] local129 = Static105.method2289(Static21.aStringArray23[local120], '\b');
				@Pc(138) int local138 = (Static294.anInt5659 - 16 - 8) / local129.length;
				for (@Pc(140) int local140 = 0; local140 < local129.length; local140++) {
					@Pc(149) int local149 = local140 * local138 + 8;
					arg0.method5172(local149, 0, local149 + local138 - 8, 350);
					Static245.aClass30_7.method5572(local149, -16777216, -1, 350 - Static176.anInt3874 * (local120 - Static274.anInt5227) - Static223.anInt5819 - Static108.aClass76_5.anInt2286 - 2, local129[local140]);
				}
			}
		}
		arg0.method5172(0, 0, Static294.anInt5659, 350);
		arg0.method5113(-1, 350 - Static223.anInt5819, 0, Static294.anInt5659);
		Static164.aClass30_5.method5572(10, -16777216, -1, 350 - Static223.aClass76_9.anInt2286 - 1, "--> " + Static78.aString72);
		local35 = -1;
		if (Static153.anInt3257 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method5099(Static223.aClass76_9.method2256("--> " + Static78.aString72.substring(0, Static67.anInt1609)) + 10, 12, 350 - Static223.aClass76_9.anInt2286 - 11, local35);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method3727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class14_Sub37 local17 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg1);
		if (local17 == null) {
			local17 = new Class14_Sub37();
			Static316.aClass25_15.method687((long) arg1, local17);
		}
		if (arg2 >= local17.anIntArray614.length) {
			@Pc(39) int[] local39 = new int[arg2 + 1];
			@Pc(44) int[] local44 = new int[arg2 + 1];
			for (@Pc(46) int local46 = 0; local46 < local17.anIntArray614.length; local46++) {
				local39[local46] = local17.anIntArray614[local46];
				local44[local46] = local17.anIntArray612[local46];
			}
			for (@Pc(76) int local76 = local17.anIntArray614.length; local76 < arg2; local76++) {
				local39[local76] = -1;
				local44[local76] = 0;
			}
			local17.anIntArray612 = local44;
			local17.anIntArray614 = local39;
		}
		local17.anIntArray614[arg2] = arg3;
		local17.anIntArray612[arg2] = arg0;
	}
}
