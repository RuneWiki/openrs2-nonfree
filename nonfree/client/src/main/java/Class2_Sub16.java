import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!jb;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_1;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	public int anInt1777;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!jb;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!i;")
	public Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
	public int anInt1780;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
	public int anInt1781;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	public int anInt1783;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	public int anInt1784;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
	public int anInt1785;

	@OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
	public int anInt1786;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
	public int anInt1787;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
	public int anInt1788;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method1425() {
		@Pc(2) int local2 = this.anInt1777;
		@Pc(14) Class2_Sub2_Sub9 local14 = this.aClass2_Sub2_Sub9_1.method1196();
		if (local14 == null) {
			this.anIntArray186 = null;
			this.anInt1787 = 0;
			this.anInt1786 = 0;
			this.anInt1784 = 0;
			this.anInt1777 = -1;
		} else {
			this.anInt1787 = local14.anInt1507;
			this.anInt1786 = local14.anInt1514 * 128;
			this.anIntArray186 = local14.anIntArray178;
			this.anInt1784 = local14.anInt1493;
			this.anInt1777 = local14.anInt1519;
		}
		if (this.anInt1777 != local2 && this.aClass2_Sub14_Sub1_2 != null) {
			Static128.aClass2_Sub14_Sub4_2.method2592(this.aClass2_Sub14_Sub1_2);
			this.aClass2_Sub14_Sub1_2 = null;
		}
	}
}
