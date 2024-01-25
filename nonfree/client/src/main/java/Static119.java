import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ew", name = "O", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_57 = new Class239(15, 2);

	@OriginalMember(owner = "client!ew", name = "Y", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!hba;I)I")
	public static int method2307(@OriginalArg(0) Class111 arg0) {
		if (arg0 == Static132.aClass111_1) {
			return 5890;
		} else if (arg0 == Static463.aClass111_4) {
			return 34167;
		} else if (arg0 == Static409.aClass111_3) {
			return 34168;
		} else if (Static254.aClass111_2 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[Lclient!wca;I)V")
	public static void method2309(@OriginalArg(1) Class310[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class310 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt9167 && !Static67.method1256(local9)) {
				if (local9.anInt9220 == 0) {
					method2309(arg0, local9.anInt9226);
					if (local9.aClass310Array2 != null) {
						method2309(local9.aClass310Array2, local9.anInt9226);
					}
					@Pc(46) Class2_Sub9 local46 = (Class2_Sub9) Static110.aClass127_21.method3205((long) local9.anInt9226);
					if (local46 != null) {
						Static439.method6716(local46.anInt833);
					}
				}
				if (local9.anInt9220 == 6 && local9.anInt9203 != -1) {
					@Pc(69) Class4 local69 = Static396.aClass157_2.method3745(local9.anInt9203);
					if (local69 != null) {
						local9.anInt9162 += Static436.anInt7972;
						while (local9.anInt9162 > local69.anIntArray12[local9.anInt9196]) {
							local9.anInt9162 -= local69.anIntArray12[local9.anInt9196];
							local9.anInt9196++;
							if (local9.anInt9196 >= local69.anIntArray11.length) {
								local9.anInt9196 -= local69.anInt116;
								if (local9.anInt9196 < 0 || local69.anIntArray11.length <= local9.anInt9196) {
									local9.anInt9196 = 0;
								}
							}
							local9.anInt9146 = local9.anInt9196 + 1;
							if (local9.anInt9146 >= local69.anIntArray11.length) {
								local9.anInt9146 -= local69.anInt116;
								if (local9.anInt9146 < 0 || local69.anIntArray11.length <= local9.anInt9146) {
									local9.anInt9146 = -1;
								}
							}
							Static273.method4342(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "(I)V")
	public static void method2312() {
		Static254.aClass35_21 = null;
		Static107.aClass35_16 = null;
		Static82.aClass35_6 = null;
		Static298.aClass35_24 = null;
		Static275.aClass35_28 = null;
		Static281.aClass35_23 = null;
		Static274.aClass35_22 = null;
		Static251.aClass35_20 = null;
		Static376.aClass35Array31 = null;
	}
}
