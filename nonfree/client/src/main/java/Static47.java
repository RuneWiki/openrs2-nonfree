import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!qc;")
	public static Class135 aClass135_1 = new Class135(2);

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString64 = "Please remove ";

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString65 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)J")
	public static long method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4090; local13++) {
			@Pc(22) Class25 local22 = local7.aClass25Array4[local13];
			if ((local22.aLong39 >> 29 & 0x3L) == 2L && local22.anInt1003 == arg1 && local22.anInt1000 == arg2) {
				return local22.aLong39;
			}
		}
		return 0L;
	}
}
