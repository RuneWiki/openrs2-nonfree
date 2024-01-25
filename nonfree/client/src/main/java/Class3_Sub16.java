import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt2625;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!tt;")
	public Class6_Sub1_Sub2_Sub2 aClass6_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!eca;")
	public Class6_Sub1_Sub2_Sub1 aClass6_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!te;")
	public Class3_Sub42_Sub1 aClass3_Sub42_Sub1_2;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!qd;")
	public Class242 aClass242_1;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!rw;")
	public Class3_Sub44 aClass3_Sub44_2;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!te;")
	public Class3_Sub42_Sub1 aClass3_Sub42_Sub1_3;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!rw;")
	public Class3_Sub44 aClass3_Sub44_3;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
	public int anInt2632;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!nt;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_2;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Lclient!nt;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_3;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	public int anInt2636;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
	public int anInt2637;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public int anInt2628 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method2231() {
		@Pc(8) int local8 = this.anInt2622;
		@Pc(18) boolean local18 = this.aBoolean197;
		if (this.aClass242_1 != null) {
			@Pc(113) Class242 local113 = this.aClass242_1.method5975(Static127.aClass215_1);
			if (local113 == null) {
				this.anInt2622 = -1;
				this.aBoolean197 = false;
				this.anIntArray264 = null;
				this.aBoolean195 = false;
				this.anInt2625 = 0;
				this.anInt2635 = 0;
				this.anInt2623 = 0;
				this.anInt2632 = 0;
			} else {
				this.anInt2623 = local113.anInt7182;
				this.anInt2625 = local113.anInt7187;
				this.anIntArray264 = local113.anIntArray635;
				this.aBoolean195 = local113.aBoolean481;
				this.anInt2635 = local113.anInt7207;
				this.anInt2632 = local113.anInt7205 << 9;
				this.anInt2622 = local113.anInt7162;
				this.aBoolean197 = local113.aBoolean480;
			}
		} else if (this.aClass6_Sub1_Sub2_Sub2_2 != null) {
			@Pc(57) int local57 = Static90.method1815(this.aClass6_Sub1_Sub2_Sub2_2);
			if (local8 != local57) {
				this.anInt2622 = local57;
				@Pc(67) Class230 local67 = this.aClass6_Sub1_Sub2_Sub2_2.aClass230_1;
				if (local67.anIntArray627 != null) {
					local67 = local67.method5898(Static127.aClass215_1);
				}
				if (local67 == null) {
					this.aBoolean197 = this.aClass6_Sub1_Sub2_Sub2_2.aClass230_1.aBoolean450;
					this.anInt2623 = this.anInt2632 = 0;
				} else {
					this.anInt2623 = local67.anInt7025;
					this.anInt2632 = local67.anInt7054 << 9;
					this.aBoolean197 = local67.aBoolean450;
				}
			}
		} else if (this.aClass6_Sub1_Sub2_Sub1_2 != null) {
			this.anInt2622 = Static475.method7097(this.aClass6_Sub1_Sub2_Sub1_2);
			this.aBoolean197 = this.aClass6_Sub1_Sub2_Sub1_2.aBoolean162;
			this.anInt2632 = this.aClass6_Sub1_Sub2_Sub1_2.anInt2317 << 9;
			this.anInt2623 = this.aClass6_Sub1_Sub2_Sub1_2.anInt2286;
		}
		if (local8 == this.anInt2622 && local18 == this.aBoolean197) {
			return;
		}
		if (this.aClass3_Sub9_Sub2_2 == null) {
			return;
		}
		Static530.aClass3_Sub9_Sub3_2.method5653(this.aClass3_Sub9_Sub2_2);
		this.aClass3_Sub44_2 = null;
		this.aClass3_Sub9_Sub2_2 = null;
		this.aClass3_Sub42_Sub1_2 = null;
	}
}
