import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!faa", name = "H", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!faa", name = "I", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!faa", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!faa", name = "N", descriptor = "I")
	private int anInt2547 = 0;

	@OriginalMember(owner = "client!faa", name = "J", descriptor = "[S")
	private final short[] aShortArray34 = new short[257];

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(31) int[] local31 = this.method7128(0, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static452.anInt7734; local33++) {
				@Pc(41) int local41 = local31[local33] >> 4;
				if (local41 < 0) {
					local41 = 0;
				}
				if (local41 > 256) {
					local41 = 256;
				}
				local21[local33] = this.aShortArray34[local41];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)[I")
	private int[] method2132(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray243;
		} else if (this.anIntArrayArray29.length <= arg0) {
			return this.anIntArray244;
		} else {
			return this.anIntArrayArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
	private void method2136() {
		@Pc(12) int local12 = this.anInt2547;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray29.length - 1 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray29[local30 - 1];
				local62 = this.anIntArrayArray29[local30];
				local71 = this.method2132(local30 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method2132(local30 + 1)[1];
				@Pc(106) int local106 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(121) int local121 = local75 + local88 - local71 - local79;
				@Pc(129) int local129 = local71 - local75 - local121;
				@Pc(134) int local134 = local79 - local71;
				@Pc(146) int local146 = (local106 * local121 >> 12) * local112 >> 12;
				@Pc(152) int local152 = local129 * local112 >> 12;
				@Pc(158) int local158 = local106 * local134 >> 12;
				@Pc(167) int local167 = local75 + local158 + local146 + local152;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray34[local12] = (short) local167;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray29.length - 1 > local30 && local28 >= this.anIntArrayArray29[local30][0]; local30++) {
				}
				local57 = this.anIntArrayArray29[local30 - 1];
				local62 = this.anIntArrayArray29[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static274.anIntArray525[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local79 * local57[1] + local75 * local62[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray34[local12] = (short) local88;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local28 = local12 << 4;
				for (local30 = 1; this.anIntArrayArray29.length - 1 > local30 && this.anIntArrayArray29[local30][0] <= local28; local30++) {
				}
				local57 = this.anIntArrayArray29[local30 - 1];
				local62 = this.anIntArrayArray29[local30];
				local71 = (local28 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local71 * local62[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray34[local12] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2547 == 2) {
			this.method2137();
		}
		Static52.method1027();
		this.method2136();
	}

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "(I)V")
	private void method2137() {
		@Pc(8) int[] local8 = this.anIntArrayArray29[0];
		@Pc(13) int[] local13 = this.anIntArrayArray29[1];
		@Pc(26) int[] local26 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray243 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - -local8[1] + local8[1] };
		this.anIntArray244 = new int[] { local26[0] + local26[0] - local35[0], -local35[1] - (-local26[1] - local26[1]) };
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2547 = arg0.method3922();
		this.anIntArrayArray29 = new int[arg0.method3922()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray29.length; local21++) {
			this.anIntArrayArray29[local21][0] = arg0.method3967();
			this.anIntArrayArray29[local21][1] = arg0.method3967();
		}
	}
}
