import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!bw;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	public static int anInt4889 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)V")
	public static void method4113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(18, (long) arg0 << 32 | (long) arg1);
		local14.method7288();
	}
}
