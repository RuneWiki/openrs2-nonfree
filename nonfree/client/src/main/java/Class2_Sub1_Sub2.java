import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!b", name = "db", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static11.anIntArray8[arg0] + this.anInt252; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt235 > local22 && local30 >= this.anIntArray6[local22]) {
				local22++;
			}
			@Pc(67) float local67 = (float) this.anIntArray6[local22];
			@Pc(75) float local75 = (float) this.anIntArray6[local22 - 1];
			if ((float) local30 > local75 + (float) this.anInt238 && (float) -this.anInt238 + local67 > (float) local30) {
				for (@Pc(103) int local103 = 0; local103 < Static120.anInt2812; local103++) {
					@Pc(119) int local119 = local22 % 2 == 0 ? this.anInt230 : -this.anInt230;
					@Pc(121) int local121 = 0;
					@Pc(133) int local133;
					for (local133 = Static69.anIntArray117[local103] + (local119 * this.anInt237 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt247 > local121 && this.anIntArrayArray4[local22 - 1][local121] <= local133) {
						local121++;
					}
					@Pc(177) float local177 = (float) this.anIntArrayArray4[local22 - 1][local121];
					@Pc(189) float local189 = (float) this.anIntArrayArray4[local22 - 1][local121 - 1];
					if ((float) local133 > local189 + (float) this.anInt238 && (float) -this.anInt238 + local177 > (float) local133) {
						local16[local103] = this.anIntArrayArray5[local22 - 1][local121 - 1];
					} else {
						local16[local103] = 0;
					}
				}
			} else {
				Static184.method166(local16, 0, Static120.anInt2812, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	private void method160() {
		@Pc(12) Random local12 = new Random((long) this.anInt235);
		this.anIntArrayArray4 = new int[this.anInt235][this.anInt247 + 1];
		this.anInt239 = 4096 / this.anInt235;
		this.anInt238 = this.anInt250 / 2;
		this.anIntArrayArray5 = new int[this.anInt235][this.anInt247];
		this.anInt237 = 4096 / this.anInt247;
		@Pc(51) int local51 = this.anInt239 / 2;
		@Pc(56) int local56 = this.anInt237 / 2;
		this.anIntArray6 = new int[this.anInt235 + 1];
		this.anIntArray6[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt235; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt239;
				local96 = (Static77.method1232(4096, local12) - 2048) * this.anInt249 >> 12;
				@Pc(104) int local104 = local84 + (local51 * local96 >> 12);
				this.anIntArray6[local74] = this.anIntArray6[local74 - 1] + local104;
			}
			this.anIntArrayArray4[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt247; local84++) {
				if (local84 > 0) {
					local96 = this.anInt237;
					@Pc(145) int local145 = (Static77.method1232(4096, local12) - 2048) * this.anInt244 >> 12;
					local96 += local56 * local145 >> 12;
					this.anIntArrayArray4[local74][local84] = local96 + this.anIntArrayArray4[local74][local84 - 1];
				}
				this.anIntArrayArray5[local74][local84] = this.anInt234 <= 0 ? 4096 : 4096 - Static77.method1232(this.anInt234, local12);
			}
			this.anIntArrayArray4[local74][this.anInt247] = 4096;
		}
		this.anIntArray6[this.anInt235] = 4096;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt247 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt235 = arg0.method1402();
		} else if (arg1 == 2) {
			this.anInt244 = arg0.method1397();
		} else if (arg1 == 3) {
			this.anInt249 = arg0.method1397();
		} else if (arg1 == 4) {
			this.anInt230 = arg0.method1397();
		} else if (arg1 == 5) {
			this.anInt252 = arg0.method1397();
		} else if (arg1 == 6) {
			this.anInt250 = arg0.method1397();
		} else if (arg1 == 7) {
			this.anInt234 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.method160();
	}
}
