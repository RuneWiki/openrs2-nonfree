import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class6_Sub4_Sub15 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!gba", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
	private int anInt3297;

	@OriginalMember(owner = "client!gba", name = "M", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!gba", name = "U", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
	private int anInt3291 = 204;

	@OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
	private int anInt3295 = 4;

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
	private int anInt3287 = 0;

	@OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
	private int anInt3294 = 1024;

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
	private int anInt3292 = 409;

	@OriginalMember(owner = "client!gba", name = "R", descriptor = "I")
	private int anInt3300 = 81;

	@OriginalMember(owner = "client!gba", name = "O", descriptor = "I")
	private int anInt3299 = 1024;

	@OriginalMember(owner = "client!gba", name = "T", descriptor = "I")
	private int anInt3302 = 8;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt3295 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt3302 = arg1.method6069();
		} else if (arg0 == 2) {
			this.anInt3292 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt3291 = arg1.method6003();
		} else if (arg0 == 4) {
			this.anInt3299 = arg1.method6003();
		} else if (arg0 == 5) {
			this.anInt3287 = arg1.method6003();
		} else if (arg0 == 6) {
			this.anInt3300 = arg1.method6003();
		} else if (arg0 == 7) {
			this.anInt3294 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt3287 + Static501.anIntArray637[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt3302 && local32 >= this.anIntArray198[local25]) {
				local25++;
			}
			@Pc(66) int local66 = local25 - 1;
			@Pc(77) boolean local77 = (local25 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray198[local25];
			@Pc(89) int local89 = this.anIntArray198[local25 - 1];
			if (this.anInt3297 + local89 < local32 && local32 < local82 - this.anInt3297) {
				for (@Pc(119) int local119 = 0; local119 < Static408.anInt7209; local119++) {
					@Pc(130) int local130 = local77 ? this.anInt3299 : -this.anInt3299;
					@Pc(132) int local132 = 0;
					@Pc(143) int local143;
					for (local143 = (local130 * this.anInt3303 >> 12) + Static398.anIntArray514[local119]; local143 < 0; local143 += 4096) {
					}
					while (local143 > 4096) {
						local143 -= 4096;
					}
					while (this.anInt3295 > local132 && this.anIntArrayArray17[local66][local132] <= local143) {
						local132++;
					}
					@Pc(180) int local180 = local132 - 1;
					@Pc(187) int local187 = this.anIntArrayArray17[local66][local180];
					@Pc(194) int local194 = this.anIntArrayArray17[local66][local132];
					if (this.anInt3297 + local187 < local143 && local194 - this.anInt3297 > local143) {
						local19[local119] = this.anIntArrayArray18[local66][local180];
					} else {
						local19[local119] = 0;
					}
				}
			} else {
				Static601.method2939(local19, 0, Static408.anInt7209, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V")
	private void method2903() {
		@Pc(12) Random local12 = new Random((long) this.anInt3302);
		this.anInt3297 = this.anInt3300 / 2;
		this.anInt3296 = 4096 / this.anInt3302;
		this.anInt3303 = 4096 / this.anInt3295;
		@Pc(41) int local41 = this.anInt3303 / 2;
		this.anIntArrayArray18 = new int[this.anInt3302][this.anInt3295];
		this.anIntArray198 = new int[this.anInt3302 + 1];
		@Pc(60) int local60 = this.anInt3296 / 2;
		this.anIntArrayArray17 = new int[this.anInt3302][this.anInt3295 + 1];
		this.anIntArray198[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3302; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt3296;
				local95 = (Static411.method7689(4096, local12) - 2048) * this.anInt3291 >> 12;
				@Pc(103) int local103 = local83 + (local60 * local95 >> 12);
				this.anIntArray198[local76] = this.anIntArray198[local76 - 1] + local103;
			}
			this.anIntArrayArray17[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt3295; local83++) {
				if (local83 > 0) {
					local95 = this.anInt3303;
					@Pc(144) int local144 = (Static411.method7689(4096, local12) - 2048) * this.anInt3292 >> 12;
					local95 += local144 * local41 >> 12;
					this.anIntArrayArray17[local76][local83] = this.anIntArrayArray17[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray18[local76][local83] = this.anInt3294 > 0 ? 4096 - Static411.method7689(this.anInt3294, local12) : 4096;
			}
			this.anIntArrayArray17[local76][this.anInt3295] = 4096;
		}
		this.anIntArray198[this.anInt3302] = 4096;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.method2903();
	}
}
