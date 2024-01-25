import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!tc;")
	public static Class343 aClass343_7;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_37 = new Class352(4);

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!tu;")
	public static final Class356 aClass356_8 = new Class356(0);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method3850(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public static void method3859() {
		Static141.anInt2583 = -1;
		Static306.anInt4811 = 1;
		if (Static420.aString78 == null) {
			Static97.method1973(35);
		} else {
			@Pc(28) Class4_Sub11 local28 = new Class4_Sub11(Static85.method1765(Static483.method6617(Static420.aString78)));
			@Pc(32) long local32 = local28.method8830();
			Static238.aLong116 = local28.method8830();
			Static395.method2777(Static414.method5217(local32), false, true, "");
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public static void method3864() {
		if (Static84.anIntArray114 != null) {
			return;
		}
		Static84.anIntArray114 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(83) float local83 = local54 * (1.0F - local45);
				@Pc(92) float local92 = (1.0F - local77 * local45) * local54;
				@Pc(103) float local103 = local54 * (1.0F - (1.0F - local77) * local45);
				if (local71 == 0) {
					local58 = local103;
					local60 = local83;
					local56 = local54;
				} else if (local71 == 1) {
					local60 = local83;
					local56 = local92;
					local58 = local54;
				} else if (local71 == 2) {
					local56 = local83;
					local58 = local54;
					local60 = local103;
				} else if (local71 == 3) {
					local60 = local54;
					local56 = local83;
					local58 = local92;
				} else if (local71 == 4) {
					local60 = local54;
					local58 = local83;
					local56 = local103;
				} else if (local71 == 5) {
					local56 = local54;
					local60 = local92;
					local58 = local83;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(194) int local194 = (int) (local56 * 256.0F);
				@Pc(199) int local199 = (int) (local58 * 256.0F);
				@Pc(204) int local204 = (int) (local60 * 256.0F);
				@Pc(216) int local216 = local204 + (local194 << 16) + (local199 << 8) - 16777216;
				Static84.anIntArray114[local21++] = local216;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	public static int method3870() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = hd.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local17.length; local26++) {
			@Pc(32) Field local32 = local17[local26];
			if (vg.class.isAssignableFrom(local32.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}
}
