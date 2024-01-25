import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Lclient!rl;")
	public static Class319 aClass319_2;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Lclient!tb;")
	public static Class49 aClass49_38;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "Lclient!ng;")
	public static Class6_Sub17_Sub4 aClass6_Sub17_Sub4_4;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_194 = new Class322(56, -2);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)Lclient!fu;")
	public static Class123 method8832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass123_5;
	}
}
