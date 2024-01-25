import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!os", name = "i", descriptor = "Lclient!ao;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_7 = new Class147("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[2];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIII)Lclient!aj;")
	public static Class15 method6267(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class337 local11 = null;
		if (Static340.aClass344_7 != null) {
			local11 = new Class337(arg1, Static340.aClass344_7, Static538.aClass344Array1[arg1], 1000000);
		}
		Static445.aClass227_Sub1Array2[arg1] = Static180.aClass259_1.method6240(arg1, local11, Static148.aClass337_4);
		Static445.aClass227_Sub1Array2[arg1].method8077();
		return new Class15(Static445.aClass227_Sub1Array2[arg1], arg0, arg2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	public static void method6268(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static110.anInt2265 != -1) {
				Static344.method5168(Static110.anInt2265);
			}
			for (@Pc(14) Class3_Sub46 local14 = (Class3_Sub46) Static455.aClass83_31.method2375(); local14 != null; local14 = (Class3_Sub46) Static455.aClass83_31.method2370()) {
				if (!local14.method9378()) {
					local14 = (Class3_Sub46) Static455.aClass83_31.method2375();
					if (local14 == null) {
						break;
					}
				}
				Static647.method8986(false, true, local14);
			}
			Static110.anInt2265 = -1;
			Static455.aClass83_31 = new Class83(8);
			Static351.method5211();
			Static110.anInt2265 = Static397.anInt6239;
			Static198.method9275(false);
			Static540.method7765();
			Static565.method8006(Static110.anInt2265);
		}
		Static44.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6269(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
