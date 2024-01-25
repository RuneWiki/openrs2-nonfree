import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "F")
	public static float aFloat251;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
	public static int anInt8016 = 0;

	@OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
	public static int anInt8019 = -1;

	@OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
	public static int anInt8021 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIB)I")
	public static int method6596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class363.anIntArray698[arg1 * 8192 / arg0] >> 1;
		return (arg3 * local21 >> 16) + (arg2 * (65536 - local21) >> 16);
	}
}
