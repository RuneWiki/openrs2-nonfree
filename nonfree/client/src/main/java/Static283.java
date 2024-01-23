import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!pe;")
	public static Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	public static int anInt5402 = -1;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "Z")
	public static boolean aBoolean386 = true;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(CZ)Z")
	public static boolean method4218(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static87.method1296(arg0)) {
			return true;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) char[] local27 = Static167.aCharArray5;
			@Pc(39) char local39;
			while (local25 < local27.length) {
				local39 = local27[local25];
				if (local39 == arg0) {
					return true;
				}
				local25++;
			}
			local27 = Static138.aCharArray3;
			for (local25 = 0; local25 < local27.length; local25++) {
				local39 = local27[local25];
				if (arg0 == local39) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[J[I)V")
	public static void method4220(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static35.method599(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)[Lclient!mo;")
	public static Class103[] method4221() {
		@Pc(8) Class103[] local8 = new Class103[Static194.anInt3940];
		for (@Pc(15) int local15 = 0; local15 < Static194.anInt3940; local15++) {
			if (Static291.aBoolean404) {
				local8[local15] = new Class103_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local15], Static148.anIntArray242[local15], Static134.anIntArray220[local15], Static255.anIntArray450[local15], Static255.aByteArrayArray15[local15], Static40.anIntArray59);
			} else {
				local8[local15] = new Class103_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local15], Static148.anIntArray242[local15], Static134.anIntArray220[local15], Static255.anIntArray450[local15], Static255.aByteArrayArray15[local15], Static40.anIntArray59);
			}
		}
		Static295.method4395();
		return local8;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!mg;Lclient!mg;B)V")
	public static void method4222(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_232 != null) {
			arg1.method4616();
		}
		arg1.aClass1_232 = arg0.aClass1_232;
		arg1.aClass1_233 = arg0;
		arg1.aClass1_232.aClass1_233 = arg1;
		arg1.aClass1_233.aClass1_232 = arg1;
	}
}
