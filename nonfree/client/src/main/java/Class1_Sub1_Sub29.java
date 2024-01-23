import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qj", name = "eb", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!qj", name = "mb", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!qj", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "[S")
	private short[] aShortArray32 = new short[257];

	@OriginalMember(owner = "client!qj", name = "pb", descriptor = "I")
	private int anInt3808 = 0;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		if (this.anIntArrayArray26 == null) {
			this.anIntArrayArray26 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray26.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3808 == 2) {
			this.method2900();
		}
		Static67.method1167();
		this.method2903();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(27) int[] local27 = this.method3733(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static157.anInt3431; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray32[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3808 = arg0.method3793();
		this.anIntArrayArray26 = new int[arg0.method3793()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray26.length; local17++) {
			this.anIntArrayArray26[local17][0] = arg0.method3805();
			this.anIntArrayArray26[local17][1] = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
	private void method2900() {
		@Pc(8) int[] local8 = this.anIntArrayArray26[0];
		@Pc(13) int[] local13 = this.anIntArrayArray26[1];
		@Pc(22) int[] local22 = this.anIntArrayArray26[this.anIntArrayArray26.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray26[this.anIntArrayArray26.length - 1];
		this.anIntArray247 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] + -local13[1] };
		this.anIntArray246 = new int[] { local22[0] + local22[0] - local37[0], local22[1] + -local37[1] + local22[1] };
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(IB)[I")
	private int[] method2902(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray247;
		} else if (arg0 >= this.anIntArrayArray26.length) {
			return this.anIntArray246;
		} else {
			return this.anIntArrayArray26[arg0];
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	private void method2903() {
		@Pc(4) int local4 = this.anInt3808;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(58) int[] local58;
		@Pc(51) int[] local51;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray26.length - 1 && this.anIntArrayArray26[local22][0] <= local20; local22++) {
				}
				local51 = this.anIntArrayArray26[local22];
				local58 = this.anIntArrayArray26[local22 - 1];
				local67 = this.method2902(local22 - 2)[1];
				local71 = local58[1];
				local75 = local51[1];
				local84 = this.method2902(local22 + 1)[1];
				@Pc(102) int local102 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				@Pc(114) int local114 = local84 + local71 - local67 - local75;
				@Pc(119) int local119 = local75 - local67;
				@Pc(125) int local125 = local119 * local102 >> 12;
				@Pc(132) int local132 = local67 - local71 - local114;
				@Pc(138) int local138 = local102 * local102 >> 12;
				@Pc(148) int local148 = (local114 * local102 >> 12) * local138 >> 12;
				@Pc(154) int local154 = local138 * local132 >> 12;
				@Pc(163) int local163 = local71 + local154 + local148 + local125;
				if (local163 <= -32768) {
					local163 = -32767;
				}
				if (local163 >= 32768) {
					local163 = 32767;
				}
				this.aShortArray32[local4] = (short) local163;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray26.length - 1 && local20 >= this.anIntArrayArray26[local22][0]; local22++) {
				}
				local58 = this.anIntArrayArray26[local22 - 1];
				local51 = this.anIntArrayArray26[local22];
				local67 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				local71 = 4096 - Static49.anIntArray67[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local75 * local58[1] + local71 * local51[1] >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray32[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray26.length - 1 > local22 && local20 >= this.anIntArrayArray26[local22][0]; local22++) {
				}
				local51 = this.anIntArrayArray26[local22];
				local58 = this.anIntArrayArray26[local22 - 1];
				local67 = (local20 - local58[0] << 12) / (local51[0] - local58[0]);
				local71 = 4096 - local67;
				local75 = local51[1] * local67 + local58[1] * local71 >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray32[local4] = (short) local75;
			}
		}
	}
}
