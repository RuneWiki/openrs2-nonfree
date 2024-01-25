import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public static int anInt2759;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt2760;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt2762;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!wo;")
	public static Class216 aClass216_41;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lclient!bn;")
	public static Class23[] aClass23Array2;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt2761 = 1;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method2557(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub4_Sub9 local10 = Static139.method4227(arg0, 6);
		local10.method1868();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!uo;)V")
	private static void method2558(@OriginalArg(1) Class32 arg0) {
		@Pc(5) int local5 = Static210.anInt4473;
		@Pc(7) int local7 = Static339.anInt6506;
		@Pc(9) int local9 = Static198.anInt1219;
		@Pc(11) int local11 = Static282.anInt6601;
		arg0.method2191(-10660793, local5, local9, local7, local11);
		arg0.method2191(-16777216, local5 + 1, local9 + -2, local7 + 1, 16);
		arg0.method2183(local5 + 1, local7 + 18, local9 - 2, -16777216, -19 + local11);
		Static49.aClass9_1.method5021(-10660793, local5 + 3, local7 - -14, -1, Static345.aClass34_190.method1285(Static259.anInt2907));
		@Pc(70) int local70 = Static222.aClass84_1.method5408();
		@Pc(74) int local74 = Static222.aClass84_1.method5406();
		@Pc(76) int local76 = 0;
		for (@Pc(81) Class1_Sub23 local81 = (Class1_Sub23) Static188.aClass16_22.method410(); local81 != null; local81 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			@Pc(97) int local97 = (Static115.anInt2635 - local76 - 1) * 16 + local7 + 31;
			@Pc(99) short local99 = -1;
			if (local5 < local70 && local70 < local5 + local9 && local74 > local97 - 13 && local97 + 3 > local74) {
				local99 = -256;
			}
			@Pc(126) int[] local126 = null;
			if (Static63.method4864(local81.anInt3588)) {
				local126 = Static20.method561((int) local81.aLong121).anIntArray273;
			} else if (Static90.method1960(local81.anInt3588)) {
				@Pc(142) Class17_Sub1_Sub1_Sub2 local142 = Static140.aClass17_Sub1_Sub1_Sub2Array1[(int) local81.aLong121];
				if (local142 != null) {
					local126 = local142.aClass213_1.anIntArray520;
				}
			} else if (Static324.method5276(local81.anInt3588)) {
				if (local81.anInt3588 == 1011) {
					local126 = Static119.method2548((int) local81.aLong121).anIntArray390;
				} else {
					local126 = Static119.method2548((int) (local81.aLong121 >>> 32 & 0x7FFFFFFFL)).anIntArray390;
				}
			}
			@Pc(189) String local189 = Static247.method4448(local81);
			if (local126 != null) {
				local189 = local189 + Static229.method757(local126);
			}
			local76++;
			Static49.aClass9_1.method5002(local5 + 3, local97, local189, Static197.aClass5Array16, Static279.anIntArray476, local99);
		}
		Static255.method4604(Static210.anInt4473, Static339.anInt6506, Static198.anInt1219, Static282.anInt6601);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ol;II)J")
	public static long method2560(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(20) Class141 local20 = Static119.method2548(arg1.method4799());
		@Pc(41) long local41 = (long) (arg1.method4794() << 14 | arg2 << 7 | arg0 | arg1.method4797() << 20 | 0x40000000);
		if (local20.anInt4294 == 0) {
			local41 |= local14;
		}
		if (local20.anInt4283 == 1) {
			local41 |= local10;
		}
		if (local20.aBoolean407) {
			local41 |= local12;
		}
		return local41 | (long) arg1.method4799() << 32;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(BLclient!uo;)V")
	public static void method2561(@OriginalArg(1) Class32 arg0) {
		if (Static337.aBoolean630) {
			Static354.method5637(arg0);
		} else {
			method2558(arg0);
		}
	}
}
