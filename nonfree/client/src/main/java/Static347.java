import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public static int anInt6633 = 0;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	public static int anInt6638 = 0;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "Z")
	public static boolean aBoolean422 = true;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)I")
	public static int method5635(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local26 >> 12) + 40960;
		return local13 * local35 >> 12;
	}
}
