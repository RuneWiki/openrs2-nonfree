import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public static int anInt10628;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[Lclient!fs;")
	public static final Class124[] aClass124Array4 = new Class124[14];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8995(@OriginalArg(1) String arg0) {
		@Pc(6) Class4_Sub48 local6 = Static623.method8371();
		local6.aClass4_Sub11_Sub1_2.method8822(Static51.aClass164_11.anInt4099);
		local6.aClass4_Sub11_Sub1_2.method8838(0);
		@Pc(21) int local21 = local6.aClass4_Sub11_Sub1_2.anInt10466;
		local6.aClass4_Sub11_Sub1_2.method8838(648);
		@Pc(30) int[] local30 = Static622.method8367(local6);
		@Pc(34) int local34 = local6.aClass4_Sub11_Sub1_2.anInt10466;
		local6.aClass4_Sub11_Sub1_2.method8857(arg0);
		local6.aClass4_Sub11_Sub1_2.method8822(Static164.anInt2984);
		local6.aClass4_Sub11_Sub1_2.anInt10466 += 7;
		local6.aClass4_Sub11_Sub1_2.method8854(local34, local6.aClass4_Sub11_Sub1_2.anInt10466, local30);
		local6.aClass4_Sub11_Sub1_2.method8885(local6.aClass4_Sub11_Sub1_2.anInt10466 - local21);
		Static410.method5170(local6);
		Static105.anInt2132 = 0;
		Static373.anInt5588 = 0;
		Static87.anInt1778 = 1;
		Static393.anInt5778 = -3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!jw;I)Ljava/lang/String;")
	public static String method8997(@OriginalArg(0) Class4_Sub5_Sub12 arg0) {
		return arg0.aString45 + " <col=ffffff>>";
	}
}
