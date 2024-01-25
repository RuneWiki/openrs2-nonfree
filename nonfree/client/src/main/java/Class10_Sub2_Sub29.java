import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class10_Sub2_Sub29 extends Class10_Sub2 {

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
	private int anInt5969;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	private int anInt5970;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	private int anInt5971;

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
	private int anInt5972;

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
	private int anInt5973;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	private int anInt5967 = 0;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
	private int anInt5965 = 0;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
	private int anInt5975 = 0;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	private void method4738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local27 <= 0) {
			this.anInt5969 = this.anInt5974 = this.anInt5973 = arg1;
			return;
		}
		@Pc(44) int local44 = arg0 * 6;
		@Pc(51) int local51 = arg1 + arg1 - local27;
		@Pc(60) int local60 = (local27 - local51 << 12) / local27;
		@Pc(64) int local64 = local44 >> 12;
		@Pc(71) int local71 = local44 - (local64 << 12);
		@Pc(79) int local79 = local27 * local60 >> 12;
		@Pc(85) int local85 = local71 * local79 >> 12;
		@Pc(89) int local89 = local51 + local85;
		@Pc(94) int local94 = local27 - local85;
		if (local64 == 0) {
			this.anInt5969 = local27;
			this.anInt5973 = local51;
			this.anInt5974 = local89;
		} else if (local64 == 1) {
			this.anInt5969 = local94;
			this.anInt5974 = local27;
			this.anInt5973 = local51;
		} else if (local64 == 2) {
			this.anInt5973 = local89;
			this.anInt5969 = local51;
			this.anInt5974 = local27;
		} else if (local64 == 3) {
			this.anInt5974 = local94;
			this.anInt5969 = local51;
			this.anInt5973 = local27;
		} else if (local64 == 4) {
			this.anInt5974 = local51;
			this.anInt5973 = local27;
			this.anInt5969 = local89;
		} else if (local64 == 5) {
			this.anInt5969 = local27;
			this.anInt5974 = local51;
			this.anInt5973 = local94;
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(30) int[][] local30 = this.method6045(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static121.anInt2458; local56++) {
				this.method4742(local34[local56], local42[local56], local38[local56]);
				this.anInt5970 += this.anInt5965;
				this.anInt5971 += this.anInt5975;
				this.anInt5972 += this.anInt5967;
				while (this.anInt5970 < 0) {
					this.anInt5970 += 4096;
				}
				if (this.anInt5971 < 0) {
					this.anInt5971 = 0;
				}
				while (this.anInt5970 > 4096) {
					this.anInt5970 -= 4096;
				}
				if (this.anInt5971 > 4096) {
					this.anInt5971 = 4096;
				}
				if (this.anInt5972 < 0) {
					this.anInt5972 = 0;
				}
				if (this.anInt5972 > 4096) {
					this.anInt5972 = 4096;
				}
				this.method4738(this.anInt5970, this.anInt5972, this.anInt5971);
				local46[local56] = this.anInt5969;
				local50[local56] = this.anInt5974;
				local54[local56] = this.anInt5973;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)V")
	private void method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(27) int local27 = arg1 > local16 ? arg1 : local16;
		@Pc(34) int local34 = arg2 > arg0 ? arg0 : arg2;
		@Pc(41) int local41 = arg1 >= local34 ? local34 : arg1;
		@Pc(46) int local46 = local27 - local41;
		this.anInt5972 = (local27 + local41) / 2;
		if (this.anInt5972 > 0 && this.anInt5972 < 4096) {
			this.anInt5971 = (local46 << 12) / (this.anInt5972 > 2048 ? 8192 - (this.anInt5972 * 2) : this.anInt5972 * 2);
		} else {
			this.anInt5971 = 0;
		}
		if (local46 <= 0) {
			this.anInt5970 = 0;
			return;
		}
		@Pc(107) int local107 = (local27 - arg0 << 12) / local46;
		@Pc(116) int local116 = (local27 - arg2 << 12) / local46;
		@Pc(125) int local125 = (local27 - arg1 << 12) / local46;
		if (local27 == arg0) {
			this.anInt5970 = local41 == arg2 ? local125 + 20480 : -local116 + 4096;
		} else if (arg2 == local27) {
			this.anInt5970 = local41 == arg1 ? local107 + 4096 : -local125 + 12288;
		} else {
			this.anInt5970 = local41 == arg0 ? local116 + 12288 : -local107 + 20480;
		}
		this.anInt5970 /= 6;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5965 = arg1.method2492();
		} else if (arg0 == 1) {
			this.anInt5975 = (arg1.method2460() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5967 = (arg1.method2460() << 12) / 100;
		}
	}
}
