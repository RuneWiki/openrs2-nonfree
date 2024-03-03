import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public static int anInt6297;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!r;")
	public static Class197 aClass197_89;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V", line = 5)
	public static void method5698(@OriginalArg(1) int arg0) {
		Class2_Sub10.anInt1761 = -1;
		Static89.anInt2001 = arg0;
		Class2_Sub10.anInt1761 = -1;
		Static275.method2424();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)C", line = 21)
	public static char method5699(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Class2_Sub3_Sub19.aCharArray2[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wm;ILclient!mg;)I", line = 50)
	public static int method5700(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class148 arg1) {
		if (arg1.anInt3753 != -1) {
			return arg1.anInt3753;
		}
		if (arg1.anInt3758 != -1) {
			@Pc(30) Class229 local30 = arg0.anInterface2_5.method2660(arg0.method2873() ? arg1.anInt3758 : arg1.anInt3755);
			if (!local30.aBoolean438) {
				return local30.aShort87;
			}
		}
		return arg1.anInt3765;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V", line = 96)
	public static void method5702(@OriginalArg(0) int arg0) {
		Static312.method5695();
		Static273.method5105();
		Static232.method4366(true, arg0);
		Static219.method4103(Static29.aClass197_5, Static235.aClass197_64, Static177.aClass19_8);
		Static41.method1358(Static177.aClass19_8, Static29.aClass197_5);
		Static135.method2693(Static117.aClass13Array27);
		Static177.method3503();
		Static91.method2109();
		if (Class2_Sub3_Sub35.anInt6430 == 10) {
			Static47.method1527(false);
		} else if (Class2_Sub3_Sub35.anInt6430 == 30) {
			Static313.method5706(25);
			return;
		} else if (Class2_Sub3_Sub35.anInt6430 == 5) {
			Static323.method5831(Static29.aClass197_5, Static177.aClass19_8);
			return;
		}
	}
}
