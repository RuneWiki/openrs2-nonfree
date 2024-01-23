import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array7;

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString66 = "Loaded defaults";

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
	public static int anInt2226 = 0;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
	public static void method1699() {
		aString66 = null;
		aClass4_Sub2_Sub1Array7 = null;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V")
	public static void method1700() {
		while (Static270.aFloat49 >= 2048.0F) {
			Static270.aFloat49 -= 2048.0F;
		}
		while (Static270.aFloat49 < 0.0F) {
			Static270.aFloat49 += 2048.0F;
		}
		@Pc(25) int local25 = Static127.anInt2702 >> 7;
		@Pc(29) int local29 = Static295.anInt5480 >> 7;
		if (Static96.aFloat16 < 128.0F) {
			Static96.aFloat16 = 128.0F;
		}
		@Pc(37) int local37 = 0;
		if (Static96.aFloat16 > 383.0F) {
			Static96.aFloat16 = 383.0F;
		}
		@Pc(54) int local54 = Static96.method1559(Static210.anInt4103, Static295.anInt5480, Static127.anInt2702);
		@Pc(76) int local76;
		if (local25 > 3 && local29 > 3 && local25 < 100 && local29 < 100) {
			for (local76 = local25 - 4; local76 <= local25 + 4; local76++) {
				for (@Pc(85) int local85 = local29 - 4; local85 <= local29 + 4; local85++) {
					@Pc(92) int local92 = Static210.anInt4103;
					if (local92 < 3 && (Static46.aByteArrayArrayArray2[1][local76][local85] & 0x2) == 2) {
						local92++;
					}
					@Pc(132) int local132 = local54 + (Static35.aByteArrayArrayArray1[local92][local76][local85] & 0xFF) * 8 - Static250.anIntArrayArrayArray13[local92][local76][local85];
					if (local132 > local37) {
						local37 = local132;
					}
				}
			}
		}
		local76 = local37 * 192;
		if (local76 > 98048) {
			local76 = 98048;
		}
		if (local76 < 32768) {
			local76 = 32768;
		}
		if (Static40.anInt850 < local76) {
			Static40.anInt850 += (local76 - Static40.anInt850) / 24;
		} else if (local76 < Static40.anInt850) {
			Static40.anInt850 += (local76 - Static40.anInt850) / 80;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1701(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg1;
			return arg0 ? Static7.method145(local22) : local22;
		} else if (arg1 instanceof Class20) {
			@Pc(37) Class20 local37 = (Class20) arg1;
			return local37.method444();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZIIIII)V")
	public static void method1702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class7[] local10 = Static250.aClass7Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) Class7 local20 = local10[local12];
			if (local20 != null && local20.anInt135 == 2) {
				Static134.method2174(local20.anInt136 * 2, arg0 >> 1, (local20.anInt139 - Static239.anInt4613 << 7) + local20.anInt132, arg2, (local20.anInt137 - Static170.anInt3385 << 7) + local20.anInt138, arg3, arg1 >> 1);
				if (Static89.anInt1837 > -1 && anInt2226 % 20 < 10) {
					Static39.aClass4_Sub2_Sub1Array12[local20.anInt131].method3454(arg4 + Static89.anInt1837 - 12, Static280.anInt5319 + -28 + arg5);
				}
			}
		}
	}
}
