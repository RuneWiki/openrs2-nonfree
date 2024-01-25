import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "J")
	public static long aLong224;

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "Lclient!so;")
	public static final Class309 aClass309_6 = new Class309();

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_221 = new Class235(70, 12);

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
	public static final int[] anIntArray573 = new int[1000];

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLclient!paa;)V")
	public static void method5939(@OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub2 arg0) {
		for (@Pc(18) Class1_Sub38 local18 = (Class1_Sub38) Static413.aClass353_56.method7677(); local18 != null; local18 = (Class1_Sub38) Static413.aClass353_56.method7687()) {
			if (local18.aClass8_Sub3_Sub3_Sub1_Sub2_1 == arg0) {
				if (local18.aClass1_Sub7_Sub4_4 != null) {
					Static309.aClass1_Sub7_Sub1_2.method477(local18.aClass1_Sub7_Sub4_4);
					local18.aClass1_Sub7_Sub4_4 = null;
				}
				local18.method7859();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
	public static void method5940() {
		@Pc(5) Class222 local5 = Static218.aClass222_26;
		synchronized (Static218.aClass222_26) {
			Static218.aClass222_26.method4428();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!mo;Z)Lclient!on;")
	public static Class97_Sub1 method5941(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(12) Class97 local12 = Static207.method3283(arg0);
		@Pc(16) int local16 = arg0.method5766();
		return new Class97_Sub1(local12.anInt6633, local12.aClass335_13, local12.aClass122_12, local12.anInt6629, local12.anInt6628, local16);
	}
}
