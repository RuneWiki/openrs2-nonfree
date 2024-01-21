import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt1176;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt1177;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt1178;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Lclient!nb;")
	public Class2_Sub16_Sub1 aClass2_Sub16_Sub1_2;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	public int anInt1182;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
	public int anInt1183;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "Lclient!nb;")
	public Class2_Sub16_Sub1 aClass2_Sub16_Sub1_3;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lclient!rb;")
	public Class2_Sub2_Sub14 aClass2_Sub2_Sub14_1;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
	public int anInt1185;

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
	public int anInt1186;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method807() {
		@Pc(6) int local6 = this.anInt1178;
		@Pc(11) Class2_Sub2_Sub14 local11 = this.aClass2_Sub2_Sub14_1.method1558();
		if (local11 == null) {
			this.anInt1172 = 0;
			this.anIntArray138 = null;
			this.anInt1173 = 0;
			this.anInt1177 = 0;
			this.anInt1178 = -1;
		} else {
			this.anInt1178 = local11.anInt2273;
			this.anInt1173 = local11.anInt2275;
			this.anInt1172 = local11.anInt2257;
			this.anIntArray138 = local11.anIntArray319;
			this.anInt1177 = local11.anInt2264 * 128;
		}
		if (this.anInt1178 != local6 && this.aClass2_Sub16_Sub1_3 != null) {
			Static55.aClass2_Sub16_Sub3_2.method1842(this.aClass2_Sub16_Sub1_3);
			this.aClass2_Sub16_Sub1_3 = null;
		}
	}
}
