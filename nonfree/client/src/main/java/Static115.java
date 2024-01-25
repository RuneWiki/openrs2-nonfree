import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!bj;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!lk;II)V")
	public static void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt5051 && arg0 != -1) {
			@Pc(19) Class4 local19 = Static396.aClass157_2.method3745(arg0);
			@Pc(22) int local22 = local19.anInt123;
			if (local22 == 1) {
				arg1.anInt5094 = arg2;
				arg1.anInt5037 = 0;
				arg1.anInt5029 = 1;
				arg1.anInt5028 = 0;
				arg1.anInt5080 = 0;
				Static250.method3962(arg1.anInt5080, arg1.anInt7659, arg1.aByte90, local19, false, arg1.anInt7660);
			}
			if (local22 == 2) {
				arg1.anInt5028 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt5051 == -1 || Static396.aClass157_2.method3745(arg0).anInt128 >= Static396.aClass157_2.method3745(arg1.anInt5051).anInt128) {
			arg1.anInt5080 = 0;
			arg1.anInt5037 = 0;
			arg1.anInt5029 = 1;
			arg1.anInt5051 = arg0;
			arg1.anInt5105 = arg1.anInt5102;
			arg1.anInt5094 = arg2;
			arg1.anInt5028 = 0;
			if (arg1.anInt5051 == -1) {
				return;
			}
			Static250.method3962(arg1.anInt5080, arg1.anInt7659, arg1.aByte90, Static396.aClass157_2.method3745(arg1.anInt5051), false, arg1.anInt7660);
		}
	}
}
