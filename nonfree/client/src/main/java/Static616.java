import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_174 = new Class44(117, 3);

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "[I")
	public static int[] anIntArray762 = new int[2];

	@OriginalMember(owner = "client!uw", name = "R", descriptor = "J")
	public static long aLong276 = 20000000L;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILclient!so;)Ljava/lang/String;")
	public static String method8657(@OriginalArg(2) Class14_Sub29 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5895();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt7264 += Static655.aClass335_1.method8172(0, arg0.aByteArray84, local7, arg0.anInt7264, local15);
			return Static541.method8227(local15, 0, local7);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZB)V")
	public static void method8659(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static563.anInt9769 != -1) {
				Static544.method7681(Static563.anInt9769);
			}
			for (@Pc(18) Class14_Sub32 local18 = (Class14_Sub32) Static547.aClass187_69.method4079(); local18 != null; local18 = (Class14_Sub32) Static547.aClass187_69.method4084()) {
				if (!local18.method9314()) {
					local18 = (Class14_Sub32) Static547.aClass187_69.method4079();
					if (local18 == null) {
						break;
					}
				}
				Static446.method6502(local18, true, false);
			}
			Static563.anInt9769 = -1;
			Static547.aClass187_69 = new Class187(8);
			Static160.method2609();
			Static563.anInt9769 = Static666.anInt11087;
			Static552.method7778(false);
			Static31.method720();
			Static632.method8837(Static563.anInt9769);
		}
		Static314.method4988();
		Static47.aBoolean98 = false;
		Static102.method1821();
		Static416.anInt7542 = -1;
		Static543.method7677(Static139.anInt2651);
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 = new Class12_Sub2_Sub2_Sub1_Sub2();
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] = Static26.anInt462 / 2;
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 = Static26.anInt462 * 512 / 2;
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 = Static445.anInt6140 * 512 / 2;
		Static74.anInt1618 = 0;
		Static233.anInt4273 = 0;
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] = Static445.anInt6140 / 2;
		if (Static378.anInt6935 == 2) {
			Static74.anInt1618 = Static531.anInt9214 << 9;
			Static233.anInt4273 = Static654.anInt10919 << 9;
		} else {
			Static222.method3454();
		}
		Static677.method9300();
	}
}
