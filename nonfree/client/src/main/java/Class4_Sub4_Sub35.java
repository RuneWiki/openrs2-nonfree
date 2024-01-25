import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub4_Sub35 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!ro", name = "S", descriptor = "[I")
	private int[] anIntArray632;

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "[S")
	private final short[] aShortArray141 = new short[257];

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
	private int anInt7864 = 0;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(28) int[] local28 = this.method7890(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static560.anInt9394; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local13[local30] = this.aShortArray141[local38];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[I")
	private int[] method6510(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray632;
		} else if (arg0 >= this.anIntArrayArray69.length) {
			return this.anIntArray631;
		} else {
			return this.anIntArrayArray69[arg0];
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		if (this.anIntArrayArray69 == null) {
			this.anIntArrayArray69 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray69.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt7864 == 2) {
			this.method6511();
		}
		Static61.method1040();
		this.method6514();
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
	private void method6511() {
		@Pc(8) int[] local8 = this.anIntArrayArray69[0];
		@Pc(13) int[] local13 = this.anIntArrayArray69[1];
		@Pc(22) int[] local22 = this.anIntArrayArray69[this.anIntArrayArray69.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray69[this.anIntArrayArray69.length - 1];
		this.anIntArray632 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray631 = new int[] { local22[0] + local22[0] - local35[0], local22[1] + -local35[1] + local22[1] };
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	private void method6514() {
		@Pc(4) int local4 = this.anInt7864;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray69.length - 1 && this.anIntArrayArray69[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray69[local26 - 1];
				local62 = this.anIntArrayArray69[local26];
				local71 = this.method6510(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method6510(local26 + 1)[1];
				@Pc(106) int local106 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(123) int local123 = local88 + local75 - local71 - local79;
				@Pc(130) int local130 = local71 - local123 - local75;
				@Pc(135) int local135 = local79 - local71;
				@Pc(147) int local147 = local112 * (local106 * local123 >> 12) >> 12;
				@Pc(153) int local153 = local130 * local112 >> 12;
				@Pc(159) int local159 = local135 * local106 >> 12;
				@Pc(167) int local167 = local75 + local159 + local147 + local153;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray141[local4] = (short) local167;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray69.length - 1 > local26 && local24 >= this.anIntArrayArray69[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray69[local26 - 1];
				local62 = this.anIntArrayArray69[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static488.anIntArray645[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local57[1] * local79 + local75 * local62[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray141[local4] = (short) local88;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray69.length - 1 > local26 && local24 >= this.anIntArrayArray69[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray69[local26 - 1];
				local62 = this.anIntArrayArray69[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local71 * local62[1] + local57[1] * local75 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray141[local4] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt7864 = arg1.method6015();
		this.anIntArrayArray69 = new int[arg1.method6015()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray69.length; local21++) {
			this.anIntArrayArray69[local21][0] = arg1.method5982();
			this.anIntArrayArray69[local21][1] = arg1.method5982();
		}
	}
}
