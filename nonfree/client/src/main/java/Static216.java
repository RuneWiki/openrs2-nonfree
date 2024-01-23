import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
	public static int anInt4456;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
	public static int anInt4457;

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString156 = "slide:";

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString157 = " has logged in.";

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	public static void method3391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static235.anInt4759; local16++) {
			if (arg2 < Static57.anIntArray84[local16] + Static78.anIntArray113[local16] && arg0 + arg2 > Static78.anIntArray113[local16] && Static250.anIntArray374[local16] + Static295.anIntArray277[local16] > arg3 && arg3 + arg1 > Static295.anIntArray277[local16]) {
				Static128.aBooleanArray7[local16] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIIIII)V")
	public static void method3392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static48.method768(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg2;
		@Pc(17) int local17 = arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(25) int local25 = -local15;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(32) int local32 = -arg0;
		@Pc(40) int[] local40 = Static181.anIntArrayArray19[arg1];
		@Pc(42) int local42 = local15;
		@Pc(46) int local46 = arg4 - local15;
		Static19.method343(arg4 - arg0, arg3, local40, local46);
		@Pc(59) int local59 = arg4 + local15;
		Static19.method343(local46, arg5, local40, local59);
		Static19.method343(local59, arg3, local40, arg4 + arg0);
		while (local17 > local10) {
			local29 += 2;
			local25 += local29;
			local27 += 2;
			local32 += local27;
			if (local25 >= 0 && local42 >= 1) {
				Static88.anIntArray128[local42] = local10;
				local42--;
				local25 -= local42 << 1;
			}
			local10++;
			@Pc(131) int[] local131;
			@Pc(137) int[] local137;
			@Pc(141) int local141;
			@Pc(150) int local150;
			@Pc(146) int local146;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local32 >= 0) {
				local17--;
				local32 -= local17 << 1;
				if (local15 > local17) {
					local131 = Static181.anIntArrayArray19[arg1 + local17];
					local137 = Static181.anIntArrayArray19[arg1 - local17];
					local141 = Static88.anIntArray128[local17];
					local146 = arg4 - local10;
					local150 = local10 + arg4;
					local154 = local141 + arg4;
					local159 = arg4 - local141;
					Static19.method343(local146, arg3, local131, local159);
					Static19.method343(local159, arg5, local131, local154);
					Static19.method343(local154, arg3, local131, local150);
					Static19.method343(local146, arg3, local137, local159);
					Static19.method343(local159, arg5, local137, local154);
					Static19.method343(local154, arg3, local137, local150);
				} else {
					local131 = Static181.anIntArrayArray19[arg1 + local17];
					local137 = Static181.anIntArrayArray19[arg1 - local17];
					local141 = local10 + arg4;
					local150 = arg4 - local10;
					Static19.method343(local150, arg3, local131, local141);
					Static19.method343(local150, arg3, local137, local141);
				}
			}
			local141 = local17 + arg4;
			local137 = Static181.anIntArrayArray19[arg1 - local10];
			local131 = Static181.anIntArrayArray19[arg1 + local10];
			local150 = arg4 - local17;
			if (local15 > local10) {
				local146 = local10 <= local42 ? local42 : Static88.anIntArray128[local10];
				local154 = arg4 + local146;
				local159 = arg4 - local146;
				Static19.method343(local150, arg3, local131, local159);
				Static19.method343(local159, arg5, local131, local154);
				Static19.method343(local154, arg3, local131, local141);
				Static19.method343(local150, arg3, local137, local159);
				Static19.method343(local159, arg5, local137, local154);
				Static19.method343(local154, arg3, local137, local141);
			} else {
				Static19.method343(local150, arg3, local131, local141);
				Static19.method343(local150, arg3, local137, local141);
			}
		}
	}
}
