import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "[B")
	public static final byte[] aByteArray72 = new byte[32896];

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	public final int anInt5785;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray72[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(I)V")
	public Class13_Sub8(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0;
	}
}
