import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!kl;")
	public Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt1224;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt1225;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt1226;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public int anInt1227;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Lclient!kl;")
	public Class1_Sub3_Sub4 aClass1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "Lclient!c;")
	public Class25_Sub1_Sub1 aClass25_Sub1_Sub1_1;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public int anInt1229;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt1230;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Lclient!ch;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public int anInt1231;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
	public int anInt1235;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!ek;")
	public Class25_Sub1_Sub2 aClass25_Sub1_Sub2_1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt1222 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method926() {
		@Pc(13) int local13 = this.anInt1230;
		if (this.aClass30_1 != null) {
			@Pc(95) Class30 local95 = this.aClass30_1.method688();
			if (local95 == null) {
				this.anInt1230 = -1;
				this.anInt1235 = 0;
				this.anIntArray116 = null;
				this.anInt1234 = 0;
				this.anInt1229 = 0;
				this.anInt1225 = 0;
			} else {
				this.anInt1235 = local95.anInt839;
				this.anInt1234 = local95.anInt829 * 128;
				this.anInt1225 = local95.anInt844;
				this.anInt1230 = local95.anInt857;
				this.anInt1229 = local95.anInt869;
				this.anIntArray116 = local95.anIntArray92;
			}
		} else if (this.aClass25_Sub1_Sub2_1 != null) {
			@Pc(50) int local50 = Static158.method2960(this.aClass25_Sub1_Sub2_1);
			if (local50 != local13) {
				this.anInt1230 = local50;
				@Pc(60) Class143 local60 = this.aClass25_Sub1_Sub2_1.aClass143_1;
				if (local60.anIntArray535 != null) {
					local60 = local60.method4065();
				}
				if (local60 == null) {
					this.anInt1229 = this.anInt1234 = 0;
				} else {
					this.anInt1234 = local60.anInt5163 * 128;
					this.anInt1229 = local60.anInt5176;
				}
			}
		} else if (this.aClass25_Sub1_Sub1_1 != null) {
			this.anInt1230 = Static192.method3418(this.aClass25_Sub1_Sub1_1);
			this.anInt1234 = this.aClass25_Sub1_Sub1_1.anInt712 * 128;
			this.anInt1229 = this.aClass25_Sub1_Sub1_1.anInt725;
		}
		if (this.anInt1230 != local13 && this.aClass1_Sub3_Sub4_2 != null) {
			Static245.aClass1_Sub3_Sub1_2.method520(this.aClass1_Sub3_Sub4_2);
			this.aClass1_Sub3_Sub4_2 = null;
		}
	}
}
