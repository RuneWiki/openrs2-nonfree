import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "S")
	public static short aShort55 = 32767;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_176 = new Class159("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!jd;")
	public static final Class103 aClass103_1 = new Class103(100);

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public static int anInt3457 = 0;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_29 = new Class116();

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "[S")
	public static final short[] aShortArray47 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!vq;I)V")
	public static void method3155(@OriginalArg(0) Class47 arg0) {
		arg0.method2709(0, 0, Static24.anInt496, 350);
		arg0.method2682(0, 0, Static24.anInt496, 350, Static135.anInt3159 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static340.anIntArray497[local25];
			local35 = Static183.anIntArray326[local25];
			arg0.method2682(local31, local35, 2, 2, Class192.lb[local25] << 24 | 0xFFFFFF, 1);
		}
		local31 = 350 / Static178.anInt3732;
		if (Static169.anInt3605 > 0) {
			local35 = 342 - Static178.anInt3732;
			@Pc(79) int local79 = local31 * local35 / (local31 + Static169.anInt3605 - 1);
			@Pc(81) int local81 = 4;
			if (Static169.anInt3605 > 1) {
				local81 = (local35 - local79) * (Static169.anInt3605 + -1 + -Static25.anInt501) / (Static169.anInt3605 - 1) + 4;
			}
			arg0.method2682(Static24.anInt496 - 16, local81, 12, local79, Static135.anInt3159 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static25.anInt501; local120 < local31 + Static25.anInt501 && Static169.anInt3605 > local120; local120++) {
				@Pc(129) String[] local129 = Static212.method2554(Static278.aStringArray85[local120], '\b');
				@Pc(138) int local138 = (Static24.anInt496 - 8 - 16) / local129.length;
				for (@Pc(140) int local140 = 0; local140 < local129.length; local140++) {
					@Pc(149) int local149 = local140 * local138 + 8;
					arg0.method2709(local149, 0, local149 + local138 - 8, 350);
					Static238.aClass51_6.method4237(-1, -16777216, local149, local129[local140], 350 - (local120 - Static25.anInt501) * Static178.anInt3732 - Static330.aClass16_7.anInt383 - Static345.anInt6784 - 2);
				}
			}
		}
		arg0.method2709(0, 0, Static24.anInt496, 350);
		arg0.method2747(0, -1, Static24.anInt496, 350 - Static345.anInt6784);
		Static282.aClass51_4.method4237(-1, -16777216, 10, "--> " + Static72.aString15, 350 - Static348.aClass16_8.anInt383 - 1);
		local35 = -1;
		if (Static199.anInt4137 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method2737(Static348.aClass16_8.method327("--> " + Static72.aString15.substring(0, Static168.anInt6695)) + 10, 12, local35, 339 - Static348.aClass16_8.anInt383);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!tj;)V")
	public static void method3156(@OriginalArg(1) Class193 arg0) {
		Static112.aClass193_39 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 < 128 || arg0 < 128 || arg2 > Static350.anInt6637 * 128 - 256 || arg0 > Static105.anInt2647 * 128 - 256) {
			Static185.anIntArray328[0] = Static185.anIntArray328[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static81.method2010(Static12.anInt267, arg0, arg2) - arg3;
		Static288.aClass57_6.method4190(arg5, 0, 0);
		Static274.aClass47_9.method2656(Static288.aClass57_6);
		Static274.aClass47_9.method2748(arg2, local51, arg0, Static185.anIntArray328);
		Static288.aClass57_6.method4190(-arg5, 0, 0);
		Static274.aClass47_9.method2656(Static288.aClass57_6);
	}
}
