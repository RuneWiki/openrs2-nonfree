import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "Lclient!sja;")
	public static final Class321 aClass321_2 = new Class321(false);

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Lclient!sja;")
	public static Class321 aClass321_3 = aClass321_2;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIZ)I")
	public static int method8966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class3_Sub24 local15 = Static640.method8894(arg1, arg2);
		if (local15 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local15.anIntArray306.length; local28++) {
				if (local15.anIntArray307[local28] == arg0) {
					local26 += local15.anIntArray306[local28];
				}
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)V")
	public static void method8968(@OriginalArg(1) int arg0) {
		Static361.anInt5827 = arg0;
		Static590.anInt9485 = -1;
		Static88.anInt1725 = -1;
		Static496.method7118();
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
	public static boolean method8970() {
		if (Static343.aClass3_Sub11_Sub14_3 == null) {
			return false;
		} else {
			if (Static343.aClass3_Sub11_Sub14_3.anInt6738 >= 2000) {
				Static343.aClass3_Sub11_Sub14_3.anInt6738 -= 2000;
			}
			return Static343.aClass3_Sub11_Sub14_3.anInt6738 == 1001;
		}
	}
}
