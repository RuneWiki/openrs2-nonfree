import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!aj;")
	public static Class15 aClass15_154;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!tm;")
	public static Class338 aClass338_227 = new Class338();

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	public static int anInt10047 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method8794() {
		Static366.aClass3_Sub1_Sub3_4.method2176();
		Static403.aClass15_107 = null;
		Static257.aClass3_Sub1_Sub3_2 = null;
		Static18.anInt450 = 1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method8798(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3 local5 = Static300.aClass83_15.method2375(); local5 != null; local5 = Static300.aClass83_15.method2370()) {
			if ((long) arg0 == (local5.aLong311 >> 48 & 0xFFFFL)) {
				local5.method9380();
			}
		}
	}
}
