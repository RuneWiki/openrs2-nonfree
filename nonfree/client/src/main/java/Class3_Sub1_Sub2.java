import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
	private int anInt641 = 0;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "[S")
	private final short[] aShortArray4 = new short[257];

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	private void method579() {
		@Pc(16) int[] local16 = this.anIntArrayArray2[0];
		@Pc(21) int[] local21 = this.anIntArrayArray2[1];
		@Pc(30) int[] local30 = this.anIntArrayArray2[this.anIntArrayArray2.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray2[this.anIntArrayArray2.length - 1];
		this.anIntArray43 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - (-local30[1] + local39[1]) };
		this.anIntArray44 = new int[] { local16[0] + local16[0] - local21[0], local16[1] - local21[1] + local16[1] };
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		if (this.anIntArrayArray2 == null) {
			this.anIntArrayArray2 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray2.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt641 == 2) {
			this.method579();
		}
		Static561.method7327();
		this.method583();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt641 = arg1.method2048(255);
		this.anIntArrayArray2 = new int[arg1.method2048(255)][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray2.length; local29++) {
			this.anIntArrayArray2[local29][0] = arg1.method2028(-14795);
			this.anIntArrayArray2[local29][1] = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(27) int[] local27 = this.method9577(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static379.anInt5859; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray4[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(BI)[I")
	private int[] method581(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray44;
		} else if (arg0 >= this.anIntArrayArray2.length) {
			return this.anIntArray43;
		} else {
			return this.anIntArrayArray2[arg0];
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	private void method583() {
		@Pc(13) int local13 = this.anInt641;
		@Pc(39) int local39;
		@Pc(37) int local37;
		@Pc(70) int[] local70;
		@Pc(75) int[] local75;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local37 = local13 << 4;
				for (local39 = 1; local39 < this.anIntArrayArray2.length - 1 && this.anIntArrayArray2[local39][0] <= local37; local39++) {
				}
				local70 = this.anIntArrayArray2[local39 - 1];
				local75 = this.anIntArrayArray2[local39];
				local84 = this.method581(local39 - 2)[1];
				local88 = local70[1];
				local92 = local75[1];
				local101 = this.method581(local39 + 1)[1];
				@Pc(119) int local119 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				@Pc(125) int local125 = local119 * local119 >> 12;
				@Pc(134) int local134 = local88 + local101 - local84 - local92;
				@Pc(142) int local142 = local84 - local134 - local88;
				@Pc(146) int local146 = local92 - local84;
				@Pc(158) int local158 = (local119 * local134 >> 12) * local125 >> 12;
				@Pc(164) int local164 = local142 * local125 >> 12;
				@Pc(170) int local170 = local146 * local119 >> 12;
				@Pc(180) int local180 = local164 + local158 + local170 + local88;
				if (local180 <= -32768) {
					local180 = -32767;
				}
				if (local180 >= 32768) {
					local180 = 32767;
				}
				this.aShortArray4[local13] = (short) local180;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local37 = local13 << 4;
				for (local39 = 1; this.anIntArrayArray2.length - 1 > local39 && this.anIntArrayArray2[local39][0] <= local37; local39++) {
				}
				local70 = this.anIntArrayArray2[local39 - 1];
				local75 = this.anIntArrayArray2[local39];
				local84 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				local88 = 4096 - Static523.anIntArray592[local84 >> 5 & 0xFF] >> 1;
				local92 = 4096 - local88;
				local101 = local75[1] * local88 + local70[1] * local92 >> 12;
				if (local101 <= -32768) {
					local101 = -32767;
				}
				if (local101 >= 32768) {
					local101 = 32767;
				}
				this.aShortArray4[local13] = (short) local101;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local37 = local13 << 4;
				for (local39 = 1; this.anIntArrayArray2.length - 1 > local39 && this.anIntArrayArray2[local39][0] <= local37; local39++) {
				}
				local70 = this.anIntArrayArray2[local39 - 1];
				local75 = this.anIntArrayArray2[local39];
				local84 = (local37 - local70[0] << 12) / (local75[0] - local70[0]);
				local88 = 4096 - local84;
				local92 = local84 * local75[1] + local88 * local70[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray4[local13] = (short) local92;
			}
		}
	}
}
