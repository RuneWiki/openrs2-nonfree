import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Lclient!ef;")
	public Class3_Sub9_Sub1 aClass3_Sub9_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "Lclient!qa;")
	public Class3_Sub1_Sub15 aClass3_Sub1_Sub15_1;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "Lclient!ef;")
	public Class3_Sub9_Sub1 aClass3_Sub9_Sub1_2;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public void method156() {
		@Pc(8) int local8 = this.anInt240;
		@Pc(17) Class3_Sub1_Sub15 local17 = this.aClass3_Sub1_Sub15_1.method2191();
		if (local17 == null) {
			this.anIntArray11 = null;
			this.anInt241 = 0;
			this.anInt240 = -1;
			this.anInt233 = 0;
			this.anInt242 = 0;
		} else {
			this.anInt241 = local17.anInt3027;
			this.anInt242 = local17.anInt3003 * 128;
			this.anInt240 = local17.anInt3036;
			this.anIntArray11 = local17.anIntArray315;
			this.anInt233 = local17.anInt3035;
		}
		if (this.anInt240 != local8 && this.aClass3_Sub9_Sub1_2 != null) {
			Static11.aClass3_Sub9_Sub4_1.method2221(this.aClass3_Sub9_Sub1_2);
			this.aClass3_Sub9_Sub1_2 = null;
		}
	}
}
