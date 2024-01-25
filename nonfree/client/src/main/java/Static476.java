import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!wv;")
	public static Class365 aClass365_15 = null;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_146 = new Class319(69, 8);

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
	public static final int[] anIntArray532 = new int[200];

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_191 = new Class81(99, 7);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method6701() {
		if (Static341.anIntArray409 != null) {
			return;
		}
		Static341.anIntArray409 = new int[65536];
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
				@Pc(84) float local84 = local54 * (1.0F - local45);
				@Pc(92) float local92 = local54 * (1.0F - local77 * local45);
				@Pc(103) float local103 = (1.0F - local45 * (1.0F - local77)) * local54;
				if (local71 == 0) {
					local56 = local54;
					local60 = local84;
					local58 = local103;
				} else if (local71 == 1) {
					local58 = local54;
					local56 = local92;
					local60 = local84;
				} else if (local71 == 2) {
					local58 = local54;
					local60 = local103;
					local56 = local84;
				} else if (local71 == 3) {
					local56 = local84;
					local60 = local54;
					local58 = local92;
				} else if (local71 == 4) {
					local58 = local84;
					local60 = local54;
					local56 = local103;
				} else if (local71 == 5) {
					local58 = local84;
					local56 = local54;
					local60 = local92;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(191) int local191 = (int) (local56 * 256.0F);
				@Pc(196) int local196 = (int) (local58 * 256.0F);
				@Pc(201) int local201 = (int) (local60 * 256.0F);
				@Pc(214) int local214 = (local196 << 8) + (local191 << 16) + local201 - 16777216;
				Static341.anIntArray409[local21++] = local214;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!jca;ILclient!jca;)V")
	public static void method6702(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_285 != null) {
			arg0.method7878();
		}
		arg0.aClass1_286 = arg1;
		arg0.aClass1_285 = arg1.aClass1_285;
		arg0.aClass1_285.aClass1_286 = arg0;
		arg0.aClass1_286.aClass1_285 = arg0;
	}
}
