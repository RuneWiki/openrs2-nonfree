import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_179 = new Class107(5, -1);

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_72 = new Class179(63, 2);

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
	public static final int anInt5852 = 1401;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method4869(@OriginalArg(2) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(38) char local38 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local38 == '-') {
					local24 = true;
					continue;
				}
				if (local38 == '+') {
					continue;
				}
			}
			@Pc(63) int local63;
			if (local38 >= '0' && local38 <= '9') {
				local63 = local38 - '0';
			} else if (local38 >= 'A' && local38 <= 'Z') {
				local63 = local38 - '7';
			} else if (local38 >= 'a' && local38 <= 'z') {
				local63 = local38 - 'W';
			} else {
				return false;
			}
			if (local63 >= 10) {
				return false;
			}
			if (local24) {
				local63 = -local63;
			}
			@Pc(103) int local103 = local28 * 10 + local63;
			if (local103 / 10 != local28) {
				return false;
			}
			local26 = true;
			local28 = local103;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z")
	public static boolean method4870() {
		@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262;
		if (local8 == null || local8 == Static55.aClass181_63.aClass1_179) {
			return false;
		} else {
			if (local8.anInt117 >= 2000) {
				local8.anInt117 -= 2000;
			}
			return local8.anInt117 == 1007;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method4871(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static468.method4329(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public static void method4872() {
		if (Static195.aBoolean221) {
			return;
		}
		Static121.method2191(Static18.aClass80ArrayArrayArray2);
		if (Static346.aClass80ArrayArrayArray3 != null) {
			Static121.method2191(Static346.aClass80ArrayArrayArray3);
		}
		Static195.aBoolean221 = true;
	}
}
