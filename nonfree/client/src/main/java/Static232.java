import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_31 = new Class169(8);

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	public static int anInt5106 = -1;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "J")
	public static long aLong107 = -1L;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
	public static void method4412(@OriginalArg(0) int arg0) {
		if (Static614.anInt10750 == 0) {
			Static341.aClass2_Sub8_Sub3_4.method5803(arg0);
		} else {
			Static267.anInt5676 = arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([I[IIII)V")
	public static void method4414(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(20) int local20 = (arg2 + arg3) / 2;
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg0[local20];
		arg0[local20] = arg0[arg3];
		arg0[arg3] = local26;
		@Pc(40) int local40 = arg1[local20];
		arg1[local20] = arg1[arg3];
		arg1[arg3] = local40;
		@Pc(59) int local59 = ~local26 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg3; local61++) {
			if (arg0[local61] < (local61 & local59) + local26) {
				@Pc(76) int local76 = arg0[local61];
				arg0[local61] = arg0[local22];
				arg0[local22] = local76;
				@Pc(90) int local90 = arg1[local61];
				arg1[local61] = arg1[local22];
				arg1[local22++] = local90;
			}
		}
		arg0[arg3] = arg0[local22];
		arg0[local22] = local26;
		arg1[arg3] = arg1[local22];
		arg1[local22] = local40;
		method4414(arg0, arg1, arg2, local22 - 1);
		method4414(arg0, arg1, local22 + 1, arg3);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method4416() {
		@Pc(7) int local7 = Static71.anInt3990;
		@Pc(9) int[] local9 = Static549.anIntArray643;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub1_Sub3_Sub3_Sub2 local19 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static8.method210(local19.method5214(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	public static void method4417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg2, 10);
		local8.method3088();
		local8.anInt3367 = arg1;
		local8.anInt3366 = arg3;
		local8.anInt3368 = arg0;
	}
}
