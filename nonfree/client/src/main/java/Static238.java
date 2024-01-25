import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public static int anInt4508;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "Lclient!tf;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_48 = new Class215(3, -1);

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public static int anInt4506 = 0;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
	public static int anInt4511 = 0;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	public static void method3543() {
		if (Static335.anIntArray423 != null) {
			return;
		}
		Static335.anIntArray423 = new int[65536];
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
				@Pc(76) float local76 = local64 - (float) local67;
				@Pc(83) float local83 = (1.0F - local45) * local54;
				@Pc(92) float local92 = (1.0F - local76 * local45) * local54;
				@Pc(103) float local103 = local54 * (1.0F - local45 * (1.0F - local76));
				if (local71 == 0) {
					local60 = local83;
					local58 = local103;
					local56 = local54;
				} else if (local71 == 1) {
					local58 = local54;
					local60 = local83;
					local56 = local92;
				} else if (local71 == 2) {
					local56 = local83;
					local58 = local54;
					local60 = local103;
				} else if (local71 == 3) {
					local60 = local54;
					local58 = local92;
					local56 = local83;
				} else if (local71 == 4) {
					local56 = local103;
					local60 = local54;
					local58 = local83;
				} else if (local71 == 5) {
					local60 = local92;
					local56 = local54;
					local58 = local83;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(193) int local193 = (int) (local56 * 256.0F);
				@Pc(198) int local198 = (int) (local58 * 256.0F);
				@Pc(203) int local203 = (int) (local60 * 256.0F);
				@Pc(217) int local217 = local203 + (local193 << 16) + (local198 << 8) - 16777216;
				Static335.anIntArray423[local21++] = local217;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3544(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static429.method5476(Static416.aClass215_92);
		Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg0) + 1);
		Static3.aClass4_Sub12_Sub1_5.method2521(arg1);
		Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!ya;IIII)Lclient!t;")
	public static Class110 method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class110 local12 = (Class110) Static182.aClass68_19.method1787(local6);
		if (local12 == null) {
			@Pc(22) Class122 local22 = Static370.method4948(Static357.aClass76_82, arg0);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt3681 < 13) {
				local22.method3039();
			}
			local12 = arg2.method4254(local22, 2055, Static314.anInt5475, 64, 768);
			Static182.aClass68_19.method1779(local6, local12);
		}
		local12 = local12.method4887((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.Q(arg4);
		}
		if (arg1 != 0) {
			local12.Z(arg1);
		}
		if (arg3 != 0) {
			local12.R(arg3);
		}
		if (arg5 != 0) {
			local12.JA(0, arg5, 0);
		}
		return local12;
	}
}
