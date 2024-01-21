import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!ba;")
	public Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "Lclient!ve;")
	public Class3_Sub1_Sub17 aClass3_Sub1_Sub17_1;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "Lclient!ba;")
	public Class3_Sub2_Sub1 aClass3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	public void method504() {
		@Pc(11) int local11 = this.anInt767;
		@Pc(16) Class3_Sub1_Sub17 local16 = this.aClass3_Sub1_Sub17_1.method2275();
		if (local16 == null) {
			this.anInt767 = -1;
			this.anInt761 = 0;
			this.anInt770 = 0;
			this.anIntArray76 = null;
			this.anInt763 = 0;
		} else {
			this.anInt767 = local16.anInt3415;
			this.anInt763 = local16.anInt3423 * 128;
			this.anInt770 = local16.anInt3425;
			this.anInt761 = local16.anInt3414;
			this.anIntArray76 = local16.anIntArray386;
		}
		if (local11 != this.anInt767 && this.aClass3_Sub2_Sub1_2 != null) {
			Static125.aClass3_Sub2_Sub2_2.method712(this.aClass3_Sub2_Sub1_2);
			this.aClass3_Sub2_Sub1_2 = null;
		}
	}
}
