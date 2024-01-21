import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!cb;")
	public Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "Lclient!j;")
	public Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
	public int anInt2337;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Lclient!j;")
	public Class1_Sub4_Sub2 aClass1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public int anInt2341;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	public int anInt2346;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	public void method1471() {
		@Pc(6) int local6 = this.anInt2345;
		@Pc(16) Class1_Sub1_Sub4 local16 = this.aClass1_Sub1_Sub4_1.method176();
		if (local16 == null) {
			this.anInt2337 = 0;
			this.anInt2346 = 0;
			this.anIntArray314 = null;
			this.anInt2345 = -1;
			this.anInt2335 = 0;
		} else {
			this.anIntArray314 = local16.anIntArray53;
			this.anInt2346 = local16.anInt323 * 128;
			this.anInt2345 = local16.anInt295;
			this.anInt2335 = local16.anInt302;
			this.anInt2337 = local16.anInt296;
		}
		if (this.anInt2345 != local6 && this.aClass1_Sub4_Sub2_2 != null) {
			Static15.aClass1_Sub4_Sub1_1.method370(this.aClass1_Sub4_Sub2_2);
			this.aClass1_Sub4_Sub2_2 = null;
		}
	}
}
