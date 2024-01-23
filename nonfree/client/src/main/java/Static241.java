import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString166;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public static int anInt5293;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray46;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!kb;")
	public static Class83 aClass83_162;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static volatile int anInt5295 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	public static void method4156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static170.anIntArray601[arg0] = arg1;
		@Pc(22) Class1_Sub21 local22 = (Class1_Sub21) Static127.aClass117_8.method3438((long) arg0);
		if (local22 == null) {
			local22 = new Class1_Sub21(Static294.method4792() + 500L);
			Static127.aClass117_8.method3445(local22, (long) arg0);
		} else {
			local22.aLong106 = Static294.method4792() + 500L;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)Lclient!nb;")
	public static Class104 method4157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class104 local9 = new Class104();
		for (@Pc(14) Class1_Sub2_Sub9 local14 = (Class1_Sub2_Sub9) Static146.aClass117_11.method3441(); local14 != null; local14 = (Class1_Sub2_Sub9) Static146.aClass117_11.method3444()) {
			if (local14.aBoolean116 && local14.method1639(arg0, arg1)) {
				local9.method3145(local14);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method4159(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Class1_Sub28 local17 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg0);
		if (local17 == null) {
			return Static91.method1595(arg0).anInt777;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(34) int local34 = 0; local34 < local17.anIntArray500.length; local34++) {
			if (local17.anIntArray500[local34] == -1) {
				local27++;
			}
		}
		return local27 + Static91.method1595(arg0).anInt777 - local17.anIntArray500.length;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method4160() {
		Static153.aClass155_30.method4362();
	}
}
