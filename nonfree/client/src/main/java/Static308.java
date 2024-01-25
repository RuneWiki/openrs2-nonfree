import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_77 = new Class376(84, 8);

	@OriginalMember(owner = "client!kha", name = "g", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_101 = new Class126(52, -2);

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
	public static int anInt5687 = 0;

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
	public static int anInt5688 = -1;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z")
	public static boolean method4733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)Z")
	public static boolean method4736() {
		try {
			if (Static54.anInt1418 == 2) {
				if (Static261.aClass3_Sub48_1 == null) {
					Static261.aClass3_Sub48_1 = Static688.method7521(Static548.aClass143_125, Static335.anInt6114, Static399.anInt5283);
					if (Static261.aClass3_Sub48_1 == null) {
						return false;
					}
				}
				if (Static417.aClass91_1 == null) {
					Static417.aClass91_1 = new Class91(Static272.aClass143_65, Static311.aClass143_78);
				}
				@Pc(34) Class3_Sub9_Sub5 local34 = Static402.aClass3_Sub9_Sub5_2;
				if (Static424.aClass3_Sub9_Sub5_3 != null) {
					local34 = Static424.aClass3_Sub9_Sub5_3;
				}
				if (local34.method6724(Static261.aClass3_Sub48_1, Static417.aClass91_1, Static136.aClass143_35)) {
					Static402.aClass3_Sub9_Sub5_2 = local34;
					Static402.aClass3_Sub9_Sub5_2.method6733();
					@Pc(65) int local65;
					if (Static618.anInt9578 <= 0) {
						Static54.anInt1418 = 0;
						Static402.aClass3_Sub9_Sub5_2.method6705(Static231.anInt4426);
						for (local65 = 0; local65 < Static426.anIntArray450.length; local65++) {
							Static402.aClass3_Sub9_Sub5_2.method6713(Static426.anIntArray450[local65], local65);
							Static426.anIntArray450[local65] = 255;
						}
					} else {
						Static54.anInt1418 = 3;
						Static402.aClass3_Sub9_Sub5_2.method6705(Static231.anInt4426 >= Static618.anInt9578 ? Static618.anInt9578 : Static231.anInt4426);
						for (local65 = 0; local65 < Static426.anIntArray450.length; local65++) {
							Static402.aClass3_Sub9_Sub5_2.method6713(Static426.anIntArray450[local65], local65);
							Static426.anIntArray450[local65] = 255;
						}
					}
					if (Static424.aClass3_Sub9_Sub5_3 == null) {
						if (Static437.aLong214 <= 0L) {
							Static402.aClass3_Sub9_Sub5_2.method6709(Static230.aBoolean341, Static261.aClass3_Sub48_1);
						} else {
							Static402.aClass3_Sub9_Sub5_2.method6739(Static437.aLong214, Static261.aClass3_Sub48_1, Static230.aBoolean341);
						}
					}
					if (Static256.aClass232_3 != null) {
						Static256.aClass232_3.method8514(Static402.aClass3_Sub9_Sub5_2);
					}
					Static424.aClass3_Sub9_Sub5_3 = null;
					Static548.aClass143_125 = null;
					Static417.aClass91_1 = null;
					Static261.aClass3_Sub48_1 = null;
					Static437.aLong214 = 0L;
					return true;
				}
			}
		} catch (@Pc(157) Exception local157) {
			local157.printStackTrace();
			Static402.aClass3_Sub9_Sub5_2.method6732();
			Static261.aClass3_Sub48_1 = null;
			Static548.aClass143_125 = null;
			Static424.aClass3_Sub9_Sub5_3 = null;
			Static54.anInt1418 = 0;
			Static417.aClass91_1 = null;
		}
		return false;
	}
}
