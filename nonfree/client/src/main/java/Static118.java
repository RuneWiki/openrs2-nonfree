import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_105 = new Class131(32, 3);

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[Lclient!d;")
	public static final Class1_Sub2_Sub6[] aClass1_Sub2_Sub6Array6 = new Class1_Sub2_Sub6[14];

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3303(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local10 + local8);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local45.append("<lt>");
			} else if (local53 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local53);
			}
		}
		return local45.toString();
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)V")
	public static void method3304() {
		if (Static276.aClass109_10 == null) {
			return;
		}
		Static146.aClass188_4.method4529();
		Static288.method4075();
		Static209.method6067();
		Static236.method4583();
		Static68.method1190();
		Static400.method5426();
		if (Static58.aClass154_1 != null) {
			Static58.aClass154_1.method3595();
		}
		Static313.method4478();
		Static95.method1501();
		Static26.method3183();
		Static157.method2372(false);
		Static193.method909();
		for (@Pc(50) int local50 = 0; local50 < 2048; local50++) {
			@Pc(56) Class26_Sub2_Sub2_Sub1 local56 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local50];
			if (local56 != null) {
				local56.aClass1_Sub4_3 = null;
				for (@Pc(63) int local63 = 0; local63 < local56.aClass37Array3.length; local63++) {
					local56.aClass37Array3[local63] = null;
				}
			}
		}
		for (@Pc(82) int local82 = 0; local82 < Static410.aClass26_Sub2_Sub2_Sub2Array1.length; local82++) {
			@Pc(88) Class26_Sub2_Sub2_Sub2 local88 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local82];
			if (local88 != null) {
				for (@Pc(92) int local92 = 0; local92 < local88.aClass37Array3.length; local92++) {
					local88.aClass37Array3[local92] = null;
				}
			}
		}
		Static276.aClass109_10.method4713();
		Static276.aClass109_10 = null;
	}
}
