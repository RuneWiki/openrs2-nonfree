import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wh", name = "ab", descriptor = "[I")
	public static int[] anIntArray431 = new int[32];

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
	private int anInt3967;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
	private int anInt3970;

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!wh", name = "fb", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
	private int anInt3969;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
	private int anInt3968;

	@OriginalMember(owner = "client!wh", name = "cb", descriptor = "Z")
	private boolean aBoolean272;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray431[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean272 = arg0.method1354() == 1;
		} else if (arg1 == 1) {
			this.anInt3969 = arg0.method1354();
		} else if (arg1 == 2) {
			this.anInt3968 = arg0.method1375();
			if (this.anInt3968 < 0) {
				this.anIntArray433 = new int[this.anInt3969];
				for (@Pc(69) int local69 = 0; local69 < this.anInt3969; local69++) {
					this.anIntArray433[local69] = arg0.method1375();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt3967 = this.anInt3964 = arg0.method1354();
			return;
		} else if (arg1 == 4) {
			this.anInt3970 = arg0.method1354();
			return;
		} else if (arg1 == 5) {
			this.anInt3967 = arg0.method1354();
			return;
		} else if (arg1 == 6) {
			this.anInt3964 = arg0.method1354();
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	private void method2798() {
		@Pc(12) Random local12 = new Random((long) this.anInt3970);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray432[local14] = -1;
		}
		for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
			@Pc(38) int local38;
			do {
				local38 = Static12.method194(local12, 255);
			} while (this.anIntArray432[local38] != -1);
			this.anIntArray432[local38 + 255] = this.anIntArray432[local38] = local31;
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.method2798();
		this.method2800();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)I")
	private int method2799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = arg0 & 0xFFFFF000;
		@Pc(22) int local22 = arg0 - local18;
		@Pc(26) int local26 = arg3 & 0xFFFFF000;
		@Pc(30) int local30 = arg1 & 0xFFFFF000;
		@Pc(34) int local34 = arg2 & 0xFFFFF000;
		@Pc(38) int local38 = local18 >> 12;
		@Pc(42) int local42 = arg2 - local34;
		@Pc(46) int local46 = local34 >> 12;
		@Pc(50) int local50 = local46 + 1;
		if (local50 >= local30 >> 12) {
			local50 = 0;
		}
		@Pc(61) int local61 = local38 + 1;
		local50 &= 0xFF;
		if (local26 >> 12 <= local61) {
			local61 = 0;
		}
		local18 = local38 & 0xFF;
		@Pc(88) int local88 = this.anIntArray432[local18 + this.anIntArray432[local50]] % 4;
		local34 = local46 & 0xFF;
		local61 &= 0xFF;
		@Pc(108) int local108 = this.anIntArray432[local61 + this.anIntArray432[local50]] % 4;
		@Pc(121) int local121 = this.anIntArray432[local18 + this.anIntArray432[local34]] % 4;
		@Pc(133) int local133 = this.anIntArray432[local61 + this.anIntArray432[local34]] % 4;
		@Pc(141) int local141 = Static131.method2175(local42, local22, Static79.anIntArrayArray14[local121]);
		@Pc(151) int local151 = Static131.method2175(local42, local22 - 4096, Static79.anIntArrayArray14[local133]);
		@Pc(161) int local161 = Static131.method2175(local42 - 4096, local22, Static79.anIntArrayArray14[local88]);
		@Pc(173) int local173 = Static131.method2175(local42 - 4096, local22 + -4096, Static79.anIntArrayArray14[local108]);
		@Pc(177) int local177 = Static80.method1402(local22);
		@Pc(181) int local181 = Static80.method1402(local42);
		@Pc(189) int local189 = Static139.method1770(local177, local151, local141);
		@Pc(195) int local195 = Static139.method1770(local177, local173, local161);
		return Static139.method1770(local181, local195, local189);
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	private void method2800() {
		@Pc(17) int local17;
		if (this.anInt3968 > 0) {
			this.anIntArray430 = new int[this.anInt3969];
			this.anIntArray433 = new int[this.anInt3969];
			for (local17 = 0; local17 < this.anInt3969; local17++) {
				this.anIntArray433[local17] = (int) (Math.pow((double) (this.anInt3968 / 4096), (double) local17) * 4096.0D);
				this.anIntArray430[local17] = (int) (Math.pow(2.0D, (double) local17) * 4096.0D);
			}
		} else if (this.anIntArray433 != null && this.anInt3969 == this.anIntArray433.length) {
			this.anIntArray430 = new int[this.anInt3969];
			for (local17 = 0; local17 < this.anInt3969; local17++) {
				this.anIntArray430[local17] = (int) (Math.pow(2.0D, (double) local17) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(22) int local22 = this.anInt3967 << 12;
			@Pc(27) int local27 = this.anInt3964 << 12;
			@Pc(34) int local34 = Static123.anIntArray308[arg0] * this.anInt3964;
			for (@Pc(36) int local36 = 0; local36 < Static86.anInt1942; local36++) {
				@Pc(45) int local45 = Static165.anIntArray17[local36] * this.anInt3967;
				@Pc(47) int local47 = 0;
				for (@Pc(49) int local49 = 0; local49 < this.anInt3969; local49++) {
					@Pc(56) int local56 = this.anIntArray430[local49];
					@Pc(61) int local61 = this.anIntArray433[local49];
					@Pc(85) int local85 = this.method2799(local56 * local45 >> 12, local27 * local56 >> 12, local56 * local34 >> 12, local22 * local56 >> 12);
					local47 += local85 * local61 >> 12;
				}
				if (this.aBoolean272) {
					local47 = (local47 >> 1) + 2048;
				}
				local13[local36] = local47;
			}
		}
		return local13;
	}
}
