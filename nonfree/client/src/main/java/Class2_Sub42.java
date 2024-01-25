import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "Lclient!ld;")
	public Class12_Sub1_Sub2_Sub1 aClass12_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public int anInt6534;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
	public int[] anIntArray788;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	public int anInt6536;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
	public int anInt6537;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
	public int anInt6539;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
	public int anInt6541;

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "Lclient!lc;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "Lclient!lc;")
	public Class2_Sub2_Sub2 aClass2_Sub2_Sub2_3;

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
	public int anInt6542;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
	public int anInt6543;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
	public int anInt6544;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "Lclient!cj;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "Lclient!qr;")
	public Class12_Sub1_Sub2_Sub2 aClass12_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
	public int anInt6545;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	public int anInt6546;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
	public int anInt6547 = 0;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	public void method5598() {
		@Pc(13) int local13 = this.anInt6543;
		if (this.aClass34_1 != null) {
			@Pc(97) Class34 local97 = this.aClass34_1.method831(Static248.aClass125_1);
			if (local97 == null) {
				this.anInt6543 = -1;
				this.anInt6546 = 0;
				this.anInt6535 = 0;
				this.anInt6537 = 0;
				this.anIntArray788 = null;
				this.anInt6539 = 0;
			} else {
				this.anIntArray788 = local97.anIntArray123;
				this.anInt6535 = local97.anInt768 * 128;
				this.anInt6546 = local97.anInt782;
				this.anInt6539 = local97.anInt811;
				this.anInt6543 = local97.anInt781;
				this.anInt6537 = local97.anInt794;
			}
		} else if (this.aClass12_Sub1_Sub2_Sub1_1 != null) {
			@Pc(24) int local24 = Static234.method3820(this.aClass12_Sub1_Sub2_Sub1_1);
			if (local13 != local24) {
				this.anInt6543 = local24;
				@Pc(38) Class240 local38 = this.aClass12_Sub1_Sub2_Sub1_1.aClass240_1;
				if (local38.anIntArray781 != null) {
					local38 = local38.method5567(Static248.aClass125_1);
				}
				if (local38 == null) {
					this.anInt6539 = this.anInt6535 = 0;
				} else {
					this.anInt6539 = local38.anInt6471;
					this.anInt6535 = local38.anInt6462 * 128;
				}
			}
		} else if (this.aClass12_Sub1_Sub2_Sub2_2 != null) {
			this.anInt6543 = Static165.method2708(this.aClass12_Sub1_Sub2_Sub2_2);
			this.anInt6535 = this.aClass12_Sub1_Sub2_Sub2_2.anInt5418 * 128;
			this.anInt6539 = this.aClass12_Sub1_Sub2_Sub2_2.anInt5414;
		}
		if (this.anInt6543 != local13 && this.aClass2_Sub2_Sub2_2 != null) {
			Static339.aClass2_Sub2_Sub1_2.method110(this.aClass2_Sub2_Sub2_2);
			this.aClass2_Sub2_Sub2_2 = null;
		}
	}
}
