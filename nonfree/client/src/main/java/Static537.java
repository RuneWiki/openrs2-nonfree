import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public static int anInt8833;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Lclient!ke;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!fo;")
	public static Class112 aClass112_11;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	public static final int[] anIntArray578 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "[Lclient!cu;")
	public static Class67[] aClass67Array1 = new Class67[50];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[BII[BIIII)V")
	public static void method7040(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg1[local26] = (byte) (arg1[local26] - arg4[arg5++]);
				@Pc(39) int local39 = arg0++;
				arg1[local39] = (byte) (arg1[local39] - arg4[arg5++]);
				@Pc(52) int local52 = arg0++;
				arg1[local52] = (byte) (arg1[local52] - arg4[arg5++]);
				@Pc(65) int local65 = arg0++;
				arg1[local65] = (byte) (arg1[local65] - arg4[arg5++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg0++;
				arg1[local26] = (byte) (arg1[local26] - arg4[arg5++]);
			}
			arg0 += arg2;
			arg5 += arg3;
		}
	}
}
