import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public int anInt1601;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!km;")
	public Class28_Sub1_Sub1_Sub1 aClass28_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public int anInt1603;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!oa;")
	public Class28_Sub1_Sub1_Sub2 aClass28_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public int anInt1605;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public int anInt1606;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!ds;")
	public Class3_Sub8_Sub1 aClass3_Sub8_Sub1_1;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public int anInt1609;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public int anInt1610;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "Lclient!dq;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "I")
	public int anInt1612;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!ds;")
	public Class3_Sub8_Sub1 aClass3_Sub8_Sub1_2;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "I")
	public int anInt1613;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	public int anInt1615;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public int anInt1611 = 0;

	static {
		new Class57("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method1310() {
		@Pc(8) int local8 = this.anInt1601;
		if (this.aClass60_1 != null) {
			@Pc(20) Class60 local20 = this.aClass60_1.method1191(Static331.aClass115_1);
			if (local20 == null) {
				this.anInt1603 = 0;
				this.anInt1612 = 0;
				this.anInt1601 = -1;
				this.anIntArray160 = null;
				this.anInt1605 = 0;
				this.anInt1613 = 0;
			} else {
				this.anInt1612 = local20.anInt1412;
				this.anInt1601 = local20.anInt1385;
				this.anInt1605 = local20.anInt1400 * 128;
				this.anInt1613 = local20.anInt1381;
				this.anInt1603 = local20.anInt1428;
				this.anIntArray160 = local20.anIntArray140;
			}
		} else if (this.aClass28_Sub1_Sub1_Sub1_1 != null) {
			@Pc(101) int local101 = Static95.method5453(this.aClass28_Sub1_Sub1_Sub1_1);
			if (local101 != local8) {
				this.anInt1601 = local101;
				@Pc(115) Class61 local115 = this.aClass28_Sub1_Sub1_Sub1_1.aClass61_1;
				if (local115.anIntArray142 != null) {
					local115 = local115.method1216(Static331.aClass115_1);
				}
				if (local115 == null) {
					this.anInt1613 = this.anInt1605 = 0;
				} else {
					this.anInt1613 = local115.anInt1437;
					this.anInt1605 = local115.anInt1462 * 128;
				}
			}
		} else if (this.aClass28_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1601 = Static2.method57(this.aClass28_Sub1_Sub1_Sub2_1);
			this.anInt1613 = this.aClass28_Sub1_Sub1_Sub2_1.anInt4388;
			this.anInt1605 = this.aClass28_Sub1_Sub1_Sub2_1.anInt4403 * 128;
		}
		if (local8 != this.anInt1601 && this.aClass3_Sub8_Sub1_2 != null) {
			Static137.aClass3_Sub8_Sub2_2.method1712(this.aClass3_Sub8_Sub1_2);
			this.aClass3_Sub8_Sub1_2 = null;
		}
	}
}
