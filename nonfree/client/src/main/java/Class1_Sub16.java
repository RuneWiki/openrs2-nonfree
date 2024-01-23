import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public int anInt1892;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!gj;")
	public Class20_Sub3_Sub1 aClass20_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Lclient!ri;")
	public Class1_Sub12_Sub4 aClass1_Sub12_Sub4_1;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Z")
	public boolean aBoolean84;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public int anInt1897;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
	public int anInt1898;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	public int anInt1899;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	public int anInt1901;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Lclient!db;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "Lclient!ri;")
	public Class1_Sub12_Sub4 aClass1_Sub12_Sub4_2;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "Lclient!nk;")
	public Class20_Sub3_Sub2 aClass20_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt1891 = 0;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method1466() {
		@Pc(8) int local8 = this.anInt1906;
		if (this.aClass18_1 != null) {
			@Pc(16) Class18 local16 = this.aClass18_1.method599();
			if (local16 == null) {
				this.anInt1906 = -1;
				this.anIntArray170 = null;
				this.anInt1898 = 0;
				this.anInt1892 = 0;
				this.anInt1899 = 0;
			} else {
				this.anIntArray170 = local16.anIntArray68;
				this.anInt1898 = local16.anInt809;
				this.anInt1892 = local16.anInt787;
				this.anInt1906 = local16.anInt823;
				this.anInt1899 = local16.anInt791 * 128;
			}
		} else if (this.aClass20_Sub3_Sub2_1 != null) {
			@Pc(87) int local87 = Static118.method1868(this.aClass20_Sub3_Sub2_1);
			if (local87 != local8) {
				@Pc(94) Class105 local94 = this.aClass20_Sub3_Sub2_1.aClass105_1;
				this.anInt1906 = local87;
				if (local94.anIntArray443 != null) {
					local94 = local94.method3127();
				}
				if (local94 == null) {
					this.anInt1899 = 0;
				} else {
					this.anInt1899 = local94.anInt3910 * 128;
				}
			}
		} else if (this.aClass20_Sub3_Sub1_1 != null) {
			this.anInt1906 = Static191.method3133(this.aClass20_Sub3_Sub1_1);
			this.anInt1899 = this.aClass20_Sub3_Sub1_1.anInt1507 * 128;
		}
		if (local8 != this.anInt1906 && this.aClass1_Sub12_Sub4_2 != null) {
			Static226.aClass1_Sub12_Sub1_2.method894(this.aClass1_Sub12_Sub4_2);
			this.aClass1_Sub12_Sub4_2 = null;
		}
	}
}
