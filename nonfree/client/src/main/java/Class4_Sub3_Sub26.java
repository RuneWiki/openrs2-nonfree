import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class4_Sub3_Sub26 extends Class4_Sub3 {

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
	private int anInt3079;

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
	private int anInt3081;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.method2283();
		this.method2284();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIB)I")
	private int method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg0 & 0xFFFFF000;
		@Pc(17) int local17 = arg1 & 0xFFFFF000;
		@Pc(21) int local21 = arg1 - local17;
		@Pc(25) int local25 = local17 >> 12;
		@Pc(29) int local29 = arg2 & 0xFFFFF000;
		@Pc(33) int local33 = arg3 & 0xFFFFF000;
		@Pc(37) int local37 = local25 + 1;
		if (local29 >> 12 <= local37) {
			local37 = 0;
		}
		local37 &= 0xFF;
		local17 = local25 & 0xFF;
		@Pc(56) int local56 = arg3 - local33;
		local33 >>= 0xC;
		@Pc(64) int local64 = local33 + 1;
		local33 &= 0xFF;
		@Pc(80) int local80 = this.anIntArray285[this.anIntArray285[local17] + local33] % 4;
		@Pc(92) int local92 = this.anIntArray285[this.anIntArray285[local37] + local33] % 4;
		if (local64 >= local13 >> 12) {
			local64 = 0;
		}
		local64 &= 0xFF;
		@Pc(116) int local116 = this.anIntArray285[local64 + this.anIntArray285[local17]] % 4;
		@Pc(128) int local128 = this.anIntArray285[this.anIntArray285[local37] + local64] % 4;
		@Pc(136) int local136 = Static173.method2990(local21, local56, Static26.anIntArrayArray4[local80]);
		@Pc(146) int local146 = Static173.method2990(local21, local56 - 4096, Static26.anIntArrayArray4[local116]);
		@Pc(156) int local156 = Static173.method2990(local21 - 4096, local56, Static26.anIntArrayArray4[local92]);
		@Pc(168) int local168 = Static173.method2990(local21 - 4096, local56 - 4096, Static26.anIntArrayArray4[local128]);
		@Pc(174) int local174 = Static177.method3052(local56);
		@Pc(178) int local178 = Static177.method3052(local21);
		@Pc(184) int local184 = Static71.method1492(local136, local174, local146);
		@Pc(190) int local190 = Static71.method1492(local156, local174, local168);
		return Static71.method1492(local184, local178, local190);
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
	private void method2283() {
		@Pc(12) Random local12 = new Random((long) this.anInt3079);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray285[local14] = -1;
		}
		for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
			@Pc(34) int local34;
			do {
				local34 = Static38.method679(255, local12);
			} while (this.anIntArray285[local34] != -1);
			this.anIntArray285[local34 + 255] = this.anIntArray285[local34] = local27;
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	private void method2284() {
		@Pc(20) int local20;
		if (this.anInt3091 > 0) {
			this.anIntArray286 = new int[this.anInt3088];
			this.anIntArray287 = new int[this.anInt3088];
			for (local20 = 0; local20 < this.anInt3088; local20++) {
				this.anIntArray287[local20] = (int) (Math.pow((double) (this.anInt3091 / 4096), (double) local20) * 4096.0D);
				this.anIntArray286[local20] = (int) (Math.pow(2.0D, (double) local20) * 4096.0D);
			}
		} else if (this.anIntArray287 != null && this.anInt3088 == this.anIntArray287.length) {
			this.anIntArray286 = new int[this.anInt3088];
			for (local20 = 0; local20 < this.anInt3088; local20++) {
				this.anIntArray286[local20] = (int) (Math.pow(2.0D, (double) local20) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean131 = arg1.method1253() == 1;
		} else if (arg0 == 1) {
			this.anInt3088 = arg1.method1253();
		} else if (arg0 == 2) {
			this.anInt3091 = arg1.method1227();
			if (this.anInt3091 < 0) {
				this.anIntArray287 = new int[this.anInt3088];
				for (@Pc(72) int local72 = 0; local72 < this.anInt3088; local72++) {
					this.anIntArray287[local72] = arg1.method1227();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt3081 = this.anInt3078 = arg1.method1253();
			return;
		} else if (arg0 == 4) {
			this.anInt3079 = arg1.method1253();
			return;
		} else if (arg0 == 5) {
			this.anInt3081 = arg1.method1253();
			return;
		} else if (arg0 == 6) {
			this.anInt3078 = arg1.method1253();
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(20) int local20 = this.anInt3081 << 12;
			@Pc(27) int local27 = this.anInt3078 * Static148.anIntArray321[arg0];
			@Pc(32) int local32 = this.anInt3078 << 12;
			for (@Pc(34) int local34 = 0; local34 < Static134.anInt3188; local34++) {
				@Pc(38) int local38 = 0;
				@Pc(45) int local45 = Static67.anIntArray170[local34] * this.anInt3081;
				for (@Pc(47) int local47 = 0; local47 < this.anInt3088; local47++) {
					@Pc(54) int local54 = this.anIntArray286[local47];
					@Pc(59) int local59 = this.anIntArray287[local47];
					@Pc(83) int local83 = this.method2282(local54 * local20 >> 12, local54 * local27 >> 12, local54 * local32 >> 12, local45 * local54 >> 12);
					local38 += local59 * local83 >> 12;
				}
				if (this.aBoolean131) {
					local38 = (local38 >> 1) + 2048;
				}
				local11[local34] = local38;
			}
		}
		return local11;
	}
}
