import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!xa;")
	public static Class66 aClass66_7;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_9 = new Class181(78, 8);

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_18 = new Class254(113, 4);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lclient!ht;")
	public static Class6_Sub4_Sub6 method1021() {
		@Pc(8) Class6_Sub4_Sub6 local8 = (Class6_Sub4_Sub6) Static227.aClass143_2.method3839();
		if (local8 != null) {
			local8.method8151();
			local8.method8035();
			return local8;
		}
		do {
			local8 = (Class6_Sub4_Sub6) Static279.aClass143_3.method3839();
			if (local8 == null) {
				return null;
			}
			if (local8.method3827() > Static174.method3502()) {
				return null;
			}
			local8.method8151();
			local8.method8035();
		} while ((Long.MIN_VALUE & local8.aLong247) == 0L);
		return local8;
	}
}
