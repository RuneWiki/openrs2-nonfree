import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!hb;")
	public static final Class122 aClass122_6 = new Class122(2);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
	public static int method5919(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static261.anInt4596 - 1; local3++) {
			if (arg0 < Static574.anIntArray600[local3] + Static336.anIntArray314[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static261.anInt4596 - 1;
		}
		return local1;
	}
}
