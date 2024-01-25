import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "J")
	public static long aLong235;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
	public static int anInt7896;

	@OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
	public static int anInt7897;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
	public static int anInt7893 = 0;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
	public static int anInt7895 = 0;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
	public static int anInt7898 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([FIZ)[F")
	public static float[] method6784(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) float[] local13 = new float[arg1];
		Static682.method793(arg0, 0, local13, 0, arg1);
		return local13;
	}
}
