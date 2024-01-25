import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
	public static int anInt10585 = 0;

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_133 = new Class100(26, 2);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BZ)V")
	public static void method8821(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static498.aClass14_Sub3_Sub16_3 != null) {
			Static217.anInt4095 = Static498.aClass14_Sub3_Sub16_3.anInt9283;
		} else {
			Static217.anInt4095 = -1;
		}
		Static156.anInt3087 = 0;
		Static498.aClass14_Sub3_Sub16_3 = null;
		Static289.aClass230_3 = null;
		Static461.aClass262_48 = null;
		Static498.method7304();
		Static498.aClass262_60.method6316();
		Static367.anInt6812 = -1;
		Static157.anInt3118 = -1;
		Static222.aClass124_6 = null;
		Static656.aClass20_36 = null;
		Static498.aClass294_2 = null;
		Static358.aClass124_7 = null;
		Static218.aClass124_5 = null;
		Static177.aClass124_4 = null;
		Static104.aClass124_1 = null;
		Static625.aClass124_8 = null;
		Static115.aClass124_2 = null;
		Static125.aClass124_3 = null;
		if (Static498.aClass116_4 != null) {
			Static498.aClass116_4.method2786();
			Static498.aClass116_4.method2789(128, 64);
		}
		if (Static498.aClass83_5 != null) {
			Static498.aClass83_5.method2076(64, 64);
		}
		if (Static498.aClass13_5 != null) {
			Static498.aClass13_5.method85(64);
		}
		Static427.aClass225_1.method5330(64);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)[I")
	public static int[] method8822() {
		return new int[] { Static45.anInt1109, Static335.anInt6336, Static602.anInt10183 };
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!so;)Lclient!tv;")
	public static Class14_Sub1 method8824(@OriginalArg(1) Class14_Sub29 arg0) {
		arg0.method5866();
		@Pc(21) int local21 = arg0.method5866();
		@Pc(25) Class14_Sub1 local25 = Static659.method9126(local21);
		local25.anInt10667 = arg0.method5866();
		@Pc(34) int local34 = arg0.method5866();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method5866();
			local25.method8903(arg0, local42);
		}
		local25.method8899();
		return local25;
	}
}
