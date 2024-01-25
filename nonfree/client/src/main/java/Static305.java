import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
	public static long aLong169;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "S")
	public static short aShort66 = 256;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt5655 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method4693(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(9, arg0);
		local8.method517();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method4695(@OriginalArg(0) Class30 arg0) {
		if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != Static455.anInt7776 && (Static294.aClass162ArrayArrayArray2 != null && Static51.method1123(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, arg0))) {
			Static455.anInt7776 = Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method4696() {
		@Pc(7) int local7 = Static402.anInt7091;
		@Pc(9) int[] local9 = Static144.anIntArray244;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class11_Sub5_Sub2_Sub1 local27 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local9[local19]];
			if (local27 != null && local27.anInt6531 > 0) {
				local27.anInt6531--;
				if (local27.anInt6531 == 0) {
					local27.aString56 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static77.anInt1870; local54++) {
			@Pc(61) long local61 = (long) Static2.anIntArray1[local54];
			@Pc(67) Class4_Sub44 local67 = (Class4_Sub44) Static80.aClass96_8.method2797(local61);
			if (local67 != null) {
				@Pc(72) Class11_Sub5_Sub2_Sub2 local72 = local67.aClass11_Sub5_Sub2_Sub2_2;
				if (local72.anInt6531 > 0) {
					local72.anInt6531--;
					if (local72.anInt6531 == 0) {
						local72.aString56 = null;
					}
				}
			}
		}
	}
}
