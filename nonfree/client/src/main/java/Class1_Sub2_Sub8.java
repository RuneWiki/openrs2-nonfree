import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
	public static int[] anIntArray44 = new int[99];

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ce", name = "pb", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
	private int anInt693;

	static {
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = 0; local38 < 99; local38++) {
			@Pc(43) int local43 = local38 + 1;
			@Pc(56) int local56 = (int) ((double) local43 + Math.pow(2.0D, (double) local43 / 7.0D) * 300.0D);
			local36 += local56;
			anIntArray44[local38] = local36 / 4;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[I")
	private int[] method546(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray45;
		} else if (arg0 >= this.anIntArrayArray1.length) {
			return this.anIntArray43;
		} else {
			return this.anIntArrayArray1[arg0];
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt693 = arg1.method1234();
		this.anIntArrayArray1 = new int[arg1.method1234()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray1.length; local20++) {
			this.anIntArrayArray1[local20][0] = arg1.method1280();
			this.anIntArrayArray1[local20][1] = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		if (this.anIntArrayArray1 == null) {
			this.anIntArrayArray1 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray1.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt693 == 2) {
			this.method548();
		}
		Static127.method2534();
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)V")
	private void method548() {
		@Pc(4) int[] local4 = this.anIntArrayArray1[0];
		@Pc(13) int[] local13 = this.anIntArrayArray1[this.anIntArrayArray1.length - 2];
		@Pc(18) int[] local18 = this.anIntArrayArray1[1];
		@Pc(31) int[] local31 = this.anIntArrayArray1[this.anIntArrayArray1.length - 1];
		this.anIntArray43 = new int[] { local13[0] + local13[0] - local31[0], local13[1] + -local31[1] + local13[1] };
		this.anIntArray45 = new int[] { local4[0] + local4[0] - local18[0], -local18[1] - (-local4[1] - local4[1]) };
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(21) int[] local21 = this.method3401(arg0, 0);
			@Pc(24) int local24 = this.anInt693;
			@Pc(42) int local42;
			@Pc(40) int local40;
			@Pc(78) int[] local78;
			@Pc(71) int[] local71;
			@Pc(87) int local87;
			@Pc(91) int local91;
			@Pc(95) int local95;
			if (local24 == 2) {
				for (local24 = 0; local24 < Static22.anInt596; local24++) {
					local40 = local21[local24];
					for (local42 = 1; local42 < this.anIntArrayArray1.length - 1 && this.anIntArrayArray1[local42][0] <= local40; local42++) {
					}
					local71 = this.anIntArrayArray1[local42];
					local78 = this.anIntArrayArray1[local42 - 1];
					local87 = this.method546(local42 - 2)[1];
					local91 = local78[1];
					local95 = local71[1];
					@Pc(104) int local104 = this.method546(local42 + 1)[1];
					@Pc(124) int local124 = (local40 - local78[0] << 12) / (local71[0] - local78[0]);
					@Pc(130) int local130 = local124 * local124 >> 12;
					@Pc(135) int local135 = local95 - local87;
					@Pc(146) int local146 = local104 + local91 - local87 - local95;
					@Pc(152) int local152 = local135 * local124 >> 12;
					@Pc(160) int local160 = local87 - local146 - local91;
					@Pc(170) int local170 = local130 * (local146 * local124 >> 12) >> 12;
					@Pc(176) int local176 = local160 * local130 >> 12;
					local11[local24] = local91 + local170 + local176 + local152;
				}
			} else if (local24 == 1) {
				for (local24 = 0; local24 < Static22.anInt596; local24++) {
					local40 = local21[local24];
					for (local42 = 1; this.anIntArrayArray1.length - 1 > local42 && local40 >= this.anIntArrayArray1[local42][0]; local42++) {
					}
					local71 = this.anIntArrayArray1[local42];
					local78 = this.anIntArrayArray1[local42 - 1];
					local87 = (local40 - local78[0] << 12) / (local71[0] - local78[0]);
					local91 = 4096 - Static185.anIntArray441[local87 >> 5 & 0xFF] >> 1;
					local95 = 4096 - local91;
					local11[local24] = local95 * local78[1] + local71[1] * local91 >> 12;
				}
			} else {
				for (local24 = 0; local24 < Static22.anInt596; local24++) {
					local40 = local21[local24];
					for (local42 = 1; this.anIntArrayArray1.length - 1 > local42 && this.anIntArrayArray1[local42][0] <= local40; local42++) {
					}
					local78 = this.anIntArrayArray1[local42 - 1];
					local71 = this.anIntArrayArray1[local42];
					local87 = (local40 - local78[0] << 12) / (local71[0] - local78[0]);
					local91 = 4096 - local87;
					local11[local24] = local71[1] * local87 + local78[1] * local91 >> 12;
				}
			}
		}
		return local11;
	}
}
