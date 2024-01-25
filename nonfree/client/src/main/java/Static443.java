import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_266 = new Class186(99, -1);

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_55 = new Class263(12, 0, 1, 0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILclient!bp;)V")
	public static void method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub2_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt6068 && arg1 != -1) {
			@Pc(88) Class233 local88 = Static269.aClass10_1.method286(arg1);
			@Pc(91) int local91 = local88.anInt6742;
			if (local91 == 1) {
				arg2.anInt6091 = 0;
				arg2.anInt6089 = 1;
				arg2.anInt6117 = arg0;
				arg2.anInt6080 = 0;
				arg2.anInt6136 = 0;
				Static374.method5106(arg2 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg2.anInt6091, arg2.aByte86, local88, arg2.anInt6062, arg2.anInt6061);
			}
			if (local91 == 2) {
				arg2.anInt6136 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt6068 == -1 || Static269.aClass10_1.method286(arg1).anInt6754 >= Static269.aClass10_1.method286(arg2.anInt6068).anInt6754) {
			arg2.anInt6145 = arg2.anInt6147;
			arg2.anInt6068 = arg1;
			arg2.anInt6136 = 0;
			arg2.anInt6080 = 0;
			arg2.anInt6089 = 1;
			arg2.anInt6091 = 0;
			arg2.anInt6117 = arg0;
			if (arg2.anInt6068 != -1) {
				Static374.method5106(arg2 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg2.anInt6091, arg2.aByte86, Static269.aClass10_1.method286(arg2.anInt6068), arg2.anInt6062, arg2.anInt6061);
			}
		}
	}
}
