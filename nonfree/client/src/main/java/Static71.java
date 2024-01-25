import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
	private static int anInt1077;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	private static int anInt1078;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	private static int anInt1079;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!os;")
	public static final Class182 aClass182_49 = new Class182("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B[Lclient!gh;I)V")
	public static void method983(@OriginalArg(1) Class89[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class89 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt2727 == 0) {
					if (local13.aClass89Array1 != null) {
						method983(local13.aClass89Array1, arg1);
					}
					@Pc(34) Class10_Sub21 local34 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local13.anInt2677);
					if (local34 != null) {
						Static209.method3246(local34.anInt3646, arg1);
					}
				}
				@Pc(50) Class10_Sub40 local50;
				if (arg1 == 0 && local13.anObjectArray12 != null) {
					local50 = new Class10_Sub40();
					local50.anObjectArray36 = local13.anObjectArray12;
					local50.aClass89_12 = local13;
					Static79.method1501(local50);
				}
				if (arg1 == 1 && local13.anObjectArray21 != null) {
					if (local13.anInt2720 >= 0) {
						@Pc(75) Class89 local75 = Static40.method557(local13.anInt2677);
						if (local75 == null || local75.aClass89Array1 == null || local13.anInt2720 >= local75.aClass89Array1.length || local75.aClass89Array1[local13.anInt2720] != local13) {
							continue;
						}
					}
					local50 = new Class10_Sub40();
					local50.aClass89_12 = local13;
					local50.anObjectArray36 = local13.anObjectArray21;
					Static79.method1501(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "providesignlink", descriptor = "(Lclient!lt;)V")
	public static void method984(@OriginalArg(0) Class159 arg0) {
		Static171.aClass159_1 = arg0;
		Static418.aClass159_5 = arg0;
	}
}
