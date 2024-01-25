import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_15 = new Class277(7, 3);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
	public static long method7123() {
		return Static84.aClass13_1.method7249();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I")
	public static int method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static254.aByteArrayArray18 == null ? 0 : Static254.aByteArrayArray18[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIB)V")
	public static void method7125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg0 + 1;
		Static238.method3886(Static442.anIntArrayArray48[arg0], arg1, arg2, arg3);
		@Pc(19) int local19 = arg4 - 1;
		Static238.method3886(Static442.anIntArrayArray48[arg4], arg1, arg2, arg3);
		for (@Pc(27) int local27 = local4; local27 <= local19; local27++) {
			@Pc(33) int[] local33 = Static442.anIntArrayArray48[local27];
			local33[arg3] = local33[arg1] = arg2;
		}
	}
}
