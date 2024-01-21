import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public int anInt2937;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public int anInt2938;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!db;")
	public Class4_Sub3_Sub3 aClass4_Sub3_Sub3_1;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public int anInt2941;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Lclient!jf;")
	public Class4_Sub1_Sub2 aClass4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "Lclient!jf;")
	public Class4_Sub1_Sub2 aClass4_Sub1_Sub2_3;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	public int anInt2945;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	public int anInt2946;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
	public int anInt2949;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public void method1986() {
		@Pc(12) int local12 = this.anInt2946;
		@Pc(17) Class4_Sub3_Sub3 local17 = this.aClass4_Sub3_Sub3_1.method402();
		if (local17 == null) {
			this.anInt2940 = 0;
			this.anInt2949 = 0;
			this.anIntArray346 = null;
			this.anInt2941 = 0;
			this.anInt2946 = -1;
		} else {
			this.anInt2941 = local17.anInt762;
			this.anInt2940 = local17.anInt731 * 128;
			this.anInt2949 = local17.anInt733;
			this.anInt2946 = local17.anInt739;
			this.anIntArray346 = local17.anIntArray82;
		}
		if (local12 != this.anInt2946 && this.aClass4_Sub1_Sub2_2 != null) {
			Static109.aClass4_Sub1_Sub3_1.method972(this.aClass4_Sub1_Sub2_2);
			this.aClass4_Sub1_Sub2_2 = null;
		}
	}
}
