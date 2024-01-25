import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public int anInt3893;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
	public int anInt3894;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "Lclient!wg;")
	public Class1_Sub5_Sub1_Sub2 aClass1_Sub5_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!lr;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
	public int anInt3898;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
	public int anInt3899;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
	public int anInt3900;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
	public int anInt3902;

	@OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
	public int anInt3904;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
	public int anInt3905;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "Z")
	public boolean aBoolean295;

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "Lclient!gf;")
	public Class1_Sub5_Sub1_Sub1 aClass1_Sub5_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "[I")
	public int[] anIntArray770;

	@OriginalMember(owner = "client!mm", name = "L", descriptor = "Lclient!lr;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_3;

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	public int anInt3907;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "Lclient!nm;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
	public int anInt3897 = 0;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
	public void method3586() {
		@Pc(8) int local8 = this.anInt3905;
		if (this.aClass172_1 != null) {
			@Pc(88) Class172 local88 = this.aClass172_1.method3775(Static321.aClass211_1);
			if (local88 == null) {
				this.anInt3894 = 0;
				this.anIntArray770 = null;
				this.anInt3902 = 0;
				this.anInt3905 = -1;
				this.anInt3898 = 0;
				this.anInt3907 = 0;
			} else {
				this.anInt3902 = local88.anInt4122 * 128;
				this.anInt3905 = local88.anInt4143;
				this.anIntArray770 = local88.anIntArray805;
				this.anInt3907 = local88.anInt4123;
				this.anInt3898 = local88.anInt4147;
				this.anInt3894 = local88.anInt4134;
			}
		} else if (this.aClass1_Sub5_Sub1_Sub2_1 != null) {
			@Pc(42) int local42 = Static121.method2479(this.aClass1_Sub5_Sub1_Sub2_1);
			if (local42 != local8) {
				this.anInt3905 = local42;
				@Pc(52) Class133 local52 = this.aClass1_Sub5_Sub1_Sub2_1.aClass133_1;
				if (local52.anIntArray653 != null) {
					local52 = local52.method3094(Static321.aClass211_1);
				}
				if (local52 == null) {
					this.anInt3898 = this.anInt3902 = 0;
				} else {
					this.anInt3898 = local52.anInt3371;
					this.anInt3902 = local52.anInt3340 * 128;
				}
			}
		} else if (this.aClass1_Sub5_Sub1_Sub1_2 != null) {
			this.anInt3905 = Static164.method2912(this.aClass1_Sub5_Sub1_Sub1_2);
			this.anInt3898 = this.aClass1_Sub5_Sub1_Sub1_2.anInt2299;
			this.anInt3902 = this.aClass1_Sub5_Sub1_Sub1_2.anInt2296 * 128;
		}
		if (local8 != this.anInt3905 && this.aClass2_Sub2_Sub2_3 != null) {
			Static324.aClass2_Sub2_Sub1_2.method58(this.aClass2_Sub2_Sub2_3);
			this.aClass2_Sub2_Sub2_3 = null;
		}
	}
}
