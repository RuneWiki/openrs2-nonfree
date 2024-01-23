import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public class Class1 {

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "[B")
	protected static byte[] aByteArray188 = new byte[32896];

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!ak;")
	public Class1 aClass1_234;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
	public long aLong210;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!ak;")
	public Class1 aClass1_235;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			for (@Pc(20) int local20 = 0; local20 <= local13; local20++) {
				aByteArray188[local11++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local20 * local20 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public final void method4573() {
		if (this.aClass1_234 != null) {
			this.aClass1_234.aClass1_235 = this.aClass1_235;
			this.aClass1_235.aClass1_234 = this.aClass1_234;
			this.aClass1_235 = null;
			this.aClass1_234 = null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z")
	public final boolean method4574() {
		return this.aClass1_234 != null;
	}
}
