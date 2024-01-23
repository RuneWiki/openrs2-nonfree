import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!og", name = "x", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "I")
	public int anInt3411;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	public int anInt3412;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "I")
	public int anInt3413;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "I")
	public int anInt3414;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "Lclient!ra;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "Lclient!ed;")
	public Class5_Sub5_Sub1 aClass5_Sub5_Sub1_3;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public int anInt3418;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "Lclient!mj;")
	public Class5_Sub5_Sub2 aClass5_Sub5_Sub2_1;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public int anInt3420;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Lclient!jj;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "Lclient!jj;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_3;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!og", name = "V", descriptor = "I")
	public int anInt3424;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "I")
	public int anInt3425;

	@OriginalMember(owner = "client!og", name = "X", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	public int anInt3422 = 0;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public void method2527() {
		@Pc(14) int local14 = this.anInt3424;
		if (this.aClass101_1 != null) {
			@Pc(22) Class101 local22 = this.aClass101_1.method2851();
			if (local22 == null) {
				this.anInt3424 = -1;
				this.anInt3428 = 0;
				this.anInt3411 = 0;
				this.anInt3414 = 0;
				this.anIntArray300 = null;
			} else {
				this.anInt3414 = local22.anInt3899 * 128;
				this.anInt3424 = local22.anInt3918;
				this.anIntArray300 = local22.anIntArray339;
				this.anInt3411 = local22.anInt3910;
				this.anInt3428 = local22.anInt3898;
			}
		} else if (this.aClass5_Sub5_Sub2_1 != null) {
			@Pc(73) int local73 = Static19.method374(this.aClass5_Sub5_Sub2_1);
			if (local73 != local14) {
				@Pc(84) Class30 local84 = this.aClass5_Sub5_Sub2_1.aClass30_1;
				this.anInt3424 = local73;
				if (local84.anIntArray102 != null) {
					local84 = local84.method870();
				}
				if (local84 == null) {
					this.anInt3414 = 0;
				} else {
					this.anInt3414 = local84.anInt972 * 128;
				}
			}
		} else if (this.aClass5_Sub5_Sub1_3 != null) {
			this.anInt3424 = Static188.method3060(this.aClass5_Sub5_Sub1_3);
			this.anInt3414 = this.aClass5_Sub5_Sub1_3.anInt1291 * 128;
		}
		if (local14 != this.anInt3424 && this.aClass1_Sub6_Sub3_3 != null) {
			Static42.aClass1_Sub6_Sub1_1.method966(this.aClass1_Sub6_Sub3_3);
			this.aClass1_Sub6_Sub3_3 = null;
		}
	}
}
