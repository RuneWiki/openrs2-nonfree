import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public static int anInt2879;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "[I")
	public static int[] anIntArray372 = new int[1000];

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "Lclient!kh;")
	public static Class60 aClass60_992 = Static200.method3116("T");

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[200];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ah;B)Z")
	public static boolean method2209(@OriginalArg(0) Class6 arg0) {
		if (Static94.aBoolean118) {
			if (Static166.method2717(arg0) != 0) {
				return false;
			}
			if (arg0.anInt233 == 0) {
				return false;
			}
		}
		return arg0.aBoolean21;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)Lclient!ud;")
	public static Class1_Sub1_Sub26 method2212(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub26 local8 = (Class1_Sub1_Sub26) Static26.aClass39_5.method1161((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static21.aClass7_Sub1_3.method3242(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class1_Sub1_Sub26();
		@Pc(35) Class1_Sub9 local35 = new Class1_Sub9(local22);
		local35.anInt1192 = local35.aByteArray20.length - 2;
		@Pc(46) int local46 = local35.method946();
		@Pc(57) int local57 = local35.aByteArray20.length - local46 - 2 - 12;
		local35.anInt1192 = local57;
		@Pc(64) int local64 = local35.method915();
		local8.anInt4264 = local35.method946();
		local8.anInt4265 = local35.method946();
		local8.anInt4268 = local35.method946();
		local8.anInt4267 = local35.method946();
		@Pc(88) int local88 = local35.method895();
		@Pc(99) int local99;
		@Pc(105) int local105;
		if (local88 > 0) {
			local8.aClass33Array1 = new Class33[local88];
			for (local99 = 0; local99 < local88; local99++) {
				local105 = local35.method946();
				@Pc(112) Class33 local112 = new Class33(Static61.method1102(local105));
				local8.aClass33Array1[local99] = local112;
				while (local105-- > 0) {
					@Pc(123) int local123 = local35.method915();
					@Pc(127) int local127 = local35.method915();
					local112.method1072((long) local123, new Class1_Sub16(local127));
				}
			}
		}
		local99 = 0;
		local35.anInt1192 = 0;
		local8.aClass60_1457 = local35.method927();
		local8.anIntArray555 = new int[local64];
		local8.anIntArray556 = new int[local64];
		local8.aClass60Array29 = new Class60[local64];
		while (local57 > local35.anInt1192) {
			local105 = local35.method946();
			if (local105 == 3) {
				local8.aClass60Array29[local99] = local35.method935();
			} else if (local105 >= 100 || local105 == 21 || local105 == 38 || local105 == 39) {
				local8.anIntArray555[local99] = local35.method895();
			} else {
				local8.anIntArray555[local99] = local35.method915();
			}
			local8.anIntArray556[local99++] = local105;
		}
		Static26.aClass39_5.method1152((long) arg0, local8);
		return local8;
	}
}
