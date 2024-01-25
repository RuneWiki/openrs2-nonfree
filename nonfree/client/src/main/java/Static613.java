import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static613 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public static int anInt10091;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_180 = new Class268(120, 3);

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public static int anInt10095 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ria;)Z")
	public static boolean method8513(@OriginalArg(1) Class290 arg0) {
		return arg0 == null ? false : Static198.method3517(arg0.anInt8558, arg0.anInt8554 - arg0.anInt8556, -arg0.anInt8561 + arg0.anInt8553, arg0.anInt8561, arg0.anInt8563 - arg0.anInt8558, arg0.anInt8556);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)[Lclient!og;")
	public static Class238[] method8515() {
		return new Class238[] { Static480.aClass238_12, Static555.aClass238_13, Static132.aClass238_3 };
	}
}
