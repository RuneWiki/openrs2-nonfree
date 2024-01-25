import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class4_Sub2_Sub37 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vv", name = "E", descriptor = "I")
	private int anInt10223;

	@OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
	private int anInt10227;

	@OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
	private int anInt10228;

	@OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
	private int anInt10229;

	@OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
	private int anInt10230;

	@OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
	private int anInt10233;

	@OriginalMember(owner = "client!vv", name = "F", descriptor = "I")
	private int anInt10224 = 0;

	@OriginalMember(owner = "client!vv", name = "R", descriptor = "I")
	private int anInt10234 = 0;

	@OriginalMember(owner = "client!vv", name = "T", descriptor = "I")
	private int anInt10236 = 0;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int[][] local26 = this.method8772(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static269.anInt4330; local52++) {
				this.method8663(local34[local52], local30[local52], local38[local52]);
				this.anInt10223 += this.anInt10234;
				this.anInt10233 += this.anInt10236;
				for (this.anInt10228 += this.anInt10224; this.anInt10228 < 0; this.anInt10228 += 4096) {
				}
				while (this.anInt10228 > 4096) {
					this.anInt10228 -= 4096;
				}
				if (this.anInt10223 < 0) {
					this.anInt10223 = 0;
				}
				if (this.anInt10223 > 4096) {
					this.anInt10223 = 4096;
				}
				if (this.anInt10233 < 0) {
					this.anInt10233 = 0;
				}
				if (this.anInt10233 > 4096) {
					this.anInt10233 = 4096;
				}
				this.method8664(this.anInt10233, this.anInt10228, this.anInt10223);
				local42[local52] = this.anInt10229;
				local46[local52] = this.anInt10227;
				local50[local52] = this.anInt10230;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIB)V")
	private void method8663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 > arg0 ? arg1 : arg0;
		@Pc(27) int local27 = local16 >= arg2 ? local16 : arg2;
		@Pc(38) int local38 = arg0 <= arg1 ? arg0 : arg1;
		@Pc(49) int local49 = arg2 >= local38 ? local38 : arg2;
		this.anInt10233 = (local27 + local49) / 2;
		@Pc(60) int local60 = local27 - local49;
		if (this.anInt10233 > 0 && this.anInt10233 < 4096) {
			this.anInt10223 = (local60 << 12) / (this.anInt10233 <= 2048 ? this.anInt10233 * 2 : 8192 - (this.anInt10233 * 2));
		} else {
			this.anInt10223 = 0;
		}
		if (local60 <= 0) {
			this.anInt10228 = 0;
			return;
		}
		@Pc(104) int local104 = (local27 - arg1 << 12) / local60;
		@Pc(113) int local113 = (local27 - arg0 << 12) / local60;
		@Pc(122) int local122 = (local27 - arg2 << 12) / local60;
		if (arg1 == local27) {
			this.anInt10228 = local49 == arg0 ? local122 + 20480 : -local113 + 4096;
		} else if (arg0 == local27) {
			this.anInt10228 = local49 == arg2 ? local104 + 4096 : -local122 + 12288;
		} else {
			this.anInt10228 = local49 == arg1 ? local113 + 12288 : 20480 - local104;
		}
		this.anInt10228 /= 6;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10224 = arg1.method8834();
		} else if (arg0 == 1) {
			this.anInt10234 = (arg1.method8861() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt10236 = (arg1.method8861() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)V")
	private void method8664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(31) int local31 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg2 + arg0 - (arg0 * arg2 >> 12);
		if (local31 <= 0) {
			this.anInt10229 = this.anInt10227 = this.anInt10230 = arg0;
			return;
		}
		@Pc(37) int local37 = arg1 * 6;
		@Pc(45) int local45 = arg0 + arg0 - local31;
		@Pc(54) int local54 = (local31 - local45 << 12) / local31;
		@Pc(58) int local58 = local37 >> 12;
		@Pc(65) int local65 = local37 - (local58 << 12);
		@Pc(73) int local73 = local31 * local54 >> 12;
		@Pc(79) int local79 = local65 * local73 >> 12;
		@Pc(83) int local83 = local45 + local79;
		@Pc(88) int local88 = local31 - local79;
		if (local58 == 0) {
			this.anInt10230 = local45;
			this.anInt10229 = local31;
			this.anInt10227 = local83;
			return;
		}
		if (local58 == 1) {
			this.anInt10227 = local31;
			this.anInt10229 = local88;
			this.anInt10230 = local45;
			return;
		}
		if (local58 == 2) {
			this.anInt10227 = local31;
			this.anInt10230 = local83;
			this.anInt10229 = local45;
			return;
		}
		if (local58 == 3) {
			this.anInt10230 = local31;
			this.anInt10227 = local88;
			this.anInt10229 = local45;
			return;
		}
		if (local58 == 4) {
			this.anInt10229 = local83;
			this.anInt10227 = local45;
			this.anInt10230 = local31;
			return;
		}
		if (local58 == 5) {
			this.anInt10230 = local88;
			this.anInt10229 = local31;
			this.anInt10227 = local45;
			return;
		}
	}
}
