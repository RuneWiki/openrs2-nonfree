import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!uaa", name = "W", descriptor = "I")
	private static int anInt1095;

	@OriginalMember(owner = "client!uaa", name = "X", descriptor = "I")
	private static int anInt1096;

	@OriginalMember(owner = "client!uaa", name = "Y", descriptor = "I")
	private static int anInt1097;

	@OriginalMember(owner = "client!uaa", name = "Z", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!uaa", name = "ab", descriptor = "Z")
	private static boolean aBoolean67;

	@OriginalMember(owner = "client!uaa", name = "bb", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!uaa", name = "cb", descriptor = "I")
	private static int anInt1098;

	@OriginalMember(owner = "client!uaa", name = "db", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!uaa", name = "eb", descriptor = "I")
	private static int anInt1099;

	@OriginalMember(owner = "client!uaa", name = "fb", descriptor = "I")
	private static int anInt1100;

	@OriginalMember(owner = "client!uaa", name = "gb", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!uaa", name = "hb", descriptor = "I")
	private static int anInt1101;

	@OriginalMember(owner = "client!uaa", name = "ib", descriptor = "I")
	private static int anInt1102;

	@OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
	public static final int anInt1090 = 50;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray76 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "[I")
	public static final int[] anIntArray77 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "[I")
	public static final int[] anIntArray78 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "[I")
	public static final int[] anIntArray79 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "[I")
	public static final int[] anIntArray80 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "S", descriptor = "Lclient!fo;")
	public static final Class107 aClass107_2 = new Class107();

	@OriginalMember(owner = "client!uaa", name = "T", descriptor = "[I")
	public static final int[] anIntArray81 = new int[anInt1090];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIIIIBILclient!oa;III[[[B)V")
	public static void method843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class121 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg1 == 0 || arg4 == 0) {
			return;
		}
		if (arg1 == 9) {
			arg1 = 1;
			arg9 = arg9 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg1 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg1 = 8;
			arg9 = arg9 + 3 & 0x3;
		}
		arg7.ma(arg10, arg6, arg8, arg3, arg2, arg0, arg11[arg1 - 1][arg9], arg4, arg5);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBZI)V")
	public static void method848(@OriginalArg(2) boolean arg0) {
		Static570.aBoolean666 = arg0;
		Static508.anInt8600 = 22050;
		Static390.anInt6936 = 2;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIZIILclient!pea;I[B)Lclient!mm;")
	public static Class35_Sub3_Sub1 method849(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class121_Sub3 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean457 || Static392.method5808(arg0) && Static392.method5808(arg1)) {
			return new Class35_Sub3_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean464) {
			return new Class35_Sub3_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class35_Sub3_Sub1(arg2, 6406, arg0, arg1, Static516.method7313(arg0), Static516.method7313(arg1), arg3, 6406);
		}
	}
}
