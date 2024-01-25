import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_167 = new Class359(2, -2);

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Z")
	public static boolean method6595(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!fda;I)V")
	public static void method6596(@OriginalArg(0) Class28_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anIntArray298 == null && arg0.anIntArray306 == null) {
			return;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg0.anIntArray298.length; local14++) {
			@Pc(22) int local22 = -1;
			if (arg0.anIntArray298 != null) {
				local22 = arg0.anIntArray298[local14];
			}
			if (local22 != -1) {
				local12 = false;
				@Pc(92) int local92;
				@Pc(85) int local85;
				@Pc(66) int local66;
				if ((local22 & 0xC0000000) == -1073741824) {
					local66 = local22 & 0xFFFFFFF;
					@Pc(135) int local135 = local66 >> 14;
					local92 = arg0.anInt10781 - (local135 - Static153.anInt3147) * 512 - 256;
					@Pc(151) int local151 = local66 & 0x3FFF;
					local85 = arg0.anInt10784 - (-Static201.anInt3839 + local151) * 512 - 256;
				} else if ((local22 & 0x8000) == 0) {
					@Pc(100) Class5_Sub25 local100 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local22);
					if (local100 == null) {
						arg0.method4586(local14, -1);
						continue;
					}
					@Pc(105) Class28_Sub1_Sub4_Sub2_Sub1 local105 = local100.aClass28_Sub1_Sub4_Sub2_Sub1_1;
					local85 = arg0.anInt10784 - local105.anInt10784;
					local92 = arg0.anInt10781 - local105.anInt10781;
				} else {
					local66 = local22 & 0x7FFF;
					@Pc(70) Class28_Sub1_Sub4_Sub2_Sub2 local70 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local66];
					if (local70 == null) {
						arg0.method4586(local14, -1);
						continue;
					}
					local85 = arg0.anInt10784 - local70.anInt10784;
					local92 = arg0.anInt10781 - local70.anInt10781;
				}
				if (local92 != 0 || local85 != 0) {
					arg0.method4586(local14, (int) (Math.atan2((double) local92, (double) local85) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method4586(local14, -1)) {
				local12 = false;
			}
		}
		if (local12) {
			arg0.anIntArray298 = null;
			arg0.anIntArray306 = null;
		}
	}

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)V")
	public static void method6598() {
		if (!Static535.aBoolean752) {
			Static235.aFloat91 += (-24.0F - Static235.aFloat91) / 2.0F;
			Static535.aBoolean752 = true;
			Static260.aBoolean411 = true;
		}
	}
}
