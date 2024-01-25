import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
	public static int anInt6140;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
	public static int anInt6141;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_130 = new Class362(71, 6);

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "[I")
	public static final int[] anIntArray299 = new int[8];

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "[I")
	public static final int[] anIntArray300 = new int[500];

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "[I")
	public static final int[] anIntArray301 = new int[32];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([IIIII)V")
	public static void method5239(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(15) int local15 = arg1 - 1;
		@Pc(19) int local19 = local15 - 7;
		while (arg3 < local19) {
			@Pc(23) int local23 = arg3 + 1;
			arg0[local23] = arg2;
			@Pc(28) int local28 = local23 + 1;
			arg0[local28] = arg2;
			@Pc(33) int local33 = local28 + 1;
			arg0[local33] = arg2;
			@Pc(38) int local38 = local33 + 1;
			arg0[local38] = arg2;
			@Pc(43) int local43 = local38 + 1;
			arg0[local43] = arg2;
			@Pc(48) int local48 = local43 + 1;
			arg0[local48] = arg2;
			@Pc(53) int local53 = local48 + 1;
			arg0[local53] = arg2;
			arg3 = local53 + 1;
			arg0[arg3] = arg2;
		}
		while (local15 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}
}
