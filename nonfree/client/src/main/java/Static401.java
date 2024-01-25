import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "Lclient!qd;")
	public static Class190 aClass190_9;

	@OriginalMember(owner = "client!uf", name = "T", descriptor = "[Lclient!na;")
	public static Class64[] aClass64Array3;

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_256 = new Class184(72, 10);

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
	public static final int[] anIntArray495 = new int[32];

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!tu;ILclient!qa;)V")
	public static void method5433(@OriginalArg(2) Class229 arg0, @OriginalArg(4) Class75 arg1) {
		Static316.aClass229_35.method5326();
		if (Static33.aBoolean86) {
			return;
		}
		for (@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) arg0.method5328(); local23 != null; local23 = (Class3_Sub8) arg0.method5325()) {
			@Pc(31) Class223 local31 = Static210.aClass61_4.method1426(local23.anInt1157);
			if (Static293.method2803(local31)) {
				@Pc(43) boolean local43 = Static327.method4766(arg1, local23, local31);
				if (local43) {
					Static284.method4172(local31, arg1, local23);
				}
			}
		}
	}
}
