import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!lb;")
	public Class6_Sub3_Sub1 aClass6_Sub3_Sub1_1;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public int anInt1909;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	public int anInt1917;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	public int anInt1919;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "Lclient!lb;")
	public Class6_Sub3_Sub1 aClass6_Sub3_Sub1_2;

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
	public int anInt1920;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "Lclient!ua;")
	public Class6_Sub2_Sub15 aClass6_Sub2_Sub15_1;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
	public int anInt1923;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public void method1335() {
		@Pc(6) int local6 = this.anInt1906;
		@Pc(11) Class6_Sub2_Sub15 local11 = this.aClass6_Sub2_Sub15_1.method1937();
		if (local11 == null) {
			this.anInt1906 = -1;
			this.anInt1918 = 0;
			this.anIntArray185 = null;
			this.anInt1925 = 0;
			this.anInt1915 = 0;
		} else {
			this.anInt1906 = local11.anInt2983;
			this.anIntArray185 = local11.anIntArray285;
			this.anInt1915 = local11.anInt2988;
			this.anInt1925 = local11.anInt2998 * 128;
			this.anInt1918 = local11.anInt3005;
		}
		if (this.anInt1906 != local6 && this.aClass6_Sub3_Sub1_2 != null) {
			Static26.aClass6_Sub3_Sub2_3.method1980(this.aClass6_Sub3_Sub1_2);
			this.aClass6_Sub3_Sub1_2 = null;
		}
	}
}
