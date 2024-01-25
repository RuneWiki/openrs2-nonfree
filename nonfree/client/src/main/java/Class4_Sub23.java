import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
	public int anInt4130;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "Z")
	public boolean aBoolean304;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
	public int anInt4133;

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
	public int anInt4134;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "Lclient!eaa;")
	public Class4_Sub16 aClass4_Sub16_2;

	@OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
	public int anInt4135;

	@OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
	public int anInt4136;

	@OriginalMember(owner = "client!iia", name = "t", descriptor = "Lclient!oi;")
	public Class4_Sub3_Sub3 aClass4_Sub3_Sub3_2;

	@OriginalMember(owner = "client!iia", name = "u", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!iia", name = "v", descriptor = "Lclient!aia;")
	public Class4_Sub4_Sub1 aClass4_Sub4_Sub1_2;

	@OriginalMember(owner = "client!iia", name = "w", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
	public int anInt4137;

	@OriginalMember(owner = "client!iia", name = "A", descriptor = "I")
	public int anInt4140;

	@OriginalMember(owner = "client!iia", name = "B", descriptor = "Lclient!tba;")
	public Class342 aClass342_1;

	@OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
	public int anInt4141;

	@OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
	public int anInt4142;

	@OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
	public int anInt4143;

	@OriginalMember(owner = "client!iia", name = "F", descriptor = "Lclient!oi;")
	public Class4_Sub3_Sub3 aClass4_Sub3_Sub3_3;

	@OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
	public int anInt4145;

	@OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
	public int anInt4147;

	@OriginalMember(owner = "client!iia", name = "L", descriptor = "Lclient!aia;")
	public Class4_Sub4_Sub1 aClass4_Sub4_Sub1_3;

	@OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
	public int anInt4148;

	@OriginalMember(owner = "client!iia", name = "N", descriptor = "Lclient!eaa;")
	public Class4_Sub16 aClass4_Sub16_3;

	@OriginalMember(owner = "client!iia", name = "P", descriptor = "Lclient!vk;")
	public Class3_Sub1_Sub2_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!iia", name = "S", descriptor = "Lclient!iaa;")
	public Class3_Sub1_Sub2_Sub2_Sub1 aClass3_Sub1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
	public int anInt4146 = 0;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method3688() {
		@Pc(8) int local8 = this.anInt4145;
		@Pc(11) boolean local11 = this.aBoolean306;
		if (this.aClass342_1 != null) {
			@Pc(138) Class342 local138 = this.aClass342_1.method7495(Static526.aClass293_1);
			if (local138 == null) {
				this.anInt4150 = 0;
				this.anInt4130 = 256;
				this.anInt4133 = 256;
				this.anInt4148 = 0;
				this.aBoolean307 = false;
				this.anInt4137 = 0;
				this.anIntArray302 = null;
				this.aBoolean306 = false;
				this.anInt4136 = 0;
				this.anInt4141 = 0;
				this.anInt4145 = -1;
			} else {
				this.anIntArray302 = local138.anIntArray622;
				this.aBoolean307 = local138.aBoolean688;
				this.anInt4141 = local138.anInt8746;
				this.anInt4133 = local138.anInt8710;
				this.aBoolean306 = local138.aBoolean687;
				this.anInt4137 = local138.anInt8711 << 9;
				this.anInt4148 = local138.anInt8700;
				this.anInt4136 = local138.anInt8696;
				this.anInt4145 = local138.anInt8729;
				this.anInt4130 = local138.anInt8692;
			}
		} else if (this.aClass3_Sub1_Sub2_Sub2_Sub2_1 != null) {
			@Pc(22) int local22 = Static617.method8307(this.aClass3_Sub1_Sub2_Sub2_Sub2_1);
			if (local22 != local8) {
				this.anInt4145 = local22;
				@Pc(32) Class345 local32 = this.aClass3_Sub1_Sub2_Sub2_Sub2_1.aClass345_1;
				if (local32.anIntArray624 != null) {
					local32 = local32.method7529(Static526.aClass293_1);
				}
				if (local32 == null) {
					this.anInt4133 = 256;
					this.aBoolean306 = this.aClass3_Sub1_Sub2_Sub2_Sub2_1.aClass345_1.aBoolean698;
					this.anInt4130 = 256;
					this.anInt4148 = this.anInt4137 = this.anInt4150 = 0;
				} else {
					this.anInt4130 = local32.anInt8786;
					this.anInt4137 = local32.anInt8781 << 9;
					this.aBoolean306 = local32.aBoolean698;
					this.anInt4150 = local32.anInt8808 << 9;
					this.anInt4148 = local32.anInt8779;
					this.anInt4133 = local32.anInt8773;
				}
			}
		} else if (this.aClass3_Sub1_Sub2_Sub2_Sub1_1 != null) {
			this.anInt4145 = Static225.method3273(this.aClass3_Sub1_Sub2_Sub2_Sub1_1);
			this.aBoolean306 = this.aClass3_Sub1_Sub2_Sub2_Sub1_1.aBoolean294;
			this.anInt4137 = this.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt3936 << 9;
			this.anInt4148 = this.aClass3_Sub1_Sub2_Sub2_Sub1_1.anInt3942;
			this.anInt4133 = 256;
			this.anInt4130 = 256;
			this.anInt4150 = 0;
		}
		if ((this.anInt4145 != local8 || local11 != this.aBoolean306) && this.aClass4_Sub3_Sub3_2 != null) {
			Static162.aClass4_Sub3_Sub5_3.method7723(this.aClass4_Sub3_Sub3_2);
			this.aClass4_Sub3_Sub3_2 = null;
			this.aClass4_Sub16_3 = null;
			this.aClass4_Sub4_Sub1_3 = null;
		}
	}
}
