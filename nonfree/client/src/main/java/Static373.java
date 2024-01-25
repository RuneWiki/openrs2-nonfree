import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_335 = new Class12(31, 1);

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public static int anInt6744 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	public static void method5286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub1_Sub1 local13 = Static190.method3007(arg3, 10);
		local13.method32();
		local13.anInt35 = arg2;
		local13.anInt32 = arg0;
		local13.anInt39 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public static void method5287() {
		Static276.aClass229ArrayArray1 = new Class229[Static2.aClass109_1.method2324()][];
		Static423.aClass229ArrayArray2 = new Class229[Static2.aClass109_1.method2324()][];
		Static65.aBooleanArray5 = new boolean[Static2.aClass109_1.method2324()];
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!qg;B)V")
	public static void method5288(@OriginalArg(0) Class121_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static98.anObject3 == null) {
			@Pc(9) Class107_Sub2_Sub1 local9 = new Class107_Sub2_Sub1();
			local16 = local9.method2840();
			Static98.anObject3 = Static230.method3356(local16);
		}
		if (Static239.anObject6 == null) {
			@Pc(27) Class107_Sub1_Sub1 local27 = new Class107_Sub1_Sub1();
			local16 = local27.method2093();
			Static239.anObject6 = Static230.method3356(local16);
		}
		@Pc(42) Class188 local42 = arg0.aClass188_1;
		if (local42.method4068() && Static262.anObject10 == null) {
			local16 = Static158.method2500(16.0F, 0.6F, 4.0F, new Class68_Sub1(419684), 4.0F, 0.5F);
			Static262.anObject10 = Static230.method3356(local16);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!tn;Z)V")
	public static void method5289(@OriginalArg(0) Class229 arg0) {
		if (Static260.anInt5254 == arg0.anInt6930) {
			Static204.aBooleanArray15[arg0.anInt6938] = true;
		}
	}
}
