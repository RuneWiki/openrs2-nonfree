import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
	public int anInt3159;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
	public int anInt3160;

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "Lclient!fc;")
	public Class5_Sub15_Sub1 aClass5_Sub15_Sub1_1;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "Lclient!tk;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "Lclient!fc;")
	public Class5_Sub15_Sub1 aClass5_Sub15_Sub1_2;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
	public int anInt3163;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
	public int anInt3164;

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "Lclient!jk;")
	public Class15_Sub2_Sub1_Sub2 aClass15_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
	public int anInt3166;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
	public int anInt3167;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "Lclient!bda;")
	public Class15_Sub2_Sub1_Sub1 aClass15_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
	public int anInt3170;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
	public int anInt3172;

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
	public int anInt3173;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
	public int anInt3171 = 0;

	static {
		new Class40(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	public void method2823() {
		@Pc(8) int local8 = this.anInt3164;
		if (this.aClass283_1 != null) {
			@Pc(17) Class283 local17 = this.aClass283_1.method6604(Static540.aClass242_1);
			if (local17 == null) {
				this.anInt3170 = 0;
				this.anInt3168 = 0;
				this.anInt3162 = 0;
				this.anIntArray245 = null;
				this.anInt3167 = 0;
				this.anInt3164 = -1;
			} else {
				this.anInt3162 = local17.anInt8179;
				this.anInt3170 = local17.anInt8194 << 7;
				this.anIntArray245 = local17.anIntArray634;
				this.anInt3168 = local17.anInt8169;
				this.anInt3164 = local17.anInt8193;
				this.anInt3167 = local17.anInt8175;
			}
		} else if (this.aClass15_Sub2_Sub1_Sub2_1 != null) {
			@Pc(98) int local98 = Static7.method266(this.aClass15_Sub2_Sub1_Sub2_1);
			if (local8 != local98) {
				this.anInt3164 = local98;
				@Pc(108) Class305 local108 = this.aClass15_Sub2_Sub1_Sub2_1.aClass305_1;
				if (local108.anIntArray679 != null) {
					local108 = local108.method7150(Static540.aClass242_1);
				}
				if (local108 == null) {
					this.anInt3168 = this.anInt3170 = 0;
				} else {
					this.anInt3168 = local108.anInt8811;
					this.anInt3170 = local108.anInt8813 << 7;
				}
			}
		} else if (this.aClass15_Sub2_Sub1_Sub1_2 != null) {
			this.anInt3164 = Static276.method4515(this.aClass15_Sub2_Sub1_Sub1_2);
			this.anInt3168 = this.aClass15_Sub2_Sub1_Sub1_2.anInt837;
			this.anInt3170 = this.aClass15_Sub2_Sub1_Sub1_2.anInt855 << 7;
		}
		if (this.anInt3164 != local8 && this.aClass5_Sub15_Sub1_2 != null) {
			Static373.aClass5_Sub15_Sub2_1.method4871(this.aClass5_Sub15_Sub1_2);
			this.aClass5_Sub15_Sub1_2 = null;
		}
	}
}
