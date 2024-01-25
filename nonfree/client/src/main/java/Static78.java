import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!jt;")
	public static Class37 aClass37_8;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[Lclient!tq;")
	public static Class6_Sub8[] aClass6_Sub8Array5;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static int anInt9031 = 0;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public static int anInt9033 = -1;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
	public static final int[] anIntArray655 = new int[4];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method7554() {
		if (Static558.aClass258_7 != Static207.aClass258_3) {
			try {
				Static602.method6577("tbrefresh", Static413.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kp;BLclient!kp;)V")
	public static void method7562(@OriginalArg(0) Class196 arg0, @OriginalArg(2) Class196 arg1) {
		@Pc(17) Class2_Sub42 local17 = Static249.method3910(Static76.aClass286_28, Static400.aClass145_2);
		local17.aClass2_Sub15_Sub2_2.method4288(arg1.anInt5112);
		local17.aClass2_Sub15_Sub2_2.method4290(arg1.anInt5154);
		local17.aClass2_Sub15_Sub2_2.method4290(arg0.anInt5152);
		local17.aClass2_Sub15_Sub2_2.method4330(arg0.anInt5154);
		local17.aClass2_Sub15_Sub2_2.method4350(arg1.anInt5152);
		local17.aClass2_Sub15_Sub2_2.method4296(arg0.anInt5112);
		Static531.method7296(local17);
	}
}
