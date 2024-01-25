import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "K", descriptor = "I")
	private int anInt5518;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	private int anInt5525;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	private int anInt5531;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "I")
	private int anInt5517 = 1024;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "I")
	private int anInt5516 = 4;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	private int anInt5519 = 0;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	private int anInt5523 = 409;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "I")
	private int anInt5526 = 204;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	private int anInt5532 = 8;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "I")
	private int anInt5527 = 81;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
	private int anInt5535 = 1024;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	private void method5048() {
		@Pc(18) Random local18 = new Random((long) this.anInt5532);
		this.anInt5531 = 4096 / this.anInt5532;
		this.anInt5525 = 4096 / this.anInt5516;
		this.anInt5518 = this.anInt5527 / 2;
		@Pc(41) int local41 = this.anInt5525 / 2;
		this.anIntArrayArray61 = new int[this.anInt5532][this.anInt5516 + 1];
		this.anIntArrayArray62 = new int[this.anInt5532][this.anInt5516];
		@Pc(62) int local62 = this.anInt5531 / 2;
		this.anIntArray423 = new int[this.anInt5532 + 1];
		this.anIntArray423[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5532; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt5531;
				local95 = (Static297.method5193(local18, 4096) - 2048) * this.anInt5526 >> 12;
				@Pc(103) int local103 = local83 + (local62 * local95 >> 12);
				this.anIntArray423[local76] = local103 + this.anIntArray423[local76 - 1];
			}
			this.anIntArrayArray61[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt5516; local83++) {
				if (local83 > 0) {
					local95 = this.anInt5525;
					@Pc(143) int local143 = (Static297.method5193(local18, 4096) - 2048) * this.anInt5523 >> 12;
					local95 += local41 * local143 >> 12;
					this.anIntArrayArray61[local76][local83] = this.anIntArrayArray61[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray62[local76][local83] = this.anInt5517 > 0 ? 4096 - Static297.method5193(local18, this.anInt5517) : 4096;
			}
			this.anIntArrayArray61[local76][this.anInt5516] = 4096;
		}
		this.anIntArray423[this.anInt5532] = 4096;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.method5048();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5516 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt5532 = arg1.method2132();
		} else if (arg0 == 2) {
			this.anInt5523 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt5526 = arg1.method2161();
		} else if (arg0 == 4) {
			this.anInt5535 = arg1.method2161();
		} else if (arg0 == 5) {
			this.anInt5519 = arg1.method2161();
		} else if (arg0 == 6) {
			this.anInt5527 = arg1.method2161();
		} else if (arg0 == 7) {
			this.anInt5517 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt5519 + Static60.anIntArray122[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt5532 > local23 && this.anIntArray423[local23] <= local30) {
				local23++;
			}
			@Pc(64) int local64 = local23 - 1;
			@Pc(75) boolean local75 = (local23 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray423[local23];
			@Pc(87) int local87 = this.anIntArray423[local23 - 1];
			if (this.anInt5518 + local87 < local30 && local80 - this.anInt5518 > local30) {
				for (@Pc(102) int local102 = 0; local102 < Static85.anInt1910; local102++) {
					@Pc(106) int local106 = 0;
					@Pc(115) int local115 = local75 ? this.anInt5535 : -this.anInt5535;
					@Pc(126) int local126;
					for (local126 = (local115 * this.anInt5525 >> 12) + Static273.anIntArray414[local102]; local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (this.anInt5516 > local106 && this.anIntArrayArray61[local64][local106] <= local126) {
						local106++;
					}
					@Pc(161) int local161 = local106 - 1;
					@Pc(168) int local168 = this.anIntArrayArray61[local64][local106];
					@Pc(175) int local175 = this.anIntArrayArray61[local64][local161];
					if (local126 > this.anInt5518 + local175 && local168 - this.anInt5518 > local126) {
						local11[local102] = this.anIntArrayArray62[local64][local161];
					} else {
						local11[local102] = 0;
					}
				}
			} else {
				Static374.method2829(local11, 0, Static85.anInt1910, 0);
			}
		}
		return local11;
	}
}
