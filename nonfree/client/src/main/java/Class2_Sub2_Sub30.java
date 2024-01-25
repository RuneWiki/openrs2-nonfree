import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "I")
	private int anInt5967;

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
	private int anInt5972;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
	private int anInt5973;

	@OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
	private int anInt5978;

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
	private int anInt5979;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
	private int anInt5981;

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
	private int anInt5977 = 0;

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
	private int anInt5980 = 0;

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
	private int anInt5983 = 0;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5977 = arg0.method3558();
		} else if (arg1 == 1) {
			this.anInt5983 = (arg0.method3605() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5980 = (arg0.method3605() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(26) int[][] local26 = this.method5474(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static217.anInt3574; local52++) {
				this.method4672(local38[local52], local30[local52], local34[local52]);
				this.anInt5972 += this.anInt5977;
				this.anInt5979 += this.anInt5980;
				this.anInt5978 += this.anInt5983;
				while (this.anInt5972 < 0) {
					this.anInt5972 += 4096;
				}
				while (this.anInt5972 > 4096) {
					this.anInt5972 -= 4096;
				}
				if (this.anInt5978 < 0) {
					this.anInt5978 = 0;
				}
				if (this.anInt5978 > 4096) {
					this.anInt5978 = 4096;
				}
				if (this.anInt5979 < 0) {
					this.anInt5979 = 0;
				}
				if (this.anInt5979 > 4096) {
					this.anInt5979 = 4096;
				}
				this.method4671(this.anInt5972, this.anInt5978, this.anInt5979);
				local42[local52] = this.anInt5973;
				local46[local52] = this.anInt5967;
				local50[local52] = this.anInt5981;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
	private void method4671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg2 <= 2048 ? arg2 * (arg1 + 4096) >> 12 : arg1 + arg2 - (arg2 * arg1 >> 12);
		if (local28 <= 0) {
			this.anInt5973 = this.anInt5967 = this.anInt5981 = arg2;
			return;
		}
		@Pc(45) int local45 = arg0 * 6;
		@Pc(52) int local52 = arg2 + arg2 - local28;
		@Pc(60) int local60 = (local28 - local52 << 12) / local28;
		@Pc(64) int local64 = local45 >> 12;
		@Pc(70) int local70 = local45 - (local64 << 12);
		@Pc(78) int local78 = local28 * local60 >> 12;
		@Pc(84) int local84 = local70 * local78 >> 12;
		@Pc(88) int local88 = local52 + local84;
		@Pc(92) int local92 = local28 - local84;
		if (local64 == 0) {
			this.anInt5981 = local52;
			this.anInt5973 = local28;
			this.anInt5967 = local88;
		} else if (local64 == 1) {
			this.anInt5967 = local28;
			this.anInt5973 = local92;
			this.anInt5981 = local52;
		} else if (local64 == 2) {
			this.anInt5967 = local28;
			this.anInt5981 = local88;
			this.anInt5973 = local52;
		} else if (local64 == 3) {
			this.anInt5981 = local28;
			this.anInt5967 = local92;
			this.anInt5973 = local52;
		} else if (local64 == 4) {
			this.anInt5967 = local52;
			this.anInt5981 = local28;
			this.anInt5973 = local88;
		} else if (local64 == 5) {
			this.anInt5973 = local28;
			this.anInt5981 = local92;
			this.anInt5967 = local52;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V")
	private void method4672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 > arg2 ? arg1 : arg2;
		@Pc(19) int local19 = local12 >= arg0 ? local12 : arg0;
		@Pc(30) int local30 = arg1 >= arg2 ? arg2 : arg1;
		@Pc(41) int local41 = local30 > arg0 ? arg0 : local30;
		@Pc(46) int local46 = local19 - local41;
		this.anInt5979 = (local19 + local41) / 2;
		if (local46 > 0) {
			@Pc(63) int local63 = (local19 - arg1 << 12) / local46;
			@Pc(72) int local72 = (local19 - arg2 << 12) / local46;
			@Pc(81) int local81 = (local19 - arg0 << 12) / local46;
			if (local19 == arg1) {
				this.anInt5972 = arg2 == local41 ? local81 + 20480 : -local72 + 4096;
			} else if (arg2 == local19) {
				this.anInt5972 = local41 == arg0 ? local63 + 4096 : 12288 - local81;
			} else {
				this.anInt5972 = arg1 == local41 ? local72 + 12288 : 20480 - local63;
			}
			this.anInt5972 /= 6;
		} else {
			this.anInt5972 = 0;
		}
		if (this.anInt5979 > 0 && this.anInt5979 < 4096) {
			this.anInt5978 = (local46 << 12) / (this.anInt5979 > 2048 ? 8192 - (this.anInt5979 * 2) : this.anInt5979 * 2);
		} else {
			this.anInt5978 = 0;
		}
	}
}
