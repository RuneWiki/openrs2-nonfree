import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class14_Sub3_Sub6 extends Class14_Sub3 {

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	private int anInt1278;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "I")
	private int anInt1279;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
	private int anInt1282;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	private int anInt1283;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
	private int anInt1287;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "I")
	private int anInt1280 = 0;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "I")
	private int anInt1275 = 0;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
	private int anInt1284 = 0;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1280 = arg0.method2502();
		} else if (arg1 == 1) {
			this.anInt1275 = (arg0.method2553() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1284 = (arg0.method2553() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int[][] local26 = this.method5997(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static294.anInt5657; local52++) {
				this.method1222(local38[local52], local30[local52], local34[local52]);
				this.anInt1282 += this.anInt1280;
				this.anInt1287 += this.anInt1275;
				this.anInt1278 += this.anInt1284;
				while (this.anInt1282 < 0) {
					this.anInt1282 += 4096;
				}
				while (this.anInt1282 > 4096) {
					this.anInt1282 -= 4096;
				}
				if (this.anInt1287 < 0) {
					this.anInt1287 = 0;
				}
				if (this.anInt1278 < 0) {
					this.anInt1278 = 0;
				}
				if (this.anInt1287 > 4096) {
					this.anInt1287 = 4096;
				}
				if (this.anInt1278 > 4096) {
					this.anInt1278 = 4096;
				}
				this.method1221(this.anInt1287, this.anInt1282, this.anInt1278);
				local42[local52] = this.anInt1271;
				local46[local52] = this.anInt1283;
				local50[local52] = this.anInt1279;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIII)V")
	private void method1221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg2 <= 2048 ? arg2 * (arg0 + 4096) >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local35 <= 0) {
			this.anInt1271 = this.anInt1283 = this.anInt1279 = arg2;
			return;
		}
		@Pc(44) int local44 = arg1 * 6;
		@Pc(52) int local52 = arg2 + arg2 - local35;
		@Pc(61) int local61 = (local35 - local52 << 12) / local35;
		@Pc(65) int local65 = local44 >> 12;
		@Pc(72) int local72 = local44 - (local65 << 12);
		@Pc(80) int local80 = local61 * local35 >> 12;
		@Pc(86) int local86 = local72 * local80 >> 12;
		@Pc(91) int local91 = local52 + local86;
		@Pc(96) int local96 = local35 - local86;
		if (local65 == 0) {
			this.anInt1283 = local91;
			this.anInt1271 = local35;
			this.anInt1279 = local52;
			return;
		}
		if (local65 == 1) {
			this.anInt1283 = local35;
			this.anInt1271 = local96;
			this.anInt1279 = local52;
			return;
		}
		if (local65 == 2) {
			this.anInt1271 = local52;
			this.anInt1283 = local35;
			this.anInt1279 = local91;
			return;
		}
		if (local65 == 3) {
			this.anInt1283 = local96;
			this.anInt1279 = local35;
			this.anInt1271 = local52;
			return;
		}
		if (local65 == 4) {
			this.anInt1271 = local91;
			this.anInt1283 = local52;
			this.anInt1279 = local35;
			return;
		}
		if (local65 == 5) {
			this.anInt1271 = local35;
			this.anInt1283 = local52;
			this.anInt1279 = local96;
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)V")
	private void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(27) int local27 = arg1 >= arg2 ? arg2 : arg1;
		@Pc(34) int local34 = local16 < arg0 ? arg0 : local16;
		@Pc(41) int local41 = arg0 < local27 ? arg0 : local27;
		@Pc(46) int local46 = local34 - local41;
		this.anInt1278 = (local41 + local34) / 2;
		if (local46 <= 0) {
			this.anInt1282 = 0;
		} else {
			@Pc(76) int local76 = (local34 - arg1 << 12) / local46;
			@Pc(85) int local85 = (local34 - arg2 << 12) / local46;
			@Pc(93) int local93 = (local34 - arg0 << 12) / local46;
			if (arg1 == local34) {
				this.anInt1282 = local41 == arg2 ? local93 + 20480 : 4096 - local85;
			} else if (local34 == arg2) {
				this.anInt1282 = arg0 == local41 ? local76 + 4096 : -local93 + 12288;
			} else {
				this.anInt1282 = local41 == arg1 ? local85 + 12288 : 20480 - local76;
			}
			this.anInt1282 /= 6;
		}
		if (this.anInt1278 > 0 && this.anInt1278 < 4096) {
			this.anInt1287 = (local46 << 12) / (this.anInt1278 > 2048 ? 8192 - (this.anInt1278 * 2) : this.anInt1278 * 2);
		} else {
			this.anInt1287 = 0;
		}
	}
}
