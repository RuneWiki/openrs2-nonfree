import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!td", name = "V", descriptor = "Lclient!id;")
	public static Class43 aClass43_21 = new Class43(64);

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	public static int anInt4309 = 0;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!td", name = "db", descriptor = "Lclient!i;")
	private static Class41 aClass41_1136 = Static184.method2923("Loading wordpack )2 ");

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1137 = aClass41_1136;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)I")
	public static int method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
	public static int method2970(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lclient!i;")
	public static Class41 method2971(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static152.method2471(arg0) : Static3.aClass41_25;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!nb;Lclient!nb;)V")
	public static void method2972(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		Static126.aClass15_24 = arg0;
		Static54.aClass15_11 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method2973(@OriginalArg(0) Class12_Sub3 arg0) {
		if (arg0.anInt3957 == Static103.anInt2511 || arg0.anInt3910 == -1 || arg0.anInt3965 != 0 || arg0.anInt3927 + 1 > Static14.method299(arg0.anInt3910).anIntArray235[arg0.anInt3930]) {
			@Pc(41) int local41 = Static103.anInt2511 - arg0.anInt3959;
			@Pc(51) int local51 = arg0.anInt3942 * 128 + arg0.anInt3932 * 64;
			@Pc(57) int local57 = arg0.anInt3957 - arg0.anInt3959;
			@Pc(68) int local68 = arg0.anInt3923 * 128 + arg0.anInt3932 * 64;
			@Pc(79) int local79 = arg0.anInt3929 * 128 + arg0.anInt3932 * 64;
			@Pc(89) int local89 = arg0.anInt3907 * 128 + arg0.anInt3932 * 64;
			arg0.anInt3949 = ((local57 - local41) * local68 + local89 * local41) / local57;
			arg0.anInt3961 = ((local57 - local41) * local51 + local79 * local41) / local57;
		}
		arg0.anInt3937 = 0;
		if (arg0.anInt3964 == 0) {
			arg0.anInt3947 = 1024;
		}
		if (arg0.anInt3964 == 1) {
			arg0.anInt3947 = 1536;
		}
		if (arg0.anInt3964 == 2) {
			arg0.anInt3947 = 0;
		}
		if (arg0.anInt3964 == 3) {
			arg0.anInt3947 = 512;
		}
		arg0.anInt3916 = arg0.anInt3947;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)Z")
	public static boolean method2974(@OriginalArg(1) int arg0) {
		if (Static150.aBooleanArray18[arg0]) {
			return true;
		} else if (Static74.aClass15_18.method420(arg0)) {
			@Pc(23) int local23 = Static74.aClass15_18.method390(arg0);
			if (local23 == 0) {
				Static150.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static68.aClass80ArrayArray1[arg0] == null) {
				Static68.aClass80ArrayArray1[arg0] = new Class80[local23];
			}
			for (@Pc(43) int local43 = 0; local43 < local23; local43++) {
				if (Static68.aClass80ArrayArray1[arg0][local43] == null) {
					@Pc(57) byte[] local57 = Static74.aClass15_18.method387(local43, arg0);
					if (local57 != null) {
						Static68.aClass80ArrayArray1[arg0][local43] = new Class80();
						Static68.aClass80ArrayArray1[arg0][local43].anInt3661 = local43 + (arg0 << 16);
						if (local57[0] == -1) {
							Static68.aClass80ArrayArray1[arg0][local43].method2547(new Class2_Sub3(local57));
						} else {
							Static68.aClass80ArrayArray1[arg0][local43].method2552(new Class2_Sub3(local57));
						}
					}
				}
			}
			Static150.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
