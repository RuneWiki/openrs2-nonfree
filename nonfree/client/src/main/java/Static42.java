import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_21 = new Class55(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public static int anInt690 = 0;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_22 = new Class55("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "F")
	public static float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[Lclient!as;")
	public static final Class16[] aClass16Array1 = new Class16[128];

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
	public static final int[] anIntArray66 = new int[14];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class7_Sub27 local20 = (Class7_Sub27) Static55.aClass164_6.method3512(local14);
		if (local20 == null) {
			local20 = new Class7_Sub27();
			Static55.aClass164_6.method3508(local14, local20);
		}
		if (arg2 >= local20.anIntArray323.length) {
			@Pc(51) int[] local51 = new int[arg2 + 1];
			@Pc(56) int[] local56 = new int[arg2 + 1];
			for (@Pc(58) int local58 = 0; local58 < local20.anIntArray323.length; local58++) {
				local51[local58] = local20.anIntArray323[local58];
				local56[local58] = local20.anIntArray324[local58];
			}
			for (@Pc(88) int local88 = local20.anIntArray323.length; local88 < arg2; local88++) {
				local51[local88] = -1;
				local56[local88] = 0;
			}
			local20.anIntArray323 = local51;
			local20.anIntArray324 = local56;
		}
		local20.anIntArray323[arg2] = arg1;
		local20.anIntArray324[arg2] = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
