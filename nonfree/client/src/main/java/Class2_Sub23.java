import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!kk;")
	public Class36_Sub3_Sub1 aClass36_Sub3_Sub1_1;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!hg;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!hg;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!qh;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!th;")
	public Class36_Sub3_Sub2 aClass36_Sub3_Sub2_2;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public int anInt4651;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
	public int anInt4657;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
	public int anInt4659;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public int anInt4663;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public int anInt4654 = 0;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public void method3753() {
		@Pc(12) int local12 = this.anInt4657;
		if (this.aClass143_1 != null) {
			@Pc(98) Class143 local98 = this.aClass143_1.method3641();
			if (local98 == null) {
				this.anIntArray390 = null;
				this.anInt4660 = 0;
				this.anInt4661 = 0;
				this.anInt4656 = 0;
				this.anInt4657 = -1;
				this.anInt4658 = 0;
			} else {
				this.anInt4657 = local98.anInt4512;
				this.anIntArray390 = local98.anIntArray371;
				this.anInt4658 = local98.anInt4520 * 128;
				this.anInt4661 = local98.anInt4528;
				this.anInt4656 = local98.anInt4535;
				this.anInt4660 = local98.anInt4495;
			}
		} else if (this.aClass36_Sub3_Sub1_1 != null) {
			@Pc(50) int local50 = Static34.method1663(this.aClass36_Sub3_Sub1_1);
			if (local50 != local12) {
				this.anInt4657 = local50;
				@Pc(61) Class33 local61 = this.aClass36_Sub3_Sub1_1.aClass33_1;
				if (local61.anIntArray55 != null) {
					local61 = local61.method719();
				}
				if (local61 == null) {
					this.anInt4661 = this.anInt4658 = 0;
				} else {
					this.anInt4658 = local61.anInt863 * 128;
					this.anInt4661 = local61.anInt877;
				}
			}
		} else if (this.aClass36_Sub3_Sub2_2 != null) {
			this.anInt4657 = Static247.method3967(this.aClass36_Sub3_Sub2_2);
			this.anInt4658 = this.aClass36_Sub3_Sub2_2.anInt5149 * 128;
			this.anInt4661 = this.aClass36_Sub3_Sub2_2.anInt5178;
		}
		if (this.anInt4657 != local12 && this.aClass2_Sub5_Sub2_1 != null) {
			Static43.aClass2_Sub5_Sub1_1.method404(this.aClass2_Sub5_Sub2_1);
			this.aClass2_Sub5_Sub2_1 = null;
		}
	}
}
