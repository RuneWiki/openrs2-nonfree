import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	public static int anInt6191;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!or;")
	public static Class248 aClass248_1;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Z")
	public static final boolean aBoolean492 = false;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIII)I")
	public static int method5148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(26) int local26 = local7 < 8 ? arg3 : arg1;
		@Pc(43) int local43 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg2) : arg1;
		return ((local7 & 0x1) == 0 ? local26 : -local26) + ((local7 & 0x2) == 0 ? local43 : -local43);
	}
}
