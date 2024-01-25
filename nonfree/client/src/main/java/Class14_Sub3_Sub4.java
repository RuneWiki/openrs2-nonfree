import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class14_Sub3_Sub4 extends Class14_Sub3 {

	@OriginalMember(owner = "client!co", name = "K", descriptor = "I")
	private int anInt1130;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	private int anInt1140;

	@OriginalMember(owner = "client!co", name = "hb", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "I")
	private int anInt1133 = 8;

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "I")
	private int anInt1145 = 4;

	@OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
	private int anInt1144 = 409;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	private int anInt1131 = 204;

	@OriginalMember(owner = "client!co", name = "bb", descriptor = "I")
	private int anInt1141 = 81;

	@OriginalMember(owner = "client!co", name = "U", descriptor = "I")
	private int anInt1137 = 0;

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
	private int anInt1149 = 1024;

	@OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
	private int anInt1150 = 1024;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.method1112();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt1137 + Static213.anIntArray381[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1133 > local22 && this.anIntArray65[local22] <= local29) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(74) boolean local74 = (local22 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray65[local22];
			@Pc(86) int local86 = this.anIntArray65[local22 - 1];
			if (local86 + this.anInt1140 < local29 && local29 < local79 - this.anInt1140) {
				for (@Pc(108) int local108 = 0; local108 < Static294.anInt5657; local108++) {
					@Pc(119) int local119 = local74 ? this.anInt1149 : -this.anInt1149;
					@Pc(121) int local121 = 0;
					@Pc(133) int local133;
					for (local133 = Static346.anIntArray638[local108] + (this.anInt1147 * local119 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (this.anInt1145 > local121 && this.anIntArrayArray9[local63][local121] <= local133) {
						local121++;
					}
					@Pc(166) int local166 = local121 - 1;
					@Pc(173) int local173 = this.anIntArrayArray9[local63][local166];
					@Pc(180) int local180 = this.anIntArrayArray9[local63][local121];
					if (this.anInt1140 + local173 < local133 && local133 < local180 - this.anInt1140) {
						local16[local108] = this.anIntArrayArray10[local63][local166];
					} else {
						local16[local108] = 0;
					}
				}
			} else {
				Static358.method768(local16, 0, Static294.anInt5657, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
	private void method1112() {
		@Pc(12) Random local12 = new Random((long) this.anInt1133);
		this.anInt1147 = 4096 / this.anInt1145;
		this.anInt1140 = this.anInt1141 / 2;
		this.anInt1130 = 4096 / this.anInt1133;
		@Pc(35) int local35 = this.anInt1147 / 2;
		@Pc(40) int local40 = this.anInt1130 / 2;
		this.anIntArray65 = new int[this.anInt1133 + 1];
		this.anIntArrayArray9 = new int[this.anInt1133][this.anInt1145 + 1];
		this.anIntArrayArray10 = new int[this.anInt1133][this.anInt1145];
		this.anIntArray65[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt1133; local76++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local76 > 0) {
				local83 = this.anInt1130;
				local95 = (Static193.method3664(local12, 4096) - 2048) * this.anInt1131 >> 12;
				@Pc(103) int local103 = local83 + (local40 * local95 >> 12);
				this.anIntArray65[local76] = this.anIntArray65[local76 - 1] + local103;
			}
			this.anIntArrayArray9[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt1145; local83++) {
				if (local83 > 0) {
					local95 = this.anInt1147;
					@Pc(143) int local143 = (Static193.method3664(local12, 4096) - 2048) * this.anInt1144 >> 12;
					local95 += local35 * local143 >> 12;
					this.anIntArrayArray9[local76][local83] = local95 + this.anIntArrayArray9[local76][local83 - 1];
				}
				this.anIntArrayArray10[local76][local83] = this.anInt1150 > 0 ? 4096 - Static193.method3664(local12, this.anInt1150) : 4096;
			}
			this.anIntArrayArray9[local76][this.anInt1145] = 4096;
		}
		this.anIntArray65[this.anInt1133] = 4096;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1145 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt1133 = arg0.method2548();
		} else if (arg1 == 2) {
			this.anInt1144 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt1131 = arg0.method2498();
		} else if (arg1 == 4) {
			this.anInt1149 = arg0.method2498();
		} else if (arg1 == 5) {
			this.anInt1137 = arg0.method2498();
		} else if (arg1 == 6) {
			this.anInt1141 = arg0.method2498();
		} else if (arg1 == 7) {
			this.anInt1150 = arg0.method2498();
		}
	}
}
