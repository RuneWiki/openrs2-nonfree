import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public static int anInt5748;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)Z")
	public static boolean method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static143.method2962(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static261.aClass60Array2[arg0].method2264(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static39.anInt1025) {
					if (!Static218.method3955(local10, local23, local14)) {
						return false;
					}
					if (!Static218.method3955(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static218.method3955(local10, local27, local14)) {
						return false;
					}
					if (!Static218.method3955(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static218.method3955(local10, local31, local14)) {
					return false;
				}
				if (!Static218.method3955(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static357.anInt6822) {
					if (!Static218.method3955(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static218.method3955(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static218.method3955(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static218.method3955(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static39.anInt1025) {
					if (!Static218.method3955(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static218.method3955(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static218.method3955(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static218.method3955(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static357.anInt6822) {
					if (!Static218.method3955(local10, local23, local14)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static218.method3955(local10, local27, local14)) {
						return false;
					}
					if (!Static218.method3955(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static218.method3955(local10, local31, local14)) {
					return false;
				}
				if (!Static218.method3955(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static218.method3955(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static218.method3955(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static218.method3955(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static218.method3955(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static218.method3955(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BZ)[B")
	public static byte[] method4941(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static359.method761(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method4942() {
		if (Static324.anInt6209 == 5) {
			Static324.anInt6209 = 6;
		}
	}
}
