import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "Jb", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!ba", name = "Wb", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!ba", name = "jb", descriptor = "Lclient!cb;")
	public static Class11 aClass11_9 = new Class11(100);

	@OriginalMember(owner = "client!ba", name = "ac", descriptor = "I")
	public static int anInt1194 = 0;

	@OriginalMember(owner = "client!ba", name = "cc", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!ba", name = "gc", descriptor = "I")
	public static int anInt1200 = 0;

	@OriginalMember(owner = "client!ba", name = "mc", descriptor = "Lclient!a;")
	private static Class1 aClass1_1203 = Static94.method1596("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ba", name = "hc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1202 = aClass1_1203;

	@OriginalMember(owner = "client!ba", name = "ic", descriptor = "[I")
	public static int[] anIntArray122 = new int[2000];

	@OriginalMember(owner = "client!ba", name = "jc", descriptor = "I")
	public static int anInt1201 = -1;

	@OriginalMember(owner = "client!ba", name = "lc", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!ba", name = "oc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1204 = Static94.method1596("Ausw-=hlen");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!bd;I)Z")
	public static boolean method795(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1699(arg1);
		if (local4 == null) {
			return false;
		} else {
			Static10.method1696(local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(Z)V")
	public static void method822() {
		aClass1_1204 = null;
		anIntArray122 = null;
		aClass2_Sub1_Sub2_Sub2_9 = null;
		aClass1_1203 = null;
		aClass1_1202 = null;
		aClass11_9 = null;
		anIntArray121 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Lclient!pe;")
	public static Class2_Sub1_Sub12 method824(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub12 local15 = (Class2_Sub1_Sub12) Static113.aClass11_20.method431((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static82.aClass8_22.method1684(arg0, 3);
		local15 = new Class2_Sub1_Sub12();
		if (local25 != null) {
			local15.method1458(new Class2_Sub3(local25));
		}
		Static113.aClass11_20.method430((long) arg0, local15);
		return local15;
	}
}
