import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "J")
	public static long aLong95;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	public static int anInt2802;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "I")
	public static int anInt2806;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
	public static int anInt2811 = -1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!pe;I)Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 method2234(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		return Static12.method311(arg1, arg0) ? Static182.method3395() : null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
	public static void method2235(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static88.anInt2600 >= 100) {
			Static118.method2563(0, Static101.aClass60_807, Static31.aClass60_229);
			return;
		}
		@Pc(27) Class60 local27 = Static182.method3394(arg0).method2663();
		for (@Pc(29) int local29 = 0; local29 < Static88.anInt2600; local29++) {
			if (Static138.aLongArray2[local29] == arg0) {
				Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { local27, Static66.aClass60_501 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static81.anInt2399; local64++) {
			if (arg0 == Static118.aLongArray5[local64]) {
				Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { Static172.aClass60_1158, local27, Static98.aClass60_792 }));
				return;
			}
		}
		if (local27.method2687(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288)) {
			Static118.method2563(0, Static101.aClass60_807, Static4.aClass60_34);
			return;
		}
		Static138.aLongArray2[Static88.anInt2600] = arg0;
		Static149.aClass60Array21[Static88.anInt2600++] = Static182.method3394(arg0);
		Static1.anInt4 = Static157.anInt3990;
		Static7.aClass2_Sub3_Sub1_43.method244(10);
		Static7.aClass2_Sub3_Sub1_43.method205(arg0);
	}
}
