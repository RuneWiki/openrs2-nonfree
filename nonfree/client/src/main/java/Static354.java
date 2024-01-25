import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_187 = new Class41(54, 3);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5361(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)[Lclient!rd;")
	public static Class196[] method5363() {
		if (Static173.aClass196Array1 == null) {
			@Pc(16) Class196[] local16 = Static143.method2458(Static92.aClass53_2);
			@Pc(20) Class196[] local20 = new Class196[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(68) int local68;
			@Pc(74) Class196 local74;
			label63: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(30) Class196 local30 = local16[local24];
				if ((local30.anInt5450 <= 0 || local30.anInt5450 >= 24) && local30.anInt5452 >= 800 && local30.anInt5445 >= 600 && (Static314.anInt5576 >= 96 || Static123.anInt2363 != 0 || local30.anInt5452 <= 1024 && local30.anInt5445 <= 768)) {
					for (local68 = 0; local68 < local22; local68++) {
						local74 = local20[local68];
						if (local74.anInt5452 == local30.anInt5452 && local30.anInt5445 == local74.anInt5445) {
							if (local30.anInt5450 > local74.anInt5450) {
								local20[local68] = local30;
							}
							continue label63;
						}
					}
					local20[local22] = local30;
					local22++;
				}
			}
			Static173.aClass196Array1 = new Class196[local22];
			Static406.method5654(local20, 0, Static173.aClass196Array1, 0, local22);
			@Pc(134) int[] local134 = new int[Static173.aClass196Array1.length];
			for (local68 = 0; local68 < Static173.aClass196Array1.length; local68++) {
				local74 = Static173.aClass196Array1[local68];
				local134[local68] = local74.anInt5445 * local74.anInt5452;
			}
			Static42.method897(local134, Static173.aClass196Array1);
		}
		return Static173.aClass196Array1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()V")
	public static void method5365() {
		for (@Pc(1) int local1 = 0; local1 < Static278.anInt1555; local1++) {
			@Pc(6) Class12_Sub1 local6 = Static258.aClass12_Sub1Array3[local1];
			Static385.method5712(local6);
			Static258.aClass12_Sub1Array3[local1] = null;
		}
		Static278.anInt1555 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!vd;IIIII)V")
	public static void method5366(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5141 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static259.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class2_Sub14_Sub1 local35 = Static305.aClass2_Sub14_Sub1Array2[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5141; local37++) {
							if (arg0.aClass2_Sub14_Sub1Array4[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub14_Sub1Array4[arg0.anInt5141++] = local35;
						if (arg0.anInt5141 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5141; local7 < 4; local7++) {
			arg0.aClass2_Sub14_Sub1Array4[local7] = null;
		}
	}
}
