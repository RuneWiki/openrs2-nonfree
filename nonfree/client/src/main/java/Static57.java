import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public static int anInt1704;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!sd;")
	public static Class29 aClass29_40;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!mb;")
	private static Class45 aClass45_684 = Static63.method1251("New User");

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_685 = aClass45_684;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!hb;")
	public static Class5_Sub9 aClass5_Sub9_2 = new Class5_Sub9(8);

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	public static int[] anIntArray260 = new int[25];

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public static int anInt1707 = 0;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_686 = Static63.method1251(":");

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
	public static int[] anIntArray262 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	public static int anInt1708 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!sd;B)V")
	public static void method1173(@OriginalArg(0) Class29 arg0) {
		Static12.aClass29_82 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1174() {
		aClass5_Sub9_2 = null;
		aClass45_685 = null;
		aClass45_684 = null;
		anIntArray260 = null;
		aClass29_40 = null;
		aClass45_686 = null;
		anIntArray261 = null;
		anIntArray262 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!sd;Lclient!sd;)V")
	public static void method1175(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1) {
		Static110.aClass29_74 = arg0;
		Static108.aClass29_70 = arg1;
		Static92.anInt3048 = Static110.aClass29_74.method737(3);
	}
}
