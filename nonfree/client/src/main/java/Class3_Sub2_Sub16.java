import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "[S")
	private short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
	private int anInt2188 = 0;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
	private void method1913() {
		@Pc(12) int[] local12 = this.anIntArrayArray29[0];
		@Pc(17) int[] local17 = this.anIntArrayArray29[1];
		@Pc(26) int[] local26 = this.anIntArrayArray29[this.anIntArrayArray29.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray29[this.anIntArrayArray29.length - 1];
		this.anIntArray225 = new int[] { local12[0] + local12[0] - local17[0], -local17[1] - (-local12[1] - local12[1]) };
		this.anIntArray226 = new int[] { local26[0] + local26[0] - local35[0], local26[1] + -local35[1] + local26[1] };
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)[I")
	private int[] method1914(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return arg0 < this.anIntArrayArray29.length ? this.anIntArrayArray29[arg0] : this.anIntArray226;
		} else {
			return this.anIntArray225;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(22) int[] local22 = this.method4954(arg0, 0);
			for (@Pc(24) int local24 = 0; local24 < Static22.anInt421; local24++) {
				@Pc(33) int local33 = local22[local24] >> 4;
				if (local33 < 0) {
					local33 = 0;
				}
				if (local33 > 256) {
					local33 = 256;
				}
				local7[local24] = this.aShortArray43[local33];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
	private void method1915() {
		@Pc(11) int local11 = this.anInt2188;
		@Pc(36) int local36;
		@Pc(34) int local34;
		@Pc(70) int[] local70;
		@Pc(63) int[] local63;
		@Pc(79) int local79;
		@Pc(87) int local87;
		@Pc(83) int local83;
		@Pc(101) int local101;
		if (local11 == 2) {
			for (local11 = 0; local11 < 257; local11++) {
				local34 = local11 << 4;
				for (local36 = 1; this.anIntArrayArray29.length - 1 > local36 && this.anIntArrayArray29[local36][0] <= local34; local36++) {
				}
				local63 = this.anIntArrayArray29[local36];
				local70 = this.anIntArrayArray29[local36 - 1];
				local79 = this.method1914(local36 - 2)[1];
				local83 = local63[1];
				local87 = local70[1];
				@Pc(92) int local92 = local83 - local79;
				local101 = this.method1914(local36 + 1)[1];
				@Pc(111) int local111 = local101 + local87 - local83 - local79;
				@Pc(118) int local118 = local79 - local87 - local111;
				@Pc(138) int local138 = (local34 - local70[0] << 12) / (local63[0] - local70[0]);
				@Pc(144) int local144 = local138 * local138 >> 12;
				@Pc(150) int local150 = local144 * local118 >> 12;
				@Pc(156) int local156 = local92 * local138 >> 12;
				@Pc(166) int local166 = (local138 * local111 >> 12) * local144 >> 12;
				@Pc(175) int local175 = local87 + local156 + local166 + local150;
				if (local175 <= -32768) {
					local175 = -32767;
				}
				if (local175 >= 32768) {
					local175 = 32767;
				}
				this.aShortArray43[local11] = (short) local175;
			}
		} else if (local11 == 1) {
			for (local11 = 0; local11 < 257; local11++) {
				local34 = local11 << 4;
				for (local36 = 1; local36 < this.anIntArrayArray29.length - 1 && local34 >= this.anIntArrayArray29[local36][0]; local36++) {
				}
				local70 = this.anIntArrayArray29[local36 - 1];
				local63 = this.anIntArrayArray29[local36];
				local79 = (local34 - local70[0] << 12) / (local63[0] - local70[0]);
				local87 = 4096 - Static220.anIntArray542[local79 >> 5 & 0xFF] >> 1;
				local83 = 4096 - local87;
				local101 = local83 * local70[1] + local63[1] * local87 >> 12;
				if (local101 <= -32768) {
					local101 = -32767;
				}
				if (local101 >= 32768) {
					local101 = 32767;
				}
				this.aShortArray43[local11] = (short) local101;
			}
		} else {
			for (local11 = 0; local11 < 257; local11++) {
				local34 = local11 << 4;
				for (local36 = 1; this.anIntArrayArray29.length - 1 > local36 && this.anIntArrayArray29[local36][0] <= local34; local36++) {
				}
				local63 = this.anIntArrayArray29[local36];
				local70 = this.anIntArrayArray29[local36 - 1];
				local79 = (local34 - local70[0] << 12) / (local63[0] - local70[0]);
				local87 = 4096 - local79;
				local83 = local70[1] * local87 + local63[1] * local79 >> 12;
				if (local83 <= -32768) {
					local83 = -32767;
				}
				if (local83 >= 32768) {
					local83 = 32767;
				}
				this.aShortArray43[local11] = (short) local83;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2188 = arg1.method3915();
		this.anIntArrayArray29 = new int[arg1.method3915()][2];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray29.length; local18++) {
			this.anIntArrayArray29[local18][0] = arg1.method3948();
			this.anIntArrayArray29[local18][1] = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		if (this.anIntArrayArray29 == null) {
			this.anIntArrayArray29 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray29.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2188 == 2) {
			this.method1913();
		}
		Static66.method1029();
		this.method1915();
	}
}
