import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class138 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[B")
	public static byte[] aByteArray64 = new byte[32896];

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!sc;")
	private Class34 aClass34_10;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Lclient!sc;")
	public Class34 aClass34_9 = new Class34();

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(13) int local13 = 0; local13 <= local6; local13++) {
				aByteArray64[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local13 * local13 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class138() {
		this.aClass34_9.aClass34_11 = this.aClass34_9;
		this.aClass34_9.aClass34_12 = this.aClass34_9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!sc;B)V")
	public void method3533(@OriginalArg(0) Class34 arg0) {
		if (arg0.aClass34_11 != null) {
			arg0.method4182();
		}
		arg0.aClass34_11 = this.aClass34_9.aClass34_11;
		arg0.aClass34_12 = this.aClass34_9;
		arg0.aClass34_11.aClass34_12 = arg0;
		arg0.aClass34_12.aClass34_11 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lclient!sc;")
	public Class34 method3536() {
		@Pc(2) Class34 local2 = this.aClass34_10;
		if (this.aClass34_9 == local2) {
			this.aClass34_10 = null;
			return null;
		} else {
			this.aClass34_10 = local2.aClass34_12;
			return local2;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	public int method3537() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class34 local11 = this.aClass34_9.aClass34_12;
		while (this.aClass34_9 != local11) {
			local11 = local11.aClass34_12;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!sc;")
	public Class34 method3540() {
		@Pc(7) Class34 local7 = this.aClass34_9.aClass34_12;
		if (local7 == this.aClass34_9) {
			this.aClass34_10 = null;
			return null;
		} else {
			this.aClass34_10 = local7.aClass34_12;
			return local7;
		}
	}
}
