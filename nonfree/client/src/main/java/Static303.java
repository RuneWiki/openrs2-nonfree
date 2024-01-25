import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public static int anInt5117;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	public static int anInt5127;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt5123 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILclient!qq;I)V")
	public static void method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub42 arg3) {
		arg3.aClass3_Sub11_Sub1_1.method5215(arg0);
		arg3.aClass3_Sub11_Sub1_1.method5176(arg1);
		arg3.aClass3_Sub11_Sub1_1.method5176(arg2);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method4452() {
		@Pc(1) Class6 local1 = Static475.aClass6_58;
		synchronized (Static475.aClass6_58) {
			Static475.aClass6_58.method97(5);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!r;Lclient!wp;)V")
	public static void method4453(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class361 arg1) {
		@Pc(31) boolean local31 = Static6.aClass92_1.method2672(arg1.anInt9653 | 0xFF000000, arg0, arg1.anInt9623, arg1.anInt9607, arg1.anInt9645, arg1.aBoolean750 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aClass78_1 : null, arg1.anInt9627) == null;
		if (local31) {
			Static488.aClass112_58.method3079(new Class3_Sub44(arg1.anInt9645, arg1.anInt9607, arg1.anInt9623, arg1.anInt9653 | 0xFF000000, arg1.anInt9627, arg1.aBoolean750));
			Static186.method3170(arg1);
		}
	}
}
