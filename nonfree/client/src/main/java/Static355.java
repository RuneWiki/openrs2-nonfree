import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_94 = new Class342();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)I")
	public static int method9492() {
		return Static397.aClass325_1.method7283();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIII)V")
	public static void method9493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404() != 0 && arg2 != 0 && Static385.anInt5974 < 50 && arg3 != -1) {
			Static149.aClass398Array1[Static385.anInt5974++] = new Class398((byte) 1, arg3, arg2, arg4, arg1, 0, arg0, (Class9_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIILclient!nt;)V")
	public static void method9496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class270 arg2) {
		if (Static334.aClass270_10 != null || Static530.aBoolean556 || (arg2 == null || Static8.method247(arg2) == null)) {
			return;
		}
		Static334.aClass270_10 = arg2;
		Static309.aClass270_9 = Static8.method247(arg2);
		Static331.anInt5332 = 0;
		Static323.anInt5198 = arg0;
		Static720.anInt11175 = arg1;
		Static634.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII[B[B)V")
	public static void method9497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg1++;
				arg6[local31] += arg7[arg4++];
				@Pc(43) int local43 = arg1++;
				arg6[local43] += arg7[arg4++];
				@Pc(55) int local55 = arg1++;
				arg6[local55] += arg7[arg4++];
				@Pc(67) int local67 = arg1++;
				arg6[local67] += arg7[arg4++];
			}
			for (@Pc(87) int local87 = local15; local87 < 0; local87++) {
				local31 = arg1++;
				arg6[local31] += arg7[arg4++];
			}
			arg1 += arg5;
			arg4 += arg2;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public static void method9498() {
		if (Static467.aClass107_3 != null) {
			Static467.aClass107_3.method5371();
		}
		if (Static93.aClass107_1 != null) {
			Static93.aClass107_1.method5371();
		}
	}
}
