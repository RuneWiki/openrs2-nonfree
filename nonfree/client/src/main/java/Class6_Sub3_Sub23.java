import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class6_Sub3_Sub23 extends Class6_Sub3 {

	@OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
	private int anInt5517;

	@OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
	private int anInt5520;

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
	private int anInt5523;

	@OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
	private int anInt5524;

	@OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
	private int anInt5526;

	@OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
	private int anInt5528;

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
	private int anInt5519 = 0;

	@OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
	private int anInt5529 = 0;

	@OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
	private int anInt5530 = 0;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5529 = arg1.method6023();
		} else if (arg0 == 1) {
			this.anInt5519 = (arg1.method6049() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5530 = (arg1.method6049() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7961(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static35.anInt670; local52++) {
				this.method4552(local30[local52], local34[local52], local38[local52]);
				this.anInt5517 += this.anInt5519;
				this.anInt5526 += this.anInt5529;
				this.anInt5523 += this.anInt5530;
				while (this.anInt5526 < 0) {
					this.anInt5526 += 4096;
				}
				while (this.anInt5526 > 4096) {
					this.anInt5526 -= 4096;
				}
				if (this.anInt5517 < 0) {
					this.anInt5517 = 0;
				}
				if (this.anInt5517 > 4096) {
					this.anInt5517 = 4096;
				}
				if (this.anInt5523 < 0) {
					this.anInt5523 = 0;
				}
				if (this.anInt5523 > 4096) {
					this.anInt5523 = 4096;
				}
				this.method4553(this.anInt5526, this.anInt5523, this.anInt5517);
				local42[local52] = this.anInt5520;
				local46[local52] = this.anInt5524;
				local50[local52] = this.anInt5528;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V")
	private void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(23) int local23 = local12 < arg2 ? arg2 : local12;
		@Pc(30) int local30 = arg1 > arg0 ? arg0 : arg1;
		@Pc(37) int local37 = local30 > arg2 ? arg2 : local30;
		this.anInt5523 = (local37 + local23) / 2;
		@Pc(49) int local49 = local23 - local37;
		if (this.anInt5523 > 0 && this.anInt5523 < 4096) {
			this.anInt5517 = (local49 << 12) / (this.anInt5523 > 2048 ? 8192 - (this.anInt5523 * 2) : this.anInt5523 * 2);
		} else {
			this.anInt5517 = 0;
		}
		if (local49 <= 0) {
			this.anInt5526 = 0;
			return;
		}
		@Pc(110) int local110 = (local23 - arg0 << 12) / local49;
		@Pc(119) int local119 = (local23 - arg1 << 12) / local49;
		@Pc(128) int local128 = (local23 - arg2 << 12) / local49;
		if (local23 == arg0) {
			this.anInt5526 = arg1 == local37 ? local128 + 20480 : -local119 + 4096;
		} else if (local23 == arg1) {
			this.anInt5526 = arg2 == local37 ? local110 + 4096 : -local128 + 12288;
		} else {
			this.anInt5526 = local37 == arg0 ? local119 + 12288 : -local110 + 20480;
		}
		this.anInt5526 /= 6;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIII)V")
	private void method4553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local30 <= 0) {
			this.anInt5520 = this.anInt5524 = this.anInt5528 = arg1;
			return;
		}
		@Pc(49) int local49 = arg0 * 6;
		@Pc(56) int local56 = arg1 + arg1 - local30;
		@Pc(65) int local65 = (local30 - local56 << 12) / local30;
		@Pc(69) int local69 = local49 >> 12;
		@Pc(76) int local76 = local49 - (local69 << 12);
		@Pc(84) int local84 = local65 * local30 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(95) int local95 = local56 + local90;
		@Pc(99) int local99 = local30 - local90;
		if (local69 == 0) {
			this.anInt5528 = local56;
			this.anInt5524 = local95;
			this.anInt5520 = local30;
		} else if (local69 == 1) {
			this.anInt5520 = local99;
			this.anInt5528 = local56;
			this.anInt5524 = local30;
		} else if (local69 == 2) {
			this.anInt5524 = local30;
			this.anInt5528 = local95;
			this.anInt5520 = local56;
		} else if (local69 == 3) {
			this.anInt5528 = local30;
			this.anInt5524 = local99;
			this.anInt5520 = local56;
		} else if (local69 == 4) {
			this.anInt5520 = local95;
			this.anInt5528 = local30;
			this.anInt5524 = local56;
		} else if (local69 == 5) {
			this.anInt5524 = local56;
			this.anInt5528 = local99;
			this.anInt5520 = local30;
		}
	}
}
