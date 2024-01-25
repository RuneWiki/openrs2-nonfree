import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
	public int[] anIntArray643;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public int anInt7338;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!rb;")
	public Class4_Sub18_Sub2 aClass4_Sub18_Sub2_2;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	public int anInt7339;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt7341;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public int anInt7342;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!rk;")
	public Class6_Sub2_Sub1_Sub2 aClass6_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public int anInt7343;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	public int anInt7344;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public int anInt7346;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	public int anInt7347;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!eu;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!bp;")
	public Class6_Sub2_Sub1_Sub1 aClass6_Sub2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public int anInt7348;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "Lclient!rb;")
	public Class4_Sub18_Sub2 aClass4_Sub18_Sub2_3;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
	public int anInt7349;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public int anInt7352;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public int anInt7340 = 0;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public void method5665() {
		@Pc(8) int local8 = this.anInt7349;
		if (this.aClass71_1 != null) {
			@Pc(17) Class71 local17 = this.aClass71_1.method1626(Static155.aClass149_1);
			if (local17 == null) {
				this.anInt7338 = 0;
				this.anInt7347 = 0;
				this.anIntArray643 = null;
				this.anInt7343 = 0;
				this.anInt7346 = 0;
				this.anInt7349 = -1;
			} else {
				this.anInt7346 = local17.anInt2157;
				this.anInt7343 = local17.anInt2160;
				this.anInt7338 = local17.anInt2178;
				this.anInt7347 = local17.anInt2204 << 7;
				this.anInt7349 = local17.anInt2185;
				this.anIntArray643 = local17.anIntArray139;
			}
		} else if (this.aClass6_Sub2_Sub1_Sub2_1 != null) {
			@Pc(75) int local75 = Static217.method3084(this.aClass6_Sub2_Sub1_Sub2_1);
			if (local8 != local75) {
				this.anInt7349 = local75;
				@Pc(89) Class243 local89 = this.aClass6_Sub2_Sub1_Sub2_1.aClass243_1;
				if (local89.anIntArray613 != null) {
					local89 = local89.method5337(Static155.aClass149_1);
				}
				if (local89 == null) {
					this.anInt7343 = this.anInt7347 = 0;
				} else {
					this.anInt7347 = local89.anInt6881 << 7;
					this.anInt7343 = local89.anInt6897;
				}
			}
		} else if (this.aClass6_Sub2_Sub1_Sub1_4 != null) {
			this.anInt7349 = Static328.method4469(this.aClass6_Sub2_Sub1_Sub1_4);
			this.anInt7347 = this.aClass6_Sub2_Sub1_Sub1_4.anInt978 << 7;
			this.anInt7343 = this.aClass6_Sub2_Sub1_Sub1_4.anInt982;
		}
		if (local8 != this.anInt7349 && this.aClass4_Sub18_Sub2_3 != null) {
			Static393.aClass4_Sub18_Sub1_1.method2789(this.aClass4_Sub18_Sub2_3);
			this.aClass4_Sub18_Sub2_3 = null;
		}
	}
}
