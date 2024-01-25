import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "Lclient!ss;")
	public static Class225 aClass225_1;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_51 = new Class44(17, 8);

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_97 = new Class81(80, -2);

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_20 = new Class240(8);

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
	public static void method3334(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static176.aClass113ArrayArrayArray3 = Static3.aClass113ArrayArrayArray1;
			Static372.aClass106Array11 = Static77.aClass106Array12;
		} else {
			Static176.aClass113ArrayArrayArray3 = Static79.aClass113ArrayArrayArray2;
			Static372.aClass106Array11 = Static72.aClass106Array4;
		}
		Static58.anInt1578 = Static176.aClass113ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([I[IILclient!sq;[I)V")
	public static void method3335(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class4_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass268Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass268Array3[local19] = null;
					} else {
						@Pc(36) Class46 local36 = Static9.aClass194_1.method4371(local9);
						@Pc(39) int local39 = local36.anInt1764;
						@Pc(44) Class268 local44 = arg2.aClass268Array3[local19];
						if (local44 != null) {
							if (local44.anInt7848 == local9) {
								if (local39 == 0) {
									local44 = arg2.aClass268Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt7841 = local17;
									local44.anInt7842 = 1;
									local44.anInt7840 = 0;
									local44.anInt7839 = 0;
									local44.anInt7843 = 0;
									Static4.method137(local36, 0, arg2.anInt7111, arg2.aByte92, arg2.anInt7117, false);
								} else if (local39 == 2) {
									local44.anInt7840 = 0;
								}
							} else if (local36.anInt1767 >= Static9.aClass194_1.method4371(local44.anInt7848).anInt1767) {
								local44 = arg2.aClass268Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg2.aClass268Array3[local19] = new Class268();
							local44.anInt7842 = 1;
							local44.anInt7839 = 0;
							local44.anInt7848 = local9;
							local44.anInt7841 = local17;
							local44.anInt7840 = 0;
							local44.anInt7843 = 0;
							Static4.method137(local36, 0, arg2.anInt7111, arg2.aByte92, arg2.anInt7117, false);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
