import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public int anInt589;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Lclient!oe;")
	public Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public int anInt593;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	public int anInt595;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "Lclient!ef;")
	public Class1_Sub2_Sub6 aClass1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!oe;")
	public Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public void method489() {
		@Pc(6) int local6 = this.anInt591;
		@Pc(11) Class1_Sub2_Sub6 local11 = this.aClass1_Sub2_Sub6_1.method707();
		if (local11 == null) {
			this.anInt595 = 0;
			this.anIntArray137 = null;
			this.anInt587 = 0;
			this.anInt591 = -1;
			this.anInt593 = 0;
		} else {
			this.anInt591 = local11.anInt863;
			this.anIntArray137 = local11.anIntArray168;
			this.anInt593 = local11.anInt867;
			this.anInt587 = local11.anInt844 * 128;
			this.anInt595 = local11.anInt859;
		}
		if (this.anInt591 != local6 && this.aClass1_Sub3_Sub3_2 != null) {
			Static33.aClass1_Sub3_Sub2_1.method924(this.aClass1_Sub3_Sub3_2);
			this.aClass1_Sub3_Sub3_2 = null;
		}
	}
}
