import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	public int anInt1919;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!pc;")
	public Class1_Sub9_Sub4 aClass1_Sub9_Sub4_1;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Lclient!pc;")
	public Class1_Sub9_Sub4 aClass1_Sub9_Sub4_2;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Lclient!nd;")
	public Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
	public int anInt1923;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
	public int anInt1924;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public int anInt1926;

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
	public int anInt1928;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	public int anInt1929;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
	public int anInt1931;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
	public int anInt1932;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public void method1355() {
		@Pc(12) int local12 = this.anInt1923;
		@Pc(17) Class1_Sub1_Sub9 local17 = this.aClass1_Sub1_Sub9_1.method1440();
		if (local17 == null) {
			this.anIntArray294 = null;
			this.anInt1919 = 0;
			this.anInt1930 = 0;
			this.anInt1924 = 0;
			this.anInt1923 = -1;
		} else {
			this.anInt1923 = local17.anInt2056;
			this.anInt1919 = local17.anInt2094;
			this.anIntArray294 = local17.anIntArray339;
			this.anInt1924 = local17.anInt2060;
			this.anInt1930 = local17.anInt2086 * 128;
		}
		if (this.anInt1923 != local12 && this.aClass1_Sub9_Sub4_2 != null) {
			Static73.aClass1_Sub9_Sub2_3.method1012(this.aClass1_Sub9_Sub4_2);
			this.aClass1_Sub9_Sub4_2 = null;
		}
	}
}
