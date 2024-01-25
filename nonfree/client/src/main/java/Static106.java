import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_34 = new Class47(8, 7);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)I")
	public static int method1907(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub49 local14 = Static84.method1640(arg0, false);
		if (local14 == null) {
			return Static134.aClass169_1.method4257(arg0).anInt8305;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local14.anIntArray697.length; local28++) {
			if (local14.anIntArray697[local28] == -1) {
				local26++;
			}
		}
		return local26 + Static134.aClass169_1.method4257(arg0).anInt8305 - local14.anIntArray697.length;
	}
}
