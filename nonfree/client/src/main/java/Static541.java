import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_17 = new Class117(9, 6);

	@OriginalMember(owner = "client!vea", name = "w", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_111 = new Class181(64, 4);

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(III)Lclient!fj;")
	public static Class11_Sub3 method7782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_2;
	}
}
