import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	public static final int[] anIntArray719 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_175 = new Class274(94, -1);

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public static int anInt10048 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method8399() {
		if (Static267.aClass86_7 != Static538.aClass86_8) {
			try {
				Static648.method3663("tbrefresh", Static181.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLclient!ak;)V")
	public static void method8401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11_Sub1_Sub1_Sub2_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static649.method4858(local6, 0, local6.length, arg1);
		Static588.method8119(arg2, local6, arg0);
	}
}
