import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class6_Sub3_Sub9 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ie", name = "tb", descriptor = "[I")
	public static int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!ie", name = "kb", descriptor = "[Lclient!rd;")
	public Class63[] aClass63Array14;

	@OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
	public int anInt1635;

	@OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "I")
	public int anInt1640;

	@OriginalMember(owner = "client!ie", name = "wb", descriptor = "[I")
	public int[] anIntArray180;

	static {
		for (@Pc(33) int local33 = 0; local33 < 256; local33++) {
			@Pc(36) int local36 = local33;
			for (@Pc(38) int local38 = 0; local38 < 8; local38++) {
				if ((local36 & 0x1) == 1) {
					local36 = local36 >>> 1 ^ 0xEDB88320;
				} else {
					local36 >>>= 0x1;
				}
			}
			anIntArray179[local33] = local36;
		}
	}
}
