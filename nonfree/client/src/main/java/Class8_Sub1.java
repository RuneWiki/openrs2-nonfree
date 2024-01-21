import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[I")
	public static int[] anIntArray391 = new int[256];

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Lclient!hb;")
	public Class8_Sub1 aClass8_Sub1_65;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!hb;")
	public Class8_Sub1 aClass8_Sub1_66;

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
			anIntArray391[local12] = local15;
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	public final void method1952() {
		if (this.aClass8_Sub1_65 != null) {
			this.aClass8_Sub1_65.aClass8_Sub1_66 = this.aClass8_Sub1_66;
			this.aClass8_Sub1_66.aClass8_Sub1_65 = this.aClass8_Sub1_65;
			this.aClass8_Sub1_66 = null;
			this.aClass8_Sub1_65 = null;
		}
	}
}
