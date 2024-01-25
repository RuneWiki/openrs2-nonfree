import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class5_Sub1_Sub32 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
	private int anInt5604;

	@OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
	private int anInt5605;

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
	private int anInt5606;

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
	private int anInt5609;

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
	private int anInt5610;

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
	private int anInt5613;

	@OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
	private int anInt5611 = 0;

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
	private int anInt5607 = 0;

	@OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
	private int anInt5612 = 0;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
	private void method4457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local33 <= 0) {
			this.anInt5605 = this.anInt5610 = this.anInt5606 = arg1;
			return;
		}
		@Pc(52) int local52 = arg0 * 6;
		@Pc(58) int local58 = arg1 + arg1 - local33;
		@Pc(67) int local67 = (local33 - local58 << 12) / local33;
		@Pc(71) int local71 = local52 >> 12;
		@Pc(78) int local78 = local52 - (local71 << 12);
		@Pc(86) int local86 = local33 * local67 >> 12;
		@Pc(92) int local92 = local78 * local86 >> 12;
		@Pc(96) int local96 = local92 + local58;
		@Pc(101) int local101 = local33 - local92;
		if (local71 == 0) {
			this.anInt5610 = local96;
			this.anInt5606 = local58;
			this.anInt5605 = local33;
		} else if (local71 == 1) {
			this.anInt5605 = local101;
			this.anInt5606 = local58;
			this.anInt5610 = local33;
		} else if (local71 == 2) {
			this.anInt5606 = local96;
			this.anInt5610 = local33;
			this.anInt5605 = local58;
		} else if (local71 == 3) {
			this.anInt5606 = local33;
			this.anInt5605 = local58;
			this.anInt5610 = local101;
		} else if (local71 == 4) {
			this.anInt5610 = local58;
			this.anInt5605 = local96;
			this.anInt5606 = local33;
		} else if (local71 == 5) {
			this.anInt5606 = local101;
			this.anInt5605 = local33;
			this.anInt5610 = local58;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(27) int[][] local27 = this.method5764(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static148.anInt2666; local53++) {
				this.method4460(local39[local53], local35[local53], local31[local53]);
				this.anInt5609 += this.anInt5612;
				this.anInt5613 += this.anInt5607;
				this.anInt5604 += this.anInt5611;
				while (this.anInt5609 < 0) {
					this.anInt5609 += 4096;
				}
				if (this.anInt5604 < 0) {
					this.anInt5604 = 0;
				}
				while (this.anInt5609 > 4096) {
					this.anInt5609 -= 4096;
				}
				if (this.anInt5613 < 0) {
					this.anInt5613 = 0;
				}
				if (this.anInt5604 > 4096) {
					this.anInt5604 = 4096;
				}
				if (this.anInt5613 > 4096) {
					this.anInt5613 = 4096;
				}
				this.method4457(this.anInt5609, this.anInt5613, this.anInt5604);
				local43[local53] = this.anInt5605;
				local47[local53] = this.anInt5610;
				local51[local53] = this.anInt5606;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5612 = arg1.method5586();
		} else if (arg0 == 1) {
			this.anInt5611 = (arg1.method5600() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5607 = (arg1.method5600() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(IIII)V")
	private void method4460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg1 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 <= local16 ? local16 : arg0;
		@Pc(34) int local34 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(41) int local41 = arg0 < local34 ? arg0 : local34;
		this.anInt5613 = (local41 + local23) / 2;
		@Pc(52) int local52 = local23 - local41;
		if (local52 <= 0) {
			this.anInt5609 = 0;
		} else {
			@Pc(68) int local68 = (local23 - arg2 << 12) / local52;
			@Pc(76) int local76 = (local23 - arg1 << 12) / local52;
			@Pc(85) int local85 = (local23 - arg0 << 12) / local52;
			if (arg2 == local23) {
				this.anInt5609 = local41 == arg1 ? local85 + 20480 : 4096 - local76;
			} else if (arg1 == local23) {
				this.anInt5609 = local41 == arg0 ? local68 + 4096 : -local85 + 12288;
			} else {
				this.anInt5609 = arg2 == local41 ? local76 + 12288 : -local68 + 20480;
			}
			this.anInt5609 /= 6;
		}
		if (this.anInt5613 > 0 && this.anInt5613 < 4096) {
			this.anInt5604 = (local52 << 12) / (this.anInt5613 <= 2048 ? this.anInt5613 * 2 : 8192 - (this.anInt5613 * 2));
		} else {
			this.anInt5604 = 0;
		}
	}
}
