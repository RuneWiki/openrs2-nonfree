import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_223 = new Class184(34, 6);

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
	public static int method4962(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4964(@OriginalArg(0) String arg0) {
		if (!Static59.aBoolean111) {
			return;
		}
		@Pc(8) boolean local8 = false;
		@Pc(10) int local10 = Static207.anInt4136;
		@Pc(12) int[] local12 = Static322.anIntArray436;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) Class1_Sub3_Sub3_Sub1 local21 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local12[local14]];
			if (local21 != null && Static113.aClass1_Sub3_Sub3_Sub1_4 != local21 && local21.aString47 != null && local21.aString47.equalsIgnoreCase(arg0)) {
				Static414.method5552(Static293.aClass92_108);
				Static302.aClass3_Sub2_Sub2_2.method6002(local12[local14]);
				Static302.aClass3_Sub2_Sub2_2.method6045(Static455.anInt5935);
				Static302.aClass3_Sub2_Sub2_2.method5995(0);
				Static302.aClass3_Sub2_Sub2_2.method6008(Static295.anInt5382);
				Static302.aClass3_Sub2_Sub2_2.method5996(Static207.anInt4138);
				local8 = true;
				Static454.method6065(local21.method4831(), 0, true, local21.method4831(), local21.anIntArray454[0], local21.anIntArray453[0], 0, -2);
				break;
			}
		}
		if (!local8) {
			Static206.method3380(Static84.aClass175_59.method4201(Static216.anInt4257) + arg0);
		}
		if (Static59.aBoolean111) {
			Static31.method766();
		}
	}
}
