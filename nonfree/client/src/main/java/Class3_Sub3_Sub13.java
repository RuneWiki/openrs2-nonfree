import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "[I")
	public static int[] anIntArray377 = new int[256];

	@OriginalMember(owner = "client!u", name = "X", descriptor = "I")
	public int anInt2573;

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
	public int anInt2583;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	public int anInt2584;

	static {
		for (@Pc(159) int local159 = 0; local159 < 256; local159++) {
			@Pc(162) int local162 = local159;
			for (@Pc(164) int local164 = 0; local164 < 8; local164++) {
				if ((local162 & 0x1) == 1) {
					local162 = local162 >>> 1 ^ 0xEDB88320;
				} else {
					local162 >>>= 0x1;
				}
			}
			anIntArray377[local159] = local162;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!wd;Z)V")
	private void method1776(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2583 = arg1.method1451();
			this.anInt2573 = arg1.method1421();
			this.anInt2584 = arg1.method1421();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1780(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1421();
			if (local9 == 0) {
				return;
			}
			this.method1776(local9, arg0);
		}
	}
}
