import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "Lclient!db;")
	public static Class3_Sub7_Sub3 aClass3_Sub7_Sub3_2;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_135 = new Class218(15, -2);

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	public static int anInt9720 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!tn;ILclient!nga;I)V")
	public static void method8030(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2) {
		@Pc(9) Class3_Sub52 local9 = new Class3_Sub52();
		local9.anInt10553 = arg0.method8401();
		local9.anInt10551 = arg0.method8402();
		local9.aClass376Array1 = new Class376[local9.anInt10553];
		local9.anIntArray634 = new int[local9.anInt10553];
		local9.anIntArray632 = new int[local9.anInt10553];
		local9.aByteArrayArrayArray19 = new byte[local9.anInt10553][][];
		local9.anIntArray633 = new int[local9.anInt10553];
		local9.aClass376Array2 = new Class376[local9.anInt10553];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt10553; local51++) {
			try {
				@Pc(59) int local59 = arg0.method8401();
				@Pc(79) String local79;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local79 = arg0.method8413();
					local85 = arg0.method8413();
					local89 = 0;
					if (local59 == 1) {
						local89 = arg0.method8402();
					}
					local9.anIntArray634[local51] = local59;
					local9.anIntArray632[local51] = local89;
					local9.aClass376Array1[local51] = arg2.method5948(Static413.method6466(local79), local85);
				} else if (local59 == 3 || local59 == 4) {
					local79 = arg0.method8413();
					local85 = arg0.method8413();
					local89 = arg0.method8401();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg0.method8413();
					}
					@Pc(113) byte[][] local113 = new byte[local89][];
					@Pc(126) int local126;
					if (local59 == 3) {
						for (@Pc(120) int local120 = 0; local120 < local89; local120++) {
							local126 = arg0.method8402();
							local113[local120] = new byte[local126];
							arg0.method8403(local126, 0, local113[local120]);
						}
					}
					local9.anIntArray634[local51] = local59;
					@Pc(155) Class[] local155 = new Class[local89];
					for (local126 = 0; local126 < local89; local126++) {
						local155[local126] = Static413.method6466(local92[local126]);
					}
					local9.aClass376Array2[local51] = arg2.method5936(local85, local155, Static413.method6466(local79));
					local9.aByteArrayArrayArray19[local51] = local113;
				}
			} catch (@Pc(234) ClassNotFoundException local234) {
				local9.anIntArray633[local51] = -1;
			} catch (@Pc(241) SecurityException local241) {
				local9.anIntArray633[local51] = -2;
			} catch (@Pc(248) NullPointerException local248) {
				local9.anIntArray633[local51] = -3;
			} catch (@Pc(255) Exception local255) {
				local9.anIntArray633[local51] = -4;
			} catch (@Pc(262) Throwable local262) {
				local9.anIntArray633[local51] = -5;
			}
		}
		Static614.aClass276_64.method6906(local9);
	}
}
