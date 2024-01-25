import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class4_Sub2_Sub30 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pv", name = "N", descriptor = "I")
	private int anInt5649;

	@OriginalMember(owner = "client!pv", name = "S", descriptor = "I")
	private int anInt5654;

	@OriginalMember(owner = "client!pv", name = "T", descriptor = "I")
	private int anInt5655;

	@OriginalMember(owner = "client!pv", name = "X", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!pv", name = "Y", descriptor = "I")
	private int anInt5660;

	@OriginalMember(owner = "client!pv", name = "Z", descriptor = "I")
	private int anInt5661;

	@OriginalMember(owner = "client!pv", name = "W", descriptor = "I")
	private int anInt5658 = 0;

	@OriginalMember(owner = "client!pv", name = "P", descriptor = "I")
	private int anInt5651 = 0;

	@OriginalMember(owner = "client!pv", name = "V", descriptor = "I")
	private int anInt5657 = 0;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBII)V")
	private void method4348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(33) int local33 = local22 < arg1 ? arg1 : local22;
		@Pc(40) int local40 = arg2 > arg0 ? arg0 : arg2;
		@Pc(51) int local51 = local40 > arg1 ? arg1 : local40;
		@Pc(55) int local55 = local33 - local51;
		this.anInt5649 = (local51 + local33) / 2;
		if (local55 > 0) {
			@Pc(75) int local75 = (local33 - arg0 << 12) / local55;
			@Pc(84) int local84 = (local33 - arg2 << 12) / local55;
			@Pc(92) int local92 = (local33 - arg1 << 12) / local55;
			if (local33 == arg0) {
				this.anInt5661 = arg2 == local51 ? local92 + 20480 : -local84 + 4096;
			} else if (arg2 == local33) {
				this.anInt5661 = arg1 == local51 ? local75 + 4096 : -local92 + 12288;
			} else {
				this.anInt5661 = local51 == arg0 ? local84 + 12288 : -local75 + 20480;
			}
			this.anInt5661 /= 6;
		} else {
			this.anInt5661 = 0;
		}
		if (this.anInt5649 > 0 && this.anInt5649 < 4096) {
			this.anInt5659 = (local55 << 12) / (this.anInt5649 <= 2048 ? this.anInt5649 * 2 : 8192 - (this.anInt5649 * 2));
		} else {
			this.anInt5659 = 0;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(27) int[][] local27 = this.method5848(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static350.anInt6330; local53++) {
				this.method4348(local31[local53], local39[local53], local35[local53]);
				this.anInt5649 += this.anInt5651;
				this.anInt5661 += this.anInt5658;
				this.anInt5659 += this.anInt5657;
				while (this.anInt5661 < 0) {
					this.anInt5661 += 4096;
				}
				while (this.anInt5661 > 4096) {
					this.anInt5661 -= 4096;
				}
				if (this.anInt5659 < 0) {
					this.anInt5659 = 0;
				}
				if (this.anInt5659 > 4096) {
					this.anInt5659 = 4096;
				}
				if (this.anInt5649 < 0) {
					this.anInt5649 = 0;
				}
				if (this.anInt5649 > 4096) {
					this.anInt5649 = 4096;
				}
				this.method4349(this.anInt5649, this.anInt5661, this.anInt5659);
				local43[local53] = this.anInt5654;
				local47[local53] = this.anInt5655;
				local51[local53] = this.anInt5660;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIII)V")
	private void method4349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local30 <= 0) {
			this.anInt5654 = this.anInt5655 = this.anInt5660 = arg0;
			return;
		}
		@Pc(46) int local46 = arg1 * 6;
		@Pc(53) int local53 = arg0 + arg0 - local30;
		@Pc(62) int local62 = (local30 - local53 << 12) / local30;
		@Pc(66) int local66 = local46 >> 12;
		@Pc(73) int local73 = local46 - (local66 << 12);
		@Pc(81) int local81 = local30 * local62 >> 12;
		@Pc(87) int local87 = local81 * local73 >> 12;
		@Pc(91) int local91 = local87 + local53;
		@Pc(96) int local96 = local30 - local87;
		if (local66 == 0) {
			this.anInt5654 = local30;
			this.anInt5655 = local91;
			this.anInt5660 = local53;
		} else if (local66 == 1) {
			this.anInt5655 = local30;
			this.anInt5660 = local53;
			this.anInt5654 = local96;
		} else if (local66 == 2) {
			this.anInt5655 = local30;
			this.anInt5654 = local53;
			this.anInt5660 = local91;
		} else if (local66 == 3) {
			this.anInt5655 = local96;
			this.anInt5660 = local30;
			this.anInt5654 = local53;
		} else if (local66 == 4) {
			this.anInt5655 = local53;
			this.anInt5660 = local30;
			this.anInt5654 = local91;
		} else if (local66 == 5) {
			this.anInt5655 = local53;
			this.anInt5660 = local96;
			this.anInt5654 = local30;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt5658 = arg1.method4889();
		} else if (arg0 == 1) {
			this.anInt5657 = (arg1.method4865() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5651 = (arg1.method4865() << 12) / 100;
		}
	}
}
