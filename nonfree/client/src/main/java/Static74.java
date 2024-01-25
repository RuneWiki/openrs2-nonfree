import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "C")
	public static char aChar2;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILclient!nj;B)V")
	public static void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub1_Sub1_Sub1 arg2) {
		if (arg2.anInt5312 == arg0 && arg0 != -1) {
			@Pc(23) Class17 local23 = Static261.method4492(arg0);
			@Pc(26) int local26 = local23.anInt505;
			if (local26 == 1) {
				arg2.anInt5314 = 0;
				arg2.anInt5322 = 0;
				arg2.anInt5281 = 1;
				arg2.anInt5263 = arg1;
				arg2.anInt5285 = 0;
				Static207.method3696(arg2.anInt5285, arg2.anInt5769, local23, arg2.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg2);
			}
			if (local26 == 2) {
				arg2.anInt5314 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt5312 == -1 || Static261.method4492(arg0).anInt506 >= Static261.method4492(arg2.anInt5312).anInt506) {
			arg2.anInt5285 = 0;
			arg2.anInt5314 = 0;
			arg2.anInt5312 = arg0;
			arg2.anInt5263 = arg1;
			arg2.anInt5281 = 1;
			arg2.anInt5341 = arg2.anInt5337;
			arg2.anInt5322 = 0;
			if (arg2.anInt5312 == -1) {
				return;
			}
			Static207.method3696(arg2.anInt5285, arg2.anInt5769, Static261.method4492(arg2.anInt5312), arg2.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg2);
		}
	}
}
