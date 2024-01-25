import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class1_Sub5_Sub28 extends Class1_Sub5 {

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
	private int anInt5532;

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
	private int anInt5536;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
	private int anInt5540;

	@OriginalMember(owner = "client!rp", name = "Z", descriptor = "I")
	private int anInt5544;

	@OriginalMember(owner = "client!rp", name = "bb", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!rp", name = "eb", descriptor = "I")
	private int anInt5549;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
	private int anInt5530 = 0;

	@OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
	private int anInt5538 = 0;

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
	private int anInt5535 = 0;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5535 = arg0.method5691();
		} else if (arg1 == 1) {
			this.anInt5530 = (arg0.method5721() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5538 = (arg0.method5721() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[][] local26 = this.method5807(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static75.anInt1566; local52++) {
				this.method4844(local30[local52], local34[local52], local38[local52]);
				this.anInt5544 += this.anInt5538;
				this.anInt5546 += this.anInt5535;
				this.anInt5540 += this.anInt5530;
				while (this.anInt5546 < 0) {
					this.anInt5546 += 4096;
				}
				while (this.anInt5546 > 4096) {
					this.anInt5546 -= 4096;
				}
				if (this.anInt5540 < 0) {
					this.anInt5540 = 0;
				}
				if (this.anInt5540 > 4096) {
					this.anInt5540 = 4096;
				}
				if (this.anInt5544 < 0) {
					this.anInt5544 = 0;
				}
				if (this.anInt5544 > 4096) {
					this.anInt5544 = 4096;
				}
				this.method4845(this.anInt5544, this.anInt5540, this.anInt5546);
				local42[local52] = this.anInt5536;
				local46[local52] = this.anInt5532;
				local50[local52] = this.anInt5549;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIII)V")
	private void method4844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg1 >= arg0 ? arg1 : arg0;
		@Pc(31) int local31 = arg1 <= arg0 ? arg1 : arg0;
		@Pc(42) int local42 = arg2 <= local20 ? local20 : arg2;
		@Pc(49) int local49 = local31 <= arg2 ? local31 : arg2;
		this.anInt5544 = (local42 + local49) / 2;
		@Pc(60) int local60 = local42 - local49;
		if (this.anInt5544 > 0 && this.anInt5544 < 4096) {
			this.anInt5540 = (local60 << 12) / (this.anInt5544 <= 2048 ? this.anInt5544 * 2 : 8192 - (this.anInt5544 * 2));
		} else {
			this.anInt5540 = 0;
		}
		if (local60 <= 0) {
			this.anInt5546 = 0;
			return;
		}
		@Pc(115) int local115 = (local42 - arg0 << 12) / local60;
		@Pc(124) int local124 = (local42 - arg1 << 12) / local60;
		@Pc(133) int local133 = (local42 - arg2 << 12) / local60;
		if (arg0 == local42) {
			this.anInt5546 = arg1 == local49 ? local133 + 20480 : -local124 + 4096;
		} else if (arg1 == local42) {
			this.anInt5546 = arg2 == local49 ? local115 + 4096 : 12288 - local133;
		} else {
			this.anInt5546 = arg0 == local49 ? local124 + 12288 : -local115 + 20480;
		}
		this.anInt5546 /= 6;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIZ)V")
	private void method4845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = arg0 <= 2048 ? arg0 * (arg1 + 4096) >> 12 : arg1 + arg0 - (arg1 * arg0 >> 12);
		if (local26 <= 0) {
			this.anInt5536 = this.anInt5532 = this.anInt5549 = arg0;
			return;
		}
		@Pc(35) int local35 = arg2 * 6;
		@Pc(42) int local42 = arg0 + arg0 - local26;
		@Pc(51) int local51 = (local26 - local42 << 12) / local26;
		@Pc(55) int local55 = local35 >> 12;
		@Pc(62) int local62 = local35 - (local55 << 12);
		@Pc(70) int local70 = local26 * local51 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local76 + local42;
		@Pc(85) int local85 = local26 - local76;
		if (local55 == 0) {
			this.anInt5532 = local80;
			this.anInt5536 = local26;
			this.anInt5549 = local42;
		} else if (local55 == 1) {
			this.anInt5536 = local85;
			this.anInt5532 = local26;
			this.anInt5549 = local42;
		} else if (local55 == 2) {
			this.anInt5532 = local26;
			this.anInt5536 = local42;
			this.anInt5549 = local80;
		} else if (local55 == 3) {
			this.anInt5532 = local85;
			this.anInt5549 = local26;
			this.anInt5536 = local42;
		} else if (local55 == 4) {
			this.anInt5532 = local42;
			this.anInt5549 = local26;
			this.anInt5536 = local80;
		} else if (local55 == 5) {
			this.anInt5532 = local42;
			this.anInt5549 = local85;
			this.anInt5536 = local26;
		}
	}
}
