import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[Lclient!gb;")
	public static Class58_Sub1[] aClass58_Sub1Array2;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!jj;")
	public static Class87 aClass87_7;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt5490 = 0;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt5494 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method4342() {
		while (Static239.aFloat51 >= 2048.0F) {
			Static239.aFloat51 -= 2048.0F;
		}
		if (Static148.aFloat33 < 128.0F) {
			Static148.aFloat33 = 128.0F;
		}
		if (Static148.aFloat33 > 383.0F) {
			Static148.aFloat33 = 383.0F;
		}
		@Pc(37) int local37 = Static254.anInt4978 >> 7;
		while (Static239.aFloat51 < 0.0F) {
			Static239.aFloat51 += 2048.0F;
		}
		@Pc(51) int local51 = Static101.anInt2397 >> 7;
		@Pc(57) int local57 = Static234.method3798(Static101.anInt2397, Static254.anInt4978, Static32.anInt876);
		@Pc(59) int local59 = 0;
		@Pc(81) int local81;
		if (local37 > 3 && local51 > 3 && local37 < 100 && local51 < 100) {
			for (local81 = local37 - 4; local81 <= local37 + 4; local81++) {
				for (@Pc(90) int local90 = local51 - 4; local90 <= local51 + 4; local90++) {
					@Pc(97) int local97 = Static32.anInt876;
					if (local97 < 3 && (Static13.aByteArrayArrayArray2[1][local81][local90] & 0x2) == 2) {
						local97++;
					}
					@Pc(137) int local137 = (Static76.aByteArrayArrayArray5[local97][local81][local90] & 0xFF) * 8 + local57 - Static9.anIntArrayArrayArray7[local97][local81][local90];
					if (local137 > local59) {
						local59 = local137;
					}
				}
			}
		}
		local81 = local59 * 192;
		if (local81 > 98048) {
			local81 = 98048;
		}
		if (local81 < 32768) {
			local81 = 32768;
		}
		if (Static269.anInt5284 < local81) {
			Static269.anInt5284 += (local81 - Static269.anInt5284) / 24;
		} else if (Static269.anInt5284 > local81) {
			Static269.anInt5284 += (local81 - Static269.anInt5284) / 80;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZ)V")
	public static void method4343(@OriginalArg(1) boolean arg0) {
		if (Static138.aBoolean215 != arg0) {
			Static138.aBoolean215 = arg0;
			Static231.method3758();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([IZ)[I")
	public static int[] method4344(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) int[] local12 = new int[arg0.length];
			Static323.method3550(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[B)I")
	public static int method4345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = Class77_Sub2.anIntArray492[(arg2[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4347(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static56.anInt1437 >= 100) {
			Static315.method4765(Static280.aString193);
			return;
		}
		@Pc(29) String local29 = Static5.method3854(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(45) String local45;
		@Pc(75) String local75;
		for (local36 = 0; local36 < Static56.anInt1437; local36++) {
			local45 = Static5.method3854(Static242.aStringArray38[local36]);
			if (local45 != null && local45.equals(local29)) {
				Static315.method4765(arg0 + Static58.aString52);
				return;
			}
			if (Static262.aStringArray43[local36] != null) {
				local75 = Static5.method3854(Static262.aStringArray43[local36]);
				if (local75 != null && local75.equals(local29)) {
					Static315.method4765(arg0 + Static58.aString52);
					return;
				}
			}
		}
		for (local36 = 0; local36 < Static41.anInt999; local36++) {
			local45 = Static5.method3854(Static222.aStringArray34[local36]);
			if (local45 != null && local45.equals(local29)) {
				Static315.method4765(Static61.aString54 + arg0 + Static243.aString166);
				return;
			}
			if (Static151.aStringArray25[local36] != null) {
				local75 = Static5.method3854(Static151.aStringArray25[local36]);
				if (local75 != null && local75.equals(local29)) {
					Static315.method4765(Static61.aString54 + arg0 + Static243.aString166);
					return;
				}
			}
		}
		if (Static5.method3854(Static22.aClass15_Sub2_Sub2_1.aString184).equals(local29)) {
			Static315.method4765(Static282.aString198);
		} else {
			Static211.aClass2_Sub16_Sub1_2.method2198(68);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0) + 1);
			Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
			Static211.aClass2_Sub16_Sub1_2.method2168(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public static void method4348(@OriginalArg(0) int arg0) {
		Static235.method3809(Static235.anInt4714, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static235.method3802(-50.0F, -60.0F, -50.0F);
		Static235.method3803(Static235.anInt4717, 0, false);
		Static235.method3810();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method4349(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(16) byte[] local16 = (byte[]) arg0;
			return arg1 ? Static187.method3283(local16) : local16;
		} else if (arg0 instanceof Class14) {
			@Pc(37) Class14 local37 = (Class14) arg0;
			return local37.method348();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
