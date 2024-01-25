import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!qu", name = "F", descriptor = "Lclient!wa;")
	public static final Class261 aClass261_3 = new Class261(128);

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "S")
	public static short aShort81 = 205;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!wl;)V")
	public static void method4518(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt6148 - Static85.anInt1536;
		@Pc(29) int local29 = arg0.anInt6129 * 128 + arg0.method4913() * 64;
		@Pc(41) int local41 = arg0.anInt6169 * 128 + arg0.method4913() * 64;
		arg0.anInt7500 += (local29 - arg0.anInt7500) / local9;
		arg0.anInt7502 += (local41 - arg0.anInt7502) / local9;
		arg0.anInt6197 = 0;
		if (arg0.anInt6172 == 0) {
			arg0.method4915(8192);
		}
		if (arg0.anInt6172 == 1) {
			arg0.method4915(12288);
		}
		if (arg0.anInt6172 == 2) {
			arg0.method4915(0);
		}
		if (arg0.anInt6172 == 3) {
			arg0.method4915(4096);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)I")
	public static int method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(34) int local34 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
