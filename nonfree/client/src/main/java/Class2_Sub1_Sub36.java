import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!te", name = "W", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!te", name = "U", descriptor = "[S")
	private short[] aShortArray144 = new short[257];

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
	private int anInt4340 = 0;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		if (this.anIntArrayArray37 == null) {
			this.anIntArrayArray37 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray37.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4340 == 2) {
			this.method2998();
		}
		Static94.method1641();
		this.method3000();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IB)[I")
	private int[] method2994(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray444;
		} else if (this.anIntArrayArray37.length <= arg0) {
			return this.anIntArray445;
		} else {
			return this.anIntArrayArray37[arg0];
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(21) int[] local21 = this.method3203(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static62.anInt1675; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray144[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
	private void method2998() {
		@Pc(8) int[] local8 = this.anIntArrayArray37[0];
		@Pc(13) int[] local13 = this.anIntArrayArray37[1];
		@Pc(28) int[] local28 = this.anIntArrayArray37[this.anIntArrayArray37.length - 1];
		@Pc(37) int[] local37 = this.anIntArrayArray37[this.anIntArrayArray37.length - 2];
		this.anIntArray444 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray445 = new int[] { local37[0] + local37[0] - local28[0], local37[1] - (local28[1] - local37[1]) };
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	private void method3000() {
		@Pc(4) int local4 = this.anInt4340;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(53) int[] local53;
		@Pc(58) int[] local58;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray37.length - 1 && local24 >= this.anIntArrayArray37[local26][0]; local26++) {
				}
				local53 = this.anIntArrayArray37[local26 - 1];
				local58 = this.anIntArrayArray37[local26];
				local67 = this.method2994(local26 - 2)[1];
				local71 = local53[1];
				local75 = local58[1];
				local84 = this.method2994(local26 + 1)[1];
				@Pc(101) int local101 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				@Pc(107) int local107 = local101 * local101 >> 12;
				@Pc(115) int local115 = local71 + local84 - local75 - local67;
				@Pc(127) int local127 = (local101 * local115 >> 12) * local107 >> 12;
				@Pc(132) int local132 = local75 - local67;
				@Pc(139) int local139 = local67 - local115 - local71;
				@Pc(145) int local145 = local139 * local107 >> 12;
				@Pc(151) int local151 = local101 * local132 >> 12;
				@Pc(159) int local159 = local71 + local151 + local145 + local127;
				if (local159 <= -32768) {
					local159 = -32767;
				}
				if (local159 >= 32768) {
					local159 = 32767;
				}
				this.aShortArray144[local4] = (short) local159;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray37.length - 1 && local24 >= this.anIntArrayArray37[local26][0]; local26++) {
				}
				local53 = this.anIntArrayArray37[local26 - 1];
				local58 = this.anIntArrayArray37[local26];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - Static135.anIntArray331[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local75 * local53[1] + local71 * local58[1] >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray144[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray37.length - 1 && local24 >= this.anIntArrayArray37[local26][0]; local26++) {
				}
				local58 = this.anIntArrayArray37[local26];
				local53 = this.anIntArrayArray37[local26 - 1];
				local67 = (local24 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - local67;
				local75 = local53[1] * local71 + local67 * local58[1] >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray144[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4340 = arg0.method209();
		this.anIntArrayArray37 = new int[arg0.method209()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray37.length; local24++) {
			this.anIntArrayArray37[local24][0] = arg0.method163();
			this.anIntArrayArray37[local24][1] = arg0.method163();
		}
	}
}
