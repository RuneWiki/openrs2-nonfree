import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "Lclient!mf;")
	public static Class1_Sub19_Sub4 aClass1_Sub19_Sub4_2;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_50 = new Class179(19, 8);

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)Lclient!qj;")
	public static Class20 method3710() {
		try {
			return (Class20) Class.forName("Class20_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ug;)V")
	public static void method3711(@OriginalArg(0) Class243 arg0) {
		if (Static54.anInt1001 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub31 local6 = arg0.aClass1_Sub31_2;
		Static124.aClass243Array5[Static54.anInt1001] = arg0;
		Static294.aBooleanArray49[Static54.anInt1001] = false;
		Static54.anInt1001++;
		@Pc(21) int local21 = arg0.anInt6518;
		if (arg0.aBoolean446) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6518;
		if (arg0.aBoolean445) {
			local29 = Static68.anInt1553 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5904() + Static69.anInt1593 - local6.method5910() >> Static31.anInt665;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5904() + local6.method5910() - Static69.anInt1593 >> Static31.anInt665;
			if (local73 >= Static87.anInt1875) {
				local73 = Static87.anInt1875 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray112[local41++];
				@Pc(105) int local105 = (local6.method5906() + Static69.anInt1593 - local6.method5910() >> Static31.anInt665) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static132.anInt2639) {
					local113 = Static132.anInt2639 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static61.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static61.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static54.anInt1001;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static61.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static54.anInt1001 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static61.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static54.anInt1001 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static61.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static54.anInt1001 << 48;
					}
				}
			}
		}
	}
}
