import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public int anInt1709;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public int anInt1710;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
	public int anInt1711;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Lclient!ac;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
	public int anInt1721;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
	public int anInt1722;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "Lclient!og;")
	public Class3_Sub4_Sub4 aClass3_Sub4_Sub4_2;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "Lclient!og;")
	public Class3_Sub4_Sub4 aClass3_Sub4_Sub4_3;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	public void method1191() {
		@Pc(11) int local11 = this.anInt1710;
		@Pc(16) Class3_Sub1_Sub1 local16 = this.aClass3_Sub1_Sub1_1.method125();
		if (local16 == null) {
			this.anIntArray212 = null;
			this.anInt1710 = -1;
			this.anInt1711 = 0;
			this.anInt1709 = 0;
			this.anInt1723 = 0;
		} else {
			this.anInt1710 = local16.anInt140;
			this.anIntArray212 = local16.anIntArray26;
			this.anInt1723 = local16.anInt148;
			this.anInt1711 = local16.anInt155;
			this.anInt1709 = local16.anInt131 * 128;
		}
		if (this.anInt1710 != local11 && this.aClass3_Sub4_Sub4_2 != null) {
			Static152.aClass3_Sub4_Sub2_2.method1517(this.aClass3_Sub4_Sub4_2);
			this.aClass3_Sub4_Sub4_2 = null;
		}
	}
}
