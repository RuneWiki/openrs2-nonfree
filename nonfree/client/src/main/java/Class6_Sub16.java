import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!fh;")
	public Class6_Sub18_Sub1 aClass6_Sub18_Sub1_2;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	public int anInt2201;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "Lclient!ac;")
	public Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "Lclient!hl;")
	public Class6_Sub22 aClass6_Sub22_2;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
	public int anInt2202;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Lclient!pp;")
	public Class4_Sub1_Sub1_Sub2 aClass4_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Lclient!fh;")
	public Class6_Sub18_Sub1 aClass6_Sub18_Sub1_3;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
	public int anInt2206;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	public int anInt2207;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "Lclient!pg;")
	public Class252 aClass252_1;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	public int anInt2209;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
	public int anInt2211;

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
	public int anInt2214;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	public int anInt2215;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "Lclient!hl;")
	public Class6_Sub22 aClass6_Sub22_3;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "Lclient!ft;")
	public Class6_Sub19_Sub1 aClass6_Sub19_Sub1_2;

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "Lclient!ft;")
	public Class6_Sub19_Sub1 aClass6_Sub19_Sub1_3;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
	public int anInt2203 = 0;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method2013() {
		@Pc(16) int local16 = this.anInt2207;
		@Pc(19) boolean local19 = this.aBoolean152;
		if (this.aClass252_1 != null) {
			@Pc(28) Class252 local28 = this.aClass252_1.method5799(Static498.aClass101_1);
			if (local28 == null) {
				this.anInt2208 = 0;
				this.anInt2201 = 0;
				this.anInt2207 = -1;
				this.aBoolean153 = false;
				this.aBoolean152 = false;
				this.anIntArray167 = null;
				this.anInt2214 = 0;
				this.anInt2209 = 0;
			} else {
				this.anInt2214 = local28.anInt6892;
				this.anInt2209 = local28.anInt6894;
				this.anInt2201 = local28.anInt6917;
				this.anIntArray167 = local28.anIntArray509;
				this.aBoolean153 = local28.aBoolean479;
				this.aBoolean152 = local28.aBoolean475;
				this.anInt2207 = local28.anInt6887;
				this.anInt2208 = local28.anInt6915 << 9;
			}
		} else if (this.aClass4_Sub1_Sub1_Sub1_1 != null) {
			@Pc(100) int local100 = Static219.method3785(this.aClass4_Sub1_Sub1_Sub1_1);
			if (local16 != local100) {
				this.anInt2207 = local100;
				@Pc(114) Class273 local114 = this.aClass4_Sub1_Sub1_Sub1_1.aClass273_1;
				if (local114.anIntArray537 != null) {
					local114 = local114.method6159(Static498.aClass101_1);
				}
				if (local114 == null) {
					this.anInt2214 = this.anInt2208 = 0;
					this.aBoolean152 = this.aClass4_Sub1_Sub1_Sub1_1.aClass273_1.aBoolean517;
				} else {
					this.anInt2208 = local114.anInt7458 << 9;
					this.anInt2214 = local114.anInt7448;
					this.aBoolean152 = local114.aBoolean517;
				}
			}
		} else if (this.aClass4_Sub1_Sub1_Sub2_1 != null) {
			this.anInt2207 = Static449.method6351(this.aClass4_Sub1_Sub1_Sub2_1);
			this.anInt2214 = this.aClass4_Sub1_Sub1_Sub2_1.anInt7171;
			this.anInt2208 = this.aClass4_Sub1_Sub1_Sub2_1.anInt7174 << 9;
			this.aBoolean152 = this.aClass4_Sub1_Sub1_Sub2_1.aBoolean497;
		}
		if (local16 == this.anInt2207 && this.aBoolean152 == local19) {
			return;
		}
		if (this.aClass6_Sub18_Sub1_3 == null) {
			return;
		}
		Static374.aClass6_Sub18_Sub4_2.method6380(this.aClass6_Sub18_Sub1_3);
		this.aClass6_Sub18_Sub1_3 = null;
		this.aClass6_Sub19_Sub1_2 = null;
		this.aClass6_Sub22_2 = null;
	}
}
