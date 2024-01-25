import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!l;")
	public static Class143 aClass143_29;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt5726;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ya;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4753(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static242.aClass39_7 = arg0;
		Static38.anInt764 = arg1;
		Static227.aClass33_3 = arg3;
		Static293.aBoolean372 = Static242.aClass39_7.method4520() > 0;
		Static398.anInt6395 = arg4 >> Static31.anInt665;
		Static350.anInt5829 = arg6 >> Static31.anInt665;
		Static396.anInt6364 = arg4;
		Static263.anInt4683 = arg6;
		Static146.anInt2808 = arg5;
		Static397.anInt6377 = Static398.anInt6395 - Static75.anInt1695;
		if (Static397.anInt6377 < 0) {
			Static241.anInt4414 = -Static397.anInt6377;
			Static397.anInt6377 = 0;
		} else {
			Static241.anInt4414 = 0;
		}
		Static312.anInt5398 = Static350.anInt5829 - Static75.anInt1695;
		if (Static312.anInt5398 < 0) {
			Static408.anInt6575 = -Static312.anInt5398;
			Static312.anInt5398 = 0;
		} else {
			Static408.anInt6575 = 0;
		}
		Static190.anInt3419 = Static398.anInt6395 + Static75.anInt1695;
		if (Static190.anInt3419 > Static132.anInt2639) {
			Static190.anInt3419 = Static132.anInt2639;
		}
		Static27.anInt608 = Static350.anInt5829 + Static75.anInt1695;
		if (Static27.anInt608 > Static87.anInt1875) {
			Static27.anInt608 = Static87.anInt1875;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static75.anInt1695 + Static75.anInt1695 + 2; local74++) {
			for (local77 = 0; local77 < Static75.anInt1695 + Static75.anInt1695 + 2; local77++) {
				local84 = Static398.anInt6395 + local74 - Static75.anInt1695;
				local90 = Static350.anInt5829 + local77 - Static75.anInt1695;
				if (local84 >= 0 && local90 >= 0 && local84 < Static132.anInt2639 && local90 < Static87.anInt1875) {
					@Pc(104) int local104 = local84 << Static31.anInt665;
					@Pc(108) int local108 = local90 << Static31.anInt665;
					@Pc(124) int local124 = Static269.aClass149Array2[Static269.aClass149Array2.length - 1].l(local84, local90) - (0x3E8 << Static31.anInt665 - 7);
					@Pc(144) int local144 = Static277.aClass149Array3 == null ? Static269.aClass149Array2[0].l(local84, local90) + Static186.anInt3374 : Static277.aClass149Array3[0].l(local84, local90) + Static186.anInt3374;
					Static390.aBooleanArrayArray8[local74][local77] = Static242.aClass39_7.JA(local104, local124, local108, local104, local144, local108);
				} else {
					Static390.aBooleanArrayArray8[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static75.anInt1695 + Static75.anInt1695 + 1; local77++) {
			for (local84 = 0; local84 < Static75.anInt1695 + Static75.anInt1695 + 1; local84++) {
				Static23.aBooleanArrayArray4[local77][local84] = Static390.aBooleanArrayArray8[local77][local84] || Static390.aBooleanArrayArray8[local77 + 1][local84] || Static390.aBooleanArrayArray8[local77][local84 + 1] || Static390.aBooleanArrayArray8[local77 + 1][local84 + 1];
			}
		}
		Static227.anIntArray338 = arg8;
		Static61.anIntArray95 = arg9;
		Static20.anIntArray435 = arg10;
		Static39.anIntArray63 = arg11;
		Static274.anIntArray425 = arg12;
		Static169.method2684();
		Static47.method862();
		for (@Pc(260) Class4_Sub1 local260 = (Class4_Sub1) Static36.aClass141_2.method3357(); local260 != null; local260 = (Class4_Sub1) Static36.aClass141_2.method3360()) {
			local260.method5737();
			Static221.method2304(local260);
		}
		if (Static293.aBoolean372) {
			for (local90 = 0; local90 < Static54.anInt1001; local90++) {
				Static124.aClass243Array5[local90].method5437(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static242.aClass39_7.method4493(0);
			if (Static135.aClass6_1 == null || Static135.aClass6_1 instanceof Class6_Sub2) {
				Static135.aClass6_1 = new Class6_Sub1();
			}
		} else if (Static135.aClass6_1 == null || Static135.aClass6_1 instanceof Class6_Sub1) {
			Static135.aClass6_1 = new Class6_Sub2();
		}
		Static135.aClass6_1.method5188(arg2);
		Static135.aClass6_1.method5192();
		if (Static346.aClass80ArrayArrayArray3 != null) {
			Static211.method3342(true);
			Static135.aClass6_1.method5191(22);
			Static315.method4478(arg2, null, 0, (byte) 0, arg15, arg16);
			Static135.aClass6_1.method5192();
			Static135.aClass6_1.method5191(23);
			Static211.method3342(false);
		}
		Static315.method4478(arg2, arg7, arg13, arg14, arg15, arg16);
		Static135.aClass6_1.method5192();
		Static135.aClass6_1.method5185();
		Static135.aClass6_1.method5192();
		if (arg2 > 1) {
			Static242.aClass39_7.method4531(0);
		}
		Static242.aClass39_7.method4560(0, null);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!od;III)Ljava/awt/Frame;")
	public static Frame method4756(@OriginalArg(2) Class180 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method4088()) {
			return null;
		}
		@Pc(27) Class206[] local27 = Static357.method4899(arg0);
		if (local27 == null) {
			return null;
		}
		@Pc(33) boolean local33 = false;
		for (@Pc(35) int local35 = 0; local35 < local27.length; local35++) {
			if (arg2 == local27[local35].anInt5763 && local27[local35].anInt5765 == arg3 && (!local33 || local27[local35].anInt5766 > arg1)) {
				local33 = true;
				arg1 = local27[local35].anInt5766;
			}
		}
		if (!local33) {
			return null;
		}
		@Pc(107) Class9 local107 = arg0.method4096(arg3, arg2, arg1);
		while (local107.anInt368 == 0) {
			Static224.method3441(10L);
		}
		@Pc(118) Frame local118 = (Frame) local107.anObject2;
		if (local118 == null) {
			return null;
		} else if (local107.anInt368 == 2) {
			Static410.method5508(arg0, local118);
			return null;
		} else {
			return local118;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZ)I")
	public static int method4759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub14 local8 = Static48.method871(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray145.length) {
			return local8.anIntArray145[arg0];
		} else {
			return 0;
		}
	}
}
