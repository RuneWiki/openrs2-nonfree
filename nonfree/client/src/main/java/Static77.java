import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_53;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "I")
	public static int anInt1931;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array9;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!kd;")
	private static Class39 aClass39_954 = Static108.method1915("Use");

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_953 = aClass39_954;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_956 = Static108.method1915("backleft1");

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!kd;")
	public static Class39 aClass39_957 = Static108.method1915("Stufe)2");

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Lclient!kd;")
	public static Class39 aClass39_958 = Static108.method1915("Ausw-=hlen");

	@OriginalMember(owner = "client!md", name = "H", descriptor = "I")
	public static int anInt1930 = 0;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!kd;")
	public static Class39 aClass39_959 = Static108.method1915("backright1");

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!kd;")
	public static Class39 aClass39_960 = Static108.method1915("invback");

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!kd;")
	public static Class39 aClass39_961 = Static108.method1915(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Lclient!kd;")
	private static Class39 aClass39_962 = Static108.method1915("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_963 = aClass39_962;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_964 = Static108.method1915("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!md", name = "V", descriptor = "Lclient!kd;")
	private static Class39 aClass39_965 = Static108.method1915("Please contact customer support)3");

	@OriginalMember(owner = "client!md", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_966 = aClass39_965;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public static void method1320() {
		aClass39_964 = null;
		aClass39_958 = null;
		aClass39_966 = null;
		aClass39_960 = null;
		aClass39_965 = null;
		aClass39_954 = null;
		aClass39_962 = null;
		aClass39_959 = null;
		aClass39_961 = null;
		aClass39_957 = null;
		aClass39_963 = null;
		aClass39_953 = null;
		aClass1_Sub1_Sub4_Sub1Array9 = null;
		aClass62_Sub1_53 = null;
		aClass39_956 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZ)Lclient!kd;")
	public static Class39 method1321(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(13) int local13 = 1;
		@Pc(26) int local26 = arg0 / 10;
		while (local26 != 0) {
			local26 /= 10;
			local13++;
		}
		@Pc(36) int local36 = local13;
		if (arg0 < 0 || arg1) {
			local36 = local13 + 1;
		}
		@Pc(47) byte[] local47 = new byte[local36];
		if (arg0 < 0) {
			local47[0] = 45;
		} else if (arg1) {
			local47[0] = 43;
		}
		for (@Pc(65) int local65 = 0; local65 < local13; local65++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			arg0 /= 10;
			local47[local36 - local65 - 1] = (byte) (local70 + 48);
		}
		@Pc(111) Class39 local111 = new Class39();
		local111.anInt1707 = local36;
		local111.aByteArray50 = local47;
		return local111;
	}
}
