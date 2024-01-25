import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "Lclient!tba;")
	public static Class331 aClass331_10;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	public static int anInt8848 = 0;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "Z")
	public static boolean aBoolean752 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)I")
	public static int method7515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) double local18 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(25) double local25 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(34) double local34 = local25 + (local18 - local25) * Math.random();
		return (int) (Math.pow(2.0D, local34) + 0.5D);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZII[Lclient!uaa;I)V")
	public static void method7516(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class345[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg3.length; local1++) {
			@Pc(6) Class345 local6 = arg3[local1];
			if (local6 != null && arg0 == local6.anInt9657) {
				Static89.method1860(arg2, arg4, arg1, local6);
				Static209.method7259(local6, arg4, arg2);
				if (local6.anInt9580 - local6.anInt9649 < local6.anInt9583) {
					local6.anInt9583 = local6.anInt9580 - local6.anInt9649;
				}
				if (local6.anInt9593 - local6.anInt9606 < local6.anInt9577) {
					local6.anInt9577 = local6.anInt9593 - local6.anInt9606;
				}
				if (local6.anInt9583 < 0) {
					local6.anInt9583 = 0;
				}
				if (local6.anInt9577 < 0) {
					local6.anInt9577 = 0;
				}
				if (local6.anInt9591 == 0) {
					Static550.method7644(local6, arg1);
				}
			}
		}
	}
}
