import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!ni;")
	public static Class223 aClass223_139;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_185 = new Class73(83, 20);

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)Lclient!uca;")
	public static Class6_Sub48 method8414() {
		if (Static491.aClass163_49 == null || Static60.aClass171_4 == null) {
			return null;
		}
		for (@Pc(16) Class6_Sub48 local16 = (Class6_Sub48) Static60.aClass171_4.method5091(); local16 != null; local16 = (Class6_Sub48) Static60.aClass171_4.method5091()) {
			@Pc(32) Class36 local32 = Static491.aClass345_4.method8044(local16.anInt9722);
			if (local32 != null && local32.aBoolean140 && local32.method1623(Static491.anInterface6_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBII)V")
	public static void method8419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class6_Sub5_Sub19 local10 = Static348.method5721(arg2, 11);
		local10.method5179();
		local10.anInt6198 = arg1;
		local10.anInt6195 = arg0;
	}
}
