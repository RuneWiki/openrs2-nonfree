import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_74 = Static32.method683("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_75 = Static32.method683("Mem:");

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	public static void method94() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static133.anInt3713 - 1; local13++) {
				if (Static30.aShortArray1[local13] < 1000 && Static30.aShortArray1[local13 + 1] > 1000) {
					local7 = false;
					@Pc(33) Class49 local33 = Static161.aClass49Array19[local13];
					Static161.aClass49Array19[local13] = Static161.aClass49Array19[local13 + 1];
					Static161.aClass49Array19[local13 + 1] = local33;
					@Pc(51) Class49 local51 = Static102.aClass49Array15[local13];
					Static102.aClass49Array15[local13] = Static102.aClass49Array15[local13 + 1];
					Static102.aClass49Array15[local13 + 1] = local51;
					@Pc(69) int local69 = Static130.anIntArray347[local13];
					Static130.anIntArray347[local13] = Static130.anIntArray347[local13 + 1];
					Static130.anIntArray347[local13 + 1] = local69;
					@Pc(87) int local87 = Static177.anIntArray362[local13];
					Static177.anIntArray362[local13] = Static177.anIntArray362[local13 + 1];
					Static177.anIntArray362[local13 + 1] = local87;
					@Pc(105) short local105 = Static30.aShortArray1[local13];
					Static30.aShortArray1[local13] = Static30.aShortArray1[local13 + 1];
					Static30.aShortArray1[local13 + 1] = local105;
					@Pc(123) long local123 = Static66.aLongArray10[local13];
					Static66.aLongArray10[local13] = Static66.aLongArray10[local13 + 1];
					Static66.aLongArray10[local13 + 1] = local123;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
	public static boolean method95(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[B)V")
	public static void method96(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg0);
		local10.anInt3940 = arg0.length - 2;
		Static116.anInt2433 = local10.method2933();
		Static178.anIntArray364 = new int[Static116.anInt2433];
		Static63.anIntArray165 = new int[Static116.anInt2433];
		Static9.aByteArrayArray1 = new byte[Static116.anInt2433][];
		Static142.anIntArray282 = new int[Static116.anInt2433];
		Static20.anIntArray41 = new int[Static116.anInt2433];
		local10.anInt3940 = arg0.length - Static116.anInt2433 * 8 - 7;
		Static103.anInt2179 = local10.method2933();
		Static148.anInt3150 = local10.method2933();
		@Pc(62) int local62 = (local10.method2962() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static116.anInt2433; local64++) {
			Static142.anIntArray282[local64] = local10.method2933();
		}
		for (@Pc(82) int local82 = 0; local82 < Static116.anInt2433; local82++) {
			Static178.anIntArray364[local82] = local10.method2933();
		}
		for (@Pc(105) int local105 = 0; local105 < Static116.anInt2433; local105++) {
			Static20.anIntArray41[local105] = local10.method2933();
		}
		for (@Pc(123) int local123 = 0; local123 < Static116.anInt2433; local123++) {
			Static63.anIntArray165[local123] = local10.method2933();
		}
		local10.anInt3940 = arg0.length - Static116.anInt2433 * 8 - (local62 - 1) * 3 - 7;
		Static47.anIntArray105 = new int[local62];
		for (@Pc(162) int local162 = 1; local162 < local62; local162++) {
			Static47.anIntArray105[local162] = local10.method2942();
			if (Static47.anIntArray105[local162] == 0) {
				Static47.anIntArray105[local162] = 1;
			}
		}
		local10.anInt3940 = 0;
		for (@Pc(191) int local191 = 0; local191 < Static116.anInt2433; local191++) {
			@Pc(197) int local197 = Static63.anIntArray165[local191];
			@Pc(201) int local201 = Static20.anIntArray41[local191];
			@Pc(205) int local205 = local201 * local197;
			@Pc(208) byte[] local208 = new byte[local205];
			Static9.aByteArrayArray1[local191] = local208;
			@Pc(216) int local216 = local10.method2962();
			@Pc(223) int local223;
			if (local216 == 0) {
				for (local223 = 0; local223 < local205; local223++) {
					local208[local223] = local10.method2948();
				}
			} else if (local216 == 1) {
				for (local223 = 0; local223 < local201; local223++) {
					for (@Pc(248) int local248 = 0; local248 < local197; local248++) {
						local208[local223 + local201 * local248] = local10.method2948();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
	public static void method97() {
		aCanvas1 = null;
		aClass49_75 = null;
		aClass49_74 = null;
	}
}
