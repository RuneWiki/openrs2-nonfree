import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
	private int anInt1233 = 0;

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "[S")
	private short[] aShortArray22 = new short[257];

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
	private void method1052() {
		@Pc(4) int[] local4 = this.anIntArrayArray12[0];
		@Pc(17) int[] local17 = this.anIntArrayArray12[1];
		@Pc(26) int[] local26 = this.anIntArrayArray12[this.anIntArrayArray12.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray12[this.anIntArrayArray12.length - 1];
		this.anIntArray123 = new int[] { local4[0] + local4[0] - local17[0], local4[1] + -local17[1] + local4[1] };
		this.anIntArray124 = new int[] { local26[0] + local26[0] - local35[0], local26[1] + -local35[1] + local26[1] };
	}

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
	private void method1053() {
		@Pc(13) int local13 = this.anInt1233;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(67) int[] local67;
		@Pc(72) int[] local72;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local34 = local13 << 4;
				for (local36 = 1; this.anIntArrayArray12.length - 1 > local36 && this.anIntArrayArray12[local36][0] <= local34; local36++) {
				}
				local67 = this.anIntArrayArray12[local36 - 1];
				local72 = this.anIntArrayArray12[local36];
				local81 = this.method1055(local36 - 2)[1];
				local85 = local67[1];
				local89 = local72[1];
				local98 = this.method1055(local36 + 1)[1];
				@Pc(116) int local116 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				@Pc(126) int local126 = local98 + local85 - local89 - local81;
				@Pc(133) int local133 = local81 - local85 - local126;
				@Pc(138) int local138 = local89 - local81;
				@Pc(146) int local146 = local116 * local116 >> 12;
				@Pc(152) int local152 = local133 * local146 >> 12;
				@Pc(162) int local162 = (local126 * local116 >> 12) * local146 >> 12;
				@Pc(168) int local168 = local138 * local116 >> 12;
				@Pc(177) int local177 = local168 + local152 + local162 + local85;
				if (local177 <= -32768) {
					local177 = -32767;
				}
				if (local177 >= 32768) {
					local177 = 32767;
				}
				this.aShortArray22[local13] = (short) local177;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local34 = local13 << 4;
				for (local36 = 1; this.anIntArrayArray12.length - 1 > local36 && local34 >= this.anIntArrayArray12[local36][0]; local36++) {
				}
				local67 = this.anIntArrayArray12[local36 - 1];
				local72 = this.anIntArrayArray12[local36];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - Static284.anIntArray447[local81 >> 5 & 0xFF] >> 1;
				local89 = 4096 - local85;
				local98 = local67[1] * local89 + local85 * local72[1] >> 12;
				if (local98 <= -32768) {
					local98 = -32767;
				}
				if (local98 >= 32768) {
					local98 = 32767;
				}
				this.aShortArray22[local13] = (short) local98;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local34 = local13 << 4;
				for (local36 = 1; this.anIntArrayArray12.length - 1 > local36 && local34 >= this.anIntArrayArray12[local36][0]; local36++) {
				}
				local72 = this.anIntArrayArray12[local36];
				local67 = this.anIntArrayArray12[local36 - 1];
				local81 = (local34 - local67[0] << 12) / (local72[0] - local67[0]);
				local85 = 4096 - local81;
				local89 = local67[1] * local85 + local81 * local72[1] >> 12;
				if (local89 <= -32768) {
					local89 = -32767;
				}
				if (local89 >= 32768) {
					local89 = 32767;
				}
				this.aShortArray22[local13] = (short) local89;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(29) int[] local29 = this.method4538(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static68.anInt1753; local31++) {
				@Pc(40) int local40 = local29[local31] >> 4;
				if (local40 < 0) {
					local40 = 0;
				}
				if (local40 > 256) {
					local40 = 256;
				}
				local18[local31] = this.aShortArray22[local40];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1233 = arg1.method3110();
		this.anIntArrayArray12 = new int[arg1.method3110()][2];
		for (@Pc(19) int local19 = 0; local19 < this.anIntArrayArray12.length; local19++) {
			this.anIntArrayArray12[local19][0] = arg1.method3085();
			this.anIntArrayArray12[local19][1] = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)[I")
	private int[] method1055(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray123;
		} else if (this.anIntArrayArray12.length <= arg0) {
			return this.anIntArray124;
		} else {
			return this.anIntArrayArray12[arg0];
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		if (this.anIntArrayArray12 == null) {
			this.anIntArrayArray12 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray12.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1233 == 2) {
			this.method1052();
		}
		Static37.method1936();
		this.method1053();
	}
}
