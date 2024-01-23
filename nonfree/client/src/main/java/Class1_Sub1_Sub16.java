import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
	private int anInt2468 = 0;

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "[S")
	private short[] aShortArray31 = new short[257];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(IB)[I")
	private int[] method1947(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray229;
		} else if (arg0 >= this.anIntArrayArray27.length) {
			return this.anIntArray230;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
	private void method1948() {
		@Pc(8) int[] local8 = this.anIntArrayArray27[0];
		@Pc(17) int[] local17 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray27[1];
		@Pc(31) int[] local31 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray229 = new int[] { local8[0] + local8[0] - local22[0], local8[1] + -local22[1] + local8[1] };
		this.anIntArray230 = new int[] { local17[0] + local17[0] - local31[0], -local31[1] + local17[1] + local17[1] };
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(26) int[] local26 = this.method3706(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static11.anInt294; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray31[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2468 = arg0.method2945();
		this.anIntArrayArray27 = new int[arg0.method2945()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray27.length; local20++) {
			this.anIntArrayArray27[local20][0] = arg0.method2964();
			this.anIntArrayArray27[local20][1] = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
	private void method1950() {
		@Pc(4) int local4 = this.anInt2468;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(53) int[] local53;
		@Pc(58) int[] local58;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(71) int local71;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local26][0] <= local24; local26++) {
				}
				local53 = this.anIntArrayArray27[local26 - 1];
				local58 = this.anIntArrayArray27[local26];
				local67 = this.method1947(local26 - 2)[1];
				local71 = local58[1];
				local75 = local53[1];
				local84 = this.method1947(local26 + 1)[1];
				@Pc(94) int local94 = local75 + local84 - local67 - local71;
				@Pc(112) int local112 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(126) int local126 = local67 - local94 - local75;
				@Pc(133) int local133 = local71 - local67;
				@Pc(139) int local139 = local133 * local112 >> 12;
				@Pc(149) int local149 = (local112 * local94 >> 12) * local118 >> 12;
				@Pc(155) int local155 = local126 * local118 >> 12;
				@Pc(164) int local164 = local75 + local139 + local149 + local155;
				if (local164 <= -32768) {
					local164 = -32767;
				}
				if (local164 >= 32768) {
					local164 = 32767;
				}
				this.aShortArray31[local4] = (short) local164;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray27.length - 1 && local24 >= this.anIntArrayArray27[local26][0]; local26++) {
				}
				local53 = this.anIntArrayArray27[local26 - 1];
				local58 = this.anIntArrayArray27[local26];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local75 = 4096 - Static167.anIntArray320[local67 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local75;
				local84 = local75 * local58[1] + local71 * local53[1] >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray31[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray27.length - 1 > local26 && local24 >= this.anIntArrayArray27[local26][0]; local26++) {
				}
				local53 = this.anIntArrayArray27[local26 - 1];
				local58 = this.anIntArrayArray27[local26];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local75 = 4096 - local67;
				local71 = local75 * local53[1] + local67 * local58[1] >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray31[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2468 == 2) {
			this.method1948();
		}
		Static96.method1624();
		this.method1950();
	}
}
