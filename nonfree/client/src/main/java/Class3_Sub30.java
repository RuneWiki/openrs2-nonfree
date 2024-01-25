import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!jja", name = "k", descriptor = "Z")
	public boolean aBoolean316;

	@OriginalMember(owner = "client!jja", name = "l", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
	public int anInt4790;

	@OriginalMember(owner = "client!jja", name = "n", descriptor = "I")
	public int anInt4791;

	@OriginalMember(owner = "client!jja", name = "p", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!jja", name = "q", descriptor = "Lclient!wm;")
	public Class3_Sub54 aClass3_Sub54_2;

	@OriginalMember(owner = "client!jja", name = "r", descriptor = "I")
	public int anInt4794;

	@OriginalMember(owner = "client!jja", name = "s", descriptor = "Lclient!pv;")
	public Class3_Sub39_Sub1 aClass3_Sub39_Sub1_3;

	@OriginalMember(owner = "client!jja", name = "t", descriptor = "Lclient!vca;")
	public Class3_Sub12_Sub4 aClass3_Sub12_Sub4_3;

	@OriginalMember(owner = "client!jja", name = "u", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!jja", name = "w", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!jja", name = "x", descriptor = "Lclient!cm;")
	public Class34_Sub1_Sub1_Sub2_Sub1 aClass34_Sub1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jja", name = "y", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!jja", name = "z", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!jja", name = "A", descriptor = "Lclient!pv;")
	public Class3_Sub39_Sub1 aClass3_Sub39_Sub1_4;

	@OriginalMember(owner = "client!jja", name = "B", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!jja", name = "C", descriptor = "Lclient!vca;")
	public Class3_Sub12_Sub4 aClass3_Sub12_Sub4_4;

	@OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
	public int anInt4800;

	@OriginalMember(owner = "client!jja", name = "F", descriptor = "I")
	public int anInt4801;

	@OriginalMember(owner = "client!jja", name = "G", descriptor = "Lclient!wm;")
	public Class3_Sub54 aClass3_Sub54_3;

	@OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
	public int anInt4802;

	@OriginalMember(owner = "client!jja", name = "J", descriptor = "Lclient!lp;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!jja", name = "K", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!jja", name = "L", descriptor = "I")
	public int anInt4804;

	@OriginalMember(owner = "client!jja", name = "M", descriptor = "Lclient!ub;")
	public Class34_Sub1_Sub1_Sub2_Sub2 aClass34_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!jja", name = "N", descriptor = "I")
	public int anInt4805;

	@OriginalMember(owner = "client!jja", name = "P", descriptor = "I")
	public int anInt4806;

	@OriginalMember(owner = "client!jja", name = "I", descriptor = "I")
	public int anInt4803 = 0;

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(Z)V")
	public void method4116() {
		@Pc(14) int local14 = this.anInt4791;
		@Pc(17) boolean local17 = this.aBoolean317;
		if (this.aClass216_1 != null) {
			@Pc(26) Class216 local26 = this.aClass216_1.method5043(Static210.aClass262_1);
			if (local26 == null) {
				this.anIntArray276 = null;
				this.anInt4795 = 0;
				this.aBoolean316 = false;
				this.aBoolean317 = false;
				this.anInt4797 = 0;
				this.anInt4801 = 256;
				this.anInt4806 = 0;
				this.anInt4805 = 0;
				this.anInt4791 = -1;
				this.anInt4800 = 0;
				this.anInt4802 = 256;
			} else {
				this.anIntArray276 = local26.anIntArray323;
				this.anInt4791 = local26.anInt5989;
				this.aBoolean316 = local26.aBoolean414;
				this.anInt4802 = local26.anInt5977;
				this.anInt4797 = local26.anInt5963;
				this.aBoolean317 = local26.aBoolean413;
				this.anInt4795 = local26.anInt5967;
				this.anInt4801 = local26.anInt5983;
				this.anInt4805 = local26.anInt5958;
				this.anInt4806 = local26.anInt5997 << 9;
			}
		} else if (this.aClass34_Sub1_Sub1_Sub2_Sub2_1 != null) {
			@Pc(115) int local115 = Static44.method791(this.aClass34_Sub1_Sub1_Sub2_Sub2_1);
			if (local115 != local14) {
				this.anInt4791 = local115;
				@Pc(129) Class261 local129 = this.aClass34_Sub1_Sub1_Sub2_Sub2_1.aClass261_1;
				if (local129.anIntArray364 != null) {
					local129 = local129.method5772(Static210.aClass262_1);
				}
				if (local129 == null) {
					this.aBoolean317 = this.aClass34_Sub1_Sub1_Sub2_Sub2_1.aClass261_1.aBoolean482;
					this.anInt4802 = 256;
					this.anInt4801 = 256;
					this.anInt4795 = this.anInt4806 = this.anInt4800 = 0;
				} else {
					this.anInt4795 = local129.anInt6823;
					this.anInt4801 = local129.anInt6821;
					this.anInt4806 = local129.anInt6825 << 9;
					this.aBoolean317 = local129.aBoolean482;
					this.anInt4800 = local129.anInt6818 << 9;
					this.anInt4802 = local129.anInt6829;
				}
			}
		} else if (this.aClass34_Sub1_Sub1_Sub2_Sub1_2 != null) {
			this.anInt4791 = Static553.method7313(this.aClass34_Sub1_Sub1_Sub2_Sub1_2);
			this.anInt4802 = 256;
			this.anInt4795 = this.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt1802;
			this.anInt4806 = this.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt1787 << 9;
			this.anInt4801 = 256;
			this.anInt4800 = 0;
			this.aBoolean317 = this.aClass34_Sub1_Sub1_Sub2_Sub1_2.aBoolean141;
		}
		if (local14 == this.anInt4791 && this.aBoolean317 == local17) {
			return;
		}
		if (this.aClass3_Sub12_Sub4_4 == null) {
			return;
		}
		Static156.aClass3_Sub12_Sub1_1.method1766(this.aClass3_Sub12_Sub4_4);
		this.aClass3_Sub39_Sub1_4 = null;
		this.aClass3_Sub54_3 = null;
		this.aClass3_Sub12_Sub4_4 = null;
	}
}
