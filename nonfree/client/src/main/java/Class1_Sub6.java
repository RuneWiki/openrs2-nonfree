import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt285;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt287;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!fh;")
	public Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Lclient!rf;")
	public Class1_Sub10_Sub4 aClass1_Sub10_Sub4_2;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!rf;")
	public Class1_Sub10_Sub4 aClass1_Sub10_Sub4_3;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public void method222() {
		@Pc(6) int local6 = this.anInt297;
		@Pc(11) Class1_Sub2_Sub8 local11 = this.aClass1_Sub2_Sub8_1.method936();
		if (local11 == null) {
			this.anInt282 = 0;
			this.anIntArray11 = null;
			this.anInt297 = -1;
			this.anInt287 = 0;
			this.anInt296 = 0;
		} else {
			this.anInt282 = local11.anInt1275;
			this.anInt287 = local11.anInt1270 * 128;
			this.anIntArray11 = local11.anIntArray105;
			this.anInt296 = local11.anInt1274;
			this.anInt297 = local11.anInt1250;
		}
		if (this.anInt297 != local6 && this.aClass1_Sub10_Sub4_3 != null) {
			Static25.aClass1_Sub10_Sub1_1.method453(this.aClass1_Sub10_Sub4_3);
			this.aClass1_Sub10_Sub4_3 = null;
		}
	}
}
