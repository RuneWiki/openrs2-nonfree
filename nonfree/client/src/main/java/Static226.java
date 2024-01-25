import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Lclient!kha;")
	public static Class181 aClass181_47;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_8;

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "Lclient!kha;")
	public static Class181 aClass181_49;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString47 = null;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!iba", name = "u", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)V")
	public static void method4342(@OriginalArg(0) int arg0) {
		Static31.anInt601 = arg0;
		Static376.aClass112_42.method3638();
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIZI[B[B)V")
	public static void method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(23) int local23 = -(arg1 >> 2);
		@Pc(28) int local28 = -(arg1 & 0x3);
		for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg2++;
				arg6[local39] += arg7[arg3++];
				@Pc(51) int local51 = arg2++;
				arg6[local51] += arg7[arg3++];
				@Pc(63) int local63 = arg2++;
				arg6[local63] += arg7[arg3++];
				@Pc(75) int local75 = arg2++;
				arg6[local75] += arg7[arg3++];
			}
			for (@Pc(90) int local90 = local28; local90 < 0; local90++) {
				local39 = arg2++;
				arg6[local39] += arg7[arg3++];
			}
			arg2 += arg0;
			arg3 += arg5;
		}
	}
}
