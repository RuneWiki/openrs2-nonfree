import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!hb;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB[BI[BIII)V")
	public static void method8483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg2[local31] += arg4[arg1++];
				@Pc(43) int local43 = arg5++;
				arg2[local43] += arg4[arg1++];
				@Pc(55) int local55 = arg5++;
				arg2[local55] += arg4[arg1++];
				@Pc(67) int local67 = arg5++;
				arg2[local67] += arg4[arg1++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg5++;
				arg2[local31] += arg4[arg1++];
			}
			arg5 += arg0;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method8486() {
		if (!Static352.method5771()) {
			return;
		}
		if (Static469.aStringArray66 == null) {
			Static473.method7004();
		}
		Static471.aBoolean575 = true;
		Static321.anInt6143 = 0;
	}
}
