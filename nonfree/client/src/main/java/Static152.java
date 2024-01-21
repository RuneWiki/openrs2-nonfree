import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!wa;")
	public static Class87 aClass87_11;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 aClass2_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_16;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array7 = new Class2_Sub3_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt3507 = 0;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!dd;")
	public static Class17 aClass17_24 = new Class17(20);

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1037 = Static38.method685("<img=1>");

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1038 = Static38.method685(" has logged in)3");

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt3511 = 0;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1039 = aClass6_1038;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "[I")
	public static int[] anIntArray350 = new int[50];

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public static int anInt3513 = 0;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1040 = Static38.method685("This world is full)3");

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1041 = aClass6_1040;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method2332() {
		aClass6_1038 = null;
		aClass2_Sub3_Sub2_Sub3_4 = null;
		aClass6_1037 = null;
		aClass6_1041 = null;
		anIntArray350 = null;
		aClass2_Sub3_Sub2_Sub1Array7 = null;
		aClass6_1040 = null;
		aClass6_1039 = null;
		aClass10_Sub1_16 = null;
		aClass17_24 = null;
		aClass87_11 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILclient!c;)Z")
	public static boolean method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(5) byte[] local5 = arg2.method1605(arg1, arg0);
		if (local5 == null) {
			return false;
		} else {
			Static38.method682(local5);
			return true;
		}
	}
}
