import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_763 = Static51.method932("Lade)3)3)3");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B[B)Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 method1240(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class2_Sub1_Sub4_Sub1_Sub1 local23 = new Class2_Sub1_Sub4_Sub1_Sub1(arg0, Static96.anIntArray401, Static14.anIntArray26, Static68.anIntArray178, Static98.anIntArray240, Static118.anIntArray284, Static115.aByteArrayArray9);
			Static155.method2394();
			return local23;
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	public static void method1241() {
		aClass10_763 = null;
		anIntArray189 = null;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
	public static void method1242() {
		Static94.anIntArray232 = new int[151];
		Static33.anIntArray67 = new int[33];
		anIntArray189 = new int[151];
		Static32.anIntArray65 = new int[33];
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(32) int local32;
		for (@Pc(24) int local24 = 0; local24 < 33; local24++) {
			local28 = 999;
			local30 = 0;
			for (local32 = 0; local32 < 34; local32++) {
				if (Static149.aClass2_Sub1_Sub4_Sub3_7.aByteArray34[local24 * Static149.aClass2_Sub1_Sub4_Sub3_7.anInt2635 + local32] == 0) {
					if (local28 == 999) {
						local28 = local32;
					}
				} else if (local28 != 999) {
					local30 = local32;
					break;
				}
			}
			Static33.anIntArray67[local24] = local28;
			Static32.anIntArray65[local24] = local30 - local28;
		}
		for (local28 = 5; local28 < 156; local28++) {
			local30 = 999;
			local32 = 0;
			for (@Pc(91) int local91 = 25; local91 < 172; local91++) {
				if (Static149.aClass2_Sub1_Sub4_Sub3_7.aByteArray34[Static149.aClass2_Sub1_Sub4_Sub3_7.anInt2635 * local28 + local91] == 0 && (local91 > 34 || local28 > 34)) {
					if (local30 == 999) {
						local30 = local91;
					}
				} else if (local30 != 999) {
					local32 = local91;
					break;
				}
			}
			anIntArray189[local28 - 5] = local30 - 25;
			Static94.anIntArray232[local28 - 5] = local32 - local30;
		}
	}
}
