import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!mca", name = "Q", descriptor = "I")
	public int anInt6178;

	@OriginalMember(owner = "client!mca", name = "D", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!mca", name = "N", descriptor = "I")
	public int anInt6180;

	@OriginalMember(owner = "client!mca", name = "L", descriptor = "Lclient!hba;")
	public Class6_Sub17_Sub2 aClass6_Sub17_Sub2_2;

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
	public int anInt6184;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "Lclient!ih;")
	public Class60_Sub1_Sub1_Sub3_Sub2 aClass60_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!mca", name = "O", descriptor = "I")
	public int anInt6185;

	@OriginalMember(owner = "client!mca", name = "G", descriptor = "Lclient!hba;")
	public Class6_Sub17_Sub2 aClass6_Sub17_Sub2_3;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
	public int anInt6187;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!mca", name = "M", descriptor = "Lclient!vfa;")
	public Class6_Sub54_Sub1 aClass6_Sub54_Sub1_2;

	@OriginalMember(owner = "client!mca", name = "I", descriptor = "I")
	public int anInt6189;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
	public int anInt6190;

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
	public int anInt6191;

	@OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
	public int anInt6192;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	public int anInt6193;

	@OriginalMember(owner = "client!mca", name = "P", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Lclient!vfa;")
	public Class6_Sub54_Sub1 aClass6_Sub54_Sub1_3;

	@OriginalMember(owner = "client!mca", name = "z", descriptor = "Lclient!fw;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
	public int anInt6197;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "Lclient!eia;")
	public Class6_Sub16 aClass6_Sub16_2;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
	public int anInt6199;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "Lclient!em;")
	public Class60_Sub1_Sub1_Sub3_Sub1 aClass60_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!mca", name = "A", descriptor = "Lclient!eia;")
	public Class6_Sub16 aClass6_Sub16_3;

	@OriginalMember(owner = "client!mca", name = "H", descriptor = "I")
	public int anInt6181 = 0;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public void method5556() {
		@Pc(15) int local15 = this.anInt6179;
		@Pc(18) boolean local18 = this.aBoolean456;
		if (this.aClass125_1 != null) {
			@Pc(155) Class125 local155 = this.aClass125_1.method3383(Static303.aClass55_2);
			if (local155 == null) {
				this.anInt6199 = 256;
				this.anInt6191 = 0;
				this.anInt6185 = 0;
				this.aBoolean456 = false;
				this.anInt6187 = 256;
				this.anInt6179 = -1;
				this.anInt6197 = 0;
				this.anIntArray364 = null;
				this.aBoolean458 = false;
				this.anInt6184 = 0;
				this.anInt6180 = 0;
			} else {
				this.aBoolean456 = local155.aBoolean287;
				this.anInt6187 = local155.anInt3626;
				this.anIntArray364 = local155.anIntArray195;
				this.anInt6184 = local155.anInt3602 << 9;
				this.anInt6197 = local155.anInt3584;
				this.anInt6191 = local155.anInt3617;
				this.anInt6199 = local155.anInt3604;
				this.aBoolean458 = local155.aBoolean284;
				this.anInt6179 = local155.anInt3606;
				this.anInt6185 = local155.anInt3575;
			}
		} else if (this.aClass60_Sub1_Sub1_Sub3_Sub2_2 != null) {
			@Pc(31) int local31 = Static46.method559(this.aClass60_Sub1_Sub1_Sub3_Sub2_2);
			if (local15 != local31) {
				this.anInt6179 = local31;
				@Pc(41) Class294 local41 = this.aClass60_Sub1_Sub1_Sub3_Sub2_2.aClass294_1;
				if (local41.anIntArray511 != null) {
					local41 = local41.method7168(Static303.aClass55_2);
				}
				if (local41 == null) {
					this.anInt6187 = 256;
					this.anInt6185 = this.anInt6184 = this.anInt6180 = 0;
					this.aBoolean456 = this.aClass60_Sub1_Sub1_Sub3_Sub2_2.aClass294_1.aBoolean618;
					this.anInt6199 = 256;
				} else {
					this.anInt6184 = local41.anInt8148 << 9;
					this.anInt6180 = local41.anInt8161 << 9;
					this.anInt6199 = local41.anInt8156;
					this.aBoolean456 = local41.aBoolean618;
					this.anInt6187 = local41.anInt8141;
					this.anInt6185 = local41.anInt8165;
				}
			}
		} else if (this.aClass60_Sub1_Sub1_Sub3_Sub1_2 != null) {
			this.anInt6179 = Static334.method5179(this.aClass60_Sub1_Sub1_Sub3_Sub1_2);
			this.aBoolean456 = this.aClass60_Sub1_Sub1_Sub3_Sub1_2.aBoolean231;
			this.anInt6187 = 256;
			this.anInt6185 = this.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt2844;
			this.anInt6184 = this.aClass60_Sub1_Sub1_Sub3_Sub1_2.anInt2862 << 9;
			this.anInt6180 = 0;
			this.anInt6199 = 256;
		}
		if (this.anInt6179 == local15 && this.aBoolean456 == local18) {
			return;
		}
		if (this.aClass6_Sub17_Sub2_2 == null) {
			return;
		}
		Static544.aClass6_Sub17_Sub3_2.method4663(this.aClass6_Sub17_Sub2_2);
		this.aClass6_Sub16_3 = null;
		this.aClass6_Sub17_Sub2_2 = null;
		this.aClass6_Sub54_Sub1_3 = null;
	}
}
