import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "[I")
	public static final int[] anIntArray657 = new int[32];

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "Lclient!gba;")
	public static final Class104 aClass104_9 = new Class104();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
	public static int method5468(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!n;Lclient!kr;I)V")
	public static void method5470(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class171 arg1) {
		Static13.anInterface8_3 = arg0;
		Static469.aClass171_151 = arg1;
	}
}
