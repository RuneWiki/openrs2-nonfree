import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!th", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray50 = new String[8];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!qa;Lclient!vh;)V")
	public static void method5275(@OriginalArg(1) Class109 arg0, @OriginalArg(2) Class250 arg1) {
		if (Static244.aBoolean299) {
			return;
		}
		arg0.M(0);
		Static337.aClass80_21 = arg0.method4684(Static459.method3747(arg1, Static409.anInt7172));
		Static337.aClass80_21.method6099((Static207.anInt3842 - Static337.aClass80_21.ja()) / 2, (Static255.anInt4574 - Static337.aClass80_21.JA()) / 2);
		Static424.aClass80_19 = arg0.method4684(Static459.method3747(arg1, Static285.anInt7834));
		Static424.aClass80_19.method6099((Static207.anInt3842 - Static424.aClass80_19.ja()) / 2, 18);
		Static244.aBoolean299 = true;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)[Lclient!tk;")
	public static Class225[] method5276() {
		return new Class225[] { Static321.aClass225_18, Static454.aClass225_26, Static349.aClass225_3, Static360.aClass225_23, Static280.aClass225_15, Static337.aClass225_25, Static359.aClass225_22, Static274.aClass225_14, Static165.aClass225_11, Static105.aClass225_8, Static391.aClass225_24, Static294.aClass225_20, Static85.aClass225_6, Static57.aClass225_1 };
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
	public static void method5277(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class1 local9 = Static427.aClass27_41.method555(); local9 != null; local9 = Static427.aClass27_41.method563()) {
			if ((long) arg0 == (local9.aLong227 >> 48 & 0xFFFFL)) {
				local9.method6071();
			}
		}
	}
}
