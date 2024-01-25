import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public abstract class Class109 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "[B")
	public static final byte[] aByteArray47;

	static {
		@Pc(1) int local1 = 0;
		aByteArray47 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray47[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ow;B)Lclient!ow;")
	public abstract Class5_Sub2_Sub11 method2817(@OriginalArg(0) Class5_Sub2_Sub11 arg0);
}
