import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[6][];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
	public static void method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class128 local3 = new Class128();
		local3.anInt3434 = arg1 >> Static31.anInt665;
		local3.anInt3452 = arg2 >> Static31.anInt665;
		local3.anInt3447 = arg3 >> Static31.anInt665;
		local3.anInt3442 = arg4 >> Static31.anInt665;
		local3.anInt3443 = arg0;
		local3.anInt3436 = arg1;
		local3.anInt3438 = arg2;
		local3.anInt3440 = arg3;
		local3.anInt3448 = arg4;
		local3.anInt3445 = arg5;
		local3.anInt3446 = arg6;
		Static85.aClass128Array1[Static397.anInt6372++] = local3;
	}
}
