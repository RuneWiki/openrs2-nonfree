import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt10;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[32];

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "J")
	public static volatile long aLong1 = 0L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V")
	public static void method8(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) String local25 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local25;
		@Pc(39) short local39 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg3; local51++) {
			if (local25 == null || arg1[local51] != null && arg1[local51].compareTo(local25) < (local51 & 0x1)) {
				@Pc(82) String local82 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21] = local82;
				@Pc(96) short local96 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local96;
			}
		}
		arg1[arg3] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg3] = arg2[local21];
		arg2[local21] = local39;
		method8(arg0, arg1, arg2, local21 - 1);
		method8(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method9() {
		Static211.aClass172_36.method4350();
		Static157.aClass172_3.method4350();
		Static228.aClass172_38.method4350();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!cg;)I")
	public static int method10(@OriginalArg(1) Class22 arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.method656(Static44.anInt922)) {
			local6++;
		}
		if (arg0.method656(Static180.anInt3625)) {
			local6++;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method11() {
		Static177.aClass172_34.method4350();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method14() {
		Static69.method1191();
		Static274.method4327();
		Static173.method2814();
		Static264.method4173();
		Static1.method4();
		Static9.method149();
		Static160.method2582();
		Static221.method3431();
		Static97.method3595();
		Static141.method2267();
		Static7.method112();
		Static51.method995();
		Static69.method1193();
		Static288.method4506();
		Static180.method2935();
		Static47.method941();
		Static63.method1165();
		Static295.method4586();
		Static105.method1794();
		Static216.method3388();
		Static7.aClass172_1.method4349(5);
		Static246.aClass172_40.method4349(5);
	}
}
