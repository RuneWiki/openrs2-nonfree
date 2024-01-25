import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public static int anInt8650;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!qq;")
	public static Class269 aClass269_11;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Lclient!rd;")
	public static Class275 aClass275_4;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
	public static int method7226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static571.aShortArrayArray11 == null ? 0 : Static571.aShortArrayArray11[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!oa;Lclient!fl;IIIII)V")
	public static void method7227(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static192.anInt4157) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static396.anInt7505) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static54.anInt1441 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class224 local62 = Static256.aClass224ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static47.aClass62Array1[local17].JA(local23, local32) + Static47.aClass62Array1[local17].JA(local23 + 1, local32) + Static47.aClass62Array1[local17].JA(local23, local32 + 1) + Static47.aClass62Array1[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static47.aClass62Array1[arg2].JA(arg3, arg4) + Static47.aClass62Array1[arg2].JA(arg3 + 1, arg4) + Static47.aClass62Array1[arg2].JA(arg3, arg4 + 1) + Static47.aClass62Array1[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub4 local143 = local62.aClass11_Sub4_3;
									@Pc(146) Class11_Sub4 local146 = local62.aClass11_Sub4_2;
									if (local143 != null && local143.method8105()) {
										arg1.method8103(local1, local140, (local32 - arg4) * Static364.anInt7313 + (1 - arg6) * Static406.anInt9843, (local23 - arg3) * Static364.anInt7313 + (1 - arg5) * Static406.anInt9843, local143, arg0);
									}
									if (local146 != null && local146.method8105()) {
										arg1.method8103(local1, local140, (local32 - arg4) * Static364.anInt7313 + (1 - arg6) * Static406.anInt9843, (local23 - arg3) * Static364.anInt7313 + (1 - arg5) * Static406.anInt9843, local146, arg0);
									}
									for (@Pc(219) Class270 local219 = local62.aClass270_1; local219 != null; local219 = local219.aClass270_2) {
										@Pc(223) Class11_Sub1 local223 = local219.aClass11_Sub1_2;
										if (local223 != null && local223.method8105() && (local23 == local223.aShort78 || local23 == local3) && (local32 == local223.aShort80 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort79 + 1 - local223.aShort78;
											@Pc(260) int local260 = local223.aShort77 + 1 - local223.aShort80;
											arg1.method8103(local1, local140, (local223.aShort80 - arg4) * Static364.anInt7313 + (local260 - arg6) * Static406.anInt9843, (local223.aShort78 - arg3) * Static364.anInt7313 + (local252 - arg5) * Static406.anInt9843, local223, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
