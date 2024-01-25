import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
	public int anInt4675;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public int anInt4677;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!via;")
	public Class2_Sub8_Sub5 aClass2_Sub8_Sub5_2;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!via;")
	public Class2_Sub8_Sub5 aClass2_Sub8_Sub5_3;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
	public int anInt4682;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!ke;")
	public Class3_Sub1_Sub3_Sub3_Sub2 aClass3_Sub1_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
	public int anInt4684;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "Lclient!hp;")
	public Class2_Sub22 aClass2_Sub22_2;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "Lclient!ob;")
	public Class2_Sub29_Sub1 aClass2_Sub29_Sub1_2;

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "Lclient!hp;")
	public Class2_Sub22 aClass2_Sub22_3;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "Lclient!ff;")
	public Class3_Sub1_Sub3_Sub3_Sub1 aClass3_Sub1_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "Lclient!ob;")
	public Class2_Sub29_Sub1 aClass2_Sub29_Sub1_3;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	public int anInt4690;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
	public int anInt4691;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "Lclient!iv;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	public int anInt4693;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	public int anInt4680 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method4085() {
		@Pc(8) int local8 = this.anInt4686;
		@Pc(15) boolean local15 = this.aBoolean343;
		if (this.aClass161_1 != null) {
			@Pc(130) Class161 local130 = this.aClass161_1.method4606(Static286.aClass263_3);
			if (local130 == null) {
				this.anInt4684 = 256;
				this.aBoolean343 = false;
				this.aBoolean345 = false;
				this.anIntArray235 = null;
				this.anInt4675 = 0;
				this.anInt4681 = 0;
				this.anInt4692 = 256;
				this.anInt4683 = 0;
				this.anInt4686 = -1;
				this.anInt4691 = 0;
			} else {
				this.anInt4684 = local130.anInt5385;
				this.anInt4686 = local130.anInt5370;
				this.anInt4692 = local130.anInt5366;
				this.anInt4691 = local130.anInt5371 << 9;
				this.aBoolean343 = local130.aBoolean397;
				this.anInt4683 = local130.anInt5412;
				this.anInt4681 = local130.anInt5394;
				this.anInt4675 = local130.anInt5395;
				this.aBoolean345 = local130.aBoolean401;
				this.anIntArray235 = local130.anIntArray285;
			}
		} else if (this.aClass3_Sub1_Sub3_Sub3_Sub1_1 != null) {
			@Pc(60) int local60 = Static193.method3947(this.aClass3_Sub1_Sub3_Sub3_Sub1_1);
			if (local60 != local8) {
				this.anInt4686 = local60;
				@Pc(70) Class27 local70 = this.aClass3_Sub1_Sub3_Sub3_Sub1_1.aClass27_1;
				if (local70.anIntArray43 != null) {
					local70 = local70.method727(Static286.aClass263_3);
				}
				if (local70 == null) {
					this.anInt4681 = this.anInt4691 = 0;
					this.anInt4684 = 256;
					this.anInt4692 = 256;
					this.aBoolean343 = this.aClass3_Sub1_Sub3_Sub3_Sub1_1.aClass27_1.aBoolean53;
				} else {
					this.anInt4691 = local70.anInt662 << 9;
					this.anInt4684 = local70.anInt647;
					this.anInt4681 = local70.anInt642;
					this.aBoolean343 = local70.aBoolean53;
					this.anInt4692 = local70.anInt635;
				}
			}
		} else if (this.aClass3_Sub1_Sub3_Sub3_Sub2_1 != null) {
			this.anInt4686 = Static73.method2125(this.aClass3_Sub1_Sub3_Sub3_Sub2_1);
			this.anInt4691 = this.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6134 << 9;
			this.anInt4681 = this.aClass3_Sub1_Sub3_Sub3_Sub2_1.anInt6137;
			this.anInt4684 = 256;
			this.anInt4692 = 256;
			this.aBoolean343 = this.aClass3_Sub1_Sub3_Sub3_Sub2_1.aBoolean457;
		}
		if (this.anInt4686 == local8 && local15 == this.aBoolean343) {
			return;
		}
		if (this.aClass2_Sub8_Sub5_3 == null) {
			return;
		}
		Static614.aClass2_Sub8_Sub4_2.method7925(this.aClass2_Sub8_Sub5_3);
		this.aClass2_Sub29_Sub1_2 = null;
		this.aClass2_Sub8_Sub5_3 = null;
		this.aClass2_Sub22_3 = null;
	}
}
