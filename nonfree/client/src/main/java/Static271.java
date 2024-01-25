import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kd", name = "Ug", descriptor = "Lclient!la;")
	public static Class37 aClass37_10;

	@OriginalMember(owner = "client!kd", name = "wg", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!kd", name = "eh", descriptor = "[Lclient!ds;")
	public static final Class80[] aClass80Array1 = new Class80[8];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([I[JI)V")
	public static void method3963(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static30.method392(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method3965(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg2[local26] = (byte) (arg2[local26] - arg1[arg3++]);
				@Pc(39) int local39 = arg0++;
				arg2[local39] = (byte) (arg2[local39] - arg1[arg3++]);
				@Pc(52) int local52 = arg0++;
				arg2[local52] = (byte) (arg2[local52] - arg1[arg3++]);
				@Pc(65) int local65 = arg0++;
				arg2[local65] = (byte) (arg2[local65] - arg1[arg3++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg0++;
				arg2[local26] = (byte) (arg2[local26] - arg1[arg3++]);
			}
			arg0 += arg5;
			arg3 += arg6;
		}
	}
}
