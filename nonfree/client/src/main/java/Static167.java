import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!tr;")
	public static Class241 aClass241_3;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_80 = new Class136(111, 1);

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!la;")
	public static Class136 aClass136_81 = null;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt3016 = 1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_93 = new Class174(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public static int anInt3017 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!mk;Lclient!qa;Lclient!fb;Z)V")
	public static void method2557(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class3_Sub16 arg2) {
		@Pc(10) Class2 local10 = arg0.method3612(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.TA();
		if (local16 < local10.V()) {
			local16 = local10.V();
		}
		@Pc(32) int local32 = arg2.anInt1899;
		@Pc(35) int local35 = arg2.anInt1894;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString49 != null) {
			local37 = Static215.aClass124_10.method3100(null, Static178.aStringArray17, arg0.aString49, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static178.aStringArray17[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static358.aClass93_7.method2213(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = Static358.aClass93_7.method2211() * local37 + Static358.aClass93_7.method2210() / 2;
		}
		local55 = local16 / 2 + arg2.anInt1899;
		@Pc(115) int local115 = arg2.anInt1894;
		if (local16 + Static211.anInt274 > local32) {
			local32 = Static211.anInt274;
			local55 = local39 / 2 + local16 / 2 + Static211.anInt274 + 10 + 5;
		} else if (Static211.anInt275 - local16 < local32) {
			local32 = Static211.anInt275 - local16;
			local55 = Static211.anInt275 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		if (local35 < local16 + Static211.anInt267) {
			local115 = local16 / 2 + Static211.anInt267 + 10;
			local35 = Static211.anInt267;
		} else if (Static211.anInt269 - local16 < local35) {
			local35 = Static211.anInt269 - local16;
			local115 = Static211.anInt269 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg2.anInt1899), (double) (local35 - arg2.anInt1894)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5832((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		if (arg0.aString49 != null) {
			local251 = local115;
			local249 = local55 - local39 / 2 - 5;
			local253 = local39 + local249 + 10;
			local255 = local37 * Static358.aClass93_7.method2211() + local115 + 3;
			if (arg0.anInt4319 != 0) {
				arg1.method5951(local255 - local115, local115, arg0.anInt4319, local249, local253 - local249);
			}
			if (arg0.anInt4329 != 0) {
				arg1.method6016(local249, local255 - local115, arg0.anInt4329, local253 - local249, local115);
			}
			for (@Pc(325) int local325 = 0; local325 < local37; local325++) {
				@Pc(331) String local331 = Static178.aStringArray17[local325];
				if (local325 < local37 - 1) {
					local331 = local331.substring(0, local331.length() - 4);
				}
				Static358.aClass93_7.method2214(arg1, local331, local55, local115, arg0.anInt4336);
				local115 += Static358.aClass93_7.method2211();
			}
		}
		if (arg0.anInt4321 == -1 && arg0.aString49 == null) {
			return;
		}
		@Pc(382) Class3_Sub17 local382 = new Class3_Sub17(arg2);
		local16 >>= 0x1;
		local382.anInt1933 = local253;
		local382.anInt1927 = local35 - local16;
		local382.anInt1931 = local255;
		local382.anInt1930 = local251;
		local382.anInt1924 = local16 + local35;
		local382.anInt1925 = local32 - local16;
		local382.anInt1929 = local249;
		local382.anInt1926 = local32 + local16;
		Static107.aClass193_23.method4527(local382);
	}
}
