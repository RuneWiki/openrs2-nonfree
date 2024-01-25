import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
	public static int anInt7021;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!sr;ZI)V")
	public static void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) Class26_Sub2_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt7046 && arg2 != -1) {
			@Pc(74) Class139 local74 = Static364.aClass151_2.method3293(arg2);
			@Pc(77) int local77 = local74.anInt3937;
			if (local77 == 1) {
				arg1.anInt7074 = 0;
				arg1.anInt7076 = 1;
				arg1.anInt7050 = 0;
				arg1.anInt7061 = 0;
				arg1.anInt7069 = arg0;
				Static454.method5772(local74, false, arg1.anInt7383, arg1.aByte102, arg1.anInt7388, arg1.anInt7061);
			}
			if (local77 == 2) {
				arg1.anInt7074 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt7046 == -1 || Static364.aClass151_2.method3293(arg2).anInt3953 >= Static364.aClass151_2.method3293(arg1.anInt7046).anInt3953) {
			arg1.anInt7061 = 0;
			arg1.anInt7076 = 1;
			arg1.anInt7074 = 0;
			arg1.anInt7069 = arg0;
			arg1.anInt7050 = 0;
			arg1.anInt7116 = arg1.anInt7117;
			arg1.anInt7046 = arg2;
			if (arg1.anInt7046 != -1) {
				Static454.method5772(Static364.aClass151_2.method3293(arg1.anInt7046), false, arg1.anInt7383, arg1.aByte102, arg1.anInt7388, arg1.anInt7061);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I")
	public static int method5486(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
