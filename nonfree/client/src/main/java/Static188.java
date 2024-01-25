import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "Lclient!pe;")
	public static Class254 aClass254_60;

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "Lclient!pe;")
	public static Class254 aClass254_61;

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_43 = new Class230(58, 4);

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_51 = new Class276(93, 3);

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
	public static int anInt3749 = 64;

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
	public static int anInt3750 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)Lclient!gn;")
	public static Class125 method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static580.aClass125ArrayArrayArray3[0][arg1][arg2] != null && Static580.aClass125ArrayArrayArray3[0][arg1][arg2].aClass125_1 != null;
			if (local28 && arg0 >= Static264.anInt8587 - 1) {
				return null;
			}
			Static513.method358(arg0, arg1, arg2);
		}
		return Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
	}
}
