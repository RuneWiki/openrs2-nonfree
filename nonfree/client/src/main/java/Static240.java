import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_64 = new Class218(15, 1);

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt4425 = 0;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[Lclient!kb;")
	public static Class182[] aClass182Array1 = new Class182[50];

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt4426 = 0;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!or;")
	public static Class260 aClass260_11 = null;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!ur;")
	public static final Class356 aClass356_4 = new Class356();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4034(@OriginalArg(0) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static82.aBoolean134) {
			local7 = Static31.method748();
			local9 = Static147.method2738();
		}
		arg0.KA(local7, local9, Static312.anInt5191 + local7, local9 + 350);
		arg0.aa(local7, local9, Static312.anInt5191, 350, Static165.anInt10047 << 24 | 0x332277, 1);
		Static642.method8919(local7 + Static312.anInt5191, local9 + 350, local9, local7);
		@Pc(62) int local62 = 350 / Static603.anInt9670;
		@Pc(71) int local71;
		if (Static643.anInt10191 > 0) {
			local71 = 346 - Static603.anInt9670 - 4;
			@Pc(81) int local81 = local62 * local71 / (Static643.anInt10191 + local62 - 1);
			@Pc(83) int local83 = 4;
			if (Static643.anInt10191 > 1) {
				local83 = (Static643.anInt10191 - Static449.anInt7419 - 1) * (-local81 + local71) / (Static643.anInt10191 - 1) + 4;
			}
			arg0.aa(Static312.anInt5191 + local7 - 16, local9 - -local83, 12, local81, Static165.anInt10047 << 24 | 0x332277, 2);
			for (@Pc(127) int local127 = Static449.anInt7419; local127 < Static449.anInt7419 + local62 && Static643.anInt10191 > local127; local127++) {
				@Pc(136) String[] local136 = Static644.method8957(Static605.aStringArray33[local127], '\b');
				@Pc(145) int local145 = (Static312.anInt5191 - 8 - 16) / local136.length;
				for (@Pc(147) int local147 = 0; local147 < local136.length; local147++) {
					@Pc(155) int local155 = local145 * local147 + 8;
					arg0.KA(local7 + local155, local9, local145 + local7 + local155 - 8, local9 + 350);
					Static504.aClass69_11.method8862(local9 + 350 - Static186.anInt3783 - Static253.aClass88_19.anInt2731 - (-Static449.anInt7419 + local127) * Static603.anInt9670 - 2, -16777216, Static311.method4738(local136[local147]), -1, local155 + local7);
				}
			}
		}
		Static400.aClass69_9.method8847(-1, "Build: 649", -16777216, local7 + Static312.anInt5191 - 25, local9 - 20 + 350);
		arg0.KA(local7, local9, Static312.anInt5191 + local7, local9 + 350);
		arg0.method8493(local9 + 350 - Static186.anInt3783, local7, -1, Static312.anInt5191);
		Static303.aClass69_6.method8862(local9 + 350 - Static59.aClass88_1.anInt2731 - 1, -16777216, "--> " + Static311.method4738(Static153.aString28), -1, local7 + 10);
		if (!Static633.aBoolean766) {
			return;
		}
		local71 = -1;
		if (Static588.anInt9467 % 30 > 15) {
			local71 = 16777215;
		}
		arg0.method8482(12, local7 + Static59.aClass88_1.method2502("--> " + Static311.method4738(Static153.aString28).substring(0, Static369.anInt5956)) + 10, local9 + -11 - (Static59.aClass88_1.anInt2731 + -350), local71);
	}
}
