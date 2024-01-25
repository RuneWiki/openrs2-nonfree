import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
	public static final int[] anIntArray422 = new int[14];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[S)[S")
	public static short[] method5006(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static598.method1136(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!pn;)V")
	public static void method5010(@OriginalArg(1) Class2_Sub10 arg0) {
		if (arg0.aClass2_Sub7_5 != null) {
			arg0.aClass2_Sub7_5.anInt6606 = 0;
		}
		arg0.aBoolean329 = false;
		for (@Pc(26) Class2_Sub10 local26 = arg0.method3360(); local26 != null; local26 = arg0.method3364()) {
			method5010(local26);
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method5011() {
		Static393.method5764();
		Static261.aClass363_230 = null;
		Static497.aClass363_245 = null;
		Static329.aClass363_162 = null;
		Static94.anInt1996 = 0;
		Static65.anInt1500 = 0;
		Static183.anInt3799 = 0;
		Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
		Static359.aClass363_174 = null;
		Static479.method6780();
		Static567.method7705();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local30] = null;
		}
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 = null;
		for (@Pc(44) int local44 = 0; local44 < Static31.anInt820; local44++) {
			@Pc(51) Class6_Sub1_Sub1_Sub1_Sub1 local51 = Static223.aClass2_Sub32Array1[local44].aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (local51 != null) {
				local51.anInt7339 = -1;
			}
		}
		Static135.method2304();
		Static311.anInt5570 = 1;
		Static94.anInt2006 = -1;
		Static238.anInt4482 = -1;
		Static121.method1780(10);
		for (@Pc(78) int local78 = 0; local78 < 100; local78++) {
			Static295.aBooleanArray36[local78] = true;
		}
		Static257.method4012();
		Static407.aLong197 = 0L;
		Static36.aClass2_Sub47_1 = null;
	}
}
