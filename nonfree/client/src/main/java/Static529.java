import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	public static int anInt9711;

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_134 = new Class90(107, -2);

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_135 = new Class90(105, -1);

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)I")
	public static int method7481() {
		@Pc(5) Class167 local5 = Static461.aClass167_48;
		synchronized (Static461.aClass167_48) {
			return Static461.aClass167_48.method3976();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method7482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg8 && arg7 == arg3 && arg4 == arg1 && arg0 == arg5) {
			Static320.method5003(arg4, arg5, arg2, arg7, arg6);
			return;
		}
		@Pc(23) int local23 = arg6;
		@Pc(25) int local25 = arg7;
		@Pc(29) int local29 = arg6 * 3;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(58) int local58 = arg4 + local37 - arg6 - local45;
		@Pc(67) int local67 = local41 + arg5 - local49 - arg7;
		@Pc(76) int local76 = local45 + local29 - local37 - local37;
		@Pc(86) int local86 = local49 + local33 - local41 - local41;
		@Pc(90) int local90 = local37 - local29;
		@Pc(94) int local94 = local41 - local33;
		for (@Pc(96) int local96 = 128; local96 <= 4096; local96 += 128) {
			@Pc(104) int local104 = local96 * local96 >> 12;
			@Pc(110) int local110 = local96 * local104 >> 12;
			@Pc(114) int local114 = local58 * local110;
			@Pc(118) int local118 = local110 * local67;
			@Pc(122) int local122 = local76 * local104;
			@Pc(126) int local126 = local104 * local86;
			@Pc(130) int local130 = local96 * local90;
			@Pc(134) int local134 = local96 * local94;
			@Pc(145) int local145 = arg6 + (local122 + local114 + local130 >> 12);
			@Pc(155) int local155 = (local134 + local118 + local126 >> 12) + arg7;
			Static320.method5003(local145, local155, arg2, local25, local23);
			local23 = local145;
			local25 = local155;
		}
	}
}
