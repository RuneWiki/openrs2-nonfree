import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!au", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!au", name = "L", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!au", name = "N", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!au", name = "O", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!au", name = "X", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!au", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!au", name = "J", descriptor = "I")
	private int anInt473 = 8;

	@OriginalMember(owner = "client!au", name = "H", descriptor = "I")
	private int anInt471 = 1024;

	@OriginalMember(owner = "client!au", name = "F", descriptor = "I")
	private int anInt469 = 0;

	@OriginalMember(owner = "client!au", name = "K", descriptor = "I")
	private int anInt474 = 204;

	@OriginalMember(owner = "client!au", name = "E", descriptor = "I")
	private int anInt468 = 81;

	@OriginalMember(owner = "client!au", name = "Q", descriptor = "I")
	private int anInt478 = 409;

	@OriginalMember(owner = "client!au", name = "S", descriptor = "I")
	private int anInt480 = 4;

	@OriginalMember(owner = "client!au", name = "ab", descriptor = "I")
	private int anInt486 = 1024;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.method376();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt480 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt473 = arg1.method5539();
		} else if (arg0 == 2) {
			this.anInt478 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt474 = arg1.method5598();
		} else if (arg0 == 4) {
			this.anInt471 = arg1.method5598();
		} else if (arg0 == 5) {
			this.anInt469 = arg1.method5598();
		} else if (arg0 == 6) {
			this.anInt468 = arg1.method5598();
		} else if (arg0 == 7) {
			this.anInt486 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(B)V")
	private void method376() {
		@Pc(12) Random local12 = new Random((long) this.anInt473);
		this.anInt484 = this.anInt468 / 2;
		this.anInt476 = 4096 / this.anInt480;
		this.anInt477 = 4096 / this.anInt473;
		@Pc(35) int local35 = this.anInt476 / 2;
		this.anIntArrayArray3 = new int[this.anInt473][this.anInt480 + 1];
		@Pc(49) int local49 = this.anInt477 / 2;
		this.anIntArray18 = new int[this.anInt473 + 1];
		this.anIntArrayArray2 = new int[this.anInt473][this.anInt480];
		this.anIntArray18[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt473; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt477;
				local95 = (Static44.method700(4096, local12) - 2048) * this.anInt474 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local49 >> 12);
				this.anIntArray18[local76] = local103 + this.anIntArray18[local76 - 1];
			}
			this.anIntArrayArray3[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt480; local83++) {
				if (local83 > 0) {
					local95 = this.anInt476;
					@Pc(146) int local146 = (Static44.method700(4096, local12) - 2048) * this.anInt478 >> 12;
					local95 += local146 * local35 >> 12;
					this.anIntArrayArray3[local76][local83] = this.anIntArrayArray3[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray2[local76][local83] = this.anInt486 > 0 ? 4096 - Static44.method700(this.anInt486, local12) : 4096;
			}
			this.anIntArrayArray3[local76][this.anInt480] = 4096;
		}
		this.anIntArray18[this.anInt473] = 4096;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt469 + Static346.anIntArray401[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt473 > local23 && local30 >= this.anIntArray18[local23]) {
				local23++;
			}
			@Pc(65) int local65 = local23 - 1;
			@Pc(76) boolean local76 = (local23 & 0x1) == 0;
			@Pc(81) int local81 = this.anIntArray18[local23];
			@Pc(88) int local88 = this.anIntArray18[local23 - 1];
			if (this.anInt484 + local88 < local30 && local81 - this.anInt484 > local30) {
				for (@Pc(114) int local114 = 0; local114 < Static148.anInt2666; local114++) {
					@Pc(125) int local125 = local76 ? this.anInt471 : -this.anInt471;
					@Pc(127) int local127 = 0;
					@Pc(138) int local138;
					for (local138 = (local125 * this.anInt476 >> 12) + Static224.anIntArray234[local114]; local138 < 0; local138 += 4096) {
					}
					while (local138 > 4096) {
						local138 -= 4096;
					}
					while (this.anInt480 > local127 && this.anIntArrayArray3[local65][local127] <= local138) {
						local127++;
					}
					@Pc(171) int local171 = local127 - 1;
					@Pc(178) int local178 = this.anIntArrayArray3[local65][local127];
					@Pc(185) int local185 = this.anIntArrayArray3[local65][local171];
					if (local138 > local185 + this.anInt484 && local138 < local178 - this.anInt484) {
						local11[local114] = this.anIntArrayArray2[local65][local171];
					} else {
						local11[local114] = 0;
					}
				}
			} else {
				Static468.method3861(local11, 0, Static148.anInt2666, 0);
			}
		}
		return local11;
	}
}
