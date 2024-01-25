import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "Lclient!tq;")
	public static Class191 aClass191_69;

	@OriginalMember(owner = "client!gi", name = "Z", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array5;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)Lclient!bg;")
	public static Class18 method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class12[] local17 = null;
		@Pc(21) Class99 local21 = Static207.method5566(arg2);
		if (local21.anIntArray265 != null) {
			local17 = new Class12[local21.anIntArray265.length];
			for (@Pc(31) int local31 = 0; local31 < local17.length; local31++) {
				@Pc(40) Class181 local40 = Static226.method3031(local21.anIntArray265[local31]);
				local17[local31] = new Class12(local40.anInt5778, local40.anInt5774, local40.anInt5777, local40.anInt5775, local40.anInt5788, local40.anInt5786, local40.anInt5779, local40.aBoolean514);
			}
		}
		return new Class18(local21.anInt3169, local17, local21.anInt3170, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!qr;I)V")
	public static void method2328(@OriginalArg(0) Class62_Sub1_Sub2_Sub2 arg0) {
		@Pc(11) Class2_Sub7 local11 = (Class2_Sub7) Static167.aClass199_17.method5751((long) arg0.anInt5328);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub3_Sub2_2 != null) {
			Static313.aClass2_Sub3_Sub1_2.method365(local11.aClass2_Sub3_Sub2_2);
			local11.aClass2_Sub3_Sub2_2 = null;
		}
		local11.method5945();
	}
}
