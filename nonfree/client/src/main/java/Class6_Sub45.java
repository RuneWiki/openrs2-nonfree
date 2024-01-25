import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class6_Sub45 extends Class6 {

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
	public int anInt8268;

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "Lclient!gv;")
	public Class9_Sub4_Sub2_Sub1_Sub2 aClass9_Sub4_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Z")
	public boolean aBoolean660;

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "Lclient!cea;")
	public Class9_Sub4_Sub2_Sub1_Sub1 aClass9_Sub4_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
	public int anInt8269;

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "Lclient!ib;")
	public Class6_Sub27_Sub1 aClass6_Sub27_Sub1_2;

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "Lclient!fw;")
	public Class6_Sub20 aClass6_Sub20_1;

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "Lclient!ib;")
	public Class6_Sub27_Sub1 aClass6_Sub27_Sub1_3;

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "Z")
	public boolean aBoolean661;

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
	public int anInt8270;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "I")
	public int anInt8272;

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
	public int anInt8273;

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "I")
	public int anInt8275;

	@OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
	public int anInt8277;

	@OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
	public int anInt8278;

	@OriginalMember(owner = "client!qfa", name = "I", descriptor = "I")
	public int anInt8280;

	@OriginalMember(owner = "client!qfa", name = "J", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
	public int anInt8282;

	@OriginalMember(owner = "client!qfa", name = "M", descriptor = "I")
	public int anInt8283;

	@OriginalMember(owner = "client!qfa", name = "N", descriptor = "Lclient!wi;")
	public Class6_Sub4_Sub5 aClass6_Sub4_Sub5_2;

	@OriginalMember(owner = "client!qfa", name = "O", descriptor = "Lclient!fw;")
	public Class6_Sub20 aClass6_Sub20_2;

	@OriginalMember(owner = "client!qfa", name = "P", descriptor = "Lclient!wi;")
	public Class6_Sub4_Sub5 aClass6_Sub4_Sub5_3;

	@OriginalMember(owner = "client!qfa", name = "Q", descriptor = "Lclient!vha;")
	public Class356 aClass356_1;

	@OriginalMember(owner = "client!qfa", name = "T", descriptor = "I")
	public int anInt8284;

	@OriginalMember(owner = "client!qfa", name = "U", descriptor = "I")
	public int anInt8285;

	@OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
	public int anInt8281 = 0;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)V")
	public void method6945() {
		@Pc(14) int local14 = this.anInt8269;
		@Pc(17) boolean local17 = this.aBoolean661;
		if (this.aClass356_1 != null) {
			@Pc(26) Class356 local26 = this.aClass356_1.method8322(Static140.aClass157_1);
			if (local26 == null) {
				this.aBoolean661 = false;
				this.anInt8285 = 256;
				this.anInt8282 = 0;
				this.anIntArray428 = null;
				this.anInt8277 = 256;
				this.anInt8272 = 0;
				this.anInt8268 = 0;
				this.anInt8273 = 0;
				this.aBoolean663 = false;
				this.anInt8284 = 0;
				this.anInt8269 = -1;
			} else {
				this.anInt8277 = local26.anInt10258;
				this.anInt8273 = local26.anInt10220;
				this.aBoolean663 = local26.aBoolean795;
				this.anInt8268 = local26.anInt10233;
				this.anInt8284 = local26.anInt10246;
				this.anInt8269 = local26.anInt10251;
				this.aBoolean661 = local26.aBoolean802;
				this.anIntArray428 = local26.anIntArray544;
				this.anInt8285 = local26.anInt10221;
				this.anInt8282 = local26.anInt10240 << 9;
			}
		} else if (this.aClass9_Sub4_Sub2_Sub1_Sub1_2 != null) {
			@Pc(152) int local152 = Static490.method4316(this.aClass9_Sub4_Sub2_Sub1_Sub1_2);
			if (local14 != local152) {
				this.anInt8269 = local152;
				@Pc(162) Class158 local162 = this.aClass9_Sub4_Sub2_Sub1_Sub1_2.aClass158_1;
				if (local162.anIntArray260 != null) {
					local162 = local162.method4867(Static140.aClass157_1);
				}
				if (local162 == null) {
					this.anInt8284 = this.anInt8282 = this.anInt8272 = 0;
					this.aBoolean661 = this.aClass9_Sub4_Sub2_Sub1_Sub1_2.aClass158_1.aBoolean451;
					this.anInt8285 = 256;
					this.anInt8277 = 256;
				} else {
					this.anInt8284 = local162.anInt5854;
					this.anInt8277 = local162.anInt5820;
					this.anInt8285 = local162.anInt5812;
					this.aBoolean661 = local162.aBoolean451;
					this.anInt8272 = local162.anInt5838 << 9;
					this.anInt8282 = local162.anInt5841 << 9;
				}
			}
		} else if (this.aClass9_Sub4_Sub2_Sub1_Sub2_2 != null) {
			this.anInt8269 = Static501.method7250(this.aClass9_Sub4_Sub2_Sub1_Sub2_2);
			this.anInt8277 = 256;
			this.anInt8272 = 0;
			this.anInt8282 = this.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4374 << 9;
			this.aBoolean661 = this.aClass9_Sub4_Sub2_Sub1_Sub2_2.aBoolean355;
			this.anInt8284 = this.aClass9_Sub4_Sub2_Sub1_Sub2_2.anInt4363;
			this.anInt8285 = 256;
		}
		if (local14 == this.anInt8269 && this.aBoolean661 == local17) {
			return;
		}
		if (this.aClass6_Sub4_Sub5_3 == null) {
			return;
		}
		Static152.aClass6_Sub4_Sub3_2.method5197(this.aClass6_Sub4_Sub5_3);
		this.aClass6_Sub20_1 = null;
		this.aClass6_Sub4_Sub5_3 = null;
		this.aClass6_Sub27_Sub1_3 = null;
	}
}
