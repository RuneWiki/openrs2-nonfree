import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "[S")
	private short[] aShortArray4 = new short[257];

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
	private int anInt686 = 0;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	private void method637() {
		@Pc(13) int local13 = this.anInt686;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(71) int[] local71;
		@Pc(64) int[] local64;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; this.anIntArrayArray4.length - 1 > local35 && this.anIntArrayArray4[local35][0] <= local33; local35++) {
				}
				local64 = this.anIntArrayArray4[local35];
				local71 = this.anIntArrayArray4[local35 - 1];
				local80 = this.method640(local35 - 2)[1];
				local84 = local71[1];
				local88 = local64[1];
				local97 = this.method640(local35 + 1)[1];
				@Pc(115) int local115 = (local33 - local71[0] << 12) / (local64[0] - local71[0]);
				@Pc(121) int local121 = local115 * local115 >> 12;
				@Pc(130) int local130 = local84 + local97 - local88 - local80;
				@Pc(138) int local138 = local80 - local84 - local130;
				@Pc(143) int local143 = local88 - local80;
				@Pc(153) int local153 = local121 * (local130 * local115 >> 12) >> 12;
				@Pc(159) int local159 = local121 * local138 >> 12;
				@Pc(167) int local167 = local143 * local115 >> 12;
				@Pc(176) int local176 = local159 + local153 + local167 + local84;
				if (local176 <= -32768) {
					local176 = -32767;
				}
				if (local176 >= 32768) {
					local176 = 32767;
				}
				this.aShortArray4[local13] = (short) local176;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray4.length - 1 && local33 >= this.anIntArrayArray4[local35][0]; local35++) {
				}
				local71 = this.anIntArrayArray4[local35 - 1];
				local64 = this.anIntArrayArray4[local35];
				local80 = (local33 - local71[0] << 12) / (local64[0] - local71[0]);
				local84 = 4096 - Static107.anIntArray193[local80 >> 5 & 0xFF] >> 1;
				local88 = 4096 - local84;
				local97 = local71[1] * local88 + local84 * local64[1] >> 12;
				if (local97 <= -32768) {
					local97 = -32767;
				}
				if (local97 >= 32768) {
					local97 = 32767;
				}
				this.aShortArray4[local13] = (short) local97;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local33 = local13 << 4;
				for (local35 = 1; local35 < this.anIntArrayArray4.length - 1 && this.anIntArrayArray4[local35][0] <= local33; local35++) {
				}
				local71 = this.anIntArrayArray4[local35 - 1];
				local64 = this.anIntArrayArray4[local35];
				local80 = (local33 - local71[0] << 12) / (local64[0] - local71[0]);
				local84 = 4096 - local80;
				local88 = local71[1] * local84 + local80 * local64[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray4[local13] = (short) local88;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		if (this.anIntArrayArray4 == null) {
			this.anIntArrayArray4 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray4.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt686 == 2) {
			this.method642();
		}
		Static17.method243();
		this.method637();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt686 = arg0.method1378();
		this.anIntArrayArray4 = new int[arg0.method1378()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray4.length; local28++) {
			this.anIntArrayArray4[local28][0] = arg0.method1386();
			this.anIntArrayArray4[local28][1] = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I")
	private int[] method640(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return arg0 >= this.anIntArrayArray4.length ? this.anIntArray38 : this.anIntArrayArray4[arg0];
		} else {
			return this.anIntArray39;
		}
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	private void method642() {
		@Pc(8) int[] local8 = this.anIntArrayArray4[1];
		@Pc(17) int[] local17 = this.anIntArrayArray4[this.anIntArrayArray4.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray4[0];
		@Pc(37) int[] local37 = this.anIntArrayArray4[this.anIntArrayArray4.length - 1];
		this.anIntArray38 = new int[] { local17[0] + local17[0] - local37[0], local17[1] + local17[1] + -local37[1] };
		this.anIntArray39 = new int[] { local22[0] + local22[0] - local8[0], local22[1] + local22[1] + -local8[1] };
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(23) int[] local23 = this.method4750(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static182.anInt3492; local25++) {
				@Pc(34) int local34 = local23[local25] >> 4;
				if (local34 < 0) {
					local34 = 0;
				}
				if (local34 > 256) {
					local34 = 256;
				}
				local13[local25] = this.aShortArray4[local34];
			}
		}
		return local13;
	}
}
