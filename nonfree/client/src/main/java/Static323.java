import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public static int anInt5755 = 0;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Lclient!fa;")
	public static final Class4_Sub11 aClass4_Sub11_1 = new Class4_Sub11(0, 0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZII)V")
	public static void method4439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static126.aClass67_Sub1_1.anInt5859 * arg2 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static216.method3074(local6, arg1, Static300.aClass166_212);
			Static156.aBoolean213 = true;
		}
	}
}
