import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "Lclient!at;")
	public static Class17 aClass17_8;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
	public static int anInt679;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
	public static int anInt682;

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "Z")
	public static boolean aBoolean62;

	@OriginalMember(owner = "client!bq", name = "U", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method542(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
