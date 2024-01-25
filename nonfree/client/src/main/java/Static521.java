import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_225 = new Class156(31, -2);

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_98 = new Class168(64);

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_226 = new Class156(96, 6);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!rda;[Lclient!ih;)V")
	public static void method9167(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class5_Sub12[] arg1) {
		@Pc(6) int local6;
		if (Static342.aBoolean380) {
			local6 = arg0.method8349(arg1);
			Static44.aClass100_1.method8609(local6, arg1);
		}
		if (Static77.aClass84Array1 == Static177.aClass84Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class4_Sub1_Sub1) {
				local6 = ((Class4_Sub1_Sub1) arg0).aShort104;
				local28 = ((Class4_Sub1_Sub1) arg0).aShort105;
			} else {
				local6 = arg0.anInt9805 >> Static314.anInt5377;
				local28 = arg0.anInt9803 >> Static314.anInt5377;
			}
			Static44.aClass100_1.EA(Static668.aClass84Array4[0].method7625(arg0.anInt9805, arg0.anInt9803), Static368.method5493(local6, local28), Static317.method4844(local6, local28), Static97.method1522(local6, local28));
		}
		@Pc(64) Class4_Sub6 local64 = arg0.method8355(Static44.aClass100_1);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean688) {
			@Pc(74) Class4_Sub8[] local74 = local64.aClass4_Sub8Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class4_Sub8 local81 = local74[local76];
				if (local81.aBoolean558) {
					Static395.method5811(local81.anInt8405 - local81.anInt8407, local81.anInt8406 + local81.anInt8407, local81.anInt8404 + local81.anInt8407, local81.anInt8408 - local81.anInt8407);
				}
			}
		}
		if (local64.aBoolean352) {
			local64.aClass4_Sub1_13 = arg0;
			if (Static205.aBoolean259) {
				@Pc(127) Class321 local127 = Static605.aClass321_3;
				synchronized (Static605.aClass321_3) {
					Static605.aClass321_3.method7355((byte) -78, local64);
					return;
				}
			}
			Static605.aClass321_3.method7355((byte) -128, local64);
			return;
		}
		Static474.method6691(local64);
	}
}
