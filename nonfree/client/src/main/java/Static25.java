import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Lclient!daa;")
	public static Class3_Sub7_Sub5 method343() {
		@Pc(8) Class3_Sub7_Sub5 local8 = (Class3_Sub7_Sub5) Static193.aClass363_57.method8414();
		if (local8 != null) {
			local8.method8682();
			local8.method7907();
			return local8;
		}
		do {
			local8 = (Class3_Sub7_Sub5) Static285.aClass363_42.method8414();
			if (local8 == null) {
				return null;
			}
			if (local8.method1478() > Static191.method3071()) {
				return null;
			}
			local8.method8682();
			local8.method7907();
		} while ((Long.MIN_VALUE & local8.aLong251) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z")
	public static boolean method344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static270.method4507(arg0, arg1) | (arg1 & 0x70000) != 0 || Static282.method4597(arg1, arg0);
	}
}
