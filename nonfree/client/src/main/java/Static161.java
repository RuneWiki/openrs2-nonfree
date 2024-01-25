import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!fn", name = "V", descriptor = "I")
	public static int anInt3179;

	@OriginalMember(owner = "client!fn", name = "X", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Lclient!af;")
	public static final Class9 aClass9_3 = new Class9();

	@OriginalMember(owner = "client!fn", name = "T", descriptor = "Lclient!mr;")
	public static Class223 aClass223_16 = new Class223();

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_36 = new Class200(52, 2);

	@OriginalMember(owner = "client!fn", name = "W", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray9 = new int[2][][];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2888(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
