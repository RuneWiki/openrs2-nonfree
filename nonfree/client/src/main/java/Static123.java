import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt6671 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)Z")
	public static boolean method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static63.method4607(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static331.aClass8Array5[arg0].method4173(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static233.anInt4637) {
					if (!Static245.method4225(local10, local23, local14)) {
						return false;
					}
					if (!Static245.method4225(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static245.method4225(local10, local27, local14)) {
						return false;
					}
					if (!Static245.method4225(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static245.method4225(local10, local31, local14)) {
					return false;
				}
				if (!Static245.method4225(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static216.anInt4314) {
					if (!Static245.method4225(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static245.method4225(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static245.method4225(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static245.method4225(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static233.anInt4637) {
					if (!Static245.method4225(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static245.method4225(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static245.method4225(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static245.method4225(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static216.anInt4314) {
					if (!Static245.method4225(local10, local23, local14)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static245.method4225(local10, local27, local14)) {
						return false;
					}
					if (!Static245.method4225(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static245.method4225(local10, local31, local14)) {
					return false;
				}
				if (!Static245.method4225(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static245.method4225(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static245.method4225(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static245.method4225(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static245.method4225(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static245.method4225(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public static void method5685() {
		Static5.aBooleanArray1 = null;
		Static96.aBoolean162 = false;
		Static338.anIntArray816 = null;
		Static122.anIntArray367 = null;
		Static152.aClipboard1 = null;
		Static107.anIntArray224 = null;
		Static183.method3347();
	}
}
