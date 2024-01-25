import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!in", name = "R", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!in", name = "S", descriptor = "Lclient!di;")
	public static final Class54 aClass54_48 = new Class54(17, 8);

	@OriginalMember(owner = "client!in", name = "T", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)V")
	public static void method2700(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub5_Sub13 local14 = Static208.method3306(arg0, 9);
		local14.method4545();
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(IB)Lclient!em;")
	public static Class68 method2704(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static60.aClass68ArrayArray1[local7] == null || Static60.aClass68ArrayArray1[local7][local17] == null) {
			@Pc(31) boolean local31 = Static16.method318(local7);
			if (!local31) {
				return null;
			}
		}
		return Static60.aClass68ArrayArray1[local7][local17];
	}
}
