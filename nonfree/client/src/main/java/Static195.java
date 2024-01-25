import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "[B")
	public static byte[] aByteArray77;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public static int anInt4513;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public static int anInt4518;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
	public static final int[] anIntArray341 = new int[500];

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
	public static final int[] anIntArray342 = new int[2500];

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)Lclient!wj;")
	public static Class203 method3967() {
		try {
			return (Class203) Class.forName("Class203_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
	public static void method3968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static81.anInt1498 == 2) {
			Static184.anInt3721 = local15;
			Static308.anInt6050 = local7;
			Static157.anInt3004 = 0;
		}
		Static21.aFloat10 = local15;
		Static246.aFloat51 = local7;
		Static51.method731();
		Static81.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZI)V")
	public static void method3969(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static107.aClass129_4 = Static326.method4946(Static34.aCanvas1, Static77.aClass118_7, arg1, Static76.anInterface2_6, Static82.anInt1504 * 2);
		} else {
			if (arg0) {
				Static107.aClass129_4 = Static326.method4946(Static34.aCanvas1, Static77.aClass118_7, 0, Static76.anInterface2_6, 0);
				Static107.aClass129_4.method4930(0);
				@Pc(27) Class114 local27 = Static22.method310(Static318.aClass144_101, Static229.anInt4581);
				@Pc(36) Class9 local36 = Static107.aClass129_4.method4933(local27, Static368.method2868(Static182.aClass144_49, Static229.anInt4581));
				Static151.method2279(local36, true, Static349.aClass117_119.method2684(Static230.anInt4634));
				Static107.aClass129_4.method5009();
				Static220.method3946();
				Static107.aClass129_4.method5010();
			}
			try {
				Static107.aClass129_4 = Static326.method4946(Static34.aCanvas1, Static77.aClass118_7, arg1, Static76.anInterface2_6, Static82.anInt1504 * 2);
			} catch (@Pc(63) Throwable local63) {
				arg1 = 0;
				Static107.aClass129_4 = Static326.method4946(Static34.aCanvas1, Static77.aClass118_7, 0, Static76.anInterface2_6, 0);
			}
		}
		if (Static107.aClass129_4.method4932()) {
			@Pc(92) Class11_Sub22 local92 = Static107.aClass129_4.method4962();
			Static107.aClass129_4.method4982(local92);
		}
		Static74.anInt1413 = arg1;
		Static83.method1222();
		if (!Static107.aClass129_4.method4921()) {
			Static201.anInt6770 = 1;
		}
		Static107.aClass129_4.method4961(Static201.anInt6770);
		Static107.aClass129_4.method4953(0);
		Static319.aClass61_5 = Static107.aClass129_4.method4983();
		Static134.aClass61_2 = Static107.aClass129_4.method4983();
		@Pc(128) int local128 = (int) ((double) Static24.anInt454 * 34.46D);
		if (Static107.aClass129_4.method5022()) {
			local128 += 128;
		}
		Static107.aClass129_4.method5012(50, local128);
		Static107.aClass129_4.method4919(!Static39.aBoolean43);
		if (Static107.aClass129_4.method5017()) {
			Static206.method3695(Static193.aBoolean250);
		}
		Static159.aBoolean199 = !Static283.method4712();
		Static303.method4305(Static240.anInt4832 >> 3, Static24.anInt454 >> 3, Static107.aClass129_4);
		Static337.method5495();
		Static212.aBoolean292 = false;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
	public static void method3970(@OriginalArg(0) boolean arg0) {
		Static193.aBoolean249 = arg0;
		Static159.aBoolean199 = !Static283.method4712();
	}
}
