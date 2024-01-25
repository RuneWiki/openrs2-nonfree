import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "Lclient!qa;")
	public static Class172 aClass172_9;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
	public static final int[] anIntArray319 = new int[500];

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "[I")
	public static final int[] anIntArray320 = new int[25];

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)Z")
	public static boolean method3775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Interface8 local18 = (Interface8) Static321.method4376(arg0, arg2, arg1);
		@Pc(20) boolean local20 = true;
		if (local18 != null) {
			local20 = Static360.method4760(local18) & true;
		}
		local18 = (Interface8) Static314.method4348(arg0, arg2, arg1, pa.class);
		if (local18 != null) {
			local20 &= Static360.method4760(local18);
		}
		local18 = (Interface8) Static166.method2721(arg0, arg2, arg1);
		if (local18 != null) {
			local20 &= Static360.method4760(local18);
		}
		return local20;
	}
}
