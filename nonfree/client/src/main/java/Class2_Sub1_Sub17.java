import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
	public static int[] anIntArray409 = new int[256];

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "[Lclient!pe;")
	public Class65[] aClass65Array82;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	public int anInt2890;

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Lclient!pe;")
	public Class65 aClass65_1252;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
	public int anInt2892;

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
	public int anInt2894;

	static {
		for (@Pc(69) int local69 = 0; local69 < 256; local69++) {
			@Pc(72) int local72 = local69;
			for (@Pc(74) int local74 = 0; local74 < 8; local74++) {
				if ((local72 & 0x1) == 1) {
					local72 = local72 >>> 1 ^ 0xEDB88320;
				} else {
					local72 >>>= 0x1;
				}
			}
			anIntArray409[local69] = local72;
		}
	}
}
