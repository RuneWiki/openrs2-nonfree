import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
	public int anInt5743;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "Lclient!wn;")
	public Class1_Sub2_Sub3_Sub2 aClass1_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Lclient!sj;")
	public Class2_Sub11_Sub4 aClass2_Sub11_Sub4_2;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "Z")
	public boolean aBoolean510;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "Lclient!je;")
	public Class1_Sub2_Sub3_Sub1 aClass1_Sub2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "Lclient!sj;")
	public Class2_Sub11_Sub4 aClass2_Sub11_Sub4_3;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "Lclient!fq;")
	public Class74 aClass74_1;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
	public int anInt5748;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
	public int anInt5749;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
	public int anInt5751;

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
	public int anInt5752;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
	public int anInt5750 = 0;

	static {
		new Class140("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
	public void method4838() {
		@Pc(8) int local8 = this.anInt5746;
		if (this.aClass74_1 != null) {
			@Pc(16) Class74 local16 = this.aClass74_1.method1997();
			if (local16 == null) {
				this.anIntArray451 = null;
				this.anInt5746 = -1;
				this.anInt5745 = 0;
				this.anInt5742 = 0;
				this.anInt5740 = 0;
				this.anInt5743 = 0;
			} else {
				this.anInt5742 = local16.anInt2087;
				this.anInt5746 = local16.anInt2075;
				this.anInt5740 = local16.anInt2088;
				this.anInt5743 = local16.anInt2081 * 128;
				this.anIntArray451 = local16.anIntArray165;
				this.anInt5745 = local16.anInt2093;
			}
		} else if (this.aClass1_Sub2_Sub3_Sub2_1 != null) {
			@Pc(76) int local76 = Static57.method1228(this.aClass1_Sub2_Sub3_Sub2_1);
			if (local8 != local76) {
				this.anInt5746 = local76;
				@Pc(90) Class139 local90 = this.aClass1_Sub2_Sub3_Sub2_1.aClass139_1;
				if (local90.anIntArray350 != null) {
					local90 = local90.method4120();
				}
				if (local90 == null) {
					this.anInt5742 = this.anInt5743 = 0;
				} else {
					this.anInt5742 = local90.anInt4788;
					this.anInt5743 = local90.anInt4782 * 128;
				}
			}
		} else if (this.aClass1_Sub2_Sub3_Sub1_2 != null) {
			this.anInt5746 = Static1.method4431(this.aClass1_Sub2_Sub3_Sub1_2);
			this.anInt5742 = this.aClass1_Sub2_Sub3_Sub1_2.anInt3390;
			this.anInt5743 = this.aClass1_Sub2_Sub3_Sub1_2.anInt3414 * 128;
		}
		if (local8 != this.anInt5746 && this.aClass2_Sub11_Sub4_3 != null) {
			Static31.aClass2_Sub11_Sub3_1.method4110(this.aClass2_Sub11_Sub4_3);
			this.aClass2_Sub11_Sub4_3 = null;
		}
	}
}
