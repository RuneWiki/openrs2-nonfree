import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!ow;")
	public static Class181 aClass181_1;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Lclient!lo;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public static int anInt1155 = 64;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "[I")
	public static final int[] anIntArray58 = new int[100];

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!kw;III)V")
	public static void method1149(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static60.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt6979 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub7Array3[arg0.anInt6979++] = Static197.aClass226Array1[local21 - 1].aClass3_Sub7_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt6979; local21 < 4; local21++) {
			arg0.aClass3_Sub7Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1151(@OriginalArg(0) String arg0) {
		if (Static363.aStringArray39 == null) {
			Static255.method3578();
		}
		@Pc(22) String[] local22 = Static403.method5514(arg0, '\n');
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static458.anInt7716; local28 > 0; local28--) {
				Static363.aStringArray39[local28] = Static363.aStringArray39[local28 - 1];
			}
			Static363.aStringArray39[0] = local22[local24];
			if (Static458.anInt7716 < Static363.aStringArray39.length - 1) {
				if (Static22.anInt381 > 0) {
					Static22.anInt381++;
				}
				Static458.anInt7716++;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
	public static void method1152() {
		Static401.aClass82Array2 = null;
		Static55.method1094(Static343.anInt5785, 0, 0, -1, Static310.anInt5307, 0, 0, Static166.anInt3014);
		if (Static401.aClass82Array2 != null) {
			Static380.method5283(Static166.anInt3014, 0, Static260.aClass82_22.anInt2224, Static310.anInt5307, 0, Static401.aClass82Array2, Static438.anInt2389, Static137.anInt2419, -1412584499);
			Static401.aClass82Array2 = null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ip;II)Lclient!ew;")
	public static Class3_Sub3_Sub8 method1155(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg0.anInt3326;
		@Pc(19) Class3_Sub3_Sub8 local19 = (Class3_Sub3_Sub8) Static248.aClass85_6.method2040((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static317.aClass250_79.method5814(Static317.aClass250_79.method5817(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 8 | arg0.anInt3326;
			local19 = (Class3_Sub3_Sub8) Static248.aClass85_6.method2040((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static317.aClass250_79.method5814(Static317.aClass250_79.method5817(local10));
			if (local31 == null) {
				local10 = arg0.anInt3326 | 0xFFFF00;
				local19 = (Class3_Sub3_Sub8) Static248.aClass85_6.method2040((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static317.aClass250_79.method5814(Static317.aClass250_79.method5817(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static360.method5046(local31);
					local19.aClass111_2 = arg0;
					Static248.aClass85_6.method2039(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static360.method5046(local31);
				local19.aClass111_2 = arg0;
				Static248.aClass85_6.method2039(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static360.method5046(local31);
			local19.aClass111_2 = arg0;
			Static248.aClass85_6.method2039(local19, (long) local10 << 16);
			return local19;
		}
	}
}
