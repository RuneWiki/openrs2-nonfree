import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
	private int anInt431 = 0;

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "[S")
	private final short[] aShortArray2 = new short[257];

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		if (this.anIntArrayArray11 == null) {
			this.anIntArrayArray11 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray11.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt431 == 2) {
			this.method373();
		}
		Static224.method5493();
		this.method371();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[I")
	private int[] method370(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray54;
		} else if (arg0 >= this.anIntArrayArray11.length) {
			return this.anIntArray55;
		} else {
			return this.anIntArrayArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
	private void method371() {
		@Pc(8) int local8 = this.anInt431;
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
				for (local28 = 1; this.anIntArrayArray11.length - 1 > local28 && local26 >= this.anIntArrayArray11[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray11[local28 - 1];
				local68 = this.anIntArrayArray11[local28];
				local77 = this.method370(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method370(local28 + 1)[1];
				@Pc(112) int local112 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(128) int local128 = local81 + local94 - local85 - local77;
				@Pc(135) int local135 = local77 - local128 - local81;
				@Pc(140) int local140 = local85 - local77;
				@Pc(152) int local152 = (local128 * local112 >> 12) * local118 >> 12;
				@Pc(158) int local158 = local118 * local135 >> 12;
				@Pc(164) int local164 = local140 * local112 >> 12;
				@Pc(172) int local172 = local81 + local164 + local158 + local152;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray2[local8] = (short) local172;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray11.length - 1 > local28 && local26 >= this.anIntArrayArray11[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray11[local28 - 1];
				local68 = this.anIntArrayArray11[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static45.anIntArray70[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local81 * local68[1] + local85 * local63[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray2[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray11.length - 1 && this.anIntArrayArray11[local28][0] <= local26; local28++) {
				}
				local63 = this.anIntArrayArray11[local28 - 1];
				local68 = this.anIntArrayArray11[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local68[1] * local77 + local63[1] * local81 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray2[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(21) int[] local21 = this.method5700(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static263.anInt5504; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray2[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
	private void method373() {
		@Pc(8) int[] local8 = this.anIntArrayArray11[0];
		@Pc(13) int[] local13 = this.anIntArrayArray11[1];
		@Pc(22) int[] local22 = this.anIntArrayArray11[this.anIntArrayArray11.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray11[this.anIntArrayArray11.length - 1];
		this.anIntArray55 = new int[] { local22[0] + local22[0] - local39[0], local22[1] + -local39[1] + local22[1] };
		this.anIntArray54 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt431 = arg1.method3124();
		this.anIntArrayArray11 = new int[arg1.method3124()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray11.length; local29++) {
			this.anIntArrayArray11[local29][0] = arg1.method3104();
			this.anIntArrayArray11[local29][1] = arg1.method3104();
		}
	}
}
