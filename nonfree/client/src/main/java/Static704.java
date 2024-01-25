import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static704 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public static int anInt10775;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "[I")
	public static int[] anIntArray747;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_205 = new Class225(53, -2);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!nca;Lclient!nca;I)V")
	public static void method9419(@OriginalArg(1) Class254 arg0, @OriginalArg(2) Class254 arg1) {
		Static716.aClass254_170 = arg0;
		Static441.aClass254_119 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method9420() {
		Static25.anInt319 = 1;
		Static560.aClass221_3 = Static487.aClass221_1;
		Static690.anInt10620 = -1;
		@Pc(21) String local21 = null;
		if (Static14.aByteArray1 != null) {
			@Pc(28) Class2_Sub20 local28 = new Class2_Sub20(Static14.aByteArray1);
			local21 = Static580.method8080(local28.method8590());
			Static219.aLong120 = local28.method8590();
		}
		if (local21 == null) {
			Static223.method7019(35);
		} else {
			Static574.method7981(true, false, "", local21);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!et;)V")
	public static void method9422(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method8592(255);
		Static677.aClass206Array1 = new Class206[local9];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			Static677.aClass206Array1[local22] = new Class206();
			Static677.aClass206Array1[local22].anInt4934 = arg0.method8592(255);
			Static677.aClass206Array1[local22].aString56 = arg0.method8537();
		}
		Static532.anInt8451 = arg0.method8592(255);
		Static578.anInt9142 = arg0.method8592(255);
		Static446.anInt7232 = arg0.method8592(255);
		Static261.aClass88_Sub1Array3 = new Class88_Sub1[Static578.anInt9142 + 1 - Static532.anInt8451];
		for (@Pc(76) int local76 = 0; local76 < Static446.anInt7232; local76++) {
			@Pc(86) int local86 = arg0.method8592(255);
			@Pc(94) Class88_Sub1 local94 = Static261.aClass88_Sub1Array3[local86] = new Class88_Sub1();
			local94.anInt2146 = arg0.method8581(-17416);
			local94.anInt2140 = arg0.method8555(-9372);
			local94.anInt2151 = local86 + Static532.anInt8451;
			local94.aString20 = arg0.method8537();
			local94.aString21 = arg0.method8537();
		}
		Static203.anInt3313 = arg0.method8555(-9372);
		Static23.aBoolean574 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLclient!nca;IIZ)V")
	public static void method9423(@OriginalArg(0) int arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) int arg2) {
		Static437.method6346(0L, arg0, arg2, arg1);
	}
}
