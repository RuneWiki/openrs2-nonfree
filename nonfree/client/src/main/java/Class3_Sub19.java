import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt2870;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!r;")
	public Class3_Sub10_Sub3 aClass3_Sub10_Sub3_2;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt2872;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public int anInt2873;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!be;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	public int anInt2876;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	public int anInt2877;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!r;")
	public Class3_Sub10_Sub3 aClass3_Sub10_Sub3_3;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V")
	public void method1968() {
		@Pc(2) int local2 = this.anInt2872;
		@Pc(19) Class3_Sub1_Sub2 local19 = this.aClass3_Sub1_Sub2_1.method162();
		if (local19 == null) {
			this.anInt2873 = 0;
			this.anInt2870 = 0;
			this.anIntArray418 = null;
			this.anInt2872 = -1;
			this.anInt2881 = 0;
		} else {
			this.anInt2881 = local19.anInt276;
			this.anInt2873 = local19.anInt273 * 128;
			this.anInt2872 = local19.anInt287;
			this.anInt2870 = local19.anInt265;
			this.anIntArray418 = local19.anIntArray28;
		}
		if (this.anInt2872 != local2 && this.aClass3_Sub10_Sub3_2 != null) {
			Static36.aClass3_Sub10_Sub1_1.method861(this.aClass3_Sub10_Sub3_2);
			this.aClass3_Sub10_Sub3_2 = null;
		}
	}
}
