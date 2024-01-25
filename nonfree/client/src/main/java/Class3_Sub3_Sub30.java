import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class3_Sub3_Sub30 extends Class3_Sub3 {

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!qm", name = "X", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!qm", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "[S")
	private final short[] aShortArray98 = new short[257];

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
	private int anInt5153 = 0;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(27) int[] local27 = this.method5733(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static131.anInt2755; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray98[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	private void method4347() {
		@Pc(4) int local4 = this.anInt5153;
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
				for (local22 = 1; local22 < this.anIntArrayArray49.length - 1 && local20 >= this.anIntArrayArray49[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray49[local22 - 1];
				local54 = this.anIntArrayArray49[local22];
				local63 = this.method4348(local22 - 2)[1];
				local67 = local49[1];
				local71 = local54[1];
				local80 = this.method4348(local22 + 1)[1];
				@Pc(97) int local97 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(114) int local114 = local80 + local67 - local63 - local71;
				@Pc(122) int local122 = local63 - local114 - local67;
				@Pc(127) int local127 = local71 - local63;
				@Pc(139) int local139 = (local114 * local97 >> 12) * local103 >> 12;
				@Pc(145) int local145 = local122 * local103 >> 12;
				@Pc(151) int local151 = local97 * local127 >> 12;
				@Pc(160) int local160 = local67 + local145 + local139 + local151;
				if (local160 <= -32768) {
					local160 = -32767;
				}
				if (local160 >= 32768) {
					local160 = 32767;
				}
				this.aShortArray98[local4] = (short) local160;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray49.length - 1 > local22 && local20 >= this.anIntArrayArray49[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray49[local22 - 1];
				local54 = this.anIntArrayArray49[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - Static113.anIntArray534[local63 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local67;
				local80 = local49[1] * local71 + local54[1] * local67 >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray98[local4] = (short) local80;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray49.length - 1 && this.anIntArrayArray49[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray49[local22 - 1];
				local54 = this.anIntArrayArray49[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - local63;
				local71 = local54[1] * local63 + local67 * local49[1] >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray98[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(II)[I")
	private int[] method4348(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray413;
		} else if (arg0 >= this.anIntArrayArray49.length) {
			return this.anIntArray414;
		} else {
			return this.anIntArrayArray49[arg0];
		}
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
	private void method4349() {
		@Pc(8) int[] local8 = this.anIntArrayArray49[0];
		@Pc(13) int[] local13 = this.anIntArrayArray49[1];
		@Pc(22) int[] local22 = this.anIntArrayArray49[this.anIntArrayArray49.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray49[this.anIntArrayArray49.length - 1];
		this.anIntArray413 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
		this.anIntArray414 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (-local22[1] + local31[1]) };
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5153 = arg0.method3643();
		this.anIntArrayArray49 = new int[arg0.method3643()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray49.length; local29++) {
			this.anIntArrayArray49[local29][0] = arg0.method3649();
			this.anIntArrayArray49[local29][1] = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		if (this.anIntArrayArray49 == null) {
			this.anIntArrayArray49 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray49.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5153 == 2) {
			this.method4349();
		}
		Static336.method5504();
		this.method4347();
	}
}
