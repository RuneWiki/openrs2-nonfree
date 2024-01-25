import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class2_Sub15_Sub9 extends Class2_Sub15 {

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!gr", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!gr", name = "Q", descriptor = "[S")
	private final short[] aShortArray58 = new short[257];

	@OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
	private int anInt4237 = 0;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)V")
	private void method3866() {
		@Pc(13) int local13 = this.anInt4237;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(66) int[] local66;
		@Pc(71) int[] local71;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; this.anIntArrayArray13.length - 1 > local35 && local33 >= this.anIntArrayArray13[local35][0]; local35++) {
				}
				local66 = this.anIntArrayArray13[local35 - 1];
				local71 = this.anIntArrayArray13[local35];
				local80 = this.method3869(local35 - 2)[1];
				local84 = local66[1];
				local88 = local71[1];
				local97 = this.method3869(local35 + 1)[1];
				@Pc(115) int local115 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				@Pc(121) int local121 = local115 * local115 >> 12;
				@Pc(132) int local132 = local97 + local84 - local80 - local88;
				@Pc(140) int local140 = local80 - local84 - local132;
				@Pc(145) int local145 = local88 - local80;
				@Pc(157) int local157 = (local132 * local115 >> 12) * local121 >> 12;
				@Pc(163) int local163 = local140 * local121 >> 12;
				@Pc(169) int local169 = local115 * local145 >> 12;
				@Pc(178) int local178 = local169 + local163 + local157 + local84;
				if (local178 <= -32768) {
					local178 = -32767;
				}
				if (local178 >= 32768) {
					local178 = 32767;
				}
				this.aShortArray58[local13] = (short) local178;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; this.anIntArrayArray13.length - 1 > local35 && local33 >= this.anIntArrayArray13[local35][0]; local35++) {
				}
				local66 = this.anIntArrayArray13[local35 - 1];
				local71 = this.anIntArrayArray13[local35];
				local80 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - Static464.anIntArray420[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local84 * local71[1] + local88 * local66[1] >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray58[local13] = (short) local97;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray13.length - 1 && local33 >= this.anIntArrayArray13[local35][0]; local35++) {
				}
				local66 = this.anIntArrayArray13[local35 - 1];
				local71 = this.anIntArrayArray13[local35];
				local80 = (local33 - local66[0] << 12) / (local71[0] - local66[0]);
				local84 = 4096 - local80;
				local88 = local66[1] * local84 + local71[1] * local80 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray58[local13] = (short) local88;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(29) int[] local29 = this.method9725(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static329.anInt6017; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local17[local31] = this.aShortArray58[local39];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		if (this.anIntArrayArray13 == null) {
			this.anIntArrayArray13 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray13.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4237 == 2) {
			this.method3868();
		}
		Static410.method6766();
		this.method3866();
	}

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V")
	private void method3868() {
		@Pc(8) int[] local8 = this.anIntArrayArray13[0];
		@Pc(13) int[] local13 = this.anIntArrayArray13[1];
		@Pc(22) int[] local22 = this.anIntArrayArray13[this.anIntArrayArray13.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray13[this.anIntArrayArray13.length - 1];
		this.anIntArray194 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - (-local22[1] - local22[1]) };
		this.anIntArray195 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4237 = arg1.method5203();
		this.anIntArrayArray13 = new int[arg1.method5203()][2];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray13.length; local27++) {
			this.anIntArrayArray13[local27][0] = arg1.method5211();
			this.anIntArrayArray13[local27][1] = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[I")
	private int[] method3869(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray195;
		} else if (this.anIntArrayArray13.length <= arg0) {
			return this.anIntArray194;
		} else {
			return this.anIntArrayArray13[arg0];
		}
	}
}
