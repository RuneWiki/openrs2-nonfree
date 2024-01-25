import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
	public static int anInt3823;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_37 = new Class42(16);

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Z")
	public static boolean aBoolean269 = true;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	public static int anInt3825 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public static int method3494(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3495(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!en;BIILclient!eq;I)Lclient!kh;")
	public static Class54 method3496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class61 arg5, @OriginalArg(7) int arg6) {
		Static86.aClass116_1.aBoolean251 = arg5 != null;
		Static86.aClass116_1.anInt3480 = arg4;
		Static86.aClass116_1.anInt3483 = arg6;
		Static86.aClass116_1.anInt3485 = arg0;
		Static86.aClass116_1.anInt3484 = arg2.anInt5487;
		Static86.aClass116_1.anInt3481 = arg1;
		Static86.aClass116_1.anInt3486 = arg3;
		return (Class54) Static250.aClass109_1.method2995(Static86.aClass116_1);
	}
}
