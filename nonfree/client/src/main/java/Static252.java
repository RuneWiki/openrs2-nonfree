import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
	public static boolean aBoolean378;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt4898 = 0;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString290 = "Starting 3d Library";

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	public static int anInt4902 = -50;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIII)I")
	public static int method4412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(21) int local21 = local7 < 8 ? arg3 : arg2;
		@Pc(36) int local36 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg1) : arg2;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local36 : -local36);
	}
}
