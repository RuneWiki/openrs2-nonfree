import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class6_Sub8_Sub27 extends Class6_Sub8 {

	@OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
	private int anInt7321;

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
	private int anInt7322;

	@OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
	private int anInt7323;

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
	private int anInt7327;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
	private int anInt7332;

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
	private int anInt7335;

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
	private int anInt7328 = 0;

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
	private int anInt7330 = 0;

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	private int anInt7334 = 0;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V")
	private void method6529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg1 < arg0 ? arg0 : arg1;
		@Pc(29) int local29 = arg0 >= arg1 ? arg1 : arg0;
		@Pc(41) int local41 = arg2 > local17 ? arg2 : local17;
		@Pc(49) int local49 = arg2 < local29 ? arg2 : local29;
		@Pc(54) int local54 = local41 - local49;
		this.anInt7332 = (local41 + local49) / 2;
		if (this.anInt7332 > 0 && this.anInt7332 < 4096) {
			this.anInt7335 = (local54 << 12) / (this.anInt7332 > 2048 ? 8192 - this.anInt7332 * 2 : this.anInt7332 * 2);
		} else {
			this.anInt7335 = 0;
		}
		if (local54 <= 0) {
			this.anInt7321 = 0;
			return;
		}
		@Pc(130) int local130 = (local41 - arg0 << 12) / local54;
		@Pc(139) int local139 = (local41 - arg1 << 12) / local54;
		@Pc(148) int local148 = (local41 - arg2 << 12) / local54;
		if (local41 == arg0) {
			this.anInt7321 = arg1 == local49 ? local148 + 20480 : -local139 + 4096;
		} else if (arg1 == local41) {
			this.anInt7321 = local49 == arg2 ? local130 + 4096 : -local148 + 12288;
		} else {
			this.anInt7321 = arg0 == local49 ? local139 + 12288 : -local130 + 20480;
		}
		this.anInt7321 /= 6;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(30) int[][] local30 = this.method8928(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static83.anInt1268; local56++) {
				this.method6529(local34[local56], local38[local56], local42[local56]);
				this.anInt7332 += this.anInt7328;
				this.anInt7321 += this.anInt7334;
				this.anInt7335 += this.anInt7330;
				while (this.anInt7321 < 0) {
					this.anInt7321 += 4096;
				}
				if (this.anInt7335 < 0) {
					this.anInt7335 = 0;
				}
				while (this.anInt7321 > 4096) {
					this.anInt7321 -= 4096;
				}
				if (this.anInt7335 > 4096) {
					this.anInt7335 = 4096;
				}
				if (this.anInt7332 < 0) {
					this.anInt7332 = 0;
				}
				if (this.anInt7332 > 4096) {
					this.anInt7332 = 4096;
				}
				this.method6532(this.anInt7335, this.anInt7321, this.anInt7332);
				local46[local56] = this.anInt7327;
				local50[local56] = this.anInt7323;
				local54[local56] = this.anInt7322;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7334 = arg1.method2989();
		} else if (arg0 == 1) {
			this.anInt7330 = (arg1.method3027() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt7328 = (arg1.method3027() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)V")
	private void method6532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg2 + arg0 - (arg2 * arg0 >> 12);
		if (local31 <= 0) {
			this.anInt7327 = this.anInt7323 = this.anInt7322 = arg2;
			return;
		}
		@Pc(40) int local40 = arg1 * 6;
		@Pc(48) int local48 = arg2 + arg2 - local31;
		@Pc(57) int local57 = (local31 - local48 << 12) / local31;
		@Pc(61) int local61 = local40 >> 12;
		@Pc(68) int local68 = local40 - (local61 << 12);
		@Pc(76) int local76 = local57 * local31 >> 12;
		@Pc(82) int local82 = local76 * local68 >> 12;
		@Pc(86) int local86 = local82 + local48;
		@Pc(90) int local90 = local31 - local82;
		if (local61 == 0) {
			this.anInt7327 = local31;
			this.anInt7323 = local86;
			this.anInt7322 = local48;
		} else if (local61 == 1) {
			this.anInt7327 = local90;
			this.anInt7322 = local48;
			this.anInt7323 = local31;
		} else if (local61 == 2) {
			this.anInt7327 = local48;
			this.anInt7322 = local86;
			this.anInt7323 = local31;
		} else if (local61 == 3) {
			this.anInt7322 = local31;
			this.anInt7327 = local48;
			this.anInt7323 = local90;
		} else if (local61 == 4) {
			this.anInt7322 = local31;
			this.anInt7327 = local86;
			this.anInt7323 = local48;
		} else if (local61 == 5) {
			this.anInt7327 = local31;
			this.anInt7323 = local48;
			this.anInt7322 = local90;
		}
	}
}
