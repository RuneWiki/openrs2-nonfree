import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public int anInt986;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!sg;")
	public Class11_Sub5_Sub2_Sub2 aClass11_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public int anInt987;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!ku;")
	public Class139 aClass139_1;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	public int anInt992;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
	public int[] anIntArray59;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
	public int anInt994;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!ki;")
	public Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!cg;")
	public Class4_Sub7_Sub1 aClass4_Sub7_Sub1_2;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!cg;")
	public Class4_Sub7_Sub1 aClass4_Sub7_Sub1_3;

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
	public int anInt998;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public int anInt990 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public void method924() {
		@Pc(8) int local8 = this.anInt994;
		if (this.aClass139_1 != null) {
			@Pc(17) Class139 local17 = this.aClass139_1.method3751(Static67.aClass224_1);
			if (local17 == null) {
				this.anInt999 = 0;
				this.anInt994 = -1;
				this.anInt988 = 0;
				this.anInt996 = 0;
				this.anIntArray59 = null;
				this.anInt998 = 0;
			} else {
				this.anInt998 = local17.anInt4370;
				this.anIntArray59 = local17.anIntArray342;
				this.anInt999 = local17.anInt4359 << 7;
				this.anInt988 = local17.anInt4361;
				this.anInt996 = local17.lb;
				this.anInt994 = local17.anInt4376;
			}
		} else if (this.aClass11_Sub5_Sub2_Sub2_1 != null) {
			@Pc(98) int local98 = Static371.method5251(this.aClass11_Sub5_Sub2_Sub2_1);
			if (local8 != local98) {
				this.anInt994 = local98;
				@Pc(112) Class241 local112 = this.aClass11_Sub5_Sub2_Sub2_1.aClass241_1;
				if (local112.anIntArray565 != null) {
					local112 = local112.method5593(Static67.aClass224_1);
				}
				if (local112 == null) {
					this.anInt988 = this.anInt999 = 0;
				} else {
					this.anInt999 = local112.anInt7006 << 7;
					this.anInt988 = local112.anInt6990;
				}
			}
		} else if (this.aClass11_Sub5_Sub2_Sub1_1 != null) {
			this.anInt994 = Static188.method3408(this.aClass11_Sub5_Sub2_Sub1_1);
			this.anInt988 = this.aClass11_Sub5_Sub2_Sub1_1.anInt4156;
			this.anInt999 = this.aClass11_Sub5_Sub2_Sub1_1.anInt4195 << 7;
		}
		if (this.anInt994 != local8 && this.aClass4_Sub7_Sub1_3 != null) {
			Static132.aClass4_Sub7_Sub4_1.method5474(this.aClass4_Sub7_Sub1_3);
			this.aClass4_Sub7_Sub1_3 = null;
		}
	}
}
