import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Lclient!hn;")
	public static final Class143 aClass143_2 = new Class143();

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!af;")
	public static final Class9 aClass9_2 = new Class9();

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIBI[B)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(16) int local16 = arg1 - arg0 >> 2;
		arg2 += arg0;
		while (true) {
			local16--;
			if (local16 < 0) {
				local16 = arg1 - arg0 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(25) int local25 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local30] = 1;
			arg2 = local35 + 1;
			arg3[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!sl;)V")
	public static void method1858(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(9) int local9 = arg0.method4228();
		Static629.aClass221Array1 = new Class221[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static629.aClass221Array1[local14] = new Class221();
			Static629.aClass221Array1[local14].anInt6786 = arg0.method4228();
			Static629.aClass221Array1[local14].aString71 = arg0.method4215();
		}
		Static42.anInt1273 = arg0.method4228();
		Static77.anInt1908 = arg0.method4228();
		Static262.anInt4804 = arg0.method4228();
		Static227.aClass96_Sub1Array1 = new Class96_Sub1[Static77.anInt1908 + 1 - Static42.anInt1273];
		for (@Pc(70) int local70 = 0; local70 < Static262.anInt4804; local70++) {
			@Pc(76) int local76 = arg0.method4228();
			@Pc(84) Class96_Sub1 local84 = Static227.aClass96_Sub1Array1[local76] = new Class96_Sub1();
			local84.anInt3297 = arg0.method4225();
			local84.anInt3293 = arg0.method4207();
			local84.anInt3303 = local76 + Static42.anInt1273;
			local84.aString30 = arg0.method4215();
			local84.aString29 = arg0.method4215();
		}
		Static580.anInt9555 = arg0.method4207();
		Static437.aBoolean548 = true;
	}
}
