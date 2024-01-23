import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString33 = "white:";

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
	public static int anInt478 = 0;

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
	public static int anInt483 = -1;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	public static void method449() {
		Static73.aFontMetrics1 = null;
		Static117.aFont1 = null;
		Static146.anImage3 = null;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V")
	public static void method451() {
		Static247.aClass187_126.method4525();
		Static16.aClass187_158.method4525();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static107.anIntArray191[arg1] = arg0;
		@Pc(19) Class1_Sub9 local19 = (Class1_Sub9) Static86.aClass142_7.method3543((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub9(4611686018427387905L);
			Static86.aClass142_7.method3537(local19, (long) arg1);
		} else if (local19.aLong37 != 4611686018427387905L) {
			local19.aLong37 = Static298.method4535() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!o;)V")
	public static void method456(@OriginalArg(1) Class15_Sub5_Sub1 arg0) {
		for (@Pc(19) Class1_Sub8 local19 = (Class1_Sub8) Static93.aClass59_20.method1704(); local19 != null; local19 = (Class1_Sub8) Static93.aClass59_20.method1701()) {
			if (local19.aClass15_Sub5_Sub1_1 == arg0) {
				if (local19.aClass1_Sub24_Sub2_1 != null) {
					Static205.aClass1_Sub24_Sub3_1.method4518(local19.aClass1_Sub24_Sub2_1);
					local19.aClass1_Sub24_Sub2_1 = null;
				}
				local19.method4779();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)I")
	public static int method458(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}
}
