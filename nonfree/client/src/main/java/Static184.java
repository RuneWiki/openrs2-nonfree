import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt3124;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public static void method2530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static27.method2039(false, local35, true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public static void method2531(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static119.aBooleanArray10[arg0]) {
			Static445.aClass54_116.method1109(arg0);
			Static151.aClass16ArrayArray1[arg0] = null;
			Static388.aClass16ArrayArray4[arg0] = null;
			Static119.aBooleanArray10[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!za;)V")
	public static void method2532(@OriginalArg(1) Class163 arg0) {
		if (Static445.anInt7140 != Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 && (Static309.aClass270ArrayArrayArray3 != null && Static196.method2638(Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91, arg0))) {
			Static445.anInt7140 = Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91;
		}
	}
}
