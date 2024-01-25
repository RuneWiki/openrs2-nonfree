import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
	public static int anInt584 = 0;

	@OriginalMember(owner = "client!ar", name = "S", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(BLjava/lang/String;)J")
	public static long method378(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (long) arg0.charAt(local19) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)Z")
	public static boolean method380(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
