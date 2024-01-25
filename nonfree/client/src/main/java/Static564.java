import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt9280;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_147 = new Class47(13, 6);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!rr;Lclient!rr;)V")
	public static void method7579(@OriginalArg(1) Class292 arg0, @OriginalArg(2) Class292 arg1) {
		@Pc(12) Class6_Sub31 local12 = Static114.method2007(Static449.aClass47_120, Static337.aClass324_1);
		local12.aClass6_Sub21_Sub2_2.method6033(arg0.anInt7890);
		local12.aClass6_Sub21_Sub2_2.method6023(arg0.anInt7933);
		local12.aClass6_Sub21_Sub2_2.method6010(arg1.anInt7890);
		local12.aClass6_Sub21_Sub2_2.method6037(arg1.anInt7933);
		local12.aClass6_Sub21_Sub2_2.method6037(arg0.anInt7964);
		local12.aClass6_Sub21_Sub2_2.method6039(arg1.anInt7964);
		Static534.method7251(local12);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method7583(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public static void method7584() {
		for (@Pc(1) int local1 = 0; local1 < Static325.anInt5957; local1++) {
			@Pc(6) Class4_Sub1 local6 = Static216.aClass4_Sub1Array1[local1];
			Static232.method6006(local6);
			Static216.aClass4_Sub1Array1[local1] = null;
		}
		Static325.anInt5957 = 0;
	}
}
