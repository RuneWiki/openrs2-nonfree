import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_12 = new Class140(8, 1);

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_37 = new Class303(57, 4);

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Lclient!qg;")
	public static final Class272 aClass272_7 = new Class272("LOCAL", 4);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIB)I")
	public static int method2796(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub45 local14 = Static162.method826(arg0, false);
		if (local14 == null) {
			return Static112.aClass157_1.method3677(arg0).anInt3181;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local14.anIntArray511.length; local28++) {
			if (local14.anIntArray511[local28] == -1) {
				local26++;
			}
		}
		return local26 + Static112.aClass157_1.method3677(arg0).anInt3181 - local14.anIntArray511.length;
	}
}
