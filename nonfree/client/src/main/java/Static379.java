import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public static int anInt6781;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "Z")
	public static boolean aBoolean535 = false;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5699(@OriginalArg(0) String arg0) {
		Static140.aString44 = arg0;
		Static663.anInt10567 = Static140.aString44.length();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Z")
	public static boolean method5701() {
		return Static112.anInt2244 != 0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!gia;)V")
	public static void method5702(@OriginalArg(1) Class67_Sub2 arg0) {
		@Pc(17) byte[] local17;
		if (Static670.anObject23 == null) {
			@Pc(10) Class12_Sub1_Sub2 local10 = new Class12_Sub1_Sub2();
			local17 = local10.method8934();
			Static670.anObject23 = Static710.method9254(local17);
		}
		if (Static347.anObject13 == null) {
			@Pc(32) Class12_Sub2_Sub1 local32 = new Class12_Sub2_Sub1();
			local17 = local32.method8421();
			Static347.anObject13 = Static710.method9254(local17);
		}
		@Pc(49) Class350 local49 = arg0.aClass350_1;
		if (local49.method8300() && Static563.anObject21 == null) {
			local17 = Static543.method7618(0.6F, 16.0F, 0.5F, 4.0F, new Class34_Sub1(419684), 4.0F);
			Static563.anObject21 = Static710.method9254(local17);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[SI)[S")
	public static short[] method5703(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) short[] local12 = new short[arg1];
		Static735.method9189(arg0, 0, local12, 0, arg1);
		return local12;
	}
}
