import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	public int anInt5954;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	public int anInt5956;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	public int anInt5957;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!bn;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
	public int anInt5959;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	public int anInt5960;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
	public int anInt5961;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
	public int anInt5962;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "Lclient!av;")
	public Class20_Sub1_Sub1_Sub1 aClass20_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!cn;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
	public int anInt5965;

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
	public int anInt5966;

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "Lclient!bn;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!mw", name = "G", descriptor = "Lclient!vi;")
	public Class20_Sub1_Sub1_Sub2 aClass20_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
	public int anInt5964 = 0;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
	public void method5395() {
		@Pc(8) int local8 = this.anInt5956;
		if (this.aClass51_1 != null) {
			@Pc(90) Class51 local90 = this.aClass51_1.method1625(Static417.aClass10_1);
			if (local90 == null) {
				this.anInt5954 = 0;
				this.anInt5961 = 0;
				this.anInt5956 = -1;
				this.anInt5966 = 0;
				this.anIntArray463 = null;
				this.anInt5968 = 0;
			} else {
				this.anInt5961 = local90.anInt1654;
				this.anInt5968 = local90.anInt1645 << 7;
				this.anInt5956 = local90.anInt1644;
				this.anInt5966 = local90.anInt1642;
				this.anIntArray463 = local90.anIntArray104;
				this.anInt5954 = local90.anInt1631;
			}
		} else if (this.aClass20_Sub1_Sub1_Sub2_1 != null) {
			@Pc(44) int local44 = Static440.method6821(this.aClass20_Sub1_Sub1_Sub2_1);
			if (local44 != local8) {
				this.anInt5956 = local44;
				@Pc(54) Class283 local54 = this.aClass20_Sub1_Sub1_Sub2_1.aClass283_1;
				if (local54.anIntArray743 != null) {
					local54 = local54.method7368(Static417.aClass10_1);
				}
				if (local54 == null) {
					this.anInt5961 = this.anInt5968 = 0;
				} else {
					this.anInt5968 = local54.anInt8446 << 7;
					this.anInt5961 = local54.anInt8434;
				}
			}
		} else if (this.aClass20_Sub1_Sub1_Sub1_2 != null) {
			this.anInt5956 = Static209.method3848(this.aClass20_Sub1_Sub1_Sub1_2);
			this.anInt5968 = this.aClass20_Sub1_Sub1_Sub1_2.anInt661 << 7;
			this.anInt5961 = this.aClass20_Sub1_Sub1_Sub1_2.anInt681;
		}
		if (local8 != this.anInt5956 && this.aClass1_Sub4_Sub1_3 != null) {
			Static475.aClass1_Sub4_Sub2_2.method3184(this.aClass1_Sub4_Sub1_3);
			this.aClass1_Sub4_Sub1_3 = null;
		}
	}
}
