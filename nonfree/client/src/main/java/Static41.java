import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_297 = Static158.method3034(" more options");

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!ob;")
	public static Class60 aClass60_296 = aClass60_297;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
	public static final int[] anIntArray119 = new int[] { 0, 0, 0, 0, 10, 6, 0, 0, 2, -1, 0, 0, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 10, 2, 0, 0, 6, 0, -2, 0, -1, 0, 4, 0, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0, 7, 0, 0, 7, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 0, -2, 2, -2, 0, 4, 4, 0, 2, 4, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 6, 0, 6, 15, 0, 3, 0, -1, 0, 0, 0, 0, 0, 20, 0, 0, 6, 0, 12, 0, -2, 0, 0, 3, 0, 0, 3, 0, 0, 7, 6, 0, -1, 0, 0, 0, 0, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, -2, 0, 5, 6, 5, 0, 0, 0, 3, 0, 0, 0, 0, -2, -1, 2, 6, 2, 0, 6, 2, 0, 0, 7, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_13 = new Class89(30);

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_2 = new Class67();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)J")
	public static long method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3604; local13++) {
			@Pc(19) Class6 local19 = local7.aClass6Array2[local13];
			if ((local19.aLong8 >> 29 & 0x3L) == 2L && local19.anInt299 == arg1 && local19.anInt291 == arg2) {
				return local19.aLong8;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I")
	public static int method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class2_Sub15 local6 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray391.length) {
			return local6.anIntArray391[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method913(@OriginalArg(1) Class13 arg0) {
		Static107.aClass13_21 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!pe;Lclient!pe;ZLclient!i;B)V")
	public static void method914(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class2_Sub1_Sub7_Sub3_Sub1 arg3) {
		Static63.aClass13_13 = arg1;
		Static48.aBoolean55 = arg2;
		Static24.aClass13_6 = arg0;
		@Pc(23) int local23 = Static63.aClass13_13.method519() - 1;
		Static62.anInt1918 = local23 * 256 + Static63.aClass13_13.method513(local23);
		Static136.aClass2_Sub1_Sub7_Sub3_Sub1_4 = arg3;
	}
}
