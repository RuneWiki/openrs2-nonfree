import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public static int anInt6402 = 0;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(19) Interface25 local19 = (Interface25) Static166.method1427(arg2, arg1, arg0);
		if (local19 != null) {
			local13 = Static132.method1836(local19) & true;
		}
		local19 = (Interface25) Static245.method3380(arg2, arg1, arg0, vea.class);
		if (local19 != null) {
			local13 &= Static132.method1836(local19);
		}
		local19 = (Interface25) Static629.method8438(arg2, arg1, arg0);
		if (local19 != null) {
			local13 &= Static132.method1836(local19);
		}
		return local13;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Z")
	public static boolean method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static616.method8283(arg0, arg1) & (Static256.method3530(arg0, arg1) | (arg0 & 0x2000) != 0 | Static555.method7621(arg0, arg1));
	}
}
