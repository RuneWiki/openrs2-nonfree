import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!wb;")
	public static Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
	public static boolean aBoolean69;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt772 = 0;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_27 = new Class305(28, -1);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lclient!sba;")
	public static final Class1_Sub2_Sub17[] aClass1_Sub2_Sub17Array1 = new Class1_Sub2_Sub17[14];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!et;II)V")
	public static void method799(@OriginalArg(1) Class91 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte41 == 0) {
			arg0.anInt2423 = arg0.anInt2386;
		} else if (arg0.aByte41 == 1) {
			arg0.anInt2423 = arg0.anInt2386 + (arg1 - arg0.anInt2399) / 2;
		} else if (arg0.aByte41 == 2) {
			arg0.anInt2423 = arg1 - arg0.anInt2399 - arg0.anInt2386;
		} else if (arg0.aByte41 == 3) {
			arg0.anInt2423 = arg0.anInt2386 * arg1 >> 14;
		} else if (arg0.aByte41 == 4) {
			arg0.anInt2423 = (arg1 - arg0.anInt2399) / 2 + (arg1 * arg0.anInt2386 >> 14);
		} else {
			arg0.anInt2423 = arg1 - arg0.anInt2399 - (arg1 * arg0.anInt2386 >> 14);
		}
		if (arg0.aByte38 == 0) {
			arg0.anInt2409 = arg0.anInt2372;
		} else if (arg0.aByte38 == 1) {
			arg0.anInt2409 = arg0.anInt2372 + (arg2 - arg0.anInt2378) / 2;
		} else if (arg0.aByte38 == 2) {
			arg0.anInt2409 = arg2 - arg0.anInt2378 - arg0.anInt2372;
		} else if (arg0.aByte38 == 3) {
			arg0.anInt2409 = arg2 * arg0.anInt2372 >> 14;
		} else if (arg0.aByte38 == 4) {
			arg0.anInt2409 = (arg2 - arg0.anInt2378) / 2 + (arg2 * arg0.anInt2372 >> 14);
		} else {
			arg0.anInt2409 = arg2 - (arg2 * arg0.anInt2372 >> 14) - arg0.anInt2378;
		}
		if (!Static428.aBoolean561) {
			return;
		}
		if (Static63.method1580(arg0).anInt1806 == 0 && arg0.anInt2452 != 0) {
			return;
		}
		if (arg0.anInt2409 < 0) {
			arg0.anInt2409 = 0;
		} else if (arg2 < arg0.anInt2378 + arg0.anInt2409) {
			arg0.anInt2409 = arg2 - arg0.anInt2378;
		}
		if (arg0.anInt2423 < 0) {
			arg0.anInt2423 = 0;
			return;
		}
		if (arg1 < arg0.anInt2423 + arg0.anInt2399) {
			arg0.anInt2423 = arg1 - arg0.anInt2399;
			return;
		}
	}
}
