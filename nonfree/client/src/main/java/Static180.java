import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
	public static int anInt4132;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	public static int anInt4134 = 0;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "[J")
	public static long[] aLongArray26 = new long[100];

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
	public static int anInt4138 = 0;

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
	public static int anInt4139 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public static void method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg2, 4);
		local4.method3810();
		local4.anInt5009 = arg0;
		local4.anInt5015 = arg3;
		local4.anInt5008 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3109(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) long local16 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local16 = (long) arg0.charAt(local18) + (local16 << 5) - local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(DB)V")
	public static void method3110(@OriginalArg(0) double arg0) {
		if (Static232.aDouble9 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static89.anIntArray180[local7] = local19 <= 255 ? local19 : 255;
		}
		Static232.aDouble9 = arg0;
	}
}
