import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class5_Sub52 extends Class5 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!ih;")
	public Class164 aClass164_1;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	public int anInt9151;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	public int anInt9153;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!nga;")
	public Class5_Sub42_Sub1 aClass5_Sub42_Sub1_2;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public int anInt9154;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!nga;")
	public Class5_Sub42_Sub1 aClass5_Sub42_Sub1_3;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	public int anInt9155;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Z")
	public boolean aBoolean782;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	public int anInt9157;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "I")
	public int anInt9158;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!ft;")
	public Class28_Sub1_Sub4_Sub2_Sub1 aClass28_Sub1_Sub4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt9160;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Lclient!lea;")
	public Class5_Sub38 aClass5_Sub38_1;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!iha;")
	public Class5_Sub17_Sub2 aClass5_Sub17_Sub2_2;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	public int anInt9161;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public int anInt9162;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "Lclient!iha;")
	public Class5_Sub17_Sub2 aClass5_Sub17_Sub2_3;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	public int anInt9163;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	public int anInt9164;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Z")
	public boolean aBoolean783;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "I")
	public int anInt9165;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "Lclient!jha;")
	public Class28_Sub1_Sub4_Sub2_Sub2 aClass28_Sub1_Sub4_Sub2_Sub2_2;

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Z")
	public boolean aBoolean784;

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!lea;")
	public Class5_Sub38 aClass5_Sub38_2;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
	public int anInt9166;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	public int anInt9167;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	public int anInt9156 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public void method7757() {
		@Pc(6) int local6 = this.anInt9166;
		@Pc(9) boolean local9 = this.aBoolean782;
		if (this.aClass164_1 != null) {
			@Pc(133) Class164 local133 = this.aClass164_1.method3908(Static161.aClass237_3);
			if (local133 == null) {
				this.anInt9153 = 0;
				this.anInt9155 = 0;
				this.anInt9166 = -1;
				this.anInt9151 = 0;
				this.anInt9163 = 0;
				this.anInt9165 = 256;
				this.anInt9162 = 256;
				this.anIntArray512 = null;
				this.anInt9161 = 0;
				this.aBoolean783 = false;
				this.aBoolean782 = false;
			} else {
				this.anIntArray512 = local133.anIntArray243;
				this.anInt9166 = local133.anInt4641;
				this.anInt9163 = local133.anInt4649 << 9;
				this.aBoolean782 = local133.aBoolean385;
				this.anInt9165 = local133.anInt4658;
				this.aBoolean783 = local133.aBoolean388;
				this.anInt9151 = local133.anInt4646;
				this.anInt9162 = local133.anInt4638;
				this.anInt9155 = local133.anInt4644;
				this.anInt9153 = local133.anInt4650;
			}
		} else if (this.aClass28_Sub1_Sub4_Sub2_Sub1_2 != null) {
			@Pc(20) int local20 = Static258.method4028(this.aClass28_Sub1_Sub4_Sub2_Sub1_2);
			if (local20 != local6) {
				this.anInt9166 = local20;
				@Pc(30) Class134 local30 = this.aClass28_Sub1_Sub4_Sub2_Sub1_2.aClass134_1;
				if (local30.anIntArray191 != null) {
					local30 = local30.method3276(Static161.aClass237_3);
				}
				if (local30 == null) {
					this.anInt9162 = 256;
					this.anInt9165 = 256;
					this.anInt9155 = this.anInt9163 = this.anInt9161 = 0;
					this.aBoolean782 = this.aClass28_Sub1_Sub4_Sub2_Sub1_2.aClass134_1.aBoolean299;
				} else {
					this.anInt9161 = local30.anInt3830 << 9;
					this.aBoolean782 = local30.aBoolean299;
					this.anInt9165 = local30.anInt3837;
					this.anInt9162 = local30.anInt3842;
					this.anInt9163 = local30.anInt3813 << 9;
					this.anInt9155 = local30.anInt3814;
				}
			}
		} else if (this.aClass28_Sub1_Sub4_Sub2_Sub2_2 != null) {
			this.anInt9166 = Static258.method4024(this.aClass28_Sub1_Sub4_Sub2_Sub2_2);
			this.anInt9162 = 256;
			this.aBoolean782 = this.aClass28_Sub1_Sub4_Sub2_Sub2_2.aBoolean477;
			this.anInt9165 = 256;
			this.anInt9161 = 0;
			this.anInt9163 = this.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5536 << 9;
			this.anInt9155 = this.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5542;
		}
		if (local6 == this.anInt9166 && local9 == this.aBoolean782) {
			return;
		}
		if (this.aClass5_Sub17_Sub2_2 == null) {
			return;
		}
		Static245.aClass5_Sub17_Sub4_2.method6184(this.aClass5_Sub17_Sub2_2);
		this.aClass5_Sub42_Sub1_3 = null;
		this.aClass5_Sub38_1 = null;
		this.aClass5_Sub17_Sub2_2 = null;
	}
}
