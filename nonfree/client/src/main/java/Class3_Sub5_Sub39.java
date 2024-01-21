import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class3_Sub5_Sub39 extends Class3_Sub5 {

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	private int anInt4500;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
	private int anInt4505;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
	private int anInt4507;

	@OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
	private int anInt4509;

	@OriginalMember(owner = "client!wh", name = "cb", descriptor = "[I")
	private int[] anIntArray528;

	@OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
	private int anInt4511;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(28) int local28 = this.anInt4507 << 12;
			@Pc(35) int local35 = Static94.anIntArray277[arg0] * this.anInt4507;
			@Pc(40) int local40 = this.anInt4509 << 12;
			for (@Pc(42) int local42 = 0; local42 < Static104.anInt2195; local42++) {
				@Pc(46) int local46 = 0;
				@Pc(53) int local53 = Static124.anIntArray355[local42] * this.anInt4509;
				for (@Pc(55) int local55 = 0; local55 < this.anInt4505; local55++) {
					@Pc(62) int local62 = this.anIntArray526[local55];
					@Pc(67) int local67 = this.anIntArray525[local55];
					@Pc(91) int local91 = this.method3174(local62 * local28 >> 12, local62 * local35 >> 12, local62 * local40 >> 12, local53 * local62 >> 12);
					local46 += local91 * local67 >> 12;
				}
				if (this.aBoolean179) {
					local46 = (local46 >> 1) + 2048;
				}
				local19[local42] = local46;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)I")
	private int method3174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xFFFFF000;
		@Pc(11) int local11 = arg3 & 0xFFFFF000;
		@Pc(15) int local15 = arg1 - local7;
		@Pc(19) int local19 = local7 >> 12;
		@Pc(23) int local23 = arg2 & 0xFFFFF000;
		@Pc(27) int local27 = local19 + 1;
		@Pc(31) int local31 = arg3 - local11;
		@Pc(35) int local35 = local19 & 0xFF;
		@Pc(39) int local39 = local11 >> 12;
		@Pc(43) int local43 = arg0 & 0xFFFFF000;
		if (local27 >= local43 >> 12) {
			local27 = 0;
		}
		local27 &= 0xFF;
		@Pc(62) int local62 = local39 + 1;
		local11 = local39 & 0xFF;
		if (local62 >= local23 >> 12) {
			local62 = 0;
		}
		@Pc(94) int local94 = this.anIntArray528[this.anIntArray528[local35] + local11] % 4;
		@Pc(107) int local107 = this.anIntArray528[local11 + this.anIntArray528[local27]] % 4;
		local62 &= 0xFF;
		@Pc(123) int local123 = this.anIntArray528[this.anIntArray528[local27] + local62] % 4;
		@Pc(136) int local136 = this.anIntArray528[local62 + this.anIntArray528[local35]] % 4;
		@Pc(144) int local144 = Static36.method571(local31, Static21.anIntArrayArray5[local94], local15);
		@Pc(154) int local154 = Static36.method571(local31 - 4096, Static21.anIntArrayArray5[local136], local15);
		@Pc(164) int local164 = Static36.method571(local31, Static21.anIntArrayArray5[local107], local15 - 4096);
		@Pc(176) int local176 = Static36.method571(local31 - 4096, Static21.anIntArrayArray5[local123], local15 - 4096);
		@Pc(180) int local180 = Static130.method1964(local31);
		@Pc(184) int local184 = Static130.method1964(local15);
		@Pc(190) int local190 = Static19.method320(local144, local180, local154);
		@Pc(196) int local196 = Static19.method320(local164, local180, local176);
		return Static19.method320(local190, local184, local196);
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	private void method3175() {
		@Pc(12) Random local12 = new Random((long) this.anInt4511);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.anIntArray528[local22] = -1;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42;
			do {
				local42 = Static141.method2188(255, local12);
			} while (this.anIntArray528[local42] != -1);
			this.anIntArray528[local42 + 255] = this.anIntArray528[local42] = local35;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean179 = arg1.method2107() == 1;
		} else if (arg0 == 1) {
			this.anInt4505 = arg1.method2107();
		} else if (arg0 == 2) {
			this.anInt4500 = arg1.method2138();
			if (this.anInt4500 < 0) {
				this.anIntArray525 = new int[this.anInt4505];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4505; local75++) {
					this.anIntArray525[local75] = arg1.method2138();
				}
			}
		} else if (arg0 == 3) {
			this.anInt4509 = this.anInt4507 = arg1.method2107();
		} else if (arg0 == 4) {
			this.anInt4511 = arg1.method2107();
		} else if (arg0 == 5) {
			this.anInt4509 = arg1.method2107();
		} else if (arg0 == 6) {
			this.anInt4507 = arg1.method2107();
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	private void method3179() {
		@Pc(17) int local17;
		if (this.anInt4500 > 0) {
			this.anIntArray526 = new int[this.anInt4505];
			this.anIntArray525 = new int[this.anInt4505];
			for (local17 = 0; local17 < this.anInt4505; local17++) {
				this.anIntArray525[local17] = (int) (Math.pow((double) ((float) this.anInt4500 / 4096.0F), (double) local17) * 4096.0D);
				this.anIntArray526[local17] = (int) (Math.pow(2.0D, (double) local17) * 4096.0D);
			}
		} else if (this.anIntArray525 != null && this.anIntArray525.length == this.anInt4505) {
			this.anIntArray526 = new int[this.anInt4505];
			for (local17 = 0; local17 < this.anInt4505; local17++) {
				this.anIntArray526[local17] = (int) (Math.pow(2.0D, (double) local17) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.method3175();
		this.method3179();
	}
}
