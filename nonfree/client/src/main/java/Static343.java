import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt9291;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_137 = new Class252(45, 3);

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public static final boolean aBoolean695 = false;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	public static boolean aBoolean696 = false;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
	public static int[] anIntArray812 = new int[1];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method8033(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class1_Sub17 local17 = new Class1_Sub17(arg0);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method4499();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method4480();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(72) int local72 = local34 & 0x3F;
					@Pc(78) int local78 = local34 >> 6 & 0x3F;
					@Pc(84) int local84 = local17.method4487() >> 2;
					@Pc(89) int local89 = local78 + arg3;
					@Pc(93) int local93 = arg4 + local72;
					if (local89 > 0 && local93 > 0 && arg1 - 1 > local89 && local93 < arg2 - 1) {
						@Pc(126) Class51 local126 = Static398.aClass18_4.method609(local19);
						if (local84 != 22 || Static286.aClass1_Sub15_Sub1_1.aBoolean531 || local126.anInt1632 != 0 || local126.anInt1649 == 1 || local126.aBoolean138) {
							if (!local126.method1613()) {
								Static264.anInt9555++;
								local7 = false;
							}
							local36 = true;
						}
					}
				}
				local42 = local17.method4480();
				if (local42 == 0) {
					break;
				}
				local17.method4487();
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) String local21 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) short local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if (local21 == null || arg1[local47] != null && (local47 & 0x1) > arg1[local47].compareTo(local21)) {
				@Pc(68) String local68 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local68;
				@Pc(82) short local82 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local82;
			}
		}
		arg1[arg2] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method8035(arg0, arg1, local17 - 1, arg3);
		method8035(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!md;B)V")
	public static void method8040(@OriginalArg(0) Class20_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8975 == Static445.anInt7791 || arg0.anInt9022 == -1 || arg0.anInt9009 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class176 local30 = Static35.aClass152_1.method4045(arg0.anInt9022);
			if (local30.aBoolean395 || local30.anIntArray433[arg0.anInt8961] < arg0.anInt9033 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt8975 - arg0.anInt8978;
			@Pc(59) int local59 = Static445.anInt7791 - arg0.anInt8978;
			@Pc(71) int local71 = arg0.anInt8962 * 128 + arg0.method7808() * 64;
			@Pc(84) int local84 = arg0.anInt8981 * 128 + arg0.method7808() * 64;
			@Pc(97) int local97 = arg0.anInt9031 * 128 + arg0.method7808() * 64;
			@Pc(108) int local108 = arg0.anInt8956 * 128 + arg0.method7808() * 64;
			arg0.anInt8949 = ((local54 - local59) * local84 + local108 * local59) / local54;
			arg0.anInt8954 = (local97 * local59 + (local54 - local59) * local71) / local54;
		}
		arg0.anInt9036 = 0;
		if (arg0.anInt8971 == 0) {
			arg0.method7821(false, 8192);
		}
		if (arg0.anInt8971 == 1) {
			arg0.method7821(false, 12288);
		}
		if (arg0.anInt8971 == 2) {
			arg0.method7821(false, 0);
		}
		if (arg0.anInt8971 == 3) {
			arg0.method7821(false, 4096);
		}
	}
}
