import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class7_Sub19 extends Class7 {

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "[B")
	public static final byte[] aByteArray30 = new byte[32896];

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "S")
	public short aShort32;

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			for (@Pc(21) int local21 = 0; local21 <= local18; local21++) {
				aByteArray30[local16++] = (byte) (255.0D / Math.sqrt((double) ((float) (local18 * local18 + local21 * local21 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	private Class7_Sub19() {
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(S)V")
	public Class7_Sub19(@OriginalArg(0) short arg0) {
		this.aShort32 = arg0;
	}
}
