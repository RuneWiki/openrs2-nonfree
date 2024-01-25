import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
	private int anInt6731;

	@OriginalMember(owner = "client!oea", name = "R", descriptor = "I")
	private int anInt6734;

	@OriginalMember(owner = "client!oea", name = "U", descriptor = "I")
	private int anInt6737;

	@OriginalMember(owner = "client!oea", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!oea", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!oea", name = "eb", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
	private int anInt6726 = 204;

	@OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
	private int anInt6728 = 1024;

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
	private int anInt6727 = 81;

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
	private int anInt6729 = 1024;

	@OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
	private int anInt6730 = 8;

	@OriginalMember(owner = "client!oea", name = "Y", descriptor = "I")
	private int anInt6739 = 409;

	@OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
	private int anInt6732 = 0;

	@OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
	private int anInt6725 = 4;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6725 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt6730 = arg0.method4325();
		} else if (arg1 == 2) {
			this.anInt6739 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt6726 = arg0.method4294();
		} else if (arg1 == 4) {
			this.anInt6729 = arg0.method4294();
		} else if (arg1 == 5) {
			this.anInt6732 = arg0.method4294();
		} else if (arg1 == 6) {
			this.anInt6727 = arg0.method4294();
		} else if (arg1 == 7) {
			this.anInt6728 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(17) int local17 = 0;
			@Pc(25) int local25;
			for (local25 = Static211.anIntArray576[arg0] + this.anInt6732; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (local17 < this.anInt6730 && this.anIntArray460[local17] <= local25) {
				local17++;
			}
			@Pc(53) int local53 = local17 - 1;
			@Pc(64) boolean local64 = (local17 & 0x1) == 0;
			@Pc(69) int local69 = this.anIntArray460[local17];
			@Pc(76) int local76 = this.anIntArray460[local17 - 1];
			if (local76 + this.anInt6731 < local25 && local25 < local69 - this.anInt6731) {
				for (@Pc(101) int local101 = 0; local101 < Static153.anInt3070; local101++) {
					@Pc(105) int local105 = 0;
					@Pc(114) int local114 = local64 ? this.anInt6729 : -this.anInt6729;
					@Pc(125) int local125;
					for (local125 = Static260.anIntArray327[local101] + (local114 * this.anInt6734 >> 12); local125 < 0; local125 += 4096) {
					}
					while (local125 > 4096) {
						local125 -= 4096;
					}
					while (local105 < this.anInt6725 && local125 >= this.anIntArrayArray40[local53][local105]) {
						local105++;
					}
					@Pc(163) int local163 = local105 - 1;
					@Pc(170) int local170 = this.anIntArrayArray40[local53][local163];
					@Pc(177) int local177 = this.anIntArrayArray40[local53][local105];
					if (local125 > local170 + this.anInt6731 && local125 < local177 - this.anInt6731) {
						local11[local101] = this.anIntArrayArray41[local53][local163];
					} else {
						local11[local101] = 0;
					}
				}
			} else {
				Static598.method1134(local11, 0, Static153.anInt3070, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "(I)V")
	private void method5626() {
		@Pc(12) Random local12 = new Random((long) this.anInt6730);
		this.anInt6731 = this.anInt6727 / 2;
		this.anInt6734 = 4096 / this.anInt6725;
		this.anInt6737 = 4096 / this.anInt6730;
		@Pc(35) int local35 = this.anInt6734 / 2;
		this.anIntArrayArray40 = new int[this.anInt6730][this.anInt6725 + 1];
		@Pc(49) int local49 = this.anInt6737 / 2;
		this.anIntArrayArray41 = new int[this.anInt6730][this.anInt6725];
		this.anIntArray460 = new int[this.anInt6730 + 1];
		this.anIntArray460[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt6730; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt6737;
				local92 = (Static233.method3629(local12, 4096) - 2048) * this.anInt6726 >> 12;
				@Pc(100) int local100 = local80 + (local92 * local49 >> 12);
				this.anIntArray460[local70] = local100 + this.anIntArray460[local70 - 1];
			}
			this.anIntArrayArray40[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt6725; local80++) {
				if (local80 > 0) {
					local92 = this.anInt6734;
					@Pc(145) int local145 = (Static233.method3629(local12, 4096) - 2048) * this.anInt6739 >> 12;
					local92 += local145 * local35 >> 12;
					this.anIntArrayArray40[local70][local80] = local92 + this.anIntArrayArray40[local70][local80 - 1];
				}
				this.anIntArrayArray41[local70][local80] = this.anInt6728 > 0 ? 4096 - Static233.method3629(local12, this.anInt6728) : 4096;
			}
			this.anIntArrayArray40[local70][this.anInt6725] = 4096;
		}
		this.anIntArray460[this.anInt6730] = 4096;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.method5626();
	}
}
