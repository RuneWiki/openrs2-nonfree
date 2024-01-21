import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt415 + Static148.anIntArray321[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt417 > local25 && this.anIntArray36[local25] <= local32) {
				local25++;
			}
			@Pc(72) float local72 = (float) this.anIntArray36[local25];
			@Pc(80) float local80 = (float) this.anIntArray36[local25 - 1];
			if ((float) local32 > (float) this.anInt412 + local80 && (float) local32 < (float) -this.anInt412 + local72) {
				for (@Pc(101) int local101 = 0; local101 < Static134.anInt3188; local101++) {
					@Pc(105) int local105 = 0;
					@Pc(119) int local119 = local25 % 2 == 0 ? this.anInt414 : -this.anInt414;
					@Pc(130) int local130;
					for (local130 = Static67.anIntArray170[local101] + (this.anInt408 * local119 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (this.anInt411 > local105 && this.anIntArrayArray2[local25 - 1][local105] <= local130) {
						local105++;
					}
					@Pc(179) float local179 = (float) this.anIntArrayArray2[local25 - 1][local105 - 1];
					@Pc(189) float local189 = (float) this.anIntArrayArray2[local25 - 1][local105];
					if ((float) local130 > local179 + (float) this.anInt412 && (float) local130 < (float) -this.anInt412 + local189) {
						local11[local101] = this.anIntArrayArray3[local25 - 1][local105 - 1];
					} else {
						local11[local101] = 0;
					}
				}
			} else {
				Static189.method189(local11, 0, Static134.anInt3188, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	private void method238() {
		@Pc(8) Random local8 = new Random((long) this.anInt417);
		this.anIntArrayArray2 = new int[this.anInt417][this.anInt411 + 1];
		this.anInt405 = 4096 / this.anInt417;
		this.anIntArrayArray3 = new int[this.anInt417][this.anInt411];
		this.anIntArray36 = new int[this.anInt417 + 1];
		this.anInt412 = this.anInt416 / 2;
		this.anIntArray36[0] = 0;
		this.anInt408 = 4096 / this.anInt411;
		@Pc(63) int local63 = this.anInt408 / 2;
		@Pc(68) int local68 = this.anInt405 / 2;
		for (@Pc(75) int local75 = 0; local75 < this.anInt417; local75++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local75 > 0) {
				local82 = this.anInt405;
				local94 = (Static38.method679(4096, local8) - 2048) * this.anInt413 >> 12;
				@Pc(102) int local102 = local82 + (local94 * local68 >> 12);
				this.anIntArray36[local75] = local102 + this.anIntArray36[local75 - 1];
			}
			this.anIntArrayArray2[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt411; local82++) {
				if (local82 > 0) {
					local94 = this.anInt408;
					@Pc(142) int local142 = (Static38.method679(4096, local8) - 2048) * this.anInt404 >> 12;
					local94 += local63 * local142 >> 12;
					this.anIntArrayArray2[local75][local82] = this.anIntArrayArray2[local75][local82 - 1] + local94;
				}
				this.anIntArrayArray3[local75][local82] = this.anInt406 > 0 ? 4096 - Static38.method679(this.anInt406, local8) : 4096;
			}
			this.anIntArrayArray2[local75][this.anInt411] = 4096;
		}
		this.anIntArray36[this.anInt417] = 4096;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.method238();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt411 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt417 = arg1.method1253();
		} else if (arg0 == 2) {
			this.anInt404 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt413 = arg1.method1252();
		} else if (arg0 == 4) {
			this.anInt414 = arg1.method1252();
		} else if (arg0 == 5) {
			this.anInt415 = arg1.method1252();
		} else if (arg0 == 6) {
			this.anInt416 = arg1.method1252();
		} else if (arg0 == 7) {
			this.anInt406 = arg1.method1252();
		}
	}
}
