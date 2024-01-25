import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class6_Sub4_Sub27 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt6872;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt6873;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	private int anInt6879;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	private int anInt6882;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	private int anInt6884;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
	private int anInt6885;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	private int anInt6871 = 0;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	private int anInt6880 = 0;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIZ)V")
	private void method5906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) int local30 = arg1 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : arg1 * (4096 - -arg0) >> 12;
		if (local30 <= 0) {
			this.anInt6882 = this.anInt6873 = this.anInt6885 = arg1;
			return;
		}
		@Pc(46) int local46 = arg2 * 6;
		@Pc(53) int local53 = arg1 + arg1 - local30;
		@Pc(62) int local62 = (local30 - local53 << 12) / local30;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local30 * local62 >> 12;
		@Pc(87) int local87 = local73 * local81 >> 12;
		@Pc(91) int local91 = local87 + local53;
		@Pc(96) int local96 = local30 - local87;
		if (local66 == 0) {
			this.anInt6882 = local30;
			this.anInt6873 = local91;
			this.anInt6885 = local53;
		} else if (local66 == 1) {
			this.anInt6882 = local96;
			this.anInt6873 = local30;
			this.anInt6885 = local53;
		} else if (local66 == 2) {
			this.anInt6885 = local91;
			this.anInt6873 = local30;
			this.anInt6882 = local53;
		} else if (local66 == 3) {
			this.anInt6885 = local30;
			this.anInt6873 = local96;
			this.anInt6882 = local53;
		} else if (local66 == 4) {
			this.anInt6873 = local53;
			this.anInt6882 = local91;
			this.anInt6885 = local30;
		} else if (local66 == 5) {
			this.anInt6873 = local53;
			this.anInt6885 = local96;
			this.anInt6882 = local30;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(29) int[][] local29 = this.method8319(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static6.anInt111; local55++) {
				this.method5908(local41[local55], local37[local55], local33[local55]);
				this.anInt6872 += this.anInt6880;
				this.anInt6884 += this.anInt6871;
				this.anInt6879 += this.anInt6881;
				while (this.anInt6884 < 0) {
					this.anInt6884 += 4096;
				}
				while (this.anInt6884 > 4096) {
					this.anInt6884 -= 4096;
				}
				if (this.anInt6879 < 0) {
					this.anInt6879 = 0;
				}
				if (this.anInt6879 > 4096) {
					this.anInt6879 = 4096;
				}
				if (this.anInt6872 < 0) {
					this.anInt6872 = 0;
				}
				if (this.anInt6872 > 4096) {
					this.anInt6872 = 4096;
				}
				this.method5906(this.anInt6879, this.anInt6872, this.anInt6884);
				local45[local55] = this.anInt6882;
				local49[local55] = this.anInt6873;
				local53[local55] = this.anInt6885;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
	private void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg1 ? arg2 : arg1;
		@Pc(35) int local35 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(42) int local42 = local16 < arg0 ? arg0 : local16;
		@Pc(53) int local53 = arg0 < local35 ? arg0 : local35;
		this.anInt6872 = (local53 + local42) / 2;
		@Pc(66) int local66 = local42 - local53;
		if (this.anInt6872 > 0 && this.anInt6872 < 4096) {
			this.anInt6879 = (local66 << 12) / (this.anInt6872 <= 2048 ? this.anInt6872 * 2 : 8192 - (this.anInt6872 * 2));
		} else {
			this.anInt6879 = 0;
		}
		if (local66 <= 0) {
			this.anInt6884 = 0;
			return;
		}
		@Pc(115) int local115 = (local42 - arg2 << 12) / local66;
		@Pc(124) int local124 = (local42 - arg1 << 12) / local66;
		@Pc(133) int local133 = (local42 - arg0 << 12) / local66;
		if (local42 == arg2) {
			this.anInt6884 = local53 == arg1 ? local133 + 20480 : -local124 + 4096;
		} else if (arg1 == local42) {
			this.anInt6884 = arg0 == local53 ? local115 + 4096 : -local133 + 12288;
		} else {
			this.anInt6884 = local53 == arg2 ? local124 + 12288 : -local115 + 20480;
		}
		this.anInt6884 /= 6;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt6871 = arg1.method8615();
		} else if (arg0 == 1) {
			this.anInt6881 = (arg1.method8602() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt6880 = (arg1.method8602() << 12) / 100;
		}
	}
}
