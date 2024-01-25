import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
	public int anInt3845;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Z")
	public boolean aBoolean283;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Lclient!wg;")
	public Class8_Sub3_Sub1_Sub2 aClass8_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public int anInt3851;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
	public int anInt3852;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public int anInt3855;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	public int anInt3856;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "Lclient!si;")
	public Class4_Sub14_Sub4 aClass4_Sub14_Sub4_2;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	public int anInt3857;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "Lclient!si;")
	public Class4_Sub14_Sub4 aClass4_Sub14_Sub4_3;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "Lclient!ho;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "Lclient!rd;")
	public Class8_Sub3_Sub1_Sub1 aClass8_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
	public int anInt3859;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	public int anInt3860;

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	public int anInt3849 = 0;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public void method3049() {
		@Pc(14) int local14 = this.anInt3851;
		if (this.aClass114_1 != null) {
			@Pc(104) Class114 local104 = this.aClass114_1.method2181(Static52.aClass81_1);
			if (local104 == null) {
				this.anInt3856 = 0;
				this.anInt3850 = 0;
				this.anIntArray280 = null;
				this.anInt3851 = -1;
				this.anInt3853 = 0;
				this.anInt3857 = 0;
			} else {
				this.anInt3857 = local104.anInt2846;
				this.anInt3850 = local104.anInt2874;
				this.anInt3851 = local104.anInt2864;
				this.anIntArray280 = local104.anIntArray231;
				this.anInt3853 = local104.anInt2850 << 7;
				this.anInt3856 = local104.anInt2829;
			}
		} else if (this.aClass8_Sub3_Sub1_Sub2_1 != null) {
			@Pc(50) int local50 = Static332.method4391(this.aClass8_Sub3_Sub1_Sub2_1);
			if (local14 != local50) {
				this.anInt3851 = local50;
				@Pc(64) Class78 local64 = this.aClass8_Sub3_Sub1_Sub2_1.aClass78_1;
				if (local64.anIntArray145 != null) {
					local64 = local64.method1547(Static52.aClass81_1);
				}
				if (local64 == null) {
					this.anInt3850 = this.anInt3853 = 0;
				} else {
					this.anInt3850 = local64.anInt1886;
					this.anInt3853 = local64.anInt1910 << 7;
				}
			}
		} else if (this.aClass8_Sub3_Sub1_Sub1_1 != null) {
			this.anInt3851 = Static407.method5531(this.aClass8_Sub3_Sub1_Sub1_1);
			this.anInt3850 = this.aClass8_Sub3_Sub1_Sub1_1.anInt5655;
			this.anInt3853 = this.aClass8_Sub3_Sub1_Sub1_1.anInt5667 << 7;
		}
		if (this.anInt3851 != local14 && this.aClass4_Sub14_Sub4_2 != null) {
			Static406.aClass4_Sub14_Sub2_2.method2420(this.aClass4_Sub14_Sub4_2);
			this.aClass4_Sub14_Sub4_2 = null;
		}
	}
}
