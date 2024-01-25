import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub8_Sub34 extends Class1_Sub8 {

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
	private int[] anIntArray641;

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[I")
	private int[] anIntArray642;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	private int anInt6931 = 0;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "[S")
	private final short[] aShortArray127 = new short[257];

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		if (this.anIntArrayArray57 == null) {
			this.anIntArrayArray57 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray57.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6931 == 2) {
			this.method5275();
		}
		Static9.method2255();
		this.method5274();
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	private void method5274() {
		@Pc(8) int local8 = this.anInt6931;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray57.length - 1 && this.anIntArrayArray57[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray57[local28 - 1];
				local68 = this.anIntArrayArray57[local28];
				local77 = this.method5276(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method5276(local28 + 1)[1];
				@Pc(111) int local111 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(126) int local126 = local94 + local81 - local85 - local77;
				@Pc(133) int local133 = local77 - local126 - local81;
				@Pc(138) int local138 = local85 - local77;
				@Pc(150) int local150 = (local126 * local111 >> 12) * local117 >> 12;
				@Pc(156) int local156 = local117 * local133 >> 12;
				@Pc(162) int local162 = local138 * local111 >> 12;
				@Pc(171) int local171 = local81 + local150 + local156 + local162;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray127[local8] = (short) local171;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray57.length - 1 && local26 >= this.anIntArrayArray57[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray57[local28 - 1];
				local68 = this.anIntArrayArray57[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static311.anIntArray545[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local68[1] * local81 + local63[1] * local85 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray127[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray57.length - 1 > local28 && local26 >= this.anIntArrayArray57[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray57[local28 - 1];
				local68 = this.anIntArrayArray57[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local77 * local68[1] + local63[1] * local81 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray127[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(21) int[] local21 = this.method6037(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static18.anInt439; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray127[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	private void method5275() {
		@Pc(12) int[] local12 = this.anIntArrayArray57[0];
		@Pc(17) int[] local17 = this.anIntArrayArray57[1];
		@Pc(26) int[] local26 = this.anIntArrayArray57[this.anIntArrayArray57.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray57[this.anIntArrayArray57.length - 1];
		this.anIntArray642 = new int[] { local26[0] + local26[0] - local35[0], -local35[1] + local26[1] + local26[1] };
		this.anIntArray641 = new int[] { local12[0] + local12[0] - local17[0], local12[1] - local17[1] - -local12[1] };
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)[I")
	private int[] method5276(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray641;
		} else if (arg0 >= this.anIntArrayArray57.length) {
			return this.anIntArray642;
		} else {
			return this.anIntArrayArray57[arg0];
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6931 = arg1.method1171();
		this.anIntArrayArray57 = new int[arg1.method1171()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray57.length; local30++) {
			this.anIntArrayArray57[local30][0] = arg1.method1177();
			this.anIntArrayArray57[local30][1] = arg1.method1177();
		}
	}
}
