import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public static int anInt9513;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
	public static boolean aBoolean681 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method8074() {
		for (@Pc(3) int local3 = 0; local3 < Static372.aByteArrayArrayArray3.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static372.aByteArrayArrayArray3[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static372.aByteArrayArrayArray3[0][0].length; local11++) {
					Static372.aByteArrayArrayArray3[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method8075(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(25) int local25 = -arg5; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg0++;
				arg7[local33] += arg3[arg6++];
				@Pc(45) int local45 = arg0++;
				arg7[local45] += arg3[arg6++];
				@Pc(57) int local57 = arg0++;
				arg7[local57] += arg3[arg6++];
				@Pc(69) int local69 = arg0++;
				arg7[local69] += arg3[arg6++];
			}
			for (@Pc(87) int local87 = local15; local87 < 0; local87++) {
				local33 = arg0++;
				arg7[local33] += arg3[arg6++];
			}
			arg6 += arg2;
			arg0 += arg1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public static void method8081() {
		if (Static25.aClass39_4 != null) {
			Static25.aClass39_4.method4890();
		}
		if (Static16.aClass39_1 != null) {
			Static16.aClass39_1.method4890();
		}
	}
}
