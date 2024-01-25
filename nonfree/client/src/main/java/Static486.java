import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lclient!faa;")
	public static final Class95 aClass95_7 = new Class95();

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)Lclient!cn;")
	public static Class5_Sub2_Sub7 method6736() {
		@Pc(15) Class5_Sub2_Sub7 local15 = (Class5_Sub2_Sub7) Static241.aClass187_6.method4805();
		if (local15 != null) {
			local15.method7425();
			local15.method7323();
			return local15;
		}
		do {
			local15 = (Class5_Sub2_Sub7) Static77.aClass187_7.method4805();
			if (local15 == null) {
				return null;
			}
			if (local15.method1326() > Static105.method2132()) {
				return null;
			}
			local15.method7425();
			local15.method7323();
		} while ((local15.aLong252 & Long.MIN_VALUE) == 0L);
		return local15;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZII)Z")
	public static boolean method6739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static388.method5701(arg1, arg0) || Static378.method5659(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static376.method5638(arg0, arg1);
		}
	}
}
