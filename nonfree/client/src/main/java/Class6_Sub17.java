import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Lclient!j;")
	public Class6_Sub3_Sub10 aClass6_Sub3_Sub10_1;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	public int anInt2815;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lclient!ee;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_2;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
	public int anInt2819;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lclient!ee;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_3;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	public void method1850() {
		@Pc(10) int local10 = this.anInt2816;
		@Pc(15) Class6_Sub3_Sub10 local15 = this.aClass6_Sub3_Sub10_1.method1123();
		if (local15 == null) {
			this.anIntArray297 = null;
			this.anInt2809 = 0;
			this.anInt2813 = 0;
			this.anInt2816 = -1;
			this.anInt2808 = 0;
		} else {
			this.anInt2813 = local15.anInt1700;
			this.anInt2808 = local15.anInt1701 * 128;
			this.anInt2816 = local15.anInt1675;
			this.anIntArray297 = local15.anIntArray182;
			this.anInt2809 = local15.anInt1694;
		}
		if (local10 != this.anInt2816 && this.aClass6_Sub6_Sub1_3 != null) {
			Static54.aClass6_Sub6_Sub2_1.method1629(this.aClass6_Sub6_Sub1_3);
			this.aClass6_Sub6_Sub1_3 = null;
		}
	}
}
