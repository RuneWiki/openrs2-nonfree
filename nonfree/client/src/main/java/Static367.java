import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!km;")
	public static Class82 aClass82_9;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_173 = new Class77(74, 6);

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
	public static final int[] anIntArray779 = new int[2048];

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "[I")
	public static final int[] anIntArray780 = new int[2048];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z")
	public static boolean method5540(@OriginalArg(0) int arg0) {
		return arg0 == 50 || arg0 == 23 || arg0 == 1004 || arg0 == 13 || arg0 == 59;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method5541() {
		@Pc(7) Class202 local7 = null;
		try {
			@Pc(16) Class1 local16 = Static92.aClass53_2.method1177();
			while (local16.anInt2 == 0) {
				Static185.method3004(1L);
			}
			if (local16.anInt2 == 1) {
				local7 = (Class202) local16.anObject1;
				@Pc(44) Class2_Sub13 local44 = new Class2_Sub13(Static249.anInt4494 * 6 + 3);
				local44.method4207(1);
				local44.method4199(Static249.anInt4494);
				for (@Pc(54) int local54 = 0; local54 < Static61.anIntArray162.length; local54++) {
					if (Static267.aBooleanArray110[local54]) {
						local44.method4199(local54);
						local44.method4218(Static61.anIntArray162[local54]);
					}
				}
				local7.method4944(0, local44.aByteArray77, local44.anInt4788);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method4940();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static317.aLong174 = Static51.method979();
		Static243.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method5542(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static100.method1790(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local42 >= local39);
			return Static154.method2585(arg0, local42);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B[B)Lclient!ni;")
	public static Class2_Sub1_Sub11 method5544(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub1_Sub11 local9 = new Class2_Sub1_Sub11();
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		local14.anInt4788 = local14.aByteArray77.length - 2;
		@Pc(25) int local25 = local14.method4245();
		@Pc(36) int local36 = local14.aByteArray77.length - local25 - 2 - 12;
		local14.anInt4788 = local36;
		@Pc(43) int local43 = local14.method4239();
		local9.anInt4335 = local14.method4245();
		local9.anInt4337 = local14.method4245();
		local9.anInt4341 = local14.method4245();
		local9.anInt4338 = local14.method4245();
		@Pc(67) int local67 = local14.method4240();
		@Pc(75) int local75;
		@Pc(81) int local81;
		if (local67 > 0) {
			local9.aClass214Array1 = new Class214[local67];
			for (local75 = 0; local75 < local67; local75++) {
				local81 = local14.method4245();
				@Pc(88) Class214 local88 = new Class214(Static353.method5359(local81));
				local9.aClass214Array1[local75] = local88;
				while (local81-- > 0) {
					@Pc(99) int local99 = local14.method4239();
					@Pc(103) int local103 = local14.method4239();
					local88.method5065((long) local99, new Class2_Sub44(local103));
				}
			}
		}
		local14.anInt4788 = 0;
		local9.aString42 = local14.method4232();
		local9.anIntArray530 = new int[local43];
		local9.anIntArray531 = new int[local43];
		local9.aStringArray29 = new String[local43];
		local75 = 0;
		while (local14.anInt4788 < local36) {
			local81 = local14.method4245();
			if (local81 == 3) {
				local9.aStringArray29[local75] = local14.method4201().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local9.anIntArray530[local75] = local14.method4240();
			} else {
				local9.anIntArray530[local75] = local14.method4239();
			}
			local9.anIntArray531[local75++] = local81;
		}
		return local9;
	}
}
