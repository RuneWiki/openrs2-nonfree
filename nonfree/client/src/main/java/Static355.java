import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public static int anInt5919 = -1;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
	public static final int[] anIntArray487 = new int[2];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int anInt5920 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B)Lclient!mp;")
	public static Class1_Sub6_Sub10 method4848(@OriginalArg(1) byte[] arg0) {
		@Pc(17) Class1_Sub6_Sub10 local17 = new Class1_Sub6_Sub10();
		@Pc(22) Class1_Sub35 local22 = new Class1_Sub35(arg0);
		local22.anInt7214 = local22.aByteArray85.length - 2;
		@Pc(33) int local33 = local22.method5771();
		@Pc(44) int local44 = local22.aByteArray85.length - local33 - 12 - 2;
		local22.anInt7214 = local44;
		@Pc(51) int local51 = local22.method5804();
		local17.anInt5635 = local22.method5771();
		local17.anInt5637 = local22.method5771();
		local17.anInt5634 = local22.method5771();
		local17.anInt5636 = local22.method5771();
		@Pc(75) int local75 = local22.method5750();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local75 > 0) {
			local17.aClass187Array1 = new Class187[local75];
			for (local83 = 0; local83 < local75; local83++) {
				local89 = local22.method5771();
				@Pc(96) Class187 local96 = new Class187(Static457.method6299(local89));
				local17.aClass187Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local22.method5804();
					@Pc(111) int local111 = local22.method5804();
					local96.method3795(new Class1_Sub13(local111), (long) local107);
				}
			}
		}
		local22.anInt7214 = 0;
		local17.aString54 = local22.method5801();
		local17.anIntArray447 = new int[local51];
		local17.anIntArray448 = new int[local51];
		local17.aStringArray26 = new String[local51];
		local83 = 0;
		while (local44 > local22.anInt7214) {
			local89 = local22.method5771();
			if (local89 == 3) {
				local17.aStringArray26[local83] = local22.method5760().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local17.anIntArray447[local83] = local22.method5750();
			} else {
				local17.anIntArray447[local83] = local22.method5804();
			}
			local17.anIntArray448[local83++] = local89;
		}
		return local17;
	}
}
