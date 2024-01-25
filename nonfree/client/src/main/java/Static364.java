import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!tda;")
	public static Class323 aClass323_1;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[Lclient!fd;")
	public static Class98_Sub1[] aClass98_Sub1Array2;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!mo;")
	public static final Class211 aClass211_7 = new Class211();

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
	public static final int[] anIntArray387 = new int[14];

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_67 = new Class257(21, -1);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V")
	public static void method5678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static538.anInt9297 != arg0) {
			Static93.anIntArray111 = new int[arg0];
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				Static93.anIntArray111[local17] = (local17 << 12) / arg0;
			}
			Static538.anInt9297 = arg0;
			Static174.anInt4171 = arg0 * 32;
			Static263.anInt5634 = arg0 - 1;
		}
		if (Static159.anInt8698 == arg1) {
			return;
		}
		if (arg1 == Static538.anInt9297) {
			Static426.anIntArray424 = Static93.anIntArray111;
		} else {
			Static426.anIntArray424 = new int[arg1];
			for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
				Static426.anIntArray424[local64] = (local64 << 12) / arg1;
			}
		}
		Static159.anInt8698 = arg1;
		Static17.anInt866 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method5679() {
		Static147.aBoolean272 = true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method5680(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static203.anInt4658 = arg0;
		Static507.aClass15_Sub8Array1 = new Class15_Sub8[Static562.anIntArray534[Static203.anInt4658] + 1];
		Static158.anInt3981 = 0;
		Static593.anInt10150 = 0;
	}
}
