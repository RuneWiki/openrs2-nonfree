import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "[I")
	public static final int[] anIntArray1304 = new int[5];

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_89 = new Class11(14, 11);

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt6197 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public static int anInt6198 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBLclient!wg;)V")
	public static void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub5_Sub1_Sub2 arg2) {
		if (arg1 == arg2.anInt6405 && arg1 != -1) {
			@Pc(25) Class202 local25 = Static36.aClass236_1.method5396(arg1);
			@Pc(28) int local28 = local25.anInt4932;
			if (local28 == 1) {
				arg2.anInt6427 = 0;
				arg2.anInt6429 = arg0;
				arg2.anInt6452 = 0;
				arg2.anInt6443 = 0;
				arg2.anInt6436 = 1;
				Static169.method2965(arg2.anInt6443, false, arg2.aByte69, arg2.anInt6390, local25, arg2.anInt6386);
			}
			if (local28 == 2) {
				arg2.anInt6452 = 0;
				return;
			}
		} else if (arg1 == -1 || arg2.anInt6405 == -1 || Static36.aClass236_1.method5396(arg1).anInt4945 >= Static36.aClass236_1.method5396(arg2.anInt6405).anInt4945) {
			arg2.anInt6443 = 0;
			arg2.anInt6427 = 0;
			arg2.anInt6429 = arg0;
			arg2.anInt6455 = arg2.anInt6456;
			arg2.anInt6452 = 0;
			arg2.anInt6405 = arg1;
			arg2.anInt6436 = 1;
			if (arg2.anInt6405 == -1) {
				return;
			}
			Static169.method2965(arg2.anInt6443, false, arg2.aByte69, arg2.anInt6390, Static36.aClass236_1.method5396(arg2.anInt6405), arg2.anInt6386);
		}
	}
}
