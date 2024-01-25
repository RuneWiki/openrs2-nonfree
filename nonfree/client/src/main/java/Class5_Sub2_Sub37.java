import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class5_Sub2_Sub37 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
	private int anInt10108;

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
	private int anInt10109;

	@OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
	private int anInt10114;

	@OriginalMember(owner = "client!wca", name = "K", descriptor = "I")
	private int anInt10115;

	@OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
	private int anInt10118;

	@OriginalMember(owner = "client!wca", name = "R", descriptor = "I")
	private int anInt10122;

	@OriginalMember(owner = "client!wca", name = "P", descriptor = "I")
	private int anInt10120 = 0;

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
	private int anInt10112 = 0;

	@OriginalMember(owner = "client!wca", name = "I", descriptor = "I")
	private int anInt10113 = 0;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIBI)V")
	private void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(23) int local23 = arg1 <= arg0 ? arg1 : arg0;
		@Pc(34) int local34 = local12 < arg2 ? arg2 : local12;
		@Pc(45) int local45 = local23 > arg2 ? arg2 : local23;
		this.anInt10115 = (local45 + local34) / 2;
		@Pc(58) int local58 = local34 - local45;
		if (local58 <= 0) {
			this.anInt10118 = 0;
		} else {
			@Pc(86) int local86 = (local34 - arg0 << 12) / local58;
			@Pc(94) int local94 = (local34 - arg1 << 12) / local58;
			@Pc(103) int local103 = (local34 - arg2 << 12) / local58;
			if (arg0 == local34) {
				this.anInt10118 = local45 == arg1 ? local103 + 20480 : -local94 + 4096;
			} else if (local34 == arg1) {
				this.anInt10118 = local45 == arg2 ? local86 + 4096 : 12288 - local103;
			} else {
				this.anInt10118 = arg0 == local45 ? local94 + 12288 : -local86 + 20480;
			}
			this.anInt10118 /= 6;
		}
		if (this.anInt10115 > 0 && this.anInt10115 < 4096) {
			this.anInt10114 = (local58 << 12) / (this.anInt10115 <= 2048 ? this.anInt10115 * 2 : 8192 - (this.anInt10115 * 2));
		} else {
			this.anInt10114 = 0;
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IIBI)V")
	private void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg0 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : arg0 * (4096 - -arg1) >> 12;
		if (local30 <= 0) {
			this.anInt10122 = this.anInt10109 = this.anInt10108 = arg0;
			return;
		}
		@Pc(47) int local47 = arg2 * 6;
		@Pc(55) int local55 = arg0 + arg0 - local30;
		@Pc(64) int local64 = (local30 - local55 << 12) / local30;
		@Pc(68) int local68 = local47 >> 12;
		@Pc(75) int local75 = local47 - (local68 << 12);
		@Pc(83) int local83 = local64 * local30 >> 12;
		@Pc(89) int local89 = local83 * local75 >> 12;
		@Pc(93) int local93 = local89 + local55;
		@Pc(98) int local98 = local30 - local89;
		if (local68 == 0) {
			this.anInt10122 = local30;
			this.anInt10108 = local55;
			this.anInt10109 = local93;
		} else if (local68 == 1) {
			this.anInt10108 = local55;
			this.anInt10122 = local98;
			this.anInt10109 = local30;
		} else if (local68 == 2) {
			this.anInt10108 = local93;
			this.anInt10122 = local55;
			this.anInt10109 = local30;
		} else if (local68 == 3) {
			this.anInt10108 = local30;
			this.anInt10109 = local98;
			this.anInt10122 = local55;
		} else if (local68 == 4) {
			this.anInt10108 = local30;
			this.anInt10122 = local93;
			this.anInt10109 = local55;
		} else if (local68 == 5) {
			this.anInt10108 = local98;
			this.anInt10122 = local30;
			this.anInt10109 = local55;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10120 = arg0.method8595();
		} else if (arg1 == 1) {
			this.anInt10112 = (arg0.method8635() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt10113 = (arg0.method8635() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(30) int[][] local30 = this.method8823(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static314.anInt6320; local56++) {
				this.method8585(local34[local56], local38[local56], local42[local56]);
				this.anInt10118 += this.anInt10120;
				this.anInt10114 += this.anInt10112;
				this.anInt10115 += this.anInt10113;
				while (this.anInt10118 < 0) {
					this.anInt10118 += 4096;
				}
				while (this.anInt10118 > 4096) {
					this.anInt10118 -= 4096;
				}
				if (this.anInt10114 < 0) {
					this.anInt10114 = 0;
				}
				if (this.anInt10114 > 4096) {
					this.anInt10114 = 4096;
				}
				if (this.anInt10115 < 0) {
					this.anInt10115 = 0;
				}
				if (this.anInt10115 > 4096) {
					this.anInt10115 = 4096;
				}
				this.method8586(this.anInt10115, this.anInt10114, this.anInt10118);
				local46[local56] = this.anInt10122;
				local50[local56] = this.anInt10109;
				local54[local56] = this.anInt10108;
			}
		}
		return local11;
	}
}
