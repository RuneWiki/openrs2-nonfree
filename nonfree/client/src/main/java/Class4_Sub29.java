import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!ad;")
	public Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	public int anInt4299;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!bi;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!ad;")
	public Class4_Sub1_Sub1 aClass4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public int anInt4304;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public int anInt4306;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!fa;")
	public Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "I")
	public int anInt4309;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "I")
	public int anInt4313;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "Lclient!pn;")
	public Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!n", name = "M", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!n", name = "P", descriptor = "I")
	public int anInt4315;

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
	public int anInt4316 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public void method3871() {
		@Pc(14) int local14 = this.anInt4304;
		if (this.aClass18_1 != null) {
			@Pc(96) Class18 local96 = this.aClass18_1.method416();
			if (local96 == null) {
				this.anInt4309 = 0;
				this.anInt4302 = 0;
				this.anIntArray366 = null;
				this.anInt4308 = 0;
				this.anInt4304 = -1;
				this.anInt4307 = 0;
			} else {
				this.anInt4308 = local96.anInt517;
				this.anInt4309 = local96.anInt543 * 128;
				this.anInt4304 = local96.anInt502;
				this.anIntArray366 = local96.anIntArray16;
				this.anInt4307 = local96.anInt544;
				this.anInt4302 = local96.anInt540;
			}
		} else if (this.aClass8_Sub1_Sub2_Sub2_1 != null) {
			@Pc(25) int local25 = Static232.method4120(this.aClass8_Sub1_Sub2_Sub2_1);
			if (local14 != local25) {
				this.anInt4304 = local25;
				@Pc(39) Class141 local39 = this.aClass8_Sub1_Sub2_Sub2_1.aClass141_1;
				if (local39.anIntArray380 != null) {
					local39 = local39.method3908();
				}
				if (local39 == null) {
					this.anInt4307 = this.anInt4309 = 0;
				} else {
					this.anInt4307 = local39.anInt4372;
					this.anInt4309 = local39.anInt4390 * 128;
				}
			}
		} else if (this.aClass8_Sub1_Sub2_Sub1_2 != null) {
			this.anInt4304 = Static310.method5113(this.aClass8_Sub1_Sub2_Sub1_2);
			this.anInt4309 = this.aClass8_Sub1_Sub2_Sub1_2.anInt2365 * 128;
			this.anInt4307 = this.aClass8_Sub1_Sub2_Sub1_2.anInt2374;
		}
		if (this.anInt4304 != local14 && this.aClass4_Sub1_Sub1_1 != null) {
			Static196.aClass4_Sub1_Sub3_3.method3510(this.aClass4_Sub1_Sub1_1);
			this.aClass4_Sub1_Sub1_1 = null;
		}
	}
}
