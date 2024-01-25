import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "J")
	public static long aLong277;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "[I")
	public static final int[] anIntArray541 = new int[1];

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BB)Z")
	public static boolean method8259(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static439.aCharArray7[local12 - 128] != '\u0000';
		}
	}
}
