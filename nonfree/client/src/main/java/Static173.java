import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!hh;")
	public static Class109 aClass109_42;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Lclient!oq;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!tn;I)V")
	public static void method2757(@OriginalArg(0) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class34 local10 = arg1.method5378(Static447.aClass121_11);
		if (local10 == null) {
			return;
		}
		Static447.aClass121_11.pa(arg2, arg0, arg1.anInt6905 + arg2, arg0 + arg1.anInt6895);
		if (Static417.anInt7328 < 3) {
			Static418.aClass78_23.method6007((float) arg2 + (float) arg1.anInt6905 / 2.0F, (float) arg0 + (float) arg1.anInt6895 / 2.0F, ((int) -Static147.aFloat59 & 0x3FFF) << 2, local10, arg2, arg0);
		} else {
			Static447.aClass121_11.j(-16777216, local10, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
	public static void method2758() {
		Static101.aClass1_Sub3_1 = new Class1_Sub3(Static92.aClass96_32.method1935(Static389.anInt7061), "", Static139.anInt2525, 1004, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2759(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static224.method3272(Static93.aClass254_35);
		Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0) + 1);
		Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
		Static201.aClass1_Sub14_Sub2_2.method4545(arg1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!ti;)V")
	public static void method2760(@OriginalArg(1) Class1_Sub14 arg0) {
		if (arg0.aByteArray65.length - arg0.anInt5695 < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method4548();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray65.length - arg0.anInt5695 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method4498();
		if (local46 * 6 != arg0.aByteArray65.length - arg0.anInt5695) {
			return;
		}
		while (true) {
			@Pc(62) int local62;
			@Pc(66) int local66;
			do {
				do {
					do {
						if (arg0.aByteArray65.length <= arg0.anInt5695) {
							return;
						}
						local62 = arg0.method4498();
						local66 = arg0.method4500();
					} while (Static103.anIntArray102.length <= local62);
				} while (!Static342.aBooleanArray23[local62]);
			} while (Static316.aClass153_1.method3380(local62).aChar5 == '1' && (local66 < -1 || local66 > 1));
			Static103.anIntArray102[local62] = local66;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)I")
	public static int method2761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
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
}
