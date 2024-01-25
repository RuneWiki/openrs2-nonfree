import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "[J")
	public static final long[] aLongArray38 = new long[256];

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Lclient!gk;")
	public Class5_Sub2 aClass5_Sub2_57;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!gk;")
	public Class5_Sub2 aClass5_Sub2_58;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "J")
	public long aLong235;

	static {
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(25) long local25 = (long) local21;
			for (@Pc(27) int local27 = 0; local27 < 8; local27++) {
				if ((local25 & 0x1L) == 1L) {
					local25 = local25 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local25 >>>= 0x1;
				}
			}
			aLongArray38[local21] = local25;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public final void method6006() {
		if (this.aClass5_Sub2_57 != null) {
			this.aClass5_Sub2_57.aClass5_Sub2_58 = this.aClass5_Sub2_58;
			this.aClass5_Sub2_58.aClass5_Sub2_57 = this.aClass5_Sub2_57;
			this.aClass5_Sub2_58 = null;
			this.aClass5_Sub2_57 = null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)Z")
	public final boolean method6007() {
		return this.aClass5_Sub2_57 != null;
	}
}
