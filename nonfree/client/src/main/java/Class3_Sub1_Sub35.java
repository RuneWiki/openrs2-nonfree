import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
	private int anInt4024;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "[I")
	private int[] anIntArray674;

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
	private int anInt4039;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
	private int anInt4040;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	private int anInt4025;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "I")
	private int anInt4032;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
	private int anInt4038;

	@OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
	private int anInt4028;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	private int anInt4042;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)V")
	private void method3060() {
		@Pc(17) Random local17 = new Random((long) this.anInt4027);
		this.anIntArrayArray36 = new int[this.anInt4027][this.anInt4031 + 1];
		this.anInt4040 = this.anInt4032 / 2;
		this.anInt4024 = 4096 / this.anInt4031;
		this.anIntArray674 = new int[this.anInt4027 + 1];
		this.anInt4039 = 4096 / this.anInt4027;
		@Pc(56) int local56 = this.anInt4024 / 2;
		this.anIntArray674[0] = 0;
		@Pc(66) int local66 = this.anInt4039 / 2;
		this.anIntArrayArray35 = new int[this.anInt4027][this.anInt4031];
		for (@Pc(75) int local75 = 0; local75 < this.anInt4027; local75++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local75 > 0) {
				local82 = this.anInt4039;
				local94 = (Static42.method1009(4096, local17) - 2048) * this.anInt4025 >> 12;
				@Pc(102) int local102 = local82 + (local66 * local94 >> 12);
				this.anIntArray674[local75] = this.anIntArray674[local75 - 1] + local102;
			}
			this.anIntArrayArray36[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt4031; local82++) {
				if (local82 > 0) {
					local94 = this.anInt4024;
					@Pc(142) int local142 = (Static42.method1009(4096, local17) - 2048) * this.anInt4033 >> 12;
					local94 += local56 * local142 >> 12;
					this.anIntArrayArray36[local75][local82] = local94 + this.anIntArrayArray36[local75][local82 - 1];
				}
				this.anIntArrayArray35[local75][local82] = this.anInt4042 > 0 ? 4096 - Static42.method1009(this.anInt4042, local17) : 4096;
			}
			this.anIntArrayArray36[local75][this.anInt4031] = 4096;
		}
		this.anIntArray674[this.anInt4027] = 4096;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.method3060();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(27) int local27;
			for (local27 = Static22.anIntArray152[arg0] + this.anInt4028; local27 < 0; local27 += 4096) {
			}
			while (local27 > 4096) {
				local27 -= 4096;
			}
			@Pc(43) int local43;
			for (local43 = 0; this.anInt4027 > local43 && this.anIntArray674[local43] <= local27; local43++) {
			}
			@Pc(72) float local72 = (float) this.anIntArray674[local43 - 1];
			@Pc(78) float local78 = (float) this.anIntArray674[local43];
			if ((float) local27 > local72 + (float) this.anInt4040 && (float) local27 < (float) -this.anInt4040 + local78) {
				for (@Pc(106) int local106 = 0; local106 < Static129.anInt3285; local106++) {
					@Pc(110) int local110 = 0;
					@Pc(121) int local121 = local43 % 2 == 0 ? this.anInt4038 : -this.anInt4038;
					@Pc(132) int local132;
					for (local132 = (local121 * this.anInt4024 >> 12) + Static146.anIntArray618[local106]; local132 < 0; local132 += 4096) {
					}
					while (local132 > 4096) {
						local132 -= 4096;
					}
					while (this.anInt4031 > local110 && local132 >= this.anIntArrayArray36[local43 - 1][local110]) {
						local110++;
					}
					@Pc(183) float local183 = (float) this.anIntArrayArray36[local43 - 1][local110 - 1];
					@Pc(193) float local193 = (float) this.anIntArrayArray36[local43 - 1][local110];
					if ((float) local132 > local183 + (float) this.anInt4040 && (float) local132 < (float) -this.anInt4040 + local193) {
						local16[local106] = this.anIntArrayArray35[local43 - 1][local110 - 1];
					} else {
						local16[local106] = 0;
					}
				}
			} else {
				Static188.method2241(local16, 0, Static129.anInt3285, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4031 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt4027 = arg1.method1545();
		} else if (arg0 == 2) {
			this.anInt4033 = arg1.method1510();
		} else if (arg0 == 3) {
			this.anInt4025 = arg1.method1510();
		} else if (arg0 == 4) {
			this.anInt4038 = arg1.method1510();
		} else if (arg0 == 5) {
			this.anInt4028 = arg1.method1510();
		} else if (arg0 == 6) {
			this.anInt4032 = arg1.method1510();
		} else if (arg0 == 7) {
			this.anInt4042 = arg1.method1510();
		}
	}
}
