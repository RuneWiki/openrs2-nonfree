import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt9671;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array13;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public static int anInt9672;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "S")
	public static short aShort105 = 1;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	public static final int[] anIntArray533 = new int[1024];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_219 = new Class359(74, 4);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = (Static524.aShort82 - Static542.aShort60) * local7 / 100 + Static542.aShort60;
		@Pc(37) int local37 = local31 * arg3 >> 8;
		Static483.anInt8094 = Static483.anInt8098 * local31 >> 8;
		@Pc(50) int local50 = 16384 - arg0 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg5 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local37;
		if (local50 != 0) {
			local60 = -local37 * Class200.anIntArray337[local50] >> 14;
			local62 = Class200.anIntArray338[local50] * local37 >> 14;
		}
		if (local56 != 0) {
			local58 = local62 * Class200.anIntArray337[local56] >> 14;
			local62 = Class200.anIntArray338[local56] * local62 >> 14;
		}
		Static388.anInt6926 = 0;
		Static332.anInt6132 = arg4 - local58;
		Static207.anInt3885 = arg5;
		Static200.anInt3808 = arg6 - local60;
		Static79.anInt1141 = arg0;
		Static407.anInt7215 = arg1 - local62;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method8085() {
		for (@Pc(4) Class5_Sub3_Sub20 local4 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local4 != null; local4 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
			if (Static229.method3559(local4.anInt10178)) {
				Static563.method7756(local4);
			}
		}
	}
}
