import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	public int anInt1192;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	public int anInt1194;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public int anInt1201;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!da;")
	public Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lclient!h;")
	public Class3_Sub1_Sub9 aClass3_Sub1_Sub9_1;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!ic", name = "lb", descriptor = "I")
	public int anInt1210;

	@OriginalMember(owner = "client!ic", name = "mb", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!ic", name = "rb", descriptor = "I")
	public int anInt1212;

	@OriginalMember(owner = "client!ic", name = "tb", descriptor = "Lclient!da;")
	public Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	public void method708() {
		@Pc(6) int local6 = this.anInt1201;
		@Pc(11) Class3_Sub1_Sub9 local11 = this.aClass3_Sub1_Sub9_1.method653();
		if (local11 == null) {
			this.anInt1201 = -1;
			this.anInt1194 = 0;
			this.anInt1206 = 0;
			this.anIntArray83 = null;
			this.anInt1210 = 0;
		} else {
			this.anInt1210 = local11.anInt1044;
			this.anIntArray83 = local11.anIntArray73;
			this.anInt1201 = local11.anInt1071;
			this.anInt1206 = local11.anInt1077;
			this.anInt1194 = local11.anInt1054 * 128;
		}
		if (local6 != this.anInt1201 && this.aClass3_Sub4_Sub1_1 != null) {
			Static53.aClass3_Sub4_Sub2_1.method1570(this.aClass3_Sub4_Sub1_1);
			this.aClass3_Sub4_Sub1_1 = null;
		}
	}
}
