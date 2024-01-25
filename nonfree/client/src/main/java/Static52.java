import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
	public static final int[] anIntArray223 = new int[1000];

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public static int method2350(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(30) int local30 = (local20 >>> 2 & 0x33333333) + (local20 & 0x33333333);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
