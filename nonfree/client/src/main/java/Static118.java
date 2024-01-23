import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	public static int[] anIntArray258 = new int[100];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt2316 = 0;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt2320 = 0;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public static int method1867() {
		return 2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nk;I)I")
	public static int method1868(@OriginalArg(0) Class20_Sub3_Sub2 arg0) {
		@Pc(2) Class105 local2 = arg0.aClass105_1;
		if (local2.anIntArray443 != null) {
			local2 = local2.method3127();
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(20) int local20 = local2.anInt3886;
		if (arg0.anInt3057 == arg0.anInt3051) {
			local20 = local2.anInt3888;
		} else if (arg0.anInt3051 == arg0.anInt3027) {
			local20 = local2.anInt3913;
		}
		return local20;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!pa;Lclient!pa;Lclient!pa;BLclient!pa;)V")
	public static void method1869(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(4) Class86 arg3) {
		Static32.aClass86_9 = arg0;
		Static145.aClass86_53 = arg3;
		Static114.aClass86_41 = arg2;
		Static187.aClass86_71 = arg1;
		Static54.aClass93ArrayArray1 = new Class93[Static145.aClass86_53.method3319()][];
		Static201.aBooleanArray22 = new boolean[Static145.aClass86_53.method3319()];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!pa;Lclient!pa;III)Lclient!oh;")
	public static Class1_Sub1_Sub10 method1871(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2) {
		return Static139.method2305(arg0, arg2) ? Static214.method3347(arg1.method3325(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1872() {
		Static10.anInt204 = Static82.anInt1670;
		Static14.method195(false);
		Static188.method3106();
		Static185.method3083(Static10.anInt204);
		Static230.aClass20_Sub3_Sub1_3 = new Class20_Sub3_Sub1();
		Static230.aClass20_Sub3_Sub1_3.anInt3022 = 3000;
		Static230.aClass20_Sub3_Sub1_3.anInt3008 = 3000;
		Static1.method30(Static141.aClass86_Sub1_33);
		Static229.method3481(10);
	}
}
