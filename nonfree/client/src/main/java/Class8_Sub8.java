import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[B")
	public static final byte[] aByteArray79 = new byte[32896];

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!oc;")
	public Class8_Sub8 aClass8_Sub8_9;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!oc;")
	public Class8_Sub8 aClass8_Sub8_10;

	static {
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			for (@Pc(47) int local47 = 0; local47 <= local44; local47++) {
				aByteArray79[local42++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local47 * local47 + local44 * local44 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public final void method6981() {
		if (this.aClass8_Sub8_9 != null) {
			this.aClass8_Sub8_9.aClass8_Sub8_10 = this.aClass8_Sub8_10;
			this.aClass8_Sub8_10.aClass8_Sub8_9 = this.aClass8_Sub8_9;
			this.aClass8_Sub8_10 = null;
			this.aClass8_Sub8_9 = null;
		}
	}
}
