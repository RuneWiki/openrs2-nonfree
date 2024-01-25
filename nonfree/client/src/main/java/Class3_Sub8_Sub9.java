import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub8_Sub9 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt4284;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt4285;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	private int anInt4289;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	private int anInt4291;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
	private int anInt4295;

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
	private int anInt4296;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt4286 = 0;

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
	private int anInt4290 = 0;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
	private int anInt4293 = 0;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4286 = arg1.method7918();
		} else if (arg0 == 1) {
			this.anInt4290 = (arg1.method7960() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt4293 = (arg1.method7960() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(26) int[][] local26 = this.method8779(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static91.anInt1849; local52++) {
				this.method3665(local30[local52], local38[local52], local34[local52]);
				this.anInt4289 += this.anInt4286;
				this.anInt4296 += this.anInt4293;
				this.anInt4295 += this.anInt4290;
				while (this.anInt4289 < 0) {
					this.anInt4289 += 4096;
				}
				while (this.anInt4289 > 4096) {
					this.anInt4289 -= 4096;
				}
				if (this.anInt4295 < 0) {
					this.anInt4295 = 0;
				}
				if (this.anInt4295 > 4096) {
					this.anInt4295 = 4096;
				}
				if (this.anInt4296 < 0) {
					this.anInt4296 = 0;
				}
				if (this.anInt4296 > 4096) {
					this.anInt4296 = 4096;
				}
				this.method3667(this.anInt4296, this.anInt4289, this.anInt4295);
				local42[local52] = this.anInt4291;
				local46[local52] = this.anInt4285;
				local50[local52] = this.anInt4284;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	private void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(29) int local29 = arg0 < arg2 ? arg0 : arg2;
		@Pc(40) int local40 = local18 < arg1 ? arg1 : local18;
		@Pc(51) int local51 = arg1 >= local29 ? local29 : arg1;
		@Pc(55) int local55 = local40 - local51;
		this.anInt4296 = (local40 + local51) / 2;
		if (this.anInt4296 > 0 && this.anInt4296 < 4096) {
			this.anInt4295 = (local55 << 12) / (this.anInt4296 > 2048 ? 8192 - (this.anInt4296 * 2) : this.anInt4296 * 2);
		} else {
			this.anInt4295 = 0;
		}
		if (local55 <= 0) {
			this.anInt4289 = 0;
			return;
		}
		@Pc(111) int local111 = (local40 - arg0 << 12) / local55;
		@Pc(119) int local119 = (local40 - arg2 << 12) / local55;
		@Pc(127) int local127 = (local40 - arg1 << 12) / local55;
		if (local40 == arg0) {
			this.anInt4289 = arg2 == local51 ? local127 + 20480 : -local119 + 4096;
		} else if (local40 == arg2) {
			this.anInt4289 = arg1 == local51 ? local111 + 4096 : -local127 + 12288;
		} else {
			this.anInt4289 = arg0 == local51 ? local119 + 12288 : 20480 - local111;
		}
		this.anInt4289 /= 6;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)V")
	private void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local35 <= 0) {
			this.anInt4291 = this.anInt4285 = this.anInt4284 = arg0;
			return;
		}
		@Pc(54) int local54 = arg1 * 6;
		@Pc(61) int local61 = arg0 + arg0 - local35;
		@Pc(69) int local69 = (local35 - local61 << 12) / local35;
		@Pc(73) int local73 = local54 >> 12;
		@Pc(79) int local79 = local54 - (local73 << 12);
		@Pc(87) int local87 = local69 * local35 >> 12;
		@Pc(93) int local93 = local79 * local87 >> 12;
		@Pc(98) int local98 = local61 + local93;
		@Pc(103) int local103 = local35 - local93;
		if (local73 == 0) {
			this.anInt4285 = local98;
			this.anInt4284 = local61;
			this.anInt4291 = local35;
		} else if (local73 == 1) {
			this.anInt4285 = local35;
			this.anInt4284 = local61;
			this.anInt4291 = local103;
		} else if (local73 == 2) {
			this.anInt4284 = local98;
			this.anInt4285 = local35;
			this.anInt4291 = local61;
		} else if (local73 == 3) {
			this.anInt4291 = local61;
			this.anInt4284 = local35;
			this.anInt4285 = local103;
		} else if (local73 == 4) {
			this.anInt4285 = local61;
			this.anInt4291 = local98;
			this.anInt4284 = local35;
		} else if (local73 == 5) {
			this.anInt4291 = local35;
			this.anInt4284 = local103;
			this.anInt4285 = local61;
		}
	}
}
