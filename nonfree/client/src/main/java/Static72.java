import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public static int anInt1666;

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!gj;)Lclient!nm;")
	public static Class3_Sub38 method1603(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(18) byte[] local18 = arg1.method3135(arg0);
		return local18 == null ? null : new Class3_Sub38(local18);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIZ)I")
	public static int method1604(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return local45 + (arg0 & 0xFF80);
		}
	}
}
