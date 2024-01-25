import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!fa;")
	public static Interface5 anInterface5_1;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_45 = new Class363(77, 8);

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
	public static int anInt1478 = 2;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!lo;Z[[[BIB)Z")
	public static boolean method1028(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static206.aBoolean325) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8761 >> Static134.anInt2822;
		@Pc(13) int local13 = arg0.anInt8764 >> Static134.anInt2822;
		if (local8 < Static151.anInt3037 || local8 >= Static152.anInt3053 || local13 < Static99.anInt2048 || local13 >= Static193.anInt3882) {
			return true;
		} else if ((arg2 == null || arg0.aByte112 < arg3 || arg2[arg0.aByte112][local8][local13] != arg4) && arg0.method7327() && !arg0.method7320()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static350.anInt6287 - 16 && local8 <= Static350.anInt6287 + 16 && local13 >= Static148.anInt3061 - 16 && local13 <= Static148.anInt3061 + 16) {
				if (Static293.aBoolean419) {
					Static140.aClass72Array1[Static536.anInt8786++].method1350(arg0);
					Static536.anInt8786 %= Static285.anInt6371;
				} else {
					arg0.method7323(Static356.aClass100_8);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
	public static boolean method1032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
