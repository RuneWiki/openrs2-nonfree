import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "Lclient!dm;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
	public static int anInt2459;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "Lclient!of;")
	public static final Class4_Sub30_Sub1 aClass4_Sub30_Sub1_1 = new Class4_Sub30_Sub1(5000);

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method1836() {
		Static52.anInt1390 = -1;
		Static454.anInt7591 = -1;
		Static421.anInt7104 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)I")
	public static int method1838(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
