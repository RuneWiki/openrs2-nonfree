import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
	public static int anInt5805;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	public static int anInt5804 = -1;

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "Lclient!sf;")
	public static Class157 aClass157_45 = new Class157(100);

	@OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
	public static int anInt5809 = 0;

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
	public static int anInt5810 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBI)V")
	public static void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub8_Sub3 local9 = Static280.method4385(arg1, arg2, arg0);
		if (local9 == null) {
			return;
		}
		Static296.aStringArray44 = new String[local9.anInt978];
		Static269.anIntArray512 = new int[local9.anInt976];
		if (local9.anInt983 == 15 || local9.anInt983 == 17 || local9.anInt983 == 16) {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 0;
			if (Static78.aClass56_3 != null) {
				local45 = Static78.aClass56_3.anInt2105;
				local47 = Static78.aClass56_3.anInt2048;
			}
			Static269.anIntArray512[1] = Static281.anInt5551 - local47;
			Static269.anIntArray512[0] = Static131.anInt3016 - local45;
		}
		Static36.method700(local9, 200000);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(IIIII)V")
	public static void method4577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static148.anInt3247; local3++) {
			if (Static155.anIntArray352[local3] + Static153.anIntArray344[local3] > arg0 && Static153.anIntArray344[local3] < arg3 + arg0 && Static83.anIntArray171[local3] + Static291.anIntArray537[local3] > arg2 && Static83.anIntArray171[local3] < arg1 + arg2) {
				Static214.aBooleanArray19[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
	public static void method4578() {
		Static232.aClass157_39.method4033();
		Static105.aClass157_9.method4033();
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	public static void method4580() {
		if (Static64.anInt1561 == 10 && Static116.aBoolean184) {
			Static305.method4624(28);
		}
		if (Static64.anInt1561 == 30) {
			Static305.method4624(25);
		}
	}
}
