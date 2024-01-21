import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
	private int anInt76;

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
	private int anInt77;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
	private int anInt82;

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
	private int anInt67 = 0;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	private int anInt68 = 0;

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
	private int anInt72 = 0;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(26) int[][] local26 = this.method3191(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local12[0];
			@Pc(46) int[] local46 = local12[1];
			@Pc(50) int[] local50 = local12[2];
			for (@Pc(52) int local52 = 0; local52 < Static174.anInt3489; local52++) {
				this.method100(local34[local52], local38[local52], local30[local52]);
				this.anInt77 += this.anInt67;
				this.anInt80 += this.anInt68;
				this.anInt82 += this.anInt72;
				if (this.anInt80 < 0) {
					this.anInt80 = 0;
				}
				if (this.anInt77 < 0) {
					this.anInt77 = 0;
				}
				if (this.anInt80 > 4096) {
					this.anInt80 = 4096;
				}
				if (this.anInt77 > 4096) {
					this.anInt77 = 4096;
				}
				while (this.anInt82 < 0) {
					this.anInt82 += 4096;
				}
				while (this.anInt82 > 4096) {
					this.anInt82 -= 4096;
				}
				this.method94(this.anInt80, this.anInt77, this.anInt82);
				local42[local52] = this.anInt84;
				local46[local52] = this.anInt73;
				local50[local52] = this.anInt76;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBI)V")
	private void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 <= 2048 ? arg1 * (arg0 + 4096) >> 12 : arg1 + arg0 - (arg0 * arg1 >> 12);
		if (local27 <= 0) {
			this.anInt84 = this.anInt73 = this.anInt76 = arg1;
			return;
		}
		@Pc(33) int local33 = arg2 * 6;
		@Pc(40) int local40 = arg1 + arg1 - local27;
		@Pc(44) int local44 = local33 >> 12;
		@Pc(53) int local53 = (local27 - local40 << 12) / local27;
		@Pc(62) int local62 = local33 - (local44 << 12);
		@Pc(68) int local68 = local53 * local27 >> 12;
		@Pc(74) int local74 = local68 * local62 >> 12;
		@Pc(79) int local79 = local27 - local74;
		@Pc(83) int local83 = local40 + local74;
		if (local44 == 0) {
			this.anInt76 = local40;
			this.anInt73 = local83;
			this.anInt84 = local27;
		} else if (local44 == 1) {
			this.anInt76 = local40;
			this.anInt73 = local27;
			this.anInt84 = local79;
		} else if (local44 == 2) {
			this.anInt84 = local40;
			this.anInt76 = local83;
			this.anInt73 = local27;
		} else if (local44 == 3) {
			this.anInt76 = local27;
			this.anInt84 = local40;
			this.anInt73 = local79;
		} else if (local44 == 4) {
			this.anInt73 = local40;
			this.anInt84 = local83;
			this.anInt76 = local27;
		} else if (local44 == 5) {
			this.anInt84 = local27;
			this.anInt76 = local79;
			this.anInt73 = local40;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt72 = arg0.method3075();
		} else if (arg1 == 1) {
			this.anInt68 = (arg0.method3053() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt67 = (arg0.method3053() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZ)V")
	private void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 < arg1 ? arg2 : arg1;
		@Pc(23) int local23 = arg0 < local12 ? arg0 : local12;
		@Pc(30) int local30 = arg2 > arg1 ? arg2 : arg1;
		@Pc(41) int local41 = arg0 > local30 ? arg0 : local30;
		this.anInt77 = (local41 + local23) / 2;
		@Pc(58) int local58 = local41 - local23;
		if (local58 > 0) {
			@Pc(72) int local72 = (local41 - arg1 << 12) / local58;
			@Pc(81) int local81 = (local41 - arg2 << 12) / local58;
			@Pc(89) int local89 = (local41 - arg0 << 12) / local58;
			if (arg2 == local41) {
				this.anInt82 = arg1 == local23 ? local89 + 20480 : -local72 + 4096;
			} else if (arg1 == local41) {
				this.anInt82 = arg0 == local23 ? local81 + 4096 : 12288 - local89;
			} else {
				this.anInt82 = local23 == arg2 ? local72 + 12288 : 20480 - local81;
			}
			this.anInt82 /= 6;
		} else {
			this.anInt82 = 0;
		}
		if (this.anInt77 > 0 && this.anInt77 < 4096) {
			this.anInt80 = (local58 << 12) / (this.anInt77 > 2048 ? 8192 - (this.anInt77 * 2) : this.anInt77 * 2);
		} else {
			this.anInt80 = 0;
		}
	}
}
