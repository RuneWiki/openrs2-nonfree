import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "Z")
	public static boolean aBoolean602;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
	public static int anInt8328;

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_267 = new Class194(25, 6);

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[250][];

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
	public static int anInt8327 = 0;

	@OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
	public static int anInt8329 = 0;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIBII)I")
	public static int method7193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class3_Sub13.anIntArray146[arg1 * 8192 / arg3] >> 1;
		return (arg2 * local21 >> 16) + ((65536 - local21) * arg0 >> 16);
	}
}
