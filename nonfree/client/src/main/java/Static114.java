import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString132 = "";

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt2298 = 2;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!wf;")
	public static Class189 method1814(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static188.aClass189ArrayArray115[local7] == null || Static188.aClass189ArrayArray115[local7][local19] == null) {
			@Pc(34) boolean local34 = Static79.method1364(local7);
			if (!local34) {
				return null;
			}
		}
		return Static188.aClass189ArrayArray115[local7][local19];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lclient!jc;")
	public static Class4_Sub3_Sub12 method1816(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub3_Sub12 local16 = (Class4_Sub3_Sub12) Static194.aClass40_14.method889((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static171.aClass58_74.method1372(11, arg0);
		local16 = new Class4_Sub3_Sub12();
		if (local28 != null) {
			local16.method1993(new Class4_Sub10(local28));
		}
		Static194.aClass40_14.method888((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!qa;")
	public static Class143 method1817(@OriginalArg(1) int arg0) {
		@Pc(6) Class143 local6 = (Class143) Static293.aClass26_56.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static235.aClass58_85.method1372(3, arg0);
		local6 = new Class143();
		if (local27 != null) {
			local6.method3533(new Class4_Sub10(local27));
		}
		Static293.aClass26_56.method510(local6, (long) arg0);
		return local6;
	}
}
