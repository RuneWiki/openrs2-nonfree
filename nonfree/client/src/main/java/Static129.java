import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_71;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "Lclient!gh;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1128 = Static177.method3050("<col=ffff00>*V");

	@OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1129 = Static177.method3050("scrollen:");

	@OriginalMember(owner = "client!pa", name = "nb", descriptor = "[J")
	public static final long[] aLongArray33 = new long[100];

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1130 = Static177.method3050("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!pa", name = "qb", descriptor = "Lclient!db;")
	public static Class20 aClass20_8 = new Class20(512);

	@OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1131 = Static177.method3050("lila:");

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IZI)I")
	public static int method2281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static153.method2665(arg1 + 91923, 4, arg0 + 45365) + (Static153.method2665(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static153.method2665(arg1, 1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2285(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static59.aClass32_1);
		arg0.addMouseMotionListener(Static59.aClass32_1);
		arg0.addFocusListener(Static59.aClass32_1);
	}
}
