import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Lclient!q;")
	public static Class113 aClass113_6;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public static int anInt7890;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_13 = new Class101(0, 2, 2, 1);

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_240 = new Class235(11, -1);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6318(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static218.aStringArray18.length; local7++) {
			if (Static218.aStringArray18[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)Lclient!d;")
	public static Class1_Sub11 method6319() {
		return Static227.anInt4290 == 0 ? new Class1_Sub11() : Static473.aClass1_Sub11Array1[--Static227.anInt4290];
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
	public static void method6320(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static154.method2220(arg1, arg0, arg1.length - 1, 0);
	}
}
