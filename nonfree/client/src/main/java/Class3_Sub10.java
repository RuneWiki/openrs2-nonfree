import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Lclient!pe;")
	public Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	public int anInt2104;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "Lclient!r;")
	public Class3_Sub1_Sub15 aClass3_Sub1_Sub15_1;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	public int anInt2109;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lclient!pe;")
	public Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public void method1366() {
		@Pc(11) int local11 = this.anInt2109;
		@Pc(16) Class3_Sub1_Sub15 local16 = this.aClass3_Sub1_Sub15_1.method1522();
		if (local16 == null) {
			this.anInt2109 = -1;
			this.anInt2117 = 0;
			this.anIntArray233 = null;
			this.anInt2104 = 0;
			this.anInt2113 = 0;
		} else {
			this.anInt2109 = local16.anInt2329;
			this.anIntArray233 = local16.anIntArray259;
			this.anInt2104 = local16.anInt2334;
			this.anInt2113 = local16.anInt2317;
			this.anInt2117 = local16.anInt2311 * 128;
		}
		if (this.anInt2109 != local11 && this.aClass3_Sub2_Sub2_1 != null) {
			Static1.aClass3_Sub2_Sub1_1.method343(this.aClass3_Sub2_Sub2_1);
			this.aClass3_Sub2_Sub2_1 = null;
		}
	}
}
