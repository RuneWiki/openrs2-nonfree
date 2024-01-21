import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!jb", name = "Gb", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!jb", name = "Ub", descriptor = "I")
	public static int anInt1581;

	@OriginalMember(owner = "client!jb", name = "dc", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_4;

	@OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
	public static int anInt1571 = 0;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_850 = Static15.method178("@cr2@");

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_851 = Static15.method178(" @whi@(X");

	@OriginalMember(owner = "client!jb", name = "Zb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_852 = Static15.method178("as it was used to break our rules)3");

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "Lclient!gd;")
	public static Class23 aClass23_853 = aClass23_852;

	@OriginalMember(owner = "client!jb", name = "bc", descriptor = "I")
	public static volatile int anInt1585 = 0;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
	public static void method974() {
		Static84.aClass5_50.method99();
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)I")
	public static int method976() {
		@Pc(7) int local7 = 3;
		if (Static44.anInt1488 < 310) {
			@Pc(16) int local16 = Static54.anInt1684 >> 7;
			@Pc(21) int local21 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 >> 7;
			@Pc(26) int local26 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196 >> 7;
			@Pc(30) int local30 = Static21.anInt702 >> 7;
			if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][local16][local30] & 0x4) != 0) {
				local7 = Static79.anInt2137;
			}
			@Pc(57) int local57;
			if (local21 > local30) {
				local57 = local21 - local30;
			} else {
				local57 = local30 - local21;
			}
			@Pc(76) int local76;
			if (local26 > local16) {
				local76 = local26 - local16;
			} else {
				local76 = local16 - local26;
			}
			@Pc(95) int local95;
			@Pc(97) int local97;
			if (local57 >= local76) {
				local95 = local76 * 65536 / local57;
				local97 = 32768;
				while (local30 != local21) {
					local97 += local95;
					if (local21 > local30) {
						local30++;
					} else if (local30 > local21) {
						local30--;
					}
					if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][local16][local30] & 0x4) != 0) {
						local7 = Static79.anInt2137;
					}
					if (local97 >= 65536) {
						if (local26 > local16) {
							local16++;
						} else if (local16 > local26) {
							local16--;
						}
						if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][local16][local30] & 0x4) != 0) {
							local7 = Static79.anInt2137;
						}
						local97 -= 65536;
					}
				}
			} else {
				local95 = local57 * 65536 / local76;
				local97 = 32768;
				while (local26 != local16) {
					if (local26 > local16) {
						local16++;
					} else if (local26 < local16) {
						local16--;
					}
					local97 += local95;
					if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][local16][local30] & 0x4) != 0) {
						local7 = Static79.anInt2137;
					}
					if (local97 >= 65536) {
						if (local21 > local30) {
							local30++;
						} else if (local30 > local21) {
							local30--;
						}
						if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][local16][local30] & 0x4) != 0) {
							local7 = Static79.anInt2137;
						}
						local97 -= 65536;
					}
				}
			}
		}
		if ((Static95.aByteArrayArrayArray5[Static79.anInt2137][Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196 >> 7][Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 >> 7] & 0x4) != 0) {
			local7 = Static79.anInt2137;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rb;Lclient!gd;Lclient!gd;I)[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] method977(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class23 arg2) {
		@Pc(10) int local10 = arg0.method1885(arg2);
		@Pc(21) int local21 = arg0.method1876(local10, arg1);
		return Static28.method1394(arg0, local21, local10);
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
	public static void method979() {
		aClass23_850 = null;
		aClass1_Sub1_Sub6_Sub1_4 = null;
		aClass23_852 = null;
		aClass23_851 = null;
		aClass23_853 = null;
		anIntArray183 = null;
	}
}
