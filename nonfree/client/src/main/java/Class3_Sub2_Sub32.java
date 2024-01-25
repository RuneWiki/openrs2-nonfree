import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
	private int anInt9346;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
	private int anInt9349;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
	private int anInt9350;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
	private int anInt9355;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
	private int anInt9356;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
	private int anInt9358;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
	private int anInt9348 = 0;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
	private int anInt9351 = 0;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
	private int anInt9347 = 0;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZII)V")
	private void method8061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg2 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (arg0 + 4096) * arg2 >> 12;
		if (local32 <= 0) {
			this.anInt9358 = this.anInt9346 = this.anInt9350 = arg2;
			return;
		}
		@Pc(48) int local48 = arg1 * 6;
		@Pc(55) int local55 = arg2 + arg2 - local32;
		@Pc(64) int local64 = (local32 - local55 << 12) / local32;
		@Pc(68) int local68 = local48 >> 12;
		@Pc(75) int local75 = local48 - (local68 << 12);
		@Pc(83) int local83 = local64 * local32 >> 12;
		@Pc(89) int local89 = local75 * local83 >> 12;
		@Pc(94) int local94 = local55 + local89;
		@Pc(98) int local98 = local32 - local89;
		if (local68 == 0) {
			this.anInt9358 = local32;
			this.anInt9350 = local55;
			this.anInt9346 = local94;
		} else if (local68 == 1) {
			this.anInt9346 = local32;
			this.anInt9358 = local98;
			this.anInt9350 = local55;
		} else if (local68 == 2) {
			this.anInt9346 = local32;
			this.anInt9350 = local94;
			this.anInt9358 = local55;
		} else if (local68 == 3) {
			this.anInt9350 = local32;
			this.anInt9346 = local98;
			this.anInt9358 = local55;
		} else if (local68 == 4) {
			this.anInt9346 = local55;
			this.anInt9350 = local32;
			this.anInt9358 = local94;
		} else if (local68 == 5) {
			this.anInt9350 = local98;
			this.anInt9346 = local55;
			this.anInt9358 = local32;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIII)V")
	private void method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 <= local16 ? local16 : arg0;
		@Pc(30) int local30 = arg2 > arg1 ? arg1 : arg2;
		@Pc(41) int local41 = local30 > arg0 ? arg0 : local30;
		@Pc(46) int local46 = local23 - local41;
		this.anInt9356 = (local23 + local41) / 2;
		if (this.anInt9356 > 0 && this.anInt9356 < 4096) {
			this.anInt9355 = (local46 << 12) / (this.anInt9356 <= 2048 ? this.anInt9356 * 2 : 8192 - (this.anInt9356 * 2));
		} else {
			this.anInt9355 = 0;
		}
		if (local46 <= 0) {
			this.anInt9349 = 0;
			return;
		}
		@Pc(106) int local106 = (local23 - arg1 << 12) / local46;
		@Pc(115) int local115 = (local23 - arg2 << 12) / local46;
		@Pc(124) int local124 = (local23 - arg0 << 12) / local46;
		if (arg1 == local23) {
			this.anInt9349 = local41 == arg2 ? local124 + 20480 : -local115 + 4096;
		} else if (arg2 == local23) {
			this.anInt9349 = arg0 == local41 ? local106 + 4096 : -local124 + 12288;
		} else {
			this.anInt9349 = local41 == arg1 ? local115 + 12288 : -local106 + 20480;
		}
		this.anInt9349 /= 6;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(27) int[][] local27 = this.method8595(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static491.anInt8519; local53++) {
				this.method8063(local39[local53], local31[local53], local35[local53]);
				this.anInt9356 += this.anInt9347;
				this.anInt9355 += this.anInt9348;
				for (this.anInt9349 += this.anInt9351; this.anInt9349 < 0; this.anInt9349 += 4096) {
				}
				if (this.anInt9355 < 0) {
					this.anInt9355 = 0;
				}
				while (this.anInt9349 > 4096) {
					this.anInt9349 -= 4096;
				}
				if (this.anInt9355 > 4096) {
					this.anInt9355 = 4096;
				}
				if (this.anInt9356 < 0) {
					this.anInt9356 = 0;
				}
				if (this.anInt9356 > 4096) {
					this.anInt9356 = 4096;
				}
				this.method8061(this.anInt9355, this.anInt9349, this.anInt9356);
				local43[local53] = this.anInt9358;
				local47[local53] = this.anInt9346;
				local51[local53] = this.anInt9350;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9351 = arg0.method4209();
		} else if (arg1 == 1) {
			this.anInt9348 = (arg0.method4254() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt9347 = (arg0.method4254() << 12) / 100;
		}
	}
}
