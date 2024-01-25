import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Lclient!ma;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_2;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	public int anInt4643;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
	public int anInt4644;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
	public int anInt4645;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
	public int anInt4647;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!tea;")
	public Class3_Sub47 aClass3_Sub47_1;

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Lclient!lea;")
	public Class2_Sub3_Sub1_Sub2_Sub2 aClass2_Sub3_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	public int anInt4649;

	@OriginalMember(owner = "client!hca", name = "x", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "I")
	public int anInt4654;

	@OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
	public int anInt4655;

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!hca", name = "B", descriptor = "Lclient!bf;")
	public Class3_Sub7_Sub1 aClass3_Sub7_Sub1_2;

	@OriginalMember(owner = "client!hca", name = "C", descriptor = "Lclient!bf;")
	public Class3_Sub7_Sub1 aClass3_Sub7_Sub1_3;

	@OriginalMember(owner = "client!hca", name = "D", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!hca", name = "E", descriptor = "Lclient!tea;")
	public Class3_Sub47 aClass3_Sub47_2;

	@OriginalMember(owner = "client!hca", name = "F", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!hca", name = "I", descriptor = "I")
	public int anInt4657;

	@OriginalMember(owner = "client!hca", name = "J", descriptor = "Lclient!qg;")
	public Class272 aClass272_1;

	@OriginalMember(owner = "client!hca", name = "K", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!hca", name = "L", descriptor = "Lclient!dv;")
	public Class2_Sub3_Sub1_Sub2_Sub1 aClass2_Sub3_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!hca", name = "N", descriptor = "Lclient!ma;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_3;

	@OriginalMember(owner = "client!hca", name = "O", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!hca", name = "P", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
	public int anInt4653 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public void method3944() {
		@Pc(8) int local8 = this.anInt4657;
		@Pc(11) boolean local11 = this.aBoolean401;
		if (this.aClass272_1 != null) {
			@Pc(130) Class272 local130 = this.aClass272_1.method6856(Static514.aClass166_1);
			if (local130 == null) {
				this.aBoolean401 = false;
				this.anIntArray244 = null;
				this.anInt4648 = 0;
				this.anInt4643 = 256;
				this.anInt4654 = 256;
				this.anInt4647 = 0;
				this.anInt4644 = 0;
				this.anInt4645 = 0;
				this.aBoolean400 = false;
				this.anInt4657 = -1;
			} else {
				this.anInt4657 = local130.anInt8275;
				this.anIntArray244 = local130.anIntArray522;
				this.anInt4645 = local130.anInt8259;
				this.anInt4648 = local130.anInt8278;
				this.anInt4647 = local130.anInt8253;
				this.aBoolean401 = local130.aBoolean708;
				this.aBoolean400 = local130.aBoolean706;
				this.anInt4654 = local130.anInt8248;
				this.anInt4644 = local130.anInt8251 << 9;
				this.anInt4643 = local130.anInt8266;
			}
		} else if (this.aClass2_Sub3_Sub1_Sub2_Sub1_1 != null) {
			@Pc(22) int local22 = Static545.method7729(this.aClass2_Sub3_Sub1_Sub2_Sub1_1);
			if (local8 != local22) {
				this.anInt4657 = local22;
				@Pc(36) Class22 local36 = this.aClass2_Sub3_Sub1_Sub2_Sub1_1.aClass22_1;
				if (local36.anIntArray29 != null) {
					local36 = local36.method425(Static514.aClass166_1);
				}
				if (local36 == null) {
					this.anInt4643 = 256;
					this.anInt4645 = this.anInt4644 = 0;
					this.aBoolean401 = this.aClass2_Sub3_Sub1_Sub2_Sub1_1.aClass22_1.aBoolean36;
					this.anInt4654 = 256;
				} else {
					this.anInt4645 = local36.anInt417;
					this.aBoolean401 = local36.aBoolean36;
					this.anInt4644 = local36.anInt422 << 9;
					this.anInt4654 = local36.anInt405;
					this.anInt4643 = local36.anInt395;
				}
			}
		} else if (this.aClass2_Sub3_Sub1_Sub2_Sub2_3 != null) {
			this.anInt4657 = Static499.method7288(this.aClass2_Sub3_Sub1_Sub2_Sub2_3);
			this.anInt4645 = this.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6360;
			this.anInt4654 = 256;
			this.anInt4644 = this.aClass2_Sub3_Sub1_Sub2_Sub2_3.anInt6362 << 9;
			this.anInt4643 = 256;
			this.aBoolean401 = this.aClass2_Sub3_Sub1_Sub2_Sub2_3.aBoolean542;
		}
		if ((local8 != this.anInt4657 || local11 != this.aBoolean401) && this.aClass3_Sub7_Sub1_3 != null) {
			Static581.aClass3_Sub7_Sub3_2.method2210(this.aClass3_Sub7_Sub1_3);
			this.aClass3_Sub7_Sub1_3 = null;
			this.aClass3_Sub47_2 = null;
			this.aClass3_Sub12_Sub1_2 = null;
		}
	}
}
