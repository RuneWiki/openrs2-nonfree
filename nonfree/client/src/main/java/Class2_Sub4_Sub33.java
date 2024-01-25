import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class2_Sub4_Sub33 extends Class2_Sub4 {

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
	private int anInt8793;

	@OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
	private int anInt8795;

	@OriginalMember(owner = "client!uea", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!uea", name = "O", descriptor = "[I")
	private int[] anIntArray574;

	@OriginalMember(owner = "client!uea", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!uea", name = "V", descriptor = "I")
	private int anInt8803;

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "I")
	private int anInt8787 = 1024;

	@OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
	private int anInt8789 = 1024;

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
	private int anInt8791 = 204;

	@OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
	private int anInt8794 = 0;

	@OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
	private int anInt8797 = 8;

	@OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
	private int anInt8801 = 4;

	@OriginalMember(owner = "client!uea", name = "S", descriptor = "I")
	private int anInt8800 = 409;

	@OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
	private int anInt8798 = 81;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8801 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt8797 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt8800 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt8791 = arg1.method4518();
		} else if (arg0 == 4) {
			this.anInt8787 = arg1.method4518();
		} else if (arg0 == 5) {
			this.anInt8794 = arg1.method4518();
		} else if (arg0 == 6) {
			this.anInt8798 = arg1.method4518();
		} else if (arg0 == 7) {
			this.anInt8789 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.method7023();
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static13.anIntArray418[arg0] + this.anInt8794; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt8797 && this.anIntArray574[local22] <= local29) {
				local22++;
			}
			@Pc(61) int local61 = local22 - 1;
			@Pc(72) boolean local72 = (local22 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray574[local22];
			@Pc(84) int local84 = this.anIntArray574[local22 - 1];
			if (local84 + this.anInt8803 < local29 && local77 - this.anInt8803 > local29) {
				for (@Pc(99) int local99 = 0; local99 < Static143.anInt7434; local99++) {
					@Pc(103) int local103 = 0;
					@Pc(112) int local112 = local72 ? this.anInt8787 : -this.anInt8787;
					@Pc(123) int local123;
					for (local123 = (this.anInt8795 * local112 >> 12) + Static519.anIntArray155[local99]; local123 < 0; local123 += 4096) {
					}
					while (local123 > 4096) {
						local123 -= 4096;
					}
					while (local103 < this.anInt8801 && this.anIntArrayArray59[local61][local103] <= local123) {
						local103++;
					}
					@Pc(166) int local166 = local103 - 1;
					@Pc(173) int local173 = this.anIntArrayArray59[local61][local103];
					@Pc(180) int local180 = this.anIntArrayArray59[local61][local166];
					if (local123 > this.anInt8803 + local180 && local123 < local173 - this.anInt8803) {
						local16[local99] = this.anIntArrayArray58[local61][local166];
					} else {
						local16[local99] = 0;
					}
				}
			} else {
				Static598.method4260(local16, 0, Static143.anInt7434, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "(I)V")
	private void method7023() {
		@Pc(12) Random local12 = new Random((long) this.anInt8797);
		this.anInt8793 = 4096 / this.anInt8797;
		this.anInt8803 = this.anInt8798 / 2;
		this.anInt8795 = 4096 / this.anInt8801;
		@Pc(35) int local35 = this.anInt8795 / 2;
		this.anIntArray574 = new int[this.anInt8797 + 1];
		@Pc(47) int local47 = this.anInt8793 / 2;
		this.anIntArrayArray59 = new int[this.anInt8797][this.anInt8801 + 1];
		this.anIntArrayArray58 = new int[this.anInt8797][this.anInt8801];
		this.anIntArray574[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt8797; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt8793;
				local92 = (Static328.method4754(local12, 4096) - 2048) * this.anInt8791 >> 12;
				@Pc(100) int local100 = local80 + (local47 * local92 >> 12);
				this.anIntArray574[local70] = local100 + this.anIntArray574[local70 - 1];
			}
			this.anIntArrayArray59[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt8801; local80++) {
				if (local80 > 0) {
					local92 = this.anInt8795;
					@Pc(140) int local140 = (Static328.method4754(local12, 4096) - 2048) * this.anInt8800 >> 12;
					local92 += local140 * local35 >> 12;
					this.anIntArrayArray59[local70][local80] = this.anIntArrayArray59[local70][local80 - 1] + local92;
				}
				this.anIntArrayArray58[local70][local80] = this.anInt8789 <= 0 ? 4096 : 4096 - Static328.method4754(local12, this.anInt8789);
			}
			this.anIntArrayArray59[local70][this.anInt8801] = 4096;
		}
		this.anIntArray574[this.anInt8797] = 4096;
	}
}
