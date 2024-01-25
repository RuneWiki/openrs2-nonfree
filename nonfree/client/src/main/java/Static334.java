import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
	public static int anInt6173;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_38 = new Class340(4);

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "[I")
	public static final int[] anIntArray356 = new int[4096];

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)Z")
	public static boolean method5126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static68.method928(arg1, arg0) || Static135.method2404(arg0, arg1);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!pi;I)V")
	public static void method5129(@OriginalArg(0) Class28_Sub7 arg0) {
		arg0.aClass28_Sub1_17 = null;
		@Pc(10) int local10 = arg0.aClass28_Sub9Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass28_Sub9Array1[local12].aBoolean890 = false;
		}
		@Pc(25) Class156[] local25 = Class358.aClass156Array1;
		synchronized (Class358.aClass156Array1) {
			if (Class358.aClass156Array1.length > local10 && Static43.anIntArray34[local10] < 200) {
				Class358.aClass156Array1[local10].method3774(arg0);
				@Pc(48) int local48 = Static43.anIntArray34[local10]++;
			}
		}
	}
}
