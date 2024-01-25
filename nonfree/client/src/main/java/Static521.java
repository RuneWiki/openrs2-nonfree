import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_221 = new Class150(28, -1);

	@OriginalMember(owner = "client!vq", name = "T", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_147 = new Class40("M", "M", "M", "M");

	@OriginalMember(owner = "client!vq", name = "kb", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_78 = new Class99();

	@OriginalMember(owner = "client!vq", name = "wb", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_42 = new Class42(64);

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(III)V")
	public static void method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass15_Sub5_1 != null) {
			local7.aClass15_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZI)V")
	public static void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) Class5_Sub24 local15 = Static459.method6391(arg0, arg1);
		if (local15 != null) {
			local15.method7425();
		}
	}
}
