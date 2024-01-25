import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public int anInt6055;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public int anInt6056;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!wda;")
	public Class23_Sub2_Sub1_Sub2_Sub2 aClass23_Sub2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!rea;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!tea;")
	public Class3_Sub51 aClass3_Sub51_1;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public int anInt6057;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public int anInt6059;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt6060;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!ho;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_1;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!fl;")
	public Class23_Sub2_Sub1_Sub2_Sub1 aClass23_Sub2_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	public int anInt6064;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!ho;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_2;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ij;")
	public Class178 aClass178_1;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	public int anInt6066;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	public int anInt6067;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	public int anInt6068;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Lclient!tea;")
	public Class3_Sub51 aClass3_Sub51_2;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Lclient!rea;")
	public Class3_Sub12_Sub1 aClass3_Sub12_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	public int anInt6063 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method5085() {
		@Pc(8) int local8 = this.anInt6055;
		@Pc(11) boolean local11 = this.aBoolean470;
		if (this.aClass178_1 != null) {
			@Pc(20) Class178 local20 = this.aClass178_1.method4012(Static592.aClass47_2);
			if (local20 == null) {
				this.anInt6065 = 0;
				this.anInt6064 = 256;
				this.anInt6066 = 0;
				this.anIntArray388 = null;
				this.anInt6055 = -1;
				this.anInt6056 = 256;
				this.anInt6067 = 0;
				this.aBoolean470 = false;
				this.anInt6059 = 0;
				this.aBoolean471 = false;
				this.anInt6060 = 0;
			} else {
				this.aBoolean471 = local20.aBoolean383;
				this.anInt6060 = local20.anInt4753;
				this.anInt6065 = local20.anInt4731 << 9;
				this.anInt6059 = local20.anInt4771;
				this.anInt6056 = local20.anInt4786;
				this.anInt6064 = local20.anInt4763;
				this.anInt6066 = local20.anInt4755;
				this.anIntArray388 = local20.anIntArray317;
				this.aBoolean470 = local20.aBoolean382;
				this.anInt6055 = local20.anInt4741;
			}
		} else if (this.aClass23_Sub2_Sub1_Sub2_Sub2_2 != null) {
			@Pc(146) int local146 = Static370.method5477(this.aClass23_Sub2_Sub1_Sub2_Sub2_2);
			if (local146 != local8) {
				this.anInt6055 = local146;
				@Pc(160) Class5 local160 = this.aClass23_Sub2_Sub1_Sub2_Sub2_2.aClass5_1;
				if (local160.anIntArray1 != null) {
					local160 = local160.method56(Static592.aClass47_2);
				}
				if (local160 == null) {
					this.aBoolean470 = this.aClass23_Sub2_Sub1_Sub2_Sub2_2.aClass5_1.aBoolean5;
					this.anInt6064 = 256;
					this.anInt6059 = this.anInt6065 = this.anInt6067 = 0;
					this.anInt6056 = 256;
				} else {
					this.anInt6056 = local160.anInt62;
					this.anInt6067 = local160.anInt39 << 9;
					this.anInt6065 = local160.anInt48 << 9;
					this.anInt6059 = local160.anInt42;
					this.anInt6064 = local160.anInt72;
					this.aBoolean470 = local160.aBoolean5;
				}
			}
		} else if (this.aClass23_Sub2_Sub1_Sub2_Sub1_1 != null) {
			this.anInt6055 = Static7.method70(this.aClass23_Sub2_Sub1_Sub2_Sub1_1);
			this.anInt6064 = 256;
			this.anInt6059 = this.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt3276;
			this.anInt6056 = 256;
			this.anInt6065 = this.aClass23_Sub2_Sub1_Sub2_Sub1_1.anInt3268 << 9;
			this.aBoolean470 = this.aClass23_Sub2_Sub1_Sub2_Sub1_1.aBoolean258;
			this.anInt6067 = 0;
		}
		if (local8 == this.anInt6055 && local11 == this.aBoolean470) {
			return;
		}
		if (this.aClass3_Sub9_Sub2_1 == null) {
			return;
		}
		Static557.aClass3_Sub9_Sub1_2.method1420(this.aClass3_Sub9_Sub2_1);
		this.aClass3_Sub12_Sub1_2 = null;
		this.aClass3_Sub51_1 = null;
		this.aClass3_Sub9_Sub2_1 = null;
	}
}
