import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "Lclient!tp;")
	public static Class336 aClass336_5;

	@OriginalMember(owner = "client!ij", name = "Ac", descriptor = "I")
	public static int anInt9646;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!sl;B)Lclient!gq;")
	public static Class135 method8180(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method2825();
		@Pc(16) Class97 local16 = Static562.method7867()[arg0.method2859()];
		@Pc(23) Class252 local23 = Static186.method3192()[arg0.method2859()];
		@Pc(27) int local27 = arg0.method2836();
		@Pc(31) int local31 = arg0.method2836();
		return new Class135(local7, local16, local23, local27, local31);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI[B)I")
	public static int method8185(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static172.method2993(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method8286(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static152.method2685(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "(Z)V")
	public static void method8291() {
		Static210.method8324();
		Static626.anInt10190 = 0;
		Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
		Static370.aClass200_142 = null;
		Static245.anInt4755 = 0;
		Static606.aClass200_222 = null;
		Static535.anInt8620 = 0;
		Static533.aClass200_198 = null;
		Static346.aClass200_117 = null;
		Static524.method7272();
		Static489.method7358();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local30] = null;
		}
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 = null;
		for (@Pc(44) int local44 = 0; local44 < Static608.anInt10053; local44++) {
			@Pc(51) Class16_Sub1_Sub1_Sub3_Sub1 local51 = Static480.aClass2_Sub32Array1[local44].aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (local51 != null) {
				local51.anInt8100 = -1;
			}
		}
		Static393.method5804();
		Static648.anInt10476 = -1;
		Static644.anInt10415 = -1;
		Static407.anInt6909 = 1;
		Static213.method3541(10);
		for (@Pc(78) int local78 = 0; local78 < 100; local78++) {
			Static377.aBooleanArray14[local78] = true;
		}
		Static516.method7302();
		Static209.aClass2_Sub47_1 = null;
		Static77.aLong53 = 0L;
	}
}
