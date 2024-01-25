import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!fs", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!fs", name = "W", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!fs", name = "R", descriptor = "I")
	private int anInt1907 = 0;

	@OriginalMember(owner = "client!fs", name = "T", descriptor = "[S")
	private final short[] aShortArray46 = new short[257];

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)[I")
	private int[] method1538(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray244;
		} else if (arg0 >= this.anIntArrayArray27.length) {
			return this.anIntArray245;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1907 = arg1.method5174();
		this.anIntArrayArray27 = new int[arg1.method5174()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray27.length; local28++) {
			this.anIntArrayArray27[local28][0] = arg1.method5177();
			this.anIntArrayArray27[local28][1] = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1907 == 2) {
			this.method1541();
		}
		Static73.method1169();
		this.method1539();
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)V")
	private void method1539() {
		@Pc(12) int local12 = this.anInt1907;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = this.method1538(local32 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method1538(local32 + 1)[1];
				@Pc(112) int local112 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(129) int local129 = local94 + local81 - local85 - local77;
				@Pc(136) int local136 = local77 - local129 - local81;
				@Pc(141) int local141 = local85 - local77;
				@Pc(153) int local153 = local118 * (local129 * local112 >> 12) >> 12;
				@Pc(159) int local159 = local136 * local118 >> 12;
				@Pc(165) int local165 = local112 * local141 >> 12;
				@Pc(175) int local175 = local81 + local153 + local159 + local165;
				if (local175 <= -32768) {
					local175 = -32767;
				}
				if (local175 >= 32768) {
					local175 = 32767;
				}
				this.aShortArray46[local12] = (short) local175;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; this.anIntArrayArray27.length - 1 > local32 && local30 >= this.anIntArrayArray27[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static392.anIntArray748[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local81 * local68[1] + local63[1] * local85 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray46[local12] = (short) local94;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; this.anIntArrayArray27.length - 1 > local32 && local30 >= this.anIntArrayArray27[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray27[local32 - 1];
				local68 = this.anIntArrayArray27[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local63[1] * local81 + local77 * local68[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray46[local12] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(21) int[] local21 = this.method5510(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static158.anInt2658; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray46[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "(I)V")
	private void method1541() {
		@Pc(8) int[] local8 = this.anIntArrayArray27[0];
		@Pc(13) int[] local13 = this.anIntArrayArray27[1];
		@Pc(22) int[] local22 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray245 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - -local22[1] + local22[1] };
		this.anIntArray244 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] + -local8[1]) };
	}
}
