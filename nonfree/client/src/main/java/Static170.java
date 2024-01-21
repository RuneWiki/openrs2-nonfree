import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!pd;")
	public static Class74 aClass74_3;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_34;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array28 = new Class80[100];

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Lclient!af;")
	public static final Class5 aClass5_53 = new Class5(128);

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	public static int anInt3813 = 1;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!af;")
	public static final Class5 aClass5_54 = new Class5(100);

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1467 = Static120.method1824("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	public static int anInt3814 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)I")
	public static int method2729(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return local10 + arg0;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method2730() {
		Static27.aClass5_65.method146();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bc;Z)V")
	public static void method2732(@OriginalArg(0) Class1 arg0) {
		Static98.aClass1_14 = arg0;
	}
}
