import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
	public static int anInt3172 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)Lclient!cr;")
	public static Class41 method2564(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static450.aClass41ArrayArray2[local15] == null || Static450.aClass41ArrayArray2[local15][local19] == null) {
			@Pc(33) boolean local33 = Static29.method411(local15);
			if (!local33) {
				return null;
			}
		}
		return Static450.aClass41ArrayArray2[local15][local19];
	}
}
