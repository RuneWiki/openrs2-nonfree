import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class14_Sub28 extends Class14 {

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!rr;")
	public Class14_Sub19_Sub3 aClass14_Sub19_Sub3_1;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	public int anInt5298;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	public int anInt5300;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	public int anInt5301;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	public int anInt5304;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	public int anInt5305;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "Lclient!fa;")
	public Class59 aClass59_1;

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
	public int anInt5309;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "Lclient!tm;")
	public Class10_Sub3_Sub3_Sub2 aClass10_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
	public int anInt5313;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
	public boolean aBoolean350;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "Lclient!rr;")
	public Class14_Sub19_Sub3 aClass14_Sub19_Sub3_2;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
	public int anInt5315;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "Lclient!sd;")
	public Class10_Sub3_Sub3_Sub1 aClass10_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public int anInt5297 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
	public void method4729() {
		@Pc(8) int local8 = this.anInt5308;
		if (this.aClass59_1 != null) {
			@Pc(90) Class59 local90 = this.aClass59_1.method1977();
			if (local90 == null) {
				this.anInt5301 = 0;
				this.anInt5308 = -1;
				this.anInt5309 = 0;
				this.anInt5313 = 0;
				this.anIntArray480 = null;
				this.anInt5305 = 0;
			} else {
				this.anIntArray480 = local90.anIntArray173;
				this.anInt5313 = local90.anInt1915 * 128;
				this.anInt5308 = local90.anInt1953;
				this.anInt5309 = local90.anInt1919;
				this.anInt5301 = local90.anInt1914;
				this.anInt5305 = local90.anInt1957;
			}
		} else if (this.aClass10_Sub3_Sub3_Sub1_1 != null) {
			@Pc(19) int local19 = Static158.method3092(this.aClass10_Sub3_Sub3_Sub1_1);
			if (local19 != local8) {
				this.anInt5308 = local19;
				@Pc(33) Class192 local33 = this.aClass10_Sub3_Sub3_Sub1_1.aClass192_1;
				if (local33.anIntArray525 != null) {
					local33 = local33.method5281();
				}
				if (local33 == null) {
					this.anInt5309 = this.anInt5313 = 0;
				} else {
					this.anInt5313 = local33.anInt5783 * 128;
					this.anInt5309 = local33.anInt5786;
				}
			}
		} else if (this.aClass10_Sub3_Sub3_Sub2_2 != null) {
			this.anInt5308 = Static220.method3963(this.aClass10_Sub3_Sub3_Sub2_2);
			this.anInt5313 = this.aClass10_Sub3_Sub3_Sub2_2.anInt6020 * 128;
			this.anInt5309 = this.aClass10_Sub3_Sub3_Sub2_2.anInt6011;
		}
		if (this.anInt5308 != local8 && this.aClass14_Sub19_Sub3_2 != null) {
			Static49.aClass14_Sub19_Sub2_1.method4245(this.aClass14_Sub19_Sub3_2);
			this.aClass14_Sub19_Sub3_2 = null;
		}
	}
}
