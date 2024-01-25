import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public static int method5967(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lclient!lda;")
	public static Class205 method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass205_4;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZ)V")
	public static void method5969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static59.method1093(arg1, arg0);
	}
}
