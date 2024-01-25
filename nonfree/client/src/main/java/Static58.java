import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public static int anInt920;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!pi;")
	public static Class286 aClass286_16 = new Class286(72, -1);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static129.anInt2430 == arg0) {
			return;
		}
		Static362.anInt8653 = Static206.anInt11291 = Static523.anIntArray481[arg0];
		Static357.method5132();
		Static84.anIntArrayArray9 = new int[Static362.anInt8653][Static206.anInt11291];
		Static723.anIntArrayArray63 = new int[Static362.anInt8653][Static206.anInt11291];
		Static486.anIntArrayArrayArray6 = new int[4][Static362.anInt8653 >> 3][Static206.anInt11291 >> 3];
		for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
			Static678.aClass360Array5[local41] = Static555.method7788(Static362.anInt8653, Static206.anInt11291);
		}
		Static221.aByteArrayArrayArray15 = new byte[4][Static362.anInt8653][Static206.anInt11291];
		if (arg1 > -92) {
			aClass286_16 = null;
		}
		Static277.method4236(Static362.anInt8653, Static206.anInt11291);
		Static627.method8500(Static362.anInt8653 >> 3, Static488.aClass67_12, Static206.anInt11291 >> 3);
		Static129.anInt2430 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI[Lclient!av;)V")
	public static void method726(@OriginalArg(1) int arg0, @OriginalArg(2) Class20[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class20 local20 = arg1[local14];
			if (local20 != null && arg0 == local20.anInt556 && !Static87.method1183(local20)) {
				if (local20.anInt532 == 0) {
					method726(local20.anInt600, arg1);
					if (local20.aClass20Array2 != null) {
						method726(local20.anInt600, local20.aClass20Array2);
					}
					@Pc(71) Class3_Sub52 local71 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local20.anInt600);
					if (local71 != null) {
						Static601.method8272(local71.anInt10202);
					}
				}
				if (local20.anInt532 == 6 && local20.anInt538 != -1) {
					if (local20.aClass100_1 == null) {
						local20.aClass100_1 = new Class100_Sub2();
						local20.aClass100_1.method8962(local20.anInt538);
					}
					if (local20.aClass100_1.method8971(Static387.anInt6950) && local20.aClass100_1.method8959()) {
						local20.aClass100_1.method8958();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZ)Lclient!mla;")
	public static Class19_Sub8 method727(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class66[] local7 = Class3_Sub18.aClass66Array1;
		synchronized (Class3_Sub18.aClass66Array1) {
			@Pc(30) Class19_Sub8 local30;
			if (Class3_Sub18.aClass66Array1.length <= arg0 || Class3_Sub18.aClass66Array1[arg0].method1382()) {
				local30 = new Class19_Sub8();
				local30.aClass19_Sub6Array1 = new Class19_Sub6[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass19_Sub6Array1[local52] = new Class19_Sub6();
				}
			} else {
				local30 = (Class19_Sub8) Class3_Sub18.aClass66Array1[arg0].method1377();
				local30.method9359();
				@Pc(37) int local37 = Static335.anIntArray330[arg0]--;
			}
			local30.aBoolean559 = arg1;
			return local30;
		}
	}
}
