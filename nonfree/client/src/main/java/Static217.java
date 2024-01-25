import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	public static int anInt490 = -1;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_12 = new Class256("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!bo;)V")
	public static void method319(@OriginalArg(1) Class26_Sub1 arg0) {
		@Pc(14) byte[] local14;
		if (Static397.anObject9 == null) {
			@Pc(5) Class34_Sub2_Sub1 local5 = new Class34_Sub2_Sub1();
			local14 = local5.method3809();
			Static397.anObject9 = Static320.method6040(local14);
		}
		if (Static221.anObject5 == null) {
			@Pc(37) Class34_Sub1_Sub1 local37 = new Class34_Sub1_Sub1();
			local14 = local37.method989();
			Static221.anObject5 = Static320.method6040(local14);
		}
		@Pc(54) Class10 local54 = arg0.aClass10_1;
		if (local54.method217() && Static387.anObject8 == null) {
			local14 = Static403.method5489(16.0F, 4.0F, new Class160_Sub1(419684), 4.0F, 0.6F, 0.5F);
			Static387.anObject8 = Static320.method6040(local14);
		}
	}
}
