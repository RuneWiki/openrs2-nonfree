import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Lclient!qm;")
	public static Class2_Sub5_Sub13 method2843() {
		@Pc(14) Class2_Sub5_Sub13 local14 = (Class2_Sub5_Sub13) Static109.aClass44_7.method802();
		if (local14 != null) {
			local14.method5866();
			local14.method5534();
			return local14;
		}
		do {
			local14 = (Class2_Sub5_Sub13) Static11.aClass44_1.method802();
			if (local14 == null) {
				return null;
			}
			if (local14.method4550() > Static21.method458()) {
				return null;
			}
			local14.method5866();
			local14.method5534();
		} while ((local14.aLong211 & Long.MIN_VALUE) == 0L);
		return local14;
	}
}
