import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Lclient!ne;")
	public static Class2_Sub8_Sub14 aClass2_Sub8_Sub14_5;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "[I")
	public static int[] anIntArray392 = new int[128];

	@OriginalMember(owner = "client!il", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString132 = "flash3:";

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)Lclient!no;")
	public static Class123 method3256(@OriginalArg(1) int arg0) {
		@Pc(8) Class123 local8 = (Class123) Static203.aClass157_34.method4031((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(30) byte[] local30 = Static187.aClass42_56.method1256(32, arg0);
		local8 = new Class123();
		if (local30 != null) {
			local8.method3363(new Class2_Sub16(local30));
		}
		local8.method3362();
		Static203.aClass157_34.method4026((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static127.anInt2926 > 0) {
			Static86.method1545(Static127.anInt2926);
			Static127.anInt2926 = 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = arg1 * Static77.anInt1897;
		for (@Pc(28) int local28 = 1; local28 < 255; local28++) {
			@Pc(44) int local44 = Static263.anIntArray495[local28] * (256 - local28) / 256;
			if (local44 < 0) {
				local44 = 0;
			}
			local20 += local44;
			@Pc(57) int local57;
			for (local57 = local44; local57 < 128; local57++) {
				@Pc(65) int local65 = Static185.anIntArray528[local20++];
				@Pc(73) int local73 = Static77.anIntArray163[arg0 + local26++];
				if (local65 == 0) {
					Static136.aClass2_Sub8_Sub1_Sub1_2.anIntArray340[local22++] = local73;
				} else {
					@Pc(82) int local82 = local65 + 18;
					@Pc(89) int local89 = 256 - local65 - 18;
					if (local89 > 255) {
						local89 = 255;
					}
					local65 = Static175.anIntArray379[local65];
					if (local82 > 255) {
						local82 = 255;
					}
					Static136.aClass2_Sub8_Sub1_Sub1_2.anIntArray340[local22++] = ((local65 & 0xFF00) * local82 + local89 * (local73 & 0xFF00) & 0xFF0000) + ((local65 & 0xFF00FF) * local82 + (local89 * (local73 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			for (local57 = 0; local57 < local44; local57++) {
				Static136.aClass2_Sub8_Sub1_Sub1_2.anIntArray340[local22++] = Static77.anIntArray163[arg0 + local26++];
			}
			local26 += Static77.anInt1897 - 128;
		}
		if (Static116.aBoolean184) {
			Static111.method1882(Static136.aClass2_Sub8_Sub1_Sub1_2.anIntArray340, arg0, arg1, Static136.aClass2_Sub8_Sub1_Sub1_2.anInt5514, Static136.aClass2_Sub8_Sub1_Sub1_2.anInt5517);
		} else {
			Static136.aClass2_Sub8_Sub1_Sub1_2.method4368(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I")
	public static int method3258(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
