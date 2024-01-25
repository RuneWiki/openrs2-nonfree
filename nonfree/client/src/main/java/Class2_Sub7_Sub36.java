import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class2_Sub7_Sub36 extends Class2_Sub7 {

	@OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
	private int anInt8736;

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "I")
	private int anInt8738;

	@OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
	private int anInt8739;

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "I")
	private int anInt8741;

	@OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
	private int anInt8742;

	@OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
	private int anInt8743;

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
	private int anInt8734 = 0;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
	private int anInt8733 = 0;

	@OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
	private int anInt8735 = 0;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(32) int[][] local32 = this.method7589(0, arg0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static352.anInt6485; local58++) {
				this.method7320(local44[local58], local40[local58], local36[local58]);
				this.anInt8742 += this.anInt8734;
				this.anInt8738 += this.anInt8735;
				for (this.anInt8736 += this.anInt8733; this.anInt8736 < 0; this.anInt8736 += 4096) {
				}
				if (this.anInt8742 < 0) {
					this.anInt8742 = 0;
				}
				while (this.anInt8736 > 4096) {
					this.anInt8736 -= 4096;
				}
				if (this.anInt8738 < 0) {
					this.anInt8738 = 0;
				}
				if (this.anInt8742 > 4096) {
					this.anInt8742 = 4096;
				}
				if (this.anInt8738 > 4096) {
					this.anInt8738 = 4096;
				}
				this.method7321(this.anInt8742, this.anInt8736, this.anInt8738);
				local48[local58] = this.anInt8739;
				local52[local58] = this.anInt8743;
				local56[local58] = this.anInt8741;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V")
	private void method7320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 > arg1 ? arg2 : arg1;
		@Pc(27) int local27 = arg1 > arg2 ? arg2 : arg1;
		@Pc(34) int local34 = arg0 <= local12 ? local12 : arg0;
		@Pc(45) int local45 = local27 > arg0 ? arg0 : local27;
		this.anInt8738 = (local34 + local45) / 2;
		@Pc(57) int local57 = local34 - local45;
		if (this.anInt8738 > 0 && this.anInt8738 < 4096) {
			this.anInt8742 = (local57 << 12) / (this.anInt8738 > 2048 ? 8192 - (this.anInt8738 * 2) : this.anInt8738 * 2);
		} else {
			this.anInt8742 = 0;
		}
		if (local57 <= 0) {
			this.anInt8736 = 0;
			return;
		}
		@Pc(109) int local109 = (local34 - arg2 << 12) / local57;
		@Pc(118) int local118 = (local34 - arg1 << 12) / local57;
		@Pc(127) int local127 = (local34 - arg0 << 12) / local57;
		if (arg2 == local34) {
			this.anInt8736 = arg1 == local45 ? local127 + 20480 : -local118 + 4096;
		} else if (arg1 == local34) {
			this.anInt8736 = arg0 == local45 ? local109 + 4096 : -local127 + 12288;
		} else {
			this.anInt8736 = local45 == arg2 ? local118 + 12288 : -local109 + 20480;
		}
		this.anInt8736 /= 6;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(IIII)V")
	private void method7321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg2 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : (arg0 + 4096) * arg2 >> 12;
		if (local29 <= 0) {
			this.anInt8739 = this.anInt8743 = this.anInt8741 = arg2;
			return;
		}
		@Pc(35) int local35 = arg1 * 6;
		@Pc(42) int local42 = arg2 + arg2 - local29;
		@Pc(51) int local51 = (local29 - local42 << 12) / local29;
		@Pc(55) int local55 = local35 >> 12;
		@Pc(62) int local62 = local35 - (local55 << 12);
		@Pc(70) int local70 = local51 * local29 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local76 + local42;
		@Pc(84) int local84 = local29 - local76;
		if (local55 == 0) {
			this.anInt8739 = local29;
			this.anInt8743 = local80;
			this.anInt8741 = local42;
		} else if (local55 == 1) {
			this.anInt8743 = local29;
			this.anInt8739 = local84;
			this.anInt8741 = local42;
		} else if (local55 == 2) {
			this.anInt8739 = local42;
			this.anInt8741 = local80;
			this.anInt8743 = local29;
		} else if (local55 == 3) {
			this.anInt8739 = local42;
			this.anInt8743 = local84;
			this.anInt8741 = local29;
		} else if (local55 == 4) {
			this.anInt8743 = local42;
			this.anInt8741 = local29;
			this.anInt8739 = local80;
		} else if (local55 == 5) {
			this.anInt8741 = local84;
			this.anInt8739 = local29;
			this.anInt8743 = local42;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt8733 = arg1.method5231();
		} else if (arg0 == 1) {
			this.anInt8734 = (arg1.method5179() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt8735 = (arg1.method5179() << 12) / 100;
		}
	}
}
