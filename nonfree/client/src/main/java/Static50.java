import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Lclient!ns;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Lclient!f;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "Lclient!f;")
	public static Class78 aClass78_5;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
	public static final int[] anIntArray44 = new int[14];

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!ko;")
	public static Class142 aClass142_9 = new Class142();

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray21 = new int[2][][];

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[B")
	public static byte[] method691(@OriginalArg(0) int arg0) {
		@Pc(20) Class1_Sub1_Sub15 local20 = (Class1_Sub1_Sub15) Static217.aClass116_1.method2530((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static19.method243(local53, local31);
				@Pc(62) byte local62 = local25[local58];
				local25[local58] = local25[local53];
				local25[local53] = local25[511 - local46] = local62;
			}
			local20 = new Class1_Sub1_Sub15(local25);
			Static217.aClass116_1.method2526(local20, (long) arg0);
		}
		return local20.aByteArray82;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIBI)V")
	public static void method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static370.method5894(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(77) int local77;
		if (arg4 >= Static357.anInt6537 && Static85.anInt1517 >= arg4) {
			@Pc(45) int[] local45 = Static283.anIntArrayArray30[arg4];
			local53 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - arg1);
			local61 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg1 + arg3);
			local69 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - local15);
			local77 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local15 + arg3);
			Static23.method323(local45, local53, arg2, local69);
			Static23.method323(local45, local69, arg5, local77);
			Static23.method323(local45, local77, arg2, local61);
		}
		@Pc(97) int local97 = -1;
		while (local10 < local21) {
			local31 += 2;
			local97 += 2;
			local29 += local97;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static304.anIntArray394[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(235) int local235;
			@Pc(243) int local243;
			@Pc(251) int local251;
			@Pc(258) int[] local258;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local53 = arg4 - local21;
				local61 = local21 + arg4;
				if (Static357.anInt6537 <= local61 && local53 <= Static85.anInt1517) {
					if (local15 <= local21) {
						local69 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 + local10);
						local77 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - local10);
						if (local61 <= Static85.anInt1517) {
							Static23.method323(Static283.anIntArrayArray30[local61], local77, arg2, local69);
						}
						if (local53 >= Static357.anInt6537) {
							Static23.method323(Static283.anIntArrayArray30[local53], local77, arg2, local69);
						}
					} else {
						local69 = Static304.anIntArray394[local21];
						local77 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 + local10);
						local235 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - local10);
						local243 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 + local69);
						local251 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - local69);
						if (local61 <= Static85.anInt1517) {
							local258 = Static283.anIntArrayArray30[local61];
							Static23.method323(local258, local235, arg2, local251);
							Static23.method323(local258, local251, arg5, local243);
							Static23.method323(local258, local243, arg2, local77);
						}
						if (local53 >= Static357.anInt6537) {
							local258 = Static283.anIntArrayArray30[local53];
							Static23.method323(local258, local235, arg2, local251);
							Static23.method323(local258, local251, arg5, local243);
							Static23.method323(local258, local243, arg2, local77);
						}
					}
				}
			}
			local53 = arg4 - local10;
			local61 = arg4 + local10;
			if (local61 >= Static357.anInt6537 && Static85.anInt1517 >= local53) {
				local69 = arg3 + local21;
				local77 = arg3 - local21;
				if (Static47.anInt762 <= local69 && local77 <= Static60.anInt1086) {
					local69 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local69);
					local77 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local77);
					if (local10 < local15) {
						local235 = local26 < local10 ? Static304.anIntArray394[local10] : local26;
						local243 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local235 + arg3);
						local251 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg3 - local235);
						if (Static85.anInt1517 >= local61) {
							local258 = Static283.anIntArrayArray30[local61];
							Static23.method323(local258, local77, arg2, local251);
							Static23.method323(local258, local251, arg5, local243);
							Static23.method323(local258, local243, arg2, local69);
						}
						if (local53 >= Static357.anInt6537) {
							local258 = Static283.anIntArrayArray30[local53];
							Static23.method323(local258, local77, arg2, local251);
							Static23.method323(local258, local251, arg5, local243);
							Static23.method323(local258, local243, arg2, local69);
						}
					} else {
						if (Static85.anInt1517 >= local61) {
							Static23.method323(Static283.anIntArrayArray30[local61], local77, arg2, local69);
						}
						if (local53 >= Static357.anInt6537) {
							Static23.method323(Static283.anIntArrayArray30[local53], local77, arg2, local69);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public static void method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static228.anInt3921 == 1) {
			Static257.method3642(Static241.aClass1_Sub3_2, arg1, arg0);
		} else if (Static228.anInt3921 == 2) {
			Static393.method5337(arg1, arg0);
		}
		Static228.anInt3921 = 0;
		Static241.aClass1_Sub3_2 = null;
	}
}
