import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oga", name = "E", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_143 = new Class126(11, -2);

	@OriginalMember(owner = "client!oga", name = "G", descriptor = "[S")
	private static final short[] aShortArray140 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!oga", name = "H", descriptor = "[S")
	private static final short[] aShortArray141 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!oga", name = "I", descriptor = "[S")
	private static final short[] aShortArray142 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!oga", name = "K", descriptor = "[S")
	private static final short[] aShortArray143 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!oga", name = "F", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray140, aShortArray141, aShortArray142, aShortArray143 };

	@OriginalMember(owner = "client!oga", name = "J", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_101 = new Class376(4, 2);

	@OriginalMember(owner = "client!oga", name = "L", descriptor = "Lclient!bo;")
	public static final Class44 aClass44_5 = new Class44();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIII)V")
	public static void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg2 - arg5;
		@Pc(19) int local19 = arg5 + arg4;
		for (@Pc(21) int local21 = arg4; local21 < local19; local21++) {
			Static526.method7369(Static299.anIntArrayArray58[local21], arg1, arg0, arg3);
		}
		@Pc(41) int local41 = arg5 + arg0;
		@Pc(46) int local46 = arg1 - arg5;
		for (@Pc(48) int local48 = arg2; local48 > local15; local48--) {
			Static526.method7369(Static299.anIntArrayArray58[local48], arg1, arg0, arg3);
		}
		for (@Pc(66) int local66 = local19; local66 <= local15; local66++) {
			@Pc(72) int[] local72 = Static299.anIntArrayArray58[local66];
			Static526.method7369(local72, local41, arg0, arg3);
			Static526.method7369(local72, arg1, local46, arg3);
		}
	}
}
