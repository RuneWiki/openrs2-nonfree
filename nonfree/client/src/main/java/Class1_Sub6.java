import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	public int anInt1031;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!fe;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!qm;")
	public Class6_Sub6_Sub2 aClass6_Sub6_Sub2_2;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!le;")
	public Class104 aClass104_1;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!qi;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_1;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Lclient!fe;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public int anInt1036 = 0;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public void method842() {
		@Pc(8) int local8 = this.anInt1048;
		if (this.aClass104_1 != null) {
			@Pc(16) Class104 local16 = this.aClass104_1.method2355();
			if (local16 == null) {
				this.anInt1040 = 0;
				this.anInt1037 = 0;
				this.anIntArray134 = null;
				this.anInt1047 = 0;
				this.anInt1046 = 0;
				this.anInt1048 = -1;
			} else {
				this.anInt1040 = local16.anInt2805;
				this.anInt1046 = local16.anInt2829;
				this.anInt1047 = local16.anInt2831 * 128;
				this.anInt1037 = local16.anInt2835;
				this.anInt1048 = local16.anInt2833;
				this.anIntArray134 = local16.anIntArray348;
			}
		} else if (this.aClass6_Sub6_Sub1_1 != null) {
			@Pc(78) int local78 = Static2.method57(this.aClass6_Sub6_Sub1_1);
			if (local8 != local78) {
				this.anInt1048 = local78;
				@Pc(89) Class19 local89 = this.aClass6_Sub6_Sub1_1.aClass19_1;
				if (local89.anIntArray67 != null) {
					local89 = local89.method507();
				}
				if (local89 == null) {
					this.anInt1046 = this.anInt1047 = 0;
				} else {
					this.anInt1047 = local89.anInt665 * 128;
					this.anInt1046 = local89.anInt667;
				}
			}
		} else if (this.aClass6_Sub6_Sub2_2 != null) {
			this.anInt1048 = Static184.method2764(this.aClass6_Sub6_Sub2_2);
			this.anInt1046 = this.aClass6_Sub6_Sub2_2.anInt4604;
			this.anInt1047 = this.aClass6_Sub6_Sub2_2.anInt4609 * 128;
		}
		if (local8 != this.anInt1048 && this.aClass1_Sub8_Sub1_1 != null) {
			Static28.aClass1_Sub8_Sub3_1.method2409(this.aClass1_Sub8_Sub1_1);
			this.aClass1_Sub8_Sub1_1 = null;
		}
	}
}
