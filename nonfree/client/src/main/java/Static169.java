import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!pd;")
	public static Class195 aClass195_4;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!qs;")
	public static Class211 aClass211_45;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
	public static final int[] anIntArray354 = new int[5];

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt3489 = 0;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	public static int anInt3490 = 0;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILclient!ih;I)Lclient!gq;")
	public static Class8_Sub1_Sub1 method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class106_Sub2 arg4) {
		if (arg4.aBoolean236 || Static25.method518(arg2) && Static25.method518(arg1)) {
			return new Class8_Sub1_Sub1(arg4, 3553, arg3, arg0, arg2, arg1, true);
		} else if (arg4.aBoolean216) {
			return new Class8_Sub1_Sub1(arg4, 34037, arg3, arg0, arg2, arg1, true);
		} else {
			return new Class8_Sub1_Sub1(arg4, arg3, arg0, arg2, arg1, Static427.method5762(arg2), Static427.method5762(arg1), true);
		}
	}
}
