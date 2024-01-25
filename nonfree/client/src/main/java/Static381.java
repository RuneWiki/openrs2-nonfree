import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!saa;")
	public static Class330 aClass330_7;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[520];

	@OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
	public static final int[] anIntArray371 = new int[200];

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!si;")
	public static final Class338 aClass338_35 = new Class338(260);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject19 = null;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method5733() {
		@Pc(7) int[] local7 = Static408.anIntArray393;
		for (@Pc(9) int local9 = 0; local9 < Static558.anInt9284; local9++) {
			@Pc(17) Class19_Sub1_Sub3_Sub2_Sub2 local17 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local7[local9]];
			if (local17 != null) {
				local17.method6607();
			}
		}
		for (@Pc(30) int local30 = 0; local30 < Static337.anInt5854; local30++) {
			@Pc(39) long local39 = (long) Static101.anIntArray95[local30];
			@Pc(45) Class3_Sub13 local45 = (Class3_Sub13) Static612.aClass136_44.method3503(local39);
			if (local45 != null) {
				local45.aClass19_Sub1_Sub3_Sub2_Sub1_2.method6607();
			}
		}
		if (Static334.anInt5845 != 3) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < Static154.aClass11Array1.length; local66++) {
			@Pc(72) Class11 local72 = Static154.aClass11Array1[local66];
			if (local72.aBoolean10) {
				local72.method295().method6607();
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
	public static boolean method5735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static414.method6155(arg1, arg0) | Static597.method8214(arg0, arg1) | Static691.method9067(arg1, arg0)) & Static244.method3738(arg0, arg1);
	}
}
