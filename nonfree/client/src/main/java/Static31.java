import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt857;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[[[Lclient!s;")
	public static final Class87[][][] aClass87ArrayArrayArray1 = new Class87[4][104][104];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!rh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_6 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_210 = Static81.method1507("titlebox");

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_211 = Static81.method1507("");

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
	public static int method612(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
