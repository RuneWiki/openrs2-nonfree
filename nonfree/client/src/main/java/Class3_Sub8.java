import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	public int anInt1888;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "Lclient!de;")
	public Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	public int anInt1891;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	public int anInt1892;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	public int anInt1893;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "Lclient!de;")
	public Class3_Sub3_Sub1 aClass3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	public int anInt1894;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lclient!ld;")
	public Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public void method1284() {
		@Pc(6) int local6 = this.anInt1892;
		@Pc(11) Class3_Sub1_Sub5 local11 = this.aClass3_Sub1_Sub5_1.method1030();
		if (local11 == null) {
			this.anIntArray242 = null;
			this.anInt1889 = 0;
			this.anInt1892 = -1;
			this.anInt1906 = 0;
			this.anInt1905 = 0;
		} else {
			this.anInt1906 = local11.anInt1528;
			this.anIntArray242 = local11.anIntArray213;
			this.anInt1892 = local11.anInt1544;
			this.anInt1905 = local11.anInt1522;
			this.anInt1889 = local11.anInt1535 * 128;
		}
		if (local6 != this.anInt1892 && this.aClass3_Sub3_Sub1_1 != null) {
			Static52.aClass3_Sub3_Sub2_1.method1057(this.aClass3_Sub3_Sub1_1);
			this.aClass3_Sub3_Sub1_1 = null;
		}
	}
}
