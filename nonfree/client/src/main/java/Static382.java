import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public static int anInt6430 = 2;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "[I")
	public static final int[] anIntArray396 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "Lclient!of;")
	public static final Class174 aClass174_182 = new Class174("M", "M", "M", "M");

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([Ljava/lang/String;Z[S)V")
	public static void method5290(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static282.method4009(arg1, arg0, arg0.length - 1, 0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
	public static int method5291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIBI)I")
	public static int method5295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg0 : arg3;
		@Pc(40) int local40 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg3 : arg2) : arg0;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}
}
