import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static722 {

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_14 = new Class123(15, 0, 1, 0);

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray70 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "[I")
	public static final int[] anIntArray794 = new int[8];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lclient!fr;")
	public static Class123 method9541(@OriginalArg(0) int arg0) {
		@Pc(8) Class123[] local8 = Static589.method7599();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt3237 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBZZII)V")
	public static void method9542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg5) {
			return;
		}
		@Pc(27) int local27 = (arg5 + arg1) / 2;
		@Pc(29) int local29 = arg5;
		@Pc(33) Class238_Sub1 local33 = Static85.aClass238_Sub1Array1[local27];
		Static85.aClass238_Sub1Array1[local27] = Static85.aClass238_Sub1Array1[arg1];
		Static85.aClass238_Sub1Array1[arg1] = local33;
		for (@Pc(45) int local45 = arg5; local45 < arg1; local45++) {
			if (Static694.method9186(Static85.aClass238_Sub1Array1[local45], arg2, arg3, arg0, local33, arg4) <= 0) {
				@Pc(64) Class238_Sub1 local64 = Static85.aClass238_Sub1Array1[local45];
				Static85.aClass238_Sub1Array1[local45] = Static85.aClass238_Sub1Array1[local29];
				Static85.aClass238_Sub1Array1[local29++] = local64;
			}
		}
		Static85.aClass238_Sub1Array1[arg1] = Static85.aClass238_Sub1Array1[local29];
		Static85.aClass238_Sub1Array1[local29] = local33;
		method9542(arg0, local29 - 1, arg2, arg3, arg4, arg5);
		method9542(arg0, arg1, arg2, arg3, arg4, local29 + 1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I[JI)V")
	public static void method9545(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(26) int local26 = (arg3 + arg0) / 2;
		@Pc(28) int local28 = arg3;
		@Pc(32) long local32 = arg2[local26];
		arg2[local26] = arg2[arg0];
		arg2[arg0] = local32;
		@Pc(46) int local46 = arg1[local26];
		arg1[local26] = arg1[arg0];
		arg1[arg0] = local46;
		@Pc(67) int local67 = ~local32 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(69) int local69 = arg3; local69 < arg0; local69++) {
			if (local32 + (long) (local67 & local69) > arg2[local69]) {
				@Pc(92) long local92 = arg2[local69];
				arg2[local69] = arg2[local28];
				arg2[local28] = local92;
				@Pc(106) int local106 = arg1[local69];
				arg1[local69] = arg1[local28];
				arg1[local28++] = local106;
			}
		}
		arg2[arg0] = arg2[local28];
		arg2[local28] = local32;
		arg1[arg0] = arg1[local28];
		arg1[local28] = local46;
		method9545(local28 - 1, arg1, arg2, arg3);
		method9545(arg0, arg1, arg2, local28 + 1);
	}
}
