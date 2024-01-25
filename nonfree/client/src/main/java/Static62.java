import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public static int anInt1095;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "[Lclient!of;")
	public static final Class4_Sub5_Sub2_Sub1[] aClass4_Sub5_Sub2_Sub1Array1 = new Class4_Sub5_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
	public static void method965(@OriginalArg(0) int arg0) {
		Static50.anIntArray90 = new int[arg0];
		Static254.anIntArray490 = new int[arg0];
		Static85.anIntArray132 = new int[arg0];
		Static160.anIntArray327 = new int[arg0];
		Static119.anIntArray372 = new int[arg0];
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZII[Lclient!vg;I)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class201[] arg4) {
		for (@Pc(9) int local9 = 0; local9 < arg4.length; local9++) {
			@Pc(14) Class201 local14 = arg4[local9];
			if (local14 != null && arg0 == local14.anInt6491) {
				Static93.method1721(arg1, local14, arg3, arg2);
				Static187.method3350(arg3, arg2, local14);
				if (local14.anInt6493 - local14.anInt6505 < local14.anInt6558) {
					local14.anInt6558 = local14.anInt6493 - local14.anInt6505;
				}
				if (local14.anInt6558 < 0) {
					local14.anInt6558 = 0;
				}
				if (local14.anInt6539 - local14.anInt6510 < local14.anInt6543) {
					local14.anInt6543 = local14.anInt6539 - local14.anInt6510;
				}
				if (local14.anInt6543 < 0) {
					local14.anInt6543 = 0;
				}
				if (local14.anInt6559 == 0) {
					Static172.method4060(arg1, local14);
				}
			}
		}
	}
}
