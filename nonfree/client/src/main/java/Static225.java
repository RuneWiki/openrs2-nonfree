import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_57 = new Class25(16, 3);

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_61 = new Class186(55, 2);

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public static int anInt3838 = 0;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public static int anInt3839 = 765;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg3 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class6_Sub17 local20 = (Class6_Sub17) Static150.aClass137_14.method3175(local14);
		if (local20 == null) {
			local20 = new Class6_Sub17();
			Static150.aClass137_14.method3179(local14, local20);
		}
		if (arg1 >= local20.anIntArray289.length) {
			@Pc(48) int[] local48 = new int[arg1 + 1];
			@Pc(53) int[] local53 = new int[arg1 + 1];
			for (@Pc(55) int local55 = 0; local55 < local20.anIntArray289.length; local55++) {
				local48[local55] = local20.anIntArray289[local55];
				local53[local55] = local20.anIntArray287[local55];
			}
			for (@Pc(81) int local81 = local20.anIntArray289.length; local81 < arg1; local81++) {
				local48[local81] = -1;
				local53[local81] = 0;
			}
			local20.anIntArray287 = local53;
			local20.anIntArray289 = local48;
		}
		local20.anIntArray289[arg1] = arg2;
		local20.anIntArray287[arg1] = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3416(@OriginalArg(0) String arg0) {
		@Pc(16) String local16 = Static247.method3808(Static293.method4335(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
