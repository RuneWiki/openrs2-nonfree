import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!ga;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "Lclient!vo;")
	public static Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	public static int anInt6662 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIZ)I")
	public static int method5212(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub25 local14 = Static175.method2834(false, arg0);
		if (local14 == null) {
			return Static101.aClass75_1.method2079(arg0).anInt207;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray230.length; local26++) {
			if (local14.anIntArray230[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static101.aClass75_1.method2079(arg0).anInt207 - local14.anIntArray230.length;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg1++;
				arg2[local31] += arg7[arg4++];
				@Pc(43) int local43 = arg1++;
				arg2[local43] += arg7[arg4++];
				@Pc(55) int local55 = arg1++;
				arg2[local55] += arg7[arg4++];
				@Pc(67) int local67 = arg1++;
				arg2[local67] += arg7[arg4++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local31 = arg1++;
				arg2[local31] += arg7[arg4++];
			}
			arg1 += arg6;
			arg4 += arg5;
		}
	}
}
