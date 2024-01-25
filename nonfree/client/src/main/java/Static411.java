import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!uu", name = "Q", descriptor = "Lclient!fe;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "[I")
	public static final int[] anIntArray619 = new int[5];

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_243 = new Class186(108, 8);

	@OriginalMember(owner = "client!uu", name = "S", descriptor = "I")
	public static final int anInt7007 = 328;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZ)I")
	public static int method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = ((arg1 & 0xFF00FF) * local12 & 0xFF00FF00 | local12 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local35 + ((local17 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local17 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
