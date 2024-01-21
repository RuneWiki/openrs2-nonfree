import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public int anInt1135;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public int anInt1137;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	public int anInt1139;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!de;")
	public Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
	public int anInt1142;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "Lclient!r;")
	public Class2_Sub1_Sub13 aClass2_Sub1_Sub13_1;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	public int anInt1149;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public int anInt1150;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!de;")
	public Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
	public void method836() {
		@Pc(6) int local6 = this.anInt1150;
		@Pc(11) Class2_Sub1_Sub13 local11 = this.aClass2_Sub1_Sub13_1.method1630();
		if (local11 == null) {
			this.anInt1149 = 0;
			this.anInt1154 = 0;
			this.anIntArray160 = null;
			this.anInt1150 = -1;
			this.anInt1142 = 0;
		} else {
			this.anInt1142 = local11.anInt2291;
			this.anIntArray160 = local11.anIntArray269;
			this.anInt1150 = local11.anInt2295;
			this.anInt1154 = local11.anInt2322;
			this.anInt1149 = local11.anInt2301 * 128;
		}
		if (local6 != this.anInt1150 && this.aClass2_Sub3_Sub1_2 != null) {
			Static100.aClass2_Sub3_Sub2_1.method2061(this.aClass2_Sub3_Sub1_2);
			this.aClass2_Sub3_Sub1_2 = null;
		}
	}
}
