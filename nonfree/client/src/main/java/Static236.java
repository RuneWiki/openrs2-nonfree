import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public static int anInt4520;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[250][];

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!on;")
	public static Class146 aClass146_13 = null;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	public static int anInt4526 = 0;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public static int anInt4527 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
	public static boolean method4072() {
		return Static96.aBoolean181;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)V")
	public static void method4074() {
		@Pc(8) int local8 = Static121.aByteArrayArray8.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			if (Static121.aByteArrayArray8[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static274.anInt5617; local25++) {
					if (Static350.anIntArray503[local25] == Static201.anIntArray310[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static350.anIntArray503[Static274.anInt5617] = Static201.anIntArray310[local15];
					local23 = Static274.anInt5617++;
				}
				@Pc(72) Class2_Sub10 local72 = new Class2_Sub10(Static121.aByteArrayArray8[local15]);
				@Pc(74) int local74 = 0;
				while (local72.anInt4807 < Static121.aByteArrayArray8[local15].length && local74 < 511 && Static169.anInt3463 < 1023) {
					@Pc(93) int local93 = local74++ << 6 | local23;
					@Pc(97) int local97 = local72.method4464();
					@Pc(101) int local101 = local97 >> 14;
					@Pc(107) int local107 = local97 >> 7 & 0x3F;
					@Pc(111) int local111 = local97 & 0x3F;
					@Pc(124) int local124 = local107 + (Static201.anIntArray310[local15] >> 8) * 64 - Static138.anInt2879;
					@Pc(136) int local136 = (Static201.anIntArray310[local15] & 0xFF) * 64 + local111 - Static342.anInt6864;
					@Pc(142) Class186 local142 = Static83.method1900(local72.method4464());
					if (Static37.aClass62_Sub1_Sub2_Sub1Array1[local93] == null && (local142.aByte63 & 0x1) > 0 && local101 == Static69.anInt1511 && local124 >= 0 && Static95.anInt6381 > local124 + local142.anInt5977 && local136 >= 0 && Static237.anInt4532 > local142.anInt5977 + local136) {
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local93] = new Class62_Sub1_Sub2_Sub1();
						Static37.aClass62_Sub1_Sub2_Sub1Array1[local93].anInt5328 = local93;
						@Pc(201) Class62_Sub1_Sub2_Sub1 local201 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local93];
						Static98.anIntArray215[Static169.anInt3463++] = local93;
						local201.anInt5333 = Static212.anInt4090;
						local201.method4723(local142);
						local201.method4782(local201.aClass186_1.anInt5977);
						local201.anInt5294 = local201.aClass186_1.anInt5947 << 3;
						if (local201.anInt5294 == 0) {
							local201.method4783(0);
						} else {
							local201.method4783(local201.aClass186_1.aByte65 + 4 << 11 & 0x3EA0);
						}
						local201.method4771(local101, local201.method4777(), local124, local136, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method4077(@OriginalArg(1) Class191 arg0) {
		Static166.aClass191_103 = arg0;
		Static108.anInt2399 = Static166.aClass191_103.method5443(16);
	}
}
