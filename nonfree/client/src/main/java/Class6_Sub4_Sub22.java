import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class6_Sub4_Sub22 extends Class6_Sub4 {

	@OriginalMember(owner = "client!kha", name = "D", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!kha", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!kha", name = "L", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!kha", name = "O", descriptor = "I")
	private int anInt5732 = 0;

	@OriginalMember(owner = "client!kha", name = "M", descriptor = "[S")
	private final short[] aShortArray75 = new short[257];

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		if (this.anIntArrayArray20 == null) {
			this.anIntArrayArray20 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray20.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5732 == 2) {
			this.method5033();
		}
		Static381.method5939();
		this.method5030();
	}

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "(B)V")
	private void method5030() {
		@Pc(4) int local4 = this.anInt5732;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(51) int[] local51;
		@Pc(56) int[] local56;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray20.length - 1 && local22 >= this.anIntArrayArray20[local24][0]; local24++) {
				}
				local51 = this.anIntArrayArray20[local24 - 1];
				local56 = this.anIntArrayArray20[local24];
				local65 = this.method5034(local24 - 2)[1];
				local69 = local51[1];
				local73 = local56[1];
				local82 = this.method5034(local24 + 1)[1];
				@Pc(98) int local98 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(114) int local114 = local82 + local69 - local65 - local73;
				@Pc(122) int local122 = local65 - local69 - local114;
				@Pc(126) int local126 = local73 - local65;
				@Pc(138) int local138 = (local114 * local98 >> 12) * local104 >> 12;
				@Pc(144) int local144 = local122 * local104 >> 12;
				@Pc(150) int local150 = local126 * local98 >> 12;
				@Pc(159) int local159 = local150 + local144 + local138 + local69;
				if (local159 <= -32768) {
					local159 = -32767;
				}
				if (local159 >= 32768) {
					local159 = 32767;
				}
				this.aShortArray75[local4] = (short) local159;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray20.length - 1 > local24 && this.anIntArrayArray20[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray20[local24 - 1];
				local56 = this.anIntArrayArray20[local24];
				local65 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local69 = 4096 - Static407.anIntArray406[local65 >> 5 & 0xFF] >> 1;
				local73 = 4096 - local69;
				local82 = local69 * local56[1] + local73 * local51[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray75[local4] = (short) local82;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray20.length - 1 && this.anIntArrayArray20[local24][0] <= local22; local24++) {
				}
				local51 = this.anIntArrayArray20[local24 - 1];
				local56 = this.anIntArrayArray20[local24];
				local65 = (local22 - local51[0] << 12) / (local56[0] - local51[0]);
				local69 = 4096 - local65;
				local73 = local69 * local51[1] + local65 * local56[1] >> 12;
				if (local73 <= -32768) {
					local73 = -32767;
				}
				if (local73 >= 32768) {
					local73 = 32767;
				}
				this.aShortArray75[local4] = (short) local73;
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(29) int[] local29 = this.method8313(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static6.anInt111; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray75[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	private void method5033() {
		@Pc(8) int[] local8 = this.anIntArrayArray20[0];
		@Pc(13) int[] local13 = this.anIntArrayArray20[1];
		@Pc(22) int[] local22 = this.anIntArrayArray20[this.anIntArrayArray20.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray20[this.anIntArrayArray20.length - 1];
		this.anIntArray348 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] + -local8[1]) };
		this.anIntArray347 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] - local31[1] };
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(II)[I")
	private int[] method5034(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray348;
		} else if (arg0 >= this.anIntArrayArray20.length) {
			return this.anIntArray347;
		} else {
			return this.anIntArrayArray20[arg0];
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5732 = arg1.method8604();
		this.anIntArrayArray20 = new int[arg1.method8604()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray20.length; local17++) {
			this.anIntArrayArray20[local17][0] = arg1.method8571();
			this.anIntArrayArray20[local17][1] = arg1.method8571();
		}
	}
}
