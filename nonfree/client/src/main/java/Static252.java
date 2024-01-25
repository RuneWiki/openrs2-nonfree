import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_98 = new Class211(39, 4);

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	public static int anInt4057 = -2;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class270 local28 = Static309.aClass270ArrayArrayArray3[local9][arg0][arg1] = Static309.aClass270ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte102--;
				for (@Pc(40) Class241 local40 = local28.aClass241_2; local40 != null; local40 = local40.aClass241_1) {
					@Pc(44) Class3_Sub4 local44 = local40.aClass3_Sub4_2;
					if (local44.aShort92 == arg0 && local44.aShort89 == arg1) {
						local44.aByte91--;
					}
				}
			}
		}
		if (Static309.aClass270ArrayArrayArray3[0][arg0][arg1] == null) {
			Static309.aClass270ArrayArrayArray3[0][arg0][arg1] = new Class270(0, arg0, arg1);
			Static309.aClass270ArrayArrayArray3[0][arg0][arg1].aByte105 = 1;
		}
		Static309.aClass270ArrayArrayArray3[0][arg0][arg1].aClass270_1 = local7;
		Static309.aClass270ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIBI)V")
	public static void method3198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg2; local15 <= arg3; local15++) {
			Static216.method2862(arg1, arg0, arg4, Static229.anIntArrayArray26[local15]);
		}
	}
}
