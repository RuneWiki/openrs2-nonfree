import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
	public static int anInt9757;

	@OriginalMember(owner = "client!tha", name = "r", descriptor = "I")
	public static int anInt9758;

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "Lclient!sia;")
	public static final Class315 aClass315_5 = new Class315();

	@OriginalMember(owner = "client!tha", name = "s", descriptor = "I")
	public static int anInt9759 = -1;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I[BIIII[BIB)V")
	public static void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg3++;
				arg1[local31] = (byte) (arg1[local31] - arg6[arg0++]);
				@Pc(44) int local44 = arg3++;
				arg1[local44] = (byte) (arg1[local44] - arg6[arg0++]);
				@Pc(57) int local57 = arg3++;
				arg1[local57] = (byte) (arg1[local57] - arg6[arg0++]);
				@Pc(70) int local70 = arg3++;
				arg1[local70] = (byte) (arg1[local70] - arg6[arg0++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg3++;
				arg1[local31] = (byte) (arg1[local31] - arg6[arg0++]);
			}
			arg3 += arg4;
			arg0 += arg5;
		}
	}
}
