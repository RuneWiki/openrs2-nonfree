import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
	public int anInt4855;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	public int anInt4856;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!ak;")
	public Class9_Sub1_Sub2 aClass9_Sub1_Sub2_1;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public int anInt4857;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public int anInt4858;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
	public int anInt4859;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!ai;")
	public Class9_Sub1_Sub1 aClass9_Sub1_Sub1_2;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	public int anInt4863;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "Z")
	public boolean aBoolean252;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	public int anInt4865;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public int anInt4867;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!de;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	public int anInt4868;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	public int anInt4869;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Lclient!fi;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
	public int anInt4870;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!fi;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_3;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
	public int anInt4861 = 0;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	public void method3671() {
		@Pc(8) int local8 = this.anInt4858;
		if (this.aClass31_1 != null) {
			@Pc(20) Class31 local20 = this.aClass31_1.method935();
			if (local20 == null) {
				this.anInt4867 = 0;
				this.anInt4855 = 0;
				this.anInt4868 = 0;
				this.anIntArray426 = null;
				this.anInt4870 = 0;
				this.anInt4858 = -1;
			} else {
				this.anInt4870 = local20.anInt1325 * 128;
				this.anInt4868 = local20.anInt1312;
				this.anIntArray426 = local20.anIntArray97;
				this.anInt4867 = local20.anInt1328;
				this.anInt4858 = local20.anInt1302;
				this.anInt4855 = local20.anInt1327;
			}
		} else if (this.aClass9_Sub1_Sub2_1 != null) {
			@Pc(101) int local101 = Static136.method2538(this.aClass9_Sub1_Sub2_1);
			if (local101 != local8) {
				this.anInt4858 = local101;
				@Pc(115) Class45 local115 = this.aClass9_Sub1_Sub2_1.aClass45_1;
				if (local115.anIntArray154 != null) {
					local115 = local115.method1460();
				}
				if (local115 == null) {
					this.anInt4867 = this.anInt4870 = 0;
				} else {
					this.anInt4867 = local115.anInt2025;
					this.anInt4870 = local115.anInt2026 * 128;
				}
			}
		} else if (this.aClass9_Sub1_Sub1_2 != null) {
			this.anInt4858 = Static217.method3554(this.aClass9_Sub1_Sub1_2);
			this.anInt4870 = this.aClass9_Sub1_Sub1_2.anInt367 * 128;
			this.anInt4867 = this.aClass9_Sub1_Sub1_2.anInt380;
		}
		if (this.anInt4858 != local8 && this.aClass1_Sub4_Sub3_2 != null) {
			Static24.aClass1_Sub4_Sub4_1.method3081(this.aClass1_Sub4_Sub3_2);
			this.aClass1_Sub4_Sub3_2 = null;
		}
	}
}
