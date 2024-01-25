import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public static int anInt8571;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_84 = new Class243(13, 8);

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public static int anInt8570 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILclient!hca;)V")
	public static void method7156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub1 arg2) {
		if (arg2.anInt5051 == arg1 && arg1 != -1) {
			@Pc(86) Class4 local86 = Static396.aClass157_2.method3745(arg1);
			@Pc(89) int local89 = local86.anInt123;
			if (local89 == 1) {
				arg2.anInt5037 = 0;
				arg2.anInt5094 = arg0;
				arg2.anInt5029 = 1;
				arg2.anInt5028 = 0;
				arg2.anInt5080 = 0;
				Static250.method3962(arg2.anInt5080, arg2.anInt7659, arg2.aByte90, local86, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg2, arg2.anInt7660);
			}
			if (local89 == 2) {
				arg2.anInt5028 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt5051 == -1 || Static396.aClass157_2.method3745(arg1).anInt128 >= Static396.aClass157_2.method3745(arg2.anInt5051).anInt128) {
			arg2.anInt5094 = arg0;
			arg2.anInt5037 = 0;
			arg2.anInt5080 = 0;
			arg2.anInt5051 = arg1;
			arg2.anInt5105 = arg2.anInt5102;
			arg2.anInt5029 = 1;
			arg2.anInt5028 = 0;
			if (arg2.anInt5051 != -1) {
				Static250.method3962(arg2.anInt5080, arg2.anInt7659, arg2.aByte90, Static396.aClass157_2.method3745(arg2.anInt5051), arg2 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg2.anInt7660);
			}
		}
	}
}
