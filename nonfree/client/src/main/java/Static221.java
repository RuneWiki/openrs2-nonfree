import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	public static int anInt4357;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!h;")
	public static Class5_Sub20 aClass5_Sub20_1;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public static int anInt4359;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ea;B)V")
	public static void method4020(@OriginalArg(0) Class55 arg0) {
		if (Static133.aBoolean203) {
			Static1.method6(arg0);
		} else {
			Static2.method1430(arg0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method4021(@OriginalArg(1) String arg0) {
		return Static291.method5028(arg0, 16);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4022(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static44.anInt750; local9++) {
			if (arg0.equalsIgnoreCase(Static85.aStringArray14[local9])) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method4024() {
		Static40.method632(Static236.aClass55_9, (long) Static283.anInt5563);
		if (Static32.anInt628 != -1) {
			Static28.method629(Static32.anInt628);
		}
		for (@Pc(18) int local18 = 0; local18 < Static66.anInt5818; local18++) {
			if (Static287.aBooleanArray23[local18]) {
				Static133.aBooleanArray10[local18] = true;
			}
			Static34.aBooleanArray5[local18] = Static287.aBooleanArray23[local18];
			Static287.aBooleanArray23[local18] = false;
		}
		Static76.anInt1460 = Static283.anInt5563;
		if (Static236.aClass55_9.method5177()) {
			Static88.aBoolean117 = true;
		}
		if (Static32.anInt628 != -1) {
			Static66.anInt5818 = 0;
			Static301.method5303();
		}
		Static236.aClass55_9.method5186();
		Static204.method3754(Static353.anInt6772);
		Static26.anInt519 = 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!iq;II)J")
	public static long method4025(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class156 local15 = Static111.method1967(arg1.method5910());
		@Pc(44) long local44 = (long) (arg0 | 0x40000000 | arg2 << 7 | arg1.method5913() << 14 | arg1.method5908() << 20);
		if (local15.anInt4756 == 0) {
			local44 |= local9;
		}
		if (local15.anInt4761 == 1) {
			local44 |= local5;
		}
		if (local15.aBoolean393) {
			local44 |= local7;
		}
		return local44 | (long) arg1.method5910() << 32;
	}
}
