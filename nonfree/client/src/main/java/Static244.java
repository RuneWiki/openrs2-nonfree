import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_7 = null;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
	public static boolean aBoolean480 = true;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!aia;)Z")
	public static boolean method4625(@OriginalArg(1) Interface1 arg0) {
		@Pc(10) Class164 local10 = Static568.aClass315_5.method7511(arg0.method8986());
		if (local10.anInt4659 == -1) {
			return true;
		} else {
			@Pc(22) Class63 local22 = Static367.aClass365_4.method8484(local10.anInt4659);
			return local22.anInt1113 == -1 ? true : local22.method1016();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!wm;I)Lclient!ne;")
	public static Class247 method4626(@OriginalArg(2) Class390 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method8914(arg1, 0);
		return local14 == null ? null : new Class247(local14);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!uaa;ILclient!uaa;)V")
	public static void method4628(@OriginalArg(0) Class345 arg0, @OriginalArg(2) Class345 arg1) {
		@Pc(12) Class5_Sub21 local12 = Static64.method905(Static263.aClass49_1, Static223.aClass305_37);
		local12.aClass5_Sub41_Sub2_1.method7803(arg1.anInt9664);
		local12.aClass5_Sub41_Sub2_1.method7814(arg1.anInt9611);
		local12.aClass5_Sub41_Sub2_1.method7814(arg0.anInt9611);
		local12.aClass5_Sub41_Sub2_1.method7806(arg0.anInt9664);
		local12.aClass5_Sub41_Sub2_1.method7809(arg1.anInt9654);
		local12.aClass5_Sub41_Sub2_1.method7848(arg0.anInt9654);
		Static495.method7092(local12);
	}
}
