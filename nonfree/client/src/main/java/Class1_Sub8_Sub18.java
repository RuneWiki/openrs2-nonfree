import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub8_Sub18 extends Class1_Sub8 {

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	private int anInt5124;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
	private int anInt5130;

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt5118 = 1024;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	private int anInt5123 = 0;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
	private int anInt5126 = 1024;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	private int anInt5125 = 409;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
	private int anInt5128 = 81;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	private int anInt5121 = 8;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
	private int anInt5133 = 4;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	private int anInt5131 = 204;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	private void method3932() {
		@Pc(12) Random local12 = new Random((long) this.anInt5121);
		this.anInt5120 = this.anInt5128 / 2;
		this.anInt5130 = 4096 / this.anInt5133;
		this.anInt5124 = 4096 / this.anInt5121;
		@Pc(35) int local35 = this.anInt5130 / 2;
		@Pc(40) int local40 = this.anInt5124 / 2;
		this.anIntArray483 = new int[this.anInt5121 + 1];
		this.anIntArrayArray41 = new int[this.anInt5121][this.anInt5133 + 1];
		this.anIntArrayArray42 = new int[this.anInt5121][this.anInt5133];
		this.anIntArray483[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt5121; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt5124;
				local100 = (Static70.method1340(local12, 4096) - 2048) * this.anInt5131 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local40 >> 12);
				this.anIntArray483[local78] = local108 + this.anIntArray483[local78 - 1];
			}
			this.anIntArrayArray41[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt5133; local88++) {
				if (local88 > 0) {
					local100 = this.anInt5130;
					@Pc(148) int local148 = (Static70.method1340(local12, 4096) - 2048) * this.anInt5125 >> 12;
					local100 += local148 * local35 >> 12;
					this.anIntArrayArray41[local78][local88] = this.anIntArrayArray41[local78][local88 - 1] + local100;
				}
				this.anIntArrayArray42[local78][local88] = this.anInt5118 > 0 ? 4096 - Static70.method1340(local12, this.anInt5118) : 4096;
			}
			this.anIntArrayArray41[local78][this.anInt5133] = 4096;
		}
		this.anIntArray483[this.anInt5121] = 4096;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt5123 + Static134.anIntArray308[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt5121 && this.anIntArray483[local25] <= local32) {
				local25++;
			}
			@Pc(64) int local64 = local25 - 1;
			@Pc(72) boolean local72 = (local25 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray483[local25];
			@Pc(84) int local84 = this.anIntArray483[local25 - 1];
			if (local32 > local84 + this.anInt5120 && local32 < local77 - this.anInt5120) {
				for (@Pc(103) int local103 = 0; local103 < Static18.anInt439; local103++) {
					@Pc(114) int local114 = local72 ? this.anInt5126 : -this.anInt5126;
					@Pc(116) int local116 = 0;
					@Pc(127) int local127;
					for (local127 = Static198.anIntArray749[local103] + (this.anInt5130 * local114 >> 12); local127 < 0; local127 += 4096) {
					}
					while (local127 > 4096) {
						local127 -= 4096;
					}
					while (this.anInt5133 > local116 && local127 >= this.anIntArrayArray41[local64][local116]) {
						local116++;
					}
					@Pc(163) int local163 = local116 - 1;
					@Pc(170) int local170 = this.anIntArrayArray41[local64][local163];
					@Pc(177) int local177 = this.anIntArrayArray41[local64][local116];
					if (local170 + this.anInt5120 < local127 && local127 < local177 - this.anInt5120) {
						local19[local103] = this.anIntArrayArray42[local64][local163];
					} else {
						local19[local103] = 0;
					}
				}
			} else {
				Static469.method6015(local19, 0, Static18.anInt439, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.method3932();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5133 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt5121 = arg1.method1171();
		} else if (arg0 == 2) {
			this.anInt5125 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt5131 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt5126 = arg1.method1177();
		} else if (arg0 == 5) {
			this.anInt5123 = arg1.method1177();
		} else if (arg0 == 6) {
			this.anInt5128 = arg1.method1177();
		} else if (arg0 == 7) {
			this.anInt5118 = arg1.method1177();
		}
	}
}
