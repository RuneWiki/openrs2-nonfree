import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
	public static final int[] anIntArray65 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIZZ)Lclient!pc;")
	public static Class188 method1051(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class175 local10 = null;
		if (Static307.aClass85_6 != null) {
			local10 = new Class175(arg0, Static307.aClass85_6, Static166.aClass85Array1[arg0], 1000000);
		}
		Static29.aClass176_Sub1Array1[arg0] = Static451.aClass232_2.method5329(arg0, Static398.aClass175_3, local10);
		if (arg2) {
			Static29.aClass176_Sub1Array1[arg0].method5866();
		}
		return new Class188(Static29.aClass176_Sub1Array1[arg0], arg1, 1);
	}
}
