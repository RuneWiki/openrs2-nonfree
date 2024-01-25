import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "Lclient!qfa;")
	public static final Class271 aClass271_1 = new Class271();

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
	public static final int anInt10552 = 4;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
	public static void method8666(@OriginalArg(0) int arg0) {
		if (Static506.anIntArray562 == null || Static506.anIntArray562.length < arg0) {
			Static506.anIntArray562 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!vm;Lclient!kha;Lclient!nl;ILclient!kha;Lclient!kha;)Z")
	public static boolean method8667(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class3_Sub7_Sub5 arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) Class181 arg4) {
		Static493.aClass122_2 = arg0;
		Static222.aClass181_45 = arg1;
		Static226.aClass181_49 = arg4;
		Static260.aClass181_56 = arg3;
		Static102.anIntArray598 = new int[16];
		Static522.aClass3_Sub7_Sub5_4 = arg2;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static102.anIntArray598[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg2 + arg5;
		@Pc(15) int local15 = arg4 - arg5;
		for (@Pc(21) int local21 = arg2; local21 < local10; local21++) {
			Static580.method8027(Static104.anIntArrayArray24[local21], arg1, arg6, arg3);
		}
		@Pc(44) int local44 = arg1 - arg5;
		for (@Pc(46) int local46 = arg4; local46 > local15; local46--) {
			Static580.method8027(Static104.anIntArrayArray24[local46], arg1, arg6, arg3);
		}
		@Pc(65) int local65 = arg6 + arg5;
		for (@Pc(67) int local67 = local10; local67 <= local15; local67++) {
			@Pc(73) int[] local73 = Static104.anIntArrayArray24[local67];
			Static580.method8027(local73, local65, arg6, arg3);
			Static580.method8027(local73, local44, local65, arg0);
			Static580.method8027(local73, arg1, local44, arg3);
		}
	}
}
