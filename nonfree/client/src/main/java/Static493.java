import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_153 = new Class322(47, 6);

	@OriginalMember(owner = "client!qia", name = "l", descriptor = "Lclient!vo;")
	public static Class381 aClass381_10 = null;

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
	public static int anInt8353 = 13156520;

	@OriginalMember(owner = "client!qia", name = "o", descriptor = "[I")
	public static final int[] anIntArray525 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V")
	public static void method7296(@OriginalArg(1) int arg0) {
		Static119.anInt2286 = -1;
		Static626.anInt9859 = 3;
		Static344.anInt5861 = 100;
		Static604.anInt9539 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(JJ)J")
	public static long method7297(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[BI[BIII)V")
	public static void method7298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = -(arg0 >> 2);
		@Pc(22) int local22 = -(arg0 & 0x3);
		for (@Pc(25) int local25 = -arg7; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
				local33 = arg5++;
				arg4[local33] += arg2[arg3++];
				@Pc(45) int local45 = arg5++;
				arg4[local45] += arg2[arg3++];
				@Pc(57) int local57 = arg5++;
				arg4[local57] += arg2[arg3++];
				@Pc(69) int local69 = arg5++;
				arg4[local69] += arg2[arg3++];
			}
			for (@Pc(86) int local86 = local22; local86 < 0; local86++) {
				local33 = arg5++;
				arg4[local33] += arg2[arg3++];
			}
			arg3 += arg6;
			arg5 += arg1;
		}
	}
}
