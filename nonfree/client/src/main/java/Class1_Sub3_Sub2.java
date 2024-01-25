import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!ar", name = "W", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
	private int anInt406 = 0;

	@OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
	private int anInt413 = 0;

	@OriginalMember(owner = "client!ar", name = "V", descriptor = "I")
	private int anInt416 = 0;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)V")
	private void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 > arg1 ? arg2 : arg1;
		@Pc(23) int local23 = local16 < arg0 ? arg0 : local16;
		@Pc(34) int local34 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(54) int local54 = local34 <= arg0 ? local34 : arg0;
		@Pc(58) int local58 = local23 - local54;
		this.anInt417 = (local54 + local23) / 2;
		if (this.anInt417 > 0 && this.anInt417 < 4096) {
			this.anInt415 = (local58 << 12) / (this.anInt417 > 2048 ? 8192 - (this.anInt417 * 2) : this.anInt417 * 2);
		} else {
			this.anInt415 = 0;
		}
		if (local58 <= 0) {
			this.anInt414 = 0;
			return;
		}
		@Pc(112) int local112 = (local23 - arg2 << 12) / local58;
		@Pc(121) int local121 = (local23 - arg1 << 12) / local58;
		@Pc(130) int local130 = (local23 - arg0 << 12) / local58;
		if (arg2 == local23) {
			this.anInt414 = arg1 == local54 ? local130 + 20480 : -local121 + 4096;
		} else if (arg1 == local23) {
			this.anInt414 = local54 == arg0 ? local112 + 4096 : -local130 + 12288;
		} else {
			this.anInt414 = local54 == arg2 ? local121 + 12288 : -local112 + 20480;
		}
		this.anInt414 /= 6;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBI)V")
	private void method365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : arg0 * (arg2 + 4096) >> 12;
		if (local34 <= 0) {
			this.anInt408 = this.anInt411 = this.anInt407 = arg0;
			return;
		}
		@Pc(43) int local43 = arg1 * 6;
		@Pc(50) int local50 = arg0 + arg0 - local34;
		@Pc(58) int local58 = (local34 - local50 << 12) / local34;
		@Pc(62) int local62 = local43 >> 12;
		@Pc(69) int local69 = local43 - (local62 << 12);
		@Pc(77) int local77 = local58 * local34 >> 12;
		@Pc(83) int local83 = local77 * local69 >> 12;
		@Pc(87) int local87 = local83 + local50;
		@Pc(92) int local92 = local34 - local83;
		if (local62 == 0) {
			this.anInt408 = local34;
			this.anInt411 = local87;
			this.anInt407 = local50;
			return;
		}
		if (local62 == 1) {
			this.anInt411 = local34;
			this.anInt408 = local92;
			this.anInt407 = local50;
			return;
		}
		if (local62 == 2) {
			this.anInt411 = local34;
			this.anInt408 = local50;
			this.anInt407 = local87;
			return;
		}
		if (local62 == 3) {
			this.anInt408 = local50;
			this.anInt411 = local92;
			this.anInt407 = local34;
			return;
		}
		if (local62 == 4) {
			this.anInt407 = local34;
			this.anInt411 = local50;
			this.anInt408 = local87;
			return;
		}
		if (local62 == 5) {
			this.anInt407 = local92;
			this.anInt408 = local34;
			this.anInt411 = local50;
			return;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(26) int[][] local26 = this.method6072(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static347.anInt5974; local52++) {
				this.method364(local38[local52], local34[local52], local30[local52]);
				this.anInt415 += this.anInt416;
				this.anInt417 += this.anInt413;
				for (this.anInt414 += this.anInt406; this.anInt414 < 0; this.anInt414 += 4096) {
				}
				if (this.anInt415 < 0) {
					this.anInt415 = 0;
				}
				while (this.anInt414 > 4096) {
					this.anInt414 -= 4096;
				}
				if (this.anInt417 < 0) {
					this.anInt417 = 0;
				}
				if (this.anInt415 > 4096) {
					this.anInt415 = 4096;
				}
				if (this.anInt417 > 4096) {
					this.anInt417 = 4096;
				}
				this.method365(this.anInt417, this.anInt414, this.anInt415);
				local42[local52] = this.anInt408;
				local46[local52] = this.anInt411;
				local50[local52] = this.anInt407;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt406 = arg0.method4100();
		} else if (arg1 == 1) {
			this.anInt416 = (arg0.method4112() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt413 = (arg0.method4112() << 12) / 100;
		}
	}
}
