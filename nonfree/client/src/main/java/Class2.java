import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class Class2 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
	public static int[] anIntArray361 = new int[256];

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
	public long aLong82;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!cd;")
	public Class2 aClass2_95;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!cd;")
	public Class2 aClass2_96;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(15) int local15 = local12;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1) == 1) {
					local15 = local15 >>> 1 ^ 0xEDB88320;
				} else {
					local15 >>>= 0x1;
				}
			}
			anIntArray361[local12] = local15;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public final void method2045() {
		if (this.aClass2_96 != null) {
			this.aClass2_96.aClass2_95 = this.aClass2_95;
			this.aClass2_95.aClass2_96 = this.aClass2_96;
			this.aClass2_96 = null;
			this.aClass2_95 = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
	protected final boolean method2046() {
		return this.aClass2_96 != null;
	}
}
