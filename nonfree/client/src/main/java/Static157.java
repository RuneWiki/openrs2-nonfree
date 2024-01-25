import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public static int anInt2734;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2214(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static390.aString67 = arg1;
		Static342.aString60 = arg0;
		if (Static226.anInt3761 != 3 && (Static342.aString60.equals("") || Static390.aString67.equals(""))) {
			Static363.method4695(3);
			return;
		}
		if (Static226.anInt3761 != 1) {
			Static255.anInt4157 = -1;
			Static156.anInt2709 = 0;
		}
		Static419.aBoolean470 = false;
		Static363.method4695(-3);
		Static329.anInt5081 = 0;
		Static35.anInt4182 = 0;
		Static51.anInt913 = 1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method2215(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg5; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg6++;
				arg3[local34] = (byte) (arg3[local34] - arg0[arg1++]);
				@Pc(47) int local47 = arg6++;
				arg3[local47] = (byte) (arg3[local47] - arg0[arg1++]);
				@Pc(60) int local60 = arg6++;
				arg3[local60] = (byte) (arg3[local60] - arg0[arg1++]);
				@Pc(73) int local73 = arg6++;
				arg3[local73] = (byte) (arg3[local73] - arg0[arg1++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local34 = arg6++;
				arg3[local34] = (byte) (arg3[local34] - arg0[arg1++]);
			}
			arg1 += arg7;
			arg6 += arg4;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method2216() {
		Static64.aClass49_5 = null;
		Static183.anInt3097 = -1;
	}
}
