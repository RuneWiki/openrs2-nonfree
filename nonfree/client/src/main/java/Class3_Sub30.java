import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	public int anInt5179;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public int anInt5180;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!qr;")
	public Class3_Sub17_Sub1 aClass3_Sub17_Sub1_2;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	public int anInt5181;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	public int anInt5182;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!lr;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!pba;")
	public Class25_Sub2_Sub2_Sub5_Sub1 aClass25_Sub2_Sub2_Sub5_Sub1_2;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!qr;")
	public Class3_Sub17_Sub1 aClass3_Sub17_Sub1_3;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	public int anInt5183;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!qga;")
	public Class3_Sub16_Sub2 aClass3_Sub16_Sub2_2;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!kg;")
	public Class3_Sub32 aClass3_Sub32_1;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	public int anInt5184;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	public int anInt5186;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "Lclient!qga;")
	public Class3_Sub16_Sub2 aClass3_Sub16_Sub2_3;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "Lclient!sp;")
	public Class25_Sub2_Sub2_Sub5_Sub2 aClass25_Sub2_Sub2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	public int anInt5187;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "Lclient!kg;")
	public Class3_Sub32 aClass3_Sub32_2;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public int anInt5188;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	public int anInt5189;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	public int anInt5190;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	public int anInt5191;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Z")
	public boolean aBoolean346;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "Z")
	public boolean aBoolean347;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	public int anInt5192;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
	public int anInt5193 = 0;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public void method4156() {
		@Pc(8) int local8 = this.anInt5188;
		@Pc(11) boolean local11 = this.aBoolean347;
		if (this.aClass194_1 != null) {
			@Pc(126) Class194 local126 = this.aClass194_1.method4696(Static206.aClass143_3);
			if (local126 == null) {
				this.anInt5188 = -1;
				this.anInt5179 = 0;
				this.aBoolean347 = false;
				this.anInt5191 = 0;
				this.anInt5186 = 256;
				this.anInt5183 = 256;
				this.anInt5187 = 0;
				this.anIntArray241 = null;
				this.aBoolean344 = false;
				this.anInt5192 = 0;
			} else {
				this.anIntArray241 = local126.anIntArray283;
				this.anInt5183 = local126.anInt5833;
				this.anInt5192 = local126.anInt5805 << 9;
				this.anInt5188 = local126.anInt5816;
				this.aBoolean344 = local126.aBoolean397;
				this.anInt5191 = local126.anInt5813;
				this.anInt5179 = local126.anInt5824;
				this.aBoolean347 = local126.aBoolean401;
				this.anInt5186 = local126.anInt5823;
				this.anInt5187 = local126.anInt5812;
			}
		} else if (this.aClass25_Sub2_Sub2_Sub5_Sub2_1 != null) {
			@Pc(22) int local22 = Static530.method7272(this.aClass25_Sub2_Sub2_Sub5_Sub2_1);
			if (local8 != local22) {
				this.anInt5188 = local22;
				@Pc(32) Class213 local32 = this.aClass25_Sub2_Sub2_Sub5_Sub2_1.aClass213_1;
				if (local32.anIntArray345 != null) {
					local32 = local32.method4998(Static206.aClass143_3);
				}
				if (local32 == null) {
					this.anInt5186 = 256;
					this.aBoolean347 = this.aClass25_Sub2_Sub2_Sub5_Sub2_1.aClass213_1.aBoolean442;
					this.anInt5187 = this.anInt5192 = 0;
					this.anInt5183 = 256;
				} else {
					this.anInt5183 = local32.anInt6206;
					this.anInt5186 = local32.anInt6214;
					this.aBoolean347 = local32.aBoolean442;
					this.anInt5192 = local32.anInt6188 << 9;
					this.anInt5187 = local32.anInt6189;
				}
			}
		} else if (this.aClass25_Sub2_Sub2_Sub5_Sub1_2 != null) {
			this.anInt5188 = Static392.method5562(this.aClass25_Sub2_Sub2_Sub5_Sub1_2);
			this.anInt5186 = 256;
			this.aBoolean347 = this.aClass25_Sub2_Sub2_Sub5_Sub1_2.aBoolean496;
			this.anInt5183 = 256;
			this.anInt5187 = this.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt7174;
			this.anInt5192 = this.aClass25_Sub2_Sub2_Sub5_Sub1_2.anInt7154 << 9;
		}
		if ((this.anInt5188 != local8 || this.aBoolean347 != local11) && this.aClass3_Sub16_Sub2_2 != null) {
			Static354.aClass3_Sub16_Sub4_2.method7757(this.aClass3_Sub16_Sub2_2);
			this.aClass3_Sub17_Sub1_3 = null;
			this.aClass3_Sub16_Sub2_2 = null;
			this.aClass3_Sub32_2 = null;
		}
	}
}
