import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
	public static int anInt3617;

	@OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
	public static int anInt3619;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
	public static int anInt3610 = 0;

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_976 = Static184.method2923(":clan:");

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
	public static int anInt3612 = -1;

	@OriginalMember(owner = "client!pi", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_977 = Static184.method2923("::noclip");

	@OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
	public static int anInt3614 = 0;

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_978 = Static184.method2923("Mitglieder)2Welt");

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
	public static void method2515() {
		for (@Pc(3) int local3 = 0; local3 < Static170.anInt3986; local3++) {
			@Pc(15) int local15 = Static124.anIntArray313[local3];
			@Pc(19) Class12_Sub3_Sub1 local19 = Static216.aClass12_Sub3_Sub1Array1[local15];
			@Pc(23) int local23 = Static204.aClass2_Sub3_Sub1_3.method209();
			if ((local23 & 0x2) != 0) {
				local23 += Static204.aClass2_Sub3_Sub1_3.method209() << 8;
			}
			Static179.method2864(local23, local19, local15);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!og;)V")
	public static void method2516(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt3293 == 0) {
			local5 = Static142.method2228(arg0.anInt3285, arg0.anInt3289, arg0.anInt3282);
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = -1;
		if (arg0.anInt3293 == 1) {
			local5 = Static146.method2253(arg0.anInt3285, arg0.anInt3289, arg0.anInt3282);
		}
		if (arg0.anInt3293 == 2) {
			local5 = Static98.method1688(arg0.anInt3285, arg0.anInt3289, arg0.anInt3282);
		}
		if (arg0.anInt3293 == 3) {
			local5 = Static65.method1200(arg0.anInt3285, arg0.anInt3289, arg0.anInt3282);
		}
		if (local5 != 0L) {
			local23 = (int) local5 >> 20 & 0x3;
			local25 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local21 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt3294 = local23;
		arg0.anInt3283 = local25;
		arg0.anInt3290 = local21;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ea;Lclient!i;B)I")
	public static int method2517(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class41 arg1) {
		@Pc(11) int local11 = arg0.anInt239;
		arg0.method170(arg1.anInt2012);
		arg0.anInt239 += Static98.aClass92_1.method3009(arg1.aByteArray26, arg0.anInt239, arg1.anInt2012, 0, arg0.aByteArray4);
		return arg0.anInt239 - local11;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	public static void method2518(@OriginalArg(0) int arg0) {
		Static142.anInt3263 = arg0;
		Static32.anInt850 = -1;
		Static32.anInt850 = -1;
		Static217.method3296();
	}
}
