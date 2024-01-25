import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!as", name = "T", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!as", name = "Y", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!as", name = "K", descriptor = "I")
	private int anInt279 = 0;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "I")
	private int anInt282 = 0;

	@OriginalMember(owner = "client!as", name = "I", descriptor = "I")
	private int anInt277 = 0;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt282 = arg0.method4022();
		} else if (arg1 == 1) {
			this.anInt277 = (arg0.method3992() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt279 = (arg0.method3992() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(30) int[][] local30 = this.method5618(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static299.anInt5659; local56++) {
				this.method270(local34[local56], local38[local56], local42[local56]);
				this.anInt280 += this.anInt279;
				this.anInt275 += this.anInt282;
				this.anInt293 += this.anInt277;
				while (this.anInt275 < 0) {
					this.anInt275 += 4096;
				}
				if (this.anInt293 < 0) {
					this.anInt293 = 0;
				}
				while (this.anInt275 > 4096) {
					this.anInt275 -= 4096;
				}
				if (this.anInt280 < 0) {
					this.anInt280 = 0;
				}
				if (this.anInt293 > 4096) {
					this.anInt293 = 4096;
				}
				if (this.anInt280 > 4096) {
					this.anInt280 = 4096;
				}
				this.method273(this.anInt293, this.anInt275, this.anInt280);
				local46[local56] = this.anInt287;
				local50[local56] = this.anInt292;
				local54[local56] = this.anInt276;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
	private void method270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 < arg0 ? arg0 : arg1;
		@Pc(23) int local23 = local12 >= arg2 ? local12 : arg2;
		@Pc(34) int local34 = arg1 <= arg0 ? arg1 : arg0;
		@Pc(45) int local45 = local34 > arg2 ? arg2 : local34;
		this.anInt280 = (local23 + local45) / 2;
		@Pc(56) int local56 = local23 - local45;
		if (local56 <= 0) {
			this.anInt275 = 0;
		} else {
			@Pc(74) int local74 = (local23 - arg0 << 12) / local56;
			@Pc(82) int local82 = (local23 - arg1 << 12) / local56;
			@Pc(91) int local91 = (local23 - arg2 << 12) / local56;
			if (arg0 == local23) {
				this.anInt275 = local45 == arg1 ? local91 + 20480 : 4096 - local82;
			} else if (arg1 == local23) {
				this.anInt275 = local45 == arg2 ? local74 + 4096 : -local91 + 12288;
			} else {
				this.anInt275 = arg0 == local45 ? local82 + 12288 : -local74 + 20480;
			}
			this.anInt275 /= 6;
		}
		if (this.anInt280 > 0 && this.anInt280 < 4096) {
			this.anInt293 = (local56 << 12) / (this.anInt280 <= 2048 ? this.anInt280 * 2 : 8192 - (this.anInt280 * 2));
		} else {
			this.anInt293 = 0;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(IIII)V")
	private void method273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg2 + arg0 - (arg2 * arg0 >> 12);
		if (local31 <= 0) {
			this.anInt287 = this.anInt292 = this.anInt276 = arg2;
			return;
		}
		@Pc(37) int local37 = arg1 * 6;
		@Pc(44) int local44 = arg2 + arg2 - local31;
		@Pc(53) int local53 = (local31 - local44 << 12) / local31;
		@Pc(57) int local57 = local37 >> 12;
		@Pc(64) int local64 = local37 - (local57 << 12);
		@Pc(72) int local72 = local53 * local31 >> 12;
		@Pc(78) int local78 = local72 * local64 >> 12;
		@Pc(83) int local83 = local44 + local78;
		@Pc(88) int local88 = local31 - local78;
		if (local57 == 0) {
			this.anInt276 = local44;
			this.anInt292 = local83;
			this.anInt287 = local31;
			return;
		}
		if (local57 == 1) {
			this.anInt292 = local31;
			this.anInt287 = local88;
			this.anInt276 = local44;
			return;
		}
		if (local57 == 2) {
			this.anInt292 = local31;
			this.anInt276 = local83;
			this.anInt287 = local44;
			return;
		}
		if (local57 == 3) {
			this.anInt292 = local88;
			this.anInt287 = local44;
			this.anInt276 = local31;
			return;
		}
		if (local57 == 4) {
			this.anInt287 = local83;
			this.anInt292 = local44;
			this.anInt276 = local31;
			return;
		}
		if (local57 == 5) {
			this.anInt287 = local31;
			this.anInt292 = local44;
			this.anInt276 = local88;
			return;
		}
	}
}
