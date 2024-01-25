import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class6_Sub49 extends Class6 {

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!cba;")
	public Class6_Sub7 aClass6_Sub7_2;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public int anInt9622;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public int anInt9624;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public int anInt9625;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public int anInt9626;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
	public boolean aBoolean662;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
	public int anInt9627;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	public int anInt9629;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "Lclient!ut;")
	public Class6_Sub37_Sub1 aClass6_Sub37_Sub1_3;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	public int anInt9630;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "Lclient!cba;")
	public Class6_Sub7 aClass6_Sub7_3;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "Lclient!kd;")
	public Class20_Sub2_Sub2_Sub1_Sub2 aClass20_Sub2_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	public int anInt9631;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	public int anInt9632;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
	public int anInt9633;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	public int anInt9634;

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
	public int anInt9635;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	public int anInt9636;

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "Lclient!su;")
	public Class312 aClass312_1;

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "Lclient!ia;")
	public Class6_Sub3_Sub3 aClass6_Sub3_Sub3_3;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "Z")
	public boolean aBoolean664;

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
	public int anInt9638;

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "Lclient!ia;")
	public Class6_Sub3_Sub3 aClass6_Sub3_Sub3_4;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "Lclient!bs;")
	public Class20_Sub2_Sub2_Sub1_Sub1 aClass20_Sub2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "Lclient!ut;")
	public Class6_Sub37_Sub1 aClass6_Sub37_Sub1_4;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public int anInt9620 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method8168() {
		@Pc(16) int local16 = this.anInt9629;
		@Pc(19) boolean local19 = this.aBoolean662;
		if (this.aClass312_1 != null) {
			@Pc(28) Class312 local28 = this.aClass312_1.method7866(Static279.aClass294_1);
			if (local28 == null) {
				this.anInt9630 = 0;
				this.anInt9629 = -1;
				this.anInt9636 = 0;
				this.anInt9622 = 0;
				this.aBoolean664 = false;
				this.aBoolean662 = false;
				this.anInt9624 = 256;
				this.anInt9633 = 256;
				this.anInt9632 = 0;
				this.anInt9635 = 0;
				this.anIntArray582 = null;
			} else {
				this.anInt9629 = local28.anInt9242;
				this.anInt9635 = local28.anInt9238;
				this.anInt9622 = local28.anInt9217 << 9;
				this.anInt9636 = local28.anInt9239;
				this.aBoolean662 = local28.aBoolean618;
				this.anInt9624 = local28.anInt9192;
				this.anInt9630 = local28.anInt9248;
				this.aBoolean664 = local28.aBoolean623;
				this.anInt9633 = local28.anInt9223;
				this.anIntArray582 = local28.anIntArray564;
			}
		} else if (this.aClass20_Sub2_Sub2_Sub1_Sub2_2 != null) {
			@Pc(154) int local154 = Static525.method7809(this.aClass20_Sub2_Sub2_Sub1_Sub2_2);
			if (local16 != local154) {
				this.anInt9629 = local154;
				@Pc(168) Class247 local168 = this.aClass20_Sub2_Sub2_Sub1_Sub2_2.aClass247_1;
				if (local168.anIntArray467 != null) {
					local168 = local168.method6613(Static279.aClass294_1);
				}
				if (local168 == null) {
					this.anInt9633 = 256;
					this.anInt9624 = 256;
					this.aBoolean662 = this.aClass20_Sub2_Sub2_Sub1_Sub2_2.aClass247_1.aBoolean513;
					this.anInt9635 = this.anInt9622 = this.anInt9632 = 0;
				} else {
					this.anInt9624 = local168.anInt7677;
					this.anInt9635 = local168.anInt7686;
					this.anInt9633 = local168.anInt7706;
					this.anInt9632 = local168.anInt7698 << 9;
					this.anInt9622 = local168.anInt7702 << 9;
					this.aBoolean662 = local168.aBoolean513;
				}
			}
		} else if (this.aClass20_Sub2_Sub2_Sub1_Sub1_2 != null) {
			this.anInt9629 = Static281.method4932(this.aClass20_Sub2_Sub2_Sub1_Sub1_2);
			this.aBoolean662 = this.aClass20_Sub2_Sub2_Sub1_Sub1_2.aBoolean73;
			this.anInt9622 = this.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt1213 << 9;
			this.anInt9632 = 0;
			this.anInt9624 = 256;
			this.anInt9635 = this.aClass20_Sub2_Sub2_Sub1_Sub1_2.anInt1197;
			this.anInt9633 = 256;
		}
		if (this.anInt9629 == local16 && local19 == this.aBoolean662) {
			return;
		}
		if (this.aClass6_Sub3_Sub3_4 == null) {
			return;
		}
		Static196.aClass6_Sub3_Sub1_1.method270(this.aClass6_Sub3_Sub3_4);
		this.aClass6_Sub37_Sub1_3 = null;
		this.aClass6_Sub7_2 = null;
		this.aClass6_Sub3_Sub3_4 = null;
	}
}
