import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public static int anInt4574;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public static int anInt4575;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString320 = "Prepared sound engine";

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString321 = "Created gameworld";

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "[I")
	public static int[] anIntArray354 = new int[1000];

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub8[] aClass1_Sub2_Sub8Array87 = new Class1_Sub2_Sub8[14];

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString322 = "Connected to update server";

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIILclient!sa;Lclient!sa;IIJ)V")
	public static void method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class144 local8 = new Class144();
		local8.aLong176 = arg8;
		local8.anInt5345 = arg1 * 128 + 64;
		local8.anInt5340 = arg2 * 128 + 64;
		local8.anInt5341 = arg3;
		local8.aClass9_8 = arg4;
		local8.aClass9_9 = arg5;
		local8.anInt5339 = arg6;
		local8.anInt5343 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static142.aClass1_Sub16ArrayArrayArray4[local42][arg1][arg2] == null) {
				Static142.aClass1_Sub16ArrayArrayArray4[local42][arg1][arg2] = new Class1_Sub16(local42, arg1, arg2);
			}
		}
		Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass144_1 = local8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z")
	public static boolean method3465(@OriginalArg(0) int arg0) {
		Static175.anInt4027 = arg0 + 1 & 0xFFFF;
		Static23.aBoolean40 = true;
		return true;
	}
}
