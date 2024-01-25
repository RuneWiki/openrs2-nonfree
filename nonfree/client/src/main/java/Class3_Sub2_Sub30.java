import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	private int anInt8401;

	@OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
	private int anInt8403;

	@OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
	private int anInt8408;

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	private int anInt8411;

	@OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
	private int anInt8415;

	@OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
	private int anInt8416;

	@OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
	private int anInt8404 = 0;

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
	private int anInt8407 = 0;

	@OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
	private int anInt8413 = 0;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8407 = arg0.method4869();
		} else if (arg1 == 1) {
			this.anInt8404 = (arg0.method4861() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt8413 = (arg0.method4861() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)V")
	private void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25 = arg2 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local25 <= 0) {
			this.anInt8416 = this.anInt8408 = this.anInt8411 = arg2;
			return;
		}
		@Pc(40) int local40 = arg1 * 6;
		@Pc(47) int local47 = arg2 + arg2 - local25;
		@Pc(56) int local56 = (local25 - local47 << 12) / local25;
		@Pc(60) int local60 = local40 >> 12;
		@Pc(66) int local66 = local40 - (local60 << 12);
		@Pc(74) int local74 = local25 * local56 >> 12;
		@Pc(80) int local80 = local74 * local66 >> 12;
		@Pc(84) int local84 = local80 + local47;
		@Pc(89) int local89 = local25 - local80;
		if (local60 == 0) {
			this.anInt8411 = local47;
			this.anInt8408 = local84;
			this.anInt8416 = local25;
			return;
		}
		if (local60 == 1) {
			this.anInt8416 = local89;
			this.anInt8411 = local47;
			this.anInt8408 = local25;
			return;
		}
		if (local60 == 2) {
			this.anInt8408 = local25;
			this.anInt8416 = local47;
			this.anInt8411 = local84;
			return;
		}
		if (local60 == 3) {
			this.anInt8411 = local25;
			this.anInt8416 = local47;
			this.anInt8408 = local89;
			return;
		}
		if (local60 == 4) {
			this.anInt8411 = local25;
			this.anInt8408 = local47;
			this.anInt8416 = local84;
			return;
		}
		if (local60 == 5) {
			this.anInt8416 = local25;
			this.anInt8411 = local89;
			this.anInt8408 = local47;
			return;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIII)V")
	private void method7125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg0 > arg2 ? arg0 : arg2;
		@Pc(36) int local36 = local25 < arg1 ? arg1 : local25;
		@Pc(47) int local47 = arg2 > arg0 ? arg0 : arg2;
		@Pc(58) int local58 = local47 > arg1 ? arg1 : local47;
		@Pc(62) int local62 = local36 - local58;
		this.anInt8415 = (local36 + local58) / 2;
		if (local62 > 0) {
			@Pc(82) int local82 = (local36 - arg0 << 12) / local62;
			@Pc(90) int local90 = (local36 - arg2 << 12) / local62;
			@Pc(98) int local98 = (local36 - arg1 << 12) / local62;
			if (arg0 == local36) {
				this.anInt8403 = arg2 == local58 ? local98 + 20480 : -local90 + 4096;
			} else if (arg2 == local36) {
				this.anInt8403 = arg1 == local58 ? local82 + 4096 : -local98 + 12288;
			} else {
				this.anInt8403 = local58 == arg0 ? local90 + 12288 : -local82 + 20480;
			}
			this.anInt8403 /= 6;
		} else {
			this.anInt8403 = 0;
		}
		if (this.anInt8415 > 0 && this.anInt8415 < 4096) {
			this.anInt8401 = (local62 << 12) / (this.anInt8415 > 2048 ? 8192 - (this.anInt8415 * 2) : this.anInt8415 * 2);
		} else {
			this.anInt8401 = 0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[][] local26 = this.method8718(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static30.anInt908; local52++) {
				this.method7125(local30[local52], local38[local52], local34[local52]);
				this.anInt8415 += this.anInt8413;
				this.anInt8403 += this.anInt8407;
				this.anInt8401 += this.anInt8404;
				while (this.anInt8403 < 0) {
					this.anInt8403 += 4096;
				}
				if (this.anInt8401 < 0) {
					this.anInt8401 = 0;
				}
				while (this.anInt8403 > 4096) {
					this.anInt8403 -= 4096;
				}
				if (this.anInt8415 < 0) {
					this.anInt8415 = 0;
				}
				if (this.anInt8401 > 4096) {
					this.anInt8401 = 4096;
				}
				if (this.anInt8415 > 4096) {
					this.anInt8415 = 4096;
				}
				this.method7124(this.anInt8401, this.anInt8403, this.anInt8415);
				local42[local52] = this.anInt8416;
				local46[local52] = this.anInt8408;
				local50[local52] = this.anInt8411;
			}
		}
		return local16;
	}
}
