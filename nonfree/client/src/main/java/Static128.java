import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "Lclient!oc;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "Lclient!ba;")
	public static Class7 aClass7_5;

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1203 = Static119.method1462("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "Lclient!be;")
	public static Class2_Sub4 aClass2_Sub4_35 = new Class2_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1204 = Static119.method1462("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1206 = Static119.method1462(" more options");

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1205 = aClass65_1206;

	@OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1207 = aClass65_1203;

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "[I")
	public static int[] anIntArray360 = new int[50];

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "[I")
	public static int[] anIntArray361 = new int[32];

	@OriginalMember(owner = "client!vf", name = "fb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1208 = Static119.method1462("glow1:");

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1209 = aClass65_1208;

	@OriginalMember(owner = "client!vf", name = "hb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1210 = aClass65_1208;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method1955(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static72.method1244(local13) : local13;
		} else if (arg1 instanceof Class19) {
			@Pc(32) Class19 local32 = (Class19) arg1;
			return local32.method1316();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
	public static void method1956() {
		aClass65_1205 = null;
		aClass65_1209 = null;
		aClass7_5 = null;
		anIntArray361 = null;
		aClass65_1204 = null;
		aClass65_1210 = null;
		aClass65_1206 = null;
		aClass65_1203 = null;
		aClass65_1207 = null;
		aClass61_1 = null;
		anIntArray358 = null;
		anIntArray360 = null;
		aClass65_1208 = null;
		anIntArray359 = null;
		aClass2_Sub4_35 = null;
	}
}
