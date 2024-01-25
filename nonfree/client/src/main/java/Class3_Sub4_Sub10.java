import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!ft", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ft", name = "bb", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
	private int anInt2656 = 0;

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "[S")
	private final short[] aShortArray41 = new short[257];

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(26) int[] local26 = this.method5960(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static106.anInt2356; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray41[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V")
	private void method2190() {
		@Pc(13) int local13 = this.anInt2656;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(64) int[] local64;
		@Pc(69) int[] local69;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray27[local33 - 1];
				local69 = this.anIntArrayArray27[local33];
				local78 = this.method2193(local33 - 2)[1];
				local82 = local64[1];
				local86 = local69[1];
				local95 = this.method2193(local33 + 1)[1];
				@Pc(112) int local112 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(127) int local127 = local82 + local95 - local86 - local78;
				@Pc(135) int local135 = local78 - local127 - local82;
				@Pc(140) int local140 = local86 - local78;
				@Pc(152) int local152 = (local112 * local127 >> 12) * local118 >> 12;
				@Pc(158) int local158 = local135 * local118 >> 12;
				@Pc(164) int local164 = local140 * local112 >> 12;
				@Pc(174) int local174 = local152 + local158 + local164 + local82;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray41[local13] = (short) local174;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray27.length - 1 && local31 >= this.anIntArrayArray27[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray27[local33 - 1];
				local69 = this.anIntArrayArray27[local33];
				local78 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - Static21.anIntArray46[local78 >> 5 & 0xFF] >> 1;
				local86 = 4096 - local82;
				local95 = local64[1] * local86 + local82 * local69[1] >> 12;
				if (local95 <= -32768) {
					local95 = -32767;
				}
				if (local95 >= 32768) {
					local95 = 32767;
				}
				this.aShortArray41[local13] = (short) local95;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray27.length - 1 && local31 >= this.anIntArrayArray27[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray27[local33 - 1];
				local69 = this.anIntArrayArray27[local33];
				local78 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - local78;
				local86 = local78 * local69[1] + local64[1] * local82 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray41[local13] = (short) local86;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)V")
	private void method2191() {
		@Pc(8) int[] local8 = this.anIntArrayArray27[0];
		@Pc(13) int[] local13 = this.anIntArrayArray27[1];
		@Pc(22) int[] local22 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray220 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] + local22[1] + local22[1] };
		this.anIntArray221 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] + local8[1] + local8[1] };
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2656 == 2) {
			this.method2191();
		}
		Static251.method3833();
		this.method2190();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2656 = arg1.method6053();
		this.anIntArrayArray27 = new int[arg1.method6053()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray27.length; local20++) {
			this.anIntArrayArray27[local20][0] = arg1.method6004();
			this.anIntArrayArray27[local20][1] = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I")
	private int[] method2193(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray221;
		} else if (this.anIntArrayArray27.length <= arg0) {
			return this.anIntArray220;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}
}
