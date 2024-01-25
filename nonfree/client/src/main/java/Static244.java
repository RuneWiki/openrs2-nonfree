import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_142 = new Class254(55, 8);

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[F")
	public static final float[] aFloatArray45 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;Lclient!hh;B)Lclient!fi;")
	public static Class84 method5752(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class109 arg2) {
		@Pc(15) int local15 = arg2.method2343(arg1);
		if (local15 == -1) {
			return new Class84(0);
		}
		@Pc(28) int[] local28 = arg2.method2341(local15);
		@Pc(34) Class84 local34 = new Class84(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local34.anInt2088 > local36) {
				@Pc(52) Class1_Sub14 local52 = new Class1_Sub14(arg2.method2349(local15, local28[local38++]));
				@Pc(56) int local56 = local52.method4500();
				@Pc(60) int local60 = local52.method4498();
				@Pc(64) int local64 = local52.method4548();
				if (!arg0 && local64 == 1) {
					local34.anInt2088--;
				} else {
					local34.anIntArray108[local36] = local56;
					local34.anIntArray109[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
	public static int method5753(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
