import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Lclient!ac;")
	public static Class5 aClass5_39;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_55 = new Class307(64);

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!us;")
	public static final Class344 aClass344_128 = new Class344(47, 3);

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_154 = new Class218(12, 3);

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "[B")
	public static final byte[] aByteArray107 = new byte[520];

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	public static int anInt10532 = 0;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
	public static void method8651() {
		if (Static186.anInt4413 <= 0) {
			Static197.aString45 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static457.aStringArray34.length; local11++) {
			if (Static457.aStringArray34[local11].indexOf("--> ") != -1) {
				@Pc(23) int local23 = ~Static186.anInt4413;
				local9++;
				if (local23 == ~local9) {
					Static197.aString45 = Static457.aStringArray34[local11].substring(Static457.aStringArray34[local11].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!nl;)Lclient!nl;")
	public static Class3_Sub7_Sub5 method8652(@OriginalArg(1) Class3_Sub7_Sub5 arg0) {
		@Pc(14) Class3_Sub7_Sub5 local14 = arg0 == null ? new Class3_Sub7_Sub5() : new Class3_Sub7_Sub5(arg0);
		local14.method6012();
		return local14;
	}
}
