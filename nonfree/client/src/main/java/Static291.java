import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[Lclient!kj;")
	public static Class90[] aClass90Array1;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt5517 = 0;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static int anInt5519 = 0;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public static int anInt5525 = -1;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public static int anInt5526 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!km;)V")
	public static void method4384(@OriginalArg(1) Class91 arg0) {
		Static5.aClass91_8 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static26.anInt629 + arg0 * Static140.anInt3030 >> 16;
		@Pc(19) int local19 = arg3 * Static140.anInt3030 - arg0 * Static26.anInt629 >> 16;
		@Pc(29) int local29 = arg1 * Static112.anInt2572 + local19 * Static47.anInt1116 >> 16;
		@Pc(39) int local39 = arg1 * Static47.anInt1116 - local19 * Static112.anInt2572 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static112.anInt2572 + local19 * Static47.anInt1116 >> 16;
		@Pc(76) int local76 = arg2 * Static47.anInt1116 - local19 * Static112.anInt2572 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static169.anInt3630 && local87 < Static169.anInt3630) {
			return false;
		} else if (local50 > Static128.anInt2846 && local87 > Static128.anInt2846) {
			return false;
		} else if (local56 < Static209.anInt4169 && local93 < Static209.anInt4169) {
			return false;
		} else {
			return local56 <= Static23.anInt474 || local93 <= Static23.anInt474;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
	public static void method4386(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static130.method2227(arg0, 1);
		local4.method3911();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method4389(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static273.aBoolean401) {
			try {
				@Pc(28) Class2 local28 = (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
				local28.method38(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static273.aBoolean401 = true;
			}
		}
		return arg0;
	}
}
