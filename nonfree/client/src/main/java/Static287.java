import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Z")
	public static boolean aBoolean390;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZII[Lclient!oh;I)V")
	public static void method4060(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class273[] arg4) {
		for (@Pc(10) int local10 = 0; local10 < arg4.length; local10++) {
			@Pc(16) Class273 local16 = arg4[local10];
			if (local16 != null && arg2 == local16.anInt7392) {
				Static490.method7036(arg0, arg1, local16, arg3);
				Static576.method8013(arg3, local16, arg0);
				if (local16.anInt7347 > local16.anInt7379 - local16.anInt7402) {
					local16.anInt7347 = local16.anInt7379 - local16.anInt7402;
				}
				if (local16.anInt7342 > local16.anInt7400 - local16.anInt7385) {
					local16.anInt7342 = local16.anInt7400 - local16.anInt7385;
				}
				if (local16.anInt7347 < 0) {
					local16.anInt7347 = 0;
				}
				if (local16.anInt7342 < 0) {
					local16.anInt7342 = 0;
				}
				if (local16.anInt7371 == 0) {
					Static243.method3436(local16, arg1);
				}
			}
		}
	}
}
