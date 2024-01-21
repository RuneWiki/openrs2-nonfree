import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public class Class2 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
	public static int[] anIntArray382 = new int[256];

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!ld;")
	public Class2 aClass2_93;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "J")
	public long aLong72;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!ld;")
	public Class2 aClass2_94;

	static {
		for (@Pc(283) int local283 = 0; local283 < 256; local283++) {
			@Pc(286) int local286 = local283;
			for (@Pc(288) int local288 = 0; local288 < 8; local288++) {
				if ((local286 & 0x1) == 1) {
					local286 = local286 >>> 1 ^ 0xEDB88320;
				} else {
					local286 >>>= 0x1;
				}
			}
			anIntArray382[local283] = local286;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public final void method1695() {
		if (this.aClass2_94 != null) {
			this.aClass2_94.aClass2_93 = this.aClass2_93;
			this.aClass2_93.aClass2_94 = this.aClass2_94;
			this.aClass2_94 = null;
			this.aClass2_93 = null;
		}
	}
}
