import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 aClass4_Sub1_Sub7_Sub2_1;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public static void method327() {
		Static174.anInt3915 = 0;
		@Pc(12) int local12 = (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 >> 7) + Static103.anInt2610;
		@Pc(24) int local24 = Static184.anInt4144 + (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static174.anInt3915 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static174.anInt3915 = 1;
		}
		if (Static174.anInt3915 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static174.anInt3915 = 0;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)Z")
	public static boolean method328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(JIZZ)Lclient!jd;")
	public static Class46 method331(@OriginalArg(0) long arg0) {
		@Pc(29) int local29 = 1;
		for (@Pc(34) long local34 = arg0 / (long) 10; local34 != 0L; local34 /= 10) {
			local29++;
		}
		@Pc(50) int local50 = local29;
		if (arg0 < 0L) {
			local50 = local29 + 1;
		}
		@Pc(60) byte[] local60 = new byte[local50];
		if (arg0 < 0L) {
			local60[0] = 45;
		}
		for (@Pc(78) int local78 = 0; local78 < local29; local78++) {
			@Pc(86) int local86 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local86 < 0) {
				local86 = -local86;
			}
			if (local86 > 9) {
				local86 += 39;
			}
			local60[local50 - local78 - 1] = (byte) (local86 + 48);
		}
		@Pc(126) Class46 local126 = new Class46();
		local126.aByteArray20 = local60;
		local126.anInt2141 = local50;
		return local126;
	}
}
