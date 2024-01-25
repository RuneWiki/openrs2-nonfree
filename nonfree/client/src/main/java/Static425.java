import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method5879() {
		Static156.aClass21_25.method313();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
	public static void method5880() {
		@Pc(1) Class21 local1 = Static133.aClass21_19;
		synchronized (Static133.aClass21_19) {
			Static133.aClass21_19.method323(5);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBIIZII)Z")
	public static boolean method5884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0];
		@Pc(13) int local13 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0];
		if (local8 < 0 || local8 >= Static281.anInt4822 || local13 < 0 || local13 >= Static29.anInt491) {
			return false;
		} else if (arg7 >= 0 && Static281.anInt4822 > arg7 && arg3 >= 0 && arg3 < Static29.anInt491) {
			@Pc(73) int local73 = Static101.method1527(arg2, arg1, arg6, local13, Static124.anIntArray611, Static176.anIntArray220, local8, arg0, arg4, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777(), Static87.aClass362Array3[Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128], arg5, arg3, arg7);
			if (local73 < 1) {
				return false;
			}
			Static484.anInt7716 = Static176.anIntArray220[local73 - 1];
			Static143.anInt7433 = Static124.anIntArray611[local73 - 1];
			Static143.aBoolean620 = false;
			Static409.method5539();
			return true;
		} else {
			return false;
		}
	}
}
