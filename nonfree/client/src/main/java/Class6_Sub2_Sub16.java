import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class6_Sub2_Sub16 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt3097;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private int anInt3099 = 81;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	private int anInt3101 = 0;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt3104 = 409;

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
	private int anInt3109 = 4;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	private int anInt3107 = 1024;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	private int anInt3105 = 1024;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
	private int anInt3113 = 204;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	private int anInt3102 = 8;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3109 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt3102 = arg0.method3111();
		} else if (arg1 == 2) {
			this.anInt3104 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt3113 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt3105 = arg0.method3108();
		} else if (arg1 == 5) {
			this.anInt3101 = arg0.method3108();
		} else if (arg1 == 6) {
			this.anInt3099 = arg0.method3108();
		} else if (arg1 == 7) {
			this.anInt3107 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
	private void method2789() {
		@Pc(12) Random local12 = new Random((long) this.anInt3102);
		this.anInt3100 = 4096 / this.anInt3109;
		this.anInt3106 = this.anInt3099 / 2;
		this.anInt3097 = 4096 / this.anInt3102;
		@Pc(35) int local35 = this.anInt3100 / 2;
		this.anIntArrayArray28 = new int[this.anInt3102][this.anInt3109];
		@Pc(47) int local47 = this.anInt3097 / 2;
		this.anIntArray285 = new int[this.anInt3102 + 1];
		this.anIntArrayArray29 = new int[this.anInt3102][this.anInt3109 + 1];
		this.anIntArray285[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt3102; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt3097;
				local98 = (Static235.method3704(4096, local12) - 2048) * this.anInt3113 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local47 >> 12);
				this.anIntArray285[local76] = this.anIntArray285[local76 - 1] + local106;
			}
			this.anIntArrayArray29[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt3109; local86++) {
				if (local86 > 0) {
					local98 = this.anInt3100;
					@Pc(146) int local146 = (Static235.method3704(4096, local12) - 2048) * this.anInt3104 >> 12;
					local98 += local146 * local35 >> 12;
					this.anIntArrayArray29[local76][local86] = this.anIntArrayArray29[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray28[local76][local86] = this.anInt3107 > 0 ? 4096 - Static235.method3704(this.anInt3107, local12) : 4096;
			}
			this.anIntArrayArray29[local76][this.anInt3109] = 4096;
		}
		this.anIntArray285[this.anInt3102] = 4096;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(17) int local17 = 0;
			@Pc(25) int local25;
			for (local25 = Static168.anIntArray278[arg0] + this.anInt3101; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (local17 < this.anInt3102 && local25 >= this.anIntArray285[local17]) {
				local17++;
			}
			@Pc(60) int local60 = local17 - 1;
			@Pc(71) boolean local71 = (local17 & 0x1) == 0;
			@Pc(76) int local76 = this.anIntArray285[local17];
			@Pc(83) int local83 = this.anIntArray285[local17 - 1];
			if (this.anInt3106 + local83 < local25 && local25 < local76 - this.anInt3106) {
				for (@Pc(105) int local105 = 0; local105 < Static185.anInt4925; local105++) {
					@Pc(109) int local109 = 0;
					@Pc(118) int local118 = local71 ? this.anInt3105 : -this.anInt3105;
					@Pc(129) int local129;
					for (local129 = (this.anInt3100 * local118 >> 12) + Static53.anIntArray95[local105]; local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (this.anInt3109 > local109 && this.anIntArrayArray29[local60][local109] <= local129) {
						local109++;
					}
					@Pc(164) int local164 = local109 - 1;
					@Pc(171) int local171 = this.anIntArrayArray29[local60][local164];
					@Pc(178) int local178 = this.anIntArrayArray29[local60][local109];
					if (local171 + this.anInt3106 < local129 && local178 - this.anInt3106 > local129) {
						local11[local105] = this.anIntArrayArray28[local60][local164];
					} else {
						local11[local105] = 0;
					}
				}
			} else {
				Static459.method5349(local11, 0, Static185.anInt4925, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.method2789();
	}
}
