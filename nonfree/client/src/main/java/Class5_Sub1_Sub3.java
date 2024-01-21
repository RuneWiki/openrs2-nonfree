import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
	public static int[] anIntArray16 = new int[256];

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
	public int anInt274;

	static {
		for (@Pc(30) int local30 = 0; local30 < 256; local30++) {
			@Pc(33) int local33 = local30;
			for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
				if ((local33 & 0x1) == 1) {
					local33 = local33 >>> 1 ^ 0xEDB88320;
				} else {
					local33 >>>= 0x1;
				}
			}
			anIntArray16[local30] = local33;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!qe;B)V")
	public void method185(@OriginalArg(0) Class5_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1546();
			if (local5 == 0) {
				return;
			}
			this.method186(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!qe;BI)V")
	private void method186(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt274 = arg0.method1543();
			this.anInt271 = arg0.method1546();
			this.anInt267 = arg0.method1546();
		}
	}
}
