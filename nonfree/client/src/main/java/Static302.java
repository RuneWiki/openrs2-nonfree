import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public static int anInt4872 = 0;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static int anInt4877 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!dk;I)V")
	public static void method3971(@OriginalArg(0) Class54 arg0) {
		Static129.anInt2330 = arg0.method1102("p11_full");
		Static224.anInt3665 = arg0.method1102("p12_full");
		Static314.anInt5421 = arg0.method1102("b12_full");
		Static355.anInt6510 = arg0.method1102("hitmarks");
		Static409.anInt6680 = arg0.method1102("hitbar_default");
		Static348.anInt5916 = arg0.method1102("timerbar_default");
		Static120.anInt2214 = arg0.method1102("headicons_pk");
		Static108.anInt2054 = arg0.method1102("headicons_prayer");
		Static296.anInt4823 = arg0.method1102("hint_headicons");
		Static383.anInt6325 = arg0.method1102("hint_mapmarkers");
		Static390.anInt6831 = arg0.method1102("mapflag");
		Static306.anInt5284 = arg0.method1102("cross");
		Static99.anInt1891 = arg0.method1102("mapdots");
		Static440.anInt7084 = arg0.method1102("scrollbar");
		Static68.anInt4930 = arg0.method1102("name_icons");
		Static114.anInt2118 = arg0.method1102("floorshadows");
		Static284.anInt4625 = arg0.method1102("compass");
		Static84.anInt1559 = arg0.method1102("otherlevel");
		Static12.anInt170 = arg0.method1102("hint_mapedge");
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBI)I")
	public static int method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static345.aClass162Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 7;
		@Pc(20) int local20 = arg0 >> 7;
		if (local16 < 0 || local20 < 0 || Static166.anInt2852 - 1 < local16 || Static426.anInt6923 - 1 < local20) {
			return 0;
		}
		@Pc(46) int local46 = arg2;
		if (arg2 < 3 && (Static253.aByteArrayArrayArray11[1][local16][local20] & 0x2) != 0) {
			local46 = arg2 + 1;
		}
		return Static345.aClass162Array3[local46].ca(arg1, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public static int method3976(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I")
	public static int method3977() {
		if (Static336.aClass16_18 == null) {
			if (!Static126.aBoolean52 && Static137.anInt6647 > 0) {
				if (Static245.aBoolean275 && Static218.aClass181_1.method3865(81) && Static137.anInt6647 > 2) {
					return ((Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263.aClass2_263).anInt7285;
				}
				return ((Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263).anInt7285;
			}
			@Pc(43) int local43 = Static376.aClass203_1.method4918();
			@Pc(47) int local47 = Static376.aClass203_1.method4925();
			@Pc(49) int local49 = Static275.anInt4524;
			@Pc(51) int local51 = Static253.anInt4058;
			@Pc(53) int local53 = Static246.anInt3972;
			if (local43 > local49 && local49 + local53 > local43) {
				@Pc(67) int local67 = -1;
				@Pc(86) int local86;
				for (@Pc(69) int local69 = 0; local69 < Static137.anInt6647; local69++) {
					if (Static285.aBoolean329) {
						local86 = local51 + (Static137.anInt6647 - (local69 + 1)) * 16 + 33;
						if (local86 - 13 < local47 && local47 <= local86 + 3) {
							local67 = local69;
						}
					} else {
						local86 = (Static137.anInt6647 - local69 - 1) * 16 + local51 + 31;
						if (local47 > local86 - 13 && local86 + 3 >= local47) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local86 = 0;
					@Pc(151) Class32 local151 = new Class32(Static261.aClass156_13);
					for (@Pc(156) Class2_Sub46 local156 = (Class2_Sub46) local151.method668(); local156 != null; local156 = (Class2_Sub46) local151.method667()) {
						if (local86++ == local67) {
							return local156.anInt7285;
						}
					}
				}
			}
		}
		return -1;
	}
}
