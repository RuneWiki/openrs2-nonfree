import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public int anInt6217;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public int anInt6218;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!od;")
	public Class1_Sub31_Sub1 aClass1_Sub31_Sub1_2;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!n;")
	public Class10_Sub1_Sub2_Sub2 aClass10_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "Lclient!od;")
	public Class1_Sub31_Sub1 aClass1_Sub31_Sub1_3;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!cd;")
	public Class10_Sub1_Sub2_Sub1 aClass10_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "Lclient!ge;")
	public Class79 aClass79_1;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "Z")
	public boolean aBoolean514;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
	public int anInt6228;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
	public int anInt6234;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public int anInt6224 = 0;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public void method5364() {
		@Pc(16) int local16 = this.anInt6222;
		if (this.aClass79_1 != null) {
			@Pc(94) Class79 local94 = this.aClass79_1.method1567();
			if (local94 == null) {
				this.anInt6228 = 0;
				this.anInt6231 = 0;
				this.anInt6222 = -1;
				this.anInt6220 = 0;
				this.anInt6218 = 0;
				this.anIntArray625 = null;
			} else {
				this.anIntArray625 = local94.anIntArray157;
				this.anInt6220 = local94.anInt1878;
				this.anInt6231 = local94.anInt1855;
				this.anInt6218 = local94.anInt1896;
				this.anInt6222 = local94.anInt1873;
				this.anInt6228 = local94.anInt1874 * 128;
			}
		} else if (this.aClass10_Sub1_Sub2_Sub1_1 != null) {
			@Pc(27) int local27 = Static37.method782(this.aClass10_Sub1_Sub2_Sub1_1);
			if (local27 != local16) {
				this.anInt6222 = local27;
				@Pc(37) Class60 local37 = this.aClass10_Sub1_Sub2_Sub1_1.aClass60_1;
				if (local37.anIntArray109 != null) {
					local37 = local37.method1274();
				}
				if (local37 == null) {
					this.anInt6220 = this.anInt6228 = 0;
				} else {
					this.anInt6220 = local37.anInt1501;
					this.anInt6228 = local37.anInt1515 * 128;
				}
			}
		} else if (this.aClass10_Sub1_Sub2_Sub2_2 != null) {
			this.anInt6222 = Static94.method1470(this.aClass10_Sub1_Sub2_Sub2_2);
			this.anInt6228 = this.aClass10_Sub1_Sub2_Sub2_2.anInt4113 * 128;
			this.anInt6220 = this.aClass10_Sub1_Sub2_Sub2_2.anInt4109;
		}
		if (local16 != this.anInt6222 && this.aClass1_Sub31_Sub1_3 != null) {
			Static142.aClass1_Sub31_Sub2_1.method4444(this.aClass1_Sub31_Sub1_3);
			this.aClass1_Sub31_Sub1_3 = null;
		}
	}
}
