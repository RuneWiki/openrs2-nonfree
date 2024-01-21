import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array9;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	public static int anInt1825;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
	public static int anInt1828;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lclient!ec;")
	public static Class17 aClass17_11 = new Class17(4096);

	@OriginalMember(owner = "client!kc", name = "sb", descriptor = "Lclient!he;")
	private static Class26 aClass26_913 = Static6.method100(" from your ignore list first");

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_908 = aClass26_913;

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lclient!he;")
	public static Class26 aClass26_909 = Static6.method100(": ");

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "Lclient!he;")
	public static Class26 aClass26_910 = Static6.method100("leuchten1:");

	@OriginalMember(owner = "client!kc", name = "rb", descriptor = "Lclient!he;")
	private static Class26 aClass26_912 = Static6.method100("The server is being updated)3");

	@OriginalMember(owner = "client!kc", name = "qb", descriptor = "Lclient!he;")
	public static Class26 aClass26_911 = aClass26_912;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method1197() {
		aClass3_Sub1_Sub4_Sub3Array9 = null;
		aClass26_911 = null;
		aClass26_912 = null;
		aClass26_910 = null;
		aClass17_11 = null;
		aClass26_908 = null;
		aClass26_909 = null;
		aClass26_913 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class3_Sub1_Sub15 method1198(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static56.aClass66_16.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static5.aClass16_149.method566(16, arg0);
		local10 = new Class3_Sub1_Sub15();
		if (local20 != null) {
			local10.method1945(new Class3_Sub11(local20));
		}
		Static56.aClass66_16.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lclient!he;")
	public static Class26 method1200(@OriginalArg(1) int arg0) {
		@Pc(7) Class26 local7 = new Class26();
		local7.anInt1345 = 0;
		local7.aByteArray7 = new byte[arg0];
		return local7;
	}
}
