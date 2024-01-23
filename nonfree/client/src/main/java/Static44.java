import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!de", name = "E", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "I")
	public static int anInt1341;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
	public static int anInt1333 = 0;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "Lclient!ki;")
	public static Class1_Sub17 aClass1_Sub17_1 = new Class1_Sub17(0, 0);

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "[I")
	public static int[] anIntArray101 = new int[128];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!ql;)Lclient!jl;")
	public static Class25_Sub2 method925(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class25_Sub2(arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1773(), arg0.method1772());
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILjava/lang/String;I)I")
	public static int method937(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) int local26 = 0;
		@Pc(28) boolean local28 = false;
		@Pc(36) int local36 = arg1.length();
		@Pc(38) boolean local38 = false;
		for (@Pc(40) int local40 = 0; local40 < local36; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local38 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local46 >= '0' && local46 <= '9') {
				local78 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local78 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local78 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local78 >= arg0) {
				throw new NumberFormatException();
			}
			if (local38) {
				local78 = -local78;
			}
			@Pc(124) int local124 = local78 + arg0 * local26;
			if (local124 / arg0 != local26) {
				throw new NumberFormatException();
			}
			local26 = local124;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local26;
	}
}
