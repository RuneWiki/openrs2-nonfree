import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class5_Sub3_Sub35 extends Class5_Sub3 {

	@OriginalMember(owner = "client!vfa", name = "X", descriptor = "I")
	private int anInt10323;

	@OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
	private int anInt10325;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
	private int anInt10327;

	@OriginalMember(owner = "client!vfa", name = "T", descriptor = "I")
	private int anInt10331;

	@OriginalMember(owner = "client!vfa", name = "Q", descriptor = "I")
	private int anInt10333;

	@OriginalMember(owner = "client!vfa", name = "P", descriptor = "I")
	private int anInt10336;

	@OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
	private int anInt10328 = 0;

	@OriginalMember(owner = "client!vfa", name = "J", descriptor = "I")
	private int anInt10334 = 0;

	@OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
	private int anInt10335 = 0;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(IIII)V")
	private void method8769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg2 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local34 <= 0) {
			this.anInt10323 = this.anInt10325 = this.anInt10333 = arg2;
			return;
		}
		@Pc(51) int local51 = arg1 * 6;
		@Pc(58) int local58 = arg2 + arg2 - local34;
		@Pc(67) int local67 = (local34 - local58 << 12) / local34;
		@Pc(71) int local71 = local51 >> 12;
		@Pc(77) int local77 = local51 - (local71 << 12);
		@Pc(85) int local85 = local34 * local67 >> 12;
		@Pc(91) int local91 = local77 * local85 >> 12;
		@Pc(95) int local95 = local91 + local58;
		@Pc(100) int local100 = local34 - local91;
		if (local71 == 0) {
			this.anInt10325 = local95;
			this.anInt10323 = local34;
			this.anInt10333 = local58;
		} else if (local71 == 1) {
			this.anInt10333 = local58;
			this.anInt10325 = local34;
			this.anInt10323 = local100;
		} else if (local71 == 2) {
			this.anInt10325 = local34;
			this.anInt10323 = local58;
			this.anInt10333 = local95;
		} else if (local71 == 3) {
			this.anInt10333 = local34;
			this.anInt10323 = local58;
			this.anInt10325 = local100;
		} else if (local71 == 4) {
			this.anInt10323 = local95;
			this.anInt10325 = local58;
			this.anInt10333 = local34;
		} else if (local71 == 5) {
			this.anInt10323 = local34;
			this.anInt10325 = local58;
			this.anInt10333 = local100;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10328 = arg0.method7303();
		} else if (arg1 == 1) {
			this.anInt10334 = (arg0.method7318() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt10335 = (arg0.method7318() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(31) int[][] local31 = this.method9207(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static7.anInt102; local57++) {
				this.method8771(local35[local57], local43[local57], local39[local57]);
				this.anInt10331 += this.anInt10335;
				this.anInt10327 += this.anInt10334;
				for (this.anInt10336 += this.anInt10328; this.anInt10336 < 0; this.anInt10336 += 4096) {
				}
				if (this.anInt10327 < 0) {
					this.anInt10327 = 0;
				}
				while (this.anInt10336 > 4096) {
					this.anInt10336 -= 4096;
				}
				if (this.anInt10327 > 4096) {
					this.anInt10327 = 4096;
				}
				if (this.anInt10331 < 0) {
					this.anInt10331 = 0;
				}
				if (this.anInt10331 > 4096) {
					this.anInt10331 = 4096;
				}
				this.method8769(this.anInt10327, this.anInt10336, this.anInt10331);
				local47[local57] = this.anInt10323;
				local51[local57] = this.anInt10325;
				local55[local57] = this.anInt10333;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)V")
	private void method8771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(26) int local26 = arg0 < arg2 ? arg0 : arg2;
		@Pc(34) int local34 = arg1 <= local13 ? local13 : arg1;
		@Pc(46) int local46 = local26 <= arg1 ? local26 : arg1;
		this.anInt10331 = (local34 + local46) / 2;
		@Pc(58) int local58 = local34 - local46;
		if (local58 > 0) {
			@Pc(71) int local71 = (local34 - arg0 << 12) / local58;
			@Pc(79) int local79 = (local34 - arg2 << 12) / local58;
			@Pc(88) int local88 = (local34 - arg1 << 12) / local58;
			if (local34 == arg0) {
				this.anInt10336 = local46 == arg2 ? local88 + 20480 : 4096 - local79;
			} else if (local34 == arg2) {
				this.anInt10336 = arg1 == local46 ? local71 + 4096 : -local88 + 12288;
			} else {
				this.anInt10336 = local46 == arg0 ? local79 + 12288 : -local71 + 20480;
			}
			this.anInt10336 /= 6;
		} else {
			this.anInt10336 = 0;
		}
		if (this.anInt10331 > 0 && this.anInt10331 < 4096) {
			this.anInt10327 = (local58 << 12) / (this.anInt10331 <= 2048 ? this.anInt10331 * 2 : 8192 - (this.anInt10331 * 2));
		} else {
			this.anInt10327 = 0;
		}
	}
}
