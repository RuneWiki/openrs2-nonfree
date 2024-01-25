import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class225 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "[B")
	public static final byte[] aByteArray79;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public int anInt6081;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public int anInt6082;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public int anInt6083;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public int anInt6085;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
	public int anInt6088;

	static {
		@Pc(1) int local1 = 0;
		aByteArray79 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray79[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}
}
