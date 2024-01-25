import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class6_Sub3_Sub3 extends Class6_Sub3 {

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
	private int anInt737 = 204;

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
	private int anInt740 = 8;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
	private int anInt745 = 0;

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
	private int anInt738 = 409;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
	private int anInt743 = 4;

	@OriginalMember(owner = "client!bs", name = "V", descriptor = "I")
	private int anInt752 = 81;

	@OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
	private int anInt753 = 1024;

	@OriginalMember(owner = "client!bs", name = "Y", descriptor = "I")
	private int anInt755 = 1024;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.method619();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt745 + Static564.anIntArray703[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt740 && local32 >= this.anIntArray55[local25]) {
				local25++;
			}
			@Pc(60) int local60 = local25 - 1;
			@Pc(71) boolean local71 = (local25 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray55[local25];
			@Pc(83) int local83 = this.anIntArray55[local25 - 1];
			if (local83 + this.anInt750 < local32 && local32 < local76 - this.anInt750) {
				for (@Pc(106) int local106 = 0; local106 < Static447.anInt8568; local106++) {
					@Pc(110) int local110 = 0;
					@Pc(119) int local119 = local71 ? this.anInt755 : -this.anInt755;
					@Pc(131) int local131;
					for (local131 = Static157.anIntArray321[local106] + (this.anInt744 * local119 >> 12); local131 < 0; local131 += 4096) {
					}
					while (local131 > 4096) {
						local131 -= 4096;
					}
					while (local110 < this.anInt743 && local131 >= this.anIntArrayArray7[local60][local110]) {
						local110++;
					}
					@Pc(161) int local161 = local110 - 1;
					@Pc(168) int local168 = this.anIntArrayArray7[local60][local110];
					@Pc(175) int local175 = this.anIntArrayArray7[local60][local161];
					if (local175 + this.anInt750 < local131 && local131 < local168 - this.anInt750) {
						local11[local106] = this.anIntArrayArray6[local60][local161];
					} else {
						local11[local106] = 0;
					}
				}
			} else {
				Static585.method3075(local11, 0, Static447.anInt8568, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt743 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt740 = arg1.method6041();
		} else if (arg0 == 2) {
			this.anInt738 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt737 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt755 = arg1.method6006();
		} else if (arg0 == 5) {
			this.anInt745 = arg1.method6006();
		} else if (arg0 == 6) {
			this.anInt752 = arg1.method6006();
		} else if (arg0 == 7) {
			this.anInt753 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
	private void method619() {
		@Pc(12) Random local12 = new Random((long) this.anInt740);
		this.anInt750 = this.anInt752 / 2;
		this.anInt744 = 4096 / this.anInt743;
		this.anInt751 = 4096 / this.anInt740;
		@Pc(41) int local41 = this.anInt744 / 2;
		this.anIntArrayArray6 = new int[this.anInt740][this.anInt743];
		@Pc(53) int local53 = this.anInt751 / 2;
		this.anIntArrayArray7 = new int[this.anInt740][this.anInt743 + 1];
		this.anIntArray55 = new int[this.anInt740 + 1];
		this.anIntArray55[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt740; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt751;
				local98 = (Static29.method431(4096, local12) - 2048) * this.anInt737 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local53 >> 12);
				this.anIntArray55[local76] = local106 + this.anIntArray55[local76 - 1];
			}
			this.anIntArrayArray7[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt743; local86++) {
				if (local86 > 0) {
					local98 = this.anInt744;
					@Pc(149) int local149 = (Static29.method431(4096, local12) - 2048) * this.anInt738 >> 12;
					local98 += local41 * local149 >> 12;
					this.anIntArrayArray7[local76][local86] = this.anIntArrayArray7[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray6[local76][local86] = this.anInt753 > 0 ? 4096 - Static29.method431(this.anInt753, local12) : 4096;
			}
			this.anIntArrayArray7[local76][this.anInt743] = 4096;
		}
		this.anIntArray55[this.anInt740] = 4096;
	}
}
