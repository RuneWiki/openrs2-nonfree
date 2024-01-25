import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class5_Sub2_Sub22 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt3652;

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
	private int anInt3662;

	@OriginalMember(owner = "client!lr", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!lr", name = "fb", descriptor = "I")
	private int anInt3666;

	@OriginalMember(owner = "client!lr", name = "gb", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt3651 = 1024;

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
	private int anInt3658 = 81;

	@OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
	private int anInt3663 = 204;

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
	private int anInt3661 = 4;

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
	private int anInt3659 = 0;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
	private int anInt3655 = 1024;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt3649 = 8;

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
	private int anInt3653 = 409;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	private void method3375() {
		@Pc(16) Random local16 = new Random((long) this.anInt3649);
		this.anInt3652 = 4096 / this.anInt3649;
		this.anInt3662 = 4096 / this.anInt3661;
		this.anInt3666 = this.anInt3658 / 2;
		@Pc(39) int local39 = this.anInt3662 / 2;
		this.anIntArrayArray29 = new int[this.anInt3649][this.anInt3661 + 1];
		this.anIntArrayArray30 = new int[this.anInt3649][this.anInt3661];
		this.anIntArray271 = new int[this.anInt3649 + 1];
		@Pc(67) int local67 = this.anInt3652 / 2;
		this.anIntArray271[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt3649; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt3652;
				local96 = (Static210.method4979(4096, local16) - 2048) * this.anInt3663 >> 12;
				@Pc(104) int local104 = local84 + (local67 * local96 >> 12);
				this.anIntArray271[local74] = local104 + this.anIntArray271[local74 - 1];
			}
			this.anIntArrayArray29[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt3661; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3662;
					@Pc(144) int local144 = (Static210.method4979(4096, local16) - 2048) * this.anInt3653 >> 12;
					local96 += local144 * local39 >> 12;
					this.anIntArrayArray29[local74][local84] = local96 + this.anIntArrayArray29[local74][local84 - 1];
				}
				this.anIntArrayArray30[local74][local84] = this.anInt3651 <= 0 ? 4096 : 4096 - Static210.method4979(this.anInt3651, local16);
			}
			this.anIntArrayArray29[local74][this.anInt3661] = 4096;
		}
		this.anIntArray271[this.anInt3649] = 4096;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3661 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt3649 = arg0.method1832();
		} else if (arg1 == 2) {
			this.anInt3653 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt3663 = arg0.method1845();
		} else if (arg1 == 4) {
			this.anInt3655 = arg0.method1845();
		} else if (arg1 == 5) {
			this.anInt3659 = arg0.method1845();
		} else if (arg1 == 6) {
			this.anInt3658 = arg0.method1845();
		} else if (arg1 == 7) {
			this.anInt3651 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.method3375();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = this.anInt3659 + Static287.anIntArray413[arg0]; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (this.anInt3649 > local24 && this.anIntArray271[local24] <= local31) {
				local24++;
			}
			@Pc(70) int local70 = local24 - 1;
			@Pc(78) boolean local78 = (local24 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray271[local24];
			@Pc(90) int local90 = this.anIntArray271[local24 - 1];
			if (local90 + this.anInt3666 < local31 && local83 - this.anInt3666 > local31) {
				for (@Pc(109) int local109 = 0; local109 < Static15.anInt493; local109++) {
					@Pc(113) int local113 = 0;
					@Pc(122) int local122 = local78 ? this.anInt3655 : -this.anInt3655;
					@Pc(133) int local133;
					for (local133 = (this.anInt3662 * local122 >> 12) + Static257.anIntArray386[local109]; local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt3661 > local113 && this.anIntArrayArray29[local70][local113] <= local133) {
						local113++;
					}
					@Pc(169) int local169 = local113 - 1;
					@Pc(176) int local176 = this.anIntArrayArray29[local70][local169];
					@Pc(183) int local183 = this.anIntArrayArray29[local70][local113];
					if (this.anInt3666 + local176 < local133 && local133 < local183 - this.anInt3666) {
						local18[local109] = this.anIntArrayArray30[local70][local169];
					} else {
						local18[local109] = 0;
					}
				}
			} else {
				Static359.method754(local18, 0, Static15.anInt493, 0);
			}
		}
		return local18;
	}
}
