import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public static int anInt8365;

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "Lclient!ru;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
	public static int anInt8371;

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
	public static int anInt8364 = 0;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_268 = new Class194(117, 3);

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)V")
	public static void method7218() {
		Static614.aClass136_71.method3132(5);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!ni;Z)V")
	public static void method7219(@OriginalArg(0) Class9_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anIntArray670 == null && arg0.anIntArray667 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray670.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray670 != null) {
				local20 = arg0.anIntArray670[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(78) int local78;
				@Pc(90) int local90;
				@Pc(57) int local57;
				if ((-1073741824 & local20) == -1073741824) {
					local57 = local20 & 0xFFFFFFF;
					@Pc(61) int local61 = local57 >> 14;
					@Pc(65) int local65 = local57 & 0x3FFF;
					local78 = arg0.anInt10152 - (local61 - Static427.anInt7462) * 512 - 256;
					local90 = arg0.anInt10158 - (local65 - Static22.anInt329) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(106) Class3_Sub43 local106 = (Class3_Sub43) Static545.aClass25_40.method426((long) local20);
					if (local106 == null) {
						arg0.method8622(local16, -1);
						continue;
					}
					@Pc(111) Class9_Sub2_Sub1_Sub2_Sub2 local111 = local106.aClass9_Sub2_Sub1_Sub2_Sub2_2;
					local90 = arg0.anInt10158 - local111.anInt10158;
					local78 = arg0.anInt10152 - local111.anInt10152;
				} else {
					local57 = local20 & 0x7FFF;
					@Pc(142) Class9_Sub2_Sub1_Sub2_Sub1 local142 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local57];
					if (local142 == null) {
						arg0.method8622(local16, -1);
						continue;
					}
					local78 = arg0.anInt10152 - local142.anInt10152;
					local90 = arg0.anInt10158 - local142.anInt10158;
				}
				if (local78 != 0 || local90 != 0) {
					arg0.method8622(local16, (int) (Math.atan2((double) local78, (double) local90) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method8622(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray667 = null;
			arg0.anIntArray670 = null;
		}
	}
}
