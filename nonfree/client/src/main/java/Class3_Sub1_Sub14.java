import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!o", name = "R", descriptor = "[I")
	public static final int[] anIntArray360 = new int[256];

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt2693 = 0;

	static {
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(19) int local19 = local16;
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				if ((local19 & 0x1) == 1) {
					local19 = local19 >>> 1 ^ 0xEDB88320;
				} else {
					local19 >>>= 0x1;
				}
			}
			anIntArray360[local16] = local19;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!mb;)V")
	public void method1858(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2107();
			if (local9 == 0) {
				return;
			}
			this.method1861(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!mb;BI)V")
	private void method1861(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2693 = arg0.method2111();
		}
	}
}
