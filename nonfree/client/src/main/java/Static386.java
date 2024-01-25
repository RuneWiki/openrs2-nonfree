import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public static int anInt7086;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[Lclient!ls;")
	public static Class178_Sub1[] aClass178_Sub1Array2 = new Class178_Sub1[0];

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static final int anInt7081 = -1;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_70 = new Class243(28, 6);

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static int anInt7085 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method5998(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt5068 - Static115.anInt2326;
		@Pc(20) int local20 = arg0.anInt5043 * 128 + arg0.method4394() * 64;
		@Pc(32) int local32 = arg0.anInt5056 * 128 + arg0.method4394() * 64;
		arg0.anInt7659 += (local32 - arg0.anInt7659) / local9;
		arg0.anInt7660 += (local20 - arg0.anInt7660) / local9;
		arg0.anInt5104 = 0;
		if (arg0.anInt5093 == 0) {
			arg0.method4380(8192);
		}
		if (arg0.anInt5093 == 1) {
			arg0.method4380(12288);
		}
		if (arg0.anInt5093 == 2) {
			arg0.method4380(0);
		}
		if (arg0.anInt5093 == 3) {
			arg0.method4380(4096);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)Z")
	public static boolean method6004(@OriginalArg(0) int arg0) {
		Static199.anInt3587 = arg0 + 1 & 0xFFFF;
		Static249.aBoolean334 = true;
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public static void method6005() {
		if (Static116.aBoolean205) {
			return;
		}
		Static511.method7466(Static546.aClass262ArrayArrayArray4);
		if (Static274.aClass262ArrayArrayArray3 != null) {
			Static511.method7466(Static274.aClass262ArrayArrayArray3);
		}
		Static116.aBoolean205 = true;
	}
}
