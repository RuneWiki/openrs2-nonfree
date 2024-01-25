import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Lclient!en;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "Lclient!qr;")
	public Class62_Sub1_Sub2_Sub2 aClass62_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "Lclient!en;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "Lclient!qm;")
	public Class62_Sub1_Sub2_Sub1 aClass62_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "Lclient!jh;")
	public Class96 aClass96_1;

	@OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
	public int anInt537 = 0;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
	public void method761() {
		@Pc(8) int local8 = this.anInt536;
		if (this.aClass96_1 != null) {
			@Pc(22) Class96 local22 = this.aClass96_1.method2944();
			if (local22 == null) {
				this.anInt536 = -1;
				this.anInt531 = 0;
				this.anInt545 = 0;
				this.anInt542 = 0;
				this.anIntArray33 = null;
				this.anInt533 = 0;
			} else {
				this.anInt542 = local22.anInt3133;
				this.anInt531 = local22.anInt3146;
				this.anInt536 = local22.anInt3157;
				this.anInt533 = local22.anInt3114 * 128;
				this.anIntArray33 = local22.anIntArray256;
				this.anInt545 = local22.anInt3113;
			}
		} else if (this.aClass62_Sub1_Sub2_Sub1_1 != null) {
			@Pc(80) int local80 = Static18.method666(this.aClass62_Sub1_Sub2_Sub1_1);
			if (local80 != local8) {
				this.anInt536 = local80;
				@Pc(90) Class186 local90 = this.aClass62_Sub1_Sub2_Sub1_1.aClass186_1;
				if (local90.anIntArray432 != null) {
					local90 = local90.method5206();
				}
				if (local90 == null) {
					this.anInt531 = this.anInt533 = 0;
				} else {
					this.anInt531 = local90.anInt5976;
					this.anInt533 = local90.anInt5972 * 128;
				}
			}
		} else if (this.aClass62_Sub1_Sub2_Sub2_1 != null) {
			this.anInt536 = Static24.method737(this.aClass62_Sub1_Sub2_Sub2_1);
			this.anInt531 = this.aClass62_Sub1_Sub2_Sub2_1.anInt5391;
			this.anInt533 = this.aClass62_Sub1_Sub2_Sub2_1.anInt5392 * 128;
		}
		if (local8 != this.anInt536 && this.aClass2_Sub3_Sub2_2 != null) {
			Static313.aClass2_Sub3_Sub1_2.method365(this.aClass2_Sub3_Sub2_2);
			this.aClass2_Sub3_Sub2_2 = null;
		}
	}
}
