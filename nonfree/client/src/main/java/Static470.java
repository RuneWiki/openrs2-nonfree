import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
	public static int anInt7686 = 0;

	@OriginalMember(owner = "client!saa", name = "q", descriptor = "[I")
	public static final int[] anIntArray595 = new int[13];

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZII)I")
	public static int method6493(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub48 local14 = Static144.method2729(false, arg0);
		if (local14 == null) {
			return Static258.aClass302_1.method6511(arg0).anInt852;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray674.length; local26++) {
			if (local14.anIntArray674[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static258.aClass302_1.method6511(arg0).anInt852 - local14.anIntArray674.length;
	}
}
