import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!wo;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!wo;")
	public static Class216 aClass216_2;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZBIILclient!aq;)V")
	public static void method387(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12 arg3) {
		@Pc(8) int local8 = arg3.lb;
		@Pc(11) int local11 = arg3.anInt446;
		if (arg3.aByte6 == 0) {
			arg3.lb = arg3.anInt420;
		} else if (arg3.aByte6 == 1) {
			arg3.lb = arg2 - arg3.anInt420;
		} else if (arg3.aByte6 == 2) {
			arg3.lb = arg3.anInt420 * arg2 >> 14;
		}
		if (arg3.aByte3 == 0) {
			arg3.anInt446 = arg3.anInt409;
		} else if (arg3.aByte3 == 1) {
			arg3.anInt446 = arg1 - arg3.anInt409;
		} else if (arg3.aByte3 == 2) {
			arg3.anInt446 = arg1 * arg3.anInt409 >> 14;
		}
		if (arg3.aByte6 == 4) {
			arg3.lb = arg3.anInt424 * arg3.anInt446 / arg3.anInt401;
		}
		if (arg3.aByte3 == 4) {
			arg3.anInt446 = arg3.lb * arg3.anInt401 / arg3.anInt424;
		}
		if (Static185.aBoolean369 && (Static44.method1023(arg3).anInt6683 != 0 || arg3.anInt416 == 0)) {
			if (arg3.anInt446 < 5 && arg3.lb < 5) {
				arg3.lb = 5;
				arg3.anInt446 = 5;
			} else {
				if (arg3.lb <= 0) {
					arg3.lb = 5;
				}
				if (arg3.anInt446 <= 0) {
					arg3.anInt446 = 5;
				}
			}
		}
		if (arg3.anInt435 == 1337) {
			Static173.aClass12_8 = arg3;
		}
		if (arg0 && arg3.anObjectArray26 != null && (local8 != arg3.lb || local11 != arg3.anInt446)) {
			@Pc(184) Class1_Sub16 local184 = new Class1_Sub16();
			local184.anObjectArray34 = arg3.anObjectArray26;
			local184.aClass12_5 = arg3;
			Static247.aClass16_28.method416(local184);
		}
	}
}
