import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public static int anInt6897;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	public static int anInt6898;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "S")
	public static short aShort94 = 320;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIBII)V")
	public static void method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static46.anInt864 == 1) {
			Static416.aClass17Array16[Static115.anInt2620 / 100].method5767(Static438.anInt7195 - 8, Static124.anInt6125 + -8);
		}
		if (Static46.anInt864 == 2) {
			Static416.aClass17Array16[Static115.anInt2620 / 100 + 4].method5767(Static438.anInt7195 - 8, Static124.anInt6125 - 8);
		}
		Static186.method2962();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lclient!hm;")
	public static Class3_Sub3 method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_1;
	}
}
