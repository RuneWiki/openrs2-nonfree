import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!vha", name = "f", descriptor = "Lclient!jga;")
	public static Class14_Sub3_Sub11 aClass14_Sub3_Sub11_3;

	@OriginalMember(owner = "client!vha", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_134 = new Class100(39, 8);

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIII)I")
	public static int method8844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static553.aByteArrayArrayArray18[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static553.aByteArrayArrayArray18[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
