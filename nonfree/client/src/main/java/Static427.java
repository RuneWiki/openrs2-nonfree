import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!np;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!ns;")
	public static Class166 aClass166_283;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!ud;")
	public static final Class239 aClass239_7 = new Class239("LIVE", 0);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!jb;B)V")
	public static void method5500(@OriginalArg(0) Class126 arg0) {
		@Pc(15) Class126 local15 = Static389.method5245(arg0);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local15 == null) {
			local23 = Static349.anInt6303;
			local20 = Static87.anInt1948;
		} else {
			local20 = local15.anInt3421;
			local23 = local15.anInt3442;
		}
		Static1.method32(local23, local20, false, arg0);
		Static18.method428(arg0, local20, local23);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5502() {
		@Pc(3) Class27[] local3 = Class84_Sub1.aClass27Array1;
		synchronized (Class84_Sub1.aClass27Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class84_Sub1.aClass27Array1.length; local7++) {
				Class84_Sub1.aClass27Array1[local7] = new Class27();
				Static5.anIntArray15[local7] = 0;
			}
		}
	}
}
