import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_14 = new Class27(79, -1);

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Lclient!s;")
	public static final Class217 aClass217_20 = new Class217(84, 16);

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_15 = new Class27(16, 6);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method478() {
		if (Static451.anIntArray744 != null) {
			return;
		}
		Static451.anIntArray744 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(39) double local39 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = local57 * (local50 + 1.0D);
				} else {
					local80 = local57 + local50 - local50 * local57;
				}
				@Pc(94) double local94 = local57 * 2.0D - local80;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + (local80 - local94) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * 6.0D * (local80 - local94) + local94;
				} else {
					local61 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local94 + local98 * (local80 - local94) * 6.0D;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local98) * (local80 - local94) * 6.0D + local94;
				} else {
					local59 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + local112 * 6.0D * (local80 - local94);
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local112) * (local80 - local94) * 6.0D + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(310) int local310 = (local295 << 8) + (local290 << 16) + local300;
			Static451.anIntArray744[local21] = local310;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Lclient!eo;")
	public static Class46 method479() {
		try {
			return (Class46) Class.forName("Class46_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)I")
	public static int method481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static201.method3171(local7, local17);
		@Pc(37) int local37 = Static201.method3171(local7 + 1, local17);
		@Pc(46) int local46 = Static201.method3171(local7, local17 + 1);
		@Pc(55) int local55 = Static201.method3171(local7 + 1, local17 - -1);
		@Pc(62) int local62 = Static92.method1707(local13, local37, local28, arg0);
		@Pc(69) int local69 = Static92.method1707(local13, local55, local46, arg0);
		return Static92.method1707(local23, local69, local62, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
	public static void method482() {
		Static207.anInt4055 = 0;
		Static70.aClass163_13.method3619();
		Static70.aClass163_13.method3613(Static407.aClass10_Sub45_2);
		Static207.anInt4055++;
	}
}
