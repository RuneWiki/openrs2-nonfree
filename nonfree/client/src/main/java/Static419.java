import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!sl;)Lclient!fk;")
	public static Class112 method6582(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method4221();
		return new Class112(local7);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!kca;)I")
	public static int method6584(@OriginalArg(1) Class182 arg0) {
		if (Static160.aClass182_5 == arg0) {
			return 6407;
		} else if (arg0 == Static502.aClass182_14) {
			return 6408;
		} else if (arg0 == Static355.aClass182_12) {
			return 6406;
		} else if (arg0 == Static220.aClass182_7) {
			return 6409;
		} else if (arg0 == Static118.aClass182_3) {
			return 6410;
		} else if (Static369.aClass182_13 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
