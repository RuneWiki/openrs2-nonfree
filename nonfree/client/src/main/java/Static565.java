import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!ft;)Ljava/lang/String;")
	public static String method7759(@OriginalArg(1) Class5_Sub2_Sub5 arg0) {
		return arg0.aString27 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)I")
	public static int method7760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static446.method6632(arg0 - 1, arg1 - 1) + Static446.method6632(arg0 - 1, arg1 + 1) + Static446.method6632(arg0 + 1, arg1 + -1) + Static446.method6632(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static446.method6632(arg0, arg1 - 1) + Static446.method6632(arg0, arg1 + 1) + Static446.method6632(arg0 - 1, arg1) + Static446.method6632(arg0 + 1, arg1);
		@Pc(83) int local83 = Static446.method6632(arg0, arg1);
		return local83 / 4 + local48 / 16 + local78 / 8;
	}
}
