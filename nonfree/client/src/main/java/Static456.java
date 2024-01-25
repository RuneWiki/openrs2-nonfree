import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_117 = new Class90(59, 2);

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
	public static int anInt8707 = -1;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_47 = new Class167(50);

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
	public static final int anInt8709 = 50;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "[I")
	public static final int[] anIntArray507 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
	public static final int[] anIntArray508 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
	public static final int[] anIntArray509 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "[I")
	public static final int[] anIntArray510 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
	public static final int[] anIntArray511 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "[I")
	public static final int[] anIntArray512 = new int[anInt8709];

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[anInt8709];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ek;I)Lclient!uw;")
	public static Class30_Sub4 method6707(@OriginalArg(0) Class4_Sub13 arg0) {
		return new Class30_Sub4(arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7013(), arg0.method7004());
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)Z")
	public static boolean method6708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static105.method6898(arg0, arg1) || Static232.method3760(arg0, arg1);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)I")
	public static int method6710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
