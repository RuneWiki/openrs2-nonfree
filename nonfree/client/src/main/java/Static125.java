import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!cb;")
	public static Class50 aClass50_35;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_86 = new Class196(73, 0);

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_5 = new Class74(5, 3);

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BIIBI[BII)V")
	public static void method1951(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg4++;
				arg5[local30] += arg1[arg3++];
				@Pc(42) int local42 = arg4++;
				arg5[local42] += arg1[arg3++];
				@Pc(54) int local54 = arg4++;
				arg5[local54] += arg1[arg3++];
				@Pc(66) int local66 = arg4++;
				arg5[local66] += arg1[arg3++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local30 = arg4++;
				arg5[local30] += arg1[arg3++];
			}
			arg4 += arg6;
			arg3 += arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
	public static boolean method1953() {
		try {
			return Static110.method1800();
		} catch (@Pc(12) IOException local12) {
			Static360.method5289();
			return true;
		} catch (@Pc(17) Exception local17) {
			@Pc(77) String local77 = "T2 - " + (Static398.aClass196_212 == null ? -1 : Static398.aClass196_212.method4065()) + "," + (Static587.aClass196_296 == null ? -1 : Static587.aClass196_296.method4065()) + "," + (Static527.aClass196_263 == null ? -1 : Static527.aClass196_263.method4065()) + " - " + Static139.anInt2291 + "," + (Static454.anInt7910 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0]) + "," + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] + Static48.anInt750) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static139.anInt2291 && local79 < 50; local79++) {
				local77 = local77 + Static386.aClass5_Sub15_Sub2_2.aByteArray45[local79] + ",";
			}
			Static17.method268(local77, local17);
			Static162.method6698(false);
			return true;
		}
	}
}
