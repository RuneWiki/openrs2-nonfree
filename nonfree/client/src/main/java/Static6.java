import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt56;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method36() {
		Static36.aClass187_22.method4534(5);
		Static306.aClass187_153.method4534(5);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILclient!hi;)V")
	public static void method38(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(8) int local8 = arg1.anInt2214 == 0 ? arg1.anInt2204 : arg1.anInt2214;
		@Pc(25) int local25 = arg1.anInt2215 == 0 ? arg1.anInt2207 : arg1.anInt2215;
		Static294.method4481(local25, local8, Static274.aClass66ArrayArray1[arg1.anInt2157 >> 16], arg0, arg1.anInt2157);
		if (arg1.aClass66Array3 != null) {
			Static294.method4481(local25, local8, arg1.aClass66Array3, arg0, arg1.anInt2157);
		}
		@Pc(62) Class1_Sub25 local62 = (Class1_Sub25) Static302.aClass142_26.method3543((long) arg1.anInt2157);
		if (local62 != null) {
			Static285.method4389(local25, local62.anInt4289, arg0, local8);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZLclient!hi;)V")
	public static void method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class66 arg2) {
		if (Static5.aClass66_1 != null || Static249.aBoolean307 || (arg2 == null || Static32.method2405(arg2) == null)) {
			return;
		}
		Static5.aClass66_1 = arg2;
		Static309.aClass66_50 = Static32.method2405(arg2);
		Static95.aBoolean104 = false;
		Static145.anInt2885 = arg0;
		Static240.anInt4354 = arg1;
		Static130.anInt2593 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I")
	public static int method40(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local30) {
			local32 = local30;
		}
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = local14;
		@Pc(50) double local50 = 0.0D;
		if (local14 < local30) {
			local48 = local30;
		}
		if (local48 < local21) {
			local48 = local21;
		}
		@Pc(74) double local74 = (local32 + local48) / 2.0D;
		if (local48 != local32) {
			if (local74 < 0.5D) {
				local50 = (local48 - local32) / (local32 + local48);
			}
			if (local74 >= 0.5D) {
				local50 = (local48 - local32) / (2.0D - local48 - local32);
			}
			if (local48 == local14) {
				local46 = (local30 - local21) / (-local32 + local48);
			} else if (local48 == local30) {
				local46 = (local21 - local14) / (-local32 + local48) + 2.0D;
			} else if (local48 == local21) {
				local46 = (local14 - local30) / (local48 - local32) + 4.0D;
			}
		}
		@Pc(161) int local161 = (int) (local50 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		@Pc(180) int local180 = (int) (local74 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local161 >>= 0x4;
		} else if (local180 > 217) {
			local161 >>= 0x3;
		} else if (local180 > 192) {
			local161 >>= 0x2;
		} else if (local180 > 179) {
			local161 >>= 0x1;
		}
		local46 /= 6.0D;
		@Pc(241) int local241 = (int) (local46 * 256.0D);
		return (local180 >> 1) + (local241 >> 2 << 10) + (local161 >> 5 << 7);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([IBIJ)Ljava/lang/String;")
	public static String method41(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Static22.anInterface3_1 != null) {
			@Pc(19) String local19 = Static22.anInterface3_1.method4730(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}
}
