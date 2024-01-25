import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "[[[Lclient!ni;")
	public static Class247[][][] aClass247ArrayArrayArray3;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "I")
	public static int anInt9578;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public static int anInt9583 = -2;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)I")
	public static int method8107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(31) double local31 = local22 + Math.random() * (local15 - local22);
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
