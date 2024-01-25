import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_61 = new Class208(53, 15);

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method5839() {
		for (@Pc(6) Class6_Sub2_Sub12 local6 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local6 != null; local6 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
			if (local6.anInt5417 > 1) {
				local6.anInt5417 = 0;
				Static69.aClass166_7.method4803(local6, ((Class6_Sub2_Sub4) local6.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66).aLong41);
				local6.aClass286_6.method7237();
			}
		}
		Static462.anInt8179 = 0;
		Static608.anInt10066 = 0;
		Static298.aClass8_34.method154();
		Static494.aClass128_39.method3562();
		Static603.aClass286_12.method7237();
		Static620.method8988(Static389.aClass6_Sub2_Sub4_3);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!gt;I)V")
	public static void method5840(@OriginalArg(0) Class20_Sub5 arg0) {
		arg0.aClass20_Sub2_Sub2_Sub1_1 = null;
		if (Static600.anInt10017 < 20) {
			Static403.aClass81_7.method2119(arg0);
			Static600.anInt10017++;
		}
	}
}
