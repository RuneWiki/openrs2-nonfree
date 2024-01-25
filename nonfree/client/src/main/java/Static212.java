import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_129 = new Class196(81, -2);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "(I)V")
	public static void method3058() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static425.aBooleanArray18[local10] = true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "(I)Lclient!hk;")
	public static Class5_Sub14_Sub4 method3059() {
		return Static537.aClass5_Sub14_Sub4_35;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!ha;I)V")
	public static void method3063(@OriginalArg(0) Class143 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static305.aBoolean315) {
			local7 = Static304.method4150();
			local9 = Static563.method7702();
		}
		arg0.KA(local7, local9, local7 + Static563.anInt9176, 350 - -local9);
		arg0.aa(local7, local9, Static563.anInt9176, 350, Static514.anInt8682 << 24 | 0x332277, 1);
		Static430.method7439(local9, local9 + 350, local7, Static563.anInt9176 + local7);
		@Pc(54) int local54 = 350 / Static561.anInt9146;
		@Pc(66) int local66;
		if (Static331.anInt6012 > 0) {
			local66 = 346 - Static561.anInt9146 - 4;
			@Pc(76) int local76 = local66 * local54 / (local54 + Static331.anInt6012 - 1);
			@Pc(78) int local78 = 4;
			if (Static331.anInt6012 > 1) {
				local78 = (local66 - local76) * (-Static206.anInt3291 + Static331.anInt6012 + -1) / (Static331.anInt6012 - 1) + 4;
			}
			arg0.aa(local7 + Static563.anInt9176 - 16, local9 - -local78, 12, local76, Static514.anInt8682 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static206.anInt3291; Static206.anInt3291 + local54 > local121 && Static331.anInt6012 > local121; local121++) {
				@Pc(130) String[] local130 = Static466.method6897('\b', Static223.aStringArray14[local121]);
				@Pc(139) int local139 = (Static563.anInt9176 - 16 - 8) / local130.length;
				for (@Pc(141) int local141 = 0; local141 < local130.length; local141++) {
					@Pc(149) int local149 = local139 * local141 + 8;
					arg0.KA(local7 + local149, local9, local139 + local7 + local149 - 8, local9 + 350);
					Static5.aClass72_1.method6925(local9 + 350 - Static364.aClass198_8.anInt4648 - Static167.anInt2767 - (local121 - Static206.anInt3291) * Static561.anInt9146 - 2, Static644.method8507(local130[local141]), local149 + local7, -16777216, -1);
				}
			}
		}
		Static383.aClass72_10.method6923("Build: 644", -16777216, -1, local9 + 350 - 20, Static563.anInt9176 + (local7 - 25));
		arg0.KA(local7, local9, Static563.anInt9176 + local7, local9 + 350);
		arg0.method6243(local7, -1, Static563.anInt9176, local9 + 350 - Static167.anInt2767);
		Static32.aClass72_2.method6925(local9 + 350 - Static358.aClass198_7.anInt4648 - 1, "--> " + Static644.method8507(Static505.aString91), local7 + 10, -16777216, -1);
		if (!Static324.aBoolean434) {
			return;
		}
		local66 = -1;
		if (Static421.anInt7434 % 30 > 15) {
			local66 = 16777215;
		}
		arg0.method6245(12, local66, local9 + 350 - Static358.aClass198_7.anInt4648 - 11, local7 + 10 + Static358.aClass198_7.method4076("--> " + Static644.method8507(Static505.aString91).substring(0, Static124.anInt2153)));
	}
}
