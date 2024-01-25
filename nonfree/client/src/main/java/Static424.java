import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "Lclient!jia;")
	public static Class172 aClass172_8;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_105 = new Class130(7, 6);

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
	public static int anInt7664 = 0;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!sl;B)Lclient!qfa;")
	public static Class274 method6641(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(7) String local7 = arg0.method4233();
		@Pc(14) Class83 local14 = Static352.method5820()[arg0.method4225()];
		@Pc(21) Class50 local21 = Static496.method2282()[arg0.method4225()];
		@Pc(25) int local25 = arg0.method4209();
		@Pc(29) int local29 = arg0.method4209();
		@Pc(33) int local33 = arg0.method4225();
		@Pc(37) int local37 = arg0.method4225();
		@Pc(41) int local41 = arg0.method4225();
		@Pc(45) int local45 = arg0.method4221();
		@Pc(49) int local49 = arg0.method4221();
		@Pc(53) int local53 = arg0.method4207();
		@Pc(57) int local57 = arg0.method4207();
		@Pc(66) int local66 = arg0.method4207();
		return new Class274(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57, local66);
	}
}
