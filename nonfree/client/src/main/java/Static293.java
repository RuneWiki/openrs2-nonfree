import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!as;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!gg;", line = 127)
	public static Class2_Sub2_Sub7 method5414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub2_Sub7 local15 = (Class2_Sub2_Sub7) Class198.aClass4_109.method90((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class2_Sub2_Sub7(arg0, arg1);
			Class198.aClass4_109.method87(local15, local15.aLong232);
		}
		return local15;
	}
}
