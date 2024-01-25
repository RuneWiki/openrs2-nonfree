import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static535 {

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "[I")
	public static int[] anIntArray576;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Lclient!cc;")
	public static Class2_Sub8 aClass2_Sub8_2;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_125 = new Class154(62, 11);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIII)I")
	public static int method7029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static433.aByteArrayArrayArray15[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static433.aByteArrayArrayArray15[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
