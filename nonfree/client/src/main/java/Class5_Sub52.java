import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class5_Sub52 extends Class5 {

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Z")
	public boolean aBoolean835;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!hr;")
	public Class5_Sub16_Sub2 aClass5_Sub16_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!ct;")
	public Class5_Sub11_Sub1 aClass5_Sub11_Sub1_3;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Lclient!qfa;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Z")
	public boolean aBoolean836;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Lclient!fs;")
	public Class14_Sub1_Sub1_Sub3_Sub2 aClass14_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "Lclient!hr;")
	public Class5_Sub16_Sub2 aClass5_Sub16_Sub2_4;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	public int anInt10409;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	public int anInt10410;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!fha;")
	public Class14_Sub1_Sub1_Sub3_Sub1 aClass14_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
	public int anInt10411;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public int anInt10412;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	public int anInt10413;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	public int anInt10416;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
	public int anInt10417;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "[I")
	public int[] anIntArray838;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
	public int anInt10419;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
	public int anInt10420;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	public int anInt10421;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "Lclient!oo;")
	public Class5_Sub38 aClass5_Sub38_2;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
	public int anInt10423;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
	public int anInt10424;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
	public int anInt10425;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "Z")
	public boolean aBoolean837;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "Lclient!oo;")
	public Class5_Sub38 aClass5_Sub38_3;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "Lclient!ct;")
	public Class5_Sub11_Sub1 aClass5_Sub11_Sub1_4;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	public int anInt10414 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public void method8843() {
		@Pc(8) int local8 = this.anInt10410;
		@Pc(11) boolean local11 = this.aBoolean837;
		if (this.aClass283_1 != null) {
			@Pc(142) Class283 local142 = this.aClass283_1.method6858(Static564.aClass304_1);
			if (local142 == null) {
				this.aBoolean835 = false;
				this.anInt10425 = 0;
				this.anInt10423 = 256;
				this.anIntArray838 = null;
				this.anInt10422 = 0;
				this.anInt10411 = 0;
				this.aBoolean837 = false;
				this.anInt10412 = 0;
				this.anInt10417 = 0;
				this.anInt10419 = 256;
				this.anInt10410 = -1;
			} else {
				this.anInt10425 = local142.anInt7837;
				this.anInt10410 = local142.anInt7834;
				this.anIntArray838 = local142.anIntArray622;
				this.anInt10411 = local142.anInt7798 << 9;
				this.anInt10419 = local142.anInt7812;
				this.aBoolean837 = local142.aBoolean648;
				this.anInt10417 = local142.anInt7791;
				this.aBoolean835 = local142.aBoolean653;
				this.anInt10423 = local142.anInt7825;
				this.anInt10422 = local142.anInt7827;
			}
		} else if (this.aClass14_Sub1_Sub1_Sub3_Sub2_2 != null) {
			@Pc(59) int local59 = Static138.method2075(this.aClass14_Sub1_Sub1_Sub3_Sub2_2);
			if (local8 != local59) {
				this.anInt10410 = local59;
				@Pc(73) Class271 local73 = this.aClass14_Sub1_Sub1_Sub3_Sub2_2.aClass271_1;
				if (local73.anIntArray591 != null) {
					local73 = local73.method6476(Static564.aClass304_1);
				}
				if (local73 == null) {
					this.anInt10419 = 256;
					this.anInt10425 = this.anInt10411 = this.anInt10412 = 0;
					this.anInt10423 = 256;
					this.aBoolean837 = this.aClass14_Sub1_Sub1_Sub3_Sub2_2.aClass271_1.aBoolean612;
				} else {
					this.anInt10419 = local73.anInt7337;
					this.aBoolean837 = local73.aBoolean612;
					this.anInt10412 = local73.anInt7323 << 9;
					this.anInt10423 = local73.anInt7329;
					this.anInt10411 = local73.anInt7334 << 9;
					this.anInt10425 = local73.anInt7313;
				}
			}
		} else if (this.aClass14_Sub1_Sub1_Sub3_Sub1_2 != null) {
			this.anInt10410 = Static94.method8744(this.aClass14_Sub1_Sub1_Sub3_Sub1_2);
			this.anInt10419 = 256;
			this.anInt10425 = this.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2737;
			this.anInt10411 = this.aClass14_Sub1_Sub1_Sub3_Sub1_2.anInt2727 << 9;
			this.aBoolean837 = this.aClass14_Sub1_Sub1_Sub3_Sub1_2.aBoolean239;
			this.anInt10412 = 0;
			this.anInt10423 = 256;
		}
		if (local8 == this.anInt10410 && local11 == this.aBoolean837) {
			return;
		}
		if (this.aClass5_Sub16_Sub2_4 == null) {
			return;
		}
		Static287.aClass5_Sub16_Sub3_1.method6144(this.aClass5_Sub16_Sub2_4);
		this.aClass5_Sub16_Sub2_4 = null;
		this.aClass5_Sub11_Sub1_4 = null;
		this.aClass5_Sub38_3 = null;
	}
}
