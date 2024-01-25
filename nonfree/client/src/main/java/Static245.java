import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!kba", name = "S", descriptor = "I")
	public static int anInt4747;

	@OriginalMember(owner = "client!kba", name = "O", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_37 = new Class38();

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "(I)V")
	public static void method4144() {
		Static397.aClass9_6.M(Static354.aFloat126 * ((float) Static89.aClass1_Sub28_Sub1_1.anInt4908 * 0.1F + 0.7F));
		Static397.aClass9_6.m(Static128.anInt3067, Static122.aFloat78, Static298.aFloat111, (float) (Static91.anInt724 << 0), (float) (Static120.anInt2877 << 0), (float) (Static361.anInt6490 << 0));
		Static397.aClass9_6.method7580(Static160.aClass25_3);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I[SII[Ljava/lang/String;)V")
	public static void method4146(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg1 + arg2) / 2;
		@Pc(18) int local18 = arg2;
		@Pc(22) String local22 = arg3[local16];
		arg3[local16] = arg3[arg1];
		arg3[arg1] = local22;
		@Pc(36) short local36 = arg0[local16];
		arg0[local16] = arg0[arg1];
		arg0[arg1] = local36;
		for (@Pc(48) int local48 = arg2; local48 < arg1; local48++) {
			if (local22 == null || arg3[local48] != null && (local48 & 0x1) > arg3[local48].compareTo(local22)) {
				@Pc(72) String local72 = arg3[local48];
				arg3[local48] = arg3[local18];
				arg3[local18] = local72;
				@Pc(86) short local86 = arg0[local48];
				arg0[local48] = arg0[local18];
				arg0[local18++] = local86;
			}
		}
		arg3[arg1] = arg3[local18];
		arg3[local18] = local22;
		arg0[arg1] = arg0[local18];
		arg0[local18] = local36;
		method4146(arg0, local18 - 1, arg2, arg3);
		method4146(arg0, arg1, local18 + 1, arg3);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!vp;I)V")
	public static void method4147(@OriginalArg(0) Class309 arg0) {
		if (arg0.anInt8802 == 5 && arg0.anInt8735 != -1) {
			Static483.method6989(arg0, Static478.aClass9_10);
		}
	}
}
