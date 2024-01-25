import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub6_Sub18 extends Class2_Sub6 {

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
	private int anInt3431;

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	private int anInt3424 = 8;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
	private int anInt3427 = 204;

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
	private int anInt3436 = 81;

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
	private int anInt3437 = 1024;

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
	private int anInt3435 = 409;

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
	private int anInt3432 = 1024;

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
	private int anInt3438 = 4;

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
	private int anInt3440 = 0;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	private void method3169() {
		@Pc(18) Random local18 = new Random((long) this.anInt3424);
		this.anInt3433 = this.anInt3436 / 2;
		this.anInt3431 = 4096 / this.anInt3424;
		this.anInt3429 = 4096 / this.anInt3438;
		@Pc(41) int local41 = this.anInt3429 / 2;
		this.anIntArrayArray21 = new int[this.anInt3424][this.anInt3438];
		this.anIntArray420 = new int[this.anInt3424 + 1];
		@Pc(60) int local60 = this.anInt3431 / 2;
		this.anIntArrayArray20 = new int[this.anInt3424][this.anInt3438 + 1];
		this.anIntArray420[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3424; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt3431;
				local98 = (Static367.method5542(4096, local18) - 2048) * this.anInt3427 >> 12;
				@Pc(106) int local106 = local86 + (local60 * local98 >> 12);
				this.anIntArray420[local76] = this.anIntArray420[local76 - 1] + local106;
			}
			this.anIntArrayArray20[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt3438; local86++) {
				if (local86 > 0) {
					local98 = this.anInt3429;
					@Pc(149) int local149 = (Static367.method5542(4096, local18) - 2048) * this.anInt3435 >> 12;
					local98 += local41 * local149 >> 12;
					this.anIntArrayArray20[local76][local86] = local98 + this.anIntArrayArray20[local76][local86 - 1];
				}
				this.anIntArrayArray21[local76][local86] = this.anInt3432 <= 0 ? 4096 : 4096 - Static367.method5542(this.anInt3432, local18);
			}
			this.anIntArrayArray20[local76][this.anInt3438] = 4096;
		}
		this.anIntArray420[this.anInt3424] = 4096;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt3440 + Static138.anIntArray291[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3424 > local23 && local30 >= this.anIntArray420[local23]) {
				local23++;
			}
			@Pc(60) int local60 = local23 - 1;
			@Pc(68) boolean local68 = (local23 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray420[local23];
			@Pc(80) int local80 = this.anIntArray420[local23 - 1];
			if (local30 > local80 + this.anInt3433 && local30 < local73 - this.anInt3433) {
				for (@Pc(102) int local102 = 0; local102 < Static151.anInt2711; local102++) {
					@Pc(106) int local106 = 0;
					@Pc(115) int local115 = local68 ? this.anInt3437 : -this.anInt3437;
					@Pc(126) int local126;
					for (local126 = Static160.anIntArray329[local102] + (local115 * this.anInt3429 >> 12); local126 < 0; local126 += 4096) {
					}
					while (local126 > 4096) {
						local126 -= 4096;
					}
					while (this.anInt3438 > local106 && this.anIntArrayArray20[local60][local106] <= local126) {
						local106++;
					}
					@Pc(160) int local160 = local106 - 1;
					@Pc(167) int local167 = this.anIntArrayArray20[local60][local106];
					@Pc(174) int local174 = this.anIntArrayArray20[local60][local160];
					if (local126 > local174 + this.anInt3433 && local126 < local167 - this.anInt3433) {
						local17[local102] = this.anIntArrayArray21[local60][local160];
					} else {
						local17[local102] = 0;
					}
				}
			} else {
				Static406.method5655(local17, 0, Static151.anInt2711, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3438 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt3424 = arg0.method4240();
		} else if (arg1 == 2) {
			this.anInt3435 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt3427 = arg0.method4245();
		} else if (arg1 == 4) {
			this.anInt3437 = arg0.method4245();
		} else if (arg1 == 5) {
			this.anInt3440 = arg0.method4245();
		} else if (arg1 == 6) {
			this.anInt3436 = arg0.method4245();
		} else if (arg1 == 7) {
			this.anInt3432 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.method3169();
	}
}
