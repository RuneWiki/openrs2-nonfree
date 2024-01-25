import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
	public static int anInt3490;

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array10;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public static int anInt3489 = 0;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
	public static int method3071(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
