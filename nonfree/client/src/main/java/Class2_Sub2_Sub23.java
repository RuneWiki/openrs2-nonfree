import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
	private int anInt3046;

	@OriginalMember(owner = "client!lh", name = "kb", descriptor = "I")
	private int anInt3050;

	@OriginalMember(owner = "client!lh", name = "ob", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!lh", name = "rb", descriptor = "I")
	private int anInt3055;

	@OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
	private int anInt3035 = 81;

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
	private int anInt3040 = 0;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
	private int anInt3044 = 8;

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
	private int anInt3043 = 4;

	@OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
	private int anInt3048 = 204;

	@OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
	private int anInt3049 = 1024;

	@OriginalMember(owner = "client!lh", name = "qb", descriptor = "I")
	private int anInt3054 = 409;

	@OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
	private int anInt3037 = 1024;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static160.anIntArray187[arg0] + this.anInt3040; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt3044 > local22 && local30 >= this.anIntArray347[local22]) {
				local22++;
			}
			@Pc(63) int local63 = local22 - 1;
			@Pc(68) int local68 = this.anIntArray347[local22];
			@Pc(76) boolean local76 = (local22 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray347[local22 - 1];
			if (this.anInt3046 + local83 < local30 && local30 < local68 - this.anInt3046) {
				for (@Pc(98) int local98 = 0; local98 < Static106.anInt3045; local98++) {
					@Pc(102) int local102 = 0;
					@Pc(111) int local111 = local76 ? this.anInt3037 : -this.anInt3037;
					@Pc(122) int local122;
					for (local122 = (this.anInt3055 * local111 >> 12) + Static15.anIntArray41[local98]; local122 < 0; local122 += 4096) {
					}
					while (local122 > 4096) {
						local122 -= 4096;
					}
					while (this.anInt3043 > local102 && this.anIntArrayArray21[local63][local102] <= local122) {
						local102++;
					}
					@Pc(161) int local161 = this.anIntArrayArray21[local63][local102];
					@Pc(165) int local165 = local102 - 1;
					@Pc(172) int local172 = this.anIntArrayArray21[local63][local165];
					if (this.anInt3046 + local172 < local122 && local161 - this.anInt3046 > local122) {
						local16[local98] = this.anIntArrayArray20[local63][local165];
					} else {
						local16[local98] = 0;
					}
				}
			} else {
				Static203.method2768(local16, 0, Static106.anInt3045, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.method2402();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3043 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt3044 = arg1.method218();
		} else if (arg0 == 2) {
			this.anInt3054 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt3048 = arg1.method234();
		} else if (arg0 == 4) {
			this.anInt3037 = arg1.method234();
		} else if (arg0 == 5) {
			this.anInt3040 = arg1.method234();
		} else if (arg0 == 6) {
			this.anInt3035 = arg1.method234();
		} else if (arg0 == 7) {
			this.anInt3049 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	private void method2402() {
		@Pc(12) Random local12 = new Random((long) this.anInt3044);
		this.anInt3055 = 4096 / this.anInt3043;
		this.anIntArrayArray21 = new int[this.anInt3044][this.anInt3043 + 1];
		@Pc(32) int local32 = this.anInt3055 / 2;
		this.anIntArrayArray20 = new int[this.anInt3044][this.anInt3043];
		this.anInt3050 = 4096 / this.anInt3044;
		this.anInt3046 = this.anInt3035 / 2;
		@Pc(60) int local60 = this.anInt3050 / 2;
		this.anIntArray347 = new int[this.anInt3044 + 1];
		this.anIntArray347[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt3044; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt3050;
				local96 = (Static183.method3421(local12, 4096) - 2048) * this.anInt3048 >> 12;
				@Pc(104) int local104 = local84 + (local96 * local60 >> 12);
				this.anIntArray347[local74] = local104 + this.anIntArray347[local74 - 1];
			}
			this.anIntArrayArray21[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt3043; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3055;
					@Pc(147) int local147 = (Static183.method3421(local12, 4096) - 2048) * this.anInt3054 >> 12;
					local96 += local147 * local32 >> 12;
					this.anIntArrayArray21[local74][local84] = this.anIntArrayArray21[local74][local84 - 1] + local96;
				}
				this.anIntArrayArray20[local74][local84] = this.anInt3049 <= 0 ? 4096 : 4096 - Static183.method3421(local12, this.anInt3049);
			}
			this.anIntArrayArray21[local74][this.anInt3043] = 4096;
		}
		this.anIntArray347[this.anInt3044] = 4096;
	}
}
