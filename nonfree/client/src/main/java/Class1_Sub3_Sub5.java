import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!c", name = "W", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
	private int anInt457 = 0;

	@OriginalMember(owner = "client!c", name = "T", descriptor = "I")
	private int anInt453 = 0;

	@OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	private void method331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg1 ? arg2 : arg1;
		@Pc(27) int local27 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(34) int local34 = local16 < arg0 ? arg0 : local16;
		@Pc(53) int local53 = local27 <= arg0 ? local27 : arg0;
		this.anInt464 = (local53 + local34) / 2;
		@Pc(66) int local66 = local34 - local53;
		if (this.anInt464 > 0 && this.anInt464 < 4096) {
			this.anInt467 = (local66 << 12) / (this.anInt464 <= 2048 ? this.anInt464 * 2 : 8192 - (this.anInt464 * 2));
		} else {
			this.anInt467 = 0;
		}
		if (local66 <= 0) {
			this.anInt455 = 0;
			return;
		}
		@Pc(115) int local115 = (local34 - arg2 << 12) / local66;
		@Pc(123) int local123 = (local34 - arg0 << 12) / local66;
		@Pc(132) int local132 = (local34 - arg1 << 12) / local66;
		if (arg1 == local34) {
			this.anInt455 = arg2 == local53 ? local123 + 20480 : -local115 + 4096;
		} else if (local34 == arg2) {
			this.anInt455 = arg0 == local53 ? local132 + 4096 : 12288 - local123;
		} else {
			this.anInt455 = arg1 == local53 ? local115 + 12288 : 20480 - local132;
		}
		this.anInt455 /= 6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt453 = arg1.method2167();
		} else if (arg0 == 1) {
			this.anInt468 = (arg1.method2155() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt457 = (arg1.method2155() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
	private void method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) int local23 = arg0 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : arg0 * (arg2 + 4096) >> 12;
		if (local23 <= 0) {
			this.anInt458 = this.anInt460 = this.anInt465 = arg0;
			return;
		}
		@Pc(36) int local36 = arg1 * 6;
		@Pc(42) int local42 = arg0 + arg0 - local23;
		@Pc(51) int local51 = (local23 - local42 << 12) / local23;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(62) int local62 = local36 - (local55 << 12);
		@Pc(70) int local70 = local51 * local23 >> 12;
		@Pc(76) int local76 = local62 * local70 >> 12;
		@Pc(80) int local80 = local23 - local76;
		@Pc(84) int local84 = local42 + local76;
		if (local55 == 0) {
			this.anInt458 = local23;
			this.anInt465 = local42;
			this.anInt460 = local84;
		} else if (local55 == 1) {
			this.anInt458 = local80;
			this.anInt465 = local42;
			this.anInt460 = local23;
		} else if (local55 == 2) {
			this.anInt465 = local84;
			this.anInt460 = local23;
			this.anInt458 = local42;
		} else if (local55 == 3) {
			this.anInt458 = local42;
			this.anInt460 = local80;
			this.anInt465 = local23;
		} else if (local55 == 4) {
			this.anInt460 = local42;
			this.anInt458 = local84;
			this.anInt465 = local23;
		} else if (local55 == 5) {
			this.anInt458 = local23;
			this.anInt460 = local42;
			this.anInt465 = local80;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(26) int[][] local26 = this.method3465(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local26[2];
			for (@Pc(52) int local52 = 0; local52 < Static76.anInt1531; local52++) {
				this.method331(local50[local52], local30[local52], local34[local52]);
				this.anInt467 += this.anInt468;
				if (this.anInt467 < 0) {
					this.anInt467 = 0;
				}
				this.anInt464 += this.anInt457;
				if (this.anInt464 < 0) {
					this.anInt464 = 0;
				}
				for (this.anInt455 += this.anInt453; this.anInt455 < 0; this.anInt455 += 4096) {
				}
				while (this.anInt455 > 4096) {
					this.anInt455 -= 4096;
				}
				if (this.anInt464 > 4096) {
					this.anInt464 = 4096;
				}
				if (this.anInt467 > 4096) {
					this.anInt467 = 4096;
				}
				this.method333(this.anInt464, this.anInt455, this.anInt467);
				local42[local52] = this.anInt458;
				local38[local52] = this.anInt460;
				local46[local52] = this.anInt465;
			}
		}
		return local16;
	}
}
