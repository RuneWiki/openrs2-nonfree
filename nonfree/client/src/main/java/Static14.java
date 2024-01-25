import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!hv;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Lclient!wg;")
	public static Class265 aClass265_1;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!an", name = "i", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lclient!gk;")
	public static Class65_Sub1 method171(@OriginalArg(0) int arg0) {
		return Static390.aBoolean491 && arg0 >= Static9.anInt132 && Static311.anInt6696 >= arg0 ? Static379.aClass65_Sub1Array5[arg0 - Static9.anInt132] : null;
	}
}
