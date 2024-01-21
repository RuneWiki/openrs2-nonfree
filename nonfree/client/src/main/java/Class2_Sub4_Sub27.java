import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub4_Sub27 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
	private int anInt3264;

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
	private int anInt3266;

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
	private int anInt3267;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	private int anInt3271;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	private int anInt3268 = 0;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
	private int anInt3265 = 0;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
	private int anInt3280 = 0;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	private void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(29) int local29 = local16 >= arg2 ? local16 : arg2;
		@Pc(40) int local40 = arg0 > arg1 ? arg1 : arg0;
		@Pc(47) int local47 = local40 > arg2 ? arg2 : local40;
		@Pc(52) int local52 = local29 - local47;
		if (local52 > 0) {
			@Pc(63) int local63 = (local29 - arg1 << 12) / local52;
			@Pc(72) int local72 = (local29 - arg0 << 12) / local52;
			@Pc(81) int local81 = (local29 - arg2 << 12) / local52;
			if (local29 == arg1) {
				this.anInt3264 = local47 == arg0 ? local81 + 20480 : -local72 + 4096;
			} else if (arg0 == local29) {
				this.anInt3264 = arg2 == local47 ? local63 + 4096 : -local81 + 12288;
			} else {
				this.anInt3264 = local47 == arg1 ? local72 + 12288 : -local63 + 20480;
			}
			this.anInt3264 /= 6;
		} else {
			this.anInt3264 = 0;
		}
		this.anInt3267 = (local47 + local29) / 2;
		if (this.anInt3267 > 0 && this.anInt3267 < 4096) {
			this.anInt3275 = (local52 << 12) / (this.anInt3267 <= 2048 ? this.anInt3267 * 2 : 8192 - (this.anInt3267 * 2));
		} else {
			this.anInt3275 = 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[][] local26 = this.method3130(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static118.anInt2608; local52++) {
				this.method2278(local30[local52], local34[local52], local38[local52]);
				this.anInt3264 += this.anInt3268;
				this.anInt3275 += this.anInt3280;
				this.anInt3267 += this.anInt3265;
				while (this.anInt3264 < 0) {
					this.anInt3264 += 4096;
				}
				while (this.anInt3264 > 4096) {
					this.anInt3264 -= 4096;
				}
				if (this.anInt3267 < 0) {
					this.anInt3267 = 0;
				}
				if (this.anInt3275 < 0) {
					this.anInt3275 = 0;
				}
				if (this.anInt3267 > 4096) {
					this.anInt3267 = 4096;
				}
				if (this.anInt3275 > 4096) {
					this.anInt3275 = 4096;
				}
				this.method2282(this.anInt3264, this.anInt3267, this.anInt3275);
				local42[local52] = this.anInt3266;
				local46[local52] = this.anInt3271;
				local50[local52] = this.anInt3276;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
	private void method2282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local30 <= 0) {
			this.anInt3266 = this.anInt3271 = this.anInt3276 = arg1;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local30;
		@Pc(52) int local52 = (local30 - local43 << 12) / local30;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local30 * local52 >> 12;
		@Pc(77) int local77 = local71 * local63 >> 12;
		@Pc(81) int local81 = local30 - local77;
		@Pc(86) int local86 = local43 + local77;
		if (local56 == 0) {
			this.anInt3266 = local30;
			this.anInt3276 = local43;
			this.anInt3271 = local86;
		} else if (local56 == 1) {
			this.anInt3271 = local30;
			this.anInt3266 = local81;
			this.anInt3276 = local43;
		} else if (local56 == 2) {
			this.anInt3276 = local86;
			this.anInt3266 = local43;
			this.anInt3271 = local30;
		} else if (local56 == 3) {
			this.anInt3271 = local81;
			this.anInt3276 = local30;
			this.anInt3266 = local43;
		} else if (local56 == 4) {
			this.anInt3271 = local43;
			this.anInt3266 = local86;
			this.anInt3276 = local30;
		} else if (local56 == 5) {
			this.anInt3271 = local43;
			this.anInt3276 = local81;
			this.anInt3266 = local30;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3268 = arg1.method1568();
		} else if (arg0 == 1) {
			this.anInt3280 = (arg1.method1552() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3265 = (arg1.method1552() << 12) / 100;
		}
	}
}
