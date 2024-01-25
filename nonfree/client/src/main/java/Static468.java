import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!saa", name = "M", descriptor = "Lclient!r;")
	public static Class44 aClass44_7;

	@OriginalMember(owner = "client!saa", name = "O", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!saa", name = "x", descriptor = "[I")
	public static final int[] anIntArray108 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!saa", name = "D", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_33 = new Class173(65, 0);

	@OriginalMember(owner = "client!saa", name = "N", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_55 = new Class362(85, 6);

	@OriginalMember(owner = "client!saa", name = "P", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_34 = new Class173(0, 8);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZIIZ)I")
	public static int method2270(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub18 local10 = Static72.method6564(false, arg0);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10.anIntArray144.length; local26++) {
			if (local10.anIntArray144[local26] >= 0 && Static521.aClass273_2.anInt8075 > local10.anIntArray144[local26]) {
				@Pc(55) Class242 local55 = Static521.aClass273_2.method6712(local10.anIntArray144[local26]);
				@Pc(65) int local65 = local55.method5896(Static484.aClass313_2.method7381(arg2).anInt3103, arg2);
				if (arg1) {
					local16 += local10.anIntArray143[local26] * local65;
				} else {
					local16 += local65;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILclient!n;)Ljava/lang/String;")
	public static String method2271(@OriginalArg(0) int arg0, @OriginalArg(2) Class225 arg1) {
		if (!Static69.method1180(arg1).method128(arg0) && arg1.anObjectArray7 == null) {
			return null;
		} else if (arg1.aStringArray40 == null || arg0 >= arg1.aStringArray40.length || arg1.aStringArray40[arg0] == null || arg1.aStringArray40[arg0].trim().length() == 0) {
			return Static57.aBoolean43 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray40[arg0];
		}
	}
}
