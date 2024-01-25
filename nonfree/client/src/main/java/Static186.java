import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!tq;")
	public static Class191 aClass191_174;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Lclient!tq;")
	public static Class191 aClass191_175;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
	public static boolean aBoolean490 = true;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public static int anInt5458 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!on;I)Lclient!on;")
	public static Class146 method4859(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4458 != -1) {
			return Static1.method16(arg0.anInt4458);
		}
		@Pc(26) int local26 = arg0.anInt4450 >>> 16;
		@Pc(31) Class21 local31 = new Class21(Static273.aClass199_25);
		for (@Pc(36) Class2_Sub8 local36 = (Class2_Sub8) local31.method740(); local36 != null; local36 = (Class2_Sub8) local31.method743()) {
			if (local26 == local36.anInt694) {
				return Static1.method16((int) local36.aLong213);
			}
		}
		return null;
	}
}
