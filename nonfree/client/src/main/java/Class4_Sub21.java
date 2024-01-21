import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public int anInt2764;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	public int anInt2765;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	public int anInt2766;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
	public int anInt2767;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
	public int anInt2770;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "Lclient!b;")
	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
	public int anInt2772;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
	public int anInt2774;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
	public int anInt2777;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "Lclient!b;")
	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_3;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "Lclient!gf;")
	public Class4_Sub4_Sub5 aClass4_Sub4_Sub5_1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public void method1948() {
		@Pc(6) int local6 = this.anInt2769;
		@Pc(16) Class4_Sub4_Sub5 local16 = this.aClass4_Sub4_Sub5_1.method727();
		if (local16 == null) {
			this.anIntArray302 = null;
			this.anInt2779 = 0;
			this.anInt2767 = 0;
			this.anInt2764 = 0;
			this.anInt2769 = -1;
		} else {
			this.anInt2779 = local16.anInt1093;
			this.anInt2764 = local16.anInt1100;
			this.anInt2769 = local16.anInt1079;
			this.anIntArray302 = local16.anIntArray93;
			this.anInt2767 = local16.anInt1105 * 128;
		}
		if (this.anInt2769 != local6 && this.aClass4_Sub2_Sub1_3 != null) {
			Static119.aClass4_Sub2_Sub3_2.method750(this.aClass4_Sub2_Sub1_3);
			this.aClass4_Sub2_Sub1_3 = null;
		}
	}
}
