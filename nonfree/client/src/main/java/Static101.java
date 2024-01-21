import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	public static int anInt2323;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_670 = Static181.method2795("flash3:");

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_671 = Static181.method2795("Members object");

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	public static int anInt2322 = -1;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "[I")
	public static final int[] anIntArray226 = new int[100];

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_672 = aClass83_670;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "Lclient!qe;")
	public static Class83 aClass83_673 = aClass83_670;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_674 = Static181.method2795("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "[I")
	public static final int[] anIntArray227 = new int[32];

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "Lclient!qe;")
	public static Class83 aClass83_675 = aClass83_671;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public static void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt3554; local12++) {
			@Pc(18) Class78 local18 = local7.aClass78Array3[local12];
			if ((local18.aLong107 >> 29 & 0x3L) == 2L && local18.anInt3028 == arg1 && local18.anInt3036 == arg2) {
				Static208.method3141(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)Z")
	public static boolean method1744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)Z")
	public static boolean method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static155.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static18.anInt2019) {
			return false;
		} else if (local7 == Static18.anInt2019) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static166.method2577(local22 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg2], local26 + 1) && Static166.method2577(local22 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local26 + 1) && Static166.method2577(local22 + 128 - 1, Static27.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static166.method2577(local22 + 1, Static27.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static155.anIntArrayArrayArray8[arg0][arg1][arg2] = Static18.anInt2019;
				return true;
			} else {
				Static155.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static18.anInt2019;
				return false;
			}
		}
	}
}
