import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array13;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_70 = new Class349(69, 5);

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_12 = new Class197(7, 0, 1, 1);

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "[I")
	public static final int[] anIntArray326 = new int[4096];

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V")
	public static void method4100() {
		Static102.aClass184_1.method6057();
		Static402.aClass138_1.method4770();
		Static255.aClient1.method1382();
		Static316.aCanvas1.setBackground(Color.black);
		Static632.anInt9753 = -1;
		Static102.aClass184_1 = Static31.method7997(Static316.aCanvas1);
		Static402.aClass138_1 = Static125.method1889(Static316.aCanvas1);
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
	public static void method4102() {
		@Pc(7) Class268 local7 = null;
		try {
			@Pc(13) Class163 local13 = Static135.aClass389_2.method9277("2");
			while (local13.anInt3843 == 0) {
				Static570.method7907(1L);
			}
			if (local13.anInt3843 == 1) {
				local7 = (Class268) local13.anObject5;
				@Pc(44) byte[] local44 = new byte[(int) local7.method6514()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local7.method6508(local44, local44.length - local46, local46);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static3.method51(new Class2_Sub20(local44));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method6511();
			}
		} catch (@Pc(99) Exception local99) {
		}
	}
}
