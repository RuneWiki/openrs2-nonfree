import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Lclient!rf;")
	public static Class3_Sub43 aClass3_Sub43_1;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!ej;")
	public static final Class85 aClass85_2 = new Class85();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
	public static void method7042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static576.aByteArrayArrayArray21 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILclient!tc;)V")
	public static void method7044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class305 arg2) {
		if (Static594.aBoolean851) {
			@Pc(11) Class240 local11 = Static115.anInt2652 == -1 ? null : Static299.aClass17_2.method758(Static115.anInt2652);
			if (Static68.method1694(arg2).method1763() && (Static564.anInt10012 & 0x20) != 0 && (local11 == null || arg2.method7492(Static115.anInt2652, local11.anInt7291) != local11.anInt7291)) {
				Static200.method3365(arg2.anInt9167, Static569.aString131 + " -> " + arg2.aString110, 0L, Static590.aString133, 50, arg2.anInt9216, false, Static120.anInt2749, arg2.anInt9159, true);
			}
		}
		@Pc(72) String local72;
		for (@Pc(66) int local66 = 9; local66 >= 5; local66--) {
			local72 = Static112.method2314(local66, arg2);
			if (local72 != null) {
				Static200.method3365(arg2.anInt9167, arg2.aString110, (long) (local66 + 1), local72, 1003, arg2.anInt9216, false, Static23.method7130(arg2, local66), arg2.anInt9159, true);
			}
		}
		local72 = Static574.method8202(arg2);
		if (local72 != null) {
			Static200.method3365(arg2.anInt9167, arg2.aString110, 0L, local72, 5, arg2.anInt9216, false, arg2.lb, arg2.anInt9159, true);
		}
		for (@Pc(135) int local135 = 4; local135 >= 0; local135--) {
			@Pc(141) String local141 = Static112.method2314(local135, arg2);
			if (local141 != null) {
				Static200.method3365(arg2.anInt9167, arg2.aString110, (long) (local135 + 1), local141, 15, arg2.anInt9216, false, Static23.method7130(arg2, local135), arg2.anInt9159, true);
			}
		}
		if (!Static68.method1694(arg2).method1760()) {
			return;
		}
		if (arg2.aString108 == null) {
			Static200.method3365(arg2.anInt9167, "", 0L, Static139.aClass101_8.method2841(Static126.anInt2904), 11, arg2.anInt9216, false, -1, arg2.anInt9159, true);
		} else {
			Static200.method3365(arg2.anInt9167, "", 0L, arg2.aString108, 11, arg2.anInt9216, false, -1, arg2.anInt9159, true);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7045(@OriginalArg(0) String arg0) {
		if (Static171.aStringArray14 == null) {
			Static313.method5255();
		}
		@Pc(14) String[] local14 = Static335.method5785('\n', arg0);
		for (@Pc(23) int local23 = 0; local23 < local14.length; local23++) {
			for (@Pc(26) int local26 = Static413.anInt8076; local26 > 0; local26--) {
				Static171.aStringArray14[local26] = Static171.aStringArray14[local26 - 1];
			}
			Static171.aStringArray14[0] = local14[local23];
			if (Static171.aStringArray14.length - 1 > Static413.anInt8076) {
				Static413.anInt8076++;
				if (Static86.anInt1983 > 0) {
					Static86.anInt1983++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[B")
	public static byte[] method7046(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub4 local10 = (Class3_Sub4_Sub4) Static452.aClass308_4.method7537((long) arg0);
		if (local10 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(49) int local49 = 255 - local43;
				@Pc(54) int local54 = Static137.method2798(local29, local49);
				@Pc(58) byte local58 = local23[local54];
				local23[local54] = local23[local49];
				local23[local49] = local23[511 - local43] = local58;
			}
			local10 = new Class3_Sub4_Sub4(local23);
			Static452.aClass308_4.method7538((long) arg0, local10);
		}
		return local10.aByteArray14;
	}
}
