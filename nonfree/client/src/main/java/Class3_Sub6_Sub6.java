import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class3_Sub6_Sub6 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
	private int anInt2756;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
	private int anInt2757;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
	private int anInt2769;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	private int anInt2758 = 8;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	private int anInt2761 = 0;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
	private int anInt2762 = 1024;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
	private int anInt2765 = 409;

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
	private int anInt2770 = 81;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
	private int anInt2768 = 204;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
	private int anInt2771 = 4;

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
	private int anInt2772 = 1024;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	private void method2318() {
		@Pc(12) Random local12 = new Random((long) this.anInt2758);
		this.anInt2756 = this.anInt2770 / 2;
		this.anInt2757 = 4096 / this.anInt2771;
		this.anInt2769 = 4096 / this.anInt2758;
		@Pc(41) int local41 = this.anInt2757 / 2;
		this.anIntArrayArray22 = new int[this.anInt2758][this.anInt2771];
		this.anIntArrayArray21 = new int[this.anInt2758][this.anInt2771 + 1];
		this.anIntArray97 = new int[this.anInt2758 + 1];
		@Pc(69) int local69 = this.anInt2769 / 2;
		this.anIntArray97[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt2758; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt2769;
				local95 = (Static120.method2330(local12, 4096) - 2048) * this.anInt2768 >> 12;
				@Pc(103) int local103 = local83 + (local69 * local95 >> 12);
				this.anIntArray97[local76] = local103 + this.anIntArray97[local76 - 1];
			}
			this.anIntArrayArray21[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt2771; local83++) {
				if (local83 > 0) {
					local95 = this.anInt2757;
					@Pc(143) int local143 = (Static120.method2330(local12, 4096) - 2048) * this.anInt2765 >> 12;
					local95 += local41 * local143 >> 12;
					this.anIntArrayArray21[local76][local83] = this.anIntArrayArray21[local76][local83 - 1] + local95;
				}
				this.anIntArrayArray22[local76][local83] = this.anInt2772 <= 0 ? 4096 : 4096 - Static120.method2330(local12, this.anInt2772);
			}
			this.anIntArrayArray21[local76][this.anInt2771] = 4096;
		}
		this.anIntArray97[this.anInt2758] = 4096;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2771 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt2758 = arg0.method6814();
		} else if (arg1 == 2) {
			this.anInt2765 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt2768 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt2762 = arg0.method6811();
		} else if (arg1 == 5) {
			this.anInt2761 = arg0.method6811();
		} else if (arg1 == 6) {
			this.anInt2770 = arg0.method6811();
		} else if (arg1 == 7) {
			this.anInt2772 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt2761 + Static231.anIntArray217[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt2758 && local24 >= this.anIntArray97[local17]) {
				local17++;
			}
			@Pc(58) int local58 = local17 - 1;
			@Pc(69) boolean local69 = (local17 & 0x1) == 0;
			@Pc(74) int local74 = this.anIntArray97[local17];
			@Pc(81) int local81 = this.anIntArray97[local17 - 1];
			if (this.anInt2756 + local81 < local24 && local74 - this.anInt2756 > local24) {
				for (@Pc(100) int local100 = 0; local100 < Static481.anInt8358; local100++) {
					@Pc(111) int local111 = local69 ? this.anInt2762 : -this.anInt2762;
					@Pc(113) int local113 = 0;
					@Pc(124) int local124;
					for (local124 = (local111 * this.anInt2757 >> 12) + Static595.anIntArray600[local100]; local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (local113 < this.anInt2771 && local124 >= this.anIntArrayArray21[local58][local113]) {
						local113++;
					}
					@Pc(161) int local161 = local113 - 1;
					@Pc(168) int local168 = this.anIntArrayArray21[local58][local113];
					@Pc(175) int local175 = this.anIntArrayArray21[local58][local161];
					if (local124 > this.anInt2756 + local175 && local124 < local168 - this.anInt2756) {
						local11[local100] = this.anIntArrayArray22[local58][local161];
					} else {
						local11[local100] = 0;
					}
				}
			} else {
				Static604.method6221(local11, 0, Static481.anInt8358, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.method2318();
	}
}
