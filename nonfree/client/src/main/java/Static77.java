import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_36 = new Class252(21, -1);

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_77 = new Class305(5, -1);

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_9 = new Class295();

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[Lclient!wf;")
	public static final Class315[] aClass315Array1 = new Class315[100];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[SI)[S")
	public static short[] method1768(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) short[] local14 = new short[arg1];
		Static556.method7045(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1769() {
		Static247.aClass4_7.E(Static202.anInt4056, Static286.aClass1_Sub15_Sub1_1.aBoolean523 ? Static39.anInt1114 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1770(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static216.method3997(Static135.aClass252_140);
		Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg0) + 1);
		Static259.aClass1_Sub17_Sub2_1.method4464(arg0);
		Static259.aClass1_Sub17_Sub2_1.method4500(arg1);
	}
}
