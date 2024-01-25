import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public int anInt5637;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "I")
	public int anInt5638;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!ei;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!sk;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	public int anInt5643;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!ke;")
	public Class5_Sub3_Sub3_Sub1 aClass5_Sub3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	public int anInt5644;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "[I")
	public int[] anIntArray713;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "Lclient!ql;")
	public Class5_Sub3_Sub3_Sub2 aClass5_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	public int anInt5648;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "I")
	public int anInt5649;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "Z")
	public boolean aBoolean494;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "I")
	public int anInt5650;

	@OriginalMember(owner = "client!t", name = "M", descriptor = "I")
	public int anInt5652;

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Lclient!ei;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!t", name = "O", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
	public int anInt5655;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public int anInt5635 = 0;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public void method4956() {
		@Pc(14) int local14 = this.anInt5650;
		if (this.aClass188_1 != null) {
			@Pc(100) Class188 local100 = this.aClass188_1.method4915();
			if (local100 == null) {
				this.anInt5650 = -1;
				this.anInt5638 = 0;
				this.anIntArray713 = null;
				this.anInt5643 = 0;
				this.anInt5653 = 0;
				this.anInt5644 = 0;
			} else {
				this.anInt5644 = local100.anInt5536 * 128;
				this.anInt5650 = local100.anInt5551;
				this.anInt5643 = local100.anInt5534;
				this.anIntArray713 = local100.anIntArray693;
				this.anInt5653 = local100.anInt5526;
				this.anInt5638 = local100.anInt5525;
			}
		} else if (this.aClass5_Sub3_Sub3_Sub2_1 != null) {
			@Pc(25) int local25 = Static73.method1436(this.aClass5_Sub3_Sub3_Sub2_1);
			if (local25 != local14) {
				this.anInt5650 = local25;
				@Pc(39) Class122 local39 = this.aClass5_Sub3_Sub3_Sub2_1.aClass122_1;
				if (local39.anIntArray451 != null) {
					local39 = local39.method3573();
				}
				if (local39 == null) {
					this.anInt5638 = this.anInt5644 = 0;
				} else {
					this.anInt5638 = local39.anInt3828;
					this.anInt5644 = local39.anInt3807 * 128;
				}
			}
		} else if (this.aClass5_Sub3_Sub3_Sub1_2 != null) {
			this.anInt5650 = Static223.method4084(this.aClass5_Sub3_Sub3_Sub1_2);
			this.anInt5644 = this.aClass5_Sub3_Sub3_Sub1_2.anInt3299 * 128;
			this.anInt5638 = this.aClass5_Sub3_Sub3_Sub1_2.anInt3332;
		}
		if (local14 != this.anInt5650 && this.aClass1_Sub6_Sub3_1 != null) {
			Static170.aClass1_Sub6_Sub4_2.method1665(this.aClass1_Sub6_Sub3_1);
			this.aClass1_Sub6_Sub3_1 = null;
		}
	}
}
