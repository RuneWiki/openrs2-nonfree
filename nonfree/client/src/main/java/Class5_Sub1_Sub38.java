import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class5_Sub1_Sub38 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "[S")
	private final short[] aShortArray136 = new short[257];

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	private int anInt8788 = 0;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt8788 = arg1.method4220();
		this.anIntArrayArray75 = new int[arg1.method4220()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray75.length; local29++) {
			this.anIntArrayArray75[local29][0] = arg1.method4227();
			this.anIntArrayArray75[local29][1] = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[I")
	private int[] method7130(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray676;
		} else if (arg0 >= this.anIntArrayArray75.length) {
			return this.anIntArray677;
		} else {
			return this.anIntArrayArray75[arg0];
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		if (this.anIntArrayArray75 == null) {
			this.anIntArrayArray75 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray75.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt8788 == 2) {
			this.method7132();
		}
		Static340.method5294();
		this.method7131();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(B)V")
	private void method7131() {
		@Pc(4) int local4 = this.anInt8788;
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
				for (local22 = 1; local22 < this.anIntArrayArray75.length - 1 && local20 >= this.anIntArrayArray75[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray75[local22 - 1];
				local54 = this.anIntArrayArray75[local22];
				local63 = this.method7130(local22 - 2)[1];
				local67 = local49[1];
				local71 = local54[1];
				local80 = this.method7130(local22 + 1)[1];
				@Pc(98) int local98 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(114) int local114 = local67 + local80 - local63 - local71;
				@Pc(122) int local122 = local63 - local67 - local114;
				@Pc(127) int local127 = local71 - local63;
				@Pc(139) int local139 = (local114 * local98 >> 12) * local104 >> 12;
				@Pc(145) int local145 = local104 * local122 >> 12;
				@Pc(151) int local151 = local98 * local127 >> 12;
				@Pc(159) int local159 = local67 + local151 + local139 + local145;
				if (local159 <= -32768) {
					local159 = -32767;
				}
				if (local159 >= 32768) {
					local159 = 32767;
				}
				this.aShortArray136[local4] = (short) local159;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray75.length - 1 && local20 >= this.anIntArrayArray75[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray75[local22 - 1];
				local54 = this.anIntArrayArray75[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - Static20.anIntArray25[local63 >> 5 & 0xFF] >> 1;
				local71 = 4096 - local67;
				local80 = local54[1] * local67 + local71 * local49[1] >> 12;
				if (local80 <= -32768) {
					local80 = -32767;
				}
				if (local80 >= 32768) {
					local80 = 32767;
				}
				this.aShortArray136[local4] = (short) local80;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray75.length - 1 && local20 >= this.anIntArrayArray75[local22][0]; local22++) {
				}
				local49 = this.anIntArrayArray75[local22 - 1];
				local54 = this.anIntArrayArray75[local22];
				local63 = (local20 - local49[0] << 12) / (local54[0] - local49[0]);
				local67 = 4096 - local63;
				local71 = local63 * local54[1] + local49[1] * local67 >> 12;
				if (local71 <= -32768) {
					local71 = -32767;
				}
				if (local71 >= 32768) {
					local71 = 32767;
				}
				this.aShortArray136[local4] = (short) local71;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	private void method7132() {
		@Pc(8) int[] local8 = this.anIntArrayArray75[0];
		@Pc(13) int[] local13 = this.anIntArrayArray75[1];
		@Pc(22) int[] local22 = this.anIntArrayArray75[this.anIntArrayArray75.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray75[this.anIntArrayArray75.length - 1];
		this.anIntArray677 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] - local22[1]) };
		this.anIntArray676 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static147.anInt3075; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray136[local39];
			}
		}
		return local19;
	}
}
