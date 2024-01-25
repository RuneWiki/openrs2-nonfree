import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "[Lclient!afa;")
	public static final Class9_Sub1_Sub1_Sub2_Sub1[] aClass9_Sub1_Sub1_Sub2_Sub1Array1 = new Class9_Sub1_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "(I)Lclient!ika;")
	public static Class3_Sub2 method612() {
		@Pc(6) Class3_Sub2 local6 = Static191.method2977();
		local6.method2016(0L);
		local6.method2073(Static612.aString118);
		local6.method2016(Static605.aLong302);
		local6.method2016(Static194.aLong127);
		local6.method2040(Static242.aBigInteger3, Static473.aBigInteger5);
		return local6;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method614(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static88.method1890(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(47) int local47 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(50) int local50;
			do {
				local50 = arg0.nextInt();
			} while (local47 <= local50);
			return Static639.method8418(arg1, local50);
		}
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(BII)Z")
	public static boolean method615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static284.method4011(arg0, arg1) | (arg1 & 0x70000) != 0 || Static493.method6693(arg1, arg0);
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(B)V")
	public static void method616() {
		if (Static98.anInt2140 == 3) {
			Static336.method4832(4);
		} else if (Static98.anInt2140 == 7) {
			Static336.method4832(8);
		} else if (Static98.anInt2140 == 9) {
			Static336.method4832(10);
		} else if (Static98.anInt2140 == 11) {
			Static336.method4832(12);
			return;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IC)C")
	public static char method617(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
