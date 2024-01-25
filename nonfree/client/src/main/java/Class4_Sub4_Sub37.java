import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class4_Sub4_Sub37 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tr", name = "Q", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!tr", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!tr", name = "bb", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
	private int anInt6283 = 0;

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "[S")
	private final short[] aShortArray113 = new short[257];

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)[I")
	private int[] method5251(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray503;
		} else if (arg0 >= this.anIntArrayArray60.length) {
			return this.anIntArray504;
		} else {
			return this.anIntArrayArray60[arg0];
		}
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(B)V")
	private void method5254() {
		@Pc(8) int[] local8 = this.anIntArrayArray60[0];
		@Pc(13) int[] local13 = this.anIntArrayArray60[1];
		@Pc(22) int[] local22 = this.anIntArrayArray60[this.anIntArrayArray60.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray60[this.anIntArrayArray60.length - 1];
		this.anIntArray504 = new int[] { local22[0] + local22[0] - local36[0], -local36[1] + local22[1] + local22[1] };
		this.anIntArray503 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V")
	private void method5256() {
		@Pc(4) int local4 = this.anInt6283;
		@Pc(22) int local22;
		@Pc(20) int local20;
		@Pc(53) int[] local53;
		@Pc(58) int[] local58;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(84) int local84;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; this.anIntArrayArray60.length - 1 > local22 && this.anIntArrayArray60[local22][0] <= local20; local22++) {
				}
				local53 = this.anIntArrayArray60[local22 - 1];
				local58 = this.anIntArrayArray60[local22];
				local67 = this.method5251(local22 - 2)[1];
				local71 = local53[1];
				local75 = local58[1];
				local84 = this.method5251(local22 + 1)[1];
				@Pc(101) int local101 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				@Pc(107) int local107 = local101 * local101 >> 12;
				@Pc(115) int local115 = local71 + local84 - local75 - local67;
				@Pc(123) int local123 = local67 - local71 - local115;
				@Pc(128) int local128 = local75 - local67;
				@Pc(140) int local140 = (local115 * local101 >> 12) * local107 >> 12;
				@Pc(146) int local146 = local107 * local123 >> 12;
				@Pc(152) int local152 = local101 * local128 >> 12;
				@Pc(160) int local160 = local71 + local140 + local146 + local152;
				if (local160 <= -32768) {
					local160 = -32767;
				}
				if (local160 >= 32768) {
					local160 = 32767;
				}
				this.aShortArray113[local4] = (short) local160;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray60.length - 1 && local20 >= this.anIntArrayArray60[local22][0]; local22++) {
				}
				local53 = this.anIntArrayArray60[local22 - 1];
				local58 = this.anIntArrayArray60[local22];
				local67 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - Static238.anIntArray411[local67 >> 5 & 0xFF] >> 1;
				local75 = 4096 - local71;
				local84 = local53[1] * local75 + local71 * local58[1] >> 12;
				if (local84 <= -32768) {
					local84 = -32767;
				}
				if (local84 >= 32768) {
					local84 = 32767;
				}
				this.aShortArray113[local4] = (short) local84;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local20 = local4 << 4;
				for (local22 = 1; local22 < this.anIntArrayArray60.length - 1 && this.anIntArrayArray60[local22][0] <= local20; local22++) {
				}
				local53 = this.anIntArrayArray60[local22 - 1];
				local58 = this.anIntArrayArray60[local22];
				local67 = (local20 - local53[0] << 12) / (local58[0] - local53[0]);
				local71 = 4096 - local67;
				local75 = local67 * local58[1] + local53[1] * local71 >> 12;
				if (local75 <= -32768) {
					local75 = -32767;
				}
				if (local75 >= 32768) {
					local75 = 32767;
				}
				this.aShortArray113[local4] = (short) local75;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		if (this.anIntArrayArray60 == null) {
			this.anIntArrayArray60 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray60.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6283 == 2) {
			this.method5254();
		}
		Static317.method5269();
		this.method5256();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6283 = arg1.method2380();
		this.anIntArrayArray60 = new int[arg1.method2380()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray60.length; local29++) {
			this.anIntArrayArray60[local29][0] = arg1.method2404();
			this.anIntArrayArray60[local29][1] = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(27) int[] local27 = this.method5386(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static124.anInt3576; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray113[local37];
			}
		}
		return local17;
	}
}
