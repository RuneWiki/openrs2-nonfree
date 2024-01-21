import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_94 = Static120.method1824("Loaded sprites");

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!ha;")
	public static Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!rd;")
	public static Class80 aClass80_95 = aClass80_94;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt312 = 3;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt315 = 99;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public static int anInt316 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	public static int method235() {
		@Pc(9) int local9 = Static50.method742(Static153.anInt673, Static86.anInt1786, Static56.anInt1216);
		return local9 - Static149.anInt3350 >= 800 || (Static18.aByteArrayArrayArray1[Static153.anInt673][Static56.anInt1216 >> 7][Static86.anInt1786 >> 7] & 0x4) == 0 ? 3 : Static153.anInt673;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZ)I")
	public static int method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}
}
