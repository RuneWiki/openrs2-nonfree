import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ea", name = "pb", descriptor = "Lclient!r;")
	private static Class61 aClass61_870 = Static129.method2060("cyan:");

	@OriginalMember(owner = "client!ea", name = "zb", descriptor = "Lclient!r;")
	public static Class61 aClass61_871 = aClass61_870;

	@OriginalMember(owner = "client!ea", name = "Ob", descriptor = "Lclient!r;")
	private static Class61 aClass61_873 = Static129.method2060("Loaded fonts");

	@OriginalMember(owner = "client!ea", name = "Jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_872 = aClass61_873;

	@OriginalMember(owner = "client!ea", name = "Tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_874 = Static129.method2060("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ea", name = "Yb", descriptor = "Lclient!r;")
	public static Class61 aClass61_875 = Static129.method2060("Art");

	@OriginalMember(owner = "client!ea", name = "cc", descriptor = "Lclient!r;")
	public static Class61 aClass61_876 = aClass61_870;

	@OriginalMember(owner = "client!ea", name = "ic", descriptor = "I")
	public static int anInt2920 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ke;III)V")
	public static void method1853(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static86.aClass5_Sub11_8 != null || Static117.aBoolean105 || (arg0 == null || Static44.method774(arg0) == null)) {
			return;
		}
		Static86.aClass5_Sub11_8 = arg0;
		Static68.aClass5_Sub11_6 = Static44.method774(arg0);
		Static132.anInt3373 = arg1;
		Static110.anInt2830 = 0;
		Static91.aBoolean84 = false;
		Static129.anInt3233 = arg2;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
	public static void method1856() {
		aClass61_870 = null;
		aClass61_872 = null;
		aClass61_871 = null;
		aClass61_875 = null;
		aClass61_876 = null;
		aClass61_873 = null;
		aClass61_874 = null;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lclient!r;")
	public static Class61 method1858(@OriginalArg(0) int arg0) {
		@Pc(3) Class61 local3 = new Class61();
		local3.anInt2675 = 0;
		local3.aByteArray38 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)I")
	public static int method1860(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([BI)Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 method1861(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class5_Sub2_Sub1_Sub1_Sub1 local18 = new Class5_Sub2_Sub1_Sub1_Sub1(arg0, Static129.anIntArray393, Static48.anIntArray190, Static58.anIntArray212, Static50.anIntArray191, Static108.anIntArray19, Static67.aByteArrayArray7);
			Static87.method1546();
			return local18;
		}
	}
}
