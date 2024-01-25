import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "[I")
	public static int[] anIntArray778;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!fc;")
	public static Class71 aClass71_87;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_196 = new Class41(22, 4);

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	public static int anInt6415 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fc;Z)V")
	public static void method5529(@OriginalArg(0) Class71 arg0) {
		aClass71_87 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5530(@OriginalArg(0) String arg0) {
		Static242.method3898(arg0, 0, "", "", 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!gb;)V")
	public static void method5531(@OriginalArg(0) Class2_Sub14_Sub1 arg0) {
		if (Static356.anInt6269 >= 65535) {
			return;
		}
		Static305.aClass2_Sub14_Sub1Array2[Static356.anInt6269] = arg0;
		Static163.aBooleanArray64[Static356.anInt6269] = false;
		Static356.anInt6269++;
		@Pc(18) int local18 = arg0.anInt2183;
		if (arg0.aBoolean167) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt2183;
		if (arg0.aBoolean168) {
			local26 = Static32.anInt6037 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt2167 + Static365.anInt2303 - arg0.anInt2166 >> Static315.anInt5584;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt2167 + arg0.anInt2166 - Static365.anInt2303 >> Static315.anInt5584;
			if (local66 >= Static244.anInt1024) {
				local66 = Static244.anInt1024 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray40[local38++];
				@Pc(96) int local96 = (arg0.anInt2170 + Static365.anInt2303 - arg0.anInt2166 >> Static315.anInt5584) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static166.anInt2967) {
					local104 = Static166.anInt2967 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static259.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static259.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static356.anInt6269;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static259.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static356.anInt6269 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static259.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static356.anInt6269 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static259.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static356.anInt6269 << 48;
					}
				}
			}
		}
	}
}
