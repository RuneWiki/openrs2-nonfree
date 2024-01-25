import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!qe;")
	public Class5_Sub16_Sub3 aClass5_Sub16_Sub3_1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "Lclient!p;")
	public Class156 aClass156_1;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!of;")
	public Class4_Sub5_Sub2_Sub1 aClass4_Sub5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Lclient!qe;")
	public Class5_Sub16_Sub3 aClass5_Sub16_Sub3_2;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Lclient!rd;")
	public Class4_Sub5_Sub2_Sub2 aClass4_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public int anInt436 = 0;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
	public void method409() {
		@Pc(6) int local6 = this.anInt438;
		if (this.aClass156_1 != null) {
			@Pc(14) Class156 local14 = this.aClass156_1.method4232();
			if (local14 == null) {
				this.anInt445 = 0;
				this.anIntArray55 = null;
				this.anInt440 = 0;
				this.anInt434 = 0;
				this.anInt446 = 0;
				this.anInt438 = -1;
			} else {
				this.anInt446 = local14.anInt4764;
				this.anInt434 = local14.anInt4767;
				this.anInt440 = local14.anInt4762;
				this.anInt445 = local14.anInt4777 * 128;
				this.anIntArray55 = local14.anIntArray435;
				this.anInt438 = local14.anInt4749;
			}
		} else if (this.aClass4_Sub5_Sub2_Sub2_1 != null) {
			@Pc(70) int local70 = Static152.method5138(this.aClass4_Sub5_Sub2_Sub2_1);
			if (local70 != local6) {
				this.anInt438 = local70;
				@Pc(80) Class106 local80 = this.aClass4_Sub5_Sub2_Sub2_1.aClass106_1;
				if (local80.anIntArray326 != null) {
					local80 = local80.method2829();
				}
				if (local80 == null) {
					this.anInt440 = this.anInt445 = 0;
				} else {
					this.anInt440 = local80.anInt3167;
					this.anInt445 = local80.anInt3129 * 128;
				}
			}
		} else if (this.aClass4_Sub5_Sub2_Sub1_1 != null) {
			this.anInt438 = Static16.method307(this.aClass4_Sub5_Sub2_Sub1_1);
			this.anInt440 = this.aClass4_Sub5_Sub2_Sub1_1.anInt4576;
			this.anInt445 = this.aClass4_Sub5_Sub2_Sub1_1.anInt4543 * 128;
		}
		if (local6 != this.anInt438 && this.aClass5_Sub16_Sub3_1 != null) {
			Static114.aClass5_Sub16_Sub4_1.method5798(this.aClass5_Sub16_Sub3_1);
			this.aClass5_Sub16_Sub3_1 = null;
		}
	}
}
