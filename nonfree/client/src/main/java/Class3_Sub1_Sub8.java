import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fea", name = "M", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!fea", name = "S", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!fea", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!fea", name = "K", descriptor = "[S")
	private final short[] aShortArray74 = new short[257];

	@OriginalMember(owner = "client!fea", name = "O", descriptor = "I")
	private int anInt2969 = 0;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "(I)V")
	private void method2673() {
		@Pc(8) int[] local8 = this.anIntArrayArray21[0];
		@Pc(13) int[] local13 = this.anIntArrayArray21[1];
		@Pc(22) int[] local22 = this.anIntArrayArray21[this.anIntArrayArray21.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray21[this.anIntArrayArray21.length - 1];
		this.anIntArray247 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] + -local22[1]) };
		this.anIntArray248 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(21) int[] local21 = this.method7765(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static206.anInt4182; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray74[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "(I)V")
	private void method2675() {
		@Pc(4) int local4 = this.anInt2969;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(49) int[] local49;
		@Pc(54) int[] local54;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(80) int local80;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray21.length - 1 > local22 && this.anIntArrayArray21[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray21[local22 - 1];
				local54 = this.anIntArrayArray21[local22];
				local63 = this.method2676(local22 - 2)[1];
				local67 = local49[1];
				local71 = local54[1];
				local80 = this.method2676(local22 + 1)[1];
				@Pc(97) int local97 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(111) int local111 = local80 + local67 - local71 - local63;
				@Pc(119) int local119 = local63 - local111 - local67;
				@Pc(124) int local124 = local71 - local63;
				@Pc(136) int local136 = (local111 * local97 >> 12) * local103 >> 12;
				@Pc(142) int local142 = local103 * local119 >> 12;
				@Pc(148) int local148 = local97 * local124 >> 12;
				@Pc(156) int local156 = local67 + local142 + local136 + local148;
				if (local156 <= -32768) {
					local156 = -32767;
				}
				if (local156 >= 32768) {
					local156 = 32767;
				}
				this.aShortArray74[local4] = (short) local156;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray21.length - 1 && this.anIntArrayArray21[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray21[local22 - 1];
				local54 = this.anIntArrayArray21[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - Static548.anIntArray648[local63 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local67;
				local80 = local49[1] * local71 + local67 * local54[1] >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray74[local4] = (short) local80;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray21.length - 1 > local22 && local20 >= this.anIntArrayArray21[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray21[local22 - 1];
				local54 = this.anIntArrayArray21[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - local63;
				local71 = local54[1] * local63 + local49[1] * local67 >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray74[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		if (this.anIntArrayArray21 == null) {
			this.anIntArrayArray21 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray21.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2969 == 2) {
			this.method2673();
		}
		Static79.method1728();
		this.method2675();
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(II)[I")
	private int[] method2676(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray248;
		} else if (arg0 >= this.anIntArrayArray21.length) {
			return this.anIntArray247;
		} else {
			return this.anIntArrayArray21[arg0];
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2969 = arg0.method3118();
		this.anIntArrayArray21 = new int[arg0.method3118()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray21.length; local24++) {
			this.anIntArrayArray21[local24][0] = arg0.method3109();
			this.anIntArrayArray21[local24][1] = arg0.method3109();
		}
	}
}
