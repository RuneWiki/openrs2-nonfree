import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public int anInt3589;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!so;")
	public Class3_Sub2_Sub1_Sub2 aClass3_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public int anInt3590;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public int anInt3591;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	public int anInt3592;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!hn;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "Lclient!ar;")
	public Class6_Sub4_Sub1 aClass6_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public int anInt3597;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Lclient!ar;")
	public Class6_Sub4_Sub1 aClass6_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public int anInt3599;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!cu;")
	public Class3_Sub2_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Z")
	public boolean aBoolean232;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public int anInt3593 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method2972() {
		@Pc(12) int local12 = this.anInt3591;
		if (this.aClass106_1 != null) {
			@Pc(21) Class106 local21 = this.aClass106_1.method2625(Static393.aClass207_1);
			if (local21 == null) {
				this.anInt3590 = 0;
				this.anInt3597 = 0;
				this.anInt3603 = 0;
				this.anInt3591 = -1;
				this.anInt3601 = 0;
				this.anIntArray227 = null;
			} else {
				this.anIntArray227 = local21.anIntArray190;
				this.anInt3591 = local21.anInt3178;
				this.anInt3601 = local21.anInt3193;
				this.anInt3603 = local21.anInt3177 << 7;
				this.anInt3590 = local21.anInt3200;
				this.anInt3597 = local21.anInt3156;
			}
		} else if (this.aClass3_Sub2_Sub1_Sub1_1 != null) {
			@Pc(79) int local79 = Static29.method722(this.aClass3_Sub2_Sub1_Sub1_1);
			if (local79 != local12) {
				this.anInt3591 = local79;
				@Pc(89) Class48 local89 = this.aClass3_Sub2_Sub1_Sub1_1.aClass48_1;
				if (local89.anIntArray103 != null) {
					local89 = local89.method1378(Static393.aClass207_1);
				}
				if (local89 == null) {
					this.anInt3597 = this.anInt3603 = 0;
				} else {
					this.anInt3603 = local89.anInt1781 << 7;
					this.anInt3597 = local89.anInt1772;
				}
			}
		} else if (this.aClass3_Sub2_Sub1_Sub2_1 != null) {
			this.anInt3591 = Static202.method3126(this.aClass3_Sub2_Sub1_Sub2_1);
			this.anInt3597 = this.aClass3_Sub2_Sub1_Sub2_1.anInt6647;
			this.anInt3603 = this.aClass3_Sub2_Sub1_Sub2_1.anInt6639 << 7;
		}
		if (local12 != this.anInt3591 && this.aClass6_Sub4_Sub1_3 != null) {
			Static360.aClass6_Sub4_Sub4_2.method5907(this.aClass6_Sub4_Sub1_3);
			this.aClass6_Sub4_Sub1_3 = null;
		}
	}
}
