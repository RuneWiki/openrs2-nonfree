import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static421 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_71 = new Class107(54, -1);

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_72 = new Class107(14, 4);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
	public static void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > arg1) {
			Static59.method1261(Static163.anIntArrayArray35[arg0], arg2, arg1, arg3);
		} else {
			Static59.method1261(Static163.anIntArrayArray35[arg0], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void method1796(@OriginalArg(1) int arg0) {
		Static29.anInt4404 = arg0;
		Static80.aClass134_13.method3272();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1797() {
		Static355.aBoolean411 = false;
		Static378.aClipboard4 = null;
		Static319.method3515();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!uq;ILclient!uq;)V")
	public static void method1799(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Class251 arg1) {
		Static193.method2984(Static429.aClass179_93);
		Static92.aClass1_Sub5_Sub1_1.method5417(arg1.anInt6689);
		Static92.aClass1_Sub5_Sub1_1.method5375(arg1.anInt6704);
		Static92.aClass1_Sub5_Sub1_1.method5373(arg0.anInt6689);
		Static92.aClass1_Sub5_Sub1_1.method5375(arg0.anInt6704);
		Static92.aClass1_Sub5_Sub1_1.method5359(arg0.anInt6679);
		Static92.aClass1_Sub5_Sub1_1.method5390(arg1.anInt6679);
	}
}
