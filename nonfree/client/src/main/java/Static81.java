import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_9;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt2533;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ra;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_2 = new Class3_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static final int anInt2536 = 50;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
	public static int[] anIntArray254 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "[I")
	public static int[] anIntArray255 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1078 = Static59.method1195("Create a free account");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "[I")
	public static int[] anIntArray256 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1079 = Static59.method1195("<col=ff3000>");

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1080 = Static59.method1195("An:");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
	public static int[] anIntArray258 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
	public static int[] anIntArray259 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1082 = Static59.method1195("Drop");

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1081 = aClass60_1082;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
	public static int[] anIntArray260 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1085 = Static59.method1195(" from your ignore list first");

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1083 = aClass60_1085;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
	public static int[] anIntArray261 = new int[anInt2536];

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1084 = aClass60_1078;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array17 = new Class60[anInt2536];

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "[I")
	public static int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	public static int anInt2541 = 0;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1086 = Static59.method1195("title)3jpg");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
	public static boolean method1636() {
		return Static104.anInt3014 == 0 ? Static30.aClass3_Sub2_Sub4_1.method2194() : true;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1637() {
		anIntArray260 = null;
		anIntArray259 = null;
		anIntArray255 = null;
		aClass60_1080 = null;
		aClass60_1079 = null;
		aClass60_1086 = null;
		aClass60_1081 = null;
		aClass3_Sub1_Sub2_Sub4_9 = null;
		aClass3_Sub12_Sub1_2 = null;
		aClass60_1082 = null;
		aClass60Array17 = null;
		anIntArray256 = null;
		aClass60_1078 = null;
		anIntArray254 = null;
		anIntArray258 = null;
		aClass60_1084 = null;
		anIntArray263 = null;
		aClass60_1085 = null;
		aClass60_1083 = null;
		anIntArray261 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Lclient!tc;")
	public static Class3_Sub1_Sub16 method1638(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub16 local10 = (Class3_Sub1_Sub16) Static130.aClass17_56.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static17.aClass25_3.method931(arg0, 9);
		local10 = new Class3_Sub1_Sub16();
		local10.anInt3172 = arg0;
		if (local20 != null) {
			local10.method2095(new Class3_Sub12(local20));
		}
		local10.method2092();
		Static130.aClass17_56.method644((long) arg0, local10);
		return local10;
	}
}
