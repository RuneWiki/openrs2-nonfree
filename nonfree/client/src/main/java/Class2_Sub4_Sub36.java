import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class2_Sub4_Sub36 extends Class2_Sub4 {

	@OriginalMember(owner = "client!um", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "[I")
	private int[] anIntArray1213;

	@OriginalMember(owner = "client!um", name = "S", descriptor = "[I")
	private int[] anIntArray1214;

	@OriginalMember(owner = "client!um", name = "bb", descriptor = "I")
	private int anInt5920 = 0;

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[S")
	private final short[] aShortArray105 = new short[257];

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V")
	private void method5092() {
		@Pc(4) int local4 = this.anInt5920;
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
				for (local22 = 1; this.anIntArrayArray51.length - 1 > local22 && local20 >= this.anIntArrayArray51[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray51[local22 - 1];
				local54 = this.anIntArrayArray51[local22];
				local63 = this.method5093(local22 - 2)[1];
				local67 = local49[1];
				local71 = local54[1];
				local80 = this.method5093(local22 + 1)[1];
				@Pc(98) int local98 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(114) int local114 = local67 + local80 - local63 - local71;
				@Pc(122) int local122 = local63 - local114 - local67;
				@Pc(126) int local126 = local71 - local63;
				@Pc(138) int local138 = local104 * (local114 * local98 >> 12) >> 12;
				@Pc(144) int local144 = local122 * local104 >> 12;
				@Pc(150) int local150 = local126 * local98 >> 12;
				@Pc(158) int local158 = local67 + local144 + local138 + local150;
				if (local158 <= -32768) {
					local158 = -32767;
				}
				if (local158 >= 32768) {
					local158 = 32767;
				}
				this.aShortArray105[local4] = (short) local158;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray51.length - 1 && this.anIntArrayArray51[local22][0] <= local20; local22++) {
				}
				local49 = this.anIntArrayArray51[local22 - 1];
				local54 = this.anIntArrayArray51[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - Static61.anIntArray261[local63 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local67;
				local80 = local54[1] * local67 + local71 * local49[1] >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray105[local4] = (short) local80;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray51.length - 1 > local22 && local20 >= this.anIntArrayArray51[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray51[local22 - 1];
				local54 = this.anIntArrayArray51[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - local63;
				local71 = local67 * local49[1] + local54[1] * local63 >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray105[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[I")
	private int[] method5093(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray1214;
		} else if (this.anIntArrayArray51.length <= arg0) {
			return this.anIntArray1213;
		} else {
			return this.anIntArrayArray51[arg0];
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	private void method5094() {
		@Pc(14) int[] local14 = this.anIntArrayArray51[0];
		@Pc(19) int[] local19 = this.anIntArrayArray51[1];
		@Pc(28) int[] local28 = this.anIntArrayArray51[this.anIntArrayArray51.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray51[this.anIntArrayArray51.length - 1];
		this.anIntArray1214 = new int[] { local14[0] + local14[0] - local19[0], local14[1] + -local19[1] + local14[1] };
		this.anIntArray1213 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + -local37[1] + local28[1] };
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(27) int[] local27 = this.method5600(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static76.anInt1458; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray105[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5920 = arg0.method5350();
		this.anIntArrayArray51 = new int[arg0.method5350()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray51.length; local24++) {
			this.anIntArrayArray51[local24][0] = arg0.method5312();
			this.anIntArrayArray51[local24][1] = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		if (this.anIntArrayArray51 == null) {
			this.anIntArrayArray51 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray51.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5920 == 2) {
			this.method5094();
		}
		Static299.method4462();
		this.method5092();
	}
}
