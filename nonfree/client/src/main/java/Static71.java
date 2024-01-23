import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[Lclient!v;")
	public static Class163[] aClass163Array1 = new Class163[14];

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!im;B)V")
	public static void method1320(@OriginalArg(0) Class1_Sub16 arg0) {
		label84: while (true) {
			if (arg0.anInt3328 < arg0.aByteArray39.length) {
				@Pc(13) boolean local13 = false;
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 0;
				if (arg0.method2655() == 1) {
					local15 = arg0.method2655();
					local17 = arg0.method2655();
					local13 = true;
				}
				@Pc(41) int local41 = arg0.method2655();
				@Pc(45) int local45 = arg0.method2655();
				@Pc(51) int local51 = local41 * 64 - Static234.anInt5158;
				@Pc(63) int local63 = Static48.anInt1347 + Static173.anInt3932 - local45 * 64 - 1;
				@Pc(101) byte local101;
				@Pc(86) int local86;
				if (local51 >= 0 && local63 - 63 >= 0 && local51 + 63 < Static178.anInt4022 && local63 < Static173.anInt3932) {
					local86 = local51 >> 6;
					@Pc(122) int local122 = local63 >> 6;
					@Pc(124) int local124 = 0;
					while (true) {
						if (local124 >= 64) {
							continue label84;
						}
						for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
							if (!local13 || local124 >= local15 * 8 && local124 < local15 * 8 + 8 && local129 >= local17 * 8 && local17 * 8 + 8 > local129) {
								local101 = arg0.method2633();
								if (local101 != 0) {
									if (Static139.aByteArrayArrayArray54[local86][local122] == null) {
										Static139.aByteArrayArrayArray54[local86][local122] = new byte[4096];
									}
									Static139.aByteArrayArrayArray54[local86][local122][local124 + (63 - local129 << 6)] = local101;
									@Pc(207) byte local207 = arg0.method2633();
									if (Static205.aByteArrayArrayArray41[local86][local122] == null) {
										Static205.aByteArrayArrayArray41[local86][local122] = new byte[4096];
									}
									Static205.aByteArrayArrayArray41[local86][local122][local124 + (63 - local129 << 6)] = local207;
								}
							}
						}
						local124++;
					}
				}
				local86 = 0;
				while (true) {
					if (local86 >= (local13 ? 64 : 4096)) {
						continue label84;
					}
					local101 = arg0.method2633();
					if (local101 != 0) {
						arg0.anInt3328++;
					}
					local86++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1322() {
		Static106.aClass155_18.method4354();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(CLjava/lang/String;B)I")
	public static int method1323(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public static void method1324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class88 local9 = Static249.method4265(arg0);
		@Pc(12) int local12 = local9.anInt3285;
		@Pc(15) int local15 = local9.anInt3277;
		@Pc(22) int local22 = Class1_Sub1_Sub29.anIntArray464[local12 - local15];
		@Pc(25) int local25 = local9.anInt3279;
		if (arg1 < 0 || local22 < arg1) {
			arg1 = 0;
		}
		local22 <<= local15;
		Static229.method4002(local25, local22 & arg1 << local15 | Static265.anIntArray574[local25] & ~local22);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method1325() {
		Static75.aClass155_11.method4354();
		Static9.aClass155_2.method4354();
		Static18.aClass155_6.method4354();
	}
}
