import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "Lclient!daa;")
	public static final Class60 aClass60_3 = new Class60();

	@OriginalMember(owner = "client!jc", name = "rb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!jc", name = "sb", descriptor = "Lclient!qha;")
	public static final Class286 aClass286_4 = new Class286("WIP", 2);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILclient!ha;)V")
	public static void method3964(@OriginalArg(1) Class132 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static594.aBoolean693) {
			local7 = Static234.method3562();
			local9 = Static314.method4504();
		}
		arg0.KA(local7, local9, Static449.anInt7506 + local7, local9 + 350);
		arg0.aa(local7, local9, Static449.anInt7506, 350, Static5.anInt161 << 24 | 0x332277, 1);
		Static629.method8681(Static449.anInt7506 + local7, local9, local9 + 350, local7);
		@Pc(54) int local54 = 350 / Static293.anInt4943;
		@Pc(64) int local64;
		if (Static567.anInt9420 > 0) {
			local64 = 342 - Static293.anInt4943;
			@Pc(75) int local75 = local54 * local64 / (local54 + Static567.anInt9420 - 1);
			@Pc(77) int local77 = 4;
			if (Static567.anInt9420 > 1) {
				local77 = (Static567.anInt9420 - Static22.anInt521 - 1) * (local64 - local75) / (Static567.anInt9420 - 1) + 4;
			}
			arg0.aa(local7 + Static449.anInt7506 - 16, local77 + local9, 12, local75, Static5.anInt161 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Static22.anInt521; local54 + Static22.anInt521 > local118 && Static567.anInt9420 > local118; local118++) {
				@Pc(127) String[] local127 = Static635.method8720(Static241.aStringArray30[local118], '\b');
				@Pc(136) int local136 = (Static449.anInt7506 - 16 - 8) / local127.length;
				for (@Pc(138) int local138 = 0; local138 < local127.length; local138++) {
					@Pc(146) int local146 = local138 * local136 + 8;
					arg0.KA(local7 + local146, local9, local136 + local146 + local7 - 8, local9 + 350);
					Static423.aClass19_9.method6336(local9 + 350 - Static293.anInt4943 * (local118 - Static22.anInt521) - Static462.aClass151_12.anInt3915 - Static122.anInt2160 - 2, -1, -16777216, local7 + local146, Static261.method3799(local127[local138]));
				}
			}
		}
		Static494.aClass19_12.method6319(local9 + 330, -1, "Build: 646", Static449.anInt7506 + local7 - 25, -16777216);
		arg0.KA(local7, local9, Static449.anInt7506 + local7, local9 + 350);
		arg0.method7449(Static449.anInt7506, local7, local9 + 350 - Static122.anInt2160, -1);
		Static51.aClass19_4.method6336(local9 + 349 - Static173.aClass151_4.anInt3915, -1, -16777216, local7 + 10, "--> " + Static261.method3799(Static330.aString6));
		if (!Static247.aBoolean271) {
			return;
		}
		local64 = -1;
		if (Static90.anInt1698 % 30 > 15) {
			local64 = 16777215;
		}
		arg0.method7432(local7 + Static173.aClass151_4.method3323("--> " + Static261.method3799(Static330.aString6).substring(0, Static241.anInt4292)) + 10, local9 + 350 + -Static173.aClass151_4.anInt3915 - 11, 12, local64);
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)V")
	public static void method3965() {
		@Pc(5) Class10 local5 = Static569.aClass10_54;
		synchronized (Static569.aClass10_54) {
			Static569.aClass10_54.method375();
		}
		local5 = Static121.aClass10_7;
		synchronized (Static121.aClass10_7) {
			Static121.aClass10_7.method375();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z")
	public static boolean method3966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static310.method4425(arg1, arg0) | (arg1 & 0x70000) != 0 || Static293.method4213(arg0, arg1);
	}
}
