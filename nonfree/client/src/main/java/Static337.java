import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	public static int anInt6164;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
	public static int anInt6154 = 0;

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString297 = "Please remove ";

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "Lclient!ui;")
	public static Class198 aClass198_1 = new Class198();

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	public static void method5578(@OriginalArg(0) int arg0) {
		Static157.anInt2943 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static310.anInt5828; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static163.anInt3084; local6++) {
				if (Static39.aClass187ArrayArrayArray1[arg0][local3][local6] == null) {
					Static39.aClass187ArrayArrayArray1[arg0][local3][local6] = new Class187(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!pe;)I")
	public static int method5579(@OriginalArg(1) Class44_Sub4_Sub4 arg0) {
		if (arg0.anInt5121 == 0) {
			return 0;
		}
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (arg0.anInt5103 != -1 && arg0.anInt5103 < 32768) {
			@Pc(22) Class44_Sub4_Sub4_Sub2 local22 = Static239.aClass44_Sub4_Sub4_Sub2Array8[arg0.anInt5103];
			if (local22 != null) {
				local31 = arg0.anInt6340 - local22.anInt6340;
				local37 = arg0.anInt6339 - local22.anInt6339;
				if (local31 != 0 || local37 != 0) {
					arg0.method4706((int) (Math.atan2((double) local31, (double) local37) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(69) int local69;
		if (arg0.anInt5103 >= 32768) {
			local69 = arg0.anInt5103 - 32768;
			if (Static44.anInt879 == local69) {
				local69 = 2047;
			}
			@Pc(78) Class44_Sub4_Sub4_Sub1 local78 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local69];
			if (local78 != null) {
				local37 = arg0.anInt6340 - local78.anInt6340;
				@Pc(93) int local93 = arg0.anInt6339 - local78.anInt6339;
				if (local37 != 0 || local93 != 0) {
					arg0.method4706((int) (Math.atan2((double) local37, (double) local93) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5135 != 0 || arg0.anInt5110 != 0) && (arg0.anInt5156 == 0 || arg0.anInt5155 > 0)) {
			local69 = arg0.anInt6340 - (arg0.anInt5135 - Static44.anInt881 - Static44.anInt881) * 64;
			local31 = arg0.anInt6339 - (arg0.anInt5110 - Static300.anInt5672 - Static300.anInt5672) * 64;
			if (local69 != 0 || local31 != 0) {
				arg0.method4706((int) (Math.atan2((double) local69, (double) local31) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5110 = 0;
			arg0.anInt5135 = 0;
		}
		return arg0.method4723();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!qp;)V")
	public static void method5580(@OriginalArg(1) Class6_Sub32 arg0) {
		if (!Static201.aBoolean284) {
			arg0.method5756();
			Static256.anInt4749--;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!dp;Lclient!dp;)V")
	public static void method5581(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		Static305.aClass53_141 = arg1;
		Static327.aClass53_90 = arg0;
	}
}
