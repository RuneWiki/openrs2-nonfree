import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int anInt5913;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public int anInt5918;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt5920;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!cb;")
	public Class15_Sub2_Sub1 aClass15_Sub2_Sub1_1;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public int anInt5923;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public int anInt5925;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	public int anInt5927;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Lclient!bh;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Lclient!bh;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_3;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "I")
	public int anInt5928;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public int anInt5929;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	public int anInt5930;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "Lclient!qn;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!th;")
	public Class15_Sub2_Sub2 aClass15_Sub2_Sub2_2;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt5924 = 0;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public void method4640() {
		@Pc(14) int local14 = this.anInt5913;
		if (this.aClass146_1 != null) {
			@Pc(22) Class146 local22 = this.aClass146_1.method3815();
			if (local22 == null) {
				this.anInt5917 = 0;
				this.anInt5922 = 0;
				this.anInt5913 = -1;
				this.anInt5928 = 0;
				this.anInt5929 = 0;
				this.anIntArray576 = null;
			} else {
				this.anIntArray576 = local22.anIntArray466;
				this.anInt5913 = local22.anInt4742;
				this.anInt5929 = local22.anInt4754;
				this.anInt5928 = local22.anInt4748;
				this.anInt5922 = local22.anInt4719 * 128;
				this.anInt5917 = local22.anInt4763;
			}
		} else if (this.aClass15_Sub2_Sub1_1 != null) {
			@Pc(80) int local80 = Static35.method822(this.aClass15_Sub2_Sub1_1);
			if (local14 != local80) {
				this.anInt5913 = local80;
				@Pc(90) Class188 local90 = this.aClass15_Sub2_Sub1_1.aClass188_1;
				if (local90.anIntArray572 != null) {
					local90 = local90.method4618();
				}
				if (local90 == null) {
					this.anInt5917 = this.anInt5922 = 0;
				} else {
					this.anInt5917 = local90.anInt5889;
					this.anInt5922 = local90.anInt5860 * 128;
				}
			}
		} else if (this.aClass15_Sub2_Sub2_2 != null) {
			this.anInt5913 = Static17.method309(this.aClass15_Sub2_Sub2_2);
			this.anInt5917 = this.aClass15_Sub2_Sub2_2.anInt5407;
			this.anInt5922 = this.aClass15_Sub2_Sub2_2.anInt5401 * 128;
		}
		if (local14 != this.anInt5913 && this.aClass2_Sub3_Sub2_3 != null) {
			Static173.aClass2_Sub3_Sub4_2.method4662(this.aClass2_Sub3_Sub2_3);
			this.aClass2_Sub3_Sub2_3 = null;
		}
	}
}
