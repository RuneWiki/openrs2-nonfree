import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!vb;")
	public Class1_Sub1_Sub16 aClass1_Sub1_Sub16_1;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!lc;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
	public int anInt2872;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	public int anInt2873;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
	public int anInt2875;

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	public int anInt2876;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "Lclient!lc;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public void method1918() {
		@Pc(6) int local6 = this.anInt2883;
		@Pc(11) Class1_Sub1_Sub16 local11 = this.aClass1_Sub1_Sub16_1.method1958();
		if (local11 == null) {
			this.anInt2882 = 0;
			this.anInt2881 = 0;
			this.anInt2875 = 0;
			this.anInt2883 = -1;
			this.anIntArray356 = null;
		} else {
			this.anIntArray356 = local11.anIntArray365;
			this.anInt2882 = local11.anInt2955 * 128;
			this.anInt2881 = local11.anInt2977;
			this.anInt2875 = local11.anInt2965;
			this.anInt2883 = local11.anInt2950;
		}
		if (local6 != this.anInt2883 && this.aClass1_Sub4_Sub3_2 != null) {
			Static30.aClass1_Sub4_Sub4_2.method1903(this.aClass1_Sub4_Sub3_2);
			this.aClass1_Sub4_Sub3_2 = null;
		}
	}
}
