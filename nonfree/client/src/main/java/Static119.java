import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 aClass2_Sub4_Sub3_Sub3_4;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Z")
	public static final boolean aBoolean129 = false;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1672 = Static107.method1838("Members object");

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1671 = aClass28_1672;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Z")
	public static boolean method1967(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1968() {
		aClass28_1671 = null;
		aClass2_Sub4_Sub3_Sub3_4 = null;
		aClass28_1672 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass52_1 != null && local7.aClass52_1.aLong93 == arg3) {
			return true;
		} else if (local7.aClass49_1 != null && local7.aClass49_1.aLong89 == arg3) {
			return true;
		} else if (local7.aClass19_1 != null && local7.aClass19_1.aLong36 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2269; local46++) {
				if (local7.aClass43Array56[local46].aLong83 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZILclient!ah;)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub4_Sub2 arg4) {
		if (Static145.anInt3283 >= 50 || (arg4.anIntArray34 == null || arg4.anIntArray34.length <= arg3)) {
			return;
		}
		@Pc(25) int local25 = arg4.anIntArray34[arg3];
		if (local25 == 0) {
			return;
		}
		@Pc(32) int local32 = local25 >> 8;
		@Pc(36) int local36 = local25 & 0xF;
		@Pc(42) int local42 = local25 >> 4 & 0x7;
		if (local36 == 0) {
			if (arg2) {
				Static94.method1638(local42, 0, local32);
			}
		} else if (Static101.anInt443 != 0) {
			Static44.anIntArray103[Static145.anInt3283] = local32;
			@Pc(77) int local77 = (arg1 - 64) / 128;
			Static21.anIntArray51[Static145.anInt3283] = local42;
			Static10.anIntArray38[Static145.anInt3283] = 0;
			Static115.aClass38Array1[Static145.anInt3283] = null;
			@Pc(95) int local95 = (arg0 - 64) / 128;
			Static124.anIntArray269[Static145.anInt3283] = (local95 << 8) + (local77 << 16) + local36;
			Static145.anInt3283++;
		}
	}
}
