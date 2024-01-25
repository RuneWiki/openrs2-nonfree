import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!rq;")
	public Class299 aClass299_1;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!pd;")
	public Class3_Sub43 aClass3_Sub43_1;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public int anInt3104;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
	public int anInt3106;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!pd;")
	public Class3_Sub43 aClass3_Sub43_2;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "Lclient!l;")
	public Class4_Sub1_Sub2_Sub1_Sub2 aClass4_Sub1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "Lclient!jda;")
	public Class3_Sub30_Sub1 aClass3_Sub30_Sub1_1;

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
	public int anInt3110;

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "Lclient!iq;")
	public Class3_Sub7_Sub3 aClass3_Sub7_Sub3_1;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
	public int anInt3116;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "Lclient!jda;")
	public Class3_Sub30_Sub1 aClass3_Sub30_Sub1_2;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "Lclient!gt;")
	public Class4_Sub1_Sub2_Sub1_Sub1 aClass4_Sub1_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "Lclient!iq;")
	public Class3_Sub7_Sub3 aClass3_Sub7_Sub3_2;

	@OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
	public int anInt3112 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method2846() {
		@Pc(8) int local8 = this.anInt3101;
		@Pc(17) boolean local17 = this.aBoolean204;
		if (this.aClass299_1 != null) {
			@Pc(134) Class299 local134 = this.aClass299_1.method7418(Static373.aClass150_1);
			if (local134 == null) {
				this.anInt3101 = -1;
				this.anInt3105 = 0;
				this.anInt3115 = 0;
				this.aBoolean206 = false;
				this.anInt3111 = 0;
				this.anIntArray158 = null;
				this.anInt3118 = 256;
				this.anInt3114 = 256;
				this.aBoolean204 = false;
				this.anInt3117 = 0;
			} else {
				this.anIntArray158 = local134.anIntArray535;
				this.anInt3115 = local134.anInt8632;
				this.aBoolean206 = local134.aBoolean604;
				this.anInt3111 = local134.anInt8646;
				this.anInt3101 = local134.anInt8675;
				this.anInt3114 = local134.anInt8656;
				this.anInt3118 = local134.anInt8627;
				this.aBoolean204 = local134.aBoolean613;
				this.anInt3117 = local134.anInt8639 << 9;
				this.anInt3105 = local134.anInt8664;
			}
		} else if (this.aClass4_Sub1_Sub2_Sub1_Sub1_1 != null) {
			@Pc(64) int local64 = Static559.method8065(this.aClass4_Sub1_Sub2_Sub1_Sub1_1);
			if (local64 != local8) {
				this.anInt3101 = local64;
				@Pc(74) Class109 local74 = this.aClass4_Sub1_Sub2_Sub1_Sub1_1.aClass109_1;
				if (local74.anIntArray147 != null) {
					local74 = local74.method2813(Static373.aClass150_1);
				}
				if (local74 == null) {
					this.anInt3118 = 256;
					this.aBoolean204 = this.aClass4_Sub1_Sub2_Sub1_Sub1_1.aClass109_1.aBoolean197;
					this.anInt3111 = this.anInt3117 = 0;
					this.anInt3114 = 256;
				} else {
					this.aBoolean204 = local74.aBoolean197;
					this.anInt3111 = local74.anInt3044;
					this.anInt3117 = local74.anInt3060 << 9;
					this.anInt3114 = local74.anInt3042;
					this.anInt3118 = local74.lb;
				}
			}
		} else if (this.aClass4_Sub1_Sub2_Sub1_Sub2_1 != null) {
			this.anInt3101 = Static638.method8714(this.aClass4_Sub1_Sub2_Sub1_Sub2_1);
			this.anInt3111 = this.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5831;
			this.anInt3117 = this.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5819 << 9;
			this.anInt3114 = 256;
			this.aBoolean204 = this.aClass4_Sub1_Sub2_Sub1_Sub2_1.aBoolean413;
			this.anInt3118 = 256;
		}
		if (local8 == this.anInt3101 && this.aBoolean204 == local17) {
			return;
		}
		if (this.aClass3_Sub7_Sub3_1 == null) {
			return;
		}
		Static204.aClass3_Sub7_Sub1_1.method1621(this.aClass3_Sub7_Sub3_1);
		this.aClass3_Sub43_2 = null;
		this.aClass3_Sub30_Sub1_2 = null;
		this.aClass3_Sub7_Sub3_1 = null;
	}
}
