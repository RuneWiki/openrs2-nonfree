import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "[B")
	public static final byte[] aByteArray18 = new byte[32896];

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_6;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray18[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	public final void method373() {
		if (this.aClass7_Sub1_6 != null) {
			this.aClass7_Sub1_6.aClass7_Sub1_5 = this.aClass7_Sub1_5;
			this.aClass7_Sub1_5.aClass7_Sub1_6 = this.aClass7_Sub1_6;
			this.aClass7_Sub1_5 = null;
			this.aClass7_Sub1_6 = null;
		}
	}
}
