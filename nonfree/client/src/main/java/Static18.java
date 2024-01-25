import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aja", name = "B", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!aja", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZII)I")
	public static int method457(@OriginalArg(2) int arg0) {
		@Pc(14) Class3_Sub21 local14 = Static586.method7782(arg0, false);
		if (local14 == null) {
			return Static578.aClass230_1.method5294(arg0).anInt10543;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray174.length; local26++) {
			if (local14.anIntArray174[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static578.aClass230_1.method5294(arg0).anInt10543 - local14.anIntArray174.length;
	}
}
