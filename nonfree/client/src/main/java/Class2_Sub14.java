import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
	public int anInt1660;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
	public int anInt1663;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public int anInt1664;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Lclient!nd;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	public int anInt1670;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "Lclient!ge;")
	public Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	public int anInt1671;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
	public int anInt1673;

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "Lclient!nd;")
	public Class2_Sub5_Sub2 aClass2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
	public int anInt1675;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
	public int anInt1677;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	public void method1109() {
		@Pc(14) int local14 = this.anInt1674;
		@Pc(19) Class2_Sub1_Sub4 local19 = this.aClass2_Sub1_Sub4_1.method705();
		if (local19 == null) {
			this.anInt1677 = 0;
			this.anInt1675 = 0;
			this.anIntArray167 = null;
			this.anInt1674 = -1;
			this.anInt1670 = 0;
		} else {
			this.anInt1670 = local19.anInt1064;
			this.anIntArray167 = local19.anIntArray105;
			this.anInt1674 = local19.anInt1046;
			this.anInt1675 = local19.anInt1061;
			this.anInt1677 = local19.anInt1069 * 128;
		}
		if (this.anInt1674 != local14 && this.aClass2_Sub5_Sub2_2 != null) {
			Static77.aClass2_Sub5_Sub1_1.method1137(this.aClass2_Sub5_Sub2_2);
			this.aClass2_Sub5_Sub2_2 = null;
		}
	}
}
