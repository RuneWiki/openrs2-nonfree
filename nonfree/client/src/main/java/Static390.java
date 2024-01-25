import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
	public static int anInt5705;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray24 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!gda;[Lclient!kp;)V")
	public static void method5013(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class4_Sub29[] arg1) {
		@Pc(6) int local6;
		if (Static95.aBoolean132) {
			local6 = arg0.method8498(arg1);
			Static246.aClass33_6.method8090(local6, arg1);
		}
		if (Static146.aClass42Array3 == Static140.aClass42Array4) {
			@Pc(28) int local28;
			if (arg0 instanceof Class3_Sub1_Sub2) {
				local6 = ((Class3_Sub1_Sub2) arg0).aShort124;
				local28 = ((Class3_Sub1_Sub2) arg0).aShort125;
			} else {
				local6 = arg0.anInt9925 >> Static273.anInt4424;
				local28 = arg0.anInt9917 >> Static273.anInt4424;
			}
			Static246.aClass33_6.EA(Static655.aClass42Array5[0].method7453(arg0.anInt9925, arg0.anInt9917), Static180.method8506(local6, local28), Static185.method2931(local6, local28), Static523.method7043(local6, local28));
		}
		@Pc(64) Class3_Sub6 local64 = arg0.method8502(Static246.aClass33_6);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean771) {
			@Pc(72) Class3_Sub4[] local72 = local64.aClass3_Sub4Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class3_Sub4 local79 = local72[local74];
				if (local79.aBoolean234) {
					Static100.method2025(local79.anInt3111 - local79.anInt3112, local79.anInt3113 + local79.anInt3112, local79.anInt3114 - local79.anInt3112, local79.anInt3115 + local79.anInt3112);
				}
			}
		}
		if (local64.aBoolean632) {
			local64.aClass3_Sub1_21 = arg0;
			if (Static186.aBoolean244) {
				@Pc(119) Class223 local119 = Static419.aClass223_4;
				synchronized (Static419.aClass223_4) {
					Static419.aClass223_4.method4811(local64);
					return;
				}
			}
			Static419.aClass223_4.method4811(local64);
			return;
		}
		Static405.method5135(local64);
	}
}
