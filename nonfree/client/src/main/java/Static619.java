import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_69 = new Class74(16);

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
	public static int anInt9777 = -1;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
	public static int anInt9779 = 0;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZLclient!ml;)V")
	public static void method8521(@OriginalArg(1) Class75_Sub3 arg0) {
		@Pc(21) byte[] local21;
		if (Static71.anObject1 == null) {
			@Pc(14) Class8_Sub2_Sub1 local14 = new Class8_Sub2_Sub1();
			local21 = local14.method6905();
			Static71.anObject1 = Static263.method4529(local21);
		}
		if (Static178.anObject22 == null) {
			@Pc(32) Class8_Sub1_Sub2 local32 = new Class8_Sub1_Sub2();
			local21 = local32.method5661();
			Static178.anObject22 = Static263.method4529(local21);
		}
		@Pc(47) Class41 local47 = arg0.aClass41_1;
		if (local47.method563() && Static544.anObject23 == null) {
			local21 = Static599.method5107(0.5F, new Class11_Sub1(419684), 16.0F, 4.0F, 4.0F, 0.6F);
			Static544.anObject23 = Static263.method4529(local21);
		}
	}
}
