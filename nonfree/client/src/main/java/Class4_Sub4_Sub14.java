import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class4_Sub4_Sub14 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	private int anInt3757;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
	private int anInt3761;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt3762;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private int anInt3768;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt3765 = 0;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	private int anInt3760 = 0;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	private int anInt3759 = 0;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
	private void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 > arg0 ? arg2 : arg0;
		@Pc(27) int local27 = arg0 > arg2 ? arg2 : arg0;
		@Pc(38) int local38 = local16 < arg1 ? arg1 : local16;
		@Pc(49) int local49 = arg1 >= local27 ? local27 : arg1;
		@Pc(53) int local53 = local38 - local49;
		this.anInt3757 = (local38 + local49) / 2;
		if (this.anInt3757 > 0 && this.anInt3757 < 4096) {
			this.anInt3762 = (local53 << 12) / (this.anInt3757 <= 2048 ? this.anInt3757 * 2 : 8192 - (this.anInt3757 * 2));
		} else {
			this.anInt3762 = 0;
		}
		if (local53 <= 0) {
			this.anInt3755 = 0;
			return;
		}
		@Pc(114) int local114 = (local38 - arg2 << 12) / local53;
		@Pc(123) int local123 = (local38 - arg0 << 12) / local53;
		@Pc(132) int local132 = (local38 - arg1 << 12) / local53;
		if (local38 == arg2) {
			this.anInt3755 = local49 == arg0 ? local132 + 20480 : -local123 + 4096;
		} else if (local38 == arg0) {
			this.anInt3755 = arg1 == local49 ? local114 + 4096 : -local132 + 12288;
		} else {
			this.anInt3755 = arg2 == local49 ? local123 + 12288 : -local114 + 20480;
		}
		this.anInt3755 /= 6;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3759 = arg1.method5061();
		} else if (arg0 == 1) {
			this.anInt3765 = (arg1.method5063() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3760 = (arg1.method5063() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBII)V")
	private void method2990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) int local35 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local35 <= 0) {
			this.anInt3768 = this.anInt3761 = this.anInt3756 = arg1;
			return;
		}
		@Pc(54) int local54 = arg0 * 6;
		@Pc(61) int local61 = arg1 + arg1 - local35;
		@Pc(69) int local69 = (local35 - local61 << 12) / local35;
		@Pc(73) int local73 = local54 >> 12;
		@Pc(80) int local80 = local54 - (local73 << 12);
		@Pc(88) int local88 = local69 * local35 >> 12;
		@Pc(94) int local94 = local88 * local80 >> 12;
		@Pc(98) int local98 = local94 + local61;
		@Pc(103) int local103 = local35 - local94;
		if (local73 == 0) {
			this.anInt3761 = local98;
			this.anInt3768 = local35;
			this.anInt3756 = local61;
		} else if (local73 == 1) {
			this.anInt3761 = local35;
			this.anInt3768 = local103;
			this.anInt3756 = local61;
		} else if (local73 == 2) {
			this.anInt3768 = local61;
			this.anInt3756 = local98;
			this.anInt3761 = local35;
		} else if (local73 == 3) {
			this.anInt3761 = local103;
			this.anInt3768 = local61;
			this.anInt3756 = local35;
		} else if (local73 == 4) {
			this.anInt3756 = local35;
			this.anInt3761 = local61;
			this.anInt3768 = local98;
		} else if (local73 == 5) {
			this.anInt3768 = local35;
			this.anInt3756 = local103;
			this.anInt3761 = local61;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(26) int[][] local26 = this.method6049(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static419.anInt6404; local52++) {
				this.method2988(local34[local52], local38[local52], local30[local52]);
				this.anInt3762 += this.anInt3765;
				this.anInt3757 += this.anInt3760;
				for (this.anInt3755 += this.anInt3759; this.anInt3755 < 0; this.anInt3755 += 4096) {
				}
				while (this.anInt3755 > 4096) {
					this.anInt3755 -= 4096;
				}
				if (this.anInt3762 < 0) {
					this.anInt3762 = 0;
				}
				if (this.anInt3757 < 0) {
					this.anInt3757 = 0;
				}
				if (this.anInt3762 > 4096) {
					this.anInt3762 = 4096;
				}
				if (this.anInt3757 > 4096) {
					this.anInt3757 = 4096;
				}
				this.method2990(this.anInt3755, this.anInt3757, this.anInt3762);
				local42[local52] = this.anInt3768;
				local46[local52] = this.anInt3761;
				local50[local52] = this.anInt3756;
			}
		}
		return local16;
	}
}
