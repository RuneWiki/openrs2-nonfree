import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "[I")
	public static int[] anIntArray338 = new int[1];

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_95 = new Class268(19, -2);

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "Lclient!fw;")
	public static final Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
	public static int anInt5609 = -1;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!bs;B)I")
	public static int method4932(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt1202;
		@Pc(12) Class201 local12 = arg0.method4911();
		if (arg0.anInt5571 == -1 || arg0.aBoolean375) {
			local8 = arg0.anInt1217;
		} else if (arg0.anInt5571 == local12.anInt6319 || arg0.anInt5571 == local12.anInt6339 || arg0.anInt5571 == local12.anInt6334 || local12.anInt6324 == arg0.anInt5571) {
			local8 = arg0.anInt1193;
		} else if (local12.anInt6338 == arg0.anInt5571 || arg0.anInt5571 == local12.anInt6350 || local12.anInt6317 == arg0.anInt5571 || arg0.anInt5571 == local12.anInt6337) {
			local8 = arg0.anInt1209;
		}
		return local8;
	}
}
