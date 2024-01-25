import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
	public static int anInt5384;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IILclient!ij;II[I)Lclient!sd;")
	public static Class1_Sub3 method4712(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(22) int local22;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg2.method8293(Static210.aClass104_18, Static638.aClass381_15)) {
			@Pc(20) int[] local20 = new int[arg1 * arg3];
			for (local22 = 0; local22 < arg1; local22++) {
				local33 = local22 * arg3 + arg4[local22];
				for (local35 = 0; local35 < arg0[local22]; local35++) {
					local20[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg2, arg3, arg1, local20);
		}
		@Pc(69) byte[] local69 = new byte[arg1 * arg3];
		for (local22 = 0; local22 < arg1; local22++) {
			local33 = local22 * arg3 + arg4[local22];
			for (local35 = 0; local35 < arg0[local22]; local35++) {
				local69[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg2, arg3, arg1, local69);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class333 local13 = local7.aClass333_1; local13 != null; local13 = local13.aClass333_3) {
			@Pc(17) Class16_Sub1_Sub1 local17 = local13.aClass16_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort103 == arg1 && local17.aShort106 == arg2) {
				Static136.method2506(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIZ)Lclient!lk;")
	public static Class2_Sub31 method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub31 local5 = null;
		if (arg2 == 0) {
			local5 = Static275.method4480(Static640.aClass314_2, Static281.aClass145_85);
		}
		if (arg2 == 1) {
			local5 = Static275.method4480(Static640.aClass314_2, Static227.aClass145_67);
		}
		local5.aClass2_Sub17_Sub1_2.method2824(Static185.aClass221_1.method8050(82) ? 1 : 0);
		local5.aClass2_Sub17_Sub1_2.method2870(Static406.anInt6899 + arg0);
		local5.aClass2_Sub17_Sub1_2.method2889(arg1 + Static338.anInt5885);
		Static520.aBoolean607 = false;
		Static375.anInt6459 = arg0;
		Static583.anInt9512 = arg1;
		Static580.method8047();
		return local5;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	public static void method4716() {
		if (Static476.anIntArray555 != null) {
			return;
		}
		Static476.anIntArray555 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(42) float local42 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(59) float local59 = (float) local53 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local42 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = (1.0F - local51) * local59;
				@Pc(97) float local97 = local59 * (1.0F - local51 * local82);
				@Pc(107) float local107 = local59 * (1.0F - local51 * (1.0F - local82));
				if (local76 == 0) {
					local65 = local89;
					local61 = local59;
					local63 = local107;
				} else if (local76 == 1) {
					local65 = local89;
					local63 = local59;
					local61 = local97;
				} else if (local76 == 2) {
					local61 = local89;
					local65 = local107;
					local63 = local59;
				} else if (local76 == 3) {
					local61 = local89;
					local65 = local59;
					local63 = local97;
				} else if (local76 == 4) {
					local63 = local89;
					local65 = local59;
					local61 = local107;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local97;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local17);
				local63 = (float) Math.pow((double) local63, local17);
				local65 = (float) Math.pow((double) local65, local17);
				@Pc(190) int local190 = (int) (local61 * 256.0F);
				@Pc(195) int local195 = (int) (local63 * 256.0F);
				@Pc(200) int local200 = (int) (local65 * 256.0F);
				@Pc(213) int local213 = (local195 << 8) + (local190 << 16) + local200 - 16777216;
				Static476.anIntArray555[local19++] = local213;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
	public static void method4717() {
		for (@Pc(6) Class2_Sub7_Sub20 local6 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local6 != null; local6 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
			if (local6.anInt9985 > 1) {
				local6.anInt9985 = 0;
				Static585.aClass69_64.method1917(((Class2_Sub7_Sub21) local6.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66).aLong261, local6);
				local6.aClass290_13.method6675();
			}
		}
		Static471.anInt7593 = 0;
		Static633.anInt10265 = 0;
		Static177.aClass114_19.method2768();
		Static5.aClass323_2.method7485();
		Static515.aClass290_7.method6675();
		Static625.method8669(Static256.aClass2_Sub7_Sub21_2);
	}
}
