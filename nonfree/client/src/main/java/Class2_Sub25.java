import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "Lclient!m;")
	public Class2_Sub9_Sub1 aClass2_Sub9_Sub1_2;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public int anInt4579;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	public int anInt4580;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "Lclient!bf;")
	public Class2_Sub2_Sub5 aClass2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	public int anInt4585;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "Lclient!m;")
	public Class2_Sub9_Sub1 aClass2_Sub9_Sub1_3;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	public int anInt4588;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
	public int[] anIntArray644;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	public int anInt4591;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public void method3007() {
		@Pc(14) int local14 = this.anInt4580;
		@Pc(19) Class2_Sub2_Sub5 local19 = this.aClass2_Sub2_Sub5_1.method347();
		if (local19 == null) {
			this.anIntArray644 = null;
			this.anInt4585 = 0;
			this.anInt4590 = 0;
			this.anInt4580 = -1;
			this.anInt4591 = 0;
		} else {
			this.anInt4580 = local19.anInt535;
			this.anInt4585 = local19.anInt522 * 128;
			this.anInt4590 = local19.anInt539;
			this.anInt4591 = local19.anInt523;
			this.anIntArray644 = local19.anIntArray76;
		}
		if (this.anInt4580 != local14 && this.aClass2_Sub9_Sub1_3 != null) {
			Static153.aClass2_Sub9_Sub4_2.method2938(this.aClass2_Sub9_Sub1_3);
			this.aClass2_Sub9_Sub1_3 = null;
		}
	}
}
