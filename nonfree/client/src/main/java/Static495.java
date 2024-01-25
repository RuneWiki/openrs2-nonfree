import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public static int anInt8375;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "J")
	public static long aLong230 = 0L;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method6775(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(63) char local63;
			if (local17 == '\u0000') {
				local63 = arg0.charAt(local13++);
			} else {
				local63 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg2.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static99.method1468(local63);
			local19 = Static99.method1468(local76);
			local63 = Static63.method1016(local63, arg1);
			local76 = Static63.method1016(local76, arg1);
			if (local76 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static272.method4001(local63, arg1) - Static272.method4001(local76, arg1);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(173) char local173 = arg0.charAt(local13);
			@Pc(177) char local177 = arg2.charAt(local15);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local177 != local173) {
					return Static272.method4001(local173, arg1) - Static272.method4001(local177, arg1);
				}
			}
		}
		@Pc(225) int local225 = local8 - local11;
		if (local225 != 0) {
			return local225;
		}
		for (@Pc(234) int local234 = 0; local234 < local143; local234++) {
			@Pc(240) char local240 = arg0.charAt(local234);
			@Pc(244) char local244 = arg2.charAt(local234);
			if (local240 != local244) {
				return Static272.method4001(local240, arg1) - Static272.method4001(local244, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method6776() {
		Static312.aBoolean443 = false;
		Static262.anIntArrayArrayArray14 = new int[Static119.anInt2474][Static327.anInt5993 + 1][Static191.anInt3757 + 1];
		Static246.anInt4537 = Static165.anInt3157;
		Static385.anInt6903 = 0;
		Static369.aClass333Array8 = new Class333[1000];
		Static102.anInt1774 = 0;
		Static91.anInt8332 = 0;
		Static569.anInt9390 = Static165.anInt3157;
		Static288.aClass333Array4 = new Class333[2000];
		Static165.anInt3162 = 0;
		Static136.aClass333Array1 = new Class333[500];
		Static412.aClass333Array6 = new Class333[500];
		if (Static458.aClass78_153 instanceof l) {
			Static204.aBoolean276 = false;
		} else {
			Static204.aBoolean276 = true;
		}
	}
}
