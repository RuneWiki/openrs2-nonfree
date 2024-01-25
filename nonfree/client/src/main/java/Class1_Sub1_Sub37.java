import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray190;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "[I")
	private int[] anIntArray665;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "[I")
	private int[] anIntArray666;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt8809 = 0;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[S")
	private final short[] aShortArray139 = new short[257];

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	private void method7212() {
		@Pc(16) int[] local16 = this.anIntArrayArray190[0];
		@Pc(21) int[] local21 = this.anIntArrayArray190[1];
		@Pc(30) int[] local30 = this.anIntArrayArray190[this.anIntArrayArray190.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray190[this.anIntArrayArray190.length - 1];
		this.anIntArray665 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - local39[1] - -local30[1] };
		this.anIntArray666 = new int[] { local16[0] + local16[0] - local21[0], local16[1] + local16[1] - local21[1] };
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static279.anInt4906; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray139[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		if (this.anIntArrayArray190 == null) {
			this.anIntArrayArray190 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray190.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt8809 == 2) {
			this.method7212();
		}
		Static499.method3357();
		this.method7214();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I")
	private int[] method7213(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray666;
		} else if (this.anIntArrayArray190.length <= arg0) {
			return this.anIntArray665;
		} else {
			return this.anIntArrayArray190[arg0];
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	private void method7214() {
		@Pc(14) int local14 = this.anInt8809;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local14 == 2) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray190.length - 1 && this.anIntArrayArray190[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray190[local32 - 1];
				local68 = this.anIntArrayArray190[local32];
				local77 = this.method7213(local32 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method7213(local32 + 1)[1];
				@Pc(112) int local112 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(128) int local128 = local94 + local81 - local85 - local77;
				@Pc(136) int local136 = local77 - local81 - local128;
				@Pc(140) int local140 = local85 - local77;
				@Pc(152) int local152 = (local112 * local128 >> 12) * local118 >> 12;
				@Pc(158) int local158 = local136 * local118 >> 12;
				@Pc(164) int local164 = local112 * local140 >> 12;
				@Pc(172) int local172 = local81 + local164 + local152 + local158;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray139[local14] = (short) local172;
			}
		} else if (local14 == 1) {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray190.length - 1 && local30 >= this.anIntArrayArray190[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray190[local32 - 1];
				local68 = this.anIntArrayArray190[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static359.anIntArray435[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local85 * local63[1] + local81 * local68[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray139[local14] = (short) local94;
			}
		} else {
			for (local14 = 0; local14 < 257; local14++) {
				local30 = local14 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray190.length - 1 && this.anIntArrayArray190[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray190[local32 - 1];
				local68 = this.anIntArrayArray190[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local81 * local63[1] + local68[1] * local77 >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray139[local14] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt8809 = arg0.method5750();
		this.anIntArrayArray190 = new int[arg0.method5750()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray190.length; local24++) {
			this.anIntArrayArray190[local24][0] = arg0.method5771();
			this.anIntArrayArray190[local24][1] = arg0.method5771();
		}
	}
}
