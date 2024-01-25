import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "(I)[Lclient!jd;")
	public static Class177[] method2281() {
		return new Class177[] { Static487.aClass177_4, Static264.aClass177_3, Static250.aClass177_2 };
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!uf;I)V")
	public static void method2282(@OriginalArg(0) Class357 arg0) {
		if (arg0.anInt10454 != Static502.anInt8977) {
			return;
		}
		if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29 == null) {
			arg0.anInt10450 = 0;
			arg0.anInt10441 = 0;
			return;
		}
		arg0.anInt10414 = 150;
		arg0.anInt10399 = (int) (Math.sin((double) Static62.anInt1184 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt10404 = 5;
		arg0.anInt10441 = Static659.anInt11273;
		arg0.anInt10450 = Static5.method93(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29);
		arg0.anInt10446 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt3968;
		arg0.anInt10408 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt4018;
		arg0.anInt10475 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt4028;
		arg0.anInt10467 = 0;
		@Pc(71) Class178 local71 = arg0.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(arg0.anInt10446);
		if (local71 != null) {
			Static364.method6183(arg0.anInt10475, local71);
		}
	}
}
