import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kba", name = "qd", descriptor = "I")
	public static final int anInt4929 = 0;

	@OriginalMember(owner = "client!kba", name = "Qd", descriptor = "[I")
	public static final int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!kba", name = "Rd", descriptor = "[I")
	public static int[] anIntArray301 = new int[1];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Lclient!ia;")
	public static Class20_Sub2_Sub2 method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub2_1;
	}
}
