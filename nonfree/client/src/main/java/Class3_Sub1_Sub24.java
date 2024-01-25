import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
	private int anInt5782;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
	private int anInt5788;

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
	private int anInt5789;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
	private int anInt5790;

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
	private int anInt5791;

	@OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
	private int anInt5783 = 0;

	@OriginalMember(owner = "client!lp", name = "S", descriptor = "I")
	private int anInt5793 = 0;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
	private int anInt5786 = 0;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt5783 = arg1.method7604();
		} else if (arg0 == 1) {
			this.anInt5786 = (arg1.method7584() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5793 = (arg1.method7584() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	private void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg1 * arg0 >> 12);
		if (local26 <= 0) {
			this.anInt5797 = this.anInt5788 = this.anInt5791 = arg1;
			return;
		}
		@Pc(36) int local36 = arg2 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local26;
		@Pc(52) int local52 = (local26 - local43 << 12) / local26;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local26 * local52 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(81) int local81 = local77 + local43;
		@Pc(86) int local86 = local26 - local77;
		if (local56 == 0) {
			this.anInt5797 = local26;
			this.anInt5791 = local43;
			this.anInt5788 = local81;
			return;
		}
		if (local56 == 1) {
			this.anInt5797 = local86;
			this.anInt5788 = local26;
			this.anInt5791 = local43;
			return;
		}
		if (local56 == 2) {
			this.anInt5791 = local81;
			this.anInt5797 = local43;
			this.anInt5788 = local26;
			return;
		}
		if (local56 == 3) {
			this.anInt5797 = local43;
			this.anInt5788 = local86;
			this.anInt5791 = local26;
			return;
		}
		if (local56 == 4) {
			this.anInt5797 = local81;
			this.anInt5788 = local43;
			this.anInt5791 = local26;
			return;
		}
		if (local56 == 5) {
			this.anInt5791 = local86;
			this.anInt5788 = local43;
			this.anInt5797 = local26;
			return;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(31) int[][] local31 = this.method7779(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			for (@Pc(57) int local57 = 0; local57 < Static307.anInt4846; local57++) {
				this.method4841(local43[local57], local39[local57], local35[local57]);
				this.anInt5790 += this.anInt5786;
				this.anInt5782 += this.anInt5793;
				for (this.anInt5789 += this.anInt5783; this.anInt5789 < 0; this.anInt5789 += 4096) {
				}
				if (this.anInt5790 < 0) {
					this.anInt5790 = 0;
				}
				while (this.anInt5789 > 4096) {
					this.anInt5789 -= 4096;
				}
				if (this.anInt5782 < 0) {
					this.anInt5782 = 0;
				}
				if (this.anInt5790 > 4096) {
					this.anInt5790 = 4096;
				}
				if (this.anInt5782 > 4096) {
					this.anInt5782 = 4096;
				}
				this.method4840(this.anInt5790, this.anInt5782, this.anInt5789);
				local47[local57] = this.anInt5797;
				local51[local57] = this.anInt5788;
				local55[local57] = this.anInt5791;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)V")
	private void method4841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 <= arg1 ? arg1 : arg2;
		@Pc(23) int local23 = arg1 > arg2 ? arg2 : arg1;
		@Pc(30) int local30 = arg0 > local16 ? arg0 : local16;
		@Pc(41) int local41 = arg0 >= local23 ? local23 : arg0;
		this.anInt5782 = (local41 + local30) / 2;
		@Pc(53) int local53 = local30 - local41;
		if (local53 <= 0) {
			this.anInt5789 = 0;
		} else {
			@Pc(69) int local69 = (local30 - arg2 << 12) / local53;
			@Pc(78) int local78 = (local30 - arg1 << 12) / local53;
			@Pc(87) int local87 = (local30 - arg0 << 12) / local53;
			if (arg2 == local30) {
				this.anInt5789 = arg1 == local41 ? local87 + 20480 : 4096 - local78;
			} else if (local30 == arg1) {
				this.anInt5789 = local41 == arg0 ? local69 + 4096 : 12288 - local87;
			} else {
				this.anInt5789 = arg2 == local41 ? local78 + 12288 : 20480 - local69;
			}
			this.anInt5789 /= 6;
		}
		if (this.anInt5782 > 0 && this.anInt5782 < 4096) {
			this.anInt5790 = (local53 << 12) / (this.anInt5782 > 2048 ? 8192 - this.anInt5782 * 2 : this.anInt5782 * 2);
		} else {
			this.anInt5790 = 0;
		}
	}
}
