import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z[BI)V")
	public static void method2242(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static650.aClass2_Sub8_10 == null) {
			Static650.aClass2_Sub8_10 = new Class2_Sub8(20000);
		}
		Static650.aClass2_Sub8_10.method5160(arg1, arg1.length, 0);
		if (!arg0) {
			return;
		}
		Static454.method5730(Static650.aClass2_Sub8_10.lb);
		Static604.aClass234_Sub1Array2 = new Class234_Sub1[Static78.anInt1437];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static401.anInt7422; local40 <= Static585.anInt10166; local40++) {
			@Pc(46) Class234_Sub1 local46 = Static69.method1289(local40);
			if (local46 != null) {
				Static604.aClass234_Sub1Array2[local38++] = local46;
			}
		}
		Static617.aBoolean782 = false;
		Static428.aLong218 = Static99.method1701();
		Static650.aClass2_Sub8_10 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method2243() {
		if (Static227.anInt4605 != -1) {
			Static396.method6572(-1, false, -1, Static227.anInt4605);
			Static227.anInt4605 = -1;
		}
	}
}
