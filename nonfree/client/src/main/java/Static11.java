import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public static int anInt199 = 0;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt200 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub7_Sub5 local16 = Static138.method2377(17, arg1);
		local16.method1474();
		local16.anInt1728 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!uq;[Lclient!tj;)V")
	public static void method200(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		@Pc(6) int local6;
		if (Static397.aBoolean513) {
			local6 = arg0.method8601(arg1);
			Static568.aClass82_14.method6100(local6, arg1);
		}
		if (Static485.aClass91Array1 == Static637.aClass91Array4) {
			@Pc(28) int local28;
			if (arg0 instanceof Class9_Sub2_Sub1) {
				local6 = ((Class9_Sub2_Sub1) arg0).aShort126;
				local28 = ((Class9_Sub2_Sub1) arg0).aShort124;
			} else {
				local6 = arg0.anInt10152 >> Static485.anInt8241;
				local28 = arg0.anInt10158 >> Static485.anInt8241;
			}
			Static568.aClass82_14.EA(Static518.aClass91Array2[0].method7725(arg0.anInt10152, arg0.anInt10158), Static549.method7850(local6, local28), Static557.method7914(local6, local28), Static613.method8370(local6, local28));
		}
		@Pc(64) Class9_Sub10 local64 = arg0.method8603(Static568.aClass82_14);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean770) {
			@Pc(72) Class9_Sub5[] local72 = local64.aClass9_Sub5Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class9_Sub5 local79 = local72[local74];
				if (local79.aBoolean433) {
					Static304.method7235(local79.anInt5912 + local79.anInt5913, local79.anInt5911 + local79.anInt5913, local79.anInt5910 - local79.anInt5913, local79.anInt5909 - local79.anInt5913);
				}
			}
		}
		if (local64.aBoolean698) {
			local64.aClass9_Sub2_22 = arg0;
			if (Static302.aBoolean437) {
				@Pc(119) Class47 local119 = Static460.aClass47_3;
				synchronized (Static460.aClass47_3) {
					Static460.aClass47_3.method1163(local64);
					return;
				}
			}
			Static460.aClass47_3.method1163(local64);
			return;
		}
		Static139.method2379(local64);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!uu;III)Lclient!vo;")
	public static Class359 method201(@OriginalArg(0) Class343 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method8132(arg1, 0);
		return local9 == null ? null : new Class359(local9);
	}
}
