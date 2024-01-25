import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_2 = new Class202(0, Static275.aClass198_15, Static275.aClass198_15, 0, 1);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_3 = new Class202(1, Static275.aClass198_15, 2);

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_4 = new Class202(2, Static275.aClass198_15, Static275.aClass198_15, 2, 3);

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_5 = new Class202(3, Static275.aClass198_15, 3);

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_6 = new Class202(4, Static275.aClass198_15, Static275.aClass198_15, 3, 4);

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_7 = new Class202(5, Static275.aClass198_15, 4);

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_8 = new Class202(6, Static275.aClass198_15, 4);

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_9 = new Class202(7, Static275.aClass198_15, Static275.aClass198_15, 4, 5);

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_10 = new Class202(8, Static275.aClass198_15, Static275.aClass198_15, 5, 98, true, true);

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_11 = new Class202(9, Static275.aClass198_15, 99);

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_12 = new Class202(10, Static275.aClass198_15, 100);

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_13 = new Class202(11, Static275.aClass198_16, Static275.aClass198_16, 0, 92, true, true);

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_14 = new Class202(12, Static275.aClass198_16, Static275.aClass198_16, 92, 92);

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "Lclient!kq;")
	private static final Class202 aClass202_15 = new Class202(13, Static275.aClass198_16, Static275.aClass198_16, 92, 93);

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_16 = new Class202(14, Static275.aClass198_16, Static275.aClass198_16, 94, 95);

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_17 = new Class202(15, Static275.aClass198_16, Static275.aClass198_16, 96, 97);

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_18 = new Class202(16, Static275.aClass198_16, 97);

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_19 = new Class202(17, Static275.aClass198_16, 97);

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_20 = new Class202(18, Static275.aClass198_16, 98);

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_21 = new Class202(19, Static275.aClass198_16, 100);

	@OriginalMember(owner = "client!kq", name = "I", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_22 = new Class202(20, Static275.aClass198_16, 100);

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "Lclient!kq;")
	public static final Class202 aClass202_23 = new Class202(21, Static275.aClass198_16, 100);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)[Lclient!kq;")
	public static Class202[] method4435() {
		return new Class202[] { aClass202_2, aClass202_3, aClass202_4, aClass202_5, aClass202_6, aClass202_7, aClass202_8, aClass202_9, aClass202_10, aClass202_11, aClass202_12, aClass202_13, aClass202_14, aClass202_15, aClass202_16, aClass202_17, aClass202_18, aClass202_19, aClass202_20, aClass202_21, aClass202_22, aClass202_23 };
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIB)I")
	public static int method4438(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub20 local14 = Static17.method367(arg0, false);
		if (local14 == null) {
			return Static20.aClass142_1.method3547(arg0).anInt7836;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray309.length; local34++) {
			if (local14.anIntArray309[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static20.aClass142_1.method3547(arg0).anInt7836 - local14.anIntArray309.length;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V")
	public static void method4439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static572.method7817(Static252.anInt4971, arg0, Static359.anInt6232);
		@Pc(17) int local17 = Static572.method7817(Static252.anInt4971, arg2, Static359.anInt6232);
		@Pc(23) int local23 = Static572.method7817(Static68.anInt1306, arg3, Static589.anInt9684);
		@Pc(33) int local33 = Static572.method7817(Static68.anInt1306, arg1, Static589.anInt9684);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static336.method5023(arg4, local33, Static383.anIntArrayArray62[local35], local23);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ID)V")
	public static void method4440(@OriginalArg(1) double arg0) {
		if (Static160.aDouble1 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static354.anIntArray512[local11] = local23 > 255 ? 255 : local23;
		}
		Static160.aDouble1 = arg0;
	}
}
