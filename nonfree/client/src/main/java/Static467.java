import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!or", name = "g", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array17;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_37 = new Class218(64);

	@OriginalMember(owner = "client!or", name = "d", descriptor = "[I")
	public static final int[] anIntArray539 = new int[13];

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
	public static final int[] anIntArray540 = new int[500];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)V")
	public static void method6721(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) Class2_Sub3 local17 = Static549.method7662(-120, arg1, arg0);
		if (local17 != null) {
			local17.method9872();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)V")
	public static void method6722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(13, (long) arg1);
		local9.method6239();
		local9.anInt6936 = arg0;
	}
}
