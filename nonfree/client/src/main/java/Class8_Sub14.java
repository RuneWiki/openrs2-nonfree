import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class8_Sub14 extends Class8 {

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!kb;")
	public Class8_Sub11_Sub2 aClass8_Sub11_Sub2_1;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	public int anInt1868;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!cd;")
	public Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "Lclient!kb;")
	public Class8_Sub11_Sub2 aClass8_Sub11_Sub2_2;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public int anInt1879;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
	public int anInt1880;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
	public int anInt1882;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public void method1137() {
		@Pc(6) int local6 = this.anInt1873;
		@Pc(15) Class8_Sub1_Sub4 local15 = this.aClass8_Sub1_Sub4_1.method263();
		if (local15 == null) {
			this.anInt1866 = 0;
			this.anInt1875 = 0;
			this.anInt1873 = -1;
			this.anIntArray243 = null;
			this.anInt1879 = 0;
		} else {
			this.anInt1879 = local15.anInt416 * 128;
			this.anIntArray243 = local15.anIntArray58;
			this.anInt1875 = local15.anInt432;
			this.anInt1866 = local15.anInt415;
			this.anInt1873 = local15.anInt429;
		}
		if (local6 != this.anInt1873 && this.aClass8_Sub11_Sub2_1 != null) {
			Static104.aClass8_Sub11_Sub4_1.method1927(this.aClass8_Sub11_Sub2_1);
			this.aClass8_Sub11_Sub2_1 = null;
		}
	}
}
