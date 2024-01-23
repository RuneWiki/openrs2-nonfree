import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public static int anInt1826;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
	public static int anInt1835 = 0;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
	public static int[] anIntArray193 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIBI)V")
	public static void method1368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class1_Sub28 local18 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg2);
		if (local18 == null) {
			local18 = new Class1_Sub28();
			Static84.aClass117_6.method3445(local18, (long) arg2);
		}
		if (local18.anIntArray500.length <= arg1) {
			@Pc(42) int[] local42 = new int[arg1 + 1];
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(49) int local49;
			for (local49 = 0; local49 < local18.anIntArray500.length; local49++) {
				local42[local49] = local18.anIntArray500[local49];
				local47[local49] = local18.anIntArray499[local49];
			}
			for (local49 = local18.anIntArray500.length; local49 < arg1; local49++) {
				local42[local49] = -1;
				local47[local49] = 0;
			}
			local18.anIntArray500 = local42;
			local18.anIntArray499 = local47;
		}
		local18.anIntArray500[arg1] = arg0;
		local18.anIntArray499[arg1] = arg3;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIIZ)Ljava/lang/String;")
	public static String method1369(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) char[] local4 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(24) int local24 = arg0[arg2 + local12] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(47) char local47 = Static194.aCharArray5[local24 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local24 = local47;
				}
				local4[local10++] = (char) local24;
			}
		}
		return new String(local4, 0, local10);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	public static void method1370() {
		Static5.aClass155_1.method4362();
	}
}
