import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub5_Sub5 extends Class3_Sub5 {

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		if (this.anIntArrayArray7 == null) {
			this.anIntArrayArray7 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray7.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1008 == 2) {
			this.method679();
		}
		Static153.method447();
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)[I")
	private int[] method676(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray140;
		} else if (this.anIntArrayArray7.length <= arg0) {
			return this.anIntArray139;
		} else {
			return this.anIntArrayArray7[arg0];
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1008 = arg1.method2107();
		this.anIntArrayArray7 = new int[arg1.method2107()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray7.length; local17++) {
			this.anIntArrayArray7[local17][0] = arg1.method2111();
			this.anIntArrayArray7[local17][1] = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
	private void method679() {
		@Pc(8) int[] local8 = this.anIntArrayArray7[0];
		@Pc(20) int[] local20 = this.anIntArrayArray7[1];
		@Pc(29) int[] local29 = this.anIntArrayArray7[this.anIntArrayArray7.length - 2];
		@Pc(38) int[] local38 = this.anIntArrayArray7[this.anIntArrayArray7.length - 1];
		this.anIntArray140 = new int[] { local8[0] + local8[0] - local20[0], local8[1] - -local8[1] + -local20[1] };
		this.anIntArray139 = new int[] { local29[0] + local29[0] - local38[0], local29[1] - -local29[1] - local38[1] };
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 0);
			@Pc(32) int local32 = this.anInt1008;
			@Pc(52) int local52;
			@Pc(50) int local50;
			@Pc(88) int[] local88;
			@Pc(81) int[] local81;
			@Pc(97) int local97;
			@Pc(101) int local101;
			@Pc(105) int local105;
			if (local32 == 2) {
				for (local32 = 0; local32 < Static104.anInt2195; local32++) {
					local50 = local29[local32];
					for (local52 = 1; this.anIntArrayArray7.length - 1 > local52 && local50 >= this.anIntArrayArray7[local52][0]; local52++) {
					}
					local81 = this.anIntArrayArray7[local52];
					local88 = this.anIntArrayArray7[local52 - 1];
					local97 = this.method676(local52 - 2)[1];
					local101 = local88[1];
					local105 = local81[1];
					@Pc(114) int local114 = this.method676(local52 + 1)[1];
					@Pc(133) int local133 = (local50 - local88[0] << 12) / (local81[0] - local88[0]);
					@Pc(143) int local143 = local114 + local101 - local97 - local105;
					@Pc(151) int local151 = local97 - local143 - local101;
					@Pc(156) int local156 = local105 - local97;
					@Pc(162) int local162 = local133 * local133 >> 12;
					@Pc(172) int local172 = (local133 * local143 >> 12) * local162 >> 12;
					@Pc(178) int local178 = local156 * local133 >> 12;
					@Pc(184) int local184 = local162 * local151 >> 12;
					local19[local32] = local178 + local172 + local184 + local101;
				}
			} else if (local32 == 1) {
				for (local32 = 0; local32 < Static104.anInt2195; local32++) {
					local50 = local29[local32];
					for (local52 = 1; local52 < this.anIntArrayArray7.length - 1 && local50 >= this.anIntArrayArray7[local52][0]; local52++) {
					}
					local88 = this.anIntArrayArray7[local52 - 1];
					local81 = this.anIntArrayArray7[local52];
					local97 = (local50 - local88[0] << 12) / (local81[0] - local88[0]);
					local101 = 4096 - Static48.anIntArray150[local97 >> 5 & 0xFF] >> 1;
					local105 = 4096 - local101;
					local19[local32] = local101 * local81[1] + local105 * local88[1] >> 12;
				}
			} else {
				for (local32 = 0; local32 < Static104.anInt2195; local32++) {
					local50 = local29[local32];
					for (local52 = 1; local52 < this.anIntArrayArray7.length - 1 && local50 >= this.anIntArrayArray7[local52][0]; local52++) {
					}
					local88 = this.anIntArrayArray7[local52 - 1];
					local81 = this.anIntArrayArray7[local52];
					local97 = (local50 - local88[0] << 12) / (local81[0] - local88[0]);
					local101 = 4096 - local97;
					local19[local32] = local81[1] * local97 + local101 * local88[1] >> 12;
				}
			}
		}
		return local19;
	}
}
