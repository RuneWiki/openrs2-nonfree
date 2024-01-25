import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public static int anInt4998 = 500;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "[I")
	public static final int[] anIntArray409 = new int[14];

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z")
	public static boolean method4241() {
		@Pc(5) Class156 local5 = Static308.aClass156_1;
		synchronized (Static308.aClass156_1) {
			if (Static322.anInt6238 == Static68.anInt1388) {
				return false;
			} else {
				Static20.anInt554 = Static188.anIntArray303[Static322.anInt6238];
				Static32.aChar1 = Static126.aCharArray6[Static322.anInt6238];
				Static322.anInt6238 = Static322.anInt6238 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
	public static int method4243(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local75 < 0.5D) {
				local69 = (local46 - local32) / (local32 + local46);
			}
			if (local75 >= 0.5D) {
				local69 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(165) int local165 = (int) (local60 * 256.0D);
		@Pc(170) int local170 = (int) (local69 * 256.0D);
		@Pc(175) int local175 = (int) (local75 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		if (local175 > 243) {
			local170 >>= 0x4;
		} else if (local175 > 217) {
			local170 >>= 0x3;
		} else if (local175 > 192) {
			local170 >>= 0x2;
		} else if (local175 > 179) {
			local170 >>= 0x1;
		}
		return ((local165 >> 2 & 0x3F) << 10) + (local170 >> 5 << 7) + (local175 >> 1);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	public static void method4244() {
		@Pc(5) Class198 local5 = Static140.aClass198_23;
		synchronized (Static140.aClass198_23) {
			Static140.aClass198_23.method5243(5);
		}
	}
}
