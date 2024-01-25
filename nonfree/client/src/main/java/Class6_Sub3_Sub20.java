import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class6_Sub3_Sub20 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt4274;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
	private int anInt4280;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
	private int anInt4281;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	private int anInt4272 = 0;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt4273 = 1024;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	private int anInt4276 = 409;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
	private int anInt4279 = 81;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	private int anInt4288 = 8;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
	private int anInt4283 = 1024;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
	private int anInt4286 = 204;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private int anInt4275 = 4;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.method3678();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static77.anIntArray116[arg0] + this.anInt4272; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt4288 && local29 >= this.anIntArray355[local22]) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(77) boolean local77 = (local22 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray355[local22];
			@Pc(89) int local89 = this.anIntArray355[local22 - 1];
			if (local89 + this.anInt4281 < local29 && local82 - this.anInt4281 > local29) {
				for (@Pc(113) int local113 = 0; local113 < Static35.anInt670; local113++) {
					@Pc(117) int local117 = 0;
					@Pc(126) int local126 = local77 ? this.anInt4283 : -this.anInt4283;
					@Pc(137) int local137;
					for (local137 = Static372.anIntArray481[local113] + (local126 * this.anInt4280 >> 12); local137 < 0; local137 += 4096) {
					}
					while (local137 > 4096) {
						local137 -= 4096;
					}
					while (this.anInt4275 > local117 && local137 >= this.anIntArrayArray36[local66][local117]) {
						local117++;
					}
					@Pc(170) int local170 = local117 - 1;
					@Pc(177) int local177 = this.anIntArrayArray36[local66][local117];
					@Pc(184) int local184 = this.anIntArrayArray36[local66][local170];
					if (local184 + this.anInt4281 < local137 && local137 < local177 - this.anInt4281) {
						local16[local113] = this.anIntArrayArray37[local66][local170];
					} else {
						local16[local113] = 0;
					}
				}
			} else {
				Static596.method7718(local16, 0, Static35.anInt670, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4275 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt4288 = arg1.method6019();
		} else if (arg0 == 2) {
			this.anInt4276 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt4286 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt4283 = arg1.method6044();
		} else if (arg0 == 5) {
			this.anInt4272 = arg1.method6044();
		} else if (arg0 == 6) {
			this.anInt4279 = arg1.method6044();
		} else if (arg0 == 7) {
			this.anInt4273 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
	private void method3678() {
		@Pc(18) Random local18 = new Random((long) this.anInt4288);
		this.anInt4281 = this.anInt4279 / 2;
		this.anInt4280 = 4096 / this.anInt4275;
		this.anInt4274 = 4096 / this.anInt4288;
		@Pc(41) int local41 = this.anInt4280 / 2;
		this.anIntArray355 = new int[this.anInt4288 + 1];
		this.anIntArrayArray36 = new int[this.anInt4288][this.anInt4275 + 1];
		@Pc(62) int local62 = this.anInt4274 / 2;
		this.anIntArrayArray37 = new int[this.anInt4288][this.anInt4275];
		this.anIntArray355[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt4288; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt4274;
				local95 = (Static309.method4643(local18, 4096) - 2048) * this.anInt4286 >> 12;
				@Pc(103) int local103 = local83 + (local62 * local95 >> 12);
				this.anIntArray355[local76] = this.anIntArray355[local76 - 1] + local103;
			}
			this.anIntArrayArray36[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt4275; local83++) {
				if (local83 > 0) {
					local95 = this.anInt4280;
					@Pc(147) int local147 = (Static309.method4643(local18, 4096) - 2048) * this.anInt4276 >> 12;
					local95 += local147 * local41 >> 12;
					this.anIntArrayArray36[local76][local83] = local95 + this.anIntArrayArray36[local76][local83 - 1];
				}
				this.anIntArrayArray37[local76][local83] = this.anInt4273 > 0 ? 4096 - Static309.method4643(local18, this.anInt4273) : 4096;
			}
			this.anIntArrayArray36[local76][this.anInt4275] = 4096;
		}
		this.anIntArray355[this.anInt4288] = 4096;
	}
}
