import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_20 = new Class137(64);

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method1844() {
		Static246.aClass46Array1 = new Class46[50];
		Static418.anInt7061 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[BIIIII[B)V")
	public static void method1845(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(23) int local23 = -(arg6 & 0x3);
		for (@Pc(26) int local26 = -arg0; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg2++;
				arg1[local34] += arg7[arg3++];
				@Pc(46) int local46 = arg2++;
				arg1[local46] += arg7[arg3++];
				@Pc(58) int local58 = arg2++;
				arg1[local58] += arg7[arg3++];
				@Pc(70) int local70 = arg2++;
				arg1[local70] += arg7[arg3++];
			}
			for (@Pc(88) int local88 = local23; local88 < 0; local88++) {
				local34 = arg2++;
				arg1[local34] += arg7[arg3++];
			}
			arg2 += arg5;
			arg3 += arg4;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)Z")
	public static boolean method1847() {
		return Static324.aClass178_18 != Static193.aClass178_9 || Static270.anInt4509 >= 2;
	}
}
