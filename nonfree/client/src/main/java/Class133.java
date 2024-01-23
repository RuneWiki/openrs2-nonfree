import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class133 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[B")
	public static byte[] aByteArray67 = new byte[32896];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Lclient!h;")
	public Class25 aClass25_4;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public int anInt4873;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public int anInt4874;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
	public int anInt4877;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!h;")
	public Class25 aClass25_5;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
	public int anInt4882;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "J")
	public long aLong160 = 0L;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(13) int local13 = 0; local13 <= local6; local13++) {
				aByteArray67[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}
}
