import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Z")
	public boolean aBoolean591;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "Lclient!lt;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public int anInt7174;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "Z")
	public boolean aBoolean592;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "Lclient!mq;")
	public Class12_Sub2_Sub1_Sub4_Sub1 aClass12_Sub2_Sub1_Sub4_Sub1_24;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "Lclient!wm;")
	public Class2_Sub13_Sub1 aClass2_Sub13_Sub1_2;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "Lclient!u;")
	public Class12_Sub2_Sub1_Sub4_Sub2 aClass12_Sub2_Sub1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public int anInt7175;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
	public int anInt7176;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "Lclient!pda;")
	public Class2_Sub37 aClass2_Sub37_2;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Lclient!pda;")
	public Class2_Sub37 aClass2_Sub37_3;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
	public int anInt7184;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
	public int anInt7185;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
	public int anInt7186;

	@OriginalMember(owner = "client!qv", name = "E", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "Z")
	public boolean aBoolean593;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
	public int anInt7187;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "Lclient!lca;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_2;

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
	public int anInt7188;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "Lclient!lca;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_3;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "Lclient!wm;")
	public Class2_Sub13_Sub1 aClass2_Sub13_Sub1_3;

	@OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
	public int anInt7190;

	@OriginalMember(owner = "client!qv", name = "Q", descriptor = "I")
	public int anInt7192;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
	public int anInt7181 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public void method5859() {
		@Pc(15) int local15 = this.anInt7190;
		@Pc(18) boolean local18 = this.aBoolean592;
		if (this.aClass216_1 != null) {
			@Pc(27) Class216 local27 = this.aClass216_1.method4560(Static426.aClass160_1);
			if (local27 == null) {
				this.anInt7176 = 256;
				this.anInt7192 = 0;
				this.anIntArray485 = null;
				this.anInt7190 = -1;
				this.anInt7175 = 0;
				this.anInt7174 = 0;
				this.anInt7185 = 256;
				this.aBoolean592 = false;
				this.anInt7173 = 0;
				this.aBoolean591 = false;
			} else {
				this.anInt7174 = local27.anInt5258;
				this.anInt7185 = local27.anInt5240;
				this.anInt7190 = local27.anInt5239;
				this.aBoolean591 = local27.aBoolean404;
				this.anInt7176 = local27.anInt5249;
				this.anInt7192 = local27.anInt5252;
				this.anIntArray485 = local27.anIntArray360;
				this.anInt7173 = local27.anInt5265 << 9;
				this.anInt7175 = local27.anInt5250;
				this.aBoolean592 = local27.aBoolean405;
			}
		} else if (this.aClass12_Sub2_Sub1_Sub4_Sub2_2 != null) {
			@Pc(113) int local113 = Static473.method6141(this.aClass12_Sub2_Sub1_Sub4_Sub2_2);
			if (local15 != local113) {
				this.anInt7190 = local113;
				@Pc(123) Class295 local123 = this.aClass12_Sub2_Sub1_Sub4_Sub2_2.aClass295_1;
				if (local123.anIntArray493 != null) {
					local123 = local123.method5942(Static426.aClass160_1);
				}
				if (local123 == null) {
					this.anInt7176 = 256;
					this.anInt7175 = this.anInt7173 = 0;
					this.anInt7185 = 256;
					this.aBoolean592 = this.aClass12_Sub2_Sub1_Sub4_Sub2_2.aClass295_1.aBoolean616;
				} else {
					this.anInt7185 = local123.anInt7341;
					this.anInt7175 = local123.anInt7335;
					this.aBoolean592 = local123.aBoolean616;
					this.anInt7173 = local123.anInt7324 << 9;
					this.anInt7176 = local123.anInt7346;
				}
			}
		} else if (this.aClass12_Sub2_Sub1_Sub4_Sub1_24 != null) {
			this.anInt7190 = Static542.method5365(this.aClass12_Sub2_Sub1_Sub4_Sub1_24);
			this.anInt7173 = this.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt5821 << 9;
			this.aBoolean592 = this.aClass12_Sub2_Sub1_Sub4_Sub1_24.aBoolean458;
			this.anInt7185 = 256;
			this.anInt7175 = this.aClass12_Sub2_Sub1_Sub4_Sub1_24.anInt5820;
			this.anInt7176 = 256;
		}
		if (local15 == this.anInt7190 && this.aBoolean592 == local18) {
			return;
		}
		if (this.aClass2_Sub3_Sub3_2 == null) {
			return;
		}
		Static246.aClass2_Sub3_Sub4_2.method6705(this.aClass2_Sub3_Sub3_2);
		this.aClass2_Sub37_2 = null;
		this.aClass2_Sub3_Sub3_2 = null;
		this.aClass2_Sub13_Sub1_2 = null;
	}
}
