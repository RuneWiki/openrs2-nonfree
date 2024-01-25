import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "[I")
	public static final int[] anIntArray502 = new int[5];

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Lclient!bo;")
	public static Class38 method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass38_2;
	}
}
