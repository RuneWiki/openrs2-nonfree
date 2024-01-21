import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!ta;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
	public int anInt3017;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public int anInt3019;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public int anInt3020;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public int anInt3021;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	public int anInt3022;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!ta;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_3;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "Lclient!lf;")
	public Class2_Sub1_Sub10 aClass2_Sub1_Sub10_1;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
	public int anInt3024;

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	public int anInt3027;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public void method2158() {
		@Pc(12) int local12 = this.anInt3021;
		@Pc(17) Class2_Sub1_Sub10 local17 = this.aClass2_Sub1_Sub10_1.method1580();
		if (local17 == null) {
			this.anInt3020 = 0;
			this.anInt3022 = 0;
			this.anInt3014 = 0;
			this.anIntArray326 = null;
			this.anInt3021 = -1;
		} else {
			this.anInt3022 = local17.anInt2249;
			this.anInt3021 = local17.anInt2245;
			this.anIntArray326 = local17.anIntArray235;
			this.anInt3020 = local17.anInt2226;
			this.anInt3014 = local17.anInt2236 * 128;
		}
		if (this.anInt3021 != local12 && this.aClass2_Sub5_Sub2_2 != null) {
			Static2.aClass2_Sub5_Sub3_1.method2615(this.aClass2_Sub5_Sub2_2);
			this.aClass2_Sub5_Sub2_2 = null;
		}
	}
}
