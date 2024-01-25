import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class4_Sub4_Sub32 extends Class4_Sub4 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
	private int anInt5879;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
	private int anInt5889 = 0;

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
	private int anInt5885 = 0;

	@OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
	private int anInt5895 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
	private void method4962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 > arg2 ? arg1 : arg2;
		@Pc(23) int local23 = arg2 > arg1 ? arg1 : arg2;
		@Pc(38) int local38 = arg0 > local12 ? arg0 : local12;
		@Pc(45) int local45 = local23 > arg0 ? arg0 : local23;
		this.anInt5892 = (local45 + local38) / 2;
		@Pc(58) int local58 = local38 - local45;
		if (local58 > 0) {
			@Pc(72) int local72 = (local38 - arg1 << 12) / local58;
			@Pc(81) int local81 = (local38 - arg2 << 12) / local58;
			@Pc(90) int local90 = (local38 - arg0 << 12) / local58;
			if (arg1 == local38) {
				this.anInt5881 = local45 == arg2 ? local90 + 20480 : -local81 + 4096;
			} else if (arg2 == local38) {
				this.anInt5881 = arg0 == local45 ? local72 + 4096 : -local90 + 12288;
			} else {
				this.anInt5881 = arg1 == local45 ? local81 + 12288 : -local72 + 20480;
			}
			this.anInt5881 /= 6;
		} else {
			this.anInt5881 = 0;
		}
		if (this.anInt5892 > 0 && this.anInt5892 < 4096) {
			this.anInt5884 = (local58 << 12) / (this.anInt5892 <= 2048 ? this.anInt5892 * 2 : 8192 - (this.anInt5892 * 2));
		} else {
			this.anInt5884 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(30) int[][] local30 = this.method5384(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static124.anInt3576; local56++) {
				this.method4962(local42[local56], local34[local56], local38[local56]);
				this.anInt5884 += this.anInt5889;
				this.anInt5881 += this.anInt5895;
				this.anInt5892 += this.anInt5885;
				while (this.anInt5881 < 0) {
					this.anInt5881 += 4096;
				}
				while (this.anInt5881 > 4096) {
					this.anInt5881 -= 4096;
				}
				if (this.anInt5884 < 0) {
					this.anInt5884 = 0;
				}
				if (this.anInt5892 < 0) {
					this.anInt5892 = 0;
				}
				if (this.anInt5884 > 4096) {
					this.anInt5884 = 4096;
				}
				if (this.anInt5892 > 4096) {
					this.anInt5892 = 4096;
				}
				this.method4963(this.anInt5892, this.anInt5884, this.anInt5881);
				local46[local56] = this.anInt5879;
				local50[local56] = this.anInt5890;
				local54[local56] = this.anInt5891;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5895 = arg1.method2396();
		} else if (arg0 == 1) {
			this.anInt5889 = (arg1.method2393() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5885 = (arg1.method2393() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
	private void method4963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg1 + arg0 - (arg1 * arg0 >> 12);
		if (local28 <= 0) {
			this.anInt5879 = this.anInt5890 = this.anInt5891 = arg0;
			return;
		}
		@Pc(34) int local34 = arg2 * 6;
		@Pc(41) int local41 = arg0 + arg0 - local28;
		@Pc(50) int local50 = (local28 - local41 << 12) / local28;
		@Pc(54) int local54 = local34 >> 12;
		@Pc(61) int local61 = local34 - (local54 << 12);
		@Pc(69) int local69 = local28 * local50 >> 12;
		@Pc(75) int local75 = local61 * local69 >> 12;
		@Pc(79) int local79 = local41 + local75;
		@Pc(84) int local84 = local28 - local75;
		if (local54 == 0) {
			this.anInt5891 = local41;
			this.anInt5890 = local79;
			this.anInt5879 = local28;
			return;
		}
		if (local54 == 1) {
			this.anInt5879 = local84;
			this.anInt5891 = local41;
			this.anInt5890 = local28;
			return;
		}
		if (local54 == 2) {
			this.anInt5890 = local28;
			this.anInt5879 = local41;
			this.anInt5891 = local79;
			return;
		}
		if (local54 == 3) {
			this.anInt5891 = local28;
			this.anInt5879 = local41;
			this.anInt5890 = local84;
			return;
		}
		if (local54 == 4) {
			this.anInt5891 = local28;
			this.anInt5879 = local79;
			this.anInt5890 = local41;
			return;
		}
		if (local54 == 5) {
			this.anInt5879 = local28;
			this.anInt5891 = local84;
			this.anInt5890 = local41;
			return;
		}
	}
}
