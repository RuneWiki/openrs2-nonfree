import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!rd;")
	public Class202 aClass202_1;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "Lclient!qo;")
	public Class4_Sub15_Sub3 aClass4_Sub15_Sub3_1;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Lclient!rs;")
	public Class16_Sub1_Sub5_Sub2 aClass16_Sub1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Lclient!lh;")
	public Class16_Sub1_Sub5_Sub1 aClass16_Sub1_Sub5_Sub1_2;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!bn", name = "I", descriptor = "Lclient!qo;")
	public Class4_Sub15_Sub3 aClass4_Sub15_Sub3_2;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	public int anInt621 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method638() {
		@Pc(8) int local8 = this.anInt616;
		if (this.aClass202_1 != null) {
			@Pc(88) Class202 local88 = this.aClass202_1.method4584(Static257.aClass114_1);
			if (local88 == null) {
				this.anInt616 = -1;
				this.anInt620 = 0;
				this.anInt622 = 0;
				this.anIntArray37 = null;
				this.anInt611 = 0;
				this.anInt623 = 0;
			} else {
				this.anInt620 = local88.anInt5806;
				this.anIntArray37 = local88.anIntArray406;
				this.anInt623 = local88.anInt5844;
				this.anInt616 = local88.anInt5821;
				this.anInt611 = local88.anInt5849 << 7;
				this.anInt622 = local88.anInt5843;
			}
		} else if (this.aClass16_Sub1_Sub5_Sub2_1 != null) {
			@Pc(42) int local42 = Static325.method4392(this.aClass16_Sub1_Sub5_Sub2_1);
			if (local8 != local42) {
				this.anInt616 = local42;
				@Pc(52) Class264 local52 = this.aClass16_Sub1_Sub5_Sub2_1.aClass264_1;
				if (local52.anIntArray544 != null) {
					local52 = local52.method5574(Static257.aClass114_1);
				}
				if (local52 == null) {
					this.anInt620 = this.anInt611 = 0;
				} else {
					this.anInt620 = local52.anInt7235;
					this.anInt611 = local52.anInt7238 << 7;
				}
			}
		} else if (this.aClass16_Sub1_Sub5_Sub1_2 != null) {
			this.anInt616 = Static33.method631(this.aClass16_Sub1_Sub5_Sub1_2);
			this.anInt620 = this.aClass16_Sub1_Sub5_Sub1_2.anInt4348;
			this.anInt611 = this.aClass16_Sub1_Sub5_Sub1_2.anInt4334 << 7;
		}
		if (local8 != this.anInt616 && this.aClass4_Sub15_Sub3_2 != null) {
			Static360.aClass4_Sub15_Sub2_2.method2955(this.aClass4_Sub15_Sub3_2);
			this.aClass4_Sub15_Sub3_2 = null;
		}
	}
}
