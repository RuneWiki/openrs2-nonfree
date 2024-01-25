import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class4_Sub4_Sub14 extends Class4_Sub4 {

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	private int anInt4666;

	@OriginalMember(owner = "client!io", name = "R", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "I")
	private int anInt4669;

	@OriginalMember(owner = "client!io", name = "X", descriptor = "I")
	private int anInt4672;

	@OriginalMember(owner = "client!io", name = "L", descriptor = "I")
	private int anInt4663 = 0;

	@OriginalMember(owner = "client!io", name = "N", descriptor = "I")
	private int anInt4665 = 0;

	@OriginalMember(owner = "client!io", name = "W", descriptor = "I")
	private int anInt4671 = 0;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(30) int[][] local30 = this.method7892(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static560.anInt9394; local56++) {
				this.method3963(local38[local56], local42[local56], local34[local56]);
				this.anInt4669 += this.anInt4671;
				this.anInt4668 += this.anInt4665;
				this.anInt4666 += this.anInt4663;
				while (this.anInt4668 < 0) {
					this.anInt4668 += 4096;
				}
				while (this.anInt4668 > 4096) {
					this.anInt4668 -= 4096;
				}
				if (this.anInt4666 < 0) {
					this.anInt4666 = 0;
				}
				if (this.anInt4669 < 0) {
					this.anInt4669 = 0;
				}
				if (this.anInt4666 > 4096) {
					this.anInt4666 = 4096;
				}
				if (this.anInt4669 > 4096) {
					this.anInt4669 = 4096;
				}
				this.method3962(this.anInt4666, this.anInt4668, this.anInt4669);
				local46[local56] = this.anInt4664;
				local50[local56] = this.anInt4660;
				local54[local56] = this.anInt4672;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBI)V")
	private void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (local31 <= 0) {
			this.anInt4664 = this.anInt4660 = this.anInt4672 = arg2;
			return;
		}
		@Pc(50) int local50 = arg1 * 6;
		@Pc(56) int local56 = arg2 + arg2 - local31;
		@Pc(65) int local65 = (local31 - local56 << 12) / local31;
		@Pc(69) int local69 = local50 >> 12;
		@Pc(75) int local75 = local50 - (local69 << 12);
		@Pc(83) int local83 = local65 * local31 >> 12;
		@Pc(89) int local89 = local83 * local75 >> 12;
		@Pc(93) int local93 = local89 + local56;
		@Pc(98) int local98 = local31 - local89;
		if (local69 == 0) {
			this.anInt4672 = local56;
			this.anInt4664 = local31;
			this.anInt4660 = local93;
		} else if (local69 == 1) {
			this.anInt4672 = local56;
			this.anInt4660 = local31;
			this.anInt4664 = local98;
		} else if (local69 == 2) {
			this.anInt4660 = local31;
			this.anInt4672 = local93;
			this.anInt4664 = local56;
		} else if (local69 == 3) {
			this.anInt4660 = local98;
			this.anInt4672 = local31;
			this.anInt4664 = local56;
		} else if (local69 == 4) {
			this.anInt4664 = local93;
			this.anInt4672 = local31;
			this.anInt4660 = local56;
		} else if (local69 == 5) {
			this.anInt4660 = local56;
			this.anInt4664 = local31;
			this.anInt4672 = local98;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IBII)V")
	private void method3963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 > arg0 ? arg2 : arg0;
		@Pc(23) int local23 = arg2 < arg0 ? arg2 : arg0;
		@Pc(30) int local30 = local16 < arg1 ? arg1 : local16;
		@Pc(37) int local37 = arg1 >= local23 ? local23 : arg1;
		this.anInt4669 = (local30 + local37) / 2;
		@Pc(48) int local48 = local30 - local37;
		if (this.anInt4669 > 0 && this.anInt4669 < 4096) {
			this.anInt4666 = (local48 << 12) / (this.anInt4669 > 2048 ? 8192 - (this.anInt4669 * 2) : this.anInt4669 * 2);
		} else {
			this.anInt4666 = 0;
		}
		if (local48 <= 0) {
			this.anInt4668 = 0;
			return;
		}
		@Pc(98) int local98 = (local30 - arg2 << 12) / local48;
		@Pc(107) int local107 = (local30 - arg0 << 12) / local48;
		@Pc(116) int local116 = (local30 - arg1 << 12) / local48;
		if (arg2 == local30) {
			this.anInt4668 = arg0 == local37 ? local116 + 20480 : -local107 + 4096;
		} else if (arg0 == local30) {
			this.anInt4668 = local37 == arg1 ? local98 + 4096 : -local116 + 12288;
		} else {
			this.anInt4668 = local37 == arg2 ? local107 + 12288 : -local98 + 20480;
		}
		this.anInt4668 /= 6;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4665 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt4663 = (arg1.method6021() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt4671 = (arg1.method6021() << 12) / 100;
		}
	}
}
