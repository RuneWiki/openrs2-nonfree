import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
	private int anInt5991;

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
	private int anInt5992;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
	private int anInt5993;

	@OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
	private int anInt5994;

	@OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
	private int anInt5995;

	@OriginalMember(owner = "client!wc", name = "kb", descriptor = "I")
	private int anInt5996;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
	private int anInt5983 = 0;

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
	private int anInt5979 = 0;

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
	private int anInt5984 = 0;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V")
	private void method4791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(36) int local36 = local25 >= arg0 ? local25 : arg0;
		@Pc(43) int local43 = arg2 < arg1 ? arg2 : arg1;
		@Pc(50) int local50 = local43 <= arg0 ? local43 : arg0;
		this.anInt5994 = (local36 + local50) / 2;
		@Pc(62) int local62 = local36 - local50;
		if (this.anInt5994 > 0 && this.anInt5994 < 4096) {
			this.anInt5995 = (local62 << 12) / (this.anInt5994 <= 2048 ? this.anInt5994 * 2 : 8192 - (this.anInt5994 * 2));
		} else {
			this.anInt5995 = 0;
		}
		if (local62 <= 0) {
			this.anInt5991 = 0;
			return;
		}
		@Pc(113) int local113 = (local36 - arg1 << 12) / local62;
		@Pc(122) int local122 = (local36 - arg0 << 12) / local62;
		@Pc(131) int local131 = (local36 - arg2 << 12) / local62;
		if (arg2 == local36) {
			this.anInt5991 = local50 == arg1 ? local122 + 20480 : -local113 + 4096;
		} else if (local36 == arg1) {
			this.anInt5991 = arg0 == local50 ? local131 + 4096 : -local122 + 12288;
		} else {
			this.anInt5991 = local50 == arg2 ? local113 + 12288 : -local131 + 20480;
		}
		this.anInt5991 /= 6;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5984 = arg0.method4255();
		} else if (arg1 == 1) {
			this.anInt5983 = (arg0.method4220() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5979 = (arg0.method4220() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(22) int[][] local22 = this.method4937(0, arg0);
			@Pc(26) int[] local26 = local11[1];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local11[2];
			@Pc(46) int[] local46 = local22[0];
			for (@Pc(48) int local48 = 0; local48 < Static114.anInt1359; local48++) {
				this.method4791(local30[local48], local38[local48], local46[local48]);
				for (this.anInt5991 += this.anInt5984; this.anInt5991 < 0; this.anInt5991 += 4096) {
				}
				while (this.anInt5991 > 4096) {
					this.anInt5991 -= 4096;
				}
				this.anInt5994 += this.anInt5979;
				if (this.anInt5994 < 0) {
					this.anInt5994 = 0;
				}
				if (this.anInt5994 > 4096) {
					this.anInt5994 = 4096;
				}
				this.anInt5995 += this.anInt5983;
				if (this.anInt5995 < 0) {
					this.anInt5995 = 0;
				}
				if (this.anInt5995 > 4096) {
					this.anInt5995 = 4096;
				}
				this.method4794(this.anInt5991, this.anInt5994, this.anInt5995);
				local34[local48] = this.anInt5993;
				local26[local48] = this.anInt5992;
				local42[local48] = this.anInt5996;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIII)V")
	private void method4794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local27 <= 0) {
			this.anInt5993 = this.anInt5992 = this.anInt5996 = arg1;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(42) int local42 = arg1 + arg1 - local27;
		@Pc(51) int local51 = (local27 - local42 << 12) / local27;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(64) int local64 = local36 - (local55 << 12);
		@Pc(70) int local70 = local51 * local27 >> 12;
		@Pc(76) int local76 = local64 * local70 >> 12;
		@Pc(80) int local80 = local76 + local42;
		@Pc(84) int local84 = local27 - local76;
		if (local55 == 0) {
			this.anInt5996 = local42;
			this.anInt5993 = local27;
			this.anInt5992 = local80;
		} else if (local55 == 1) {
			this.anInt5992 = local27;
			this.anInt5993 = local84;
			this.anInt5996 = local42;
		} else if (local55 == 2) {
			this.anInt5996 = local80;
			this.anInt5993 = local42;
			this.anInt5992 = local27;
		} else if (local55 == 3) {
			this.anInt5992 = local84;
			this.anInt5993 = local42;
			this.anInt5996 = local27;
		} else if (local55 == 4) {
			this.anInt5993 = local80;
			this.anInt5996 = local27;
			this.anInt5992 = local42;
		} else if (local55 == 5) {
			this.anInt5993 = local27;
			this.anInt5996 = local84;
			this.anInt5992 = local42;
		}
	}
}
