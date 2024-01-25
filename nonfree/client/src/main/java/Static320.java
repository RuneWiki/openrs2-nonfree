import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	public static int anInt5748;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "Lclient!ww;")
	public static Class363 aClass363_1;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Lclient!bi;")
	public static Class31 aClass31_68;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_287 = new Class64(24, -1);

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_288 = new Class64(10, -1);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([IBIILclient!no;[I)Lclient!on;")
	public static Class98_Sub3 method4880(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66_Sub3 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg1 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg0[local17] + arg1 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg4[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class98_Sub3(arg3, arg1, arg2, local15);
	}
}
